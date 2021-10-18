<h2 align="center">
    Elza Cast
</h2>
</p>
<p align="center">
    :studio_microphone: Uma aplicação Back End para o gerenciamento de contatos e alertas.
</p>

<p align="center">
    <a href="#computer-sobre-o-projeto">Sobre o projeto</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;
    <a href="#desktop_computer-sobre-o-bootcamp">Sobre o Bootcamp</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
    <a href="#rocket-tecnologias-utilizadas">Tecnologias utilizadas</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
    <a href="#clipboard-pré-requisitos">Pré-requisitos</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
    <a href="#zap-executando-a-aplicação">Executando a aplicação</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
    <a href="#dart-endpoints-da-aplicação">Endpoints da aplicação</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
    <a href="#sparkles-colaboradores">Colaboradores</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp; 
</p>

<h4 align="center"> 
:construction: Projeto em desenvolvimento... :construction:
</h4>

## :computer: Sobre o projeto
O projeto tem a finalidade de dar voz para vítimas de violência doméstica. Nesse sentido, por meio do aplicativo a vítima tem a opção de realizar chamadas de emergência (190) de forma rápida. Além disso, ela também pode alertar via SMS os contatos adicionados em sua lista em momentos de necessidade.

## :desktop_computer: Sobre o Bootcamp
A 3ª edição do Bootcamp da EloGroup é o maior ecossistema entre universitários e feras do mercado. O principal propósito do Bootcamp é destravar o potencial da nova geração de jovens que será o futuro do desenvolvimento digital dentro das empresas do país.

Leia mais sobre o Bootcamp [aqui](https://bootcamp.elogroup.com.br/).

## :rocket: Tecnologias utilizadas

O projeto utiliza as seguintes tecnologias:

- [PostgreSQL](https://www.postgresql.org/): é um sistema gerenciador de banco de dados objeto relacional, desenvolvido como projeto de código aberto;
- [Spring Boot](https://spring.io/): é uma ferramenta que visa facilitar o processo de configuração e publicação de aplicações que utilizem o ecossistema Spring.

## :clipboard: Pré-requisitos
- [Java 8](https://www.java.com/pt_BR/download/)

## :zap: Executando a aplicação
Execute a classe `ElzaCastApplication` localizada em `elzacast-backend/elza-cast/src/main/java/com/group9/elzacast/ElzaCastApplication.java`

## :dart: Endpoints da aplicação

## USUARIO logar
```bash
POST -  https://elza-cast.herokuapp.com/usuarios/logar 
Body {
      "telefone":"123-123",    
      "senha":"123-123"
}
```

## USUARIO cadastrar
```bash
POST - https://elza-cast.herokuapp.com/usuarios/cadastrar
Body {
     "usuario":"joao",
     "telefone":"123-123",
     "senha":"123-123"
}

```

## CONTATO cadastrar
```bash
POST - https://elza-cast.herokuapp.com/contato/cadastrar
Body {
      "nome": "maria",
      "telefone": "123465",
      "usuario": {
                "id": 1    
      }
}
```

## CONTATO get
```bash
GET - https://elza-cast.herokuapp.com/contato/{usuarioId}
RESPONSE: {
            "id": 1,
            "nome": "maria",
            "telefone": "123465",
            "usuario": {
                        "id": 1,
                        "usuario": "joao",
                        "telefone": "123-123"                                  
            }
}
```

## :sparkles: Colaboradores

<table>
  <tr>
    <td align="center"><a href="https://www.linkedin.com/in/carlos-henrique-costa-silva/"><img src="https://avatars3.githubusercontent.com/u/25915025?v=4" width="100px;" alt=""/><br /><sub><b>Carlos Henrique</b></sub></a><br /><a href="#code-carlos" title="Code">💻</a></td>
    <td align="center"><a href="https://www.linkedin.com/in/luisgaboardi/"><img src="https://avatars.githubusercontent.com/u/45673358?v=4" width="100px;" alt=""/><br /><sub><b>Luís Guilherme</b></sub></a><br /><a href="#code-luis" title="Code">💻</a></td>
    <td align="center"><a href="https://www.linkedin.com/in/rayane-vaz-255616200/"><img src="https://avatars.githubusercontent.com/u/91799941?v=4" width="100px;" alt=""/><br /><sub><b>Rayane Vaz</b></sub></a><br /><a href="#coordinator-rayane" title="Coordinator">📢</a></td>
    <td align="center"><a href="https://www.linkedin.com/in/josecarlosdeoliveira37/"><img src="https://avatars.githubusercontent.com/u/73854242?v=4" width="100px;" alt=""/><br /><sub><b>José Carlos</b></sub></a><br /><a href="#code-jose" title="Code">💻</a></td>
  </tr>
</table>

---

<p align="center" style="margin-top: 20px; border-top: 1px solid #eee; padding-top: 20px;">Feito com :purple_heart: por <strong> Equipe Elza Cast </strong> </p>
