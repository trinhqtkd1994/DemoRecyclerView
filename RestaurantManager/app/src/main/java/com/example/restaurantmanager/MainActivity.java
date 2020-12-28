package com.example.restaurantmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    ImageView imgViewRestaurant;
    TextView txtLogin;
    Button btnLoginStaff,btnLoginDiners;
    ImageButton iconVNam,iconEngland,iconBack;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnhXa();

        iconEngland.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               changeLanguage("en");
            }
        });

        iconVNam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeLanguage("vi");
            }
        });

        btnLoginStaff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,LoginStaffActivity.class);
                startActivity(intent);

            }
        });
    }
    public void changeLanguage(String language){
        Locale locale = new Locale(language);
        Configuration config = new Configuration();
        config.locale = locale;
        getBaseContext().getResources().updateConfiguration(
                config,
                getBaseContext().getResources().getDisplayMetrics()
        );
        Intent intent = new Intent(MainActivity.this,MainActivity.class);
        startActivity(intent);
    }

    private void AnhXa() {
        imgViewRestaurant = (ImageView) findViewById(R.id.img_View);
        txtLogin = (TextView) findViewById(R.id.tv_Login);
        btnLoginStaff = (Button) findViewById(R.id.btn_LoginStaff);
        btnLoginDiners = (Button) findViewById(R.id.btn_LoginDines);
        iconVNam = (ImageButton) findViewById(R.id.icon_VNam);
        iconEngland = (ImageButton) findViewById(R.id.icon_England);
        iconBack = (ImageButton) findViewById(R.id.icon_Back);
    }
}