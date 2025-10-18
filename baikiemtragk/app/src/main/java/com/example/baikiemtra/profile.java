package com.example.baikiemtra;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class profile extends AppCompatActivity {
    private TextView email;
    private TextView pass;
    private Button button2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);
        email = findViewById(R.id.email);
        pass = findViewById(R.id.pass);
        button2 = findViewById(R.id.button2);
        Intent intent = getIntent();
        email.setText(intent.getStringExtra("email"));
        pass.setText(intent.getStringExtra("pass"));
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(profile.this, MainActivity.class);
                intent1.putExtra("email", email.getText().toString());
                intent1.putExtra("pass", pass.getText().toString());
                startActivity(intent1);
            }
        });
    }
}
