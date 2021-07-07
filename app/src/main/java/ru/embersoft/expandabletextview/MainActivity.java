package ru.embersoft.expandabletextview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity
{
    GridLayout gridLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridLayout = (GridLayout) findViewById(R.id.gridLayout);
        setSingleEvent(gridLayout);


    }

    private void setSingleEvent(GridLayout gridLayout1) {
        for(int i=0;i<gridLayout.getChildCount();i++) {
            CardView cardview = (CardView) gridLayout.getChildAt(i);
            final int finalI = i;
            cardview.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (finalI==0) {
                        Intent intent = new Intent(MainActivity.this,Fruits_Activity.class);
                        startActivity(intent);
                    }

                }
            });
        }
    }
}