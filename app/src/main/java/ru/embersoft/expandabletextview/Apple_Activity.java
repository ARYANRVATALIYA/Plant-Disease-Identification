package ru.embersoft.expandabletextview;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Apple_Activity extends AppCompatActivity {
    private Button move;
    private Button Detect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apple);

        move = findViewById(R.id.gridLayoutApple);
        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Apple_Activity.this,MainActivity2.class);
                startActivity(intent);
            }
        });
        Detect = findViewById(R.id.Detect);
        Detect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Apple_Activity.this, Scan_Activity.class);
                startActivity(intent);

            }
        });
    }
}