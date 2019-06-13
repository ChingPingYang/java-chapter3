
public class SubString {   
	public static void main(String args[]) {
		
	//----------------------------------------------- function	
		String sub = new String("heee println makse new line. print doesn't make new line"); 
		System.out.print("The difference between print and println:  " );      
		System.out.println(sub.substring(5) );  
		
	//------------------------------------------------	In Use.
		String s1 = "Helloooo0000o";
		String substr = "";
		//-------------------------first num means the starting index(include), second num means the ending index(excluded).
		substr = s1.substring(1,5);
		System.out.println(substr);
	
	}
}
