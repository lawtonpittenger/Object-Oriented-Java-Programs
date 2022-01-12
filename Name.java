/*
 * Program Author: Lawton Pittenger
 * Assignment: HW 6: Composite Class and UML
 * Date: 04.8.2021
 */


public class Name {

private String firstName, middleName, lastName;

// default constructor
public Name() {
// default values
	firstName = "";
	middleName = "";
	lastName = "";
}
// constructor to initialize name with first, middle and last name
public Name(String firstName, String middleName, String lastName) {
	this();
	setFirstName(firstName);
	setMiddleName(middleName);
	setLastName(lastName);
}
// constructor to initialize name with first and last name
public Name(String firstName, String lastName) {
	this();
	setFirstName(firstName);
	setLastName(lastName);
}
// getters and setters
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {

//converting name to sentence case (first letter- capital followed by lower case letters)

if (firstName.length() > 0) {
	char c = firstName.charAt(0);
	firstName = firstName.toLowerCase().substring(1);
	this.firstName = c + firstName;
}
}
public String getMiddleName() {
	return middleName;
}
public void setMiddleName(String middleName) {
	this.middleName = middleName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {

//converting name to sentence case (first letter- capital followed by lower case letters)
if (lastName.length() > 0) {
	char c = lastName.charAt(0);
	lastName = lastName.toLowerCase().substring(1);
	this.lastName = c + lastName;
}
}
@Override
public String toString() {
	// returning concatenated name
	if (middleName != "")
		return firstName + " " + middleName + " " + lastName;
	else
		return firstName + " " + lastName;
}
}
