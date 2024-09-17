package introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushup2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		a.add("Lina"); 
		a.add("Munoz");
		a.add("Garces");
		System.out.println(a);
		System.out.println(a.get(2));
		
		for (int i=0; i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		System.out.println("******************");
		for(String val:a)
		{
			System.out.println(val);
		}
		
		System.out.println(a.contains("Lina"));
		
		String[] name = {"Antonia", "Munoz" , "Garces"};
		List<String> myArrayList = Arrays.asList(name);
		System.out.println(myArrayList.get(0)); 
	}
}
