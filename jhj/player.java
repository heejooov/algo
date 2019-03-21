package day1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class player {
	public String solution(String[] participant, String[] completion) {
		String answer = "";
		Queue<String> part=new LinkedList<String>();
		
		for(int i=0;i<participant.length;i++)
			part.offer(participant[i]);
		

		int cl=completion.length;
		for(int i=0;i<cl;i++) {
			String winner=completion[i];
			for(int j=0;j<cl-i+1;j++) {
				String now=part.poll();
				if(!winner.equals(now)){
					part.offer(now);
					
				}else {
					break;
				}
			}
		}
		answer=part.poll();

		return answer;
	}
}
