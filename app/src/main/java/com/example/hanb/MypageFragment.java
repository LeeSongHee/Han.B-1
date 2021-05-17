package com.example.hanb;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MypageFragment extends Fragment {
    private View view;
    private Button changeNickButton_mypage;
    private Button changePWButton_mypage;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_mypage, container, false);
        changeNickButton_mypage = view.findViewById(R.id.changeNickButton_mypage);
        changePWButton_mypage = view.findViewById(R.id.changePWButton_mypage);

        changeNickButton_mypage.setOnClickListener(v -> {
            FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
            ChangeNicknameFragment changeNicknameFragment = new ChangeNicknameFragment();
            transaction.replace(R.id.main_frame, changeNicknameFragment);
            transaction.commit();
        });

        changePWButton_mypage.setOnClickListener(v -> {
            FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
            ChangePasswordFragment changePasswordFragment = new ChangePasswordFragment();
            transaction.replace(R.id.main_frame, changePasswordFragment);
            transaction.commit();
        });

        return view;
    }
}