package ders12.equals;

public class Person implements Cloneable{

	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person(String name, int age) {

		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if (obj instanceof Person) {
			Person p = (Person) obj;
			result = this.name.equals(p.name) && this.age == p.age;
		}

		return result;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
