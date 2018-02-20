package com.igate.springbasic.innerbeans;

public class Bycycle {
	private Chain chain;

	public void setChain(Chain chain) {
		this.chain = chain;
	}

	@Override
	public String toString() {
		return "Bycycle [chain=" + chain + "]";
	}

}
