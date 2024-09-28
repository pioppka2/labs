package elab3;

public class MySQLBuilder implements QueryBuilder 
{
	MySQLQuery query;
	
	public MySQLBuilder() {
		query = new MySQLQuery();
	}
	
	public void select(String s) {
		query.setSelect(s);
	}
	public void where(String s) {
		query.setWhere(s);
	}
	public void limit(String s) {
		query.setLimit(s);
	}
	
	public void reset() {
		query = new MySQLQuery();
	}
	
	public MySQLQuery getSQL() {
		return query;
	}
}
