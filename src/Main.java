public class Main {

    public static void main(String[] args) {

        Child child1 = new Child("Roni", 12, Gender.FEMALE, CountryOfBirth.ISRAEL, false);
        Child child2 = new Child("Max", 4,Gender.MALE, CountryOfBirth.USA, true);

        Child [] children = {child1, child2};
        Parent par1 = new Parent("James", 45, Gender.MALE, CountryOfBirth.USA, children);

        System.out.println();
        System.out.println(par1);
        System.out.println();

        par1.cry("");
        par1.complain();
        child1.laugh("");
        child2.cry("");

        }
    }

