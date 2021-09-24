package Assigment;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n1 = 10;
		int n2 = 20;
		
		sum(n1,n2,30,40,50,60,70,80,90);
		
	}
	
	public static void sum(int a, int b, int...c) {
		int sumOfC = 0;
		int n = c.length;
		
		for(int i = 0; i<n; i++) {
			sumOfC = sumOfC + c[i];
			
		}
		int endResult = a + b + sumOfC;
		
		System.out.println(endResult);
		
		
	}

}
