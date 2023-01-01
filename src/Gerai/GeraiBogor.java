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
public class GeraiBogor extends Gerai implements GeraiInterface{
    private final String NAMA_GERAI="Gerai Bogor";
    private final int KODE_GERAI = 12;
    private String alamat="Jl. Babakan, Kec. Bogor Tengah, Kota Bogor, Jawa Barat 16128";
    private TipePengiriman[] jenisPengiriman;

    @Override
    public String getNAMA_GERAI() {
        return NAMA_GERAI;
    }

    public int getKODE_GERAI() {
        return KODE_GERAI;
    }

    @Override
    public String getAlamat() {
        return alamat;
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public TipePengiriman[] getJenisPengiriman() {
        return jenisPengiriman;
    }

    public void setJenisPengiriman(TipePengiriman[] jenisPengiriman) {
        this.jenisPengiriman = jenisPengiriman;
    }

    public GeraiBogor(TipePengiriman[] jenisPengiriman, String nama) {
        super(nama);
        this.jenisPengiriman = jenisPengiriman;
    } 
}
