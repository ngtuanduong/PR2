package tut10.io_file;

import java.io.IOException;

public class IOFileDemo {
    public static void main(String[] args) throws IOException {
        // Example usage
        IOFile ioFile = new IOFile("input.txt");
        int lineCount = ioFile.countLines();
        System.out.println("Number of lines: " + lineCount);

        ioFile.print();

        ioFile.write(System.out);

        ioFile.copy("output.txt");

        ioFile.delete();
    }
}
