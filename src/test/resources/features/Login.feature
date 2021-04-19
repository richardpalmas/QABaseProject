#language: pt
#enconding: utf-8

@Login
Funcionalidade: Fazer login

@LoginInvalido
Cenario: Login Invalido
Dado que eu preencha o campo username com "ad"
E que eu preencha o campo password com "123456"
E clique no botao entrar
Entao o sistema apresenta a mensagem de usuario invalido

@LoginSucesso
Cenario: Login Valido
Dado que eu preencha o campo username com "Admin"
E que eu preencha o campo password com "admin123"
E clique no botao entrar
Entao o sistema apresenta o usuario logado 