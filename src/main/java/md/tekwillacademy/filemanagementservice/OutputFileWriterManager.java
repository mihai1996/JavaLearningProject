package md.tekwillacademy.filemanagementservice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class OutputFileWriterManager {

    public static void writeContentIntoFileUsingFileWriter(String filePath, String content) {

        FileWriter fileWriterObject = null;

        try {
            fileWriterObject = new FileWriter(filePath);
            fileWriterObject.write(content);

        } catch (IOException exceptionObj) {
            System.out.println("There is a problem with the data writing process, let's skip this code.");
            exceptionObj.printStackTrace();
        } finally {
            if (fileWriterObject != null) {
                try {
                    fileWriterObject.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static void writeContentIntoFileUsingBufferWriter(File file, String content) {

        BufferedWriter bufferedWriterObject = null;

        try {
            bufferedWriterObject = new BufferedWriter(new FileWriter(file));
            bufferedWriterObject.write(content);
        } catch (IOException exceptionObject) {
            System.out.println("There is a problem with the data writing process, let's skip this code.");
            exceptionObject.printStackTrace();
        } finally {
            if (bufferedWriterObject != null) {
                try {
                    bufferedWriterObject.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
