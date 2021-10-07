package br.com.meli.main;

import br.com.meli.dao.AnunciosPersistence;
import br.com.meli.entity.Anuncio;
import br.com.meli.service.AnuncioService;

import java.math.BigDecimal;
import java.sql.Date;

public class MainAnuncio {
    public static void main(String[] args) {
       insercao();
        //atualizacao();
       // listagem();
       // exclusao();
    }
    private static void insercao(){
        AnunciosPersistence anunciosPersistence = new AnunciosPersistence();
        AnuncioService service = new AnuncioService(anunciosPersistence);
        Anuncio anuncio = new Anuncio("Aparelho de Barbear","MLB123", new BigDecimal(300.56), Date.valueOf("2021-9-15"),39);
        service.salva(anuncio);
    }
    private static void listagem(){
        AnunciosPersistence anunciosPersistence = new AnunciosPersistence();
        AnuncioService service = new AnuncioService(anunciosPersistence);
        service.listagem().forEach(a -> System.out.println(a));
    }
    private static  void atualizacao(){
        AnunciosPersistence anunciosPersistence = new AnunciosPersistence();
        AnuncioService service = new AnuncioService(anunciosPersistence);
        Anuncio anuncio = new Anuncio("MLB123","Aparelho de Barbear","MLB123",new BigDecimal(300.56),Date.valueOf("2021-9-15"),39);
        service.salva(anuncio);
    }

    private static void exclusao(){
        AnunciosPersistence anunciosPersistence = new AnunciosPersistence();
        AnuncioService service = new AnuncioService(anunciosPersistence);
        String codigo = "MLB123";
        service.deleta(codigo);
    }
}
