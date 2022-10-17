
 class Employee implements Comparable<Employee>{
	 
	
		private int EmployeeId;
		private String Employeename;
		private int EmployeeAge;
		private String EmployeeDepartment;
		private Character EmployeeGender;
		
		@Override
		public int compareTo(Employee o) {
			
			return this.getEmployeeId()-o.getEmployeeId();
		}
		
		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Employee(int employeeId, String employeename, int employeeAge, String employeeDepartment,
				char employeeGender) {
			super();
			this.EmployeeId = employeeId;
			this.Employeename = employeename;
			this.EmployeeAge = employeeAge;
			this.EmployeeDepartment = employeeDepartment;
			this.EmployeeGender = employeeGender;
		}
		public int getEmployeeId() {
			return EmployeeId;
		}
		public void setEmployeeId(int employeeId) {
			EmployeeId = employeeId;
		}
		public String getEmployeename() {
			return Employeename;
		}
		public void setEmployeename(String employeename) {
			Employeename = employeename;
		}
		public int getEmployeeAge() {
			return EmployeeAge;
		}
		public void setEmployeeAge(int employeeAge) {
			EmployeeAge = employeeAge;
		}
		public String getEmployeeDepartment() {
			return EmployeeDepartment;
		}
		public void setEmployeeDepartment(String employeeDepartment) {
			EmployeeDepartment = employeeDepartment;
		}
		public Character getEmployeeGender() {
			return EmployeeGender;
		}
		public void setEmployeeGender(char employeeGender) {
			EmployeeGender = employeeGender;
		}
		@Override
		public String toString() {
			return "Employee [EmployeeId=" + EmployeeId + ", Employeename=" + Employeename + ", EmployeeAge="
					+ EmployeeAge + ", EmployeeDepartment=" + EmployeeDepartment + ", EmployeeGender=" + EmployeeGender
					+ "]";
		}
		
		
 }

	