package Generics;

public class CaixaTeste {
	
	public static void main(String[] args) {
		
		Caixa<Double> caixaA = new Caixa<>();
		caixaA.guardar(2.5);
		
		System.out.println(caixaA.abrir());
		
	}
}
