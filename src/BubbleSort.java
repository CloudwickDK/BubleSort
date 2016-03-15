import java.util.Random;


public class BubbleSort {
	
	//private static int integerArray[] = new int[]{5,9,6,45,150,3};
	
	public static void main(String[] args) {
		
		Random random = new Random();
		int [] array = new int[10000];
		int n = 0;
		while(n<10000){
			int randomInt = random.nextInt(Integer.MAX_VALUE);
			array[n] = randomInt;
			n++;
		}
		
		long sms = System.currentTimeMillis();
		bubbleSort(array);
		long ems = System.currentTimeMillis();
		long ms = ems - sms;
		
		System.out.println("Time: " + ms + " miliseconds");
			 
	}//main
	

	public static int[] bubbleSort(int[] intArray){
        
        int tmp = 0; //tmp array element
        long ops = 0;// num of operations
        
        for(int i=intArray.length; i > 0; i--){ //int i=0; i < integerArray.length; i++)
                for(int j=(intArray.length-i) ; j > 0 ; j--){ //int j=1; j < (integerArray.length-i); j++)
                     
                	ops++;
                	if(intArray[j-1] > intArray[j]){
                        tmp = intArray[j-1];
                        intArray[j-1] = intArray[j];
                        intArray[j] = tmp;
                }
                       
                }
        }
        System.out.println("Ops: " + ops);
        return intArray;

	}//bubbleSort
}
