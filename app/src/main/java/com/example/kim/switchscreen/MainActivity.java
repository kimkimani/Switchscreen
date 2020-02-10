package com.example.kim.switchscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: starting");
        Button btnNavToSecondSreeen=(Button)findViewById(R.id.btnGoToSecondScreen);
        btnNavToSecondSreeen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: clicked btnNavToSecondSreeen");
                Intent intent= new Intent(MainActivity.this,SecondScreen.class);
                startActivity(intent);

                
            }
        });

    }
}
