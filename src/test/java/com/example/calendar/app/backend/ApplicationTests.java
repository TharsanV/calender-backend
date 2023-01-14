package com.example.calendar.app.backend;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.example.calendar.app.backend.dynamodb.model.TimeSlotDynamo;
import jdk.jshell.EvalException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

@SpringBootTest
class ApplicationTests {

	@Autowired
	DynamoDBMapper dynamoDBMapper;

	@Test
	void contextLoads() {
		TimeSlotDynamo timeSlot = new TimeSlotDynamo();
		timeSlot.setEndDate(new Date());
		timeSlot.setStartDate(new Date());
		timeSlot.setId(UUID.randomUUID().toString());
		timeSlot.setParticipantId(UUID.randomUUID().toString());

		dynamoDBMapper.save(timeSlot);
	}

	@Test
	void rom() {
		TimeSlotDynamo timeSlot = new TimeSlotDynamo();
		timeSlot.setEndDate(new Date());
		timeSlot.setStartDate(new Date());
		timeSlot.setId(UUID.randomUUID().toString());
		timeSlot.setParticipantId(UUID.randomUUID().toString());

		dynamoDBMapper.save(timeSlot);
	}

	public int romanToInt(String s) {
		int sum = 0;
		for (int i = 0;i < s.length();i ++) {
			boolean hasNext = i < s.length() - 1;

			if (s.charAt(i) == 'I'){
				if (hasNext && s.charAt(i + 1) == 'V'){
					sum += 4;
					i = 1 + 1;
				} else if (hasNext && s.charAt(i + 1) == 'X'){
					sum += 9;
					i = 1 + 1;
				} else {
					sum += 1;
				}

			} else if (s.charAt(i) == 'V'){
				sum += 5;
			} else if (s.charAt(i) == 'X'){
				if (hasNext && s.charAt(i + 1) == 'L'){
					sum += 40;
					i = 1 + 1;
				} else if (hasNext && s.charAt(i + 1) == 'C'){
					sum += 90;
					i = 1 + 1;
				} else {
					sum += 10;
				}
			} else if (s.charAt(i) == 'L'){
				sum += 50;
			}else if (s.charAt(i) == 'C'){
				if (hasNext && s.charAt(i + 1) == 'D'){
					sum += 400;
					i = 1 + 1;
				} else if (hasNext && s.charAt(i + 1) == 'M'){
					sum += 900;
					i = 1 + 1;
				} else {
					sum += 100;
				}
			}else if (s.charAt(i) == 'D'){
				sum += 500;
			}else if (s.charAt(i) == 'C'){
				sum += 1000;
			}
		}
		return sum;
	}

	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode() {}
	 *     ListNode(int val) { this.val = val; }
	 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 * }
	 */
	@Test
	public String longestPalindrome(String s) {
		String longestPalindrome = String.valueOf(s.charAt(0));
		for (int i = 0;i < s.length();i++){
			//get longest palindrome by expanding around i
			int maxExpand = Math.min(i - 0, s.length() - i - 1);
			int currMax = 0;
			int j = 0;
			for (j = 0;j < maxExpand;j++){
				if (s.charAt(i - j) != s.charAt(i + j)){
					break;
				}
				currMax++;
			}
			if (currMax > longestPalindrome.length()){
				longestPalindrome = s.substring(i - j + 1, i + j);
			}
		}
		Arrays.asList(new int[]{1,2});

		return longestPalindrome;
	}

	public int heightChecker(int[] heights) {
		int expected[] = new int[heights.length];
		Arrays.fill(expected, 200);
		for (int i = 0; i < heights.length; i++){
			if (heights[i] > expected[heights.length - 1]){
				continue;
			}
			int j = heights.length - 1;
			while(j >= 0 && heights[i] < expected[j]){
				if (j != heights.length - 1){
					expected[j + 1] = expected[j];
				}
				if (j = 0) {
					j = j - 1;
				}
			}
			expected[j] = heights[i];
		}

		Set<Character> sdf = new HashSet();
		Character c;
		c.isL
		sdf.cl()
		int countSame = 0;
		for (int i = 0;i < expected.length;i++){
			if (heights[i] == expected[i]) {
				countSame += 1;
			}
		}
		return  countSame;
	}

}
