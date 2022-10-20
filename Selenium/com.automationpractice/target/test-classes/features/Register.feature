Feature: cadastro
  com esta funcionalidade o usuario conseguira efetuar o cadastro na aplicação

  Como novo usuario
  Eu quero inserir meus dados
  Para realizar o cadastro na aplicação


  Background:
    Given estiver na pagina de registro

  @register
  Scenario: realizar cadastro na aplicacao
    When inserir todos os dados obrigatorios para registro
      | email                    | First_name | last_name | password |
      | teste337445535@gmail.com | lucas      | men       | teste123 |
    Then devo visualizar o usuario "lucas men" logado

  @registerEmailFailure
  Scenario: validar mensagem de erro ao inserir email invalido
    When inserir um email invalido
      | email     |
      | teste.com |
    Then devo visualizar a mensagem de error "Invalid email address."




