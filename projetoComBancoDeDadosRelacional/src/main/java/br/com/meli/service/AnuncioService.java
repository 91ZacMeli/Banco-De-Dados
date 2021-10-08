package br.com.meli.service;

import br.com.meli.dao.AnunciosPersistence;
import br.com.meli.entity.Anuncio;
import br.com.meli.entity.Vendedor;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class AnuncioService {

    private AnunciosPersistence anunciosPersistence;

    public AnuncioService(AnunciosPersistence anunciosPersistence) {

        this.anunciosPersistence = anunciosPersistence;
    }
    private String codigoUnico(){
        return "MLB" + ThreadLocalRandom.current().nextInt(10000,99999);
    }
    public Anuncio obtem(String codigo){
        return anunciosPersistence.get(codigo);
    }

    public List<Anuncio> listagem(){
        List<Anuncio> lista = anunciosPersistence.lista();
        lista.sort((Anuncio a1,Anuncio a2)->a1.getPreco().compareTo(a2.getPreco()));
        return lista;
    }

    public void salva(Anuncio anuncio){
        if(anuncio.getCodigo() ==null || anuncio.getCodigo().isEmpty()){
            anuncio.setCodigo((codigoUnico()));
            anunciosPersistence.insere(anuncio);
        }else {
            Anuncio anuncioExistente = anunciosPersistence.get(anuncio.getCodigo());
            if (anuncioExistente == null) {
                throw new RuntimeException("Algo de errado não está certo ");
            }
            anuncioExistente.setDataDoAnuncio(anuncio.getDataDoAnuncio());
            anuncioExistente.setPreco(anuncio.getPreco());
            anuncioExistente.setDataDoAnuncio(anuncio.getDataDoAnuncio());
            anuncioExistente.setTitulo(anuncio.getTitulo());
            anuncioExistente.setVendedorCodigo(anuncio.getVendedorCodigo());
            anunciosPersistence.atualiza(anuncioExistente);
        }
    }

    public void deleta(String codigo){
        anunciosPersistence.exclui(codigo);
    }
}
