package org.pbragan.exceptions.exercises.executables;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CatchExerciseApp {

    private final static Logger logger = LoggerFactory.getLogger(CatchExerciseApp.class);

    public static void main(String[] args) {
        try {
            int a[] = new int[5];
            a[5] = 30 / 5;
        } catch (ArithmeticException e) {
            logger.error("ArithmeticException occurs",e);
        } catch (ArrayIndexOutOfBoundsException e) {
            logger.error(" ArrayIndexOutOfBoundsException occurs",e);
        } catch (Exception e) {
            logger.error("Parent Exception occurs",e);
        }
        logger.debug("Rest of the code");
    }
}
