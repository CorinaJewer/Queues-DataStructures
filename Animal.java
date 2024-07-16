public abstract class Animal {

    private String animalName;
    private int arrivalId;
    private static int nextId = 1;

    public Animal(String name){
        this.animalName = name;
        this.arrivalId = nextId++;
    }

    public String getName(){
        return animalName;
    }

    public int getArrivalId(){
        return arrivalId;
   }       
}
