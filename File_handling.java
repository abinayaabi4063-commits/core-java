import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

 class File_handling{

    public static void main(String[] args) {

        String fileName = "Abinaya.txt";

        // 1. Create File
        try {
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("1. File Created: " + fileName);
            } else {
                System.out.println("1. File Already Exists");
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // 2. Write Data into File
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("Hello Abinaya - This is Java File Handling");
            writer.close();
            System.out.println("2. Data Written Successfully");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // 3. Read File Information
        File file = new File(fileName);
        System.out.println("\n3. File Info:");
        System.out.println("File Name: " + file.getName());
        System.out.println("File Path: " + file.getAbsolutePath());
        System.out.println("File Size: " + file.length() + " bytes");

        // 4. Check File Exists
        if (file.exists()) {
            System.out.println("\n4. File Exists - Yes");
        } else {
            System.out.println("\n4. File Not Found");
        }

        // 5. Read File Data
        try {
            Scanner reader = new Scanner(file);
            System.out.println("\n5. File Data:");
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error Reading: " + e.getMessage());
        }

        // 6. Delete File
        if (file.delete()) {
            System.out.println("\n6. File Deleted Successfully");
       // } else {
            System.out.println("\n6. Delete Failed");
        }
    }
}