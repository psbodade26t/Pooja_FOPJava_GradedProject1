package ItServices;

public class HRDepartment extends SuperDepartment{

	public HRDepartment() {
		// TODO Auto-generated constructor stub
	}

	public String departmentName() {
		return " HR Department";
	}
	public String getTodaysWork() {
		return " Fill today's timesheet and mark your attendance ";
	}
	public String getWorkDeadline() {
		return " Complete by EOD ";
	}
	public String doActivity() {
		return " team Lunch ";
	}

}
