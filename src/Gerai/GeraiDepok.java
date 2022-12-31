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
public class GeraiDepok extends Gerai implements GeraiInterface{
    private final String nama="Gerai Depok";
    private final String alamat="Jl. Raya Sawangan, Mampang, Kec. Pancoran Mas, Kota Depok, Jawa Barat 16436";
    private TipePengiriman[] jenisPengiriman;
    
    public GeraiDepok(TipePengiriman[] jenisPengiriman) {
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
