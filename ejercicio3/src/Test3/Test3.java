package Test3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ejercicio3.ejercicio3;

public class Test3 {
	public ejercicio3 ejer3;
	
	String vacio="";
	String larga="11111111111111111111111111111111111111111";
	String oklogin="fernando";
	String okpass="46425";
	

	@Test
	public void test1vacio() {
		assertTrue(ejer3.comprobarvacio(oklogin, vacio) == true);  
	}
	
	@Test
	public void test2vacio() {
		assertTrue(ejer3.comprobarvacio(vacio, okpass) == true);  
	}
	
	@Test
	public void testtodosvacio() {
		assertTrue(ejer3.comprobarvacio(vacio, vacio) == true);  
	}
	
	@Test
	public void test1largo() {
		assertTrue(ejer3.comprobarvacio(oklogin, larga) == true);  
	}
	
	@Test
	public void test2largo() {
		assertTrue(ejer3.comprobarvacio(larga, okpass) == true);  
	}
	
	@Test
	public void testtodoslargo() {
		assertTrue(ejer3.comprobarvacio(larga, larga) == true);  
	}
	
	@Test
	public void testtodobien() {
		assertTrue(ejer3.comprobarvacio(oklogin, okpass) == false);  
	}
}
