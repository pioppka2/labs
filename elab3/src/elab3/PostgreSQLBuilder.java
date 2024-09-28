package elab3;

public class PostgreSQLBuilder implements QueryBuilder 
{
	PostgreSQLQuery query;
	
	public PostgreSQLBuilder() {
		query = new PostgreSQLQuery();
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
		query = new PostgreSQLQuery();
	}
	
	public PostgreSQLQuery getSQL() {
		return query;
	}
}
