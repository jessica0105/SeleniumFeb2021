package javaBasics;

public class While {

	public static void main(String[] args) {
		int numero = 1;
		
		while(numero<=100) {
			System.out.println(numero);
			//numero = numero + 1; 
			if(numero==34) {
				break;
			}
			numero++;
			
		}
			for(int num=50; num<=100; num++) {
				System.out.println(num);
			}	
	}

}
