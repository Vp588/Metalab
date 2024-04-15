package UserModel;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u2=new User(1,"Pannalal","Aajnahi",790628261);
		/*System.out.println(u2.getId());
		System.out.println(u2.getName());
		System.out.println(u2.getPwd()); 
		System.out.println(u2.getMob());*/
		
		ServiceAct sa1=new ServiceAct();
		sa1.showUser(u2);
		u2.setPwd("KarakeDekho");
		sa1.showPwd(u2);
		}
	}