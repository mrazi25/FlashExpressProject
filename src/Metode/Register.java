package Metode;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author family
 */
public class Register implements LayananPenambahanData{

    @Override
    public Object[] menambahData() {
        return new Object[]{};
    }

    @Override
    public boolean cekData(String email_1, String email_2) {
        return email_1.equals(email_2);
    }
    
}
