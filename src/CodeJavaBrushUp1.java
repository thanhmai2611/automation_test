
public class CodeJavaBrushUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int myAge = 28;
		String MyName = "Thanh Mai";
		char mind = 't';
		double dec = 6.55;
		boolean sex = true;
		System.out.println("my age is "  + myAge);
		System.out.println(MyName);
		
//		Array
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		int[] arr1 = {1,2,3,4,5,11,22,322,12,212,222};
//		System.out.println(arr1[0]);
		
//		for loop arr.length - 5
//		for(int i = 0; i < arr.length;i++)
//		{
//			
//			System.out.println(arr[i]);
//			
//		}	
		for(int i =0; i < arr1.length; i++)
		{
			System.out.println(arr1[i]);
			
		}
		
		String[] color = {"red","pink","black","white"};	
		for(int i = 0; i< color.length; i++)
		{
			System.out.println(color[i]);
		}
				
		for (String s:color)
		{
			System.out.println(s);
		}
		

	}

}
