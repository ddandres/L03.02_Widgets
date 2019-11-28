/*
 * Copyright (c) 2019. David de Andrés and Juan Carlos Ruiz, DISCA - UPV, Development of apps for mobile devices.
 */

package com.example.android.l0302_widgets;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
        This method wil be executed when any Button is clicked.
        It will launch the corresponding Activity.
     */
    public void launchShowWidgetsActivity(View view) {
        Intent intent = null;
        switch (view.getId()) {
            // Intent to start an Activity that displays a number of TextView and EditText
            case R.id.bTextFields:
                intent = new Intent(MainActivity.this, TextFieldsActivity.class);
                break;
            // Intent to start an Activity that displays a number of Buttons
            case R.id.bButtons:
                intent = new Intent(MainActivity.this, ButtonsActivity.class);
                break;
            // Intent to start an Activity that displays a number of Widgets
            case R.id.bWidgets:
                intent = new Intent(MainActivity.this, WidgetsActivity.class);
                break;
        }
        if (intent != null) {
            startActivity(intent);
        }
    }
}
