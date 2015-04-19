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
public class Barang {
    private String namabarang;
    String barcode;
    int harga;
    private int stok;
    
    boolean equals (Barang Barang) {
        return namabarang.equals(Barang.namabarang)&&
                barcode.equals (Barang.namabarang) &&
                harga ==Barang.harga&&
                stok == Barang.stok;
    }
    void setNamaBarang (String namabarang)throws Exception {
        try {
            if (namabarang.length ()<50){
                this.namabarang = namabarang;
            }
        }
        catch (Exception e){
            throw new Exception ("Nama barang terlalu panjang");
        }
    }
    void setBarcode (String barcode)throws Exception {
        try {
            Integer.parseInt(barcode);
        }
        catch (Exception e){
            throw new Exception ("barcode barang harus berupa angka");
        }
        this.barcode = barcode;
    }
    void setHarga (int harga) throws Exception {
        if (harga > 2000){
            this.harga= harga;
        }
        else {
            throw new Exception ("harga barang terlalu murah");
        }
    }
    void setStok (int stok) throws Exception {
        if (stok > 10) {
            this.stok=stok;
        }
        else {
            throw new Exception ("Harus restok barang");
        }
    }
    String getNamaBarang (){
        return namabarang;
    }
    String getBarcode (){
        return barcode;
    }
    int getHarga () {
        return harga;
    }
    int getStok (){
        return stok;
    }
}

 