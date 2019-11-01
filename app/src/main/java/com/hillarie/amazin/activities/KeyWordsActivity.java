package com.hillarie.amazin.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.hillarie.amazin.R;

public class KeyWordsActivity extends AppCompatActivity implements View.OnClickListener {
    Button BtnDescription, BtnCasual, BtnProfession;
    Boolean Casual = false;
    Boolean Profession = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_key_words);
        BtnDescription = findViewById(R.id.btnDescription);
        BtnCasual = findViewById(R.id.btn_casual);
        BtnProfession = findViewById(R.id.btn_profession);


        BtnDescription.setOnClickListener(this);
        BtnProfession.setOnClickListener(this);
        BtnCasual.setOnClickListener(this);



    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnDescription:
                if (Profession.equals(false) && Casual.equals(false)) {
                    Toast.makeText(this, "Pick profession and casual for test to next", Toast.LENGTH_LONG).show();

                } else {
                    Intent i = new Intent(KeyWordsActivity.this, DescriptionActivity.class);
                    startActivity(i);
                }

                break;
             case R.id.btn_casual:
                Casual=true;
                BtnCasual.setTextColor(this.getResources().getColor(R.color.colorAccent));
                BtnCasual.setBackground(this.getResources().getDrawable(R.drawable.button_keywordclicked));

                break;


            case R.id.btn_profession:
                Profession=true;
                BtnProfession.setTextColor(this.getResources().getColor(R.color.colorAccent));
                BtnProfession.setBackground(this.getResources().getDrawable(R.drawable.button_keywordclicked));

                break;


        }
    }
}
