package co.edureka;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class AccountDAOImpl implements AccountDAO {
	private JdbcTemplate jt;
	
	public JdbcTemplate getJt() {
		return jt;
	}

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public void createAccount(Account acc) {
		String sql = "insert into account values("+acc.getAcno()+",'"+acc.getName()+"',"+acc.getBal()+")";
		int n = jt.update(sql);
		if(n>0)
			System.out.println("Account Created");
		else
			System.out.println("Account could not be created");
	}

	@Override
	public void updateAccount(Account acc) {
		String sql = "update account set name='"+acc.getName()+"', bal="+acc.getBal()+" where acno="+acc.getAcno();
		int n = jt.update(sql);
		if(n>0)
			System.out.println("Account Updated");
		else
			System.out.println("Account could not be Updated");		
	}

	@Override
	public void deleteAccount(long acno) {
		String sql = "delete from account where acno="+acno;
		int n = jt.update(sql);
		if(n>0)
			System.out.println("Account Deleted");
		else
			System.out.println("Account could not be deleted");		
	}

	@Override
	public List<Account> getAccounts() {
		 String sql="select * from account";
			
		 List<co.edureka.Account> l=jt.query(sql, new ResultSetExtractor<java.util.List<Account>>()
		 {
		  public List<Account> extractData(ResultSet rs) throws SQLException,DataAccessException 
		  {
		   List<Account> list=new ArrayList<Account>();  
		   while(rs.next())
		   {  
		    Account e=new Account();  
		    e.setAcno(rs.getLong(1));  
		    e.setName(rs.getString(2));  
		    e.setBal(rs.getFloat(3));  
		    list.add(e);  
		   }  
		   return list;  
		  }  		
		 });
		 return l;
	}
}
