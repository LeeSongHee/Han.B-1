package com.example.hanb;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class ChangePasswordFragment extends Fragment {
    private View view;
    private Button changePWButton_changePW;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_change_password, container, false);

        changePWButton_changePW = view.findViewById(R.id.changePWButton_changePW);
        changePWButton_changePW.setOnClickListener(v -> {
            Toast.makeText(getActivity(), "비밀번호 변경 완료", Toast.LENGTH_SHORT).show();
            FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
            MypageFragment mypageFragment = new MypageFragment();
            transaction.replace(R.id.main_frame, mypageFragment);
            transaction.commit();
        });

        return view;
    }
}