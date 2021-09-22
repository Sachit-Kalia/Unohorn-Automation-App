package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;

import com.google.android.material.switchmaterial.SwitchMaterial;

public class ControlActivity extends AppCompatActivity {

    private SwitchMaterial switchBtn;
    public static String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control);

        text = getIntent().getStringExtra("ip");

        switchBtn = findViewById(R.id.switchBtn);

        switchBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                      On process = new On();
                      process.execute();
                }else{
                      Off process = new Off();
                      process.execute();
                }
            }
        });

    }
}