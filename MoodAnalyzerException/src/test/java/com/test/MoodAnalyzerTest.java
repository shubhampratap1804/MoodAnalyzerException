package com.test;
import com.main.MoodAnalyzer;

public class MoodAnalyzerTest {

    //Generated main method displaying welcome message
    public static void main(String[] args){
        System.out.println("Welcome to the mood analyzer exception handing!");

        MoodAnalyzer myCurrentMood = new MoodAnalyzer();
        myCurrentMood.analyzeMood("i am sad");
    }
}
