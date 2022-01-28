package homework;

public class AboutAnimals {
    public static void main(String[] args) {

//Exercise about animals properties
        Animal cat = new Animal("Maine Coon", "black", "Ketti");
        System.out.println(cat.getAnimalBreed() + " " + cat.getAnimalColor() + " " + cat.getAnimalName());

        Animal tiger = new Animal("White Tiger", "white", "Lesi");
        System.out.println(tiger.getAnimalBreed() + " " + tiger.getAnimalColor() + " " + tiger.getAnimalName());

        Animal parrot = new Animal("German Roller Canary", "yellow", "Rol");
        System.out.println(parrot.getAnimalBreed() + " " + parrot.getAnimalColor() + " " + parrot.getAnimalName());

        Animal fish = new Animal("Blue Fish", "blue", "Bobo");
        System.out.println(fish.getAnimalBreed() + " " + fish.getAnimalColor() + " " + fish.getAnimalName());

        Animal reptiles = new Animal("Green Iguana", "green", "Greenland");
        System.out.println(reptiles.getAnimalBreed() + " " + reptiles.getAnimalColor() + " " + reptiles.getAnimalName());

        System.out.println("");

//Exercise about animal energy
        Animal dog = new Animal("Jack Russell", "white", "Messi");
        System.out.println(dog.getAnimalBreed() + " " + dog.getAnimalColor() + " " + dog.getAnimalName());
        dog.feed();
        dog.walk();
        dog.train();
        dog.play();
        dog.feed();
        dog.sleep();






    }
}