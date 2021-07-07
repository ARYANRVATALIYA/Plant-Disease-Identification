package ru.embersoft.expandabletextview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Fruits_Activity extends AppCompatActivity {
    GridLayout gridLayoutfruits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruits);

        gridLayoutfruits = (GridLayout) findViewById(R.id.gridLayoutfruits);
        setSingleEvent(gridLayoutfruits);

    }

    private void setSingleEvent(GridLayout gridLayoutfruits) {

            for(int i=0;i<gridLayoutfruits.getChildCount();i++) {
                CardView cardView = (CardView) gridLayoutfruits.getChildAt(i);
                final int finalI = i;
                cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (finalI == 0) {
                            Intent intent = new Intent(Fruits_Activity.this,Apple_Activity.class);
                            startActivity(intent);
                        }

                    }
                });
            }

    }
}