package com.automationpractice.steps;

import com.automationpractice.funcs.RegisterFunc;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;


public class RegisterStep {
    RegisterFunc registerFunc = new RegisterFunc();

    @Given("estiver na pagina de registro")
    public void estiver_na_pagina_de_registro() {
    }
    @When("inserir todos os dados obrigatorios para registro")
    public void inserir_todos_os_dados_obrigatorios_para_registro(DataTable dataTable) {
        List<Map<String,String>> usuario = dataTable.asMaps();
        String email = usuario.get(0).get("email");
        String firstname = usuario.get(0).get("First_name");
        String lastname = usuario.get(0).get("last_name");
        String password = usuario.get(0).get("password");



        registerFunc.createAccount(email,firstname,lastname,password);
    }
    @Then("devo visualizar o usuario {string} logado")
    public void devo_visualizar_o_usuario(String usuario) {
        Assert.assertEquals(usuario, registerFunc.userEquals());
    }

    //Bad Scenario

    @When("inserir um email invalido")
    public void inserir_email_invalido(DataTable dataTable){
        List<Map<String,String>> usuarioinv = dataTable.asMaps();
        String email = usuarioinv.get(0).get("email");
        registerFunc.invalidemail(email);

    }
    @Then("devo visualizar a mensagem de error {string}")
    public void devo_visualizar_a_mensagem_de_erro(String error){
        Assert.assertEquals(error, registerFunc.emailerror());
        }
}

