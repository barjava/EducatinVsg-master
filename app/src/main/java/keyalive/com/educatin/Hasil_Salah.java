package keyalive.com.educatin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import keyalive.com.educatin.Soal.HasilActivity;
import keyalive.com.educatin.Soal.SoalActivity;

public class Hasil_Salah extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil__salah);
    }

    public void cobalagi(View view) {
        Intent intent = new Intent(Hasil_Salah.this, SoalActivity.class);
        finish();
        startActivity(intent);
    }

    public void selesai(View view) {
        Intent intent = new Intent(Hasil_Salah.this, MenuActivity.class);
        finish();
        startActivity(intent);
    }
}

