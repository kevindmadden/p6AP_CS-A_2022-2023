package u09_Inheritance;

public class King extends Checker {

    public King(String color){
        super(color); //Checker(color)

    }

    public void draw(){
        System.out.println(getColor());
    }

    public void speak(){
        System.out.println("I'm a king!");
    }
}
