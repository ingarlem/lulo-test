import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Perform implements PerformOperation{
    int i=0;
    public Perform(int i) {
        this.i = i;
    }
    @Override
    public boolean check(int num) {
//Escriba aqui su codigo
//Lambda Impares/Pares
        if(i==1){
            int a[] = {num};
            long c = (long) Arrays.stream(a).filter(d->d%2!=0).count();
            if (c==1) {
                return true;
            }
            else{
                return false;
            }
        }
//Lambda Primos/Compuestos
        if(i==2){
            String numString = String.valueOf(num);
            int div[] = {2, 3, 5, 7};
            long count = Arrays.stream(div).filter(item -> ((int) numString.charAt(numString.length()-1)) % item == 0).count();
            return count == 0;
        }
//Lambda Palindromo/No Palindromo
        if (i==3){
            List<String> collect = String.valueOf(num).chars().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.toList());
            String reduce = collect.stream().reduce("", (acum, str) -> {
                return str.concat(acum);
            });
            return reduce.equals(String.valueOf(num));
        }
        return false;
    }
}
