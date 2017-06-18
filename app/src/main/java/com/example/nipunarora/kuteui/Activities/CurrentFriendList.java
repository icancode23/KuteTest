package com.example.nipunarora.kuteui.Activities;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.nipunarora.kuteui.Adapters.FriendRecyclerAdapter;
import com.example.nipunarora.kuteui.DataModels.Person;
import com.example.nipunarora.kuteui.R;

import java.util.ArrayList;

/**
 * Created by nipunarora on 19/06/17.
 */

public class CurrentFriendList extends AppCompatActivity {
    static String TAG="CurrentFriend Activity";
    ArrayList<Person> person_list;
    RecyclerView friend_recycler;
    FriendRecyclerAdapter recycler_adapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.current_friends_activity);

        /*************** Creating Sample Friends for now ***********/
        person_list=new ArrayList<Person>();
        for(int i=0;i<4;++i)
        {
            Person temp=new Person("Nipun Arora");
            person_list.add(temp);
        }
        /************** Initialise the views *********/
        //Setting up a sample bitmap for now
        //TODO get friends from facebook and google and get their images
        Bitmap icon = BitmapFactory.decodeResource(this.getResources(),
                R.drawable.samplperson);
        Bitmap scaled = Bitmap.createScaledBitmap(icon, 60, 60, true);
        friend_recycler=(RecyclerView)findViewById(R.id.personRecycler);
        recycler_adapter=new FriendRecyclerAdapter(person_list,scaled);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        friend_recycler.setLayoutManager(mLayoutManager);
        friend_recycler.setItemAnimator(new DefaultItemAnimator());
        friend_recycler.setAdapter(recycler_adapter);


    }
}
