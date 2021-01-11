package fr.francois.reverseGit;

public class Personne {
	String name;
	String firstName;
	int year;
	String genre;
	boolean actif;

	public Personne(String name, String firstName, int year, String genre) {
		this.name = name;
		this.firstName = firstName;
		this.year = year;
		this.genre = genre;
		
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
