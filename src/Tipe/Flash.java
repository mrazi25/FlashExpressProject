/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tipe;

/**
 *
 * @author family
 */
public class Flash implements TipePengiriman{
    private final String nama="Flash";
    private final int harga = 8000;
    private int estimasi=3;

    @Override
    public String getNamaJenis() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }
    
    @Override
    public int getHarga(int berat) {
        if(berat<=10) return harga;
        else if(berat>10) return harga+5000;
        else return 0;
    }

    @Override
    public int getEstimasi() {
        return estimasi;
    }

    public void setEstimasi(int estimasi) {
        this.estimasi = estimasi;
    }
}
