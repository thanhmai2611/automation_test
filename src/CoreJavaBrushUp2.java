import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {1,2,3,4,5,11,22,322,12,212,222};
		
//		check if array has multiple of 2
		
		for (int i =0; i<arr1.length; i++)
		{
			if (arr1[i] % 2==0)
			{
			System.out.println(arr1[i]);
			break;
			}
			else 
			{
			System.out.println(arr1[i] + "la so le");	
			}
		}
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("red");
		a.add("pink");
		a.add("black");
		a.add("pace");
		System.out.println(a.get(2));
			
		for(int i = 0; i < a.size(); i ++)
		{
			System.out.println(a.get(i));
		}
		System.out.println("********");
		for(String val:a)
		{
			System.out.println(val);
		}
//		item is present in Arraylist
		System.out.println(a.contains("black"));
		
		String[] color = {"red","pink","black","white"};
		List<String> nameArrayList = Arrays.asList(color);
		
//		Create object of the class - object.method
	
	
	
	}
}
