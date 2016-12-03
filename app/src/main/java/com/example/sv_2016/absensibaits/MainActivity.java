package com.example.sv_2016.absensibaits;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_login,btn_regis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_login = (Button)findViewById(R.id.btn_login);
        btn_regis = (Button)findViewById(R.id.btn_regis);

        btn_login.setOnClickListener(this);
        btn_regis.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.btn_login:
                intent = new Intent(this, CheckActivity.class);
                startActivity(intent);
            case R.id.btn_regis:
                intent = new Intent(this, RegisActivity.class);
                startActivity(intent);
            default:
                break;
        }
    }
}
