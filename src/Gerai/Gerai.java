/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gerai;

/**
 *
 * @author family
 */
public class Gerai {
    private final int KODE_PERUSAHAAN = 107;
    private String alamat;

    public Gerai(String alamat) {
        this.alamat = alamat;
    }
    
    public Gerai() {
        
    }
    public int getKode() {
        return KODE_PERUSAHAAN;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
