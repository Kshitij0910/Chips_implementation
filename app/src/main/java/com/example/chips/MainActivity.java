package com.example.chips;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Toast;

import com.google.android.material.chip.Chip;

public class MainActivity extends AppCompatActivity {

    Chip chip1, chip2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chip1 = (Chip)findViewById(R.id.chip_example1);
        chip2 = (Chip)findViewById(R.id.chip_example2);

        //Event1
        chip1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(true)
                {
                    Toast.makeText(MainActivity.this, "CATEGORY 1 Selected" , Toast.LENGTH_SHORT).show();
                }
                else if(false)
                {
                    Toast.makeText(MainActivity.this, "CATEGORY 1 Deselected" , Toast.LENGTH_SHORT).show();
                }
            }
        });
        chip1.setOnCloseIconClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Close icon clicked", Toast.LENGTH_SHORT).show();
            }

        });

        //Event2
        chip2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(true)
                {
                    Toast.makeText(MainActivity.this, "CATEGORY 2 Selected" , Toast.LENGTH_SHORT).show();
                }

                else if(false)
                {
                    Toast.makeText(MainActivity.this, "CATEGORY 2 Deselected" , Toast.LENGTH_SHORT).show();
                }

            }
        });
        chip2.setOnCloseIconClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Close icon clicked", Toast.LENGTH_SHORT).show();
            }

        });
    }
}

