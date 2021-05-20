package com.example.hanb;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class WritePostscriptFragment extends Fragment {
    private View view;
    private Button enrollButton_write_postscript;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view =  inflater.inflate(R.layout.fragment_write_postscript, container, false);

        enrollButton_write_postscript = view.findViewById(R.id.enrollButton_write_postscript);
        enrollButton_write_postscript.setOnClickListener(v -> {
            Toast.makeText(getActivity(), "후기 등록", Toast.LENGTH_SHORT).show();
        });

        return view;
    }
}