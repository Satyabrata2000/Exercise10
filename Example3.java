package Exercise10;

//Constructor overloading example
public class Example3 {

    private int n1;
    Example3(){
        n1 = 10;
    }
    Example3(int n2){
        n1 = n2;
    }
    void display(){
        System.out.println("The no is " + n1);
    }
}
