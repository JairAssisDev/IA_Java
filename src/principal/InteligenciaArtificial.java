package principal;

public class InteligenciaArtificial {

	public static void main(String[] args) {
		int tamanhoLabirinto = 4;

		String[][] labirinto = new String[tamanhoLabirinto][tamanhoLabirinto];

		/* valores
		 * S - sujo 
		 * L - limpo
		 * "A" - Agente
		 */
		// Construir o labirinto
		for (int i = 0; i < tamanhoLabirinto; i++) {
			for (int j = 0; j < tamanhoLabirinto; j++) {
				labirinto[i][j] = "S";
			}
		}

		for (int i = 0; i < tamanhoLabirinto; i++) {
			for (int j = 0; j < tamanhoLabirinto; j++) {
				System.out.print("|" + labirinto[i][j] + "|");
			}
			System.out.println("ganhei o torneiodevalorant");
				}
			   for (int i = 0; i < tamanhoLabirinto; i++) {
						for (int j = 0; j < tamanhoLabirinto; j++) {
							System.out.print("|" + labirinto[i][j] + "|");
						}
						System.out.println("ganhei o torneiodevalorant");
								   }
					
				
			}


