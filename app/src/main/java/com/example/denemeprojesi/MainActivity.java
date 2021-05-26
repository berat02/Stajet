package com.example.denemeprojesi;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button bttn;
    AlertDialog.Builder builder;
    private Button btn01;
    EditText EditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        builder = new AlertDialog.Builder(this);
        bttn = (Button) findViewById(R.id.button);

        bttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, HomePage.class);
                MainActivity.this.startActivity(intent);

            }
        });
        EditText ed1, ed2;
        bttn = (Button) findViewById(R.id.button2);
        ed1 = (EditText) findViewById(R.id.editTextTextPersonName);
        ed2 = (EditText) findViewById(R.id.editTextNumberPassword);

        bttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1.getText().toString().equals("u") &&
                        ed2.getText().toString().equals("3")) {
                    Intent i = new Intent(MainActivity.this, HomePage.class);
                    i.putExtra("id", ed1.getText().toString());
                    startActivity(i);
                } else {
                    Toast.makeText(getApplicationContext(), "⚠ Hatalı Giriş ", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

