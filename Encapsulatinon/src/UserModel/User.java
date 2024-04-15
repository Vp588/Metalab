package UserModel;

public class User {
	
	private int id;
	private String name;                    
	private String pwd;
	private long mob;
	
	public User() {
		
	}
	public User(int id, String name, String pwd, long mob) {
		this.id=id;
		this.name=name;
		this.pwd=pwd;
		this.mob=mob;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public long getMob() {
		return mob;
	}
	public void setMob(long mob) {
		this.mob = mob;
	}
	
}
