public class Child extends Person{

    private boolean kindergarten;

    public Child(String name, int age, Gender gender , CountryOfBirth country, boolean kindergarten) {
        super(name, age, gender, country);
        this.kindergarten = kindergarten;
    }

    public void cry(String c){

        System.out.println(name + " is crying right now!");
    }

    public void laugh (String l) {

        System.out.println(name + " is Laughing!");

    }

    public boolean isKindergarten() {
        return kindergarten;
    }

    public void setKindergarten(boolean kindergarten) {
        this.kindergarten = kindergarten;
    }

    @Override
    public String toString() {
        return "Child{" +
                "name=" + name +
                ", age='" + age + '\'' +
                ", gender=" + gender +
                ", country=" + country +
                ", kindergarten=" + kindergarten +
                '}';
    }
}
