package Assignments.Assignment6;


public class Animal{

   public int age;
   public String gender;
       
Animal(){
    gender= "female";
    age= 2;
}

public static void run(){
    System.out.println("Is the zebra wild? True or False? ");
}

public static void isMammal(){
        System.out.println("This animal is a mammal");
   }
   public static void mate(){
    System.out.println("The animal has not mated");
        }
   
   public static void main(String[] args ){
    Animal myAnimal = new Animal();
    Fish myFish = new Fish();
    Zebra myZebra = new Zebra();
    System.out.println(myAnimal.gender);
    System.out.println(myAnimal.age);
    mate();
    isMammal();
    run();
   }




   
}
class Zebra extends Animal {
    public boolean is_wild;
    public static void run(){
        System.out.println("Is the zebra wild? True or False? ");
    }
    }



class Fish extends Animal{
    private int sizeinFeet;
    private void canEat(){
        sizeinFeet=1;
        System.out.println("The Fish's size in feet is "+ sizeinFeet);
    }
}




