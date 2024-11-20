package entity;

public class Funcionario {

	int filial;
	int registro;
	String nome;
	
	public Funcionario(int filial, int registro, String nome) {
		this.filial = filial;
		this.registro = registro;
		this.nome = nome;
	}
	public int getFilial() {
		return filial;
	}
	public void setFilial(int filial) {
		this.filial = filial;
	}
	public int getRegistro() {
		return registro;
	}
	public void setRegistro(int registro) {
		this.registro = registro;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		return "Registro: " + registro + " Nome: " + nome;
	}
}
