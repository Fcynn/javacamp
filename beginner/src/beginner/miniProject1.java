package beginner;

public class miniProject1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=25;
		
		
		boolean isPrime= true;
		for (int i=2; i<number; i++) {
			if (number%i==0) {
				isPrime =false;}
		}
		if(isPrime) {
			System.out.println("sayı asaldır");
		}
		else {
			System.out.println("sayı asal değildir");
		}

	}

}
