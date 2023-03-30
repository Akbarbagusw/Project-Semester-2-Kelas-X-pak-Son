public class Run {
    public static void main(String[] args) {
        Drone wk = new Drone();
        
        wk.energi = 90;
        wk.ketinggian = 5;
        wk.kecepatan = 60;
        wk.merek = "oppo";
        
        wk.terbang();
        wk.matikanMesin();
        wk.maju();
        wk.mundur();
        wk.turun();
        wk.belok();
    }
}
