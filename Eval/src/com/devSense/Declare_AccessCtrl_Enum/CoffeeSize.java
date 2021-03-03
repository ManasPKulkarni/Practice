package com.devSense.Declare_AccessCtrl_Enum;

public enum CoffeeSize {

	BIG(8),
	HUGE(10),
	OVERWHELMING(16){
		public String getLidCode() {
			return "A";
		}
	};

	private int ounces;
	
	CoffeeSize(int Ounces) {
		// TODO Auto-generated constructor stub
		this.ounces = Ounces;
	}
	
	public int getOunces() {
		return ounces;
	}
	
	public String getLidCode() {
		return "B";
	}
}
