/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metode;

/**
 *
 * @author family
 */
public class Barang {
    private String jenisBarang, nama;
    private int berat, nilaiBarang;

    public Barang(String jenisBarang, String nama, int berat) {
        this.jenisBarang = jenisBarang;
        this.nama = nama;
        this.berat = berat;
    }

    public String getJenisBarang() {
        return jenisBarang;
    }

    public void setJenisBarang(String jenisBarang) {
        this.jenisBarang = jenisBarang;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getBerat() {
        return berat;
    }

    public void setBerat(int berat) {
        this.berat = berat;
    }

    public int getNilaiBarang() {
        return nilaiBarang;
    }

    public void setNilaiBarang(int nilaiBarang) {
        this.nilaiBarang = nilaiBarang;
    }
}
