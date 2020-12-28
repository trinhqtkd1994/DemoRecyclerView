 package com.example.restaurantmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

 public class LoginStaffActivity extends AppCompatActivity {
    TextView tvtLoginStaff;
    EditText edtAccount,edtPassword;
    Button btnConfirm;
    ImageButton icoBack,iconNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_staff);
        AnhXa();

        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginStaffActivity.this,StaffActivity.class);
                startActivity(intent);
            }
        });
    }

     private void AnhXa() {
        tvtLoginStaff = findViewById(R.id.tvt_LoginStaff);
        edtAccount = findViewById(R.id.edt_Account);
        edtPassword = findViewById(R.id.edt_Password);
        btnConfirm = findViewById(R.id.btn_Confirm);
        icoBack = findViewById(R.id.icon_Back);
        iconNext = findViewById(R.id.icon_Next);
     }
 }