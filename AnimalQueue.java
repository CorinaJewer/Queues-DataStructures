import java.util.LinkedList;
import java.util.Queue;

public class AnimalQueue {

    private Queue<Animal> cats;
    private Queue<Animal> dogs;

    public AnimalQueue(){
    cats = new LinkedList<>();
    dogs = new LinkedList<>();
    }

    public void newAnimal(Animal animal) {
        if (animal instanceof Cat) {
            cats.add(animal);
        } else {
            dogs.add(animal);
        }
    }

    public void adoptAnimal(String type) {
        if (type.equalsIgnoreCase("cat")) {
            Animal adopted = cats.poll(); 
            if (adopted != null) {
                System.out.println("Adopted - " + adopted);
            } else {
                System.out.println("Sorry!, We have no cats avaialble for adoption. Check back soon!");
            }
        } else if (type.equalsIgnoreCase("dog")) {
            Animal adopted = dogs.poll(); 
            if (adopted != null) {
                System.out.println("Adopted - " + adopted);
            } else {
                System.out.println("Sorry!, We have no dogs available for adoption. Check back soon!");
            }
        } else {
            System.out.println("Invalid animal type. Please enter 'cat' or 'dog'.");
        }
    }

    public void adoptDog(){
        Animal adopted = dogs.poll(); 
            if (adopted != null) {
                System.out.println("Adopted - " + adopted);
            } else {
                System.out.println("Sorry!, We have no dogs available for adoption. Check back soon!");
            }
    }

    public void adoptCat(){
        Animal adopted = cats.poll(); 
            if (adopted != null) {
                System.out.println("Adopted - " + adopted);
            } else {
                System.out.println("Sorry!, We have no cats available for adoption. Check back soon!");
            }
    }

    public void nextForAdoption(String type){
        if (type.equalsIgnoreCase("cat")){
            Animal nextCatToAdopt = cats.peek();
            if (nextCatToAdopt != null) {
                System.out.println("The next cat for adoption is " + nextCatToAdopt + ".");
            } else {
                System.out.println("We have no cats available for adoption at this time.");
            }
        } else if (type.equalsIgnoreCase("dog")) {
            Animal nextDogToAdopt = dogs.peek();
            if (nextDogToAdopt != null) {
                System.out.println("The next dog for adoption is " + nextDogToAdopt + ".");
            } else {
                System.out.println("We have no dogs available for adoption at this time.");
            }
        } else {
            System.out.println("Invalid animal type. Please enter 'cat' or 'dog'.");
        }
    }

    @Override
    public String toString() {
        String result = "Current Shelter Animal List:\n";
        result += "-------------------\n";
        for (Animal animal : cats) {
            result += animal.toString() + "\n";  
        }
        for (Animal animal : dogs) {
            result += animal.toString() + "\n"; 
        }
        return result;
    }

    public static void main(String[] args) {

        AnimalQueue animalQueue = new AnimalQueue();

        Cat cat1 = new Cat("Tabby");
        Cat cat2 = new Cat("Patches");
        Cat cat3 = new Cat("Garfield");
        Cat cat4 = new Cat("Snowball");
        Dog dog1 = new Dog("Spot");
        Dog dog2 = new Dog("Buddy");
        Dog dog3 = new Dog("Runner");
        Dog dog4 = new Dog("Odie");

        animalQueue.newAnimal(cat1);
        animalQueue.newAnimal(cat2);
        animalQueue.newAnimal(cat3);
        animalQueue.newAnimal(cat4);
        
        animalQueue.newAnimal(dog1);  
        animalQueue.newAnimal(dog2);
        animalQueue.newAnimal(dog3);  
        animalQueue.newAnimal(dog4);
               
        System.out.println();
        
        System.out.println(animalQueue);

        animalQueue.adoptAnimal("cat");
        animalQueue.adoptAnimal("cat");
        animalQueue.adoptAnimal("cat");

        animalQueue.adoptAnimal("dog");
        animalQueue.adoptAnimal("dog");
        animalQueue.adoptAnimal("dog");

        System.out.println();

        animalQueue.nextForAdoption("cat");
        animalQueue.nextForAdoption("dog");  

        System.out.println();
        
        animalQueue.adoptDog();
        animalQueue.adoptCat();

        System.out.println();

        animalQueue.nextForAdoption("dog");
        animalQueue.nextForAdoption("cat");
    }
}
    
