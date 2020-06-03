// Adrián Navarro Gabino

import java.util.Scanner;

public class Challenge0569 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cases = sc.nextInt();
		
		for(int index = 0; index < cases; index++) {
			int hora, minuto;
			int result = 0;
			int tiempoPartida = sc.nextInt();
			int clases = sc.nextInt();
			sc.nextLine();
			
			int horaFinal = 8;
			int minutoFinal = 0;
			
			for(int i = 0; i < clases; i++) {
				String data = sc.nextLine();
				hora = Integer.parseInt(data.split(":")[0]);
				minuto = Integer.parseInt(data.split(" ")[0].split(":")[1]);
                long aux = minuto >= minutoFinal ?
                    (hora - horaFinal) * 60 + minuto - minutoFinal :
					(hora - horaFinal - 1) * 60 + 60 - (minutoFinal - minuto);
				if(aux >= tiempoPartida) {
					result += aux;
				}
				int tiempo = Integer.parseInt(data.split(" ")[1]);
				horaFinal = hora + (minuto + tiempo) / 60;
				minutoFinal = (minuto + tiempo) % 60;
			}
			
			hora = 14;
			minuto = 0;
			
            long aux = minuto >= minutoFinal ?
                (hora - horaFinal) * 60 + minuto - minutoFinal :
				(hora - horaFinal - 1) * 60 + 60 - (minutoFinal - minuto);
			if(aux >= tiempoPartida) {
				result += aux;
			}
			
			System.out.println(result);
		}
	}
}