package keyalive.com.educatin.Materi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import keyalive.com.educatin.R;

public class MateriActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    public void materi3(View view) {
        Toast.makeText(this, "Materi tidak tersedia!", Toast.LENGTH_SHORT).show();
    }

    public void materi1(View view) {
        Intent intent = new Intent(MateriActivity.this, MateriA_Activity.class);
        Toast.makeText(this, "Anda memilih materi 1", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }

    public void materi2(View view) {
        Toast.makeText(this, "Materi tidak tersedia!", Toast.LENGTH_SHORT).show();
    }

//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        if(item.getItemId()==android.R.id.home){
//            onBackPressed();
//        }
//        return super.onOptionsItemSelected(item);
//    }
}
