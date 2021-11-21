enum CountryOfBirth{
    ISRAEL, ITALY, SPAIN, USA, ENGLAND, FRANCE, RUSSIA
}

enum Gender{

    MALE, FEMALE
}

public abstract class Person {

    protected String name;
    protected int age;
    protected Gender gender;
    protected CountryOfBirth country;


    public Person(String name, int age, Gender gender, CountryOfBirth country) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.gender = gender;
    }

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

    public CountryOfBirth getCountry() {
        return country;
    }

    public void setCountry(CountryOfBirth country) {
        this.country = country;
    }

    public abstract void cry(String c);

    public abstract void laugh(String l);
}
