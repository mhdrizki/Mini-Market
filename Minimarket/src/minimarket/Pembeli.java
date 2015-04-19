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
public class Pembeli {
    private String status;
    
    private String idmember;
    Barang barang = new Barang();
    public Pembayaran pembayaran = new Pembayaran();
    void setidmember(String member){
        for (int i = 0; i<7;i++){
                if(!Character.isDigit(member.charAt(i))){
                    return;
                }
        }
        this.setIdmember(member);
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the idmember
     */
    public String getIdmember() {
        return idmember;
    }

    /**
     * @param idmember the idmember to set
     */
    public void setIdmember(String idmember) {
        this.idmember = idmember;
    }
}
   
    

