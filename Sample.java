package p1;

public class Sample {


	public static void main(String[] args) {
		
		int a = 10, b = 5, c;
		c = a +b;
		System.out.println(c);
		test();
		Sample1.test4();
		Sample4.s = new Sample4();
		s.testing();
	}
	
 public static void test ()
      {

	 System.out.println("Level 2");
      }
 }

 class Sample4 {
	 public void testing() {
		 int m = 2, d = 2, q;
		 q = m*d;
		 System.out.println("multiply "+" " +q);
	 }
}
	 

	

