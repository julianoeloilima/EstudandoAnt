package br.com.ant;

import com.thoughtworks.xstream.XStream;

public class Aluno {

	private String nome;
	private int idade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}
	
	public String toXML() {
		XStream stream = new XStream();
		return stream.toXML(this);
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
