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
public class GeraiBekasi extends Gerai implements GeraiInterface{
    private final String NAMA_GERAI="Gerai Bekasi";
    private final int KODE_GERAI = 11;
    private String alamat="Jl. Harapan Indah Boulevard, Medan Satria, Kecamatan Medan Satria, Kota Bks, Jawa Barat 17132";
    private TipePengiriman[] jenisPengiriman;

    @Override
    public String getNAMA_GERAI() {
        return NAMA_GERAI;
    }

    public int getKODE_GERAI() {
        return KODE_GERAI;
    }

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
    
    public GeraiBekasi(TipePengiriman[] jenisPengiriman, String alamat) {
        super(alamat);
        this.jenisPengiriman = jenisPengiriman;
    }

    
}
