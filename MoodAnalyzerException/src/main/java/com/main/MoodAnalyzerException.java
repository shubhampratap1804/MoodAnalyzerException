package com.main;

//Custom exception class inheriting Exception class from jana.lang package
public class MoodAnalyzerException extends Exception{
    public MoodAnalyzerException(String message) {
        super(message);
    }
}
