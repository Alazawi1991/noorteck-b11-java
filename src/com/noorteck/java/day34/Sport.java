package com.noorteck.java.day34;

public class Sport implements FootBall, Basketball, Soccer {

	@Override
	public void setWorldCap() {
		System.out.println("win");

	}

	@Override
	public void setPlayerOffs() {
		System.out.println("done");

	}

	@Override
	public void setCap() {
		System.out.println("Eurocap");

	}

}
