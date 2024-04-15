package Encapsulation;

//Plain Old Java Object class ->POJO
//Bean
class NewEncapsu
		{
			private int id;// r
			private String name;// w r
			private String pwd;// w
			private long mob;// w r

			public NewEncapsu() {

			}

			public NewEncapsu(int id, String name, String pwd, long mob) {
				super();
				this.id = id;
				this.name = name;
				this.pwd = pwd;
				this.mob = mob;
			}

			public int getId() {
				return id;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
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

		class AccntService {
			int id = 1;

			public NewEncapsu createAcnt(String name, String pwd, long mob) {
				NewEncapsu u1 = new NewEncapsu(id, name, pwd, mob);
				id++;
				return u1;
			}

			public void updatePwd(NewEncapsu us1, String newPwd) {
				us1.setPwd(newPwd);
				System.out.println("password changed");
			}

			public void updateMob(NewEncapsu us1, long newMob) {
				us1.setMob(newMob);
				System.out.println("mob number changed");
			}

			public void showMob(NewEncapsu us1) {
				System.out.println(us1.getMob());
			}

			public void showId(NewEncapsu us1) {
				System.out.println(us1.getId());
			}
			
			public void showUser(NewEncapsu us1) 
			{
				System.out.println(us1.getId());
				System.out.println(us1.getName());
				System.out.println(us1.getMob());
			}

		}
		class Mainclass 
{
			public static void main(String[] args) 
			{
				AccntService as1 = new AccntService();

				NewEncapsu us1 = as1.createAcnt("Dinga", "dingi", 9876543219l);
				as1.showUser(us1);

		}

	}