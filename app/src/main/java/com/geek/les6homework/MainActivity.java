package com.geek.les6homework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText editEmail;
    private EditText editPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.bn_sn);
        textView = findViewById(R.id.text);
        editEmail = findViewById(R.id.email);
        editPassword= findViewById(R.id.password);

        editPassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (!editEmail.getText().toString().equals("") && !editPassword.getText().toString().equals("")){
                    button.setEnabled(true);
                    button.setBackground(getResources().getDrawable(R.drawable.btn_white));
                } else {
                    button.setBackground(getDrawable(R.drawable.button));
                }
            }
        });

        editPassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (!editEmail.getText().toString().equals("") && !editPassword.getText().toString().equals("")){
                    button.setEnabled(true);
                    button.setBackground(getResources().getDrawable(R.drawable.btn_white));
                } else {
                    button.setBackground(getDrawable(R.drawable.button));
                }
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editEmail.getText().toString().equals("") || editPassword.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "Enter data!", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this, "Welcome!", Toast.LENGTH_LONG).show();
                }
            }
        });




    }
}