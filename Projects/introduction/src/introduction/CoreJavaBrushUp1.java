package introduction;

public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//VARIABLES
		int num = 5;
		String webside = "Lina Munoz Garces";
		char letter = 'r' ; 
		double dec = 5.99;
		boolean flag = true; 
		
		//System.out.println(dec + "Mi variable");
		
		//ARRAYs
		int[] arr = new int[5];
		arr[0] = 1; 
		arr[1] = 2; 
		arr[2] = 3; 
		arr[3] = 4; 
		arr[4] = 5; 
		
		int[] arr2 = {1,2,3,4,5,6};
		
		//FOR LOOP
		
		for(int i = 0; i<arr.length; i++)
		{
			
			System.out.println(arr[i]);
		}
		
		//ENHANCED FOR LOOP
		String[] name = {"rahul", "shetty", "Lina"};
		for (String s: name)
		{
			System.out.println(s);
		}
		}
	}
	

