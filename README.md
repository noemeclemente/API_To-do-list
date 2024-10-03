# API para Gerenciar Tarefas (CRUD)

Esta API é um projeto desenvolvido com o objetivo é fornecer uma interface para gerenciar tarefas (CRUD) de maneira simples e eficaz.

## Tecnologias Utilizadas

- **Spring Boot**: Framework para construção de aplicações Java.
- **Spring MVC**: Para o desenvolvimento da API REST.
- **Spring Data JPA**: Facilita a manipulação do banco de dados.
- **SpringDoc OpenAPI 3**: Geração de documentação para a API.
- **MySQL**: Sistema de gerenciamento de banco de dados relacional.

## Práticas Adotadas

Neste projeto, foram seguidas diversas boas práticas de desenvolvimento, incluindo:

- **SOLID**: Princípios de design de software que promovem a manutenibilidade e escalabilidade.
- **DRY (Don't Repeat Yourself)**: Minimiza a duplicação de código.
- **YAGNI (You Aren't Gonna Need It)**: Evita adicionar funcionalidades que não são necessárias no momento.
- **KISS (Keep It Simple, Stupid)**: Mantém o design e a implementação simples.
- **API REST**: Estrutura para a comunicação entre cliente e servidor.
- **Consultas com Spring Data JPA**: Utilização de consultas de forma eficiente.
- **Injeção de Dependências**: Facilita a gestão de dependências.
- **Tratamento de Respostas de Erro**: Garante que erros sejam tratados adequadamente.
- **Geração Automática do Swagger**: Facilita a documentação e o teste da API.

## Como Executar o Projeto

Siga as etapas abaixo para executar a API localmente:

1. **Clone o repositório**:
    ```bash
    git clone <URL_do_repositório>
    cd <nome_do_diretorio>
    ```

2. **Construa o projeto**:
    ```bash
    ./mvnw clean package
    ```

3. **Execute a aplicação**:
    ```bash
    java -jar target/todolist-0.0.1-SNAPSHOT.jar
    ```

4. **Acesso à API**: 
   A documentação do Swagger pode ser visualizada em [http://localhost:8081/swagger-ui.html](http://localhost:8081/swagger-ui.html).

## Endpoints da API

Utilize a ferramenta `Postman` para realizar as requisições HTTP conforme descrito abaixo.

### Criar Tarefa

```bash
http POST :8081/todos nome="Todo 1" descricao="Desc Todo 1" prioridade=1
```

### Resposta
```
[
  {
    "descricao": "Desc Todo 1",
    "id": 1,
    "nome": "Todo 1",
    "prioridade": 1,
    "realizado": false
  }
]
```
### Listar Tarefas
```
http GET :8081/todos
```
### Resposta
```
[
  {
    "descricao": "Desc Todo 1",
    "id": 1,
    "nome": "Todo 1",
    "prioridade": 1,
    "realizado": false
  }
]
```
### Atualizar Tarefa
```
http PUT :8081/todos/1 nome="Todo 1 Up" descricao="Desc Todo 1 Up" prioridade=2
```
### Resposta
```
[
  {
    "descricao": "Desc Todo 1 Up",
    "id": 1,
    "nome": "Todo 1 Up",
    "prioridade": 2,
    "realizado": false
  }
]
```
### Remover Tarefa
```
http DELETE :8081/todos/1
```
### Resposta
```
[]
```
## Contribuições
Contribuições são bem-vindas! Sinta-se à vontade para abrir uma issue ou enviar um pull request.





