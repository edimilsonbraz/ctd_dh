package com.example.EcommerceCliente;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;

public class ProdutoCliente {

    public Produto salvar(Produto produto) {
        HttpResponse<String> response = null;
        Produto produto1 = null;

        try {
            //Vai pegar a url do pastman da outra aplicação back-end
            response = Unirest.post("http://localhost:8080/produto")
                    .header("Content-Type", "application/json") //configurando o json
                    .body(JSonUtil.asJsonString(produto)).asString(); //converti o meu objeto
            produto1 = JSonUtil.objectFromString(Produto.class, response.getBody());
            // vai fazer a conversão de Json para Objeto, passo a classe e o que vai ser convertido

        }catch (Exception e) {
            e.printStackTrace();
        }
        return produto1;
    }

    public Produto buscarPorId(Integer id) {
        HttpResponse<String> response = null;
        Produto produto1 = null;

        try {
            //Vai pegar a url do pastman da outra aplicação back-end
            response = Unirest.get("http://localhost:8080/produto").asString();
            produto1 = JSonUtil.objectFromString(Produto.class, response.getBody());
            // vai fazer a conversão de Json para Objeto, passo a classe e o que vai ser convertido

        }catch (Exception e) {
            e.printStackTrace();
        }
        return produto1;
    }

    public Produto alterar(Produto produto) {
        HttpResponse<String> response = null;
        Produto produto1 = null;

        try {
            //Vai pegar a url do pastman da outra aplicação back-end
            response = Unirest.put("http://localhost:8080/produto")
                    .header("Content-Type", "application/json") //configurando o json
                    .body(JSonUtil.asJsonString(produto)).asString(); //converti o meu objeto
            produto1 = JSonUtil.objectFromString(Produto.class, response.getBody());
            // vai fazer a conversão de Json para Objeto, passo a classe e o que vai ser convertido

        }catch (Exception e) {
            e.printStackTrace();
        }
        return produto1;
    }

    public String excluir(Integer id) {
        HttpResponse<String> response = null;
        Produto produto1 = null;

        try {
            //Vai pegar a url do pastman da outra aplicação back-end
            response = Unirest.delete("http://localhost:8080/produto/" + id).asString();

        }catch (Exception e) {
            e.printStackTrace();
        }
        return response != null ? String.valueOf(response.getStatus()) : null ;
    }
}
