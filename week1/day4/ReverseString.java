package week1.day4;

public class ReverseString {

	public static void main(String[] args) {
		String companyname = "TestLeaf";
		char[] charArray = companyname.toCharArray();
		for (int i=charArray.length-1;i>=0;i--) 
			System.out.println(charArray[i]);
		{
			System.out.println("-----------------");
	    }
		for (int i=charArray.length-1;i>=0;i--)
		System.out.print(charArray[i]);
		
	}
		

}
