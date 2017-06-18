package com.example.nipunarora.kuteui.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nipunarora.kuteui.R;

/**
 * Created by nipunarora on 18/06/17.
 */

public class FriendTab extends Fragment {
    View v;
    public FriendTab() {}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v=inflater.inflate(R.layout.friend_tab_bottomnavigation,container,false);
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        getFragmentManager().beginTransaction().replace(R.id.friendRequestsFrame,new FriendFrame()).commit();
        getFragmentManager().beginTransaction().replace(R.id.currentFriendsFrame,new FriendFrame()).commit();

    }
}
