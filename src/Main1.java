
interface Converter{
  long round(double num);
}
public class Main1 {

  public static void main(String[] args) {

    Converter math= Math::round;
    Converter lambda= a -> math.round(a);
    
    System.out.println(lambda.round(100.1));
    

    
  }

}
