/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tipe;

/**
 *
 * @author family
 */
public class Reguler implements TipePengiriman{
    private final String nama="Reguler";
    private final int harga = 3000;
    private int estimasi=7;

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
