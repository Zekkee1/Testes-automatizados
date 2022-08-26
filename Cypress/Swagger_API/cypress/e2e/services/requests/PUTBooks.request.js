

const payloadUPbook =  require('../payloads/NovoLivro.json')
function PUTBook(idBook){
    return cy.request({
        method: 'PUT',
        url: `Books/${idBook}`,
        failOnStatusCode: false,
        body : payloadUPbook
    })
}
export {PUTBook};