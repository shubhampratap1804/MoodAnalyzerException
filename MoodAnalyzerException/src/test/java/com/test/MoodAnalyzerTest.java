package com.test;
import com.main.MoodAnalyzer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {

    @Test
    void whenMessageContains_Sad_ShouldReturnSad(){
        MoodAnalyzer myCurrentMood = new MoodAnalyzer();
        Assertions.assertEquals("SAD", myCurrentMood.analyzeMood("i am in sad mood"));
    }

    @Test
    void whenMessageContains_Happy_ShouldReturnHappy(){
        MoodAnalyzer myCurrentMood = new MoodAnalyzer();
        Assertions.assertEquals("HAPPY", myCurrentMood.analyzeMood("i am any mood"));
    }
}

