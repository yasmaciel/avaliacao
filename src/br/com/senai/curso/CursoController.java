package br.com.senai.curso;

import java.util.List;
import java.util.Scanner;

public class CursoController {
	
	private Scanner tec;
	
	public CursoController() {
		tec = new Scanner(System.in);
		
	}
	public int leOpcao() {
		System.out.println(">");
		return tec.nextInt();
	}
	
	public void menu(List<Curso>curso) {
		System.out.println("-------Menu Curso-------");
		System.out.println("1) Cadastrar Curso");
		System.out.println("2) Listar Curso");
		System.out.println("3) Editar Curso");
		System.out.println("4) Excluir Curso");
		
	}

}
