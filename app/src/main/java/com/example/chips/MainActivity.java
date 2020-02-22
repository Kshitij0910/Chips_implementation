package com.example.chips;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Toast;

import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Boolean> booleanArrayList = new ArrayList<>();
    ArrayList<String> filterArray = new ArrayList<>();
    ChipGroup filter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        filter = findViewById(R.id.chipGroup);

        filterArray.add(0, "Filter 1");
        filterArray.add(1, "Filter 2");
        filterArray.add(2, "Filter 3");
        filterArray.add(3, "Filter 4");
        for (int i = 0; i < filterArray.size(); i++) {
            //addChip(filterArray.get(i), filter);

            Chip chip = new Chip(this);
            chip.setId(i);
            chip.setTag(i);

            booleanArrayList.add(true);
            chip.setText(filterArray.get(i));
            chip.setCheckable(true);

            chip.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                    int tag = (int) compoundButton.getTag();
                    booleanArrayList.set(tag, b);
                    compoundButton.setVisibility(View.GONE);
                    filterArray.remove(tag);


                }


            });
            filter.addView(chip);


        }
    }
}




//Category2
       /* Category2Chip.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
@Override
public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if(!b) //Event on deselection of chip2.
        {
        Category2Chip.setVisibility(View.GONE);
        Toast.makeText(NoticesAndEventsFragment.this, "CATEGORY 2 Deselected" , Toast.LENGTH_SHORT).show();
        }

        else if(b) //Event on Selection of chip2.
        {

        Toast.makeText(NoticesAndEventsFragment.this, "CATEGORY 2 Selected" , Toast.LENGTH_SHORT).show();
        }

private void addChip(String pItem, ChipGroup pChipGroup) {
        Chip lChip = new Chip(this);
        lChip.setText(pItem);
        lChip.setTextColor(getResources().getColor(R.color.chip_txt_color));
        lChip.setChipBackgroundColor(getResources().getColorStateList(R.color.chip_bg_color));

        pChipGroup.addView(lChip, pChipGroup.getChildCount() );
        }
*/