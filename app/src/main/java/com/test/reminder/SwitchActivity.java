package com.test.reminder;

import android.annotation.SuppressLint;
import android.os.Bundle;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

public class SwitchActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    SwitchCompat mySwitch = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reminderdetail);


        mySwitch = (SwitchCompat) findViewById(R.id.switch2);
        mySwitch.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (isChecked) {
            Spinner dropdown = (Spinner) findViewById(R.id.spinner);
            ArrayAdapter<CharSequence> staticAdapter = ArrayAdapter
                    .createFromResource(this, R.array.time, android.R.layout.simple_spinner_item);

            // Specify the layout to use when the list of choices appears
            staticAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            // Apply the adapter to the spinner
            dropdown.setAdapter(staticAdapter);
        } else {
            TextView every = (TextView) findViewById(R.id.textView3);
            Spinner everytime =(Spinner) findViewById(R.id.spinner);
            EditText time =(EditText) findViewById(R.id.everytime);
            every.setVisibility(View.INVISIBLE);
            everytime.setVisibility(View.INVISIBLE);
            time.setVisibility(View.INVISIBLE);
        }
    }

}
