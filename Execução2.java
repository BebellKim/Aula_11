package Aula_11;

public class Execução2 {

	public static void main(String[] args) {
		Animais coelho   =  new Animais();
		Animais galinha  =  new Animais();
		Animais cachorro =  new Animais();
		Animais pintinho =  new Animais ();
		Animais cabrito  =  new Animais ();
		Animais vaca     =  new Animais ();
		Animais bezerro  =  new Animais ();

		
		// COELHO CARACTERÍSTICAS E AÇÃO
		coelho.setRaca("Coelho albino");
		coelho.setCor("Branco");
		coelho.setNome("Pipo");
		coelho.setIdade(3);

		System.out.println("                 Coelho           ");
		System.out.println(coelho.getRaca());
		System.out.println(coelho.getCor());
		System.out.println(coelho.getNome());
		System.out.println(coelho.getIdade());

		System.out.println("                 Ações           ");
		System.out.println(coelho.Pular());
		System.out.println(coelho.Dormir());
		System.out.println(coelho.Procriar());
		System.out.println(coelho.Comer());

		
		// GALINHA CARACTERÍSTICAS E AÇÃO
		galinha.setRaca("Lagorne");
		galinha.setCor("Laranja");
		galinha.setNome("Filipa");
		galinha.setIdade(3);

		System.out.println("                 Galinha         ");
		System.out.println(galinha.getRaca());
		System.out.println(galinha.getCor());
		System.out.println(galinha.getNome());
		System.out.println(galinha.getIdade());

		System.out.println("                 Ações           ");
		System.out.println(galinha.Andar());
		System.out.println(galinha.Dormir());
		System.out.println(galinha.Procriar());
		System.out.println(galinha.Comer());

	// CACHORRO CARACTERÍSTICAS E AÇÃO
	cachorro.setRaca("Shitzu");
	cachorro.setCor("Branco");
	cachorro.setNome("Max");
	cachorro.setIdade(7);


	System.out.println("                 Cachorro        ");
	System.out.println(cachorro.getRaca());
	System.out.println(cachorro.getCor());
	System.out.println(cachorro.getNome());
	System.out.println(cachorro.getIdade());
	
	System.out.println("                 Ações           ");
	System.out.println(cachorro.Andar());
	System.out.println(cachorro.Dormir());
	System.out.println(cachorro.Procriar());
	System.out.println(cachorro.Comer());
	
	// PINTINHO CARACTERÍSTICAS E AÇÃO
	pintinho.setRaca("Sedoso");
	pintinho.setCor("amarelo");
	pintinho.setNome("Gu");
	pintinho.setIdade(1);


	System.out.println("                 Pintinho        ");
	System.out.println(pintinho.getRaca());
	System.out.println(pintinho.getCor());
	System.out.println(pintinho.getNome());
	System.out.println(pintinho.getIdade());
	
	System.out.println("                 Ações           ");
	System.out.println(pintinho.Andar());
	System.out.println(pintinho.Dormir());
	System.out.println(pintinho.Procriar());
	System.out.println(pintinho.Comer());
	
	
	// CABRITO CARACTERÍSTICAS E AÇÃO
	cabrito.setRaca("Canindé");
	cabrito.setCor("amarelo");
	cabrito.setNome("liza");
	cabrito.setIdade(3);


	System.out.println("                 cabrito        ");
	System.out.println(cabrito.getRaca());
	System.out.println(cabrito.getCor());
	System.out.println(cabrito.getNome());
	System.out.println(cabrito.getIdade());
	
	System.out.println("                 Ações           ");
	System.out.println(cabrito.Andar());
	System.out.println(cabrito.Dormir());
	System.out.println(cabrito.Procriar());
	System.out.println(cabrito.Comer());
	
	// VACA CARACTERÍSTICAS E AÇÃO
	vaca.setRaca("Nelore");
	vaca.setCor("branca");
	vaca.setNome("buba");
	vaca.setIdade(6);


	System.out.println("                 vaca        ");
	System.out.println(vaca.getRaca());
	System.out.println(vaca.getCor());
	System.out.println(vaca.getNome());
	System.out.println(vaca.getIdade());
	
	System.out.println("                 Ações           ");
	System.out.println(vaca.Andar());
	System.out.println(vaca.Dormir());
	System.out.println(vaca.Procriar());
	System.out.println(vaca.Comer());

	
	//BEZERRO CARACTERÍSTICAS E AÇÃO
	bezerro.setRaca("Angus");
	bezerro.setCor("preto");
	bezerro.setNome("sonoda");
	bezerro.setIdade(2);


	System.out.println("                 bezerro        ");
	System.out.println(bezerro.getRaca());
	System.out.println(bezerro.getCor());
	System.out.println(bezerro.getNome());
	System.out.println(bezerro.getIdade());
	
	System.out.println("                 Ações           ");
	System.out.println(bezerro.Andar());
	System.out.println(bezerro.Dormir());
	System.out.println(bezerro.Procriar());
	System.out.println(bezerro.Comer());
	
}
}
