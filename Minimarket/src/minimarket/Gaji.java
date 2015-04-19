/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minimarket;

/**
 *
 * @author Windows 8.1
 */
public class Gaji {
    double gajipokok;
    double tunjangan;
    double kehadiran;
    double total (double gajibulanan) {
        this.gajipokok= (gajibulanan);
        tunjangan = (gajibulanan * 0.6);
        kehadiran=(tunjangan* 0.25);
        double terimagaji = (gajibulanan + tunjangan + kehadiran);
        return terimagaji;
        
    }

  
    
}
