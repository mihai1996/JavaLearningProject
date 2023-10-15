package md.tekwillacademy.filemanagementservice;

import java.io.*;
import java.nio.file.Files;

public class InputFileReadManager {

    public static void printDataFromAFile(File file) {

        FileReader fileReaderObject = null;

        try {
            fileReaderObject = new FileReader(file);

            int charNumInAsciiSystem;
            while ((charNumInAsciiSystem = fileReaderObject.read()) != -1) {
                System.out.print((char)charNumInAsciiSystem);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("The file was not found, the procedure was aborted!");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("There is a problem with the read process.");
        } finally {
            try {
                fileReaderObject.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void printDataFromAFileUsingBufferReader(File file) {

        BufferedReader bufferedReaderObj = null;

        try {
            bufferedReaderObj = new BufferedReader(new FileReader(file));
            String line;
            while ((line = bufferedReaderObj.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Exception has occurred, skip the reading.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                bufferedReaderObj.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void printDataFromAFileUsingFiles(File file) {

        try {
            String content = Files.readString(file.toPath());
            System.out.println(content);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
