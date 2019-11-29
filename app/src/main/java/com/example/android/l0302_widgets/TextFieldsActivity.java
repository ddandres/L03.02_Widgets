/*
 * Copyright (c) 2019. David de Andrés and Juan Carlos Ruiz, DISCA - UPV, Development of apps for mobile devices.
 */

package com.example.android.l0302_widgets;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class TextFieldsActivity extends AppCompatActivity {

    // This is the right password!
    private final static String PASSWORD = "DADM";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_fields);

        // Set the title of the Activity
        setTitle(R.string.text_string);

        // Get a reference to the text field for entering passwords
        final EditText etPassword = findViewById(R.id.etPassword);
        // Add a TextWatcher to react to any change in this TextView's text
        etPassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // Do nothing
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // Do nothing
            }

            // Check the password is correct after the TextView's text changes
            @Override
            public void afterTextChanged(Editable s) {
                if (!etPassword.getText().toString().contentEquals(PASSWORD)) {
                    // Display an error symbol and an explanatory message
                    etPassword.setError(getString(R.string.failed));
                }
            }
        });
    }
}
