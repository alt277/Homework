import java.util.ArrayList;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        ArrayList< Integer > myList = new ArrayList < > ( ) ;
        myList.add(4);
        myList.add(49);
        myList.add(25);
        myList.add(24);
        myList.add(72);
        myList.add(28);
        myList.add(22);
        System.out.println ( "Иcxoдный список : " + myList) ;

        Stream<String> values= myList.stream( )
                .filter(( n ) -> (n % 2 ) == 0)
                .filter ( ( n ) -> n > 10 )
                .map((o)-> o>50 ?"big":"small");

        values.forEach((n)-> System.out.println(n));
    }
}
