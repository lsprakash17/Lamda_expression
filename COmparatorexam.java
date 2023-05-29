package LamdaExpression;

import java.util.Arrays;
import java.util.Comparator;

final class Employee
{
int age;
String name;
double sal;
public Employee(int age, String name, double sal) {
	super();
	this.age = age;
	this.name = name;
	this.sal = sal;
}
@Override
public String toString() {
	return "Employee [age=" + age + ", name=" + name + ", sal=" + sal + "]";
}
}
public class COmparatorexam 
{
public static void main(String[] args) 
{
Comparator c=(o,o1)->{
	Employee e=(Employee)o;
	Employee e1=(Employee)o1;
	return e.age-e1.age;
};
Employee [] arr= {new Employee(21,"prakash",210012.45),new Employee(18,"akash", 25000.5)};
Arrays.sort(arr,c);
for(Employee e:arr)
{
	System.out.println(e);
}
}
}
