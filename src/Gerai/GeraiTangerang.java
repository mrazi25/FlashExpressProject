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
    private final String nama="Gerai Tangerang";
    private final String alamat="Jl. Boulevard Bintaro Jaya, Pd. Jaya, Kec. Pd. Aren, Kota Tangerang Selatan, Banten 15220";
    private TipePengiriman[] jenisPengiriman;
    
    public GeraiTangerang(TipePengiriman[] jenisPengiriman) {
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
}
