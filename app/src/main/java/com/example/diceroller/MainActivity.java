package com.example.diceroller;

import android.os.Bundle;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void on_button_Click(View view) {

        roll_the_dice();

        TextView TV = this.findViewById(R.id.NumTextView);
        TextView EG = (TextView) this.findViewById(R.id.EnterGuess);
        TextView SC = (TextView) this.findViewById(R.id.ScoreText);

        int Number = Integer.valueOf(TV.getText().toString());
        int UserGuess = Integer.valueOf(EG.getText().toString());

        if (UserGuess == Number) {

        int Score = Integer.valueOf(SC.getText().toString());
        int ScoreCheck = Score +1;

        SC.setText(Integer.toString(ScoreCheck));
        Toast.makeText(getApplicationContext(), "Congratulations", Toast.LENGTH_SHORT).show();

        }
        }

    public void on_button_Click2(View view) {
        roll_the_dice();

        TextView TV = this.findViewById(R.id.NumTextView);
        TextView MS = this.findViewById(R.id.Txt_Message);

        int Number = Integer.valueOf(TV.getText().toString());

        if (Number == 1){
            MS.setText("If you could go any where in the world where would you go?");
        }else if (Number == 2){
            MS.setText("If you were stranded on a desert island, what three things would you want to take with you?");
        }
        else if (Number == 3){
            MS.setText("If you could eat only one food for the rest of your life what would it be?");
        }
        else if (Number == 4){
            MS.setText("If you won a million dollars what is the first thing you would buy?");
        }
        else if (Number == 5){
            MS.setText("If you could spend the day with one fictional character who would it be?");
        }
        else if (Number == 6){
            MS.setText("If you found a magic lantern and a genie gave you three wishes,what would you wish?");
        }

    }


    public void roll_the_dice(){

        TextView TV = this.findViewById(R.id.NumTextView);

        Random r = new Random();
        int num = r.nextInt(6) +1;

        TV.setText(Integer.toString(num));

    }

}

