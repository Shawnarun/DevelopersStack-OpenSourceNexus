package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    boolean gameActive = true;

    int activePlayers = 0;
    int[] gameState = {2,2,2,2,2,2,2,2,2,2};
    int[][] winPosition = {{0,1,2},{3,4,5},{6,7,8}, {1,3,6},{1,4,7},{2,5,8}, {0,4,8},{2,4,6}};
    public static int count = 0;


    public void playerTap(View view){
        ImageView img = (ImageView) view;
        int tappedImage = Integer.parseInt(img.getTag().toString());
        TextView status = findViewById(R.id.status);

        if(!gameActive){
            gameReset(view);
            count = 0;
        }

        if(gameState[tappedImage] == 2){
            count++;

            if(count == 9){
                gameActive = false;
            }

            gameState[tappedImage] = activePlayers;

//            img.setTranslationY(-1000f);

            if(activePlayers == 0){
                img.setImageResource(R.drawable.x);
                activePlayers = 1;
                status.setText("O's Turn - Tap to play");
            }else{
                img.setImageResource(R.drawable.o);
                activePlayers = 0;
                status.setText("X's Turn - Tap to play");
            }
            //img.animate().translationYBy(1000f).setDuration(300);
        }

        int win = 0;
        if (count > 4) {
            for(int[] winPositions: winPosition){
                if (gameState[winPositions[0]] == gameState[winPositions[1]] &&
                        gameState[winPositions[1]] == gameState[winPositions[2]] && gameState[winPositions[0]] != 2) {

                    win = 1;
                    String winnerStr;
                    gameActive = false;

                    if (gameState[winPositions[0]] == 0) {
                        winnerStr = "X has won";
                    } else {
                        winnerStr = "O has won";
                    }
                    status.setText(winnerStr);
                }
            }
            if(count == 9 && win == 0){
                status.setText("Match Draw");
            }
        }
    }

    public void gameReset(View view){
        gameActive = true;
        activePlayers = 0;
        Arrays.fill(gameState,2);
        TextView status = findViewById(R.id.status);

        ((ImageView) findViewById(R.id.imageView0)).setImageResource(0);
        ((ImageView) findViewById(R.id.imageView1)).setImageResource(0);
        ((ImageView) findViewById(R.id.imageView2)).setImageResource(0);
        ((ImageView) findViewById(R.id.imageView3)).setImageResource(0);
        ((ImageView) findViewById(R.id.imageView4)).setImageResource(0);
        ((ImageView) findViewById(R.id.imageView5)).setImageResource(0);
        ((ImageView) findViewById(R.id.imageView6)).setImageResource(0);
        ((ImageView) findViewById(R.id.imageView7)).setImageResource(0);
        ((ImageView) findViewById(R.id.imageView8)).setImageResource(0);
        status.setText("X's Turn - Tap to play");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}