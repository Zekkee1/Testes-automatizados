package com.automationpractice.steps;

import com.automationpractice.funcs.ChekoutFuncs;
import com.automationpractice.funcs.LoginFuncs;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

public class CheckoutSteps {

    LoginFuncs loginFuncs = new LoginFuncs();
    ChekoutFuncs chekoutFuncs = new ChekoutFuncs();

    @Dado("estiver logado na aplicação")
    public void estiver_logado(){
    loginFuncs.accLogin("teste337445@gmail.com",
            "test1234");
    }

    @Quando("selecionar um produto e confirmar meus dados")
    public void selecionar_produto_e_confirmar_dados(){
    chekoutFuncs.accCheckout();

    }
    @Entao("deve visualizar a mensagem {string} de compra efetuada com sucesso")
    public void compra_efetuada(String message){
        Assert.assertEquals(message,
                chekoutFuncs.validatePurchase());
    }








}
