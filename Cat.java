public class Cat extends Animal {
    
    public Cat (String name){
        super(name);
    }

    @Override
    public String toString(){
        return ("Cat: " + getName() + ", Arrival ID: " + getArrivalId());
    }    
}
