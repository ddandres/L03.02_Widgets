/*
 * Copyright (c) 2019. David de Andrés and Juan Carlos Ruiz, DISCA - UPV, Development of apps for mobile devices.
 */

package labs.dadm.l0302_widgets;

import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

public class ButtonsActivity extends AppCompatActivity {

    // Hold references to Views
    RadioGroup rgGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons);

        // Set the title of the Activity
        setTitle(R.string.buttons);

        rgGroup = findViewById(R.id.rgGroup);

        final SwitchCompat sSwitch = findViewById(R.id.sSwitch);
        // This callback will be activated whenever the check state of the Switch changes
        sSwitch.setOnCheckedChangeListener((buttonView, isChecked) -> {
            // Display a Toast informing about its check state
            Toast.makeText(ButtonsActivity.this,
                    getString(R.string.switch_message, isChecked ? "" : "un"),
                    Toast.LENGTH_SHORT).show();
        });

        // Uncheck all RadioButtons within the RadioGroup
        findViewById(R.id.ibImage).setOnClickListener(v -> rgGroup.clearCheck());

    }
}
