package activities;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Activity14 {
    public static void main(String[] args) throws IOException {
        File file = new File("filepath");
        boolean fStatus = file.createNewFile();
        //get the file Object
        File fileUtil = FileUtils.getFile("filepath");
        //Read file
        System.out.println("Data in file: " + FileUtils.readFileToString(fileUtil, "UTF8"));

        //Create directory
        File destDir = new File("resources2");
        //Copy file to directory
        FileUtils.copyFileToDirectory(file, destDir);
        //Get file from new directory
        File newFile = FileUtils.getFile(destDir, "filepath");
        //Read data from file
        String newFileData = FileUtils.readFileToString(newFile, "UTF8");
    }
}
