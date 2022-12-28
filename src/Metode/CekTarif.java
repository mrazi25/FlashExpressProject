/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metode;

/**
 *
 * @author family
 */
public class CekTarif {
    private String asal, tujuan;
    private int berat, nilaiAsuransi;
    private boolean asuransi;

    public CekTarif(String asal, String tujuan, int berat, boolean asuransi) {
        this.asal = asal;
        this.tujuan = tujuan;
        this.berat = berat;
        this.asuransi = asuransi;
    }

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

    public int getBerat() {
        return berat;
    }

    public void setBerat(int berat) {
        this.berat = berat;
    }

    public int getNilaiAsuransi() {
        return nilaiAsuransi;
    }

    public void setNilaiAsuransi(int nilaiAsuransi) {
        this.nilaiAsuransi = nilaiAsuransi;
    }

    public boolean isAsuransi() {
        return asuransi;
    }

    public void setAsuransi(boolean asuransi) {
        this.asuransi = asuransi;
    }
    
}
