package tut10.io_file;

import java.io.*;

public class IOFile {
    private String filename;

    public IOFile(String filename) {
        this.filename = filename;
    }

    public int countLines() throws IOException {
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            while (reader.readLine() != null) {
                count++;
            }
        } catch (IOException e) {
            throw new IOException("File does not exist: " + filename);
        }
        return count;
    }

    public void write(OutputStream os) throws IOException {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filename));
             BufferedOutputStream bos = new BufferedOutputStream(os)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            throw new IOException("File does not exist: " + filename);
        }
    }

    public void print() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new IOException("File does not exist: " + filename);
        }
    }

    public void copy(String newFilename) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename));
             BufferedWriter writer = new BufferedWriter(new FileWriter(newFilename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            throw new IOException("File does not exist: " + filename);
        }
    }

    public void delete() {
        File file = new File(filename);
        if (file.exists()) {
            file.delete();
            System.out.println("File deleted successfully: " + filename);
        } else {
            System.out.println("File does not exist: " + filename);
        }
    }


}

