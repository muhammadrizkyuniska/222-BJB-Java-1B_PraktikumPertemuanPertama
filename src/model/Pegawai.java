package model;
public class Pegawai {
    private int NIP;
    private String nama;
    private String alamat;

    //latihan 1.1
    public Pegawai() {
    }

    public Pegawai(int NIP, String nama, String alamat) {
        this.NIP = NIP;
        this.nama = nama;
        this.alamat = alamat;
    }

    public int getNIP() {
        return NIP;
    }

    public void setNIP(int NIP) {
        this.NIP = NIP;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public void viewData(){
        System.out.println("============= View Data Pegawai =============");
        System.out.println("NIP \t:" +NIP);
        System.out.println("Nama \t:" +nama);
        System.out.println("Alamat \t:" +alamat);
        System.out.println("============= View Data Pegawai =============");
        System.out.println("");
    }
    
    
}
