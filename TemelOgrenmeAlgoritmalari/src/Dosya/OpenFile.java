/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dosya;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author ahmet
 */
public class OpenFile {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        File inputFile = new File("./src/Dosya/penguins_size.csv");
        try (Scanner reader = new Scanner(inputFile)) {
            while(reader.hasNextLine()){
                String data = reader.nextLine();
                System.out.println(data);
            }
        }
        Path path = Paths.get("./src/Dosya/file1.csv");
        Files.createDirectories(path.getParent());
        Files.createFile(path);
    }
}
