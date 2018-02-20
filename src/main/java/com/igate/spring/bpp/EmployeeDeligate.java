package com.igate.spring.bpp;

abstract public class EmployeeDeligate {
	private EmployeeVO employeeVO;
	private EmployeeDAO employeeDAO;

	public void insert() {
		employeeVO = lookUpEmployeeVO();
		employeeVO.setEmpId("s123");
		employeeVO.setName("sree");
		employeeVO.setSalary("45000");
		employeeDAO.insert(employeeVO);
	}

	public abstract EmployeeVO lookUpEmployeeVO();

	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

}
