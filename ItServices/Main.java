package ItServices;

//import projectgeorge.AdminDepartment;
//import projectgeorge.HRDepartment;
//import projectgeorge.SuperDepartment;
//import projectgeorge.TechDepartment;

public class Main {
	//Driver Class
			public static void main(String[]args) {
		//ADMIN DEPT:
				SuperDepartment obj1 = new AdminDepartment();
				obj1.departmentName();
				System.out.println("  Welcome to " + obj1.departmentName());
				obj1.getTodaysWork();
				System.out.println(obj1.getTodaysWork());
				obj1.getWorkDeadline();
				System.out.println(obj1.getWorkDeadline());	//departmentName
				obj1.isTodayAHoliday();
				System.out.println(obj1.isTodayAHoliday());
				System.out.println(" ");
		//HR DEPT:
				SuperDepartment obj2 = new HRDepartment();
				obj2.departmentName();
				System.out.println("  Welcome to " + obj2.departmentName());
				
				((HRDepartment) obj2).doActivity();
				System.out.println(((HRDepartment) obj2).doActivity());
				
				
				obj2.getTodaysWork();		//getTodaysWork
				System.out.println(obj2.getTodaysWork());	//getTodaysWork
				
				obj2.getWorkDeadline();
				System.out.println(obj2.getWorkDeadline());
				
				//((HRDepartment) obj2).doActivity();
				//System.out.println(((HRDepartment) obj2).doActivity());
				
				obj2.isTodayAHoliday();
				System.out.println(obj2.isTodayAHoliday());
				System.out.println(" ");
		//TECH DEPT:
				SuperDepartment obj3 = new TechDepartment();
				obj3.departmentName();
				System.out.println("  Welcome to " + obj3.departmentName());
				obj3.getTodaysWork();
				System.out.println(obj3.getTodaysWork());
				obj3.getWorkDeadline();
				System.out.println(obj3.getWorkDeadline());
				((TechDepartment) obj3). getTechStackInformation();
				System.out.println(((TechDepartment) obj3). getTechStackInformation());
			    obj3.isTodayAHoliday();
			    System.out.println(obj3.isTodayAHoliday());
			}

}



