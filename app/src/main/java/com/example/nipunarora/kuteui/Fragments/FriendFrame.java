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
 * Created by nipunarora on 18/06/17.
 */

public class FriendFrame extends Fragment {
    View v;
    public FriendFrame() {}
    //TODO load the data source through Args
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v=inflater.inflate(R.layout.person_item,container,false);
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        RoundedImageView x=(RoundedImageView)v.findViewById(R.id.personimg);
        Bitmap icon = BitmapFactory.decodeResource(this.getResources(),
                R.drawable.samplperson);
        Bitmap scaled = Bitmap.createScaledBitmap(icon, 60, 60, true);
        x.setImageBitmap(scaled);
    }
}
