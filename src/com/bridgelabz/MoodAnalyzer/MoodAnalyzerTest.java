package com.bridgelabz.MoodAnalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    @Test
    public void given_AnyMood_Should_Return_HAPPY() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.MoodAnalyzerr("I am In Any Mood");
        Assert.assertEquals("HAPPY", mood);

    }

}