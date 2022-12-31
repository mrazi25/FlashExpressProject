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
public class GeraiJakarta extends Gerai implements GeraiInterface{
    private final String nama="Gerai Jakarta";
    private final String alamat="Jl. Pegangsaan Barat, Menteng, Kec. Menteng, Kota Jakarta Pusat, Daerah Khusus Ibukota Jakarta 10310";
    private TipePengiriman[] jenisPengiriman;
    
    public GeraiJakarta(TipePengiriman[] jenisPengiriman) {
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
