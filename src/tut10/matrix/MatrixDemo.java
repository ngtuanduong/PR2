package tut10.matrix;

import java.io.FileNotFoundException;
import java.io.IOException;

import static tut10.matrix.Matrix.read;

public class MatrixDemo {
    public static void main(String[] args) throws IOException {
        Matrix m = new Matrix(3,3);
        double[][] data = {{3,1,3},{1,6,4},{1,6,3}};
        m.setData(data);
        m.save("output.txt");
        m.printMatrix();
        System.out.println();
        Matrix n = read("matrix1.txt");

        n.printMatrix();
        System.out.println();
        m.sum(n).printMatrix();
        System.out.println();
        Matrix k = new Matrix(3,4);
        double[][] data1 = {{3,1,3,1},{1,6,4,2},{1,6,3,1}};
        k.setData(data1);
        k.printMatrix();
        System.out.println();
        Matrix l = new Matrix(4,3);
        double[][] data2 = {{3,1,13},{1,6,2},{6,3,1},{1,9,6}};
        l.setData(data2);
        l.printMatrix();
        System.out.println();
        k.product(l).printMatrix();

    }
}
