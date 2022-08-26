import * as PUTBook from '../requests/PUTBooks.request'
import * as POSTBook from '../requests/POSTBooks.request'

describe('PutBooks',()=>{
    it('update book',()=>{ 
        POSTBook.addBook().then((resAddBook)=>{
            cy.log(resAddBook.body)
            PUTBook.PUTBook(resAddBook.body.id).should((resPUTbook)=>{
                expect(resPUTbook.status).to.eq(200)
                expect(resPUTbook.body.title).to.eq('livro update')
            })
            })
        })
    })




