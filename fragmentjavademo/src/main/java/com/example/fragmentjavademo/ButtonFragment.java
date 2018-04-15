package com.example.fragmentjavademo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class ButtonFragment extends Fragment {


    public ButtonFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view1 = inflater.inflate(R.layout.fragment_button, container, false);
        view1.findViewById(R.id.btnRed).setOnClickListener(v -> ((MainActivity) getActivity()).loadFragment(new RedFragment()));
        view1.findViewById(R.id.btnGreen).setOnClickListener(v -> ((MainActivity) getActivity()).loadFragment(new GreenFragment()));
        return view1;
    }

}
