package com.example.baikiemtra;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    private TextInputEditText email;
    private TextInputEditText pass;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = findViewById(R.id.email);
        pass = findViewById(R.id.pass);
        button = findViewById(R.id.button);
        Intent intent = getIntent();
        email.setText(intent.getStringExtra("email"));
        pass.setText(intent.getStringExtra("pass"));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this, profile.class);
                intent1.putExtra("email", email.getText().toString());
                intent1.putExtra("pass", pass.getText().toString());
                startActivity(intent1);
            }
        });
    }
}