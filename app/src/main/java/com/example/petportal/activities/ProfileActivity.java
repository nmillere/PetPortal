package com.example.petportal.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.petportal.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.parse.ParseUser;

public class ProfileActivity extends AppCompatActivity {

    public static final String TAG = "ProfileActivity";
    private Button btnLogOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navTimeline:
//                        Intent i = new Intent(ProfileActivity.this, TimelineActivity.class);
//                        startActivity(i);
//                        overridePendingTransition(0, 0);
                        break;
                    case R.id.navPost:
                        Intent i = new Intent(ProfileActivity.this, MainActivity.class);
                        startActivity(i);
                        overridePendingTransition(0, 0);
                        break;
                    case R.id.navProfile:
//                        Intent i = new Intent(MainActivity.this, ProfileActivity.class);
//                        startActivity(i);
//                        overridePendingTransition(0, 0);
                        break;
                }
                return true;
            }
        });

        btnLogOut = findViewById(R.id.btnLogOut);
        btnLogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ParseUser.logOut();
                ParseUser currentUser = ParseUser.getCurrentUser(); // this will now be null
                startActivity(new Intent(ProfileActivity.this, LoginActivity.class));
            }
        });
    }
}