package edu.uph.SIAK.model;

import java.util.ArrayList;

public class jadwalkuliah {
    ArrayList<Mahasiswa> Mahasiswa = new ArrayList<Mahasiswa>();
    ArrayList<Dosen> Dosen = new ArrayList<Dosen>();
    matakuliah Matakuliah;
    ruangkelas ruangkelas;

    public jadwalkuliah() {


    }
        
    public jadwalkuliah(ArrayList<Mahasiswa> Mahasiswa,ArrayList<Dosen> Dosen, matakuliah matakuliah, ruangkelas ruangkelas ) {
        this.Mahasiswa = Mahasiswa;
        this.Dosen = Dosen;
        this.Matakuliah = Matakuliah;
        this.ruangkelas = ruangkelas;

    }


    public ArrayList<Mahasiswa> getMahasiswa() {
        return this.Mahasiswa;
    }

    public void setMahasiswa(ArrayList<Mahasiswa> Mahasiswa) {
        this.Mahasiswa = Mahasiswa;
    }

    public ArrayList<Dosen> getDosen(){
        return this.Dosen;
    }

    public void setDosen(ArrayList<Dosen> Dosen) {
        this.Dosen = Dosen;
    }

    public matakuliah getMatakuliah() {
        return this.Matakuliah;
    }

    public void setMatakuliah(matakuliah Matakuliah) {
        this.Matakuliah = Matakuliah;
    }



    public void tambahMahasiswa(Mahasiswa mhs){
        Mahasiswa.add(mhs);
    }
    
    public void tambahDosen(Dosen dsn){
        Dosen.add(dsn);

    }

    public void setRuangan(ruangkelas Ruangkelas) {
        this.ruangkelas = ruangkelas;
    }

    public ruangkelas getruangkelas() {
        return this.ruangkelas;
    }

    public void tampilkanJadwalKuliah(){
        System.out.println("Jadwal Kuliah \n");
        System.out.println("Nama Matakuliah : ");
        System.out.println(Matakuliah.toString());
        System.out.println("");

        System.out.println("Dosen ");
        System.out.println("Kelas ");
        
        System.out.println("Ruang kelas \n");
        System.out.println(ruangkelas.toString());

        System.out.println("Daftar Mahasiswa ");
        System.out.println("Nama \t\t\t StudentID \t\t Jenis Kelamin ");
        for(Mahasiswa mhs : Mahasiswa){
            System.out.println(mhs.toString());
        }
        for(Dosen dsn : Dosen){
            System.out.println(dsn.toString());
        }
        }



        @Override
        public String toString() {
            return "{" +
                " Mahasiswa='" + getMahasiswa() + "'" +
                " Dosen='" + getDosen() + "'" +
                " Matakuliah='" + getMatakuliah() ;
        }
    }






