package com.test;
import com.main.MoodAnalyzer;
import com.main.MoodAnalyzerException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {

    @Test
    void whenMessageContains_Sad_ShouldReturnSad(){
        MoodAnalyzer myCurrentMood = new MoodAnalyzer();
        try {
            Assertions.assertEquals("SAD", myCurrentMood.analyzeMood("i am in sad mood"));
        } catch (MoodAnalyzerException e) {
            e.printStackTrace();
        }
    }

    @Test
    void whenMessageContains_Happy_ShouldReturnHappy(){
        MoodAnalyzer myCurrentMood = new MoodAnalyzer();
        try {
            Assertions.assertEquals("HAPPY", myCurrentMood.analyzeMood("i am any mood"));
        } catch (MoodAnalyzerException e) {
            e.printStackTrace();
        }
    }

    @Test
    void whenNullMessageIsPassed_ExceptionHandling_ShouldReturnHappy(){
        MoodAnalyzer myCurrentMood = new MoodAnalyzer();
        try {
            Assertions.assertEquals("HAPPY",myCurrentMood.analyzeMood(""));
        } catch (MoodAnalyzerException e) {
            e.printStackTrace();
        }
    }
}

