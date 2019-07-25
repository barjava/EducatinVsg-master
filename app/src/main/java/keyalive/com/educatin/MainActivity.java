package keyalive.com.educatin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import keyalive.com.educatin.LoginRegister.LoginActivity;
import keyalive.com.educatin.LoginRegister.RegisterActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private ImageView imageView;
    private ImageView btnRegist;
    private ImageView btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        btnLogin.setOnClickListener(this);
        btnRegist.setOnClickListener(this);
    }

    private void initView() {
        imageView = (ImageView) findViewById(R.id.imageView);
        btnRegist = (ImageView) findViewById(R.id.btn_regist);
        btnLogin = (ImageView) findViewById(R.id.btn_login);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_login:
                startActivity(new Intent(this, LoginActivity.class));
                break;
                case R.id.btn_regist:
                    startActivity(new Intent(this, RegisterActivity.class));
                    break;
        }
    }
}
