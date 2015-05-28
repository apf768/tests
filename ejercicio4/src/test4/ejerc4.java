package test4;

import static org.junit.Assert.*;

import org.junit.Test;

import ejercicio4.ejercicio4;


public class ejerc4 {

public ejercicio4 ejer4;
	
	String negativo="-1";
	String cero="0";
	String correcto="4";
	
	
	@Test
	public void testnegativo() {
		assertTrue(ejer4.convertir(negativo).contains("erro"));  
	}
	
	@Test
	public void testcero() {
		assertTrue(ejer4.convertir(cero).contains("erro"));  
	}
	
	@Test
	public void testcorrecto() {
		assertTrue(ejer4.convertir(correcto).contentEquals("****"));  
	}
	
	

}
