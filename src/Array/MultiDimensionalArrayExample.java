package Array;

public class MultiDimensionalArrayExample {
    public static void main(String[] args) {
        //3 rows and 5 columns
        int marks[][] = {
            {34,65,89,44,39},
            {78,90,76,54,66},
            {45,68,98,42,55}
        };
        for(int i=0; i<3; i++){
            for(int j=0; j<5; j++){
                System.out.print(marks[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
