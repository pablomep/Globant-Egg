/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCalcula;

import Servicio.CalculaService;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pablo
 */
public class TestCalculadora {

    CalculaService descTest;

    public TestCalculadora() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        descTest = new CalculaService();
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void EvaluaDescuento() {
        double pf1 = descTest.calculaDescuento(1200.50, 10);
        System.out.println("Precio final calculado: " + pf1);
        assertEquals(pf1, 1080.45, 0);
    }

    @Test
    public void EvaluaMaximoDescuento() {
        double pf2 = descTest.calculaDescuento(12.10, 60);
        System.out.println("Precio final calculado: " + pf2);
        assertEquals(pf2, 6.05, 0);
    }

    @Test
    public void EvaluaDescuentoCero() {
        double pf3 = descTest.calculaDescuento(21.50, 0);
        System.out.println("Precio final calculado: " + pf3);
        assertEquals(pf3, 21.50, 0);
    }
}
