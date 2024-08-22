

### Parte 1 | Arquitetura Back-End

1. **Setup do Projeto**:
   - Use o Spring Initializr para criar um novo projeto Spring Boot com as dependências: `Spring Web`, `Spring Data JPA`, e `PostgreSQL Driver`.
   - Configure o `application.properties` para conectar ao PostgreSQL.

2. **Entidade "Produto"**:
   - Crie a classe `Produto` com os atributos `id`, `nome`, `descricao`, e `valor`.
   - Anote a classe com `@Entity` e `@Table` para mapear para a tabela no banco de dados.

3. **Repositório**:
   - Crie a interface `ProdutoRepository` que estenda `JpaRepository<Produto, Long>` para as operações CRUD básicas.

4. **Serviço**:
   - Crie a classe `ProdutoService` para encapsular a lógica de negócio e manipulação de dados.

5. **Controlador**:
   - Crie o controlador `ProdutoController` com endpoints para criar, listar, atualizar e deletar produtos.

6. **Autenticação e Autorização**:
   - Implemente segurança básica usando Spring Security.
   - Use JWT ou outra forma de autenticação para proteger os endpoints.

7. **Logging**:
   - Adicione um middleware para logging das requisições e respostas usando um `Filter` ou `Interceptor` do Spring.

### Parte 2 | Arquitetura Front-End

1. **Setup do Projeto**:
   - Crie o projeto React usando `create-react-app`.
   - Configure Axios para realizar as chamadas HTTP para o Back-End.

2. **Componentes**:
   - **ProdutoList**: Exibe a lista de produtos e permite remoção.
   - **ProdutoForm**: Permite adicionar e editar produtos.

3. **Estado e Efeitos**:
   - Use `useState` e `useEffect` para gerenciar o estado dos produtos e realizar chamadas à API.

4. **Integração com o Back-End**:
   - Implemente chamadas à API para listar, criar, editar e remover produtos.

5. **Estilização**:
   - Use CSS básico ou uma biblioteca como Bootstrap para estilizar a aplicação.

### Parte 3 | Infraestrutura

1. **Dockerização**:
   - Crie um `Dockerfile` para o Back-End, configurando a imagem do Java e adicionando o `jar` gerado pelo Spring Boot.
   - Crie um `Dockerfile` para o Front-End, utilizando uma imagem Node para build e servindo com Nginx.

2. **Docker Compose**:
   - Crie um arquivo `docker-compose.yml` que define três serviços: `db`, `backend`, e `frontend`.
   - Configure o serviço `db` com a imagem oficial do PostgreSQL.
   - Configure volumes para persistir os dados do banco e para facilitar o desenvolvimento.

