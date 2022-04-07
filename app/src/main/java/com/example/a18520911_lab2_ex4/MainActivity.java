package com.example.a18520911_lab2_ex4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtEmail;
    EditText txtName;
    EditText txtProject;
    Button viewContactButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtName = findViewById(R.id.editTextName);
        txtEmail = findViewById(R.id.editTextEmail);
        txtProject = findViewById(R.id.editTextProject);
        viewContactButton = findViewById(R.id.button);

        viewContactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iGetContactInfo = new Intent(getApplicationContext(), ViewContactInfoActivity.class);

                Bundle bundle = new Bundle();

                bundle.putString("emailKey",txtEmail.getText().toString());
                bundle.putString("nameKey",txtName.getText().toString());
                bundle.putString("projectKey", txtProject.getText().toString());

                iGetContactInfo.putExtras(bundle);
                startActivity(iGetContactInfo);
            }
        });
    }

}