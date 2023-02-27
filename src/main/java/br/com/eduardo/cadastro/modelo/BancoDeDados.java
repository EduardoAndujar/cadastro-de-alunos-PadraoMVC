package br.com.eduardo.cadastro.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BancoDeDados {

	private static List<Aluno> alunos = new ArrayList<>();
	private static List<Usuario> usuarios = new ArrayList<>();

	static {
		alunos.add(new Aluno("Eduardo", "Andujar", "20/02/1998", "999.999.999-99", "99999-999", "Engenharia Mecânica", 5));
		alunos.add(new Aluno("Luciano", "da Silva", "05/05/2000", "888.888.888-88", "88888-888", "Jornalismo", 2));
		alunos.add(new Aluno("Anna", "Camargo", "07/01/1997", "777.777.777-77", "77777-777", "Artes Visuais", 1));
		alunos.add(new Aluno("Júlia", "Antônia", "21/08/2003", "666.666.666-66", "66666-666", "Administração", 4));
		alunos.add(new Aluno("Maria", "Rodrigues", "19/06/2002", "555.555.555-55", "55555-555", "Geografia", 3));
		alunos.add(new Aluno("Daniel", "Santos", "02/12/2000", "444.444.444.44", "44444-444", "Física", 5));
		
		Usuario admin = new Usuario("admin", "123456");
		Usuario usuario1 = new Usuario("Eduardo", "987654");
		Usuario usuario2 = new Usuario("Joao", "456789");
		Usuario usuario3 = new Usuario("Kaue", "zxcvbnm123");
		
		usuarios.add(admin);
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		usuarios.add(usuario3);
	};

	public List<Aluno> getAlunos() {
		return BancoDeDados.alunos;
	}

	public void adcionaAluno(String nome, String sobreNome, String dataNascimento, String cpf, String cep, String curso,
			String ano) {
		int anoInt = Integer.parseInt(ano);
		BancoDeDados.alunos.add(new Aluno(nome, sobreNome, dataNascimento, cpf, cep, curso, anoInt));
	}

	public void removeAluno(String idAluno) {

		int idInteger = Integer.parseInt(idAluno);

		Iterator<Aluno> iterator = alunos.iterator();

		while (iterator.hasNext()) {
			Aluno aluno = iterator.next();

			if (aluno.getIdAluno() == idInteger) {
				iterator.remove();
			}

		}

	}

	public Aluno getAlunoByID(String idAluno) {

		int idInteger = Integer.parseInt(idAluno);

		for (Aluno aluno : alunos) {

			if (aluno.getIdAluno() == idInteger) {
				return aluno;
			}

		}

		return null;

	}

	public void alteraAluno(String idAluno, String novoNome, String novoSobrenome, String novoCurso, String novoCep,
			String novoAno) {

		Aluno aluno = this.getAlunoByID(idAluno);
		
		aluno.setNome(novoNome);
		aluno.setSobreNome(novoSobrenome);
		aluno.setCurso(novoCurso);
		aluno.setCep(novoCep);
		aluno.setAno(novoAno);
		
	}

	public Usuario existeUsuario(String login, String senha) {
		
		Usuario user = null;
		for (Usuario usuario : usuarios) {
			if(usuario.getLogin().equals(login) && usuario.getSenha().equalsIgnoreCase(senha)) {
				user = usuario;
			}
		}
		
		return user;
	}
}
