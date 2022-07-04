package calculatorProject;


public class CalcPro {

	public int add(int a,int b) {
		return a+b;
	}
	public int sub(int a,int b) {
		return a-b;
	}
	public int mult(int a,int b) {
		return a*b;
	}
	public int division(int a,int b) {
		return a/b;
	}
	
	public int mod(int a,int b) {
		return a%b;
	}

	public static void main(String[] args) {
		
		
		CalcPro cal=new CalcPro();
		
		System.out.println(cal.add(12, 6));
		System.out.println(cal.sub(18, 3));
		System.out.println(cal.mod(12, 5));
		
	}
}
