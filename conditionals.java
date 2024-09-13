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


       int n = 2;

       switch (n) {
        case 1:
            System.out.println("Monday");
            break;
       case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        default:
            break;
       }

    }
}
