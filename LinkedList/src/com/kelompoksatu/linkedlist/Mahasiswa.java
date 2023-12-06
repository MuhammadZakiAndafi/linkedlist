package com.kelompoksatu.linkedlist;

public class Mahasiswa {
    String nama;
    String nim;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }
    public String toString() {
        return "Nama: " + nama + " NIM: " + nim;
    }
}