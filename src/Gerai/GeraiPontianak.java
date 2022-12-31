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
public class GeraiPontianak implements PajakLuarJawa, GeraiInterface{
    private final String nama="Gerai Pontianak";
    private final String alamat="Jl. Pak Kasih, Tengah, Kec. Pontianak Kota, Kota Pontianak, Kalimantan Barat 78243";
    private TipePengiriman[] jenisPengiriman;
    
    public GeraiPontianak(TipePengiriman[] jenisPengiriman) {
        this.jenisPengiriman = jenisPengiriman;
    }

    @Override
    public String getNama() {
        return nama;
    }

    @Override
    public String getAlamat() {
        return alamat;
    }

    @Override
    public TipePengiriman[] getJenisPengiriman() {
        return jenisPengiriman;
    }

    public void setJenisPengiriman(TipePengiriman[] jenisPengiriman) {
        this.jenisPengiriman = jenisPengiriman;
    }

    @Override
    public int getHargaLuarJawa(int i) {
        return jenisPengiriman[i].getHarga()+4000;
    }
}
