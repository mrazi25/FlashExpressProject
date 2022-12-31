/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metode;

import Gerai.GeraiInterface;

/**
 *
 * @author family
 */
public class Penerima {
    private String nama;
    private GeraiInterface gerai;
    private String keterangan;
    private String kodePos;
    private String nomerTelepon;

    public Penerima() {
        
    }

    public Penerima(String nama, GeraiInterface gerai, String keterangan, String kodePos, String nomerTelepon) {
        this.nama = nama;
        this.gerai = gerai;
        this.keterangan = keterangan;
        this.kodePos = kodePos;
        this.nomerTelepon = nomerTelepon;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public GeraiInterface getGerai() {
        return gerai;
    }

    public void setGerai(GeraiInterface gerai) {
        this.gerai = gerai;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getKodePos() {
        return kodePos;
    }

    public void setKodePos(String kodePos) {
        this.kodePos = kodePos;
    }

    public String getNomerTelepon() {
        return nomerTelepon;
    }

    public void setNomerTelepon(String nomerTelepon) {
        this.nomerTelepon = nomerTelepon;
    }
    
    
}
