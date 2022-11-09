import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        MyMath ob = new MyMath();
        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in));
        System.out.println("Ingrese el numero de casos de prueba: ");
        int T = Integer.parseInt(br.readLine());
        PerformOperation op;
        boolean ret = false;
        String ans = null;
        while (T--> 0) {
            System.out.println("Ingrese el caso y el numero a evaluar (recuderde el espacio entre los dos parametros): ");
            String s = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(s);
            int ch = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if (ch == 1) {
                op = ob.isOdd();
                ret = ob.checker(op, num);
                ans = (ret) ? "IMPAR" : "PAR";
            } else if (ch == 2) {
                op = ob.isPrime();
                ret = ob.checker(op, num);
                ans = (ret) ? "PRIMO" : "COMPUESTO";
            } else if (ch == 3) {
                op = ob.isPalindrome();
                ret = ob.checker(op, num);
                ans = (ret) ? "PALINDROMO" : "NO PALINDROMO";
            }
            System.out.println(ans);
        }
    }
}