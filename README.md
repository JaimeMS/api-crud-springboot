# api-crud-springboot
Exemplo de API para operação de CRUD com Java Spring Boot

NA CRIAÇÃO DO PROJETO FOI ADICIONADA AS SEGUINTES DEPENDÊNCIAS

- Lombok
- Spring Data JPA
- Spring Web
- Spring Boot DevTools
- MySql Driver

NO ARQUIVO application.properties É NECESSÁRIO FAZER A CONFIGURAÇÃO DA STRING DE CONEXÃO COM O BANCO DE DADOS
- spring.datasource.url=jdbc:mysql://localhost:3306/crud
- spring.datasource.dbcp2.driver-class-name=com.mysql.cj.jdbc.Driver
- spring.datasource.username=root
- spring.datasource.password=12345
 
- spring.jpa.hibernate.ddl-auto=update
- spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5InnoDBDialect
- spring.jpa.show-sql: true

- spring.jpa.properties.hibernate.show_sql=true
- spring.jpa.properties.hibernate.format_sql=true

DEPOIS SEGUE COM A CRIAÇÃO DAS ENTITY Produto
- a entidade Produto foi anotada com as tags do JPA e Lombok
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "produtos")
@Id
@GeneratedValue(strategy = GenerationType.AUTO)

DEPOIS SEGUE COM A CRIAÇÃO DA INTERFACE  DE REPOSITORIO DO PRODUTO E DO CONTROLLER
@RestController
@RequestMapping("api/produtos")

No controller ProdutoController foi injetado o ProdutoRepository através da tag @Atuwired
Tags da convençao RESTFull para fazer as uperações de crud
@PostMapping
@GetMapping
@PutMapping
@DeleteMapping
