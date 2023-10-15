package md.tekwillacademy.filemanagementservice;

import java.io.File;
import java.io.IOException;

public class FileManager {

    public static boolean createTheFileIdItDoesNotExist(File file) {
        try {
            return file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void informIfTheFileExists(File file) {

        if (file.exists()) {
            System.out.println("The file exists.");
        } else {
            System.out.println("The file is not exists!");
        }
    }

    public static void printTheFileName(File file) {

        String fileName = file.getName();
        System.out.println("File name is: " + fileName);
    }

    public static void printTheFileAbsolutePath(File file) {

        String absolutePath = file.getAbsolutePath();
        System.out.println("Absolute path is: " + absolutePath);
    }

    public static void printIfTheFileIsADirectory(File file) {

        if (file.isFile()) {
            System.out.println("The object file is a file.");
        } else {
            System.out.println("The object file is a directory.");
        }
    }

}
