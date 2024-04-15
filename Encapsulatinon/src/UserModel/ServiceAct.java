package UserModel;

public class ServiceAct {
	int id=1;
	public User createAcnt(String name, String pwd, long mob) {
		User u1 = new User(id, name, pwd, mob);
		id++;
		return u1;
	}
	public void showUser(User us1) 
	{
		System.out.println(us1.getId());
		System.out.println(us1.getName());
		System.out.println(us1.getMob());
		System.out.println(us1.getPwd());
	}

	public void updatePwd(User us1, String newPwd) {
		us1.setPwd("KarakeDekho");
		System.out.println("password changed");
	}
	public void showPwd(User us2) 
	{
		System.out.println(us2.getPwd());
	}

}
