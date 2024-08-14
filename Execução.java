package Aula_11;

public class Execução {

	public static void main(String[] args) {
		Avião aviao = new Avião();

		aviao.setModelo("BTC-01");
		aviao.setAcentos(500);
		aviao.setCor("Branco");
		aviao.setCompanhia("Azul");
		aviao.setPorte("Grande porte");
	
	System.out.println("                 Avião           ");
	System.out.println(aviao.getModelo());
	System.out.println(aviao.getAcentos());
	System.out.println(aviao.getCor());
	System.out.println(aviao.getCompanhia());
	System.out.println(aviao.getPorte());

}
}