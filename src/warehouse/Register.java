/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warehouse;

import javax.swing.JTextField;

/**
 *
 * @author madur
 */
public class Register {
    
    private String name;
    private String mail;
    private String nic;
    private String phone;
    private String add;

   // Getter
   public String getName() {
     return name;
   }

   // Setter
   public void setName(String name1) {
     this.name = name1;
   }

    /**
     * @return the email
     */
    public String getEmail() {
        return mail;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.mail = email;
    }

    /**
     * @return the nic
     */
    public String getNic() {
        return nic;
    }

    /**
     * @param nic the nic to set
     */
    public void setNic(String nic) {
        this.nic = nic;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return add;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.add = address;
    }

    String getName(JTextField txtname) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getEmail(JTextField txtmail) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getNic(JTextField txtnic) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getPhone(JTextField txtphone) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getAddress(JTextField txtadd) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


