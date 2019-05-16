package modelo;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Enos
 */
public class Pedido implements Serializable {
    private long id_pedido;
    private Double pagamento;
    
    // associação (fk)
    private List<Integer> guaravitas;
    private List<Integer> salgados;
    
    public Pedido(){
    }

    public Pedido(long id_pedido, Double pagamento, List<Integer> guaravitas, List<Integer> salgados) {
        this.id_pedido = id_pedido;
        this.pagamento = pagamento;
        this.guaravitas = guaravitas;
        this.salgados = salgados;
    }

    public long getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(long id_pedido) {
        this.id_pedido = id_pedido;
    }

    public Double getPagamento() {
        return pagamento;
    }

    public void setPagamento(Double pagamento) {
        this.pagamento = pagamento;
    }

    public List<Integer> getGuaravitas() {
        return guaravitas;
    }

    public void setGuaravitas(List<Integer> guaravitas) {
        this.guaravitas = guaravitas;
    }

    public List<Integer> getSalgados() {
        return salgados;
    }

    public void setSalgados(List<Integer> salgados) {
        this.salgados = salgados;
    }
    
    public void addSalgado(int id) {
        salgados.add(id);
    }
    
    public void addGuaravita(int id) {
        guaravitas.add(id);
    }
}
