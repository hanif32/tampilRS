public class tampilRS {
    public static void main(String[] args) {
        Rumah r = new Rumah();
        sekolah s = new sekolah();
        
        System.out.println("===DATA RUMAH===");
        r.tampillokasi();
        r.tampilukuran(10, 17);
        System.out.println("===DATA SEKOLAH===");
        s.tampilNama("SMK TELKOM SHANDY PUTRA MALANG");
        s.jumlahSiswa(36, 13); 
    }
    public void tampillokasi(){
        String Alamat ="Malang";
        System.out.println("lokasi rumah: " + Alamat);
    }
    public void tampilukuran(int panjang, int lebar){
        int luas = panjang*lebar;
        System.out.println("luas: "+ luas);
    }
    public void tampilNama(String nama){
        System.out.println("saya bersekolah di: "+ nama);
    }
    public void jumlahSiswa(int rombel, int jumlahSiswa){
        int total= rombel*jumlahSiswa;
        System.out.println("jumlah siswa: " + total);
    }
}
