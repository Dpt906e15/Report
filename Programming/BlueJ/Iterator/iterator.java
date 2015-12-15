import java.util.Random;

public class iterator
{
    private int[] list;
    private Random rand = new Random();
    
    // Konstruktør for objekter af klassen iterator
    public iterator(int size)
    {
        list = new int[size];
       
        for(int i = 0; i < list.length; i++) {            
            list[i] = rand.nextInt(20);
        }
    }

    public void printList()
    {
        System.out.print("[");
        for(int i = 0; i < list.length; i++) {
            System.out.print(list[i] + ",");
        }
        System.out.println("]");
    }
    
    public void iterate() {
        printList();
        
        for(int i = 1; i < list.length; i += 2) {
            list[i] += 20;
        }
        
        printList();
    }
}
