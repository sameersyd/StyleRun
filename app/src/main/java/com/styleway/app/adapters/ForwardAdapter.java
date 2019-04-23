package com.styleway.app.adapters;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.styleway.app.R;
import com.styleway.app.interfaces.ChatItemClickListener;
import com.styleway.app.models.User;

import java.util.ArrayList;
import java.util.List;

public class ForwardAdapter extends RecyclerView.Adapter<ForwardAdapter.BaseViewHolder> implements Filterable {
    private Context context;
    private ChatItemClickListener itemClickListener;
    private ArrayList<User> dataList, dataListFiltered;
    private Filter filter;

    public ForwardAdapter(@NonNull Context context, @Nullable ArrayList<User> users) {
        if (context instanceof ChatItemClickListener) {
            this.itemClickListener = (ChatItemClickListener) context;
        } else {
            throw new RuntimeException(context.toString() + " must implement ChatItemClickListener");
        }

        this.context = context;
        this.dataList = users;
        this.dataListFiltered = users;
        this.filter = new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence charSequence) {
                String charString = charSequence.toString();
                if (charString.isEmpty()) {
                    dataListFiltered = dataList;
                } else {
                    ArrayList<User> filteredList = new ArrayList<>();
                    for (User row : dataList) {
                        String toCheckWith = row.getNameInPhone() != null ? row.getNameInPhone() : row.getName();
                        if (toCheckWith.toLowerCase().startsWith(charString.toLowerCase())) {
                            filteredList.add(row);
                        }
                    }
                    dataListFiltered = filteredList;
                }

                FilterResults filterResults = new FilterResults();
                filterResults.values = dataListFiltered;
                return filterResults;
            }

            @Override
            protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
                dataListFiltered = (ArrayList<User>) filterResults.values;
                notifyDataSetChanged();
            }
        };
    }

    @Override
    public int getItemViewType(int position) {
        return dataListFiltered.get(position).getId().equals("-1") && dataListFiltered.get(position).getName().equals("-1") ? 0 : 1;
    }

    @NonNull
    @Override
    public BaseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == 1)
            return new UsersViewHolder(LayoutInflater.from(context).inflate(R.layout.item_menu_user, parent, false));
        else
            return new UserInviteHeaderViewHolder(LayoutInflater.from(context).inflate(R.layout.item_menu_user_invite, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull BaseViewHolder holder, int position) {
        if (holder instanceof UsersViewHolder) {
            ((UsersViewHolder) holder).setData(dataListFiltered.get(position));
        }
    }

    @Override
    public int getItemCount() {
        return dataListFiltered.size();
    }

    @Override
    public Filter getFilter() {
        return this.filter;
    }

    class BaseViewHolder extends RecyclerView.ViewHolder {
        public BaseViewHolder(View itemView) {
            super(itemView);
        }
    }

    class UserInviteHeaderViewHolder extends BaseViewHolder {
        private TextView inviteTitle, inviteMessage;

        UserInviteHeaderViewHolder(final View itemView) {
            super(itemView);
            inviteTitle = itemView.findViewById(R.id.inviteTitle);
            inviteMessage = itemView.findViewById(R.id.inviteMessage);
            inviteMessage.setSelected(true);
            inviteTitle.setSelected(true);
        }
    }

    List<String> list = new ArrayList<>();
    ImageView userImage;

    class UsersViewHolder extends BaseViewHolder {
        private TextView userName, inviteText;
        private CheckBox userCheck;

        UsersViewHolder(final View itemView) {
            super(itemView);
            userImage = itemView.findViewById(R.id.user_image);
            userName = itemView.findViewById(R.id.user_name);
            userCheck = itemView.findViewById(R.id.user_checkbox);
            inviteText = itemView.findViewById(R.id.inviteText);

            userCheck.setVisibility(View.VISIBLE);
            userCheck.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    if (b){
                        userCheck.setChecked(true);
                        list.add(getAdapterPosition()+"");
                    }
                    else{
                        userCheck.setChecked(false);
                        list.remove(getAdapterPosition()+"");
                    }
                }
            });

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (dataList.get(getAdapterPosition()).isInviteAble()) {
                        Intent it = new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:" + dataListFiltered.get(getAdapterPosition()).getId()));
                        it.putExtra("sms_body", String.format(context.getString(R.string.invitation_message), context.getString(R.string.app_name), context.getPackageName()));
                        context.startActivity(it);
                    }else{
                        if (userCheck.isChecked()){
                            userCheck.setChecked(false);
                        }
                        else{
                            userCheck.setChecked(true);
                        }
                    }
                }
            });
        }

        public void setData(User user) {
            userName.setText(user.getNameToDisplay());
            inviteText.setVisibility(user.isInviteAble() ? View.VISIBLE : View.GONE);
            Glide.with(context).load(user.getImage()).apply(new RequestOptions().placeholder(R.drawable.yoohoo_placeholder)).into(userImage);
            userName.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
    }

    public void forwardMsg(){
        if (list.isEmpty()){
            Toast.makeText(context, "No users selected", Toast.LENGTH_SHORT).show();
            return;
        }
        for (int i = 0;i<list.size();i++)
            itemClickListener.onChatItemClick(dataListFiltered.get(Integer.parseInt(list.get(i))).getId(), dataListFiltered.get(Integer.parseInt(list.get(i))).getNameToDisplay(), Integer.parseInt(list.get(i)), userImage);
    }

}
