package skillbuilders;

public class Student {

	private String firstName;
	private String lastName;
	private String address;
	private int stuID;

	public Student() 
	{ firstName = "";
	  lastName = "";
	  address = "#####";
	  stuID = 00000000;
		   

	}

	public Student(String f,String l, String ad, int ID)

	{firstName = f;   
	lastName = l;
	address = ad;
	stuID = ID;

		
	}
	public String getFirstName()
	 {return firstName;
	 
	 }
	 public String getlastName()
	 {return lastName;
	 
	 }
	 public String getaddress()
	 {return address;
	 
	 }
	 public int getstuId()
	 {return stuID;
	}
	 
	 //modifier methods
	 public void setFirstName(String f)
	 { firstName =f;
	 }
	 //modifier methods
	 public void setlastName(String l)
	 { lastName =l;
	 
	 }
	 //modifier methods
	 public void setaddress(String a)
	 { address =a;
	 
	 }
	 //modifier methods
	 public void setstuID(int s)
	 { stuID =s;
	 
	 
	}
	}
