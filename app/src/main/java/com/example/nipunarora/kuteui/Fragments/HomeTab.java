package com.example.nipunarora.kuteui.Fragments;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nipunarora.kuteui.R;
import com.example.nipunarora.kuteui.RoundedImageView;

/**
 * Created by nipunarora on 06/06/17.
 */

public class HomeTab extends Fragment {
    View v;
    public HomeTab()
    {}
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v=inflater.inflate(R.layout.home_tab_bottomnavigation,container,false);
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        /*********** Get your top starred routes trips and suggested friends
         **** Set your  Trip,Suggested Friend and Starred route ******/
        //TODO set Args for respective fragments then place the frames
        getFragmentManager().beginTransaction().replace(R.id.tripFrame,new TripFrame()).commit();
        getFragmentManager().beginTransaction().replace(R.id.suggestedFriendsFrame,new FriendFrame()).commit();
        getFragmentManager().beginTransaction().replace(R.id.strarredRouteFrame,new RouteFrame()).commit();

    }


}
