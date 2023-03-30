package EMPLOYE;

import java.util.Scanner;

public class Bos extends Employee{
    private int nip;
    
    public Bos(int nip, String nama, int jk, String jb, String status, int gaji, int potongan, int bonus, int tunjangan){
        super(nama, jk, jb, status, gaji, potongan, bonus, tunjangan);
        this.nip = nip;
    }
    public void info() {
        System.out.println("NIP: " +this.nip);
        super.info();
    }

}
