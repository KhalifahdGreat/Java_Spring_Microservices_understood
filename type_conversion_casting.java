class type_conversion{

public static void main(String args[]){


    int b = 257;
    byte k = (byte) b;
    System.out.println(k);

    float g = 5.6f;
    int h = (int)g;

    System.out.println(h);

    //type promotion

    byte height = 20;
    byte age = 25;


    int body = age * height;
    System.out.println(body);
}

}