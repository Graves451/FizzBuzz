public class Reduce {
    public static void main(String[] args){
        int start = 10;
        int counter = 0;
        while(start != 0){
            if(start%2 == 0){
                start /= 2;
            }
            else{
                start -= 1;
            }
            counter += 1;
        }
        System.out.println(counter);
    }
}
