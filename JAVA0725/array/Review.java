package array;

public class Review {

	public static void main(String[] args) {

		
		int[] score = {80,100,50,90,77};
		String[] names = {"이순신", "우영우", "동그라미", "김희선", "김태희"};
		
		int total = 0;
		for(int i = 0; i < score.length; i++) {
			System.out.println(names[i] + " : " + score[i] + "점");
			total += score[i];
		}
		double avg = (double)total / score.length;
		System.out.println("-------------");
		System.out.println("총점 : " + total + "점");
		System.out.println("평균 : " + avg + "점");
		
		int max = 0;
		int min = 100;
		
		for(int i = 0; i < score.length; i++) {
			if(max < score[i]) {
				max = score[i];
			}
			if(min > score[i]) {
				min = score[i];
			}
		}
		System.out.println("최고점수 : " + max + "점");
		System.out.println("최저점수 : " + min + "점");
		
		
		
	}

}
