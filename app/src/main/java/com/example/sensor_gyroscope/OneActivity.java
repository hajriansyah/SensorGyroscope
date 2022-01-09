package com.example.sensor_magnetic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sensor_gyroscope.SecondActivitySensor;
import com.example.sensor_gyroscope.R;

public class OneActivity extends AppCompatActivity {

    Button halaman_sensor;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oneactivity);

        halaman_sensor = (Button)findViewById(R.id.button2);

        // Add_button add clicklistener
        halaman_sensor.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {

                // Intents are objects of the android.content.Intent type. Your code can send them
                // to the Android system defining the components you are targeting.
                // Intent to start an activity called SecondActivity with the following code:

                Intent intent = new Intent(com.example.sensor_magnetic.OneActivity.this, SecondActivitySensor.class);

                // start the activity connect to the specified class
                startActivity(intent);
            }
        });
    }
}