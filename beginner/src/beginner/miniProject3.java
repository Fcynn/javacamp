package beginner;

public class miniProject3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 5;
		int total = 0;
		for (int i=1;i<number ;i++) {
			if (number%i==0) {
					total=total +i ;}
		}
		if (total== number) {
			System.out.println("Mükemel sayıdır");
		}
		else {
			System.out.println ("Mükemmel sayı değildir") ;

	}

}
}