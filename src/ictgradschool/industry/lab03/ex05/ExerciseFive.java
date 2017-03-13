package ictgradschool.industry.lab03.ex05;

/**
 * Created by anhyd on 3/03/2017.
 */
public class ExerciseFive {

    /**
     * Runs an example program.
     */
    private void start() {
        String letters = "X X O O X O X O X ";

        String row1 = getRow(letters, 1);

        String row2 = getRow(letters, 2);

        String row3 = getRow(letters, 3);

        printRows(row1, row2, row3);

        String leftDiagonal = getLeftDiagonal(row1, row2, row3);

        printDiagonal(leftDiagonal);

    }

    /**
     * TODO Implement this
     */
    public String getRow(String letters, int row) {
        return letters.substring(6*(row-1),6*row);
    }

    /**
     * TODO Implement this
     */
    public void printRows(String row1, String row2, String row3) {
        System.out.println(row1);
        System.out.println(row2);
        System.out.println(row3);
    }

    /**
     * TODO Implement this
     */
    public String getLeftDiagonal(String row1, String row2, String row3) {

        return (row1.substring(0,2)+row2.substring(2,4)+row3.substring(4,5));
    }

    /**
     * TODO Implement this
     */
    public void printDiagonal(String leftDiagonal) {
        System.out.println("Diagonal: "+leftDiagonal);
    }

    /**
     * Program entry point. Do not edit.
     */
    public static void main(String[] args) {
        ExerciseFive ex = new ExerciseFive();
        ex.start();
    }
}
