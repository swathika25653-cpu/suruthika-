class company{
String name;
int age;
company(String n,int a){
	this.name=n;
	this.age=a;
	
}
public void display(){
	System.out.println("name="+name);
	System.out.println("age="+age);
}
}
class Mainprogrammer extends company{
	String companyname;
	Mainprogrammer(String n,int a,String c)
	{
		super(n,a);
		this.companyname=c;
	}
	public void display(){
		System.out.println("name="+name);
		System.out.println("age="+age);
		System.out.println("companyname="+companyname);
	}
	
}
class methodoveriding{
	public static void main(String args[]){
		Mainprogrammer o=new Mainprogrammer("suruthi",12345,"Technology");
		o.display();
	}
}



	
