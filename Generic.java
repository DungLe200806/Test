
package generic;
import java.util.*;

public class Generic {

    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.set(10);
        System.out.println(intBox.get());

        Box<String> strBox = new Box<>();
        strBox.set("Hello");
        System.out.println(strBox.get());


//      Method  
        String[] names = {"Ha", "Dung", "Manh"};
        Integer[] nums = {1, 2, 3};

        Generic.printArray(names);
        Generic.printArray(nums);
        
//      Gioi han kieu
/*       Box<Integer> iBox = new Box<>();
        iBox.set(5);
        System.out.println(iBox.doubleValue());
*/
    }
    
    
//  Method
    public static <T> void printArray(T[] arr) {
        for (T e : arr)
            System.out.print(e + " ");
        System.out.println();
    }
    

    //  Toi da sua
}
