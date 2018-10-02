import java.util.Scanner;


public class source_code_array_object {

	public static void main(String[] args) {
		//DEKLARASI VARIABEL
		Object[] animals= new Object[2];
		//INISIALISASI VALUE
		animals[0] = "unta";
		animals[1] = "kambing";
		//MENAMPILKAN HASIL
		System.out.println("jenis peliharaan saya : " + animals[0]);
		System.out.println("jenis peliharaan saya : " + animals[1]);
		//MENGAMBIL IMPUT DARI KEYBOARD
		Object[] animals1= new Object[2];
		Scanner keyboard = new Scanner(System.in);
		System.out.println("masukkan nama unta :");
		animals1[0] = keyboard.next();
		System.out.println("masukan nama kambing :");
		animals1[1] = keyboard.next();
		System.out.println("nama unta saya : " + animals1[0]);
		System.out.println("nama kambing saya : " + animals[1]);
	}

}
