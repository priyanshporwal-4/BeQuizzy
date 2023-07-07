package com.converter.bequizzy;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class fragment_q1 extends Fragment implements View.OnClickListener {
    Button next;
    public static int c1 = 0;
    boolean ans = false;

    public fragment_q1() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_q1, container, false);
        view.findViewById(R.id.radioButton).setOnClickListener(this);
        view.findViewById(R.id.radioButton1).setOnClickListener(this);
        view.findViewById(R.id.radioButton2).setOnClickListener(this);
        view.findViewById(R.id.radioButton3).setOnClickListener(this);
        next = view.findViewById(R.id.nextq);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ans) {
                    Toast.makeText(getActivity(), "Correct", Toast.LENGTH_SHORT).show();
                    activity_start.count++;

                    activity_start.no.setText("1");


                } else {
                    Toast.makeText(getActivity(), "Wrong answer", Toast.LENGTH_SHORT).show();
                }
                Fragment fragment2 = new fragment_q2();
                FragmentTransaction fm = getActivity().getSupportFragmentManager().beginTransaction();
                fm.replace(R.id.frameLayout, fragment2).commit();
            }
        });

        return view;
    }

    @Override
    public void onClick(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        if (view.getId() == R.id.radioButton1) {
            ans = true;

        }
    }


}



