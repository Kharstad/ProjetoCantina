package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modelo.Pedido;

/*
 * @author Enos
 */
public class PedidoDAO extends DAO {
    
    private Connection conn;
    
    
    public PedidoDAO() {
        try{
            conn = getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Problemas ao abrir a conexão");
        }
    }
    
    public void criaPedido(Pedido p) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            stmt = conn.prepareStatement("insert into pedido values(null, ?)", Statement.RETURN_GENERATED_KEYS);
            
            stmt.setDouble(1, p.getPagamento());
            
            int flag = stmt.executeUpdate();
            
            if(flag == 0)
                throw new SQLException("Erro ao inserir no banco.");
            
            // resgata para RS o valor da chave gerada
            rs = stmt.getGeneratedKeys();
            // variavel que vai receber a chave
            Integer id_pedido = null;
             
            // teste de verificação de valor / resgate(get) da chave
            if(rs.next()){
                // pega a chave
               id_pedido = rs.getInt(1);
            }
            
            if(id_pedido != null) {
                for (int id : p.getGuaravitas()) {
                    stmt = conn.prepareStatement("insert into pedido_has_guaravita values(?, ?)");

                    stmt.setLong(1, id_pedido);
                    stmt.setDouble(2, id);

                    flag = stmt.executeUpdate();

                    if(flag == 0)
                        throw new SQLException("Erro ao inserir a lista de guaravitas ao banco.");
                }

                for (int id : p.getSalgados()) {
                    stmt = conn.prepareStatement("insert into pedido_has_salgado values(?, ?)");

                    stmt.setLong(1, id_pedido);
                    stmt.setDouble(2, id);

                    flag = stmt.executeUpdate();

                    if(flag == 0)
                        throw new SQLException("Erro ao inserir a lista de salgados ao banco.");
                }
            }
            
        } finally {
            if(conn != null)
                conn.close();
            if(stmt != null)
                stmt.close();
            if(rs != null)
                rs.close();
        }    
    }
    public Pedido getNumPedido(long id_pedido) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            stmt = conn.prepareStatement("select * from pedido where id_pedido = ?");
            
            stmt.setLong(1, id_pedido);
            
            rs = stmt.executeQuery();
            
            if(rs.next()) {
                return criaPedido(rs);
            }
            
            return new Pedido();
        } finally {
            if(conn != null)
                conn.close();
            if(stmt != null)
                stmt.close();
            if(rs != null)
                rs.close();
        }
    }
    
    public List<Pedido> getPedidos() throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            stmt = conn.prepareStatement("select * from pedido");
            
            rs = stmt.executeQuery();
            List<Pedido> listaPedidos = new ArrayList<>();
            while(rs.next()) {
                listaPedidos.add(criaPedido(rs));
            }
            
            return listaPedidos;
        } finally {
            if(conn != null)
                conn.close();
            if(stmt != null)
                stmt.close();
            if(rs != null)
                rs.close();
        }
    }
    
    private Pedido criaPedido(ResultSet rs) throws SQLException {
        Pedido p = new Pedido();
        p.setId_pedido(rs.getInt("id_pedido"));
        p.setPagamento(rs.getDouble("dinheiro_dado"));
        
        return p;
    }
}
