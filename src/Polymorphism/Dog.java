public class Dog extends Animal {
    public Dog (String name) {
        super(name);
    }
    @Override
    public String noise() {
       return "I go woof";
    }

    @Override
    public String eat() {
        return "I eat the kibble";
      
    }
    @Override
    public String getName() {
        return "The dog is named: " + super.getName();
    }
    public String toString() {
        return "This is: " + super.getName();
    }
    
}
