import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculate {
   
    private static void showResult(double res){
 
        if(res == Math.floor(res)){
            System.out.println("RESULT: " + (int)res);
            System.out.println("=========================");
        }
        else{
            System.out.println("RESULT: " + res);
            System.out.println("=========================");
        }

    }

 
    public static void start() throws IOException {

        
        BufferedReader reader;
        double first;
        double second;
        String operation;

        reader = new BufferedReader(new InputStreamReader(System.in));

        
        System.out.println("************   SimpleCalc   *****************");

       
        System.out.println("Enter first number");
        first = Double.parseDouble(reader.readLine());

        System.out.println("Select operation (+ - * / ^ )");
        operation = reader.readLine();

     
        System.out.println("Enter second mumber");
        second = Double.parseDouble(reader.readLine());



        switch (operation){

            case "+" : showResult(first + second);
                break;

            case "-" : showResult(first - second);
                break;

            case "*" : showResult(first * second);
                break;

            case "/" :
                if(0 == second)System.out.println("Division by zero!");//проверяем чтоб делитель не был 0
                else showResult(first / second);
                break;

            case "^" : showResult(  Math.pow(first,second) );
                break;

            default:
                System.out.println("Erorr!Uncorrect operation!");
        }

    }

}
