import java.util.ArrayList;
public class PrimeNumbers {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int array[] = new int[1000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
           // System.out.println(array[i] + "\t");
        }
        ArrayList<Integer> temp= new ArrayList<>();
        for(int i=0;i<array.length;i++){
            if(isPrime(array[i])){
                temp.add(array[i]);
            }
        }
        System.out.println("prime numbers are:");
        for (int i:temp){
            System.out.print(i+ "\t");
        }
    }
}