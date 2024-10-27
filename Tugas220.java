import java.util.Scanner;

/**
 * Tugas220
 */
public class Tugas220 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String namaAtlet;

        while (true) {
            System.out.println("--------------------------------------------------------");  
            System.out.println("Selamat Datang di Porseni Politeknik Negeri Malang 2024!");
            System.out.println("--------------------------------------------------------");

            System.out.print("Maukkan nama POLITEKNIK (Ketik 'exit' untuk selesai) = ");
            String namaPOLTEK = sc.nextLine();

            if (namaPOLTEK.equalsIgnoreCase("exit")){
                System.out.println("Terima kasih telah menggunakan program ini!");
                break;
            }
            System.out.println("Nama Atlet " +namaPOLTEK+ " cabor badminton ");
            for (int i = 1; i <= 5; i++) {
                System.out.print("Nama Atlet ke-" +i + "=");
                namaAtlet = sc.nextLine();
            }
            System.out.println();

            System.out.println("Nama Atlet " + namaPOLTEK + " cabor tenis meja ");
            for (int i = 1; i <= 5; i++) {
                System.out.print("Nama Atlet ke-" +i + "=");
                namaAtlet = sc.nextLine();
            }

            System.out.println();

            System.out.println("Nama Atlet " + namaPOLTEK + " cabor bola basket ");
            for (int i = 1; i <= 5; i++) {
                System.out.print("Nama Atlet ke-" +i + "=");
                namaAtlet = sc.nextLine();
        }

        System.out.println();

        System.out.println("Nama Atlet " + namaPOLTEK + " cabor bola voly ");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Nama Atlet ke-" +i + "=");
            namaAtlet = sc.nextLine();
        }

        System.out.println();
    }
  }
}