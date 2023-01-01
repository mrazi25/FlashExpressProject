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
    private final String NAMA_GERAI="Gerai Jakarta";
    private final int KODE_GERAI=14;
    private String alamat="Jl. Pegangsaan Barat, Menteng, Kec. Menteng, Kota Jakarta Pusat, Daerah Khusus Ibukota Jakarta 10310";
    private TipePengiriman[] jenisPengiriman;

    @Override
    public String getAlamat() {
        return alamat;
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    @Override
    public TipePengiriman[] getJenisPengiriman() {
        return jenisPengiriman;
    }

    public void setJenisPengiriman(TipePengiriman[] jenisPengiriman) {
        this.jenisPengiriman = jenisPengiriman;
    }

    @Override
    public String getNAMA_GERAI() {
        return NAMA_GERAI;
    }

    public int getKODE_GERAI() {
        return KODE_GERAI;
    }
    
    public GeraiJakarta(TipePengiriman[] jenisPengiriman, String alamat) {
        super(alamat);
        this.jenisPengiriman = jenisPengiriman;
    }
}
