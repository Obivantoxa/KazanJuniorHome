package lesson5.hw;

public class Parallelogram {
	
	private int a ;
	private int b;
	private int h;
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
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}
	
	public int perimetr(){
		if(!pravilParallelogram(a, b, h)){
			return -1 ;
		}
	
		return 2 *(this.a+this.b);
	}
	
	public int square(){
		if(!pravilParallelogram(a, b, h)){
			return -1 ;
		}
		return this.a *this.h;
	}
	
	public static boolean pravilParallelogram(int a, int b, int h){
		String flag ="";
		if(a  > 0){
			
		}else{
			flag = "a";
		}
		if(b  > 0){
				
		}else{
			flag = "b <= 0";
	}
		if(h  > 0){
			
		}else{
			flag = "h <= 0";
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
	
		
	


