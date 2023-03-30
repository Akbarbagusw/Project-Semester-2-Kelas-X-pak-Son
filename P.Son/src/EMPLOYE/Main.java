package EMPLOYE;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int nip;
        String nama;
        int jk;
        String jb;
        String status;
        int gaji = 0;
        int potongan = 0;
        int bonus = 0;
        int tunjangan = 0;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan NIP: ");
        nip = scan.nextInt();
        System.out.print("Masukkan Nama: ");
        nama = scan.next();
        System.out.print("Masukkan Jam Kerja: ");
        jk = scan.nextInt();
        System.out.print("Masukkan Jabatan: ");
        jb = scan.next();
        System.out.print("Masukkan Status: ");
        status = scan.next();
        
        switch(jb){
            case "Boss": gaji = 10000000;
            break;
            case "Manager": gaji = 8000000;
            break;
            case "CS": gaji = 5000000;
            break;
            case "Security": gaji = 5000000;
            break;
        }
        
        if(jk < 8){
            potongan = 100000 * (8 - jk);
        } else if(jk > 8) {
            bonus = 200000;
        } else {
             
        }
        
        switch(status){
            case "Menikah":
                tunjangan = 2000000;
            break;
            case "Belum Menikah":
                tunjangan = 0;
        }
        switch(jb){
            case "Boss": Bos bs = new Bos(nip, nama, jk, jb, status, gaji, potongan, bonus, tunjangan);
                         bs.info();
            break;
            case "Manager": Manager mn = new Manager(nip, nama, jk, jb, status, gaji, potongan, bonus, tunjangan);
                            mn.info();
            break;
            case "CS": CleaningService cs = new CleaningService(nip, nama, jk, jb, status, gaji, potongan, bonus, tunjangan);
                       cs.info();
            break;
            case "Security": Security sc = new Security(nip, nama, jk, jb, status, gaji, potongan, bonus, tunjangan);
                             sc.info();
            break;
        }
    }

}
