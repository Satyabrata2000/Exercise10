package Exercise10;

//Initialize a Dynamic Array
public class Example1 {

    public static void main(String[] args) {
        int array[];
        array = new int[3];
        array[0] = 1;
        array[1] = 7;
        array[2] = 4;
        System.out.print("Elements of the array are ");
        for(int i=0; i< array.length; i++){
            System.out.print(array[i] + ", ");
        }
    }


}
