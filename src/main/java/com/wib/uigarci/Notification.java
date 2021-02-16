package com.wib.uigarci;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Notification extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        BottomNavigationView bottomNavigationView=findViewById(R.id.bottomNavigation_id);

        bottomNavigationView.setSelectedItemId(R.id.nav_home);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.nav_dashboard:
                        startActivity(new Intent(getApplicationContext(),
                                dash.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.nav_home:

                    case R.id.nav_scan:
                        startActivity(new Intent(getApplicationContext(),
                                Scan.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.nav_notification:
                        startActivity(new Intent(getApplicationContext(),
                                Notification.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.nav_user:
                        startActivity(new Intent(getApplicationContext(),
                                user.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });

    }
}