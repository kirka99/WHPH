
package com.example.whph;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Listan aloitus sivu
 * @author  Jonne
 * @version 2.3
 */
public class MainActivity extends AppCompatActivity {
    public static final String EXTRA = "flägäböö";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ListView lv = findViewById(R.id.workoutsList);
        Log.i("MOK",  List.getInstance().getWorkout().toString());

        lv.setAdapter(new ArrayAdapter<Workout>(
                this,
                R.layout.workout_item_layout,
                List.getInstance().getWorkout())
        );

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            /**
             * lukee mistä listan alkiosta käyttjä on painanut ja toimii sen mukaan
             * @author Jonne
             * @version 1.3
             */
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.d("TAG", "onItemClick(" + i + ")");
                Intent nextActivity = new Intent(MainActivity.this, ClickedActivity.class);
                nextActivity.putExtra(EXTRA, i);
                startActivity(nextActivity);
            }
        });


    }
}