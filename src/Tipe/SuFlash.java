/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tipe;

/**
 *
 * @author family
 */
public class SuFlash implements TipePengiriman{
    private final String nama="SuFlash";
    private final int harga = 15000;
    private int estimasi=1;

    @Override
    public String getNamaJenis() {
        return nama;
    }

    @Override
    public int getHarga() {
        return harga;
    }

    @Override
    public int getEstimasi() {
        return estimasi;
    }

    public void setEstimasi(int estimasi) {
        this.estimasi = estimasi;
    }
}
