package com.equipo.saludo;

import org.junit.Test;
import static org.junit.Assert.*;

import static junit.framework.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void testSaludo() {
        assertEquals("¡Hola, DevOps!", App.saludar("DevOps"));
    }

}
