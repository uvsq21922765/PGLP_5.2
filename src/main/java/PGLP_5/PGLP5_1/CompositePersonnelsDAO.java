package PGLP_5.PGLP5_1;

import java.sql.Connection;

@SuppressWarnings("serial")
public class CompositePersonnelsDAO extends DAO<CompositePersonnels>{

	public CompositePersonnelsDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public CompositePersonnels create(CompositePersonnels obj) {
		// TODO Auto-generated method stub
		return obj;
	}

	@Override
	public CompositePersonnels find(String id) {
		// TODO Auto-generated method stub
		CompositePersonnels grpperso=null;		
		return grpperso;
	}

	@Override
	public CompositePersonnels update(CompositePersonnels obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(CompositePersonnels obj) {
		// TODO Auto-generated method stub
		
	}

}