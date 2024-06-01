package com.example.perfect;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText T = (EditText) findViewById(R.id.editText);
        TextView Result = (TextView) findViewById(R.id.txtV3);
        Button B1 = (Button) findViewById(R.id.btn);

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num, rem, sum = 0, perfect;
                num = Integer.parseInt(T.getText().toString().trim());
                for (int i = 1; i < num; i++) {
                    rem = num % i;
                    if (rem == 0) {
                        sum = sum + i;
                    }
                }
                if (sum == num) {
                    Result.setText(num + "is perfect Number");
                    Toast.makeText(MainActivity.this, num + "is a perfect number ", Toast.LENGTH_SHORT).show();
                }

                else
                {
                    Result.setText(num + "is not a perfect Number");
                    Toast.makeText(MainActivity.this, num + "is not a perfect number ", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}