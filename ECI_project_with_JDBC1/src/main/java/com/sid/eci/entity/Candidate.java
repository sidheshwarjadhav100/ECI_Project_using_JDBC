package com.sid.eci.entity;

public class Candidate {
	// POJO Class
	private int cid;
	private String name;
	private String gender;
	private String party;
	private String state;
	private String assembly;
	private int age;

	// zero parameterized constructor
	public Candidate() {

	}

	// parameterized constructor
	public Candidate(int cid, String name, String gender, String party, String state, String assembly, int age) {

		this.cid = cid;
		this.name = name;
		this.gender = gender;
		this.party = party;
		this.state = state;
		this.assembly = assembly;
		this.age = age;
	}

	// getters and setters
	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getParty() {
		return party;
	}

	public void setParty(String party) {
		this.party = party;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getAssembly() {
		return assembly;
	}

	public void setAssembly(String assembly) {
		this.assembly = assembly;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Candidate [name=" + name + ", party=" + party + ",assembly=" + assembly + "]";
	}

}
