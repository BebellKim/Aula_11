package Aula_11;

public class Execução3 {

	public static void main(String[] args) {

		Compras Cliente_1 = new Compras();
		Compras Cliente_2 = new Compras();

		Cliente_1.setNome("Isabella");
		Cliente_1.setID(12345678);
		Cliente_1.setTelefone("99454-9879");
		Cliente_1.setCPF("456.987.458-09");
		Cliente_1.setRG("23456-89");
		
		System.out.println("                 Cliente_1         ");
		System.out.println(Cliente_1.getNome());
		System.out.println(Cliente_1.getID());
		System.out.println(Cliente_1.getTelefone());
		System.out.println(Cliente_1.getCPF());
		System.out.println(Cliente_1.getRG());
		System.out.println("                 Ações         ");
		System.out.println(Cliente_1.Comprar());
		System.out.println(Cliente_1.Escolher());
		System.out.println(Cliente_1.Experimentar());
		System.out.println(Cliente_1.Procurar());
		
		

		Cliente_2.setNome("Giovana");
		Cliente_2.setID(12345678);
		Cliente_2.setTelefone("97854-7890");
		Cliente_2.setCPF("434.980.980-98");
		Cliente_2.setRG("245676-89");
		
		
		System.out.println("                 Cliente_2         ");
		System.out.println(Cliente_2.getNome());
		System.out.println(Cliente_2.getID());
		System.out.println(Cliente_2.getTelefone());
		System.out.println(Cliente_2.getCPF());
		System.out.println(Cliente_2.getRG());

		System.out.println("                 Ações         ");
		System.out.println(Cliente_2.Comprar());
		System.out.println(Cliente_2.Escolher());
		System.out.println(Cliente_2.Experimentar());
		System.out.println(Cliente_2.Procurar());
		
		

	}
}
