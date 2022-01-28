package homework;

public class Animal {

    private String animalBreed;
    private String animalColor;
    private String animalName;
    private int energyCount = 4;
    private boolean isSleeping = false;

    public Animal(String animalBreed, String animalColor, String animalName) {
        this.animalBreed = animalBreed;
        this.animalColor = animalColor;
        this.animalName = animalName;
    }

    public String getAnimalBreed() {
        return animalBreed;
    }

    public String getAnimalColor() {
        return animalColor;
    }

    public String getAnimalName() {
        return animalName;
    }


    public void feed() {
        if (energyCount == 4) {
            System.out.println("I don't want to eat.");
        } else {
            energyCount++;
            System.out.println("Thanks for feeding me");
        }
    }

    public void walk() {
        if (energyCount == -1) {
            System.out.println("I am hungry! Please feed me.");
        } else {
            energyCount--;
            System.out.println("Thanks for walk me");
        }
    }
    public void play(){
        if(energyCount==-1){
            System.out.println("I don't want to play");
        } else {
            energyCount--;
            System.out.println("Thanks for playing with me");
        }
    }

    public void train(){
        if(energyCount==-1){
            System.out.println("I'm tired after training");
        } else {
            energyCount--;
            System.out.println("Thanks for training me");
        }
    }

    public void sleep(){
        if(energyCount==-1){
            System.out.println("I want to sleep");
        } else {
            energyCount--;
            System.out.println("Today I have good mood");
        }
    }




    }