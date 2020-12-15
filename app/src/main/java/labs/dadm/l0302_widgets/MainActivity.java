/*
 * Copyright (c) 2019. David de Andrés and Juan Carlos Ruiz, DISCA - UPV, Development of apps for mobile devices.
 */

package labs.dadm.l0302_widgets;

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
        final int clickedButton = view.getId();
        if (clickedButton == R.id.bTextFields) {
            // Intent to start an Activity that displays a number of TextView and EditText
            intent = new Intent(MainActivity.this, TextFieldsActivity.class);
        } else if (clickedButton == R.id.bButtons) {
            // Intent to start an Activity that displays a number of Buttons
            intent = new Intent(MainActivity.this, ButtonsActivity.class);
        } else if (clickedButton == R.id.bWidgets) {
            // Intent to start an Activity that displays a number of Widgets
            intent = new Intent(MainActivity.this, WidgetsActivity.class);
        }
        if (intent != null) {
            startActivity(intent);
        }
    }
}
