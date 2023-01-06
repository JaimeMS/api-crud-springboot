![GitHub repo size](https://img.shields.io/github/repo-size/JaimeDevS/api-crud-springboot?style=plastic)
![GitHub](https://img.shields.io/github/license/JaimeDevS/api-crud-springboot?style=plastic)

# CRUD com Java Spring Boot

Exemplo de API para operação de CRUD com Java Spring Boot

![spring](https://github.com/JaimeDevS/spring-boot-docker/blob/master/spring.png) 

## Pré-requisitos

* [Lombok](https://projectlombok.org/setup/maven "Lombok")  - framework para eliminar a verbosidade.
* [Spring Data JPA](https://spring.io/projects/spring-data-jpa "JPA")  - framework que tornar a integração de aplicações Spring com a JPA (Java Persistence API).  
* [Spring Web](https://mvnrepository.com/artifact/org.springframework/spring-web "Spring Web]")  - framework que permite a visualização de dados geográficos armazenados em um servidor remoto.
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/1.5.16.RELEASE/reference/html/using-boot-devtools.html "Docker hub")  - ferramenta para reiniciar automaticamente a aplicação durante o desenvolvimento.
* [MySql Driver](https://spring.io/guides/gs/accessing-data-mysql/ "MySql") - Driver de conxão com o Banco de Dado MySql.
* [JDK](https://www.oracle.com/br/java/technologies/downloads/#java17) - JDK necessário para executar a aplicação.
* [Spring Tools](https://spring.io/tools) - Ferramenta para o desenvolvimento.

## Começando
- Acesse o link para fazer o download da aplicação pré estruturada, nele já é possível baixar todas as dependências do projeto.
```
https://start.spring.io/
```


- No arquivo application.properties é necessário fazer a configuração da string de conexão com o banco de dados
```
spring.datasource.url=jdbc:mysql://localhost:3306/crud
spring.datasource.dbcp2.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.username=root
spring.datasource.password=12345

spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5InnoDBDialect
spring.jpa.show-sql: true

spring.jpa.properties.hibernate.show_sql=true
spring.jpa.properties.hibernate.format_sql=true
```

- Depois segue com a criação da entidade Produto e anotar com as Annotations do JPA e Lombok
```
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "produtos")
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
```
 - Depois segue com a criação da interface  de repositório do produto e do controller
 ```
@RestController
@RequestMapping("api/produtos")
```
- No controller ProdutoController foi injetado o ProdutoRepository através da tag @Atuwired
Tags da convençao RESTFull para fazer as uperações de crud
```
@PostMapping
@GetMapping
@PutMapping
@DeleteMapping
```
