package com.example.classtest2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;

public class TestDrawerLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_drawer_layout);

        Button btnSlide = findViewById(R.id.btnSlide);
         btnSlide.setOnClickListener(new View.OnClickListener() {
             @SuppressLint("WrongConstant")
             @Override
             public void onClick(View view) {
                 DrawerLayout DrawerLayout = findViewById(R.id.drawer);
                 if (!DrawerLayout.isDrawerOpen(Gravity.START)) {
                     DrawerLayout.openDrawer(Gravity.START);
                 }else DrawerLayout.closeDrawer(Gravity.END);
             }
         });
    }
}