public class Cat extends Animal{
        
        // Data...
        private String name;
    
        // Constructors...
        public Cat(String name) {
            super(name);
        }
        
        public String getName() {
            return "The cat is named: " + super.getName();
        }

        @Override
        public String toString() {
            return "This is: " + super.getName();
        }

        @Override
        public String noise() {
            return "I go meow";
        }

        @Override
        public String eat() {
            return "I eat the fish";
        }
    
}