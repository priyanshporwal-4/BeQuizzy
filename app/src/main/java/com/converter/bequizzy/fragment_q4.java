package com.converter.bequizzy;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;


public class fragment_q4 extends Fragment implements View.OnClickListener {

    boolean ans = false;
    View view;
    Button next;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_q4, container, false);
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
                    if (activity_start.no.getText() == "1") {
                        activity_start.no.setText("2");

                    } else if (activity_start.no.getText() == "2") {
                        activity_start.no.setText("3");
                    } else if (activity_start.no.getText() == "3") {
                        activity_start.no.setText("4");
                    } else {
                        activity_start.no.setText("1");

                    }
                } else {
                    Toast.makeText(getActivity(), "Wrong answer", Toast.LENGTH_SHORT).show();
                }
                Fragment fragment5 = new fragment_q5();
                FragmentTransaction fm = getActivity().getSupportFragmentManager().beginTransaction();
                fm.replace(R.id.frameLayout, fragment5).commit();
            }
        });
        return view;
    }

    @Override
    public void onClick(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        if (view.getId() == R.id.radioButton1)
            ans = true;

    }


}
