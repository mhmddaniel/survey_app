package com.example.surveyapp.ui.pendingSurvey;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.surveyapp.R;

public class PendingSurveyFragment extends Fragment {

    private RecyclerView rvpendingPendingsurvey;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.pending_survey_fragment, container, false);
        initView(root);
        return root;
    }

    private void initView(View view){
        rvpendingPendingsurvey = (RecyclerView) view.findViewById(R.id.rvpendingPendingsurvey);
    }

}