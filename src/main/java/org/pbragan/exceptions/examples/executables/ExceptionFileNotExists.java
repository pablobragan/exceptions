package org.pbragan.exceptions.examples.executables;

import org.pbragan.exceptions.examples.services.FileService;
import org.pbragan.exceptions.examples.services.StackTraceService;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Stack;

public class ExceptionFileNotExists {

    public static void main(String[] args){
        try {
            FileReader file = FileService.build().open("inexistente.txt");
        } catch (FileNotFoundException e) {

            Stack<String> stack = StackTraceService.build().parseFromStackTrace(e);
            do {
                System.out.println(stack.pop());
            }while(!stack.isEmpty());
        }
    }
}
