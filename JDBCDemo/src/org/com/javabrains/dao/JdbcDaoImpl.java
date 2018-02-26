package org.com.javabrains.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;
import orsg.com.javabrains.model.Circle;
@Component
public class JdbcDaoImpl { 
	@Autowired	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate=new JdbcTemplate();
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	//private SimpleJdbcTemplate simpleJdbcTemplate;
	

	/*public Circle getCircle(int circleId) 
	{
		
Connection conn=null;
		
		
		try
		{
		
		/*String driver="oracle.jdbc.driver.OracleDriver";
		System.out.println("hello1");
		Class.forName(driver).newInstance();
		 conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system","Oracle12c");*/
			/*conn=dataSource.getConnection();
		PreparedStatement ps=conn.prepareStatement("select *  from books where id=? and book_id=?");
		ps.setInt(1,circleId);
		ps.setString(2,"pri");
		System.out.println("hello2");
		Circle circle =null;
		ResultSet rs=ps.executeQuery();
		//System.out.println("rs::"+rs);
		//System.out.println("rs.next::"+rs.next());
		if(rs.next()) {
			System.out.println("hello3");
			circle=new Circle(circleId,rs.getString("book_name"),rs.getString("price"));
		}
	
	rs.close();
	ps.close();
	//conn.close();
	return circle;
	
	}
	catch(Exception e)
	{
		System.out.println("hello4");
		throw new RuntimeException(e);
		
	}
	finally
	{
		try {
			conn.close();
			System.out.println("hello5");
		}catch(SQLException e){}
	}
	
}*/
	public String getCircleName(int circleId)
	{
		String sql="select name from circle where Id =?";
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate.queryForObject(sql,new Object[] {circleId},String.class);
		
	}
	
	public void insertCircle(Circle circle)
	{
		String sql="insert  into circle(id,name,radius,rad_diff)values (?,?,?,?)";
		System.out.println("query has been executed");
		jdbcTemplate.update(sql, new Object[]{circle.getId(),circle.getName(),circle.getRadius(),circle.getRad_diff()});
		//System.out.println("query has been executed");
		
	}
	
	public void insertNewCircle(Circle circle)
	{
		String sql="insert  into triangle(id,name)values (:id,:name)";
		SqlParameterSource namedParameters=new MapSqlParameterSource("id",circle.getId()).addValue("name",circle.getName());
		namedParameterJdbcTemplate.update(sql, namedParameters);
		
	}
	
	
	
	public void createTrianleTable() 
	{
		String sql="create table triangle(id integer,name varchar(20))";
		jdbcTemplate.execute(sql);
	}
	
	
	/*public int getCircleId(int circleName)
	{
		String sql="select id from circle where name =?";
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate.que
		
	}*/
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		//this.dataSource = dataSource;
		this.jdbcTemplate =new JdbcTemplate(dataSource);
		this.namedParameterJdbcTemplate=new NamedParameterJdbcTemplate(dataSource);
	}
	
	public DataSource getDataSource() {
		return dataSource;
	}
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
		
	}
	
	
	public NamedParameterJdbcTemplate getNameParameterJdbcTemplate() {
		return namedParameterJdbcTemplate;
	}

	public void setNameParameterJdbcTemplate(NamedParameterJdbcTemplate nameParameterJdbcTemplate) {
		this.namedParameterJdbcTemplate = nameParameterJdbcTemplate;
	}
}







