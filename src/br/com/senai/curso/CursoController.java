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
		
		int opcao = tec.nextInt();
		switch(opcao ) {
		
		
		case 1 :
			curso.add(cadastrarCurso());
			break;
			
		case 2: 
			listarCursos(curso);
			break;
		
		case 3:
			editarCursos(curso);
			break;
			
		case 4:
			excluirCurso(curso);
			break;
		
		case 5:
		default:
			System.out.println("Opção Inválida!");
			break;
			
		}
		
	}
	
	public Curso cadastrarCurso (){
		Curso curso = new Curso();
		
		System.out.println("----CADASTRAR CURSO----");
		System.out.println("Informe o nome do curso: ");
		curso.setNomeCurso(tec.next());
		
	return curso;
		
	}
	
	public List<Curso> listarCursos(List<Curso>cursos){
		if (cursos.isEmpty()) {
			System.out.println("Não possui cursos cadastrados");
			return null;
			
		}
		
		System.out.println("----CURSOS CADASTRADOS----");
		
		System.out.printf("| %10s |\n",
				"Nome do Curso");
		
		for(int i = 0; i < cursos.size(); i ++) {
			System.out.printf("| %10s |\n",
					i + 1 ,
					cursos.get(i).getNomeCurso());
			
			
			
		}
		return cursos;
		
	}
	public List<Curso> editarCursos(List<Curso> cursos){
		Curso curso = new Curso();
		listarCursos(cursos);
		
		if(cursos.isEmpty()) {
				return null;
				
		}
		
		System.out.println("Informe o id do curso para editar: ");
		int idcurso = tec.nextInt() - 1;
		
		
		System.out.println("1) Nome do Curso");
		
		switch (leOpcao()) {
		case 1:
			System.out.println("----EDITAR O NOME DO CURSO---");
			System.out.println("Informe o nome do novo curso: ");
			curso.setNomeCurso(tec.next());
			
			
			cursos.set(idcurso, curso);
			
			break;
			
			
		}
		return cursos;
		
	}



	public void excluirCurso(List<Curso>cursos) {
		listarCursos(cursos);
		
		if(cursos.isEmpty()) {
			return;
		}
		System.out.println("-----EXCLUIR CURSO----");
		System.out.println("Informe o curso para excluir:");
		int idCursos = tec.nextInt() - 1;
		
		if(cursos.size() <= idCursos) {
			System.out.println("Produto năo cadastrado.");
			return;

}
	}
}