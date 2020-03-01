package com.dicoding.sarjanasantuy.fragment;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class HeroDetail extends AppCompatActivity {
        ImageView imageView;
        TextView tittle, deskripsi;

        String data1, data2;
        int imageV;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_hero_detail);

            imageView = findViewById(R.id.image_detail);
            tittle = findViewById(R.id.tittle_detail);
            deskripsi = findViewById(R.id.deskripsi_detail);

            getData();
            setData();
        }

        private void getData(){
            if(getIntent().hasExtra("imageV") && getIntent().hasExtra("data1") &&
                    getIntent().hasExtra("data2")){
                data1 = getIntent().getStringExtra("data1");
                data2 = getIntent().getStringExtra("data2");
                imageV = getIntent().getIntExtra("imageV", 1);
            }
            else {
                Toast.makeText(this,"NO Data", Toast.LENGTH_SHORT).show();
            }
        }

        private void setData(){
            tittle.setText(data1);
            deskripsi.setText(data2);
            imageView.setImageResource(imageV);
        }
}
