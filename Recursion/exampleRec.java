

public class exampleRec {
    private static int i = 0;
    private static void func1(){
        //Base condition 
        if(i == 100 ) 
            return;
        System.out.print(i+" ");
        i++;
        func1();
    }
    public static void main(String args[]){
         func1();
    }
}
