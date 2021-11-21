import java.util.Arrays;

public class Parent extends Person {

    protected Child [] children;

    public Parent(String name, int age, Gender gender, CountryOfBirth country, Child []children) {
        super(name, age, gender, country);
        this.children = children;

    }
    public void complain() {

        System.out.println(name + " is Complaining right now!");

    }
    public void laugh(String l) {

        System.out.println(name + " from " + country + " is Laughing!");
    }

    @Override
    public String toString() {
        return "Parent{" +
                "children=" + Arrays.toString(children) +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", country=" + country +
                '}';
    }


    public void cry(String c) {

        System.out.println(name + " from " + country + " is Crying!");

    }
}