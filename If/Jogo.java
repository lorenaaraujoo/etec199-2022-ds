import java.util.Scanner;
public class Jogo {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		int horaInicial = in.nextInt();
		int horaFinal = in.nextInt();
		
		int duracao;
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		}
		else {
			duracao = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("O jogou durou " + duracao + " horas(s)");
	}
}
