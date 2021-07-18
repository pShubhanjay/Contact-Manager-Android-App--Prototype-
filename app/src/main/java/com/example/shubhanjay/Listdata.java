package com.example.shubhanjay;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Listdata extends AppCompatActivity {
    TextView name;
    TextView cphone;
    TextView caddress;
    TextView eadress;
    ImageView image;
    TextView instagram;
    TextView snapchat;
    TextView facebook;
    TextView twitter;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listdata);
        name = findViewById(R.id.listdata);
        cphone = findViewById(R.id.phone);
        caddress = findViewById(R.id.add);
        eadress = findViewById(R.id.email);
        image = findViewById(R.id.imageView);
        instagram = findViewById(R.id.instagramid);
        snapchat = findViewById(R.id.snapchatid);
        facebook = findViewById(R.id.facebookid);
        twitter = findViewById(R.id.tweetid);
        Intent intent = getIntent();
        name.setText(intent.getStringExtra("name"));
        instagram.setText(intent.getStringExtra("insta"));
        caddress.setText(intent.getStringExtra("address"));
        eadress.setText(intent.getStringExtra("email"));
        cphone.setText(intent.getStringExtra("phone"));
        snapchat.setText(intent.getStringExtra("snapchat"));
        facebook.setText(intent.getStringExtra("facebook"));
        twitter.setText(intent.getStringExtra("twitter"));
        image.setImageResource(intent.getIntExtra("image",0));

    }
}
