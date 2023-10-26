package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    TextView img5,img2, img3, img4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img5 = findViewById(R.id.ple_icon);
        img2 = findViewById(R.id.bagel);
        img3 = findViewById(R.id.cakes);
        img4 = findViewById(R.id.macaron);


        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, page2.class);
                startActivity(intent);

            }
        });
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent page3 = new Intent(MainActivity.this, page3.class);
                startActivity(page3);

            }
        });
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent page4 = new Intent(MainActivity.this, page4.class);
                startActivity(page4);

            }
        });
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent page5 = new Intent(MainActivity.this, Cart.class);
                startActivity(page5);
            }
        });


        /// bottom bare
//        BottomNavigationView bottomNavigationView =findViewById(R.id.bottom_navigatin_view);
//        bottomNavigationView.setOnNavigationItemSelectedListener(navListener);


    }

//    private final BottomNavigationView.OnNavigationItemSelectedListener navListener =
//            item -> {
//                switch (item.getItemId()) {
//                    case R.id.home:
//                        startActivity(new Intent(MainActivity.this, Cart.class));
//                        break;
//                    case R.id.shop:
//                        startActivity(new Intent(MainActivity.this, page4.class));
//                        break;
//                    case R.id.map:
//                        startActivity(new Intent(MainActivity.this, page3.class));
//                        break;
//                    case R.id.setting:
//                        startActivity(new Intent(MainActivity.this, page2.class));
//                        break;
//                }
//                return true;
//            };
}