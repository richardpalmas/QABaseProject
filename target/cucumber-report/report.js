$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Fazer login",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.scenario({
  "name": "Login Valido",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@Login"
    },
    {
      "name": "@LoginSucesso"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que eu preencha o campo username com \"Admin\"",
  "keyword": "Dado "
});
formatter.match({
  "location": "stepsDefinitions.LoginSteps.queEuPreenchaOCampoUsernameCom(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "que eu preencha o campo password com \"admin123\"",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.LoginSteps.queEuPreenchaOCampoPasswordCom(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clique no botao entrar",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.LoginSteps.cliqueNoBotaoEntrar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema apresenta o usuario logado",
  "keyword": "Entao "
});
formatter.match({
  "location": "stepsDefinitions.LoginSteps.oSistemaApresentaOUsuarioLogado()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});