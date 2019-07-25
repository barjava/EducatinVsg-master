package keyalive.com.educatin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class Loading extends AppCompatActivity {

    ImageView GambarGif;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);
        GambarGif = (ImageView)findViewById(R.id.imageView4);

        Glide.with(Loading.this)
                // LOAD URL DARI LOKAL DRAWABLE
                .load(R.drawable.ok)
                .asGif()
                //PENGATURAN CACHE
                .diskCacheStrategy(DiskCacheStrategy.SOURCE)
                .into(GambarGif);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(Loading.this, MenuActivity.class));
            }
        }, 10000);
    }
}
