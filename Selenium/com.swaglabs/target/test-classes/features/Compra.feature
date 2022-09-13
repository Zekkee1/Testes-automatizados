#language:pt
  Funcionalidade: Compra
    com esta funcionalidade o usuario podera adicionar produtos ao carrinho e realizar uma compra


    Cenario: validar compra
      Dado estiver logado na aplicação
      Quando adicionar os produtos ao carrinho
      E inserir os dados de envio
      Então a compra devera ser realizada
