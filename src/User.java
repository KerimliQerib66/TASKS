
public class User {
private String name;
private String surname;
private int age;

public User() {
	this("undefined","undefined",-1);
	System.out.print("salam");
}
public User(String name,String surname) {
	this(name,surname,-1);
}
public User(String name,String surname,int age) {
	super();
	this.name=name;
	this.surname=surname;
	this.age=age;
}


public String GetName(){
	return name;
}
public void SetName(String name) {
	this.name=name;
}
public String GetSurName() {
	return surname;
}
public void SetSurName(String surname) {
	this.surname=surname; 
}
public int GetAge() {
	return age;
}
public void SetAge(int age) {
	this.age=age;
}
}
