/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week1.softwarefundamentals;

/**
 *
 * @author ramses
 */
public class PartTimeStudent extends Student {
    private String phone;
    
    public PartTimeStudent( ) {
        super( );
    }
    
    public void setPhone( String phone ) {
        this.phone = phone;
    }
    
    public String getPhone( ) {
        return this.phone;
    }
    
}
