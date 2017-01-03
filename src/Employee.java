
public class Employee{
		Employee(int id,String name,double salary,Address add){
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Address add=new Address(123,"kp","hnk");
			Employee emp=new Employee(1234,"ramu",5000,add);
			}


}
