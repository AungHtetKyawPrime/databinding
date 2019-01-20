package com.example.aspire.databinding;


import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import com.example.aspire.databinding.databinding.ActivityMainBinding;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    ActivityMainBinding activityMainBinding;
    User user;
    ArrayList<User> data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding=DataBindingUtil.setContentView(this,R.layout.activity_main);
        user=new User();
        data=new ArrayList<>();
        data=user.getArrayListData();
        //
        ListAdapter adapter=new ListAdapter(this,data);
        activityMainBinding.listview.setAdapter(adapter);


    }
}
