package beginner;

public class switch_blocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade='F';
		switch (grade) {
		case 'A':
			System.out.println("Mükemmel : Geçtiniz");
			
			break;
		case 'B':
			System.out.println("iyi : Geçtiniz");
			break;
		case 'C':
			System.out.println("Şartlı : Geçtiniz");
			break;
		case 'D':
			System.out.println("Kötü : Kaldınız");
			break;
		case 'F':
			System.out.println("Çok Kötü: Kaldınız");
			break;

		default:
			System.out.println("Hatalı Tuşlama");
			break;
		}

	}

}
