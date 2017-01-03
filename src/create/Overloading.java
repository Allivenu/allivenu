package create;

public class Overloading {
	Overloading(int a){
		System.out.println(a);
		}
		Overloading(int a,int b){
		System.out.println(a+b);
		}
		Overloading(double a,double b){
		System.out.println(a+b);
		}
		Overloading(int a,double b){
		System.out.println(a+b);
		}
		Overloading(double a,int b){
		System.out.println(a+b);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading o=new Overloading(10);
		Overloading o1=new Overloading(10,20);
		Overloading o2=new Overloading(10.5,45.6);
		Overloading o3=new Overloading(4,10.5);
		Overloading o4=new Overloading(10.5,4);
	}

}
