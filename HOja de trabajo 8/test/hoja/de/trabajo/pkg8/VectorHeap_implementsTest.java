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
public class VectorHeap_implementsTest {
    
    public VectorHeap_implementsTest() {
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
     * Test of parent method, of class VectorHeap_implements.
     */
    @Test
    public void testParent() {
        System.out.println("parent");
        int i = 0;
        int expResult = 0;
        int result = VectorHeap_implements.parent(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of left method, of class VectorHeap_implements.
     */
    @Test
    public void testLeft() {
        System.out.println("left");
        int i = 0;
        int expResult = 0;
        int result = VectorHeap_implements.left(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of right method, of class VectorHeap_implements.
     */
    @Test
    public void testRight() {
        System.out.println("right");
        int i = 0;
        int expResult = 0;
        int result = VectorHeap_implements.right(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of percolateUp method, of class VectorHeap_implements.
     */
    @Test
    public void testPercolateUp() {
        System.out.println("percolateUp");
        int leaf = 0;
        VectorHeap_implements instance = new VectorHeap_implements();
        instance.percolateUp(leaf);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pushDownRoot method, of class VectorHeap_implements.
     */
    @Test
    public void testPushDownRoot() {
        System.out.println("pushDownRoot");
        int root = 0;
        VectorHeap_implements instance = new VectorHeap_implements();
        instance.pushDownRoot(root);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class VectorHeap_implements.
     */
    @Test
    public void testAdd_GenericType() {
        System.out.println("add");
        Object value = null;
        VectorHeap_implements instance = new VectorHeap_implements();
        instance.add(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class VectorHeap_implements.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        VectorHeap_implements instance = new VectorHeap_implements();
        Object expResult = null;
        Object result = instance.remove();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class VectorHeap_implements.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        VectorHeap_implements instance = new VectorHeap_implements();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class VectorHeap_implements.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        VectorHeap_implements instance = new VectorHeap_implements();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clear method, of class VectorHeap_implements.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        VectorHeap_implements instance = new VectorHeap_implements();
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirst method, of class VectorHeap_implements.
     */
    @Test
    public void testGetFirst() {
        System.out.println("getFirst");
        VectorHeap_implements instance = new VectorHeap_implements();
        Object expResult = null;
        Object result = instance.getFirst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class VectorHeap_implements.
     */
    @Test
    public void testAdd_Object() {
        System.out.println("add");
        Object value = null;
        VectorHeap_implements instance = new VectorHeap_implements();
        instance.add(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
