/**
 * Java 1. Homework 5
 *
 * @author Telepov Vladislav
 * version 14.04.2022
 */
	

	public class HomeWorkApp5 {
	    public static void main(String[] args) {
	        Person[] persArray = new Person[5];
	        persArray[0] = new Person("Telepov Vlad", "Sales", "telepov@mail.com", "8 911 111 11 11", 75000, 28);
	        persArray[1] = new Person("Petrov Ivan", "Manager", "petrov@mail.com", "8 922 222 22 22", 80000, 30);
	        persArray[2] = new Person("Sidorov Sasha", "IT", "sidorov@mail.com", "8 933 333 33 33", 90000, 40);
	        persArray[3] = new Person("Ivanov Igor", "Detective", "ivanov@mail.com", "8 944 444 44 44", 60000, 50);
	        persArray[4] = new Person("Kireev Sergey", "Driver", "kireev@mail.com", "8 955 555 55 55", 50000, 55);
	        for (Person person : persArray){
	            if (person.getAge() > 40)
	                System.out.println(person);
	        }
	    }
	}
	

	/**
	 * Class Person - Сотрудник
	 */
	

	class Person {
	    private String name;
	    private String position;
	    private String email;
	    private String phone;
	    private int salary;
	    private int age;
	

	    public Person(String name, String position, String email, String phone, int salary, int age) {
	        this.name = name;
	        this.position = position;
	        this.email = email;
	        this.phone = phone;
	        this.salary = salary;
	        this.age = age;
	    }
	

	    public int getAge() {
	        return age;
	    }
	

	    @Override
	    public String toString() {
	        return (name +
	                "\n| Position: " + position +
	                "\n| Email: " + email +
	                "\n| Phone: " + phone +
	                "\n| Salary: " + salary +
	                "\n| Age: " + age);
	    }
	}
