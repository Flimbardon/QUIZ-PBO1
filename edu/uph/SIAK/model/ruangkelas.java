package edu.uph.SIAK.model;

public class ruangkelas {
    String ruangkelas;
    String jurusan;


    
    public ruangkelas(String ruangkelas, String jurusan) {
    this.ruangkelas = ruangkelas;
    this.jurusan = jurusan;
    
    }
    public String getruangkelas() {
        return this.ruangkelas;
    }

    public void setruangkelas(String nama) {
        this.ruangkelas = ruangkelas;
    }

    public String jurusan() {
        return this.jurusan;
    }

    public void jurusan(String jurusan) {
        this.jurusan = jurusan;
    }

        @Override
        public String toString() {
            return "" +
                "kelas = " + getruangkelas();
        }

}