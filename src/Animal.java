public abstract class Animal{

        abstract void makesSound();

}

class Cat extends Animal{


    void makesSound(){
            System.out.println("Meaaoooo");
        }
}

class Dog extends Animal{

    @Override
    void makesSound() {
        System.out.println("Wooohh");
    }
}

class Main{
    public static void main(String[] args) {
       Animal cat = new Cat();
       Animal dog = new Dog();

       cat.makesSound();
       dog.makesSound();
    }
}

