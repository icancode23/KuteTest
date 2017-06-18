package com.example.nipunarora.kuteui.Activities;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;

import com.example.nipunarora.kuteui.Fragments.RouteFrame;
import com.example.nipunarora.kuteui.R;
import com.example.nipunarora.kuteui.RoundedImageView;

/**
 * Created by nipunarora on 08/06/17.
 */

public class Test extends AppCompatActivity {
    FloatingActionButton fab;
    RoundedImageView profile_image;
    LinearLayout basic_linearlayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.route_detail);


    }
}