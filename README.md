# Cadastro de alunos com o Padrão MVC em JAVA

# Tecnologias utilizadas
## Back end
- Java
- Servlet's
- Filter's
- Apache Tomcat
- Apache Maven
## Front end
- HTML
- CSS
- JavaScript
- JQuery

# Sobre o projeto

Projeto que visa a simulação de um sistema de cadastro de alunos em geral com login para permissão. O objetivo foi apenas praticar os conceitos do padrão MVC em Java, no qual foi utilizado um servlet como controlador e foi aplicado dois Filters para a validação do login e monitoramento da requisição HTTP. Ademais, simulou-se um banco de dados na classe 'BancoDeDados' da própria aplicação, ou seja, é reinicializada sempre que o programa for reiniciado. Para a execução da aplicação foi utilizado o container Apache Tomcat de versão 9.0.69. Para o gerenciamento das dependências foi utilizado o Apache Maven.

Para a página, foram utilizados as linguagens de marcação HTML e CSS, bem como a linguagem de programação JavaScript para fazer a validação de alguns dados de entrada e a ferramenta JQuery para as máscaras de nome, sobrenome, data, cpf e cep no forms de cadastro. Vale ressaltar que para a utilização da biblioteca JSTL (Java Standard Tag Library) as páginas Web são da extensão '.jsp' (Java Server Pages).

## Layout web

- Login:
![Web 1](https://github.com/EduardoAndujar/assets/blob/main/cadastro-alunos-MVC-1.jpg)

- Cadastro de alunos:
![Web 2](https://github.com/EduardoAndujar/assets/blob/main/cadastro-alunos-MVC-2.jpg)

- Lista de alunos:
![Web 3](https://github.com/EduardoAndujar/assets/blob/main/cadastro-alunos-MVC-3.jpg)

- Editar aluno:
![Web 4](https://github.com/EduardoAndujar/assets/blob/main/cadastro-alunos-MVC-4.jpg)

## Modelo conceitual
Foi baseado no padrão MVC para o modelo de fluxo do projeto, no qual é mostrado a seguir:

### Cadastro novo produto
Esse modelo de fluxo é responsável por cadastrar um novo produto a partir de um formulário e, em seguida, listar os produtos cadastrados. Esse mesmo modelo é usado para deletar um produto da lista.
![Diagrama 1](https://github.com/EduardoAndujar/assets/blob/main/DiagramaSverlet1.svg)

### Alterar dados de um produto
Esse modelo de fluxo é responsável por acessar uma página para alterar as informações de um produto. Assim que é feito essas alterações, é listado os produtos cadastrados.
![Diagrama 2](https://github.com/EduardoAndujar/assets/blob/main/DiagramaServlet2.svg)

# Como executar o projeto

Pré-requisitos: Java 17, Apache Tomcat v9.0 e Eclipse (ou outra IDE para iniciar o Servidor Tomcat)

```bash
# clonar repositório
git clone https://github.com/EduardoAndujar/cadastro-de-produtos-Servlet.git
```

## Executar no Eclipse
- Em servers, criar um servidor do tipo Tomcat v9.0 Server
- Adicionar este projeto no servidor criado (Add and Remove resources to the server)
- Iniciar o servidor (Restart the server)
- Por fim, em um navegador, acesse a página http://localhost:8080/produtos/home

# Autor

Eduardo Casarotto Andujar

https://www.linkedin.com/in/eduardo-andujar/

