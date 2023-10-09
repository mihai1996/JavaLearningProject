package md.tekwillacademy.filemanagementservice;

import java.io.File;

public class FileTaskExecution {

    public static void main(String[] args) {

        File fileObject = new File("src/main/java/md/tekwillacademy/filemanagementservice/test01.txt");
        System.out.println(FileManager.createTheFileIdItDoesNotExist(fileObject));
        FileManager.informIfTheFileExists(fileObject);
        FileManager.printTheFileName(fileObject);
        FileManager.printTheFileAbsolutePath(fileObject);
        FileManager.printIfTheFileIsADirectory(fileObject);

        OutputFileWriterManager.writeContentIntoFileUsingFileWriter(fileObject.getPath(), "My Content");
        OutputFileWriterManager.writeContentIntoFileUsingBufferWriter(fileObject, "My new content.");

        InputFileReadManager.printDataFromAFile(fileObject);
        InputFileReadManager.printDataFromAFileUsingBufferReader(fileObject);
        InputFileReadManager.printDataFromAFileUsingFiles(fileObject);

    }
}
