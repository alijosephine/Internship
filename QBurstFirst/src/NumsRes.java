/**
 * Created by aleena on 13/4/15.
 */
import java.io.*;

public class NumsRes {
    private int num1;
    private int num2;
    private int res;
    NumsRes() {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter first number: ");
        try {
            num1 = Integer.parseInt(br.readLine());

            System.out.println("Enter second number: ");
            num2 = Integer.parseInt(br.readLine());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    void findSum()
    {
        res=num1+num2;
    }
    void dispAll()
    {
        System.out.println("The sum of "+num1+" and "+num2+" is "+res);
    }
};
