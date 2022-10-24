#language:pt

Funcionalidade: login
  com esta funcionalidade o usuario conseguira efetuar o login na aplicação

  Como usuario ja cadastrado na aplicação
  Eu  quero inserir meus dados cadastrais
  Para  efetuar o login


  Contexto:
    Dado estiver na pagina de login

  @Login
  Cenário: realizar login na aplicação
    Quando inserir os dados do usuario
      | email                 | senha    |
      | teste337445@gmail.com | test1234 |
    Então devo visualizar o user "lucas me" logado

  @loginInvalido
  Esquema do Cenário: validar mensagem de erro ao inserir dados incorretos
    Quando inserir os dados do usuario
      | email           | senha   |
      | <dados_usuario> | <senha> |
    Então devo visualizar a mensagem de erro "Authentication failed."

    Exemplos:
      | dados_usuario         | senha    |
      | testeinv@gmail.com    | test1234 |
      | teste337445@gmail.com | senhainv |
