package br.com.senai.programaprincipal;

import java.util.ArrayList;
import java.util.List;

import br.com.senai.aluno.AlunoController;
import br.com.senai.aluno.Alunos;
import br.com.senai.curso.Curso;
import br.com.senai.curso.CursoController;

public class ProgramaPrincipal {
	public static void main (String [] args){
		List<Curso>cursos = new ArrayList<>();
		List<Alunos>alunos = new ArrayList<>();
		
		CursoController cursoController = new CursoController();
		AlunoController alunosController = new AlunoController();
		
		boolean sair = false;
		
		do{
				menu();
				
				int opcao = cursoController.leOpcao();
				switch(opcao){
				case 1:
					cursoController.menu(cursos);
					break;
					
				case 2:
					alunosController.menu(alunos, cursos);
					break;
				
				case 3:
					sair = true;
					break;
					
				default:
					System.out.println("Opção inválida!");
					break;
					
				}
		}while(!sair);

		System.out.println("Sistema finalizado!");
	}
	public static void menu() {
		System.out.println("\n--- MENU PRINCIPAL ---");
		System.out.println("1) Curso");
		System.out.println("2) Aluno");
		System.out.println("3) Endereço");
		System.out.println("4) Sair do sistema");
		System.out.println("-------------------");
}
}
					
				
				
					
				
	
	

	


	

			
				
					
				
			
		
			
			
		
	
		
	


