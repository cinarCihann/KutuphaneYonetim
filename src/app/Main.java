package app;

import dao.KitapDAO;
import model.Kitap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        KitapDAO dao = new KitapDAO();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Kütüphane Yönetim Sistemi ---");
            System.out.println("1. Kitap Ekle");
            System.out.println("2. Kitap Sil");
            System.out.println("3. Kitap Ödünç Al");
            System.out.println("4. Kitap İade Et");
            System.out.println("5. Kitapları Listele");
            System.out.println("0. Çıkış");
            System.out.print("Seçim: ");

            int secim = scanner.nextInt();
            scanner.nextLine();

            switch (secim) {
                case 1:
                    System.out.print("Başlık: ");
                    String baslik = scanner.nextLine();
                    System.out.print("Yazar: ");
                    String yazar = scanner.nextLine();
                    dao.kitapEkle(baslik, yazar);
                    break;
                case 2:
                    System.out.print("Silinecek Kitap ID: ");
                    dao.kitapSil(scanner.nextInt());
                    break;
                case 3:
                    System.out.print("Ödünç alınacak Kitap ID: ");
                    dao.oduncAl(scanner.nextInt());
                    break;
                case 4:
                    System.out.print("İade edilecek Kitap ID: ");
                    dao.iadeEt(scanner.nextInt());
                    break;
                case 5:
                    dao.kitaplariListele().forEach(System.out::println);
                    break;
                case 0:
                    System.out.println("Çıkılıyor...");
                    return;
                default:
                    System.out.println("Geçersiz seçim!");
            }
        }
    }
}
