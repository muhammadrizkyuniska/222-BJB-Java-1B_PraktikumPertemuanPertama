package model;
public class Mahasiswa {
    private int id;
    private String NPM;
    private String nama;
    private double IPK;

//    method konstruktor pakai Parameter
    public Mahasiswa(int id, String NPM, String nama, double IPK) {
        this.id = id;
        this.NPM = NPM;
        this.nama = nama;
        this.IPK = IPK;
    }

    //method konstruktor tanpa parameter
    public Mahasiswa() {
    }
    
    
    public void mendaftarUlang(){
        System.out.println("Mhasiswa mandaftar ulang");
    }
    
    public void inputKRS(){
        System.out.println("Mahasiswa input KRS");
    }
    
    public void inputKRS( int jumlahSKS){
        System.out.println("Mahasiswa input SKS sebanayak:" +jumlahSKS+"SKS");
    }

    //method accessor/getter
    public int getId() {
        return id;
    }
    public String getNPM() {
        return NPM;
    }
    public String getNama() {
        return nama;
    }
    public double getIPK() {
        return IPK;
    }

    //method mutator/setter
    public void setId(int id) {
        this.id = id;
    }
    public void setNPM(String NPM) {
        this.NPM = NPM;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setIPK(double IPK) {
        this.IPK = IPK;
    }
    
    public void viewData(){
        System.out.println("============= View Data =============");
        System.out.println("ID \t:" +id);
        System.out.println("NPM \t:" +NPM);
        System.out.println("Nama \t:" +nama);
        System.out.println("IPK \t:" +IPK);
        System.out.println("============= View Data =============");
        System.out.println("");
    }
    // Latihan 1.2
    public void inputKRS( float IPSemester){
        System.out.println("Mahasiswa input IP Semester sebanayak:" +IPSemester+"IP Semester");
    }
    public void inputKRS( String namaMahasiswa){
        System.out.println("Masukkan Nama Mahasisa: " +namaMahasiswa);
    }
    public void inputKRS(String namaDosenPembimbing, String NIP){
        System.out.println("Masukkan NIP Dosen Pembimbing: " +NIP );
        System.out.println("Masukkan Nama Dosen Pembimbing: " +namaDosenPembimbing);
    }
    public void inputKRS( int jumlahSKS, float IPSemester){
        System.out.println("Mahasiswa input SKS sebanayak:" +jumlahSKS+"SKS Dan IP Semester" + IPSemester );
    }
    public void inputKRS(float IPK ,int jumlahSKS){
        System.out.println("Mahasiswa input SKS sebanayak:" +jumlahSKS+"SKS dan IPK" +IPK);
    }
    
}
