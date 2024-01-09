package Array;


//arrays are immutable(cannot grow),
public class SingleDimensionalArrayExample {
    public static void main(String[] args){
        int[] marks = new int[5];
        marks[0] = 100;
        marks[1] = 800;
        marks[2] = 200;
        marks[3] = 300;
        marks[4] = 500;

        //or
      /*  int[] marks = new int[]{10, 20, 30, 40, 50};*/

       /* for(int i=0; i<=marks.length; i++){
            System.out.println(marks[i]);
        }*/

        //using forEach:prints the elements one by one
        for(int value:marks){
            System.out.println(value);
        }
    }
}
