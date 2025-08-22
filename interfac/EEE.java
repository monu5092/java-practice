package com.kodewala.interfac;

public class EEE implements ICollege
{

	@Override
	public void tutionFee() {
		// TODO Auto-generated method stub
		System.out.println(ICollege.admissionFee+95000);
	}

	@Override
	public void lab() {
		// TODO Auto-generated method stub
		System.out.print("all Technical subject lab");
	}

	@Override
	public void subject() {
		// TODO Auto-generated method stub
		System.out.print("Technical and NonTechnical");
	}

	@Override
	public void facullty() {
		// TODO Auto-generated method stub
		System.out.print("Technialfacult and NonTechnical Faculty");
	}

}
