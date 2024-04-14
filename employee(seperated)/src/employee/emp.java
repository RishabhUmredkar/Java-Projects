package employee;

public class emp {

	private int empno;
	private String empname;
	private String salary;

	public emp(int empno, String empname, String salary)
	{
		super();
		this.empno = empno;
		this.empname = empname;
		this.salary = salary;
	}
	public emp(int empno)
	{
		super();
		this.empno = empno;
	}
	
	public emp()
	{
		
	}
	
	
	
	public int getEmpno()
	{
		return empno;
	}
	public void setempno(int empno)
	{
		this.empno = empno;
	}
	
	
	
	public String getEmpName()
	{
		return empname;
	}
	public void setmpname(String empname)
	{
		this.empname = empname;
	}

	
	public String getSalary()
	{
		return salary;
	}
	public void setSalary(String salary)
	{
		this.salary = salary;
	}
	
}
