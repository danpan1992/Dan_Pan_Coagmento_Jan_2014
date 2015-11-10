package com.coagmento.mobile;

public class Snippet extends WebPage{
	
	private String content;
	private String node;
	private int beenRead;

	public Snippet(String t, String u, String d, String ti, String c, String n) {
		super(t, u, d, ti);
		this.content=c;
		this.node=n;	
		this.beenRead=1;
	}
	
	public String getContent(){
		return this.content;
	}
	public String getNode(){
		return this.node;
	}
	
	public int getRead(){
		return this.beenRead;
	}
	public void setUnRead(){
		this.beenRead=0;
	}

}
