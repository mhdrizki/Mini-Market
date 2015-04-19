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
public class Pegawai {
    private String Nama;
    private String IdPegawai;
    public Alamat alamat = new Alamat();
    public Gaji gaji = new Gaji();    
    
    boolean equals (Pegawai Pegawai) {
        return getNama().equals(Pegawai.getNama())&&
                getIdPegawai().equals (Pegawai.getIdPegawai()) &&
                alamat ==Pegawai.alamat &&
                gaji == Pegawai.gaji ;
    }
    void setnama (String N)throws Exception {
        try {
        for (int i =0;i<N.length();i++){
            if(Character.isDigit(N.charAt(i))){
                return;
                }
            }
        this.setNama(N);
        }
        catch (Exception e){
            throw new Exception ("Nama pegawai Harus berupa huruf");
        }
    }       
   
  
    void setidpegawai(String id)throws Exception {
        try {
        for (int i = 0; i<7;i++){
           
                if(!Character.isDigit(id.charAt(i))){
                    return;
                
            }
        }
        this.setIdPegawai(id);
        }
        catch (Exception e){
            throw new Exception ("id pegawai Harus berupa angka");
        }
    }

    /**
     * @return the Nama
     */
    public String getNama() {
        return Nama;
    }

    /**
     * @param Nama the Nama to set
     */
    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    /**
     * @return the IdPegawai
     */
    public String getIdPegawai() {
        return IdPegawai;
    }

    /**
     * @param IdPegawai the IdPegawai to set
     */
    public void setIdPegawai(String IdPegawai) {
        this.IdPegawai = IdPegawai;
    }

}