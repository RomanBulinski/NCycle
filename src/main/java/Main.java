import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {

    public static int cycle(int n) {

        BigDecimal one = new BigDecimal(1);
        BigDecimal input = new BigDecimal(n);
        BigDecimal divided = one.divide(input,500, RoundingMode.CEILING);
        String output =  divided.toString().substring(2);
        int counter = 1;
        char start = output.charAt(0);

        while(counter<500){
            char next = output.charAt(counter);
            System.out.println(next);
            if(start != next ){
                counter++;
            }else if( start == next && output.charAt(1) == output.charAt(counter +1 ) && output.charAt(10) == output.charAt(counter +10 )  ){
                return counter;
            }else{
                counter++;
            }
        }
        return -1;
    }




    public static void main(String[] args){

//        BigDecimal one = new BigDecimal(1);
//        BigDecimal input = new BigDecimal(7);
//        BigDecimal output = one.divide(input,100, RoundingMode.CEILING);
//
//
//        System.out.println( output.toString() );
//
//
//        BigDecimal a = new BigDecimal("1");
//        BigDecimal b = new BigDecimal("4");
//        BigDecimal c = new BigDecimal("0.33");
//
//        System.out.println(a.divide(b));




    }




}
