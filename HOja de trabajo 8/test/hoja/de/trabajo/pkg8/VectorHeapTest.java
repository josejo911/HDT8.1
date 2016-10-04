/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja.de.trabajo.pkg8;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jorge
 */
public class VectorHeapTest {
    
    public VectorHeapTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of parent method, of class VectorHeap.
     */
    @Test
    public void testParent() {
        System.out.println("parent");
        int i = 0;
        int expResult = 0;
        int result = VectorHeap.parent(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of left method, of class VectorHeap.
     */
    @Test
    public void testLeft() {
        System.out.println("left");
        int i = 0;
        int expResult = 0;
        int result = VectorHeap.left(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of right method, of class VectorHeap.
     */
    @Test
    public void testRight() {
        System.out.println("right");
        int i = 0;
        int expResult = 0;
        int result = VectorHeap.right(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
