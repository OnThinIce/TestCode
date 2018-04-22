package com.zl.testapplication;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 *
 */
public class LifeFragment extends Fragment {
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d("mTag", "Fragment: onAttach()");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("mTag", "Fragment: onCreate()");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d("mTag", "Fragment: onCreateView()");
        View view = inflater.inflate(R.layout.fragment_life, container, false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d("mTag", "Fragment: onViewCreated()");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("mTag", "Fragment: onActivityCreated()");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("mTag", "Fragment: onStart()");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("mTag", "Fragment: onResume()");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("mTag", "Fragment: onPause()");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("mTag", "Fragment: onStop()");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("mTag", "Fragment: onDestroyView()");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("mTag", "Fragment: onDestroy()");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("mTag", "Fragment: onDetach()");
    }


}
