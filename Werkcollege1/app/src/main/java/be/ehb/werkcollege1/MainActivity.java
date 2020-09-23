package be.ehb.werkcollege1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public Logic logic;
    public TextView displayNumber;
    public TextView score;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logic = new Logic();
        displayNumber = findViewById(R.id.display_number);
        displayNumber.setText(Integer.toString(logic.getCurrentRandom()));
        score = findViewById(R.id.score);
    }

    @SuppressLint("SetTextI18n")
    public void checkLower(View view) {
        if (logic.getNextRandom() < Integer.parseInt((String) displayNumber.getText())) {
            won();
        }
        else {
            lost();
        }
    }

    @SuppressLint("SetTextI18n")
    public void checkEquals(View view) {
        if (logic.getNextRandom() == Integer.parseInt((String) displayNumber.getText())) {
            won();
        }
        else {
            lost();
        }
    }

    @SuppressLint("SetTextI18n")
    public void checkHigher(View view) {
        if (logic.getNextRandom() > Integer.parseInt((String) displayNumber.getText())) {
            won();
        }
        else {
            lost();
        }
    }

    @SuppressLint("SetTextI18n")
    private void reloadGUI() {
        score.setText("Score: " + logic.getScore());
        logic.setCurrentRandom(logic.getNextRandom());
        displayNumber.setText(Integer.toString(logic.getCurrentRandom()));
        logic.setNextRandom(logic.generateRandom());
    }

    private void won() {
        logic.increaseScore();
        reloadGUI();
    }

    private void lost () {
        logic.resetScore();
        reloadGUI();
    }
}