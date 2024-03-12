package week2.day4;

public class Calc_Static_Poly {
	

	public static void main(String[] args) {
		Calc_Static_Poly calc =  new Calc_Static_Poly();
		calc.add(5, 10);	
		calc.add(5, 10, 15); // this will call int method based on interger datatype
		calc.add(1, 2);
		calc.add(1.6f, 00f); /// it will take float method// methods will be run based on integer type
	}
  // added two integers here
	public void add(int a,int b) {
		int c= a+b;
		System.out.println("addition of two  number is:" +a+  "and"  +b+  "is"  + c);		
	}
	 //it will not allow another two integers for addition since already we have used here, 
	//either no.arg or type of arg should be different
	
	//it taken since we have three integers here 
	public void add(int a,int b, int c) {
		int d= a+b+c;
		System.out.println("addition of two  number is:" +a +"and"  +b +"and"  +c +"is"  +d);		
	}
	
	//here it takes float since its not used anywhere above
	public void add(float a,float b) {
		float c= a+b;
		System.out.println("addition of two  number is:" +a +"and"  +b +"is"  +c);		
	}
	
	public void add(byte a,byte b) {
		System.out.println("addition of two  number is:" +a+  "and" +b);		
	}
}
