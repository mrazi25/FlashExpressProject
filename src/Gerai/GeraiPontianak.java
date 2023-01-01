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
public class GeraiPontianak extends Gerai implements PajakLuarJawa, GeraiInterface{
    private final String NAMA_GERAI="Gerai Pontianak";
    private final int KODE_GERAI=15;
    private String alamat="Jl. Pak Kasih, Tengah, Kec. Pontianak Kota, Kota Pontianak, Kalimantan Barat 78243";
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
    
    @Override
    public int getHargaLuarJawa(int i, int berat, int asuransi) {
        return jenisPengiriman[i].getHarga(berat, asuransi)+4000;
    }
    
    public GeraiPontianak(TipePengiriman[] jenisPengiriman, String alamat) {
        super(alamat);
        this.jenisPengiriman = jenisPengiriman;
    }
}
