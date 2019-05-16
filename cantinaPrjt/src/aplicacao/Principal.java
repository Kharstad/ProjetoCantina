package aplicacao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Pedido;
import persistencia.PedidoDAO;

/**
 * @author Enos
 */
public class Principal {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        PedidoDAO aDAO = new PedidoDAO();
        
        pedido.setId_pedido(1);
        pedido.setPagamento(10.0);
        pedido.setGuaravitas(new ArrayList<>());
        pedido.setSalgados(new ArrayList<>());
        
        pedido.getGuaravitas().add(2);
        pedido.getSalgados().add(1);
        
        try {
        aDAO.criaPedido(pedido);
        System.out.println("Pedido realizado com sucesso!");
        } catch (SQLException ex) {
        Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
