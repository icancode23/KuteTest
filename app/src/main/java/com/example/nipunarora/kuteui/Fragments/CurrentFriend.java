package com.example.nipunarora.kuteui.Fragments;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nipunarora.kuteui.Adapters.FriendRecyclerAdapter;
import com.example.nipunarora.kuteui.DataModels.Person;
import com.example.nipunarora.kuteui.R;

import java.util.ArrayList;

/**
 * Created by nipunarora on 06/06/17.
 */

public class CurrentFriend extends Fragment {
    static String TAG="FriendFragment";
    View v;
    ArrayList<Person> person_list;
    

    public CurrentFriend() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        person_list=new ArrayList<Person>();
        for(int i=0;i<4;++i)
        {
            Person temp=new Person("Nipun Arora");
            person_list.add(temp);
        }
        
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v=inflater.inflate(R.layout.current_friends_fragment,container,false);
        return v;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Bitmap icon = BitmapFactory.decodeResource(this.getResources(),
                R.drawable.samplperson);
        Bitmap scaled = Bitmap.createScaledBitmap(icon, 60, 60, true);
        RecyclerView friend_recycler=(RecyclerView)v.findViewById(R.id.personRecycler);
        FriendRecyclerAdapter recycler_adapter=new FriendRecyclerAdapter(person_list,scaled);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        friend_recycler.setLayoutManager(mLayoutManager);
        friend_recycler.setItemAnimator(new DefaultItemAnimator());
        friend_recycler.setAdapter(recycler_adapter);

    }
}
