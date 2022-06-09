package org.pbragan.exceptions.examples.services;

import java.util.List;
import java.util.Stack;

public class StackTraceService {

    public static StackTraceService build(){
        return new StackTraceService();
    }

    public Stack<String> parseFromStackTrace(Exception e){
        Stack<String> stack = new Stack<>();
        StringBuilder parsedElements = new StringBuilder();
        StackTraceElement elements[] = e.getStackTrace();
        for (int i = 0, n = elements.length; i < n; i++) {
            stack.push(elements[i].getFileName()
                    + ":" + elements[i].getLineNumber()
                    + ">> "
                    + elements[i].getMethodName() + "()"
                    + "\n");
        }
        return stack;
    }
}
