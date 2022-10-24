package com.automationpractice.steps;

import com.automationpractice.funcs.ChekoutFunc;
import com.automationpractice.funcs.LoginFunc;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

public class CheckoutStep {

    LoginFunc loginFunc = new LoginFunc();
    ChekoutFunc chekoutFunc = new ChekoutFunc();

    @Dado("estiver logado na aplicação")
    public void estiver_logado(){
    loginFunc.accLogin("teste337445@gmail.com","test1234");
    }

    @Quando("selecionar um produto e confirmar meus dados")
    public void selecionar_produto_e_confirmar_dados(){
    chekoutFunc.accCheckout();

    }
    @Entao("deve visualizar a mensagem {string} de compra efetuada com sucesso")
    public void compra_efetuada(String message){
        Assert.assertEquals(message,chekoutFunc.validatePurchase());
    }








}
