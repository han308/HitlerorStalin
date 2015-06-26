package com.interactive.noob.hitlerorstalin.game;

import android.app.Application;

import com.interactive.noob.hitlerorstalin.R;
import com.interactive.noob.hitlerorstalin.util.Question;

/**
 * Created by Jack on 6/8/2015.
 */
public class HitlerOrStalin extends Application {
    private GamePlay currentGame;

    /**
     *
     * @param currentGame the currentGame to set
     */
    public void setCurrentGame(GamePlay currentGame) {
        this.currentGame = currentGame;
    }

    public void loadImage(){
        currentGame.addQuestions(new Question(R.drawable.hitler1, 0));
        currentGame.addQuestions(new Question (R.drawable.hitler2, 0));
        currentGame.addQuestions(new Question (R.drawable.hitler3, 0));
        currentGame.addQuestions(new Question (R.drawable.hitler4, 0));
        currentGame.addQuestions(new Question (R.drawable.hitler5, 0));
        currentGame.addQuestions(new Question (R.drawable.hitler6, 0));
        currentGame.addQuestions(new Question (R.drawable.hitler7, 0));
        currentGame.addQuestions(new Question (R.drawable.hitler8, 0));
        currentGame.addQuestions(new Question (R.drawable.stalin1, 1));
        currentGame.addQuestions(new Question (R.drawable.stalin2, 1));
        currentGame.addQuestions(new Question (R.drawable.stalin3, 1));
        currentGame.addQuestions(new Question (R.drawable.stalin4, 1));
        currentGame.addQuestions(new Question (R.drawable.stalin5, 1));
        currentGame.addQuestions(new Question (R.drawable.stalin6, 1));
        currentGame.addQuestions(new Question (R.drawable.stalin7, 1));
        currentGame.addQuestions(new Question (R.drawable.stalin8, 1));
    }
    /**
     * @return the currentGame
     */
    public GamePlay getCurrentGame() {
        return currentGame;
    }
}
