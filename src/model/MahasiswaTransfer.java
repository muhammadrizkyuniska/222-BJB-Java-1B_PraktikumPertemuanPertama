package model;
public class MahasiswaTransfer extends Mahasiswa {
    private double IPKSebelumnya;

    //Inheritance/Pewarisan
    public double getIPKSebelumnya() {
        return IPKSebelumnya;
    }

    public void setIPKSebelumnya(double IPKSebelumnya) {
        this.IPKSebelumnya = IPKSebelumnya;
    }
    
    public void inputKRS(){
        System.out.println("Mahasiswa input KRS dari Class MahasiswaTransfer");
    }
    
}
