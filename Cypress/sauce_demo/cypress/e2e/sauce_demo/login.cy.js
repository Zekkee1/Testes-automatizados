import objects from "../../Pages/objects.page"


describe('login',()=>{

    var obj = new objects()

    it('usuario deve efetuar o login',()=>{
        //inserir dados para login
        obj.loginusuario()       
    })
    it('mensagem de erro de usuario invalido',()=>{
        //inserir dados de username invalido
        obj.userinvalido()
    })
    it('mensagem de erro de senha invalida',()=>{
        //inserir dados de password invalido
        obj.senhainvalida()
    })
    it('mensagem de erro de usuario bloquado',()=>{
        //inserir dados de usuario bloqueado
        obj.usuariobloqueado()
    })
})







