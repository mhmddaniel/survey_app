package com.example.surveyapp.ui.tambahSurvey;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.surveyapp.ui.tambahSurvey.model.Survey;

public class SurveyImp extends SQLiteOpenHelper implements SurveyInterface{
    public SurveyImp(Context context) {
        super(context, "db_survey", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE tb_survey (Surveyid TEXT, Kodewilayah TEXT, Namakepalakeluarga TEXT, Jeniskelamin TEXT, Nik TEXT, Fotoktp TEXT, Alamat TEXT, Jumlahkk TEXT, Pekerjaan TEXT, Penghasilan TEXT, Statustanah TEXT, Statusrumah TEXT, Tanahditempatlain TEXT, Rumahditempatlain TEXT, Bantuanperumahan TEXT, Kondisiatap TEXT, Kondisilantai TEXT, Kondisidinding TEXT, Kondisipencahayaan TEXT, Kamarmandi TEXT, Sumberair TEXT, Jaraksumberair TEXT, Penerangan TEXT, Luastanah TEXT, Jumlahpenghuni TEXT, Garislintang TEXT, Garisbujur TEXT, Pendidikan TEXT, Lokasikawasanrumah TEXT, Fotorumah TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE tb_survey");
    }

    @Override
    public Cursor read() {
        SQLiteDatabase sqLiteDatabase = getReadableDatabase();
        return sqLiteDatabase.rawQuery("SELECT * FROM tb_survey", null);
    }

    @Override
    public Cursor readsingle(String Surveyid) {
        SQLiteDatabase sqLiteDatabase = getReadableDatabase();
        return sqLiteDatabase.rawQuery("SELECT * FROM tb_survey WHERE Surveyid = '"+Surveyid+"'", null);
    }

    @Override
    public boolean create(Survey survey) {
        SQLiteDatabase sqLiteDatabase = getWritableDatabase();
        sqLiteDatabase.execSQL("INSERT INTO tb_survey VALUES('"+survey.getSurveyid()+"', '"+survey.getKodewilayah()+"', '"+survey.getNamakepalakeluarga()+"', '"+survey.getJeniskelamin()+"', '"+survey.getNik()+"', '"+survey.getFotoktp()+"', '"+survey.getAlamat()+"', '"+survey.getJumlahkk()+"', '"+survey.getPekerjaan()+"', '"+survey.getPenghasilan()+"', '"+survey.getStatustanah()+"', '"+survey.getStatusrumah()+"', '"+survey.getTanahditempatlain()+"', '"+survey.getRumahditempatlain()+"', '"+survey.getBantuanperumahan()+"', '"+survey.getKondisiatap()+"', '"+survey.getKondisilantai()+"', '"+survey.getKondisidinding()+"', '"+survey.getKondisipencahayaan()+"', '"+survey.getKamarmandi()+"', '"+survey.getSumberair()+"', '"+survey.getJaraksumberair()+"', '"+survey.getPenerangan()+"', '"+survey.getLuastanah()+"', '"+survey.getJumlahpenghuni()+"', '"+survey.getGarislintang()+"', '"+survey.getGarisbujur()+"', '"+survey.getPendidikan()+"', '"+survey.getLokasikawasanrumah()+"', '"+survey.getFotorumah()+"')");
        return true;
    }

    @Override
    public boolean update(Survey survey) {
        SQLiteDatabase sqLiteDatabase = getWritableDatabase();
        sqLiteDatabase.execSQL("UPDATE tb_survey SET Surveyid = '"+survey.getSurveyid()+"', Kodewilayah = '"+survey.getKodewilayah()+"', Namakepalakeluarga = '"+survey.getNamakepalakeluarga()+"', Jeniskelamin = '"+survey.getJeniskelamin()+"', Nik = '"+survey.getNik()+"', Fotoktp = '"+survey.getFotoktp()+"', Alamat = '"+survey.getAlamat()+"', Jumlahkk = '"+survey.getJumlahkk()+"', Pekerjaan = '"+survey.getPekerjaan()+"', Penghasilan = '"+survey.getPenghasilan()+"', Statustanah = '"+survey.getStatustanah()+"', Statusrumah = '"+survey.getStatusrumah()+"', Tanahditempatlain = '"+survey.getTanahditempatlain()+"', Rumahditempatlain = '"+survey.getRumahditempatlain()+"', Bantuanperumahan = '"+survey.getBantuanperumahan()+"', Kondisiatap = '"+survey.getKondisiatap()+"', Kondisilantai = '"+survey.getKondisilantai()+"', Kondisidinding = '"+survey.getKondisidinding()+"', Kondisipencahayaan = '"+survey.getKondisipencahayaan()+"', Kamarmandi = '"+survey.getKamarmandi()+"', Sumberair = '"+survey.getSumberair()+"', Jaraksumberair = '"+survey.getJaraksumberair()+"', Penerangan = '"+survey.getPenerangan()+"', Luastanah = '"+survey.getLuastanah()+"', Jumlahpenghuni = '"+survey.getJumlahpenghuni()+"', Garislintang = '"+survey.getGarislintang()+"', Garisbujur = '"+survey.getGarisbujur()+"', Pendidikan = '"+survey.getPendidikan()+"', Lokasikawasanrumah = '"+survey.getLokasikawasanrumah()+"', Fotorumah = '"+survey.getFotorumah()+"' WHERE Surveyid = '"+survey.getSurveyid()+"')");
        return true;
    }

    @Override
    public boolean delete(String Surveyid) {
        SQLiteDatabase sqLiteDatabase = getWritableDatabase();
        sqLiteDatabase.execSQL("DELETE FROM tb_survey WHERE Surveyid = '"+Surveyid+"'");
        return true;
    }
}
