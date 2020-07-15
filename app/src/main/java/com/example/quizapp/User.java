package com.example.quizapp;

public class User {
    private String mFirstName;

    public String getmFirstName() {
        return mFirstName;
    }

    public void setmFirstName(String mFirstName) {
        this.mFirstName = mFirstName;
    }

    public String toString(){
        return "User{"+"mFirstName='"+mFirstName+'\''+'}';
    }
}
