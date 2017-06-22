package lesson12;

import lesson11.OurSamle;

/**
 * Created by asv on 22.06.17.
 */
public class Person implements Comparable<Person> {

    private int age;
    private String name;

    public Person(String name) {

        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Person other = (Person) o;
        return this.age == other.getAge() &&
                this.getName().equals(other.getName());

    }

    @Override
    public String toString() {

        return "Person name is " + name + " and person age = " + Integer.toString(age);
    }

    @Override
    public int compareTo(Person o) {

        if (this.getAge() < o.getAge()) {
            return -1;
        }

        if (this.getAge() > o.getAge()) {
            return 1;
        }

        return 0;
    }

    public String getName() {

        return name;
    }
}
