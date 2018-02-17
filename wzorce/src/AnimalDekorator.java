/**
 * Created by student on 17.02.2018.
 */
public class AnimalDekorator extends Animal {

    public AnimalDekorator (int age) {
        super(age);
    }

    @Override
    public int getAge() {
        System.out.println("Czesc, jestem dekorator");
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        System.out.println("Czesc, jestem dekorator");
        super.setAge(age);
    }
}
