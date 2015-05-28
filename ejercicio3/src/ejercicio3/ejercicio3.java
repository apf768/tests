package ejercicio3;


import java.util.Scanner;
import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {

		  System.out.println ("Por favor introduzca user:");
	        String user = "";
	        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
	        user = entradaEscaner.nextLine (); //Invocamos un método sobre un objeto Scanner

		
			System.out.println("Ingrese password"); 

			 String pass = "";
		        Scanner entradaEscaner2 = new Scanner (System.in); //Creación de un objeto Scanner
		        pass = entradaEscaner2.nextLine (); //Invocamos un método sobre un objeto Scanner

			
			
			if(comprobarvacio(user,pass)==false)
			{
				System.out.print("El usuario y password son menores de 30 caracteres y no nulos"); 
				compruebaLoginEnBD(user, pass);
			}else{

				System.out.print("Error"); 
			}

			
			}


	public static boolean comprobarvacio(String user, String pass) {

		if(user.isEmpty() || pass.isEmpty()){
			
			return true;
		}else{
			
			return comprobarlongitud(user,pass);
		}
		
	}

	private static boolean comprobarlongitud(String user, String pass) {
		if(user.length()>=30 || pass.length()>=30){
			return true;
		}else{
			return false;
		}
		
	}

	
	private static boolean compruebaLoginEnBD(String user, String pass) {
		// TODO Auto-generated method stub
		return true;
		
	}
}
