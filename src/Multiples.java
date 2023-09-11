public class Multiples {
    public static void main(String[] args){
        for(int i = 1; i <= 1000; i++){
            boolean two = i % 2 == 0;
            boolean five = i %5  == 0;
            if(five || two){
                System.out.println(i);
            }

        }
    }
}
