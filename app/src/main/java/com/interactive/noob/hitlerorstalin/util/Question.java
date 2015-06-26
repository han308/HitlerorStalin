package com.interactive.noob.hitlerorstalin.util;

/**
 * Created by Jack on 3/18/2015.
 */
public class Question {


    private int picture;
    private int classification;

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }
    public int getClassification() {
        return classification;
    }

    public void setClassification(int classification) {
        this.classification = classification;
    }
    public Question(int pic, int classification){
        picture = pic;
        this.classification = classification;

    }

}
