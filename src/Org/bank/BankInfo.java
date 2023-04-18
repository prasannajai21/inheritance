package Org.bank;

public class BankInfo extends AxisBank {
     public void Savings() {
    	 System.out.println("Saving Account");
     }
	public void fixed() {
   	 System.out.println("Fixed Account");
	}
	public static void main(String[] args) {
		BankInfo Bi = new BankInfo();
		Bi.deposit();
		Bi.Savings();
		Bi.fixed();
     
	}

}
