package com.main;

public class MoodAnalyzer {

    String message;

    public MoodAnalyzer(String message) {
        this.message = message;
    }
    public MoodAnalyzer() {
        super();
    }
    //Check mood analyzer method
    public String analyzeMood(String message) {
        if (message.contains("sad")) {
            return "SAD";
        } else {
            return "HAPPY";
        }
    }
    //Generated main method displaying welcome message
    public static void main(String[] args) {
        System.out.println("Welcome to the mood analyzer exception handing!");
    }
}
