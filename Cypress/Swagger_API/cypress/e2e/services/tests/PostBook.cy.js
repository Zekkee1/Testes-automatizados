import * as POSTBook from '../requests/POSTBooks.request'


describe('postbooks',()=>{
    it('adicionar livro',()=>{
        POSTBook.addBook().should((Response)=>{
            expect(Response.status).to.eq(200);
            expect(Response.body.title).to.eq("A arte da guerra");

        })


    })
})