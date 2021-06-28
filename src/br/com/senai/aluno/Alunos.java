package br.com.senai.aluno;

import br.com.senai.curso.Curso;
import br.com.senai.endereço.Endereço; 

//CLASSE
public class Alunos extends Endereço {
	
	
	//ATRIBUTOS 
	
	private String nomeAluno;
	private int idadeAluno;
	private Curso curso;
	//METODOS
	public String getNomeAluno() {
		return nomeAluno;
	}
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	public int getIdadeAluno() {
		return idadeAluno;
	}
	public void setIdadeAluno(int idadeAluno) {
		this.idadeAluno = idadeAluno;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	
	
	
}
