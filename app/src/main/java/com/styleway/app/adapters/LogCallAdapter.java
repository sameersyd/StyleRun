package com.styleway.app.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.styleway.app.R;
import com.styleway.app.interfaces.ChatItemClickListener;
import com.styleway.app.models.LogCall;
import com.styleway.app.models.User;
import com.styleway.app.utils.Helper;

import java.util.ArrayList;
import java.util.Locale;

public class LogCallAdapter extends RecyclerView.Adapter<LogCallAdapter.MyViewHolder> {
    private Context context;
    private ArrayList<LogCall> dataList;
    private ChatItemClickListener itemClickListener;
    private User userMe;

    public LogCallAdapter(Context context, ArrayList<LogCall> dataList, User userMe) {
        this.context = context;
        this.dataList = dataList;
        this.userMe = userMe;

        if (context instanceof ChatItemClickListener) {
            this.itemClickListener = (ChatItemClickListener) context;
        } else {
            throw new RuntimeException(context.toString() + " must implement ChatItemClickListener");
        }
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.adapter_item_log_call, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.setData(dataList.get(position));
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private ImageView userImage;
        private TextView time, duration, userName;

        MyViewHolder(final View itemView) {
            super(itemView);
            userImage = itemView.findViewById(R.id.userImage);
            time = itemView.findViewById(R.id.time);
            duration = itemView.findViewById(R.id.duration);
            userName = itemView.findViewById(R.id.userName);

            userImage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int pos = getAdapterPosition();
                    if (pos != -1) {
                        itemClickListener.onChatItemClick(dataList.get(pos).getUserId(), dataList.get(pos).getUserName(), pos, userImage);
                    }
                }
            });
            itemView.findViewById(R.id.user_details_container).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    final int pos = getAdapterPosition();
                    if (pos != -1) {
                        FirebaseDatabase.getInstance().getReference().child("users").child(userMe.getId()).child("blocklist").child(dataList.get(pos).getUserId()).addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(DataSnapshot snapshot) {
                                if (snapshot.exists()) {
                                    Toast.makeText(itemView.getContext(), "You can't call this user", Toast.LENGTH_SHORT).show();
                                }else{
                                    FirebaseDatabase.getInstance().getReference().child("users").child(dataList.get(pos).getUserId()).child("blocklist").child(userMe.getId()).addListenerForSingleValueEvent(new ValueEventListener() {
                                        @Override
                                        public void onDataChange(DataSnapshot snapshot) {
                                            if (snapshot.exists()) {
                                                Toast.makeText(itemView.getContext(), "You can't call this user", Toast.LENGTH_SHORT).show();
                                            }else{
                                                itemClickListener.placeCall(dataList.get(pos).isVideo(), new User(dataList.get(pos).getUserId(), dataList.get(pos).getUserName(), dataList.get(pos).getUserStatus(), dataList.get(pos).getUserImage()));
                                            }
                                        }

                                        @Override
                                        public void onCancelled(@NonNull DatabaseError databaseError) {

                                        }
                                    });
                                }
                            }

                            @Override
                            public void onCancelled(@NonNull DatabaseError databaseError) {

                            }
                        });
                    }
                }
            });
        }

        public void setData(LogCall logCall) {
            Glide.with(context).load(logCall.getUserImage()).apply(new RequestOptions().placeholder(R.drawable.yoohoo_placeholder)).into(userImage);
            userName.setText(logCall.getUserName());
            time.setText(Helper.getDateTime(logCall.getTimeUpdated()));
            time.setCompoundDrawablesWithIntrinsicBounds(logCall.isVideo() ? R.drawable.ic_videocam_dark_gray_24dp : R.drawable.ic_phone_dark_gray_24dp, 0, logCall.getStatus().equals("CANCELED") ? R.drawable.ic_call_missed_24dp : logCall.getStatus().equals("DENIED") || logCall.getStatus().equals("IN") ? R.drawable.ic_call_received_24dp : logCall.getStatus().equals("OUT") ? R.drawable.ic_call_made_24dp : 0, 0);
            duration.setText(formatTimespan(logCall.getTimeDuration()));
        }

        private String formatTimespan(int totalSeconds) {
            long minutes = totalSeconds / 60;
            long seconds = totalSeconds % 60;
            return String.format(Locale.US, "%02d:%02d", minutes, seconds);
        }
    }
}
