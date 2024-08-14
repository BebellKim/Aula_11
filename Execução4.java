package Aula_11;

public class Execução4 {

	public static void main(String[] args) {
		 
		Cadeira cadeira1 = new Cadeira();
		Cadeira cadeira2 = new Cadeira();
		
		cadeira1.setCor("Preta");
		cadeira1.setID(12345678);
		cadeira1.setTamanho("Cavenaghi");
	    cadeira1.setModelo("Giratória");
		
		System.out.println("                   cadeira1         ");
		System.out.println(cadeira1.getCor());
		System.out.println(cadeira1.getModelo());
		System.out.println(cadeira1.getTamanho());
		System.out.println(cadeira1.getID());
		
		System.out.println("                 Ações         ");
		System.out.println(cadeira1.Subir());
		System.out.println(cadeira1.Descer());
		System.out.println(cadeira1.Girar());
		System.out.println(cadeira1.Enclinar());
		
		cadeira2.setCor("Preta");
		cadeira2.setID(12345678);
		cadeira2.setTamanho("Cavenaghi");
	    cadeira2.setModelo("Giratória");
		
		System.out.println("                   cadeira2         ");
		System.out.println(cadeira2.getCor());
		System.out.println(cadeira2.getID());
		System.out.println(cadeira2.getTamanho());
		System.out.println(cadeira2.getModelo());
		
		System.out.println("                 Ações         ");
		System.out.println(cadeira2.Subir());
		System.out.println(cadeira2.Descer());
		System.out.println(cadeira2.Girar());
		System.out.println(cadeira2.Enclinar());
	}
	}

