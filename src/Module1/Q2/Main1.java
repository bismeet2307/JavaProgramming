// inheritance 
class animal {

    void eats(){
        System.out.println("The animal is eating");
    }

}
class dog extends animal {
    // polymorphism
    @Override
    void eats() {
        System.out.println("The dog is eating");
    }
    
    
    void barks() {
        System.out.println("The dog is barking");
    }
}

class cat extends animal{
    @Override
    void eats() {
        System.out.println("The cat is eating");
    }


}

public class Main1 {
    public static void main(String[] args) {
        animal a = new animal();
        dog d = new dog();
        cat c = new cat();
        c.eats();
        a.eats();
        d.eats();
        d.barks();
    }

}
