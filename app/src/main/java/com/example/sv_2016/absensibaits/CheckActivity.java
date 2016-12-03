package com.example.sv_2016.absensibaits;

import android.content.Intent;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class CheckActivity extends AppCompatActivity implements View.OnClickListener{

    private Button checkIn,checkOut,recordAbsesnsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);

        checkIn = (Button)findViewById(R.id.checkIn);
        checkOut = (Button)findViewById(R.id.checkOut);
        recordAbsesnsi = (Button)findViewById(R.id.recordAbsensi);
        checkIn.setOnClickListener(this);
        checkOut.setOnClickListener(this);
        recordAbsesnsi.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case (R.id.checkIn):
                break;
            case (R.id.checkOut):
                break;
            case (R.id.recordAbsensi):
                intent = new Intent(this, RecordActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
