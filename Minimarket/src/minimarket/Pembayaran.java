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
public class Pembayaran {
    private double diskon;
    double bayar;
    void totalbayar (double bayar) {
        double Diskon = (0.15 * bayar);
        bayar = bayar - Diskon;
        
    }
    public void setBayar(double bayar) {
        this.bayar = bayar;
    }

    void totalbayar1 (double bayar){
       
    }
    public double getBayar(){
        return bayar;
    }
      
}
