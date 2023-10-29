import java.util.Scanner;

public class DataMahasiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Data Mahasiswa: ");
        int jumlahData = scanner.nextInt();
        scanner.nextLine();

        int[] nomorMahasiswa = new int[jumlahData];
        String[] namaMahasiswa = new String[jumlahData];
        int[] nilaiMahasiswa = new int[jumlahData];

        int nilaiMinimum = 80;// Nilai Minimum

        for (int i = 0; i < jumlahData; i++) {
            System.out.println("________________________________");
            System.out.println("Mahasiswa Ke: " + (i + 1));
            System.out.print("Nama: ");
            namaMahasiswa[i] = scanner.nextLine();
            System.out.print("Nilai: ");
            nilaiMahasiswa[i] = scanner.nextInt();
            nomorMahasiswa[i] = i + 1;
            scanner.nextLine();
        }

        System.out.println("DAFTAR NILAI MAHASISWA");
        System.out.println("================================");
        System.out.println("No\tNama\tNilai\tStatus");
        int totalNilai = 0;
        for (int i = 0; i < jumlahData; i++) {
            System.out.println(nomorMahasiswa[i] + "\t" + namaMahasiswa[i] + "\t" + nilaiMahasiswa[i] + "\t"
                    + (nilaiMahasiswa[i] >= nilaiMinimum ? "Lulus" : "Tidak Lulus"));
            totalNilai += nilaiMahasiswa[i];
        }
        System.out.println("================================");
        System.out.println("Jumlah: " + (double) totalNilai);
        double rataRata = (double) totalNilai / jumlahData;
        System.out.println("Nilai Rata-rata: " + rataRata);
    }
}
