package while_;

public class Test_r {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int dan = 2;
//		int i = 1;
//		System.out.println("<" + dan + "단 >");
//		while(i <= 9) {
//			System.out.println(dan + " * " + i + " = " + (dan*i));
//			i++;
//		}
		
		while(dan < 10) {
			System.out.println("<" + dan + "단 >");
			
			int i = 1;
			while(i < 10) {
				System.out.println(dan +" * " + i + " = " + (dan * i));
				i++;
			}
			System.out.println();
			dan++;
		
		}
		
		
		
		
	}

}
