package u09_Inheritance;

public class Checker {

    private String color;

    public Checker(String color){
        this.color = color;
    }

    public void printColor(){
        System.out.print(color);
    }

    public String getColor(){
        return color;
    }

    public void speak(){
        System.out.println("I'm a checker!!!");
    }



}
