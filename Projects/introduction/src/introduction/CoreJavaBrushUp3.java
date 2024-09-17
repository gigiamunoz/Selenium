package introduction;

public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s = "Lina Virginia Munoz"; 
		String[] splittedString = s.split("Virginia");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1].trim());
		//System.out.println(splittedString[2]);
		
		for (int i=s.length()-1; i>=0;i--)
		{
			System.out.println(s.charAt(i));
		}
	}

}
