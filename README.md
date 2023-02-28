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

### Modelo de fluxo do projeto
![Diagrama 1](https://github.com/EduardoAndujar/assets/blob/main/DiagramaCadastroAlunos.svg)
O modelo é baseado no Padrão MVC. Dessa forma, cada requisição realizada pelo navegador é passada pelos filtros MonitoramentoRequisicaoFilter e AutorizacaoFilter que, respectivamente, monitora o tempo de execução de cada requsição e verifica se o usuário está logado (caso não, o redireciona para o Login).

Após a passagem pelos filtros, o Controlador (ControlerServlet) direciona para a ação necessária (Classe Java) para a execução de suas funções, que podem se comunicar com a classes modelos BancoDeDados, Aluno ou Usuario e fazer um direcionamento para uma página .jsp.

# Como executar o projeto

## Configurações iniciais:
Pré-requisitos: Java 17, Apache Tomcat v9.0, Apache Maven e Eclipse (ou outra IDE para iniciar o Servidor Tomcat)

```bash
# clonar repositório
git clone https://github.com/EduardoAndujar/cadastro-de-alunos-PadraoMVC.git
```

## Executar no Eclipse
- Em servers, criar um servidor do tipo Tomcat v9.0 Server
- Adicionar este projeto no servidor criado (Add and Remove resources to the server)
- Iniciar o servidor (Restart the server)
- Em um navegador, acesse a página http://localhost:8080/Gerenciador_1.0.0/controler?acao=FormLogin
- Fazer o login com algum dos seguintes usuários {Login:admin Senha:123456 || Login:Eduardo Senha:987654 || Login:Joao Senha:456789 || Login:Kaue Senha:zxcvbnm123}
- Pronto! Agora é só navegar pelos links!

# Autor

Eduardo Casarotto Andujar

https://www.linkedin.com/in/eduardo-andujar/

