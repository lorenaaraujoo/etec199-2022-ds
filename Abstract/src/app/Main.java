package app;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int decisao = 0;
		Conteudo catalogo[] = new Conteudo[10];
		catalogo[0] = new Filme("Romance", "Ainda Estou Aqui", 117);
		catalogo[1] = new Filme("Romance", "Continência do Amor", 122);
		catalogo[2] = new Filme("Comédia", "As Branquelas", 109);
		catalogo[3] = new Filme("Comédia", "Minha Mãe é Uma Peça", 89);
		catalogo[4] = new Filme("Comédia", "Vizinhos", 110);
		catalogo[5] = new Serie("Misterio/Suspense", "Como Defender um Assasino", 43, 96, 6);
		catalogo[6] = new Serie("Ficção Cientifica/Drama/Suspense", "Black Mirror", 44, 22, 5);
		catalogo[7] = new Serie("Terror/Ficção Cientifica/Ação", "Love, Death & Robots", 15, 33, 3);
		catalogo[8] = new Serie("Ação/Drama", "O Atirador", 43, 31, 3);
		catalogo[9] = new Serie("Fantasia/Drama/Crime", "Lucifer", 45, 93, 6);
		
		String continua = "S";
		
			System.out.println("------Catálogo------");
			System.out.println("Seja bem vindo ao Catálogo CineMaster");
			
			while(continua.equals("S")) {
			System.out.println("Digite qual página deseja acessar? Filmes 1-5 | Séries 6-10");
			decisao = in.nextInt();
			decisao -= 1;
			catalogo[decisao].Descricao();
			System.out.println("Deseja verificar outra página do catálogo? S/N");
			continua = in.next();
			continua = continua.toUpperCase().substring(0,1);
		
			}
			
		in.close();
	}

}