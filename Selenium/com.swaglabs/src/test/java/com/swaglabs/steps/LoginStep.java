package com.swaglabs.steps;

import com.swaglabs.funcs.LoginFunc;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

public class LoginStep {
    LoginFunc loginFunc = new LoginFunc();

    @Dado("estiver na pagina de login")
    public void estejaNaPagDeLogin() {
        loginFunc.entrarTelaHome();
    }

    @Quando("inserir os dados do usuario: {string}")
    public void inserirDadosDoUsuario(String usuario) {
        loginFunc.realizarLogin(usuario, "secret_sauce");

    }

    @Então("devo visualizar a pagina {string}")
    public void loginEfetuado(String usuario) {
        Assert.assertEquals(usuario, loginFunc.validarLogin());

        }
    }

