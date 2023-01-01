/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gerai;

import Tipe.TipePengiriman;

/**
 *
 * @author family
 */
public class GeraiTangerang extends Gerai implements GeraiInterface{
    private final String NAMA_GERAI="Gerai Tangerang";
    private final int KODE_GERAI=16;
    private String alamat="Jl. Boulevard Bintaro Jaya, Pd. Jaya, Kec. Pd. Aren, Kota Tangerang Selatan, Banten 15220";
    private TipePengiriman[] jenisPengiriman;

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public TipePengiriman[] getJenisPengiriman() {
        return jenisPengiriman;
    }

    public void setJenisPengiriman(TipePengiriman[] jenisPengiriman) {
        this.jenisPengiriman = jenisPengiriman;
    }

    public String getNAMA_GERAI() {
        return NAMA_GERAI;
    }

    public int getKODE_GERAI() {
        return KODE_GERAI;
    }
    
    public GeraiTangerang(TipePengiriman[] jenisPengiriman, String alamat) {
        super(alamat);
        this.jenisPengiriman = jenisPengiriman;
    }
}
