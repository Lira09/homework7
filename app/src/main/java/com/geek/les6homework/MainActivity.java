package com.geek.les6homework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText editText;
    private EditText editText1;
    String myString = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.bn_sn);
        textView = findViewById(R.id.text);
        editText = findViewById(R.id.email);
        editText1= findViewById(R.id.password);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText().toString().isEmpty() && editText1.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this,"Enter data!" , Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(MainActivity.this, "Welcome!" ,Toast.LENGTH_LONG).show();
                    button.setBackgroundColor(getResources().getColor(R.color.white));
                }
            }
        });




    }
}