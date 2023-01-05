package Metode;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author family
 */
public class Login implements LayananAutentifikasiData{

    @Override
    public boolean cekData(String email_1, String email_2) {
        return email_1.equals(email_2);
    }
    
}
