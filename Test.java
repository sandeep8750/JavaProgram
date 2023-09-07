import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        int b[] = { 1, 2, 3, 4, 5 };

        map<integer , integer > map = new HashMap<integer , integer>();
        int l1 = a.length;
        int l2 = b.length;
        int flage = 0;

        if(l1 == l2)
        {

            for (int x : a) {
                if(map.get(x) == null ){
                    map.put(x , 1 );
                }
                else{
                   int count =  map.get(x);
                   count++;
                   map.put(x,count);
                }
            }

            for (int x : b) {
                
                if( !map.containKey(x))
                {
                    flage = 1; 
                    break;
                }
            }
        }

        if (flage == 0 ) {
            System.out.println("Both array are equal ");
        }
        else{
            System.out.println("Both array are not equal ");
        }
    }
}
