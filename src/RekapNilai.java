import java.util.Scanner;

public class RekapNilai {

    static final int SELESAI = -1;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nilai;
        int nomor = 1;
        double total = 0;
        int nilaiSah = 0;

        do {
            System.out.print("Nilai ke-" + nomor + " : ");
            nilai = scanner.nextInt();

            if (nilai == SELESAI) {
                break;
            }

            if (nilai < 0 || nilai > 100) {
                System.out.println("  Ditolak - nilai harus 0..100");
                continue;
            }

            total += nilai;
            nilaiSah++;

            String grade;

            if (nilai >= 60) {
                grade = "D";
            } else if (nilai >= 70) {
                grade = "C";
            } else if (nilai >= 80) {
                grade = "B";
            } else if (nilai >= 90) {
                grade = "A";
            } else {
                grade = "E";
            }

            /* Jika Nilai Dan Grade di tukar dari nilai terendah ke bawah jadi nilai tertinggi maa hasilnya
ketika di run nilai 85 menjadi grade D - Kurang. Seharusnya untuk nilai 85 Grade B - Baik.
 */