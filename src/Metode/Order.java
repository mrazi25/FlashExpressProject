/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metode;

/**
 *
 * @author family
 */
public class Order{
    private String resi;
    private Penerima penerima;
    private Pengirim pengirim;
    private Barang barang;
    private String asal, tujuan;
    private String tanggal, tipeService;
    private int harga;

    public Order(String resi, Penerima penerima, Pengirim pengirim, Barang barang, String asal, String tujuan, String tanggal, String tipeService, int harga) {
        this.resi = resi;
        this.penerima = penerima;
        this.pengirim = pengirim;
        this.barang = barang;
        this.asal = asal;
        this.tujuan = tujuan;
        this.tanggal = tanggal;
        this.tipeService = tipeService;
        this.harga = harga;
    }

    public Order(String asal, String tujuan, String tanggal) {
        this.asal = asal;
        this.tujuan = tujuan;
        this.tanggal = tanggal;
    }
    
    public Order(){}

    public String getAsal() {
        return asal;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }

    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    public String getResi() {
        return resi;
    }

    public void setResi(String resi) {
        this.resi = resi;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public Penerima getPenerima() {
        return penerima;
    }

    public void setPenerima(Penerima penerima) {
        this.penerima = penerima;
    }

    public Pengirim getPengirim() {
        return pengirim;
    }

    public void setPengirim(Pengirim pengirim) {
        this.pengirim = pengirim;
    }
    
    public String getTipeService() {
        return tipeService;
    }

    public void setTipeService(String tipeService) {
        this.tipeService = tipeService;
    }
    
    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public Barang getBarang() {
        return barang;
    }

    public void setBarang(Barang barang) {
        this.barang = barang;
    }
}
