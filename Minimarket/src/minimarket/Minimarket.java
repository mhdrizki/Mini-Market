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
public class Minimarket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Barang Barang1= new Barang();
        try {
            Barang1.setNamaBarang ("aqua");
        }
        catch (Exception e){
            System.out.println ("error barang 1 " + e.getMessage());
        }
        try {
            Barang1.setBarcode ("13134");
        }
        catch (Exception e){
            System.out.println ("error barang 1 " + e.getMessage());
        }
        try {
            Barang1.setHarga (3000);
        }
        catch (Exception e){
            System.out.println ("error barang 1 " + e.getMessage());
        }
        try {
            Barang1.setStok (48);
        }
        catch (Exception e){
            System.out.println ("errorbarang 1 " + e.getMessage());
        }
        
        Barang Barang2= new Barang();
        try {
            Barang2.setNamaBarang ("good day");
        }
        catch (Exception e){
            System.out.println ("error barang 2 " + e.getMessage());
        }
        try {
            Barang2.setBarcode ("123456789");
        }
        catch (Exception e){
            System.out.println ("error barang 2 " + e.getMessage());
        }
        try {
            Barang2.setHarga (6000);
        }
        catch (Exception e){
            System.out.println ("error barang 2 " + e.getMessage());
        }
        try {
            Barang2.setStok (30);
        }
        catch (Exception e){
            System.out.println ("error barang 2 " + e.getMessage());
        }
        
        Barang Barang3= new Barang ();
        try {
            Barang3.setNamaBarang ("mizone");
        }
        catch (Exception e){
            System.out.println ("error barang 3 " + e.getMessage());
        }
        try {
            Barang3.setBarcode ("333333333");
        }
        catch (Exception e){
            System.out.println ("error barang 3 " + e.getMessage());
        }
        try {
            Barang3.setHarga (4500);
        }
        catch (Exception e){
            System.out.println ("error barang 3 " + e.getMessage());
        }
        try {
            Barang3.setStok (25);
        }
        catch (Exception e){
            System.out.println ("error barang 3 " + e.getMessage());
        }
        
        Barang Barang4= new Barang ();
        try {
            Barang4.setNamaBarang ("sari roti");
        }
        catch (Exception e){
            System.out.println ("error barang 4 "  + e.getMessage());
        }
        try {
            Barang4.setBarcode ("45673");
        }
        catch (Exception e){
            System.out.println ("error barang 4 " + e.getMessage());
        }
        try {
            Barang4.setHarga (3500);
        }
        catch (Exception e){
            System.out.println ("error barang 4 " + e.getMessage());
        }
        try {
            Barang4.setStok (25);
        }
        catch (Exception e){
            System.out.println ("error barang 4 " + e.getMessage());
        }
        
        Barang Barang5= new Barang ();
        try {
            Barang5.setNamaBarang ("roti");
        }
        catch (Exception e){
            System.out.println ("error barang 5 " + e.getMessage());
        }
        try {
            Barang5.setBarcode ("1248435");
        }
        catch (Exception e){
            System.out.println ("error barang 5 " + e.getMessage());
        }
        try {
            Barang5.setHarga (2500);
        }
        catch (Exception e){
            System.out.println ("error barang 5 " + e.getMessage());
        }
        try {
            Barang5.setStok (15);
        }
        catch (Exception e){
            System.out.println ("error barang 5 " + e.getMessage());
        }
        
        
        Pegawai Pegawai1 = new Pegawai();
        try {
            Pegawai1.setNama ("raditya");
        }
        catch (Exception e){
            System.out.println ( e.getMessage());
        }
        try {
            Pegawai1.setIdPegawai("12345");
        }
        catch (Exception e){
            System.out.println ( e.getMessage());
        }
        
        Pegawai1.alamat.setJalan("ssk");
        Pegawai1.alamat.setNomor ("20");
        Pegawai1.alamat.setKota("jakarta");
        Pegawai1.gaji.total(2000000);
        
        Pegawai Pegawai2 = new Pegawai();
        try {
            Pegawai2.setNama ("dika");
        }
        catch (Exception e){
            System.out.println ( e.getMessage());
        }
        try {
            Pegawai2.setIdPegawai("78965");
        }
        catch (Exception e){
            System.out.println ( e.getMessage());
        }
        Pegawai2.alamat.setJalan ("Dago");
        Pegawai2.alamat.setNomor ("14");
        Pegawai2.alamat.setKota  ("Bandung");
        Pegawai2.gaji.total (2200000);
        
        Pembeli Pembeli1 = new Pembeli ();
        Pembeli1.setStatus("gold");
        Pembeli1.setIdmember("999999");
        Pembeli1.pembayaran.setBayar(12000);
                
        Pembeli Pembeli2 = new Pembeli ();
        Pembeli2.setStatus("premium");
        Pembeli2.setIdmember("111111");
        Pembeli2.pembayaran.setBayar(5500);
      
           cetakPegawai1 (Pegawai1);
           cetakPegawai2 (Pegawai2);
           cetakPembeli1 (Pembeli1);
           cetakPembeli2 (Pembeli2);  
           
        // TODO code application logic here
    }
    
        static void cetakPegawai1(Pegawai Pegawai){
            System.out.println("Nama Pegawai  :" +Pegawai.getNama());
            System.out.println("Id Pegawai  :"+Pegawai.getIdPegawai());
            System.out.print("Alamat  :"+Pegawai.alamat.getJalan());
            System.out.print(" "+Pegawai.alamat.getNomor());
            System.out.println(" "+Pegawai.alamat.getKota());
        }
        static void cetakPegawai2(Pegawai Pegawai){
            System.out.println("Nama Pegawai  :" +Pegawai.getNama());
            System.out.println("Id Pegawai  :"+Pegawai.getIdPegawai());
            System.out.print("Alamat  :"+Pegawai.alamat.getJalan());
            System.out.print(" "+Pegawai.alamat.getNomor());
            System.out.println(" "+Pegawai.alamat.getKota());
        }
        static void cetakPembeli1(Pembeli Pembeli){
            System.out.println ("Status :" +Pembeli.getStatus());
            System.out.println ("Idmember :" +Pembeli.getIdmember());
            System.out.println("total bayar :" +Pembeli.pembayaran.getBayar());
        }
        static void cetakPembeli2(Pembeli Pembeli){
            System.out.println ("Status :" +Pembeli.getStatus());
            System.out.println ("Idmember :" +Pembeli.getIdmember());
            System.out.println("total bayar :" +Pembeli.pembayaran.getBayar());
        }
}
