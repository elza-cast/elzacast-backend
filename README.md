## USUARIO logar
######   POST -  https://elza-cast.herokuapp.com/usuarios/logar 
######     Body{
######              "telefone":"123-123",    
######            "senha":"123-123"
######           }
######
## USUARIO cadastrar
######  POST - https://elza-cast.herokuapp.com/usuarios/cadastrar
######     Body{
######            "usuario":"joao",
######            "telefone":"123-123",
######            "senha":"123-123"
######             }
## CONTATO cadastrar
######  POST - https://elza-cast.herokuapp.com/contato/cadastrar
######       Body{
######            "nome": "maria",
######             "telefone": "123465",
######             "usuario": {
######                          "id": 1    
######                         }
## CONTATO get
######   GET - https://elza-cast.herokuapp.com/contato/{usuarioId}
######      RESPONSE: {
######                  "id": 1,
######                    "nome": "maria",
######                    "telefone": "123465",
######                    "usuario": {
######                                 "id": 1,
######                                 "usuario": "joao",
######                                  "telefone": "123-123"                                  
######                               }
######                   }

