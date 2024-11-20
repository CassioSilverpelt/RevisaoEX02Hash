package controller;

import entity.Funcionario;
import model.Lista;

public class HashController {

	@SuppressWarnings("unchecked")
	Lista<Funcionario>[] listafunc = new Lista[110];
	int tamanho = listafunc.length;
	
	public HashController() {
		for (int i = 0; i < tamanho; i++ ) {
			listafunc[i] = new Lista<Funcionario>();
		}
	}
	
	private int hashDiv(int num) {
		num = num % tamanho;
		return num;
	}
	
	public void addDiv(Funcionario funcionario) {
		int i = hashDiv(funcionario.getFilial());
		Lista<Funcionario> aux = listafunc[i];
		if (aux.isEmpty()) {
			aux.addFirst(funcionario);
		} else {
			aux.addLast(funcionario);
		}
	}
	
	public void hashConsulta(int key) throws Exception {
		if (listafunc[key].isEmpty()) {
			throw new Exception ("Lista Vazia");
		} else {
			Lista<Funcionario> aux = listafunc[key];
			for (int i = 0; i < aux.size(); i++) {
				System.out.println(aux.get(i).toString());
			}
		}
	}
	
}
