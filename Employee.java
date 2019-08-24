
public class Employee {
	String name;  //instance variable
	int idno;  //instance variable
	double sal;  //instance variable
	Employee(){}
	Employee(String a, int b, double c){  //local variable
		name=a;
		idno = b;
		sal = c;
	}
	void setData() {
		name = "Heli";
		idno = 123;
		sal = 123.3;
	}	
	void getData() {
		System.out.println(name+"\t"+idno+"\t"+sal);
	}

	public static void main(String[] args) {
		Employee emp = new Employee();
		Employee emp1 = new Employee("Lili", 23, 23.12);
		emp1.getData();
		System.out.println(emp.name+"\t"+emp.idno+"\t"+emp.sal);
		emp.getData();
		emp.setData();
		emp.getData(); //changes of data are happening in the same memory

	}

}
