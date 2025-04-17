import java.util.*;

class Tidur {
    static public void tidur() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Terjadi kesalahan saat menunggu.");
        }
    }
}

public class main {
    static Scanner scanner = new Scanner(System.in);
    static String[][] anggota = {
            {"Adam Wahyu H", "202359201009"},
            {"Plorentina Fidelis P", "202359201005"},
            {"Nathan Alvino F", "20235920100"}
    };

    public static void main(String[] args) {
        while (true) {
            System.out.println(Ui.garisDua);
            System.out.println("Selamat Datang di Tugas Kelompok 1 ke 2");
            System.out.println("============   Menu  ===============");
            System.out.println("1. Program Antrian FIFO");
            System.out.println("2. Program Antrian LIFO");
            System.out.println("3. Searching & Sorting (belum diisi)");
            System.out.println(Ui.garis);
            System.out.println("Ketik \"daftar\" untuk melihat daftar anggota.");
            System.out.println("Ketik \"info\" untuk link Repo Github.");
            System.out.println("Ketik \"exit\" untuk keluar.");
            System.out.print(": ");
            String optIn = scanner.nextLine();

            if (optIn.equalsIgnoreCase("exit")) {
                System.out.println("Bye!");
                scanner.close();
                break;
            } else if (optIn.equalsIgnoreCase("daftar")) {
                int no = 1;
                System.out.println(Ui.garis);
                System.out.print("========== Nama Nama Anggota ============\n");
                for (int y = 0; y < anggota.length; y++) {
                    System.out.print(no + ". ");
                    for (int z = 0; z < anggota[y].length; z++) {
                        System.out.print(anggota[y][z] + " ");
                    }
                    System.out.println();
                    no++;
                }
                Tidur.tidur();
                continue;
            } else if (optIn.equalsIgnoreCase("info")) {
                System.out.println(Ui.garis);
                System.out.print("Tugas sudah saya Upload di: \nhttps://github.com/adamwahyuh/tugas-kelompok-1-java-ke2\n");
                System.out.println(Ui.garis);
                System.out.println("Kembali ke Main Menu...");
                Tidur.tidur();
                continue;
            }

            if (optIn.equals("1")) {
                AntrianFIFO.main(null);
            } else if (optIn.equals("2")) {
                AntrianLIFO.main(null);
            } else if (optIn.equals("3")) {
                SearchingSorting.main(null);
            } else {
                System.out.println("Ngarang aja, itu ada di menu pilih!");
                Tidur.tidur();
            }
        }
    }
}

class Ui {
    static String garis = "-----------------------------------";
    static String garisDua = "====================================";
}

class AntrianFIFO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> queue = new LinkedList<>();

        while (true) {
            System.out.println(Ui.garis);
            System.out.println("Antrian FIFO");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Proses Antrian");
            System.out.println("3. Lihat Antrian");
            System.out.println("Ketik 'exit' untuk kembali ke menu utama.");
            System.out.print("Pilih: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Kembali ke Main Menu...");
                Tidur.tidur();
                break;
            }

            switch (input) {
                case "1":
                    System.out.print("Masukkan nama ke antrian: ");
                    String nama = scanner.nextLine();
                    queue.add(nama);
                    System.out.println(nama + " ditambahkan ke antrian.");
                    break;
                case "2":
                    if (!queue.isEmpty()) {
                        System.out.println("Memproses: " + queue.poll());
                    } else {
                        System.out.println("Antrian kosong.");
                    }
                    break;
                case "3":
                    System.out.println("Isi Antrian: " + queue);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}

class AntrianLIFO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> stack = new Stack<>();

        while (true) {
            System.out.println(Ui.garis);
            System.out.println("Antrian LIFO (Stack)");
            System.out.println("1. Tambah Data");
            System.out.println("2. Ambil Data");
            System.out.println("3. Lihat Stack");
            System.out.println("Ketik 'exit' untuk kembali ke menu utama.");
            System.out.print("Pilih: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Kembali ke Main Menu...");
                Tidur.tidur();
                break;
            }

            switch (input) {
                case "1":
                    System.out.print("Masukkan data ke stack: ");
                    String data = scanner.nextLine();
                    stack.push(data);
                    System.out.println(data + " ditambahkan ke stack.");
                    break;
                case "2":
                    if (!stack.isEmpty()) {
                        System.out.println("Mengambil: " + stack.pop());
                    } else {
                        System.out.println("Stack kosong.");
                    }
                    break;
                case "3":
                    System.out.println("Isi Stack: " + stack);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}

class SearchingSorting {
    public static void main(String[] args) {
        System.out.println("Fungsi Searching dan Sorting belum diisi.");
        Tidur.tidur();
    }
}
