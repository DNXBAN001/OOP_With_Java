package classesAndObjects;

public class Student 
{

	//Instance variables
	private String firstName;
	private String middleName;
	private String lastName;
	
	
	//Methods
	public void setNames(String first, String middle, String last)
	{
		// Set the first, middle and last names of this Student object.
		this.firstName = first;
		this.middleName = middle;
		this.lastName = last;
	}
	
	public String getFullName()
	{
		String fullName = "";
		// Obtain the full name of this Student with the middle name converted to an initial only.
		fullName = this.firstName +" "+this.middleName.charAt(0)+". "+this.lastName;
		return fullName;
	}
}
