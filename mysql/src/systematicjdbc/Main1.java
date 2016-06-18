package systematicjdbc;

import java.util.List;

public class Main1 {

	public static void main(String[] args) {
		Dataaccessobj obj1=new Dataaccessobj();
		List<Employeeinfo> ex=obj1.getdata();
		for(Employeeinfo value:ex){
			System.out.println("id= "+value.getEmpid());
			System.out.println("name= "+value.getName());
			System.out.println("lastname= "+value.getLastname());
			System.out.println("age= "+value.getAge());
			System.out.println("sex= "+value.getSex());
			System.out.println("=====================================================>>>>>>>>>>>>>>>>>>>.>>>>>>>>>>>>");
		}

	}

}
