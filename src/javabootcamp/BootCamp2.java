package javabootcamp;

public class BootCamp2 extends BootCamp{

	
	public BootCamp2(String b) {
		System.out.println("BootCamp2 Class");
	}
	
	
	
	public BootCamp3 balTransfer() throws Exception {
		System.out.println("Before Division");
		try {
			System.out.println("Child Class");
			
			super.ADDRESS="lkj";
			super.balTransfer("KK");
			
			
		}catch(Exception e) {
			e.printStackTrace();			
		}
		System.out.println("After Division");
		return new BootCamp3();
	}
	
	
}
