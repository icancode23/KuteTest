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

public class TripFrame extends Fragment {
    //TODO load data source from Fragment Args
    View v;
    public TripFrame() {}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v=inflater.inflate(R.layout.trip_item,container,false);
        return v;
    }
}
