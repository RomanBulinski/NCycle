import java.math.BigDecimal;

public class Main {

    public static int cycle(int n) {


        BigDecimal one = new BigDecimal("1");

        BigDecimal input = new BigDecimal(String.valueOf(n));

        BigDecimal output = one.divide(input).setScale(10);

        System.out.println( output.toString() );

        return 22;


    }


}
