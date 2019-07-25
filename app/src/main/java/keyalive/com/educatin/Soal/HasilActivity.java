package keyalive.com.educatin.Soal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import keyalive.com.educatin.Hasil_Salah;
import keyalive.com.educatin.MenuActivity;
import keyalive.com.educatin.R;

public class HasilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);
    }

    public void cobalagi(View view) {
        Intent intent = new Intent(HasilActivity.this, SoalActivity.class);
        finish();
        startActivity(intent);
    }

    public void selesai(View view) {
        Intent intent = new Intent(HasilActivity.this, MenuActivity.class);
        finish();
        startActivity(intent);
    }
}
