import * as GETBooks from '../requests/GETBooks.request';
//2
describe('GetBooks',()=>{
    it('list all books',()=>{
        GETBooks.allBooks().should((Response)=>{
            expect(Response.status).to.eq(200);
            expect(Response.body).to.not.be.null;
        })
    })



})