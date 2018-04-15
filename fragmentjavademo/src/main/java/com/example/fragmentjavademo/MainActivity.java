package com.example.fragmentjavademo;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadFragment(new RedFragment());
        //loadFragment(new GreenFragment());
    }
    public void loadFragment(GreenFragment fragment){
        FragmentManager manager=getSupportFragmentManager();
        FragmentTransaction trans=manager.beginTransaction();
        trans.replace(R.id.framecolor,fragment);
        trans.commit();
    }


    public void loadFragment(RedFragment fragment) {
        FragmentManager manager=getSupportFragmentManager();
        FragmentTransaction tran=manager.beginTransaction();
        tran.replace(R.id.framecolor,fragment);
        tran.commit();
    }
}
