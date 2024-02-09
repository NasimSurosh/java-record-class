import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

record Animal(String species, boolean canHop, boolean canSwim) {
  
}
interface CheckTrait{
  boolean test(Animal a);
}
class CheckIfHopper implements CheckTrait{

  @Override
  public boolean test(Animal a) {
    
    return a.canHop();
  }
  
}
 public class Main {

  public static void main(String[] args) {
    
    var animals = new ArrayList<Animal>();
    animals.add(new Animal("fish", false, true));
    animals.add(new Animal("kangaroo", true, false));
   
    animals.add(new Animal("rabbit", true, false));
   
    animals.add(new Animal("turtle", false, true));

    print(animals, a -> a.canHop());
  }
  private static void print(List<Animal> animals, CheckTrait checker) {
    for(Animal animal : animals) {
      if(checker.test(animal));
      System.out.println(animal+" ");
    }
    System.out.println();
    
    
    
  }

}
