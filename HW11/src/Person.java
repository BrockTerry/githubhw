/**
 * Objective: Use Inheritance to extend classes into eachother
 * Algorithm: Description how to resolve the problem:I created each class and extended the proper ones as instructed - then I used toString to be able to call the
 * name of each class, the Person's name and the other variables within each class.
 *Input and Output:Exit Code 0
 * Created by:Brock Terry
 * Date:6/10/23
 * Version:IntelliJ
 */

//Superclass
public class Person {

    public String Name;
    public String Address;
    public int PhoneNumber;
    public String Email;
public String toString(){
    //make sure each variable is in the return
    return "Person "+Name+" " + Address+ " " +PhoneNumber+ " "+ Email;
}
    }
//subclass
class Student extends Person{
    public String toString(){
        return "Student "+Name+ " "+ ClassStatus;
    }
    public static String ClassStatus;
}
//subclass
class Employee extends Person{

    public String toString(){
        return "Employee "+Name + " " + Office + " " + Salary + " " + Date;
    }
    public String Office;
    public int Salary;

    public String Date = "6/10/23";

}
//subclass
class Faculty extends Employee{
    public String toString(){
        return "Faculty "+Name + " " + Rank + " " + Officestart + "-" + Officestop;
    }
    public String Rank;
    public int Officestart;
    public int Officestop;
}
//subclass
class Staff extends Employee{
    public String toString(){
        return "Staff "+Name+ " "+ Title;
    }
    public String Title;
}
class HW11 {

    public static void main(String[] args) {
//create each object for calling toString later
        Person p1 = new Person();
        Student s1 = new Student();
        Employee e1 = new Employee();
        Faculty f1 = new Faculty();
        Staff s2 = new Staff();

        //give each variable substance before calling toString
        p1.Name = "Brad";
        p1.Address = "First Street";
        p1.PhoneNumber=12345;
        p1.Email = "ABC@YAHOO.COM";

        s1.Name = "Chad";
        s1.ClassStatus = "Freshman ";

        e1.Name = "Thad";
        e1.Office = "Building 1 ";
        e1.Salary =50000;

        f1.Name = "Zad";
        f1.Rank = "Supervisor ";
        f1.Officestart =9;
        f1.Officestop =5;

        s2.Name = "Lad";
        s2.Title = "Cleaner";


        //SOP the toStrings
        System.out.println(p1.toString());
        System.out.println(s1.toString());
        System.out.println(e1.toString());
        System.out.println(f1.toString());
        System.out.println(s2.toString());

    }
}
