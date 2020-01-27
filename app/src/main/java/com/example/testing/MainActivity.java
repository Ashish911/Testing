package com.example.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText et1,et2;
    private Button btnSum,btnSub,btnDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.etNo1);
        et2 = findViewById(R.id.etNo2);
        btnSum = findViewById(R.id.btnSum);
        btnDiv = findViewById(R.id.btnDiv);
        btnSub = findViewById(R.id.btnSub);

        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Add();
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sub();
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Div();
            }
        });
    }

    public void Add(){
        float first = Float.parseFloat(et1.getText().toString());
        float second = Float.parseFloat(et2.getText().toString());
        Arithmetic arithmetic = new Arithmetic();

        float result = arithmetic.add(first,second);

        Intent intent = new Intent(MainActivity.this,ResultActivity.class);
        Bundle bundle = new Bundle();
        bundle.putFloat("Result", result);
        intent.putExtras(bundle);
        startActivity(intent);

    }
    public void Sub(){
        float first = Float.parseFloat(et1.getText().toString());
        float second = Float.parseFloat(et2.getText().toString());
        Arithmetic arithmetic = new Arithmetic();

        float result = arithmetic.subtract(first,second);

        Intent intent = new Intent(MainActivity.this,ResultActivity.class);
        Bundle bundle = new Bundle();
        bundle.putFloat("Result", result);
        intent.putExtras(bundle);
        startActivity(intent);

    }
    public void Div(){
        float first = Float.parseFloat(et1.getText().toString());
        float second = Float.parseFloat(et2.getText().toString());
        Arithmetic arithmetic = new Arithmetic();

        float result = arithmetic.divide(first,second);

        Intent intent = new Intent(MainActivity.this,ResultActivity.class);
        Bundle bundle = new Bundle();
        bundle.putFloat("Result", result);
        intent.putExtras(bundle);
        startActivity(intent);

    }
}
