package lesson5.hww;

public class Cone {
	
	private int r ;
	private int h;
	private int l;
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}
	public int getL() {
		return l;
	}
	public void setL(int l) {
		this.l = l;
	}
	public double squareOsnovaniya(){
		return Math.PI *this.r *this.l;
		
	}
	
	public double squareBokovaya(){
		return Math.PI * this.r * this.r;
	}
	
	public double squarePolnaya(){
		return this.squareBokovaya()+this.squareOsnovaniya();
	}
	
	public double obiem(){
		return this.squareBokovaya() * this.h / 3;
	}
	public static boolean pravilCone(int r, int h, int l){
		String flag ="";
		if(r  > 0){
			
		}else{
			flag = "r";
		}
		if(h  > 0){
				
		}else{
			flag = "h";
	}
		if(l  > 0){
			
		}else{
			flag = "l";
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
