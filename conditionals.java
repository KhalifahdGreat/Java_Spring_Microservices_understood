public class conditionals {
    public static void main(String[] args){

        int x = 10;
        if(x == 8)
            System.out.println("hello");
        else if(x == 10)
            System.out.println("world"); ///with multiple statement add curly brackets
        else
            System.out.println("java");




        if(x>5 && x < 12){
            System.out.println("x is between 5 and 12");
        }

        //tenary operators
        String result = "A";

       String check = result=="A" ? "hurray" : "No";
       System.out.println(check);

    }
}
