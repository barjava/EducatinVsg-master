package keyalive.com.educatin.Soal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import keyalive.com.educatin.Hasil_Salah;
import keyalive.com.educatin.R;

public class SoalActivity extends AppCompatActivity {

    Button A;
    Button B;
    Button C;
    Button D;
    String jawaban;
    String kunci = "C";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal);
        A=findViewById(R.id.buttonA1);
        B=findViewById(R.id.buttonB1);
        C=findViewById(R.id.buttonC1);
        D=findViewById(R.id.buttonD1);
    }

    public void jawabanA(View view) {
        A.setBackgroundColor(Color.RED);
        jawaban = "A";
        Cek();
    }

    public void jawabanB(View view) {
        B.setBackgroundColor(Color.RED);
        jawaban = "B";
        Cek();
    }

    public void jawabanC(View view) {
        C.setBackgroundColor(Color.rgb(114, 240, 72));
        jawaban = "C";
        Cek();
    }

    public void jawabanD(View view) {
        D.setBackgroundColor(Color.RED);
        jawaban = "D";
        Cek();
    }

    public void Cek(){
        if(jawaban != kunci){
            Toast.makeText(this, "Jawaban anda salah!", Toast.LENGTH_SHORT).show();
            Intent intent1 = new Intent(SoalActivity.this, Hasil_Salah.class);
            finish();
            startActivity(intent1);
        }
        else{
            Toast.makeText(this, "Jawaban anda benar!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(SoalActivity.this, HasilActivity.class);
            finish();
            startActivity(intent);
        }
    }
}
