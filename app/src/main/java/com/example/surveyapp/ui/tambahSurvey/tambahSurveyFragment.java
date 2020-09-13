package com.example.surveyapp.ui.tambahSurvey;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Switch;

import com.example.surveyapp.R;

public class tambahSurveyFragment extends Fragment {

    private Switch swtmodeofflineTambahsurvey;
    private EditText etsurveyidTambahsurvey;
    private EditText etkodewilayahTambahsurvey;
    private EditText etnamakepalakeluargaTambahsurvey;
    private Spinner spjkkependudukanTambahsurvey;
    private EditText etnikTambahsurvey;
    private ImageView imgfotoktpTambahsurvey;
    private EditText etalamatTambahsurvey;
    private EditText etjumlahkkTambahsurvey;
    private Spinner sppekerjaanTambahsurvey;
    private Spinner sppenghasilanTambahsurvey;
    private Spinner spstatustanahTambahsurvey;
    private Spinner spstatusrumahTambahsurvey;
    private Spinner sptanahditempailainTambahsurvey;
    private Spinner sprumahditempatlainTambahsurvey;
    private Spinner spbantuanperumahanTambahsurvey;
    private Spinner spkondisiatapTambahsurvey;
    private Spinner spkondisilantaiTambahsurvey;
    private Spinner spkondisidindingTambahsurvey;
    private Spinner spkondisipencahayaanTambahsurvey;
    private Spinner spkamarmandiTambahsurvey;
    private Spinner spsumberairTambahsurvey;
    private Spinner spjaraksumberairTambahsurvey;
    private Spinner sppeneranganTambahsurvey;
    private EditText etluastanahTambahsurvey;
    private EditText etjumlahpenghuniTambahsurvey;
    private EditText etgarislintangTambahsurvey;
    private EditText etgarisbujurTambahsurvey;
    private Spinner sppendidikanTambahsurvey;
    private Spinner spkawasanrumahTambahsurvey;
    private ImageView imgfotorumahTambahsurvey;
    private Button btnsubmitTambahsurvey;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.tambah_survey_fragment, container, false);

        return root;

    }

}