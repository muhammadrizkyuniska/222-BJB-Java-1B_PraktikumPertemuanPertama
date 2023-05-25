
package praktikumjava;
import model.Mahasiswa;
import model.Pegawai;
import model.MahasiswaTransfer;
public class Praktikumjava {
    public static void main(String[] args) {
//        System.out.println("Hello World");

        //dari class Mahasiswa
        Mahasiswa mahasiswa = new Mahasiswa();
        
        mahasiswa.setId(1);
        mahasiswa.setNPM("2110010134");
        mahasiswa.setNama("Muhammad Rizky");
        mahasiswa.setIPK(3.9);
        
        mahasiswa.viewData();
        
        Mahasiswa m1 = new Mahasiswa(2,"2110010134","Muhammad Rizky",4.0);
        
        m1.viewData();
        
        //dari class Pegawai
        Pegawai pegawai = new Pegawai();
        
        pegawai.setNIP(2110010134);
        pegawai.setNama("Muhammad Rizky");
        pegawai.setAlamat("Banjarbaru");
        
        pegawai.viewData();
        
        Pegawai P1 = new Pegawai(2110010134,"Muhammad Rizky","PasarLama");
        
        P1.viewData();
        
        //Dari Mahasiswa Transfer
        MahasiswaTransfer mt = new MahasiswaTransfer();
        mt.setId(3);
        mt.setNPM("2110010134");
        mt.setNama("Muhammad Rizky");
        mt.setIPK(3.9);
        mt.viewData();
        
        //Overriding
        mt.inputKRS();
    }
    
}
