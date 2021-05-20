package com.example.hanb;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class PostscriptFragment extends Fragment {
    private View view;
    private Button writeButton_postscript;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       view = inflater.inflate(R.layout.fragment_postscript, container, false);

       writeButton_postscript = view.findViewById(R.id.writeButton_postscript);
       writeButton_postscript.setOnClickListener(v -> {
           FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
           WritePostscriptFragment writePostscriptFragment = new WritePostscriptFragment();
           transaction.replace(R.id.main_frame, writePostscriptFragment);
           transaction.commit();
       });

       return view;
    }
}