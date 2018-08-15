
package cource;

class Person
{
    private final String Name;
    private final String Address;

    public Person(String Name, String Address) {
        this.Name = Name;
        this.Address = Address;
    }

    public String getName() {
        return Name;
    }

    public String getAddress() {
        return Address;
    }

    @Override
    public String toString() {
        return "Person{" + "Name=" + Name + ", Address=" + Address + '}';
    }
    
    
}
class Student extends Person
{
    
    public Student(String Name, String Address) 
    {
        super(Name, Address);
    }
    private String Student_id;
    
    
}
class Teacher extends Person
{
    
    public Teacher(String Name, String Address) {
        super(Name, Address);
    }
    
}
public class Cource 
{
    
    
    public static void main(String[] args) 
    {
        
    }
    
}
