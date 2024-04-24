package com.java.multithreading;

public final class ImmutablePerson {
	
	private String firstName;
	
	private String lastName;
	
	public ImmutablePerson(String firstName, String lastName, long ssn) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssn = ssn;
	}
	private long ssn;

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public long getSsn() {
		return ssn;
	}
	

}
