package beginner;

public class strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mesaj= "Bugün hava çok güzel.";
		System.out.println(mesaj);
		System.out.println ("Eleman sayısı :" + mesaj.length());
		System.out.println("5. eleman: " +mesaj.charAt(4));
		System.out.println (mesaj.concat ("Yaşasın!")) ;
		System. out.println (mesaj .startsWith ("B") ) ;
		System. out.println (mesaj .endsWith("."));
		System.out.println (mesaj . indexOf ("av") ) ;
		System.out.println (mesaj . lastIndexOf("a" )) ;

	}

}
