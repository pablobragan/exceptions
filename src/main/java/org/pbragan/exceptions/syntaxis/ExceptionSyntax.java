package org.pbragan.exceptions.syntaxis;

import org.pbragan.exceptions.services.ExampleService;
import org.pbragan.exceptions.services.ExampleTwoService;
import org.pbragan.exceptions.services.exceptions.ExampleServiceException;
import org.pbragan.exceptions.services.exceptions.ExampleTwoServiceException;
import org.pbragan.exceptions.syntaxis.exceptions.SyntaxException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.List;

/**
 * Clase para demostrar alternativas de uso try catch en manejo de Exceptions.
 * Los service utilizados son solo para simular un contexto "real" y el código tener más sentido.
 */
public class ExceptionSyntax {

    Logger logger = LoggerFactory.getLogger(ExceptionSyntax.class);

    public String callingServiceThrowingToCaller(ExampleService exampleService) throws SyntaxException {
        try{
            return exampleService.save("Test");
        }catch (ExampleServiceException e){
            throw new SyntaxException(e);
        }
    }

    public boolean callingServiceOnlyLogging(ExampleService exampleService) {
        try{
            exampleService.save("Test");
            return true;
        }catch (ExampleServiceException e){
            logger.error("Error al hacer guardar algo",e);
            return false;
        }
    }

    public void manageLotsOfExceptionsMultipleCatch(ExampleService exampleService, ExampleTwoService exampleTwoService){
        try{
            String saved = exampleService.save("Test");
            List<String> searched = exampleTwoService.findAllOf(saved);
        } catch (ExampleServiceException e) {
            logger.error("Ups no pude guardar el registro...", e);
        } catch (ExampleTwoServiceException e) {
            logger.error("Ups me falla la búsqueda...", e);
        } catch (Exception e){
            logger.error("Ups, no se que paso... Estaría tomando una unchecked exception", e);
        }
    }

    public void manageLotsOfExceptionsOneCatch(ExampleService exampleService, ExampleTwoService exampleTwoService){
        try{
            String saved = exampleService.save("Test");
            List<String> searched = exampleTwoService.findAllOf(saved);
        } catch (ExampleServiceException | ExampleTwoServiceException e) {
            logger.error("Ups no pude guardar el registro o fallo la búsqueda...", e);
        } catch (Exception e){
            logger.error("Ups, no se que pasó... Estaría tomando un unchecked exception", e);
        }
    }

    public void readingATextFileFinallyBlock() throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(this.getClass().getResourceAsStream("/example1.txt")));
        try{
            String line = reader.readLine();
            while( line != null){
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            logger.error("Error leyendo linea", e);
            System.out.println("FALLA LA LECTURA DE LINEAS");
        } finally {
            reader.close();
        }
    }

    public void readingATextFileResourceTry() {
        try(BufferedReader reader = new BufferedReader(
                new InputStreamReader(this.getClass().getResourceAsStream("/example1.txt")));){
            String line = reader.readLine();
            while( line != null){
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            logger.error("Error leyendo linea", e);
            System.out.println("FALLA LA LECTURA DE LINEAS");
        }
    }


}
