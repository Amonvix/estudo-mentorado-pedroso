package padroes.observer;

public class AniversarioSurpresa {
	
	public static void main(String[] args) {
		
		Namorada namorada = new Namorada();
		Porteiro porteiro = new Porteiro();

		porteiro.registrarObservador(namorada);

		porteiro.registrarObservador(e-> System.out.println("O aniversariante chegou !!! " + e.getMomento()));
		
		porteiro.monitorar();
		
		
	}

}
