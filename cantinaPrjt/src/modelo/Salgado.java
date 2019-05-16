package modelo;

import java.io.Serializable;

/**
 *
 * @author Enos
 */
public class Salgado implements Serializable {
    
    private long id_salgado;
    private String nome;
    private double preco;
    private int qntd_disp;
    
    public Salgado() {
    }
    
    public Salgado(long id_salgado, String nome, double preco, int qntd_disp) {
        this.id_salgado = id_salgado;
        this.nome = nome;
        this.preco = preco;
        this.qntd_disp = qntd_disp;
    }

    public long getId_salgado() {
        return id_salgado;
    }

    public void setId_salgado(long id_salgado) {
        this.id_salgado = id_salgado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQntd_disp() {
        return qntd_disp;
    }

    public void setQntd_disp(int qntd_disp) {
        this.qntd_disp = qntd_disp;
    }
}
