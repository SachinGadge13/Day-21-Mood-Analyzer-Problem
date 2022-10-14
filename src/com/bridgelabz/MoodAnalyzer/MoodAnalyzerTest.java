package com.bridgelabz.MoodAnalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
	@Test
	public void givenMessage_SadMood_Should_Return_Sad() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am In a Sad Mood");
		String mood = moodAnalyzer.analyseMood();
		// Asserting The Result As Boolean Type True Or False
		Assert.assertEquals("SAD", mood);

	}
}