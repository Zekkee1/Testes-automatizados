#language:pt
#encondi
  Funcionalidade: checkout
  com esta funcionalidade o usuario podera efetuar a compra de um produto selecionado


  Como usuario ja cadastrado na aplicação
  Eu  quero selecionar um produto
  Para  efetuar uma compra

  Background:
    Dado estiver logado na aplicação

  @checkout
    Cenário: realizar uma compra
      Quando selecionar um produto e confirmar meus dados
      Então deve visualizar a mensagem "Your order on My Store is complete." de compra efetuada com sucesso