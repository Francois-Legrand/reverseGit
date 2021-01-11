package fr.francois.reverseGit;

public class Personne {
	String name;
	String firstName;
	int year;
	public Personne(String name, String firstName, int year) {
		this.name = name;
		this.firstName = firstName;
		this.year = year;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
}
