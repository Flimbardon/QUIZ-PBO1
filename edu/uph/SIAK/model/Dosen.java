package edu.uph.SIAK.model;

public class Dosen {
    String nama;
    boolean jenisKelamin;
    
    public Dosen(String nama, boolean jenisKelamin) {
        this.nama=nama;
        this.jenisKelamin = jenisKelamin;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public boolean isJenisKelamin() {
        return this.jenisKelamin;
    }

    public boolean getJenisKelamin() {
        return this.jenisKelamin;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    @Override
    public String toString() {
        return "" +
            " " + getNama() + "\t\t\t" +
            " " + (isJenisKelamin()==true ? "Wanita":"Pria") + "'" +
            "}";
    }
}