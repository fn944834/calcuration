package calcuration;

public class Calcuration_lib {
	
	private int m, n;

	public Calcuration_lib(int m, int n) {
		this.m = m;
		this.n = n;
	}
	
	public int getPlus() {
		return this.m + this.n;
	}
	
	public int getMinus() {
		return this.m - this.n;
	}
	
	public int getTime() {
		return this.m * this.n;
	}
	
	public int getDivide() {
		return this.m / this.n;
	}
	
	public int getMod() {
		return this.m % this.n;
	}
	
}