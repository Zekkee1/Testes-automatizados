Feature: Chockout
  com esta funcionalidade o usuario podera efetuar a compra de um produto selecionado


  Como usuario ja cadastrado na aplicação
  Eu  quero selecionar um produto
  Para  efetuar uma compra

  Background:
    Given estiver logado na aplicação

  @checkout
    Scenario: realizar uma compra
      When selecionar um produto e confirmar meus dados
      Then deve visualizar a mensagem "Your order on My Store is complete." de compra efetuada com sucesso