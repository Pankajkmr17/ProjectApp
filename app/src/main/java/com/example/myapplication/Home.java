package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import  android.view.MenuItem;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Home extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        BottomNavigationView bottomNavigationView =findViewById(R.id.bottom_navigatin_view);

        bottomNavigationView.setSelectedItemId(R.id.home);
        bottomNavigationView.setOnNavigationItemSelectedListener(navListener);


    }

    private final BottomNavigationView.OnNavigationItemSelectedListener navListener =
            item -> {
                switch (item.getItemId()) {
//                    case R.id.shop:
//                        startActivity(new Intent(Home.this, Cart.class));
//                        break;
//                    case R.id.home:
//                        startActivity(new Intent(MainActivity.this, page4.class));
//                        break;
//                    case R.id.map:
//                        startActivity(new Intent(MainActivity.this, page3.class));
//                        break;
//                    case R.id.setting:
//                        startActivity(new Intent(MainActivity.this, page2.class));
//                        break;
                }
                return true;
            };
}