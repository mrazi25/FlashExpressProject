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
public class GeraiDepok {
    private final String nama="Gerai Depok";
    private final String alamat="Jl. Raya Sawangan, Mampang, Kec. Pancoran Mas, Kota Depok, Jawa Barat 16436";
    private TipePengiriman[] jenisPengiriman;
    
    public GeraiDepok(TipePengiriman[] jenisPengiriman) {
        this.jenisPengiriman = jenisPengiriman;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public TipePengiriman[] getJenisPengiriman() {
        return jenisPengiriman;
    }

    public void setJenisPengiriman(TipePengiriman[] jenisPengiriman) {
        this.jenisPengiriman = jenisPengiriman;
    }
}
