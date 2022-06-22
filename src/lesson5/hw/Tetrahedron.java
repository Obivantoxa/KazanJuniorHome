package lesson5.hw;

public class Tetrahedron {
	
	private int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	public double square(){
		return Math.sqrt(3) *this.a * this.a;
	}
	public double obiem(){
		return Math.sqrt(2) / 12 * this.a *this.a * this.a ;
	}
	public static boolean pravilTetrahedron(int a){
		String flag ="";
		if(a  > 0){
			
		}else{
			flag = "a";
	}
		if(flag !=""){
			System.out.println("error");
			System.out.printf("%S enter >0 ", flag);
			System.out.println();

		}else{
			return true;
		}
		return false;
	}
	
}
