package com.example.shubhanjay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.shubhanjay.ui.login.LoginActivity;

public class AddCon extends AppCompatActivity {
    private Button adcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_con);
        adcon = (Button) findViewById(R.id.addcon);
        adcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });
    }

    private void openMainActivity() {
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
}
