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
public class GeraiBekasi {
    private final String nama="Gerai Bekasi";
    private final String alamat="Jl. Harapan Indah Boulevard, Medan Satria, Kecamatan Medan Satria, Kota Bks, Jawa Barat 17132";
    private TipePengiriman[] jenisPengiriman;
    
    public GeraiBekasi(TipePengiriman[] jenisPengiriman) {
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
