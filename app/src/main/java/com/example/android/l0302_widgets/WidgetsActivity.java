/*
 * Copyright (c) 2019. David de Andrés and Juan Carlos Ruiz, DISCA - UPV, Development of apps for mobile devices.
 */

package com.example.android.l0302_widgets;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class WidgetsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_widgets);

        // Set the title of the Activity
        setTitle(R.string.widgets);

        final ProgressBar pbProgress = findViewById(R.id.pbIndefiniteProgress);

        final Switch sSwitch = findViewById(R.id.sSwitchProgress);
        // This callback will be activated whenever the check state of the Switch changes
        sSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // The ProgressBar will be visible or not according to the check state of the Switch
                if (isChecked) {
                    pbProgress.setVisibility(View.VISIBLE);
                } else
                    pbProgress.setVisibility(View.INVISIBLE);
            }
        });

        final SeekBar sbContinuous = findViewById(R.id.sbContinuous);
        final SeekBar sbDiscrete = findViewById(R.id.sbDiscrete);
        // This callback will be activated whenever the progress of a SeekBar changes
        final SeekBar.OnSeekBarChangeListener listener = new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                // Do nothing
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // Do nothing
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // Display the current progress
                Toast.makeText(WidgetsActivity.this,
                        getString(R.string.message_progress, seekBar.getProgress(), seekBar.getMax()),
                        Toast.LENGTH_SHORT).show();
            }
        };
        // Associate the listener to each SeekBar
        sbContinuous.setOnSeekBarChangeListener(listener);
        sbDiscrete.setOnSeekBarChangeListener(listener);
    }

}
