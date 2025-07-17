import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String ...var) throws IOException{

        System.out.println("Test");

        Main m = new Main();
        m.divide(2,0);

    }

    private void divide(int n, int m) throws IOException {

        if(m==0) throw new ArithmeticException("Illegal Denominator");
        System.out.println(n/m);
    }


}
