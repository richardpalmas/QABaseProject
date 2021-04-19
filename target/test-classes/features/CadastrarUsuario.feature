#language: pt
#enconding: utf-8

@CadastrarUsuario
Funcionalidade: Cadastrar Usuario

@CadastroUsuarioValido
Cenario: Cadastrar usuario valido 
Quando que eu acesse a aba admin
E acionar o botao add
E colocar no campo Employee Name "Fiona Grace"
E colocar no campo Username "Richard"
E colocar no campo Password "richard123"
E colocar no campo Confirm Password "richard123"
E acionar o botao save 
Entao o sistema cadastra o usuario "Richard"