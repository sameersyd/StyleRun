package com.styleway.app.interfaces;

import android.view.View;

import com.styleway.app.models.Group;
import com.styleway.app.models.User;

/**
 * Created by a_man on 5/10/2017.
 */

public interface ChatItemClickListener {
    void onChatItemClick(String chatId, String chatName, int position, View userImage);

    void onChatItemClick(Group group, int position, View userImage);

    void placeCall(boolean callIsVideo, User user);
}
