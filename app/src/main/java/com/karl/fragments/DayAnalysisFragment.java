package com.karl.fragments;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.karl.fyp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DayAnalysisFragment extends android.support.v4.app.Fragment {


    public DayAnalysisFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_month_analysis, container, false);
    }
}
