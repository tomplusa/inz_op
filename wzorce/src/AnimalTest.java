/**
 * Created by student on 17.02.2018.
 */
public class AnimalTest {
    public static void main(String[] args) {

        Animal animal = new Animal(5);
        System.out.println(animal.getAge());

        Animal animalDekorator = new AnimalDekorator(5);
        System.out.println(animalDekorator.getAge());

    }
}
