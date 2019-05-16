/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author Enos
 */
public class Guaravita implements Serializable {
    
    private long id_guaravita;
    private String nome;
    private double preco;
    private int qntd_disp;
    
    public Guaravita (){
    }
    
    public Guaravita(long id_guaravita, String nome, double preco, int qntd_disp){
        this.id_guaravita = id_guaravita;
        this.nome = nome;
        this.preco = preco;
        this.qntd_disp = qntd_disp;
    }

    public long getId_guaravita() {
        return id_guaravita;
    }

    public void setId_guaravita(long id_guaravita) {
        this.id_guaravita = id_guaravita;
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
