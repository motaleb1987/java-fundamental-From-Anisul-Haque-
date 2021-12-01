package testDemo;

public class ContinueStatement {
    public static void main(String[] args) {
        // Continue

        for(int i=1; i<=100; i++){
            if(i==10){
                // Not show is 10
                continue;
            }
            System.out.println(i);
        }



    }
}
