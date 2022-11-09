interface PerformOperation {
    boolean check(int a);
}
class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }
    public static PerformOperation isOdd(){
        return new Perform(1);
    }
    public static PerformOperation isPrime(){
        return new Perform(2);
    }
    public static PerformOperation isPalindrome(){
        return new Perform(3);
    }
}
