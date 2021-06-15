import edu.uph.SIAK.model.jadwalkuliah;
import edu.uph.SIAK.model.Mahasiswa;
import edu.uph.SIAK.model.Dosen;
import edu.uph.SIAK.model.ruangkelas;
public class App {
    public static void main(String[] args) throws Exception {
        Mahasiswa mhs1 = new Mahasiswa("Calvin", "01210121",false);
        Mahasiswa mhs2 = new Mahasiswa("SriRahayu", "01210121",true);
        Mahasiswa mhs3 = new Mahasiswa("Elvia", "01210121",true);

        Dosen dsn1 = new Dosen("Upin", false);

        ruangkelas ruang = new ruangkelas("Zoom");

        jadwalkuliah JadwalKuliah = new jadwalkuliah();
        JadwalKuliah.();
        JadwalKuliah.();
        JadwalKuliah.;
        JadwalKuliah.

        JadwalKuliah.tampilkanJadwalKuliah();
        System.out.println();

    }
}