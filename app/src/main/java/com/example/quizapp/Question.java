package com.example.quizapp;

import java.util.List;

public class Question {
    private String mQuestion;
    private List<String> mChoiceList;
    private int mAnswerIndex;

    public Question(String question, List<String> choiceList, int answerIndex) {
        this.setmQuestion(question);
        this.setmChoiceList(choiceList);
        this.setmAnswerIndex(answerIndex);
    }

    public String getmQuestion() {

        return mQuestion;
    }

    public void setmQuestion(String mQuestion) {

        this.mQuestion = mQuestion;
    }

    public List<String> getmChoiceList() {

        return mChoiceList;
    }

    public void setmChoiceList(List<String> mChoiceList) {

        this.mChoiceList = mChoiceList;
    }

    public int getmAnswerIndex() {
        return mAnswerIndex;
    }

    public void setmAnswerIndex(int mAnswerIndex) {
        this.mAnswerIndex = mAnswerIndex;
    }

    @Override
    public String toString() {
        return "Question{" +
                "mQuestion='" + mQuestion + '\'' +
                ", mChoiceList=" + mChoiceList +
                ", mAnswerIndex=" + mAnswerIndex +
                '}';
    }
}
