package com.example.kim.switchscreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondScreen extends AppCompatActivity {
    private static final String TAG = "SecondScreen";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_screeen_layout);
        Log.d(TAG, "onCreate: starting");
        Button NavToFirstScreen=(Button)findViewById(R.id.btnGoToFirstScreen);
        NavToFirstScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: clicked btnNavToFirstScreen");
                Intent intent=new Intent(SecondScreen.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
