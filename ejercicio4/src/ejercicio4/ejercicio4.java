package ejercicio4;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {

		  System.out.println ("Por favor introduzca un numero:");
	        String numero = "";
	        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
	        numero = entradaEscaner.nextLine (); //Invocamos un método sobre un objeto Scanner
	        
	        System.out.println(convertir(numero));
	        
	        


	}

	public static String convertir(String numero) {
		
		try{
			String cadena="";
		int entero = Integer.parseInt(numero);
		
		if(entero>0){
			
			for(int i=0;i<entero;i++){
				cadena=cadena+"*";
			}

			return cadena;
		}else{
			return "numero erroneo";
		}
		
		}catch(Exception e){
			return "Error";
			
		}

		
	}

}
