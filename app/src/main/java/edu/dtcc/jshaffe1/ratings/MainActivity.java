package edu.dtcc.jshaffe1.ratings;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.*;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView rating;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        rating = (TextView) findViewById(R.id.textView);

        final RatingBar myRatingBar = (RatingBar) findViewById(R.id.ratingBar);

        RatingBar.OnRatingBarChangeListener showRating = new RatingBar.OnRatingBarChangeListener(){
            String s;
            public void onRatingChanged(RatingBar r, float f, boolean x ){
                s = "Rating: " + String.format("%.1f", myRatingBar.getRating()) +
                    "\nOut of: " + String.format("%d", myRatingBar.getNumStars());
                rating.setText(s);
            }

        };

        myRatingBar.setOnRatingBarChangeListener(showRating);
    }

}
