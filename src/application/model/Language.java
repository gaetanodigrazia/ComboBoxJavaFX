package application.model;

public class Language {
	private int key;
	private String name;
	
	public Language(String name, int key) {
		setName(name);
		setKey(key);
	}

	/**
	 * @return the key
	 */
	public int getKey() {
		return key;
	}

	/**
	 * @param key the key to set
	 */
	public void setKey(int key) {
		this.key = key;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/*Allow to show the name of the object instead of its address in the combobox, override it if needed*/
	@Override
	public String toString() {
		return this.getName();
	}
}
