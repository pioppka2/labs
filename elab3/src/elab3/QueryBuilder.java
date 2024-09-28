package elab3;

public interface QueryBuilder {

	public void select(String s);
	public void where(String s);
	public void limit(String s);
}
