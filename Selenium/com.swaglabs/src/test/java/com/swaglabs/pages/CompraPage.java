package com.swaglabs.pages;

import com.swaglabs.common.BaseTest;
import org.openqa.selenium.By;

public class CompraPage {
        //adicionar produtos ao carrinho
        By selecionarProduto1 = By.id("add-to-cart-sauce-labs-backpack");
        By selecionarProduto2 = By.id("add-to-cart-sauce-labs-bike-light");
        By selecionarProduto3 = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
        By selecionarProduto4 = By.id("add-to-cart-sauce-labs-fleece-jacket");
        By selecionarProduto5 = By.id("add-to-cart-sauce-labs-onesie");
        By selecionarProduto6 = By.id("add-to-cart-test.allthethings()-t-shirt-(red)");

        //Checkout
        By entrarCarrinho = By.cssSelector(".shopping_cart_link");
        By clickarBotao = By.id("checkout");
        By campoFirstName = By.id("first-name");
        By campoLastName = By.id("last-name");
        By campozipcode = By.id("postal-code");
        By botaoContinue = By.id("continue");
        By botaoFinish = By.id("finish");

        //validar texto de compra efetuada

        By compraEfetuada = By.cssSelector(".complete-header");



    public By getSelecionarProduto1(){return selecionarProduto1;}
    public By getSelecionarProduto2(){return selecionarProduto2;}
    public By getSelecionarProduto3(){return selecionarProduto3;}
    public By getSelecionarProduto4(){return selecionarProduto4;}
    public By getSelecionarProduto5(){return selecionarProduto5;}
    public By getSelecionarProduto6(){return selecionarProduto6;}

    public By getEntrarCarrinho(){return entrarCarrinho;}
    public By getClickarBotao(){return clickarBotao;}
    public By getCampoFirstName(){return campoFirstName;}
    public By getCampoLastName (){return campoLastName;}
    public By getCampozipcode(){return campozipcode;}
    public By getBotaoContinue(){return botaoContinue;}
    public By getBotaoFinish(){return botaoFinish;}

    public By getCompraEfetuada(){return compraEfetuada;}
}
