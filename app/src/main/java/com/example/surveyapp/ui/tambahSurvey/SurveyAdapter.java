package com.example.surveyapp.ui.tambahSurvey;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.surveyapp.R;
import com.example.surveyapp.ui.tambahSurvey.model.Survey;

import java.util.List;

public class SurveyAdapter extends RecyclerView.Adapter<SurveyAdapter.SurveyViewHolder> {

    private List<Survey> surveyList;


    public SurveyAdapter(List<Survey> surveyList) {
        this.surveyList = surveyList;
    }

    @NonNull
    @Override
    public SurveyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_pending_survey, null, false);
        return new SurveyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SurveyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return surveyList.size();
    }

    public class SurveyViewHolder extends RecyclerView.ViewHolder{

        public SurveyViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
