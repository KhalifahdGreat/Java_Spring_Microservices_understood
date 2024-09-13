public class looping {
    
//while loop
//do while loop
//for loop
    public static void main(String arg[]){
        int b=10;
     for (int i = 0; i <= b; i++) {
        System.out.println(i);
     }

    //while loop and nested while loop
    int e = 4;
    while(e<=4){
    System.out.println("while loop "+ e);
    e++;

    int f = 2;
    while(f<=5){
        System.out.println("nested while loop "+ f);
        f++;
    }
    }


    //do while

    do{
        System.out.println("do this atleast once " + e);
        e++;
    }while(e<=4);
    }
}
