package br.com.meli.dao;

import br.com.meli.entity.Anuncio;
import br.com.meli.util.BancoDeDados;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AnunciosPersistence {

    private Connection cnx;

    public AnunciosPersistence() {
        try {
            cnx = BancoDeDados.getConection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void atualiza(Anuncio anuncio) {
        try {
            PreparedStatement ps = cnx.prepareStatement("update anuncio set titulo = ?, preco =  ?, dataDoAnuncio = ?,numeroDeVendas = ? where  codigo = ?");
            ps.setString(1, anuncio.getTitulo());
            ps.setBigDecimal(2, anuncio.getPreco());
            ps.setDate(3, anuncio.getDataDoAnuncio());
            ps.setInt(4, anuncio.getNumeroDeVendas());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Anuncio> lista() {
        List<Anuncio> anuncioList = new ArrayList<>();
        try {
            PreparedStatement ps = cnx.prepareStatement("select * from anuncio");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                anuncioList.add(new Anuncio(rs.getString(1), rs.getString(2), rs.getBigDecimal(3), rs.getDate(4), rs.getInt(5)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return anuncioList;
    }

    public Anuncio get(String codigoo) {
        try {
            PreparedStatement ps = cnx.prepareStatement("select * from anuncios where codigo = ?");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void insere(Anuncio anuncio) {
        try {
            Connection cnx = BancoDeDados.getConection();
            PreparedStatement ps = cnx.prepareStatement("insert into anuncio (codigo, titulo, preco, dataDoAnuncio,numeroDeVendas) " + " values (?,?,?,?,?)");
            ps.setString(1, anuncio.getCodigo());
            ps.setString(2, anuncio.getTitulo());
            ps.setBigDecimal(3, anuncio.getPreco());
            ps.setDate(4,  anuncio.getDataDoAnuncio());
            ps.setInt(5, anuncio.getNumeroDeVendas());
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public void exclui(String codigo){
        try {
            PreparedStatement ps = cnx.prepareStatement("delete from Anuncio where codigo = ?");
            ps.setString(1,codigo);
            ps.execute();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}

