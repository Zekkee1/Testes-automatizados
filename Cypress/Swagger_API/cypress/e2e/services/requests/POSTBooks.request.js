
const payloadAddBook = require('../payloads/addbook.json')
function addBook (){
    return cy.request({
        method: 'POST',
        url: 'Books',
        failOnStatusCode: false,
        body: payloadAddBook
    })
}
export {addBook};