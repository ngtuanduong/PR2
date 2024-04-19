package tut10.matrix;

import java.io.*;
import java.util.Arrays;

public class Matrix {
    private int rows;
    private int columns;
    private double[][] data;

    // Constructor
    public Matrix(int n, int m) {
        this.rows = n;
        this.columns = m;
        this.data = new double[n][m];
    }


    public void setData(double[][] data){
        this.data = data;
    }


    // Save matrix to file
    public void save(String filename) throws FileNotFoundException {
        try (PrintWriter writer = new PrintWriter(filename)) {
            writer.println(rows);
            writer.println(columns);
            for (double[] row : data) {
                for (double value : row) {
                    writer.print(value + " ");
                }
                writer.println();
            }
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("File not founded");
        }
    }

    // Read matrix from file
    public static Matrix read(String filename) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            int rows = Integer.parseInt(reader.readLine());
            int columns = Integer.parseInt(reader.readLine());
            Matrix matrix = new Matrix(rows, columns);
            for (int i = 0; i < rows; i++) {
                String[] values = reader.readLine().split(" ");
                for (int j = 0; j < columns; j++) {
                    matrix.data[i][j] = Double.parseDouble(values[j]);
                }
            }
            return matrix;
        } catch (IOException e) {
            throw new IOException("File not founded");
        }
    }

    public Matrix sum(Matrix m) {
        if (this.rows != m.rows || this.columns != m.columns) {
            return null; // Matrices have different dimensions
        }
        Matrix result = new Matrix(rows, columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result.data[i][j] = this.data[i][j] + m.data[i][j];
            }
        }
        return result;
    }

    public Matrix product(Matrix m) {
        if (this.columns != m.rows) {
            return null; // Incompatible dimensions for multiplication
        }
        Matrix result = new Matrix(this.rows, m.columns);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < m.columns; j++) {
                for (int k = 0; k < this.columns; k++) {
                    result.data[i][j] += this.data[i][k] * m.data[k][j];
                }
            }
        }
        return result;
    }

    // Utility method to print matrix
    public void printMatrix() {
        for (double[] row : data) {
            System.out.println(Arrays.toString(row));
        }
    }
}
