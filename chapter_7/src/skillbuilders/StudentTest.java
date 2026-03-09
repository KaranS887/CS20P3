package skillbuilders;

public class StudentTest {

	public static void main(String[] args) {



				Student sta= new Student();
				
		System.out.println(sta.getFirstName());
		sta.setFirstName("AAA");
		System.out.println(sta.getFirstName());

		sta.setlastName("BBB");
		System.out.println(sta.getlastName());

		sta.setlastName("TTT");
		System.out.println(sta.getlastName());

		sta.setaddress("savanna");
		System.out.println(sta.getaddress());

		sta.setstuID(856567656);
		System.out.println(sta.getstuId());
			}

		}

