package view;

public class PessoaFisica extends Pessoa {
	private String nome;
	private int rg, cpf, idade ;


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getRg() {
		return rg ;
	}
	
	public void setRg(int rg) {
		this.rg = rg ;
	}
	
	public int getcpf() {
		return cpf ;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf ;
	}
	public int getidade() {
		return idade ;
	}
	
	public void setIdade(int idade) {
		this.idade = idade ;
	}
}
