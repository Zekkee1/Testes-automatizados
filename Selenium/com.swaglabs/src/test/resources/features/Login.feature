#language:pt
  Funcionalidade: Login
    o usuario devera efetuar o login na aplicação

    Como um usuario já cadastrado na aplicação
    Eu quero inserir meus dados cadastrais
    Para realizar o login na aplicação

    @testeswaglabs
  Cenário: realizar o login na aplicação
    Dado estiver na pagina de login
    Quando inserir os dados do usuario: "standard_user"
    Então devo visualizar a pagina "PRODUCTS"

