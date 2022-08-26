import *  as DELETEBooks from '../requests/DELETEBooks.request'
import *  as GETBooks from '../requests/GETBooks.request'
import * as POSTBook from '../requests/POSTBooks.request'
describe('deletebooks',()=>{
    it('excluir livro',()=>{
        GETBooks.allBooks().then((resAllBooks)=>{
            
            DELETEBooks.deleteBooks(resAllBooks.body[0].id).should((resDeleteBook)=>{
                expect(resDeleteBook.status).to.eq(200);
            })  
        })
    })
    it('criar e deletar livro',()=>{
        POSTBook.addBook().then((resAddBook)=>{
            cy.log(resAddBook.body)
            DELETEBooks.deleteBooks(resAddBook.body.id).should((resDeleteBook)=>{
                expect(resDeleteBook.status).to.eq(200)
            })
        })
    })
})