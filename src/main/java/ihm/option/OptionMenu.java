package ihm.option;

public interface OptionMenu {
	
	String getLibelle();
	
	void executer();
	
	default boolean isSortir() {
		return false;
	}
}
