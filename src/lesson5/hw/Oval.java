package lesson5.hw;

public class Oval {
	
	private int ra;
	private int rb;
	public int getRa() {
		return ra;
	}
	public void setRa(int ra) {
		this.ra = ra;
	}
	public int getRb() {
		return rb;
	}
	public void setRb(int rb) {
		this.rb = rb;
	}
	public double dlina(){
		return Math.PI * (this.ra + this.rb);
		
	}
	public double square(){
		return Math.PI * this.ra *this.rb;
	}
	
	public static boolean pravilOval(int ra, int rb){
		String flag ="";
		if(ra  > 0){
			
		}else{
			flag = "ra";
		}
		if(rb  > 0){
				
		}else{
			flag = "rb";
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
