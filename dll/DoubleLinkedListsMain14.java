package dll;
import java.util.Scanner;
public class DoubleLinkedListsMain14 {
    public static void main(String[] args) {
        DoubleLinkedLists14 dll = new DoubleLinkedLists14();
        Scanner sc = new Scanner(System.in);
        int pilihan, index;
        String nim, nama, kelas;
        double ipk;
        do {
            System.out.println("\nDOUBLE LINKED LIST MENU");
            System.out.println("1. Tambah Data di Awal");
            System.out.println("2. Tambah Data di Akhir");
            System.out.println("3. Tambah Data di Indeks Tertentu");
            System.out.println("4. Hapus Data di Awal");
            System.out.println("5. Hapus Data di Akhir");
            System.out.println("6. Hapus Data di Indeks Tertentu");
            System.out.println("7. Hapus Data Setelah NIM Tertentu");
            System.out.println("8. Tampilkan Data Pertama");
            System.out.println("9. Tampilkan Data Terakhir");
            System.out.println("10. Tampilkan Data di Indeks Tertentu");
            System.out.println("11. Tampilkan Semua Data");
            System.out.println("12. Cari Data berdasarkan NIM");
            System.out.println("13. Sisipkan Data Setelah NIM Tertentu");
            System.out.println("14. Tampilkan Jumlah Data");
            System.out.println("0. Keluar");
            System.out.print("Pilihan Anda : ");
            pilihan = sc.nextInt();
            sc.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIM : ");
                    nim = sc.nextLine();
                    System.out.print("Masukkan Nama : ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan Kelas : ");
                    kelas = sc.nextLine();
                    System.out.print("Masukkan IPK : ");
                    ipk = sc.nextDouble();
                    dll.addFirst(new Mahasiswa14(nim, nama, kelas, ipk));
                    break;
                case 2:
                    System.out.print("Masukkan NIM : ");
                    nim = sc.nextLine();
                    System.out.print("Masukkan Nama : ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan Kelas : ");
                    kelas = sc.nextLine();
                    System.out.print("Masukkan IPK : ");
                    ipk = sc.nextDouble();
                    dll.addLast(new Mahasiswa14(nim, nama, kelas, ipk));
                    break;
                case 3:
                    System.out.print("Masukkan Indeks : ");
                    index = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Masukkan NIM : ");
                    nim = sc.nextLine();
                    System.out.print("Masukkan Nama : ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan Kelas : ");
                    kelas = sc.nextLine();
                    System.out.print("Masukkan IPK : ");
                    ipk = sc.nextDouble();
                    dll.add(index, new Mahasiswa14(nim, nama, kelas, ipk));
                    break;
                case 4:
                    dll.removeFirst();
                    break;
                case 5:
                    dll.removeLast();
                    break;
                case 6:
                    System.out.print("Masukkan Indeks yang akan dihapus : ");
                    index = sc.nextInt();
                    sc.nextLine();
                    dll.remove(index);
                    break;
                case 7:
                    System.out.print("Masukkan NIM untuk menghapus data setelahnya : ");
                    nim = sc.nextLine();
                    dll.removeAfter(nim);
                    break;
                case 8:
                    Mahasiswa14 first = dll.getFirst();
                    if (first != null) {
                        System.out.println("Data pertama : " + first);
                    }
                    break;
                case 9:
                    Mahasiswa14 last = dll.getLast();
                    if (last != null) {
                        System.out.println("Data terakhir  " + last);
                    }
                    break;
                case 10:
                    System.out.print("Masukkan Indeks : ");
                    index = sc.nextInt();
                    sc.nextLine();
                    Mahasiswa14 atIndex = dll.getIndex(index);
                    if (atIndex != null) {
                        System.out.println("Data pada indeks " + index + " : " + atIndex);
                    }
                    break;
                case 11:
                    dll.print();
                    break;
                case 12:
                    System.out.print("Masukkan NIM yang dicari : ");
                    nim = sc.nextLine();
                    dll.searchByNIM(nim);
                    break;
                case 13:
                    System.out.print("Masukkan NIM setelah data akan disisipkan  ");
                    nim = sc.nextLine();
                    System.out.print("Masukkan NIM : ");
                    String newNim = sc.nextLine();
                    System.out.print("Masukkan Nama : ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan Kelas : ");
                    kelas = sc.nextLine();
                    System.out.print("Masukkan IPK : ");
                    ipk = sc.nextDouble();
                    dll.insertAfter(nim, new Mahasiswa14(newNim, nama, kelas, ipk));
                    break;
                case 14:
                    System.out.println("Jumlah data dalam linked list : " + dll.size());
                    break;
                case 0:
                    System.out.println("Keluar dari program...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
    }
}