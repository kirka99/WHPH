package com.example.whph;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Listassa painetun aktiviteetin määrittely
 * @author Jonne
 * @version 1.5
 */
public class ClickedActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clicked);
        Intent intent = getIntent();

        Bundle b = getIntent().getExtras();
        int i = b.getInt(MainActivity.EXTRA, 0);

        ((TextView)findViewById(R.id.textName))
                .setText(List.getInstance().getWorkouts(i).getName());

        ((TextView)findViewById(R.id.textFirstMove))
                .setText(List.getInstance().getWorkouts(i).getFirstMove());
        ((TextView)findViewById(R.id.textFirstMoveSets))
                .setText(Integer.toString(List.getInstance().getWorkouts(i).getFirstMoveSets()));
        ((TextView)findViewById(R.id.textFirstMoveReps))
                .setText(Integer.toString(List.getInstance().getWorkouts(i).getFirstMoveReps()));

        ((TextView)findViewById(R.id.textSecondMove))
                .setText(List.getInstance().getWorkouts(i).getSecondMove());
        ((TextView)findViewById(R.id.textSecondMoveSets))
                .setText(Integer.toString(List.getInstance().getWorkouts(i).getSecondMoveSets()));
        ((TextView)findViewById(R.id.textSecondMoveReps))
                .setText(Integer.toString(List.getInstance().getWorkouts(i).getSecondMoveReps()));

        ((TextView)findViewById(R.id.textThirdMove))
                .setText(List.getInstance().getWorkouts(i).getThirdMove());
        ((TextView)findViewById(R.id.textThirdMoveSets))
                .setText(Integer.toString(List.getInstance().getWorkouts(i).getThirdMoveSets()));
        ((TextView)findViewById(R.id.textThirdMoveReps))
                .setText(Integer.toString(List.getInstance().getWorkouts(i).getThirdMoveReps()));


        /**
         * Määrittelee mitkä kuvat laitetaan millekkin listan alkiolle
         * @author Jonne
         * @version 1.6
         */
        if(i == 0) {
            ImageView ivFirst = (ImageView) findViewById(R.id.imageView1);
            ivFirst.setImageResource(R.drawable.bicepcurls);

            ImageView ivSecond = (ImageView) findViewById(R.id.imageView2);
            ivSecond.setImageResource(R.drawable.cablecurlt);

            ImageView ivThird = (ImageView) findViewById(R.id.imageView3);
            ivThird.setImageResource(R.drawable.hammercurl);
        }

        else if(i == 1) {
            ImageView ivFirst = (ImageView) findViewById(R.id.imageView1);
            ivFirst.setImageResource(R.drawable.squatx);

            ImageView ivSecond = (ImageView) findViewById(R.id.imageView2);
            ivSecond.setImageResource(R.drawable.fsquatx);

            ImageView ivThird = (ImageView) findViewById(R.id.imageView3);
            ivThird.setImageResource(R.drawable.legpress);
        }

        else if(i == 3) {
            ImageView ivFirst = (ImageView) findViewById(R.id.imageView1);
            ivFirst.setImageResource(R.drawable.finger);

            ImageView ivSecond = (ImageView) findViewById(R.id.imageView2);
            ivSecond.setImageResource(R.drawable.fsquatx);

            ImageView ivThird = (ImageView) findViewById(R.id.imageView3);
            ivThird.setImageResource(R.drawable.legpress);
        }
    }
    public void stopwatchClicked(View view) {
        Intent intentStopwatch = new Intent(this, StopWatch.class);
        startActivity(intentStopwatch);
    }
}



