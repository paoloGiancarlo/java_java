package array.dimension;

public class ArrayLauncher {
    public static void main(String[] args) {
        display1DArrayOfPrimitives();
        display2DArrayOfPrimitives();
        display1DArrayOfObjects();
        display2DArrayOfObjects();
    }


    public static void display1DArrayOfPrimitives() {
        System.out.println("Loading 1D array of primitives...");

        int[] oneDimensionalArray; // note that array object is null initially
        oneDimensionalArray = new int[]{1, 2, 3}; // assign new array object to variable

        System.out.println("1D array contents are ");
        for (int i = 0; i < oneDimensionalArray.length; i++)
            System.out.print(i + "    ");
    }

    public static void display2DArrayOfPrimitives() {
        System.out.println("\n\nLoading 2D array of primitives...");

        int[][] twoDimensionalArray = new int[][]{{1, 2, 3}, {20, 40, 60}};

        System.out.print("2D array contents are \n");

//        for (int row =0; row<twoDimensionalArray.length;row++) {
//            for (int col =0; col<twoDimensionalArray[row].length;col++) {
//                System.out.print(twoDimensionalArray[row][col] + "    ");
//            }
//            System.out.println();
//        }
        for (int[] row : twoDimensionalArray) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }

    public static void display1DArrayOfObjects() {
        System.out.println("\nLoading 1D array of objects Student class (student id)...");

        Student[] oneDimensionalArrayOfRefs = new Student[3];
        for (int studentNum = 0; studentNum < oneDimensionalArrayOfRefs.length; studentNum++) // gs is each element of the array
            oneDimensionalArrayOfRefs[studentNum] = new Student(studentNum + 1001);
        System.out.println("*** Finished loading 1D array of objects ***");

        System.out.print("1D array contents are \n");
        for (Student s : oneDimensionalArrayOfRefs)
            System.out.print(s.getStudentNumber() + "   ");
    }


    public static void display2DArrayOfObjects() {
        System.out.println("\n\nLoading 2D array of objects...");
        Student[][] twoDimensionalArrayOfObjects = new Student[][]{
                {new Student("Robin", "Gander", 1010), new Student("Vijay", "Singh", 1020)},
                {new Student("Hassan", "Ahmed", 1011), new Student("Howard", "Rosenblum", 1021)},
                {new Student("Sheila", "Zhang", 1012), new Student("Chris", "Obotu", 1022)}
        };
        System.out.println("*** Finished loading 2D array of objects ***");
        System.out.print("2D array contents are \n");
        for (Student[] row : twoDimensionalArrayOfObjects) {
            for (Student element : row)
                System.out.print("\t" + element.getFirstName() + " " + element.getLastName() +
                        "  Student#: " + element.getStudentNumber() + "   ");
            System.out.println();
        }

    }
}

