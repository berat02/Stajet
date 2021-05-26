package com.example.denemeprojesi;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class ContentMain extends AppCompatActivity {
    Button eklebttn;
    AlertDialog.Builder builder;
    private Button btn01;
    android.widget.EditText EditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);

        builder = new AlertDialog.Builder(this);
        eklebttn = (Button) findViewById(R.id.button4);

        eklebttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ContentMain.this, SettingsActivity.class);
                ContentMain.this.startActivity(intent);

            }
        });
    }
}