package com.example.nipunarora.kuteui.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nipunarora.kuteui.R;

/**
 * Created by nipunarora on 15/06/17.
 */

public class RouteFrame extends Fragment {
    //TODO load data source from Fragment Args
    // This Fragment has been created to load in a single route frame required at places such as the home tab for starred routes
    // or in the persondetail
    public RouteFrame() {}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.my_route_item,container,false);
    }
}
