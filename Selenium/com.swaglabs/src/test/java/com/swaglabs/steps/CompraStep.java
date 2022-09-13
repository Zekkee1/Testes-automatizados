package com.swaglabs.steps;

import com.swaglabs.funcs.CompraFunc;
import com.swaglabs.funcs.LoginFunc;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

public class CompraStep {
    LoginFunc loginFunc = new LoginFunc();
    CompraFunc compraFunc = new CompraFunc();


    @Dado("estiver logado na aplicação")
    public void estiver_logado_na_aplicacao() {
        loginFunc.entrarTelaHome();
        loginFunc.realizarLogin("standard_user", "secret_sauce");

    }
    @Quando("adicionar os produtos ao carrinho")
    public void adicionar_os_produtos_ao_carrinho() {
        compraFunc.adicionarProdutoCarrinho();


    }
    @Quando("inserir os dados de envio")
    public void inserir_os_dados_de_envio() {
        compraFunc.realizarCheckout("teste","teste","000000");




    }
    @Então("a compra devera ser realizada")
    public void a_compra_devera_ser_realizada() {
        Assert.assertEquals("THANK YOU FOR YOUR ORDER",compraFunc.validarCompra());
    }
}
