
# CRUD Application

Este projeto foi iniciado com a intenção de treinar como aplicar um CRUD básico com integração com banco de dados e interação via Insomnia.



## Referência

 - [Awesome Readme Templates](https://awesomeopensource.com/project/elangosundar/awesome-README-templates)

 - [Live Coding: CRUD com Java Spring - Aprendendo na prática](https://www.youtube.com/watch?v=tP6wtEaCnSI&t=4569s)


## Documentação da API

#### Retorna todos os produtos

```http
  GET /product
```

#### Cadastra um novo produto

```http
  POST /product
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `name`      | `string` | **Obrigatório**. O nome do produto que você quer alterar |
| `price_in_cents`      | `integer` | **Obrigatório**. O valor do produto que você quer alterar |   

#### Altera um produto enviando o ID no body do JSON

```http
  PUT /product
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `string` | **Obrigatório**. O ID do produto que você quer alterar |
| `name`      | `string` | **Obrigatório**. O nome do produto que você quer alterar |
| `price_in_cents`      | `integer` | **Obrigatório**. O valor do produto que você quer alterar |


#### Deleta um produto enviando o ID no path da requisição

```http
  DELETE /product/{id}
```





## Stack utilizada

**Back-end:** Java 17, Spring Boot

