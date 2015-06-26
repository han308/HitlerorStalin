package com.interactive.noob.hitlerorstalin.util;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

import com.interactive.noob.hitlerorstalin.game.GamePlay;
import com.interactive.noob.hitlerorstalin.R;
import com.interactive.noob.hitlerorstalin.game.HitlerOrStalin;

import java.util.Random;

/**
 * Created by Jack on 3/17/2015.
 */
public class GameActivity extends Activity implements OnClickListener{

    private int clicked;
    private Question currentQ;
    private GamePlay currentGame;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        /**
         * Configure current game and get question
         */
        currentGame = ((HitlerOrStalin)getApplication()).getCurrentGame();
        currentQ = generateImage();
        Button hitlerButton = (Button) findViewById(R.id.hilterButton);
        hitlerButton.setOnClickListener(this);
        Button stalinButton = (Button) findViewById(R.id.stalinButton);
        stalinButton.setOnClickListener(this);

    }
    /**
     * Callback function for the OnClickListener interface.
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.hilterButton:
                clicked = 0;
                if(currentGame.checkRight(currentQ, clicked)){
                    Intent i = new Intent(this, GameActivity.class);
                    startActivity(i);
                    finish();
                }
                else{
                    Intent i = new Intent(this, EndGameActivity.class);
                    startActivity(i);
                    finish();
                }
                break;
            case R.id.stalinButton:
                clicked = 1;
                if(currentGame.checkRight(currentQ, clicked)){
                    Intent i = new Intent(this, GameActivity.class);
                    startActivity(i);
                    finish();
                }
                else{
                    Intent i = new Intent(this, EndGameActivity.class);
                    startActivity(i);
                    finish();
                }
                break;
        }
    }
    public Question generateImage(){
        Random generator = new Random();
        int previous = currentGame.getPreviousQuestion();
        boolean gameOver = false;
        do{
            int generate = generator.nextInt(16);
            if(previous == generate){
                while(generate == previous){
                    generate = generator.nextInt(16);
                }
            }
            ImageView image = (ImageView) findViewById(R.id.person);
            image.setImageResource(currentGame.questions.get(generate).getPicture());
            previous = generate;
        }
        while(!gameOver);
        return currentGame.questions.get(previous);
    }


}


