package com.example.shubhanjay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    ListView listView;
    String[] conNames = {"Aman Pachauri", "Anik Kappor", "Alex Rawat", "Saransh Gujral", "Shubhanjay Pandey","Uday","Vishant",
            "Yashasvi ","Yogesh Kumar"};
    String[] cphone = {"123456789","456123890","123578946","345678912","123678945","124567893","123478956","456789312","123457896"};
    String[] caddress = {"Noida","Delhi","Kasganj","New Delhi","Kanpur","Delhi","Gaziabad","South Delhi","Rajasthan"};
    String[] eadress = {"amanpachauri@gmail.com","anikapoor@gmail.com","alaskshendra@gmail.com","saransh@gmail.com","pshubhanjay@gmail.com","uday@gmail.com","vishant@gmail.com","yashasvi@gmail.com","yogeshk@gmail.com"};
    String[] snapchat= {"pachauri_aman","anik_kapoor","alakshendra rawat","saransh_gujral","offnote_","ukc0413","~","yashasvikakkar","yogeshk_kumar"};
    String[] instagram = {"amanpachauri_","anikkapoor","air_25_vr1","saransh_","offnote_","ukc0413","i_am_vishant","kakkar_yashasvi","yogeshkumar"};
    String[] facebook = {"Aman.Pachauri","anik.kapoor23","Alakshendra Rawat","saranshgujral","shubhanjay.pandey","ukc0413","kumar.vishant","yashasvi_k","kumar_yogeshk"};
    String[] twitter = {"aman1706","kapooranik","air_25_vr1","saransh_gujral","pshubhanjay","ukc0413","vishant","yashasvi_kakkar","yogesh_kumark"};
    int[] cImages = {R.drawable.aman, R.drawable.anik, R.drawable.alex, R.drawable.saransh, R.drawable.shubhanjay,R.drawable.uday,
            R.drawable.vishant, R.drawable.yashasvi, R.drawable.contacti };
    ImageButton imageButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        imageButton = (ImageButton) findViewById(R.id.imageButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent beach = new Intent(Main2Activity.this, AddCon.class);
                startActivity(beach);
            }
        });
        listView = (ListView) findViewById(R.id.listview);
        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
//                Toast.makeText(getApplicationContext(),fruitNames[i],Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(), Listdata.class);
                intent.putExtra("name", conNames[i]);
                intent.putExtra("phone", cphone[i]);
                intent.putExtra("image", cImages[i]);
                intent.putExtra("address", caddress[i]);
                intent.putExtra("email", eadress[i]);
                intent.putExtra("insta", instagram[i]);
                intent.putExtra("snapchat", snapchat[i]);
                intent.putExtra("facebook", facebook[i]);
                intent.putExtra("twitter", twitter[i]);
                startActivity(intent);
            }
        });
    }

    private class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return cImages.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View view1 = getLayoutInflater().inflate(R.layout.row_data, null);
            //getting view in row_data
            TextView name = view1.findViewById(R.id.fruits);
            ImageView image = view1.findViewById(R.id.images);
            name.setText(conNames[i]);
            image.setImageResource(cImages[i]);
            return view1;

        }
    }
}
