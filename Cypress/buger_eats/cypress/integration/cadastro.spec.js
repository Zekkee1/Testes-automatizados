
describe('home page', ()=>{
    it("app deve estar online", ()=>{
        cy.viewport(1920, 1080)
        cy.visit("https://buger-eats.vercel.app")
        cy.get('a[href="/deliver"]').click()
        cy.get('h1').should("have.text", "Cadastre-se para  fazer entregas" )
        //massa de teste
        var entregador={
            nome:"teste teste",
            cpf:"00000014141",
            email:"teste@mail.com",
            whatsapp:"11999999999",
            endereco:{
                cep:"08050815",
                rua:"Trecho Ivo Correa",
                numero: "2",
                complemento:"casa",
                bairro:"Jardim das Camélias",
                cidade:"São Paulo/SP"

            },
            metodo_entrega:"Moto",
            cnh:"cnh-digital.jpg"
        }
        //preenchimento dos dados ---------------------------------------------
        cy.get('input[placeholder="Nome completo"]').type(entregador.nome)
        cy.get('input[placeholder="CPF somente números"]').type(entregador.cpf)
        cy.get('input[placeholder="E-mail"]').type(entregador.email)
        cy.get('input[placeholder="Whatsapp"]').type(entregador.whatsapp)
        cy.get('input[name="postalcode"]').type(entregador.endereco.cep)
        // buscador de cep------------------------------------------
        cy.get('input[value="Buscar CEP"]').click()
        //validação do preenchimento automatico --------------------------------
        cy.get('input[name="address"]').should("have.value","Trecho Ivo Correa")
        cy.get('input[name="district"]').should("have.value","Jardim das Camélias")
        cy.get('input[name="city-uf"]').should("have.value","São Paulo/SP")
        //-----------------------------------------------------------------------
        //preenchimento dos dados -----------------------------------------------
        cy.get('input[name="address-number"]').type(entregador.endereco.numero)
        cy.get('input[name="address-details"]').type(entregador.endereco.complemento)
        //selecionar metodo de entrega baseado na variavel entregador.cnh
        cy.contains(".delivery-method li", entregador.metodo_entrega).click()
        // inserir imagem no campo da cnh
        cy.get('input[style="display: none;"]').attachFile(entregador.cnh)
        cy.get('.button-success').click()
        cy.get('.swal2-container .swal2-html-container')
            .should("have.text",'Recebemos os seus dados. Fique de olho na sua caixa de email, pois e em breve retornamos o contato.')

    })
})