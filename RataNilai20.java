import java.util.Scanner;

/**
 * RataNilai20
 */
public class RataNilai20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, nilaiMhs;
        float nilai, totalNilai,rataNilai;

        i = 1;

        while (i <= 5) {
            totalNilai = 0;
            System.out.println(" Input Nilai Mahasiswa ke-" +i);
            for (j = 1; j <= 5; j++) {
                System.out.print(" Masukkan nilai ke-" +j + " : ");
                nilaiMhs = sc.nextInt();
                totalNilai += nilaiMhs;
            }
            rataNilai = totalNilai / 5;
            System.out.println("Rata-rata nilai Mahasiswa ke " +i + "adalah" +rataNilai);
            i++;
        }

    }
}