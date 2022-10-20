package com.automationpractice.steps;

import com.automationpractice.funcs.ChekoutFunc;
import com.automationpractice.funcs.LoginFunc;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CheckoutStep {

    LoginFunc loginFunc = new LoginFunc();
    ChekoutFunc chekoutFunc = new ChekoutFunc();

    @Given("estiver logado na aplicação")
    public void estiver_logado(){
    loginFunc.accLogin("teste337445@gmail.com","test1234");
    }

    @When("selecionar um produto e confirmar meus dados")
    public void selecionar_produto_e_confirmar_dados(){
    chekoutFunc.accCheckout();

    }
    @Then("deve visualizar a mensagem {string} de compra efetuada com sucesso")
    public void compra_efetuada(String message){
        Assert.assertEquals(message,chekoutFunc.validatePurchase());




    }








}
