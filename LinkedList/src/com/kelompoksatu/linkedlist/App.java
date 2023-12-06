package com.kelompoksatu.linkedlist;
import java.util.LinkedList; 
import java.util.Scanner;

 
class Main {
    
    public static void main(String[] args) {
        LinkedList<Mahasiswa> mahasiswaList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampilkan Data");
            System.out.println("3. Hapus Data Pertama");
            System.out.println("4. Hapus Data Terakir");
            System.out.println("5. Tambah Data Pertama");
            System.out.println("6. Tambah Data Terakhir");
            System.out.println("7. Tambah Data diUrutan tertentu");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu (0-4): ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String newNama = scanner.nextLine();
                    System.out.print("Masukkan NIM mahasiswa: ");
                    String newNim = scanner.nextLine();
                    mahasiswaList.add(new Mahasiswa(newNama, newNim));
                    System.out.println("Data mahasiswa berhasil ditambahkan.");
                    break;
                case 2:
                    System.out.println("Linked List:");
                    System.out.println(mahasiswaList);
                    // for(Mahasiswa mahasiswa :mahasiswaList)
                    //      System.out.println(mahasiswa);
                       
                    System.out.println("Banyaknya Node =" + mahasiswaList.size());
                    
                    break;
                
                case 3:
                    mahasiswaList.removeFirst();
                    System.out.println("Menghapus data pertama");
                    break;
                case 4:
                    mahasiswaList.removeLast();
                    System.out.println("Menghapus data terakhir");
                    break;
                    
                case 5:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String newNama2 = scanner.nextLine();
                    System.out.print("Masukkan NIM mahasiswa: ");
                    String newNim2 = scanner.nextLine();
                    mahasiswaList.addFirst(new Mahasiswa(newNama2, newNim2));
                    System.out.println("Data mahasiswa berhasil ditambahkan.");
                    break;
                case 6:
                System.out.print("Masukkan nama mahasiswa: ");
                    String newNama3 = scanner.nextLine();
                    System.out.print("Masukkan NIM mahasiswa: ");
                    String newNim3 = scanner.nextLine();
                    mahasiswaList.addLast(new Mahasiswa(newNama3, newNim3));
                    System.out.println("Data mahasiswa berhasil ditambahkan.");
                    
                break;
            
            

                case 7:
                System.out.print("Masukkan nama mahasiswa: ");
                    String newNama4 = scanner.nextLine();
                    System.out.print("Masukkan NIM mahasiswa: ");
                    String newNim4 = scanner.nextLine();
                    System.out.print("Masukkan Lokasi Urutan: ");
                    Integer urutan = scanner.nextInt();
                    if(urutan<=mahasiswaList.size() || urutan <=0 ){
                    mahasiswaList.add(urutan,new Mahasiswa(newNama4, newNim4));
                    System.out.println("Data mahasiswa berhasil ditambahkan.");
                    }else{
                        System.out.println("Urutan Tidak Valid");
                    }
                    
                break;
                
                    
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
                    break;
            }

        } while (choice != 0);

        scanner.close();
    }
}
