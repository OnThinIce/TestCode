package com.zl.testapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.FrameLayout;
import android.widget.TextView;

public class FragmentLifeActivity extends AppCompatActivity {

    private TextView textView;
    private FrameLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_life);

        linearLayout = (FrameLayout) findViewById(R.id.ff_fragment);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        Fragment mFragment = new LifeFragment();
        ft.add(R.id.ff_fragment, mFragment, "centerFragment");
        ft.commit();
        Log.d("mTag", "Activity: onCreate()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("mTag", "Activity: onRestart()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("mTag", "Activity: onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("mTag", "Activity: onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("mTag", "Activity: onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("mTag", "Activity: onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("mTag", "Activity: onDestroy()");
    }

}
