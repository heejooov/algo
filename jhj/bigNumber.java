package day2;

import java.util.Arrays;
import java.util.Comparator;

public class bigNumber {

	
	public static String solution(int[] numbers) {
        String answer = "";
        String[] array=new String[numbers.length];
        for(int i=0;i<numbers.length;i++) {
        	array[i]=numbers[i]+"";
        }
        Arrays.sort(array,new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return (o2 + o1).compareTo(o1 + o2);
			}
		});
        StringBuilder sb=new StringBuilder();
        if(array[0].equals("0"))
        	return "0";
        
        for(int i=0;i<array.length;i++)
        	sb.append(array[i]);
        
        return sb.toString();
    }



	
	
	public static void main(String[] args) {
		int[] array= {3, 30, 34, 5, 9};
		System.out.println(solution(array));
	}
}
