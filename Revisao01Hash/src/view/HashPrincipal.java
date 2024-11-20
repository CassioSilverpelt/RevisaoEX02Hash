package view;

import controller.HashController;
import entity.Funcionario;

public class HashPrincipal {
	public static void main (String[] args) {
		
		Funcionario[] vetorFunc = new Funcionario[9];
		int tamanho =  vetorFunc.length;
		vetorFunc[0] = new Funcionario(18, 18007, "John Dae");
		vetorFunc[1] = new Funcionario(18, 18010, "Mark Knof");
		vetorFunc[2] = new Funcionario(18, 18003, "Ada Wong");
		vetorFunc[3] = new Funcionario(75, 75018, "Claire Redfield");
		vetorFunc[4] = new Funcionario(75, 75002, "Shawn Phillips");
		vetorFunc[5] = new Funcionario(75, 75030, "Jill Valentine");
		vetorFunc[6] = new Funcionario(101, 101090, "Albert Wesker");
		vetorFunc[7] = new Funcionario(101, 102034, "Lara Tforc");
		vetorFunc[8] = new Funcionario(101, 103043, "Chris RedField");
		
		HashController listaFunc = new HashController();
		
		for (int i = 0; i < tamanho; i++) {
			listaFunc.addDiv(vetorFunc[i]);
		}
		
		try {
			listaFunc.hashConsulta(18);
			listaFunc.hashConsulta(75);
			listaFunc.hashConsulta(101);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
