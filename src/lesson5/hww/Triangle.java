package lesson5.hww;

public class Triangle {
	private int a ;
	private int b;
	private int c ;
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}
	public double perimetr(){
	//	if(this.a == 0 || this.b ==0 || this.c == 0){
		if(!pravinTreug(a,b,c)){
			return -1;
		}
		return this.a+this.b+this.c;
	}


	public static boolean pravinTreug(int a, int b, int c) {
		// TODO Auto-generated method stub
		String flag ="";
		if(a +b > c){
			
		}else{
			flag = "c";
		}
		if(b +c > a){
			
		}else{
			flag = "a";
		}
		if(a +c > b){
			
		}else{
			flag = "b";
		}
		if(flag !=""){
			System.out.println("error");
			System.out.printf("%S > sum another ", flag);
			System.out.println();

		}else{
			return true;
		}
		return false;
	}

	public double square() {
		if(!pravinTreug(a,b,c)){
			return -1;
		}
		return Math.sqrt(this.perimetr()/2*
				(this.perimetr()/2-this.a)*(this.perimetr()/2-this.b)*(this.perimetr()/2-this.c)); 
	}

}
