package keyalive.com.educatin;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

import keyalive.com.educatin.Materi.MateriActivity;
import keyalive.com.educatin.R;
import keyalive.com.educatin.Soal.SoalActivity;

public class MenuActivity extends AppCompatActivity {
    MediaPlayer audioBackground;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        //Memanggil file my_sound pada folder raw
        audioBackground = MediaPlayer.create(this, R.raw.backsound);
        //Set looping ke true untuk mengulang audio jika telah selesai
        audioBackground.setLooping(true);
        //Set volume audio agar berbunyi
        audioBackground.setVolume(1, 1);
        //Memulai audio
        audioBackground.start();
    }

    public void soal(View view) {
        Intent intent = new Intent(MenuActivity.this, SoalActivity.class);
        startActivity(intent);
    }

    public void profil(View view) {
        Intent intent = new Intent(MenuActivity.this, ProfilActivity.class);
        startActivity(intent);
    }

    public void materi(View view) {
        Intent intent = new Intent(MenuActivity.this, MateriActivity.class);
        startActivity(intent);
    }

    public void logout(View view) {
        new AlertDialog.Builder(this).setTitle("LOGOUT").setMessage("Apakah anda yakin akan logout?").setIcon(android.R.drawable.ic_dialog_alert).setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent = new Intent(MenuActivity.this, MainActivity.class);
                finish();
                startActivity(intent);
            }
        })
                .setNegativeButton(android.R.string.no, null).show();
    }
}
