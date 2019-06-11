package exercicio2;

public class AdapterSomador implements SomadorEsperado {
	
	private SomadorExistente ex;
	
	public AdapterSomador() {
		ex = new SomadorExistente();
	}

	@Override
	public int somaVetor(int[] vetor) {
		int resultado = 0;
		for(int i=0;i<vetor.length;i++) {
			resultado += vetor[i];
		}		
		return resultado;
	}
	
}
