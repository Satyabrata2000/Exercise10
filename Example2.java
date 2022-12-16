package Exercise10;

//Dynamic Array another example
public class Example2 {

    private int array[];
    private int count;
    private int sizeofarray;

    //creating a constructor of the class that initializes the values

    public Example2(){
        array = new int[1];
        count = 0;
        sizeofarray = 1;
    }

    //creating a function that appends an element at the end of the array
    public void addElement(int a){
        if(count == sizeofarray){
            growSize(); //invoking the growSize method that creates an array of double size
        }
        array[count] = a;
        count++;
    }

    //function that creates an array of double size
    public void growSize(){
        int temp[] = null;
        if(count == sizeofarray){
            temp = new int[sizeofarray * 2]; { //initialize a double size of array
                for(int i = 0; i < sizeofarray; i++){
                    temp[i] = array[i];  //copies all the elements of the old array
                }
            }
        }
        array = temp;
        sizeofarray = sizeofarray * 2;
    }

    //creating a function that deletes an element at the specified index
    public void addElementAt(int index, int a){
        if(count == sizeofarray) {
            growSize();
        } for(int i = count-1; i>= index; i--){
            array[i+1] = array[i];  //shifting all the elements to the left from the specified index
        }
        array[index] = a; //inserts an element at the specified index
        count++;
    }

    public static void main(String[] args) {

        Example2 obj = new Example2();
        obj.addElement(12);
        obj.addElement(22);
        obj.addElement(34);
        for(int i=0; i< obj.sizeofarray; i++){
            System.out.print(obj.array[i] + ", ");
        }
        System.out.println();
        System.out.println("Size of the array: " + obj.sizeofarray);
        System.out.println("No of elements in the array: " + obj.count);
        obj.addElementAt(3, 30);
        System.out.print("Elements of the array after adding an element at index 5 \n");
        for(int i = 0; i< obj.sizeofarray; i++){
            System.out.print(obj.array[i]+ ", ");
        }
        System.out.println();
        System.out.println("Size of the array is: " + obj.sizeofarray);
        System.out.println("No of element in the array: " + obj.count);
    }

}
