package com.example.leon.fortuneteller;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class FortuneActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fortune);

        //make button click change text view
        final TextView answertxt = (TextView) findViewById(R.id.answertxt);
        Button answerbtn = (Button) findViewById(R.id.answerbtn);

        final String[] answers = {"Yes.", "No.", "NO, NO, NO.", "Maybe...", "Unsure...", "Inconclusive...", "Possibly...", "Definitely.", "Most Assuredly.", "Of Course!", "Absolutely Not.", "Not by any means.", "Not at all.", "Never.","Yes, Yes, Yes!", "Error 404", "Nope.", "I guess so.", "Affirmative.", "Negative.", "Certainly not.", "Not likely,", "Likely,", "I didn't hear you.", "Sí!", "It is certain.", "It is decidedly so.", "Highly probable.", "Don't count on it.", "UMM, NO!"};

        answerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int random = (int) (Math.random() * answers.length);
                answertxt.setText(answers[random]);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_fortune, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}