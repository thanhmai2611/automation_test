import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class CodeJavaBrushUp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String is an object
		String m = "Mai";
		String m1 = "Mai";
		
//		New
		String s2 = new String ("Color");
		String s3 = new String ("Color");		
		
		String m2 = "My name is Mai";
		String[] introduce = m2.split("is");
		System.out.println(introduce[0]);
		System.out.println(introduce[1]);
		System.out.println(introduce[1].trim());
		for(int i = 0; i < m2.length(); i++)
		{
			
			System.out.println(m2.charAt(i));
		}
		System.out.println("***reverse***");
		
		for(int i = m2.length()-1;i >=0; i--)
		{
			
			System.out.println(m2.charAt(i));
		}
		
		

	}

}
