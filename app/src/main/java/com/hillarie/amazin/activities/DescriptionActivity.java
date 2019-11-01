package com.hillarie.amazin.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatCheckBox;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import com.hillarie.amazin.R;

public class DescriptionActivity extends AppCompatActivity {
AppCompatCheckBox ChkOne;
Button BtnMeasurement;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        ChkOne=findViewById(R.id.cb_one);
        BtnMeasurement=findViewById(R.id.btn_measurement);

        BtnMeasurement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ChkOne.isChecked()){
                    Intent intent=new Intent(DescriptionActivity.this,MeasurementsActivity.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(DescriptionActivity.this, "Please check the first description for test", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
