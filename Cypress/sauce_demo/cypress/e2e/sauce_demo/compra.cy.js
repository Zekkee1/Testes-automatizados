import objects from "../../Pages/objects.page"


describe('login',()=>{
    var obj = new objects()

    beforeEach(()=>{
        obj.loginusuario()

    })
    it('adicionar produto ao carrinho',()=>{
        //adicionando produto ao carrinho
        cy.get('#add-to-cart-sauce-labs-backpack').click()
        cy.get('#shopping_cart_container').click()
        cy.get('.inventory_item_name').should('have.text',"Sauce Labs Backpack")    
    })
    it('realizar compra',()=>{
        //realizando compra
        obj.realizarcompra()
        cy.get('.complete-header').should('have.text',"THANK YOU FOR YOUR ORDER")
    })
    
})