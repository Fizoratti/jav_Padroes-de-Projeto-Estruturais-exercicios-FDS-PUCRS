
public class main {

	public static void main(String[] args) {
		
		Integer b = 0;
		String matriz[][] = new String[10][2];
		
		for(int i=0;i<10;i++) {
			matriz[i][0] = "chave " + b.toString();
			b++;
		}
		
		for(int i=0;i<10;i++) {
			matriz[i][1] = "valor " + b.toString();
			b++;
		}
		
		
		System.out.println("Teste de Mapa");

		adapterMap mapa = new adapterMap(matriz);
		System.out.println("Tamanho de Mapa");
		System.out.println(matriz.length);
		
		
		for(int i = 0; i<10;i++) {
			System.out.println(mapa.get("chave " + i));
		}
		
	}

}
