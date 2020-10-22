package com.nttdata.collection.set;

public class Student {
	
	private int sid;
	private  String sname;
	private String sadd;
	public Student(int sid, String sname, String sadd) {
	super();
	this.sid = sid;
	this.sname = sname;
	this.sadd = sadd;
	}
	public int getSid() {
	return sid;
	}
	public void setSid(int sid) {
	this.sid = sid;
	}
	public String getSname() {
	return sname;
	}
	public void setSname(String sname) {
	this.sname = sname;
	}
	public String getSadd() {
	return sadd;
	}
	public void setSadd(String sadd) {
	this.sadd = sadd;
	}
	@Override
	public String toString() {
	return "Student [sid=" + sid + ", sname=" + sname + ", sadd=" + sadd + "]";
	}
	@Override
	public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((sadd == null) ? 0 : sadd.hashCode());
	result = prime * result + sid;
	result = prime * result + ((sname == null) ? 0 : sname.hashCode());
	return result;
	}
	@Override
	public boolean equals(Object obj) {
	if (this == obj)
	return true;
	if (obj == null)
	return false;
	if (getClass() != obj.getClass())
	return false;
	Student other = (Student) obj;
	if (sadd == null) {
	if (other.sadd != null)
	return false;
	} else if (!sadd.equals(other.sadd))
	return false;
	if (sid != other.sid)
	return false;
	if (sname == null) {
	if (other.sname != null)
	return false;
	} else if (!sname.equals(other.sname))
	return false;
	return true;
	}
}
	
