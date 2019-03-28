package day2;

import java.util.Arrays;
import java.util.function.IntToDoubleFunction;

public class bigNumber2 {

	
	
	
	public static String solution(int[] numbers) {
        String answer = "";
        double[] result=new double[numbers.length];
        for(int i=0;i<numbers.length;i++) {
        	if(numbers[i]>=1000)result[i]=((double)numbers[i])/1000;
        	else if(numbers[i]>=100)result[i]=((double)numbers[i])/100;
        	else if(numbers[i]>=10)result[i]=((double)numbers[i])/10;
        	else result[i]=((double)numbers[i]);
        }
        for(int i=0;i<result.length;i++)
        	System.out.print(result[i]+" ");
        System.out.println();
        for(int i=result.length-1;i>0;i--) {
        	for(int j=0;j<i;j++) {
        		if(result[j]<result[j+1]) {
        			double temp1=result[j];
        			result[j]=result[j+1];
        			result[j+1]=temp1;
        			int temp=numbers[j];
        			numbers[j]=numbers[j+1];
        			numbers[j+1]=temp;
        		}
        	}
        }
        for(int i=0;i<numbers.length;i++)
        	answer+=numbers[i]+"";
        return answer;
    }
	public static void main(String[] args) {
		int[] array= {3, 30, 34, 5, 9};
		System.out.println(solution(array));
	}
}
