/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.test;

import edu.eci.arsw.HttpConnection;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author danielagonzalez
 */
/**
@RunWith(SpringRunner.class)
@SpringBootTest()
public class ConsultTest {
    
    @Autowired
    private HttpConnection APIconnection;
    
    @Autowired
    private HttpConnection prueba;
    
    @Autowired
    private HttpConnection prueba2;
    
    @Test
    public void HttpConnectionTest() throws Exception{
        try {
            APIconnection.asignacion("MSFT", "TIME_SERIES_WEEKLY");
            prueba.asignacion("MSFT", "TIME_SERIES_WEEKLY");
            prueba2.asignacion("MSFT", "TIME_SERIES_WEEKLY");
            APIconnection.run();
            prueba.run();
            prueba2.run();
            String respuesta = APIconnection.getAPI();
            String respuesta2 = prueba.getAPI();
            assertEquals(respuesta.substring(0, 125), "{    \"Meta Data\": {        \"1. Information\": \"Weekly Prices (open, high, low, close) and Volumes\",        \"2. Symbol\": \"MSFT\"");
            assertEquals(respuesta2.substring(0, 125), "{    \"Meta Data\": {        \"1. Information\": \"Weekly Prices (open, high, low, close) and Volumes\",        \"2. Symbol\": \"MSFT\"");
        } catch (IOException ex) {
            Logger.getLogger(HttpConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
*/
