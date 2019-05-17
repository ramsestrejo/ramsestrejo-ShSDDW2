/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week1.softwarefundamentals;

/**
 *
 * @author ramses
 * This is a simple Student class
 */
public class Student {
    
    
    	private String name;

	public Student( ) {
		
	}

	public Student( String name ){
		this.name = name;
	}

	public String getName( ) {
		return this.name;
	}

	public void setName( String name ) {
		this.name = name;
	}
    
}
