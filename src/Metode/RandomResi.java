/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metode;

import Gerai.Gerai;
import Gerai.GeraiBekasi;
import Gerai.GeraiBogor;
import Gerai.GeraiDepok;
import Gerai.GeraiJakarta;
import Gerai.GeraiPontianak;
import Gerai.GeraiTangerang;

/**
 *
 * @author family
 */
public class RandomResi implements Runnable{
    private String resi;
    private Gerai gerai;

    public RandomResi(Gerai gerai) {
        this.gerai = gerai;
        this.setResi();
    }
    public String getResi() {
        return resi;
    }

    public synchronized void setResi() {
        String kodeGerai="", namaGerai="";
        if(gerai instanceof GeraiJakarta){
            kodeGerai = ""+((GeraiJakarta)gerai).getKODE_GERAI();
            namaGerai = ((GeraiJakarta)gerai).getNAMA_GERAI().substring(6,9).toUpperCase();
        }else if(gerai instanceof GeraiBogor){
            kodeGerai = ""+((GeraiBogor)gerai).getKODE_GERAI();
            namaGerai = ((GeraiBogor)gerai).getNAMA_GERAI().substring(6,9).toUpperCase();
        }else if(gerai instanceof GeraiDepok){
            kodeGerai = ""+((GeraiDepok)gerai).getKODE_GERAI();
            namaGerai = ((GeraiDepok)gerai).getNAMA_GERAI().substring(6,9).toUpperCase();
        }else if(gerai instanceof GeraiTangerang){
            kodeGerai = ""+((GeraiTangerang)gerai).getKODE_GERAI();
            namaGerai = ((GeraiTangerang)gerai).getNAMA_GERAI().substring(6,9).toUpperCase();
        }else if(gerai instanceof GeraiBekasi){
            kodeGerai = ""+((GeraiBekasi)gerai).getKODE_GERAI();
            namaGerai = ((GeraiBekasi)gerai).getNAMA_GERAI().substring(6,9).toUpperCase();
        }else if(gerai instanceof GeraiPontianak){
            kodeGerai = ""+((GeraiPontianak)gerai).getKODE_GERAI();
            namaGerai = ((GeraiPontianak)gerai).getNAMA_GERAI().substring(6,9).toUpperCase();
        }
        this.resi = namaGerai+"-"+kodeGerai+"-"+String.format("%-4s", ""+getRandom()).replace(' ', '0');
    }
    
    public int getRandom(){
        return 1+(int)(Math.random()*10000);
    }
    
    @Override
    public void run() {
        this.setResi();
    }
}
