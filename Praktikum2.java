package praktikum2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Praktikum2 {

    String pilih;
    ArrayList<praktikum1> dian = new ArrayList<praktikum1>();
    Scanner mnl = new Scanner(System.in);
    praktikum1 yanti = new praktikum1();

    public static void main(String[] args) {
        Praktikum2 kopi = new Praktikum2();
        kopi.menu();
    }

    void menu() {
        int pilihan;
        System.out.println("-----------------------");
        System.out.println("====Selamat Datang====");
        System.out.println("1.Jenis-Jenis Kopi");
        System.out.println("2.Harga Menu Kopi");
        System.out.println("3. EXIT");
        System.out.println("======");
        System.out.println("Pilih Menu");
        pilihan = mnl.nextInt();
        switch (pilihan) {
            case 1:
                macamkopi();
                break;
            case 2:
                topingkopi();
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("Pilihan Anda Tersedia");
                break;
        }
    }

    void macamkopi() {

        praktikum1 satu = new praktikum1();
        satu.Asal_Kopi = ("Arabica");
        satu.Jenis_Kopi = ("Timur Tengah");
        dian.add(satu);

        praktikum1 dua = new praktikum1();
        dua.Asal_Kopi = ("Robusta");
        dua.Jenis_Kopi = ("Eropa");
        dian.add(dua);

        praktikum1 tiga = new praktikum1();
        tiga.Asal_Kopi = ("Kopi Flores");
        tiga.Jenis_Kopi = ("Asia");
        dian.add(tiga);

        for (int i = 0; i < dian.size(); i++) {
            int j = i + 1;
            System.out.println("\nMenu kopi" + j + " : " + dian.get(i).getNama_Kopi() + "berasal dari" + dian.get(i).getAsal_Kopi());
        }
        System.out.println("\nPilih Menu Kopi");
        pilih = mnl.next();
        switch (pilih) {
            case "1":
                System.out.println("\nPesanan Anda adalah Kopi" + dian.get(0).getNama_Kopi() + "berasal dari " + dian.get(0).getAsal_Kopi());
                lanjut();
                break;
            case "2":
                System.out.println("\nPesanan Anda adalah Kopi" + dian.get(1).getNama_Kopi() + "berasal dari " + dian.get(1).getAsal_Kopi());
                lanjut();
                break;
            case "3":
                System.out.println("\nPesanan Anda adalah Kopi" + dian.get(2).getNama_Kopi() + "berasal dari " + dian.get(2).getAsal_Kopi());
                lanjut();
                break;
            case "4":
                System.out.println("Kembali Ke Awal");
                menu();
        }
    }


    void topingkopi() {
        try{
            
            praktikum1 one = new praktikum1();
            one.Asal_Kopi= ("Susu");
            dian.add(one);

            praktikum1 two = new praktikum1();
            two.Asal_Kopi = ("seres");
            dian.add(two);

            praktikum1 three = new praktikum1();
            three.Asal_Kopi = ("Blubery");
            dian.add(three);
            
        for (int i = 0; i < dian.size(); i++) {
            int j = 1 + 1;
            System.out.println("Menu Kopi" + j + " " + dian.get(i).getToping());
            }
            System.out.println("\nPilih Menu Toping : ");
            pilih = mnl.next();
            switch(pilih){
                case"4":
                    System.out.println("\nPesanan Anda adalah Topping" + dian.get(3).getToping());
                    break;
                case"5":
                    System.out.println("\nPesanan Anda adalah Topping" + dian.get(4).getToping());
                    break;
                case"6":
                    System.out.println("\nPesanan Anda adalah Topping" + dian.get(5).getToping());
                    break;
            }
        } catch (InputMismatchException e){
            System.out.println("e");
            System.out.println("Mohon Maaf,Pilihan Anda Salah");
        }
    }
    
    void lanjut(){
                System.out.println("\nIngin Melanjutkan? (ya/tidak)");
                String pilih = new Scanner (System.in).nextLine();
                switch (pilih){
                    case "ya":
                       topingkopi();
                        break;
                    case"tidak":
                        System.out.println("===TERIMAKASIH");
           
                }
            }
        }
    
