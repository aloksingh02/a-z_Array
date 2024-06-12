public class Concept {
    public static void main(String[] args) {

        // store 5 roll no.
//        int roll1 = 7;
//        int roll2 = 5;
//        int roll3 = 9;
//        System.out.println(roll2);
        //we cant do for large no. of rollno. thats why we use array.
        //for the store a collection of similar element we use the array.


        //HOW TO DECLARE THE ARRAY
        //datatype [] varible_name = new datatype[size];
        // here store 5 roll no. in an array
        //int[] rollnos = new int[5];
        // or 2nd ways
        //int[] rollnos1 = {1,5,4,8,5};
        // BREAKING DOWN THIS

        //int[] rollnos; = Declaration of the array. ros is getting define in the stack
        //rollnos = new int[] =  Initialization : object is being created
        //Each particular thing is element and every element is the object
        String [] names = new String[5];
        System.out.println(names[1]);

    }
}
