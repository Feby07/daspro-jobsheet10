import java.util.Scanner;

public class BioskopWithScannerSoal07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom;
        String nama;
        String[][] penonton = new String[4][2];
        int menuOption;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menuOption = sc.nextInt();
            sc.nextLine();

            switch (menuOption) {
                case 1:
                    System.out.print("Masukkan Nama: ");
                    nama = sc.nextLine();

                    while (true) {
                        System.out.print("Masukkan baris (1-4): ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom (1-2): ");
                        kolom = sc.nextInt();
                        sc.nextLine();

                        if (baris >= 1 && baris <= 4 && kolom >= 1 && kolom <= 2) {
                            if (penonton[baris - 1][kolom - 1] == null) {
                                penonton[baris - 1][kolom - 1] = nama;
                                System.out.println("Data berhasil disimpan.");
                                break;
                            } else {
                                System.out.println("Kursi sudah terisi. Silakan pilih kursi lain.");
                            }
                        } else {
                            System.out.println("Posisi kursi tidak valid. Silakan masukkan baris (1-4) dan kolom (1-2).");
                        }
                    }
                    break;

                case 2:
                    System.out.println("\nDaftar Penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] != null) {
                                System.out.println("Baris " + (i + 1) + " Kolom " + (j + 1) + ": " + penonton[i][j]);
                            } else {
                                System.out.println("Baris " + (i + 1) + " Kolom " + (j + 1) + ": ***");
                            }
                        }
                    }
                    break;

                case 3:
                    System.out.println("Program berakhir.");
                    sc.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }
    }
}