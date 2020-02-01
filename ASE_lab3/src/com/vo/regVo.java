package com.vo;

/**
 * this is the setter getter class that allows to add user entered values obtained from jsp pages and 
 * retrieve's through session when needed.
 * @author sheshan
 *
 */
public class regVo {
	
	private String fn;
	private String ln;
	private String us;
	private String pw;
	private String us1;
	private String pw1;
	public String getFn() {
		return fn;
	}
	public void setFn(String fn) {
		this.fn = fn;
	}
	public String getLn() {
		return ln;
	}
	public void setLn(String ln) {
		this.ln = ln;
	}
	public String getUs() {
		return us;
	}
	public void setUs(String us) {
		this.us = us;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getUs1() {
		return us1;
	}
	public void setUs1(String us1) {
		this.us1 = us1;
	}
	public String getPw1() {
		return pw1;
	}
	public void setPw1(String pw1) {
		this.pw1 = pw1;
	}
}
