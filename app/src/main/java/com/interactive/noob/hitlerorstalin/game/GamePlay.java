package com.interactive.noob.hitlerorstalin.game;

import com.interactive.noob.hitlerorstalin.util.Question;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jack on 3/19/2015.
 */
public class GamePlay {
    private int right;
    public List<Question> questions = new ArrayList<Question>();
    private int previous = 0;

    public int getRight() {
        return right;
    }
    /**
     * @param right the right to set
     */
    public void setRight(int right) {
        this.right = right;
    }

    /**
     * @param questions the questions to set
     */
    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    /**
     * @param q the question to add
     */
    public void setPreviousQuestion(int q){
        previous = q;
    }
    public int getPreviousQuestion(){
        return previous;
    }
    public void addQuestions(Question q) {
        this.questions.add(q);
    }

    /**
     * @return the questions
     */
    public List<Question> getQuestions() {
        return questions;
    }

    /**
     * method to increment the number of correct answers this game
     */
    public void incrementRightAnswers(){
        right ++;
    }

    //checks if the answer matches the question
    public boolean checkRight(Question q, int num){
        return q.getClassification()==num;
    }



}
