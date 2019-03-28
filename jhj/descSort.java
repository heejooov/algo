package day2;

public class descSort {
	
	public static long solution(long n) {
	      long answer = 0;
	      String[] an=Long.toString(n).split("");
	      for(int i=an.length-1;i>=0;i--) {
	    	  for(int j=0;j<i;j++) {
	    		 
	    		  if(Long.parseLong(an[j])>Long.parseLong(an[j+1])) {
	    			  String temp=an[j];
	    			  an[j]=an[j+1];
	    			  an[j+1]=temp;
	    		  }
	    	  }
	      }
	      String str="";
	      for(int i=0;i<an.length;i++) {
	    	  str+=an[i];
	      }
	      answer=Long.valueOf(str);
	     
	      System.out.println(str);
	      return answer;
	  }
	public static void main(String[] args) {
		long answer= solution(11213);
	}
   
}
