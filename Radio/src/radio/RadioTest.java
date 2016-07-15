/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja1;

import Radio;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * Poner en el mismo paquete todas las clases para que funcione la prueba al crear un objeto radio
 */
public class RadioTest {
    
    public RadioTest() {
    }
    Radio instance = new Radio();
    @Test
    public void testSubirvol() {
        System.out.println("subirvol");
        Radio instance = new Radio();
        instance.subirvol();
        asserEquals(1,instance.getvol() );
    }




}