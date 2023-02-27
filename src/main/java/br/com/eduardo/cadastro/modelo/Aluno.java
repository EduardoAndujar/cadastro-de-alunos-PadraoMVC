package br.com.eduardo.cadastro.modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Aluno {

	private String nome;
	private String sobreNome;
	private LocalDate dataNascimento;
	private int idade;
	private String cpf;
	private String cep;
	private String curso;
	private int ano;
	private int idAluno;
	private static int proximoIdDaClasse = 0;
	
	DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public Aluno(String nome, String sobreNome, String dataNascimento, String cpf, String cep, String curso, int ano) {
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.dataNascimento = LocalDate.parse(dataNascimento, formatoData);
		this.cpf = cpf;
		this.cep = cep;
		this.curso = curso;
		this.ano = ano;

		idade = (int) ChronoUnit.YEARS.between( this.dataNascimento, LocalDate.now());
		
		Aluno.proximoIdDaClasse++;
		idAluno = Aluno.proximoIdDaClasse;
	}

	public String getNome() {
		return nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}
	
	public String getDataNascimento() {
		return formatoData.format(dataNascimento);
	}
	
	public int getIdade() {
		return idade;
	}

	public String getCpf() {
		return cpf;
	}

	public String getCep() {
		return cep;
	}

	public String getCurso() {
		return curso;
	}

	public int getAno() {
		return ano;
	}

	public int getIdAluno() {
		return idAluno;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public void setAno(String ano) {
		
		this.ano = Integer.parseInt(ano);
	}

}
