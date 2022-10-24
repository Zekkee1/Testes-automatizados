package com.automationpractice.steps;

import com.automationpractice.funcs.LoginFuncs;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class LoginSteps {
    LoginFuncs loginFuncs = new LoginFuncs();

    @Dado("estiver na pagina de login")
    public void estiver_na_pagina_de_login() {
    }

    @Quando("inserir os dados do usuario")
    public void inserir_os_dados_do_usuario(DataTable dataTable) {
        List<Map<String, String>> usuario = dataTable.asMaps();
        String email = usuario.get(0).get("email");
        String password = usuario.get(0).get("senha");
        loginFuncs.accLogin(email, password);
    }

    @Entao("devo visualizar o user {string} logado")
    public void devo_visualirar_o_user_logado(String usuario) {
        Assert.assertEquals(usuario,
                loginFuncs.userEquals());
    }

    @Entao("devo visualizar a mensagem de erro {string}")
    public void deve_visualizar_a_mensagem_de_erro(String erro) {
        Assert.assertEquals(erro,
                loginFuncs.erromess());
    }
}
