package elab3;

public class MySQLQuery 
{
	private String select;
	private String where;
	private String limit;
	
	public void setSelect(String s) {
		select = s;
	}
	public void setWhere(String w) {
		where = w;
	}
	public void setLimit(String l) {
		limit = l;
	}
	
	public String getQuery()
	{
		String res = "";
		
		if(select != null && !select.isEmpty() && !select.isBlank())
		{
			res += "SELECT " + select;
			if(where != null && !where.isEmpty() && !where.isBlank())
			{
				res += " WHERE " + where;
				if(limit != null && !limit.isEmpty() && !limit.isBlank())
				{
					res += " LIMIT " + limit;
				}
			}
		}
		return res;
	}
}
