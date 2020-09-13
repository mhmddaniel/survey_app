package com.example.surveyapp.ui.tambahSurvey;

import android.database.Cursor;

import com.example.surveyapp.ui.tambahSurvey.model.Survey;

public interface SurveyInterface {

    public Cursor read();
    public Cursor readsingle(String Surveyid);
    public boolean create(Survey survey);
    public boolean update(Survey survey);
    public boolean delete(String Surveyid);
}
