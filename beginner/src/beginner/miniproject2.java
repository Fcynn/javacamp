package beginner;

public class miniproject2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char harf ='E';
		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kalın sesli harf") ;
			break;
		case 'E':
		case 'İ':
		case 'Ö':
		case 'Ü':
			System.out.println("İnce sesli harf") ;
			break;
		default:
			System.out.println("hatalı");

	}

}
}