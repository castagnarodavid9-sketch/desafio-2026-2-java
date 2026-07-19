# Sistema de Gestão de Solicitações de Documentos Acadêmicos

Sistema desenvolvido para gerenciar solicitações de documentos acadêmicos, permitindo o cadastro de alunos, cursos, tipos de documentos e o acompanhamento do status das solicitações.

Este projeto está sendo desenvolvido com foco em aprendizado de **Java**, **Spring Boot** e **PostgreSQL**, seguindo boas práticas de desenvolvimento e arquitetura em camadas.

## 📖 Objetivo

O objetivo deste projeto é simular um sistema utilizado por instituições de ensino para controlar solicitações de documentos acadêmicos, como:

- Histórico Escolar
- Declaração de Matrícula
- Certificados
- Outros documentos

Além disso, o projeto está sendo utilizado como portfólio para estudos e processos seletivos.

---

## 🚀 Tecnologias utilizadas

- Java 25
- Spring Boot 3
- Spring Web
- Spring Data JPA
- Thymeleaf
- PostgreSQL
- Maven
- HTML5
- CSS3
- IntelliJ IDEA

---

## 🏗 Arquitetura

O projeto segue uma arquitetura em camadas:

```
Controller
    ↓
Service
    ↓
Repository
    ↓
Banco de Dados (PostgreSQL)
```

Cada camada possui uma responsabilidade específica:

- **Controller:** recebe as requisições.
- **Service:** contém as regras de negócio.
- **Repository:** realiza o acesso ao banco de dados.
- **Entity:** representa as tabelas do banco.

---

## 📂 Estrutura do projeto

```
src
├── main
│   ├── java
│   │   └── br.com.documentos.api
│   │       ├── controller
│   │       ├── entity
│   │       ├── repository
│   │       ├── service
│   │       └── DocumentosApplication
│   │
│   └── resources
│       ├── static
│       │   └── css
│       ├── templates
│       └── application.properties
```

---

## 🗄 Banco de dados

O projeto utiliza PostgreSQL.

Principais entidades:

- Aluno
- Curso
- Status
- TipoDocumento
- Solicitação
- Histórico
- Auditoria

Relacionamentos utilizando JPA/Hibernate.

---

## Funcionalidades implementadas

### Alunos

- Cadastro
- Validação de campos

### Cursos

- Cadastro

### Status

- Cadastro
- Relacionamento com Solicitações

### Solicitações

- Cadastro
- Associação com aluno
- Associação com curso
- Associação com tipo de documento
- Controle de status

### Histórico

- Registro das alterações de status da solicitação

---

## Funcionalidades em desenvolvimento

- Login de usuários
- Controle de permissões
- Dashboard
- Filtros de pesquisa
- Relatórios
- Auditoria
- Arquivos para usar como API REST

---

## Aprendizados durante o desenvolvimento

Durante este projeto foram estudados diversos conceitos do ecossistema Spring:

- Spring Boot
- Injeção de Dependência
- Inversão de Controle (IoC)
- Spring Data JPA
- Hibernate
- Mapeamentos (@Entity)
- Relacionamentos
- Repository Pattern
- Services
- Controllers
- Validações
- Thymeleaf
- Integração com PostgreSQL
- Organização em camadas
- Boas práticas de desenvolvimento

---

## Como executar o projeto

### Clone o repositório

```bash
git clone https://github.com/castagnarodavid9-sketch/desafio-2026-2-java.git
```

### Entre na pasta

```bash
cd desafio-2026-2-java
```

### Configure o banco

Crie um banco PostgreSQL e altere o arquivo:

```
src/main/resources/application.properties
```

Exemplo:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/documentos
spring.datasource.username=postgres
spring.datasource.password=senha

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### Execute

```bash
mvn spring-boot:run
```

ou execute a classe:

```
DocumentosApplication
```

---

## Interface

A interface está sendo construída utilizando:

- HTML
- CSS
- Thymeleaf

com foco em simplicidade e organização.

---

## Melhorias futuras

- API REST completa
- JWT
- Spring Security
- Paginação
- Upload de documentos
- Geração de PDF + Relatórios Jasper
- Docker
- Testes unitários
- Testes de integração
- Deploy

---

## Autor

**David Castagnaro**

Estudante de Análise e Desenvolvimento de Sistemas, utilizando este projeto para aprofundar conhecimentos em Java, Spring Boot e PostgreSQL.

---

## Licença

Projeto desenvolvido para fins de estudo e portfólio.
