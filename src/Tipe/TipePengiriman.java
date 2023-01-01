/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Tipe;

/**
 *
 * @author family
 */
public interface TipePengiriman {
    String getNamaJenis();
    int getHarga(int berat);
    int getHarga(int berat, int asuransi);
    int getEstimasi();
}
