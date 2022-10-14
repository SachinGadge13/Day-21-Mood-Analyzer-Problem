package com.bridgelabz.MoodAnalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    @Test
    public void given_NullMood_Should_Throw_MoodAnalysisException() {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer(null);
        String mood;
        try {
            mood = moodAnalyser.analyseMood();
        } catch (MoodAnalysisException e) {
            Assert.assertEquals(MoodAnalysisException.Exception_Type.NULL,e.type);
        }
    }
}