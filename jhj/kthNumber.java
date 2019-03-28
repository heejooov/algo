package day2;

public class kthNumber {
	public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i=0;i<commands.length;i++) {
        	answer[i]=sort(array,commands[i][0],commands[i][1])[commands[i][2]-1];
        	System.out.println(answer[i]);
        }
        return answer;
    }
	public static int[] sort(int[] array,int start,int end) {
		int[]result=new int[end-start+1];
		for(int i=start-1;i<end;i++)
			result[i-start+1]=array[i];
		//int now=0;
		//System.out.println("start: "+start+" end: "+end);
		for(int i=result.length-1;i>0;i--) {
			for(int j=0;j<i;j++) {
				if(result[j]>result[j+1]) {
					int temp=result[j];
					result[j]=result[j+1];
					result[j+1]=temp;
				}
			}
		}
//		for(int i=start-1;i<end;i++)
//			System.out.print(array[i]+" ");
//		for(int i=0;i<result.length;i++)
//			System.out.print(result[i]+" ");
//		System.out.println();
		return result;
	}
	
	public static void main(String[] args) {
		int[] array= {1, 5, 2, 6, 3, 7, 4};
		int[][] commands= {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int[] result=solution(array,commands);
		
		System.out.println(result);
	}
	
//	public int[] solution(int[] array, int[][] commands) {
//        int[] answer = new int[commands.length];
//
//        for(int i=0; i<commands.length; i++){
//            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
//            Arrays.sort(temp);
//            answer[i] = temp[commands[i][2]-1];
//        }
//
//        return answer;
//    }
}
