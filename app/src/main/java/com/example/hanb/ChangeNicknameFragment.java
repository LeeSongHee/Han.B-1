package com.example.hanb;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ChangeNicknameFragment extends Fragment {
    private View view;
    private Button changeNickButton_changeNick;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view =  inflater.inflate(R.layout.fragment_change_nickname, container, false);

        changeNickButton_changeNick = view.findViewById(R.id.changeNickButton_changeNick);
        changeNickButton_changeNick.setOnClickListener(v -> {
            Toast.makeText(getActivity(), "닉네임 변경 완료", Toast.LENGTH_SHORT).show();
            FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
            MypageFragment mypageFragment = new MypageFragment();
            transaction.replace(R.id.main_frame, mypageFragment);
            transaction.commit();
        });

        return view;
    }
}