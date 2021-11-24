/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intanmobil;

/**
 *
 * @author nicolahara
 */
public class IntanMobil {
    String warna; 
    int jumlah_pintu; 
    float isi_tangki;
    
    public void Maju(int maju) { 
        int majukedepan=0; 
        majukedepan = majukedepan+maju; System.out.println("Mobil maju sejauh " +maju +" meter"); 
    }
    
    public void Mundur (int mundur) { 
        int mundurbelakang=0; 
        mundurbelakang=mundurbelakang+mundur; 
        System.out. println("Mobil mundur sejauh " +mundur +" meter"); 
    }
    
    public void Perjalanan (int perjalanan) { 
        System.out. println("Mobil berjalan sejauh " +perjalanan +" kilometer hari ini "); 
    }
    
    public void SisaMinyak (double minyak) { 
        System.out. println("Sisa minyak " +minyak +" liter  "); 
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IntanMobil BMW = new IntanMobil();
        BMW. Maju(75); 
        BMW. Mundur (5); 
        BMW. Perjalanan (50); 
        BMW. SisaMinyak (2.5); 
    }
    
}
