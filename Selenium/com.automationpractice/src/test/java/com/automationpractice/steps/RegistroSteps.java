package com.automationpractice.steps;

import com.automationpractice.funcs.RegistroFuncs;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

import java.util.List;
import java.util.Map;


public class RegistroSteps {
    RegistroFuncs registroFuncs = new RegistroFuncs();

    @Dado("estiver na pagina de registro")
    public void estiver_na_pagina_de_registro() {
    }
    @Quando("inserir todos os dados obrigatorios para registro")
    public void inserir_todos_os_dados_obrigatorios_para_registro(DataTable dataTable) {
        List<Map<String,String>> usuario = dataTable.asMaps();
        String email = usuario.get(0).get("email");
        String firstname = usuario.get(0).get("First_name");
        String lastname = usuario.get(0).get("last_name");
        String password = usuario.get(0).get("password");

        registroFuncs.createAccount(email,firstname,lastname,password);
    }
    @Entao("devo visualizar o usuario {string} logado")
    public void devo_visualizar_o_usuario(String usuario) {
        Assert.assertEquals(usuario,
                registroFuncs.userEquals());
    }

    //Bad Scenario
    @Entao("inserir um email invalido")
    public void inserir_email_invalido(DataTable dataTable){
        List<Map<String,String>> usuarioinv = dataTable.asMaps();
        String email = usuarioinv.get(0).get("email");
        registroFuncs.invalidemail(email);

    }
    @Entao("devo visualizar a mensagem de error {string}")
    public void devo_visualizar_a_mensagem_de_erro(String error){
        Assert.assertEquals(error, registroFuncs.emailerror());
        }
}

