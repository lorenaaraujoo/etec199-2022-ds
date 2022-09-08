package app;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int decisao = 0;
		Conteudo catalogo[] = new Conteudo[10];
		catalogo[0] = new Filme("Romance", "Ainda Estou Aqui", 117);
		catalogo[1] = new Filme("Romance", "Contin�ncia do Amor", 122);
		catalogo[2] = new Filme("Com�dia", "As Branquelas", 109);
		catalogo[3] = new Filme("Com�dia", "Minha M�e � Uma Pe�a", 89);
		catalogo[4] = new Filme("Com�dia", "Vizinhos", 110);
		catalogo[5] = new Serie("Misterio/Suspense", "Como Defender um Assasino", 43, 96, 6);
		catalogo[6] = new Serie("Fic��o Cientifica/Drama/Suspense", "Black Mirror", 44, 22, 5);
		catalogo[7] = new Serie("Terror/Fic��o Cientifica/A��o", "Love, Death & Robots", 15, 33, 3);
		catalogo[8] = new Serie("A��o/Drama", "O Atirador", 43, 31, 3);
		catalogo[9] = new Serie("Fantasia/Drama/Crime", "Lucifer", 45, 93, 6);
		
		String continua = "S";
		
			System.out.println("------Cat�logo------");
			System.out.println("Seja bem vindo ao Cat�logo CineMaster");
			
			while(continua.equals("S")) {
			System.out.println("Digite qual p�gina deseja acessar? Filmes 1-5 | S�ries 6-10");
			decisao = in.nextInt();
			decisao -= 1;
			catalogo[decisao].Descricao();
			System.out.println("Deseja verificar outra p�gina do cat�logo? S/N");
			continua = in.next();
			continua = continua.toUpperCase().substring(0,1);
		
			}
			
		in.close();
	}

}