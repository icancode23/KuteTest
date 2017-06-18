package com.example.nipunarora.kuteui.Activities;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ScrollView;
import android.widget.TableRow;
import android.widget.TextView;

import com.example.nipunarora.kuteui.Fragments.RouteFrame;
import com.example.nipunarora.kuteui.R;
import com.example.nipunarora.kuteui.RoundedImageView;

/**
 * Created by nipunarora on 15/06/17.
 */

public class PersonDetail extends AppCompatActivity implements View.OnClickListener{
    FloatingActionButton fab;
    RoundedImageView profile_image;
    TableRow contact_row,other_details_row;
    ImageButton otherdetail_dropdown;
    Boolean is_otherdetails_dropdown;
    ScrollView scroll_view;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.person_detail);
        getSupportFragmentManager().beginTransaction().replace(R.id.routeFramePersonDetail,new RouteFrame()).commit();

        //Initialise the views and variables required
        //View Initialization
        profile_image=(RoundedImageView)findViewById(R.id.personImage);
        contact_row=(TableRow)findViewById(R.id.contact_row);
        fab=(FloatingActionButton)findViewById(R.id.personDetailFAB);
        other_details_row=(TableRow)findViewById(R.id.rowOtherDetails);
        otherdetail_dropdown=(ImageButton)findViewById(R.id.otherDetailsDropdownIcon);
        scroll_view=(ScrollView)findViewById(R.id.personDetailScroll);

        //Variable initialization
        is_otherdetails_dropdown=false;

        //Sample code to generate right size user image
        Bitmap icon = BitmapFactory.decodeResource(this.getResources(),
                R.drawable.samplperson);
        Bitmap scaled = Bitmap.createScaledBitmap(icon, 80, 80, true);
        profile_image.setImageBitmap(scaled);

        //Onclick listeners
        contact_row.setOnClickListener(this);
        otherdetail_dropdown.setOnClickListener(this);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Check","Was Clicked");
                fab.setImageResource(R.drawable.ic_query_builder_white_24dp);
            }
        });

    }

    //On click listener for the entire activity
    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.contact_row:TextView t=(TextView)v.findViewById(R.id.Contact);
                callPerson(t.getText().toString());
                break;
            case R.id.otherDetailsDropdownIcon:is_otherdetails_dropdown=handleOtherDetailsDropdown(is_otherdetails_dropdown,otherdetail_dropdown,other_details_row);
                Log.d("Boolean check",is_otherdetails_dropdown.toString());
                break;
        }
    }

    /*************** Custom Functions *****************/
    //Allows you to open the dialer screen with the person's number
    public void callPerson(String number)
    {
        Intent i=new Intent(Intent.ACTION_DIAL);
        i.setData(Uri.parse("tel:"+number));
        startActivity(i);
    }
    //Handles the dropdown of other details ; returns bool to allow toggling
    public Boolean handleOtherDetailsDropdown(Boolean is_otherdetail_dropdown, ImageButton icon, final TableRow other_details_text)
    {
        if(is_otherdetail_dropdown)
        {
            other_details_text.setVisibility(View.GONE);
            icon.setImageResource(R.drawable.ic_arrow_drop_down_black_24dp);
            return false;
        }
        else
        {
            other_details_text.setVisibility(View.VISIBLE);
            icon.setImageResource(R.drawable.ic_arrow_drop_up_black_24dp);
            //Adjusting the scrollview for smaller screens
               scroll_view.post(new Runnable() {
                    @Override
                    public void run() {
                        scroll_view.scrollTo(0, other_details_text.getBottom());
                    }
                });
            return true;
        }
    }
}
