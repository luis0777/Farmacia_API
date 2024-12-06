# API para Gerenciamento de Itens de Farmácia

Esta é uma API desenvolvida em **Spring Boot** para gerenciar itens de uma farmácia. Ela fornece funcionalidades para **criar**, **ler**, **atualizar** e **excluir (CRUD)** itens no sistema, utilizando boas práticas de desenvolvimento em Java.

## 🛠️ Funcionalidades

A API oferece os seguintes endpoints:

### 1. **Listar todos os itens**
- **Endpoint:** `GET /api/items`
- **Descrição:** Retorna uma lista com todos os itens cadastrados.

### 2. **Obter item por ID**
- **Endpoint:** `GET /api/items/{id}`
- **Descrição:** Retorna os detalhes de um item específico com base no seu ID.

### 3. **Criar um novo item**
- **Endpoint:** `POST /api/items`
- **Descrição:** Adiciona um novo item ao sistema.

### 4. **Atualizar um item existente**
- **Endpoint:** `PUT /api/items/{id}`
- **Descrição:** Atualiza os dados de um item específico.

### 5. **Excluir um item**
- **Endpoint:** `DELETE /api/items/{id}`
- **Descrição:** Remove um item do sistema com base no seu ID.

---

## 🧩 Estrutura do Projeto

O projeto segue a arquitetura **MVC (Model-View-Controller)**, organizada da seguinte forma:

### 📂 Controller
- Responsável por receber as requisições HTTP, processá-las e retornar as respostas apropriadas.
- Arquivo: `ItemController.java`

### 📂 Service
- Contém a lógica de negócios da aplicação. É responsável por intermediar as ações entre o Controller e o Repository.
- Arquivo: `ItemService.java`

### 📂 Repository
- Interface que interage diretamente com o banco de dados para realizar operações de CRUD.
- Arquivo: `ItemRepository.java`

### 📂 Entity
- Define os modelos de dados utilizados na aplicação e mapeia as entidades para o banco de dados.
- Arquivo: `Item.java`

---

## 🛡️ Tecnologias Utilizadas

- **Spring Boot:** Framework principal para criação da API.
- **Maven:** Gerenciador de dependências.
- **Java:** Linguagem de programação.
- **SQL Server:** Banco de dados utilizado.
- **Docker:** Para gerenciar e executar o banco de dados SQL Server.
