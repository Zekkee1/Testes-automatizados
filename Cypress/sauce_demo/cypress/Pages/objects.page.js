
    
    var usuario={
        username:"standard_user",
        password:"secret_sauce",
        blockuser:"locked_out_user"
    }
class objects{
    //realizando login inserindo os dados validos e clicando no botão submit
    loginusuario(){
        cy.visit("https://www.saucedemo.com")
        cy.get('div').should('have.class','login_logo')
        cy.get('#user-name').type(usuario.username)
        cy.get('#password').type(usuario.password)
        cy.get('#login-button').click()
        cy.get('.title').should('have.text',"Products")
        }
    //inserindo username invalido
    userinvalido(){
        cy.visit("https://www.saucedemo.com")
        cy.get('#login-button').click()
        cy.get('h3').should('have.text',"Epic sadface: Username is required")     
    }
    //inserindo senha invalida
    senhainvalida(){
        cy.visit("https://www.saucedemo.com")
        cy.get('#user-name').type(usuario.username)
        cy.get('#login-button').click()
        cy.get('h3').should('have.text',"Epic sadface: Password is required")     
    }
    //inserindo usuario bloqueado
    usuariobloqueado(){
        cy.visit("https://www.saucedemo.com")
        cy.get('#user-name').type(usuario.blockuser)
        cy.get('#password').type(usuario.password)
        cy.get('#login-button').click()
        cy.get('h3').should('have.text',"Epic sadface: Sorry, this user has been locked out.") 

    }
    //realizando compra
    realizarcompra(){
        cy.get('#add-to-cart-sauce-labs-backpack').click()
        cy.get('.shopping_cart_link').click()
        cy.get('#checkout').click()
        cy.get('#first-name').type("teste")
        cy.get('#last-name').type("teste")
        cy.get('#postal-code').type("00000")
        cy.get('#continue').click()
        cy.get('.title').should('have.text',"Checkout: Overview")
        cy.get('#finish').click()
    }
    
}

export default objects;