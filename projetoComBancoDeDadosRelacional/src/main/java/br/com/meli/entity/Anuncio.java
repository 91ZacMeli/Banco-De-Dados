package br.com.meli.entity;
import java.math.BigDecimal;

public class Anuncio {
    private String codigo;
    private String titulo;
    private String vendedorCodigo;
    private BigDecimal preco;
    private String dataDoAnuncio;
    private Integer numeroDeVendas;

    public Anuncio(String titulo, String vendedorCodigo, BigDecimal preco, String dataDoAnuncio, Integer numeroDeVendas) {
        this.titulo = titulo;
        this.vendedorCodigo = vendedorCodigo;
        this.preco = preco;
        this.dataDoAnuncio = dataDoAnuncio;
        this.numeroDeVendas = numeroDeVendas;
    }

    public Anuncio(String codigo, String titulo, String vendedorCodigo, BigDecimal preco, String dataDoAnuncio, Integer numeroDeVendas) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.vendedorCodigo = vendedorCodigo;
        this.preco = preco;
        this.dataDoAnuncio = dataDoAnuncio;
        this.numeroDeVendas = numeroDeVendas;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getVendedorCodigo() {
        return vendedorCodigo;
    }

    public void setVendedorCodigo(String vendedorCodigo) {
        this.vendedorCodigo = vendedorCodigo;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public String getDataDoAnuncio() {
        return dataDoAnuncio;
    }

    public void setDataDoAnuncio(String dataDoAnuncio) {
        this.dataDoAnuncio = dataDoAnuncio;
    }

    public Integer getNumeroDeVendas() {
        return numeroDeVendas;
    }

    public void setNumeroDeVendas(Integer numeroDeVendas) {
        this.numeroDeVendas = numeroDeVendas;
    }

    @Override
    public String toString() {
        return "Anuncios{" +
                "codigo='" + codigo + '\'' +
                ", titulo='" + titulo + '\'' +
                ", vendedorCodigo='" + vendedorCodigo + '\'' +
                ", preco='" + preco + '\'' +
                ", dataDoAnuncio=" + dataDoAnuncio +
                ", numeroDeVendas=" + numeroDeVendas +
                '}';
    }
}
