package while_;

public class Ex_r {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1;
		while(i < 10) {
			System.out.println(i + "안녕하세요.");
			i++;
		}
		System.out.println("=================");
		
		i = 1;
		while(i < 11) {
			System.out.println(i + " ");
			i++;
		}
		System.out.println("=================");
		
		i = 2;
		while(i <= 10) {
			if(i % 2 == 0) {
				System.out.println(i + " ");
			}
			i++;
		}
		System.out.println("=================");
		
		i = 10;
		while(i > 0) {
			System.out.println(i + " ");
			i--;
		}
		
		i = 1;
		while(i < 60) {
			System.out.println("i = " + 1);
			int j = 1;
			while(j < 60) {
				System.out.println("------j = " + j);
				j++;
			}
			i++;
		}
		
	}

}
