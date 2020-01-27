package com.example.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
TextView tvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        final Bundle bundle = getIntent().getExtras();

        Float Result = bundle.getFloat("Result");

        tvResult = findViewById(R.id.tvResult);

        tvResult.setText(Float.toString(Result));
    }
}
