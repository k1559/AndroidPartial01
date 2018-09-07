package mx.itesm.partial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button buttonRock;
    private Button buttonPaper;
    private Button buttonScissors;
    private TextView PlayerScore;
    private TextView ComputerScore;
    private TextView editOutcome;
    private int Player = 0;
    private int Computer = 0;
    private int Winner = 0;
    private TextView ai;
    private Button buttonResetti;
    private int winner1 = 0;
    private int winner2 = 0;


    /*
    1 > 3 & 1 < 2
    2 > 1 & 2 < 3
    3 > 2 & 3 < 1
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        buttonPaper = findViewById(R.id.buttonPaper);
        buttonRock = findViewById(R.id.buttonRock);
        buttonScissors = findViewById(R.id.buttonScissors);
        editOutcome = findViewById(R.id.Outcome);
        PlayerScore = findViewById(R.id.Number1);
        ComputerScore = findViewById(R.id.Number2);
        ai = findViewById(R.id.ComputerChoose);
        buttonResetti = findViewById(R.id.Reset);

        buttonRock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Player = 1;

                Random myRandom = new Random();
                Computer = myRandom.nextInt(4);
                if(Computer== 1){
                    ai.setText("Computer chooses rock!");
                }
                if(Computer == 2){
                    ai.setText("Computer chooses paper!");
                }
                if(Computer == 3){
                    ai.setText("Computer chooses scissors!");
                }

                if(Player == Computer){
                    editOutcome.setText("It's a tie!");
                }

                if(Computer == 3){
                    editOutcome.setText("Player won!");
                    winner1 = winner1 +1;
                    PlayerScore.setText("" + winner1);
                }
                if(Computer == 2){
                    editOutcome.setText("Computer won!");
                    winner2 = winner2 +1;
                    ComputerScore.setText("" + winner2);
                }

            }

        });

        buttonPaper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Player = 2;


                Random myRandom = new Random();
                Computer = myRandom.nextInt(4);
                if(Computer== 1){
                    ai.setText("Computer chooses rock!");
                }
                if(Computer == 2){
                    ai.setText("Computer chooses paper!");
                }
                if(Computer == 3){
                    ai.setText("Computer chooses scissors!");
                }

                if(Player == Computer){
                    editOutcome.setText("It's a tie!");
                }

                if(Computer == 1){
                    winner1 = winner1 +1;
                    editOutcome.setText("Player won!");
                    PlayerScore.setText("" + winner1);
                }
                if(Computer == 3){
                    winner2 = winner2 +1;
                    editOutcome.setText("Computer won!");
                    ComputerScore.setText("" + winner2);
                }

            }

        });

        buttonScissors.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Player = 3;


                Random myRandom = new Random();
                Computer = myRandom.nextInt(4);
                if(Computer== 1){
                    ai.setText("Computer chooses rock!");
                }
                if(Computer == 2){
                    ai.setText("Computer chooses paper!");
                }
                if(Computer == 3){
                    ai.setText("Computer chooses scissors!");
                }

                if(Player == Computer){
                    editOutcome.setText("It's a tie!");
                }

                if(Computer == 2){
                    winner1 = winner1 + 1;
                    editOutcome.setText("Player won!");
                    PlayerScore.setText("" + winner1);
                }
                if(Computer == 1){
                    winner2 = winner2 +1;
                    editOutcome.setText("Computer won!");
                    ComputerScore.setText("" + winner2);
                }
            }



        });


        buttonResetti.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                winner1 = 0;
                winner2 = 0;
            ComputerScore.setText("" + winner1);
            PlayerScore.setText("" + winner2);
            }
        });
    }
}
