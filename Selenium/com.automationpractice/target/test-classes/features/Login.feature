Feature: login
  com esta funcionalidade o usuario conseguira efetuar o login na aplicação

  Como usuario ja cadastrado na aplicação
  Eu  quero inserir meus dados cadastrais
  Para  efetuar o login


  Background:
    Given estiver na pagina de login

  @Login
  Scenario: realizar login na aplicação
    When inserir os dados do usuario
      | email                 | senha    |
      | teste337445@gmail.com | test1234 |
    Then devo visualizar o user "lucas me" logado

  @invalidLogin
  Scenario Outline: validar mensagem de erro ao inserir dados incorretos
    When inserir os dados do usuario
      | email           | senha   |
      | <dados_usuario> | <senha> |
    Then devo visualizar a mensagem de erro "Authentication failed."

    Examples:
      | dados_usuario         | senha    |
      | testeinv@gmail.com    | test1234 |
      | teste337445@gmail.com | senhainv |
