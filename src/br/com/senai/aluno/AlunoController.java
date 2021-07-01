package br.com.senai.aluno;

import java.util.List;
import java.util.Scanner;

import br.com.senai.curso.Curso;



public class AlunoController {
private Scanner tec;
	
	public AlunoController() {
		tec = new Scanner(System.in);
		
	}
	public int leOpcao() {
		System.out.println(">");
		return tec.nextInt();
	}
	
	public void menu(List<Alunos>alunos, List<Curso>cursos) {
		System.out.println("-------Menu Aluno-------");
		System.out.println("1) Cadastrar aluno");
		System.out.println("2) Listar aluno");
		System.out.println("3) Editar aluno");
		System.out.println("4) Excluir aluno");
		
		int opcao = tec.nextInt();
		switch(opcao ) {		
		case 1 :
			alunos.add(cadastrarAluno(cursos, alunos));
			break;
			
		case 2: 
			listarAlunos(alunos);
			break;
		
		case 3:
			editarAlunos(alunos,cursos);
			break;
			
		case 4:
			excluirAluno(alunos);
			break;
		
		case 5:
		default:
			System.out.println("Opção Inválida!");
			break;
			
		}
		
	}
	
	public Alunos cadastrarAluno (List<Curso>cursos, List<Alunos>alunos){
		
		if(cursos.isEmpty()) {
			return null;
		}
		
		Curso curso = new Curso();
		Alunos aluno = new Alunos();
		
		System.out.println("----CADASTRAR ALUNO----");
		System.out.println("Informe o nome do aluno: ");
		aluno.setNomeAluno(tec.next());
		
		
		System.out.println("Informe a idade do aluno: ");
		aluno.setIdadeAluno(tec.nextInt());	
		
		System.out.println("Informe o Curso: ");
		aluno.setCurso(curso);
		
		
	return aluno;
		
	}
	
	public List<Alunos> listarAlunos(List<Alunos>alunos){
		if (alunos.isEmpty()) {
			System.out.println("Não possui alunos cadastrados");
			return null;
			
		}
		
		System.out.println("----ALUNOS CADASTRADOS----");
		
		System.out.printf("| %10s |%10s | %10s \n",
				"Nome do Aluno", "Idade", "Curso");
		
		for(int i = 0; i < alunos.size(); i ++) {
			System.out.printf("| %10s | %10s | %10s |\n",
					i + 1 ,
					alunos.get(i).getNomeAluno(),
					alunos.get(i).getIdadeAluno(),
					alunos.get(i).getCurso());
			
			
			
		}
		return alunos;
		
	}
	public List<Alunos> editarAlunos(List<Alunos> aluno, List<Curso>cursos){
		Alunos alunos = new Alunos();
		listarAlunos(aluno);
		
		if(cursos.isEmpty()) {
			System.out.println("Impossiel realizar vendas sem PRODUTOS ou PESSOAS cadastradas.");
			return null;
		}
			Curso curso = new Curso();
		
		System.out.println("Informe o id do aluno para editar: ");
		int idAluno = tec.nextInt() - 1;
		
		
		System.out.println("1) Nome do Aluno");
		System.out.println("2) Idade do Aluno");
		System.out.println("3) Nome do Curso");
		
		switch (leOpcao()) {
		case 1:
			System.out.println("----EDITAR O NOME DO ALUNO---");
			System.out.println("Informe o nome do novo curso: ");
			alunos.setNomeAluno(tec.next());
			
		alunos.setIdadeAluno(aluno.get(idAluno).getIdadeAluno());
		alunos.setCurso(aluno.get(idAluno).getCurso());
			
			
		aluno.set(idAluno, alunos);
			
			break;
			
		case 2:
			System.out.println("----EDITAR A IDADE----");
			System.out.println("Informe a nova idade: ");
			alunos.setIdadeAluno(tec.nextInt());
			
			alunos.setIdadeAluno(aluno.get(idAluno).getIdadeAluno());
			alunos.setCurso(aluno.get(idAluno).getCurso());
			
			aluno.set(idAluno, alunos);
			
			break;
			
		case 3:
			System.out.println("----EDITAR CURSO---");
			System.out.println("Informe o novo nome do curso: ");
			alunos.setCurso(curso);
			
			alunos.setNomeAluno(aluno.get(idAluno).getNomeAluno());
			alunos.setIdadeAluno(aluno.get(idAluno).getIdadeAluno());
			alunos.setCurso(aluno.get(idAluno).getCurso());
			
			aluno.set(idAluno, alunos);
			
			break;
			
			
		default:
			System.out.println("opção inválida! ");
			
			break;
			
			
		}
		return aluno;
		
	}



	public void excluirAluno(List<Alunos>aluno) {
		listarAlunos(aluno);
		
		if(aluno.isEmpty()) {
			return;
		}
		System.out.println("-----EXCLUIR ALUNO----");
		System.out.println("Informe o aluno para excluir:");
		int idAluno = tec.nextInt() - 1;
		
		if(aluno.size() <= idAluno) {
			System.out.println("Produto năo cadastrado.");
			return;

		}
		aluno.remove(idAluno);
	}
}


