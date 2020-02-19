/**
 * @author Mark Baldwin
 * Names: Jonathon McNabb & Carter Pasqualini
 */
public class Friend {
	public Friend() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Friend(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	private String name;
	private String email;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	/*
	@Override
	public String toString() {
		return "Person [name=" + name + ", email=" + email + "]";
	}
	*/
	

}
