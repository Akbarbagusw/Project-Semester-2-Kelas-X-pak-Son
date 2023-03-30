package TokoOnline;
public class Main {
    public static void main(String[] args) {
        Barang barang = new Barang ();
        Karyawan karyawan = new Karyawan();
        Member member = new Member();
        Laporan laporan = new Laporan();
        Transaksi transaksi = new Transaksi();
        
        laporan.laporan(member);
        laporan.laporan(barang);
        laporan.laporan(transaksi, barang);
    }
}
