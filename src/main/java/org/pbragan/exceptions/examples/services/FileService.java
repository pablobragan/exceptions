package org.pbragan.exceptions.examples.services;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileService {

    public static FileService build(){
        return new FileService();
    }

    public FileReader open(String filename) throws FileNotFoundException {
        return new FileReader(filename);
    }
}
