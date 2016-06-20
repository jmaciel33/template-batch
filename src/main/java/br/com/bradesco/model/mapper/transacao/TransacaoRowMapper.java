package br.com.bradesco.model.mapper.transacao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import br.com.bradesco.model.Transacao;
/**
 * Transacao row mapper
 * @author Maciel
 *
 */
public class TransacaoRowMapper implements RowMapper<Transacao>{

	public Transacao mapRow(ResultSet rs, int rowNum) throws SQLException {

		Transacao transacao = new Transacao();
		
		transacao.setId(rs.getInt("id"));
		transacao.setEstabelecimento(rs.getString("estabelecimento"));
		transacao.setTipo(rs.getInt("tipo"));
		transacao.setValor(rs.getFloat("valor"));
		transacao.setVan(rs.getString("van"));
		
		if(rs.getString("t_status").equals("0")){
			transacao.setStatus("recebida");
		}else if(rs.getString("t_status").equals("1")){
			transacao.setStatus("processada");
		}
		
		return transacao;
	}
	
	

}
