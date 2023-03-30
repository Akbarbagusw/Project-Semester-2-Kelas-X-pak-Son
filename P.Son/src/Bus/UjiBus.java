
public class UjiBus {
    public static void main(String[] args) {
        //pembuatan object
        Bus busMini = new Bus();
        
        busMini.penumpang = 5;
        busMini.maxPenumpang = 5;
        busMini.cetak();
        
        busMini.penumpang += 7;
        busMini.cetak();
    }
}
