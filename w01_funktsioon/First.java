public class First {
    public static void main(String[] args){
        //System.out.println(args.length);
        int[] numberArray = new int[5];
        int numberArray2[] = new int[5];
        
        String[] stringArray = new String[5];
        String[] greetingsArray = new String[5]{ " hello, world", "!"}; //algväärtus

        int year = 2021;

        String name = "Gaspar";
        int myInt = Integer.MAX_VALUE;

        //Primitiivtüübid
        long myLong = Long.MAX_VALUE;
        byte myByte=  Byte.MAX_VALUE; // -128 to 127
        short myShort = Short.MIN_VALUE; //2000
        double myDouble = 2.4;
        float myFloat = 2.4f; //
        boolean flag = true; //false
        char cahracter = 'F';


        // fori tsükkel
        for (int i = 0; i < greetingsArray.length; i++){
            System.out.println(greetingArray[i]);
        }
        
        //foreach tsükkel
        for (String text : greetingsArray){
            System.out.println(text);
        }

        if (year == 2021){
            System.out.println(year + "is equal to 2021"); 
        } else if (year > 2021){
            System.out.println(year + "is greater than 2021");
    
        } else {
            System.out.println(year + "Is not equal or larger than 2021");
        }

        //while tsükkel
        int length = args.length;

        while (length > 0){
            length--;
            System.out.println("Inside while");
        }
    //System.out.println
    System.out.println("Hello world");
    System.out.print("Hello world");
    System.out.print("\n");
    System.out.print("Reavahetus");

    String hello = "hello world";
    }
}


// javascriptis oleks function main(args){ }
// let something = "Hello"

// javac First.java
//java First
//java First 1 2 3 "hello wrold"