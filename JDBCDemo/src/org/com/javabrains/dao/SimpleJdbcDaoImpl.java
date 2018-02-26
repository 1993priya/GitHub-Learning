package org.com.javabrains.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import orsg.com.javabrains.model.Circle;

public class SimpleJdbcDaoImpl extends JdbcDaoSupport {
	// private JdbcTemplate jdbcTemplate=new JdbcTemplate();
	
	 public void createRectangleTable() 
		{
		 System.out.println("simple class");
			String sql="create table Rectangle(id integer,name varchar(20))";
			getJdbcTemplate().execute(sql);
		}
	
	


	/*public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
*/

	/*public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}*/
	

}
