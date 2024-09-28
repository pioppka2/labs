package elab3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySQLBuilder msqlb = new MySQLBuilder();
		
		msqlb.select("*");
		msqlb.where("true");
		msqlb.limit("1");
		
		System.out.println(msqlb.getSQL().getQuery());
		msqlb.reset();
		System.out.println(msqlb.getSQL().getQuery());
		
		PostgreSQLBuilder pstgrb = new PostgreSQLBuilder();
		pstgrb.select("*");
		pstgrb.where("false");
		pstgrb.limit("2");
		
		System.out.println(pstgrb.getSQL().getQuery());
		pstgrb.reset();
		System.out.println(pstgrb.getSQL().getQuery());
		
	}
}
