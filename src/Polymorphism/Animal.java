public abstract class Animal {
    private String name;
    public Animal(String name) {
        this.name = name;
    }

    public abstract String noise();
    public abstract String eat();
    public String getName() {
        return this.name;
    }

}