package com.swaglabs.funcs;

import com.swaglabs.pages.CompraPage;
import org.openqa.selenium.By;

import static com.swaglabs.common.BaseTest.driver;

public class CompraFunc {

    CompraPage compraPage = new CompraPage();

    public void adicionarProdutoCarrinho(){
        driver.findElement(compraPage.getSelecionarProduto1()).click();
        driver.findElement(compraPage.getSelecionarProduto2()).click();
        driver.findElement(compraPage.getSelecionarProduto3()).click();
        driver.findElement(compraPage.getSelecionarProduto4()).click();
        driver.findElement(compraPage.getSelecionarProduto5()).click();
        driver.findElement(compraPage.getSelecionarProduto6()).click();

    }
    public void realizarCheckout (String first, String last, String zip){
        driver.findElement(compraPage.getEntrarCarrinho()).click();
        driver.findElement(compraPage.getClickarBotao()).click();
        driver.findElement(compraPage.getCampoFirstName()).sendKeys(first);
        driver.findElement(compraPage.getCampoLastName()).sendKeys(last);
        driver.findElement(compraPage.getCampozipcode()).sendKeys(zip);
        driver.findElement(compraPage.getBotaoContinue()).click();
        driver.findElement(compraPage.getBotaoFinish()).click();
    }

    public String validarCompra() {
        return driver.findElement(compraPage.getCompraEfetuada()).getText();
    }








}
