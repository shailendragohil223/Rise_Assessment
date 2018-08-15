/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Saurav
 */
public class ShoppingItemTest {
    
    public ShoppingItemTest() {
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
     * Test of getItemName method, of class ShoppingItem.
     */
    @Test
    public void testGetItemName() {
        System.out.println("getItemName");
        ShoppingItem instance = new ShoppingItem();
        String expResult = "";
        String result = instance.getItemName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemPrice method, of class ShoppingItem.
     */
    @Test
    public void testGetItemPrice() {
        System.out.println("getItemPrice");
        ShoppingItem instance = new ShoppingItem();
        double expResult = 0.0;
        double result = instance.getItemPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemTotalPrice method, of class ShoppingItem.
     */
    @Test
    public void testGetItemTotalPrice() {
        System.out.println("getItemTotalPrice");
        ShoppingItem instance = new ShoppingItem();
        double expResult = 0.0;
        double result = instance.getItemTotalPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemQty method, of class ShoppingItem.
     */
    @Test
    public void testGetItemQty() {
        System.out.println("getItemQty");
        ShoppingItem instance = new ShoppingItem();
        int expResult = 0;
        int result = instance.getItemQty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setItemName method, of class ShoppingItem.
     */
    @Test
    public void testSetItemName() {
        System.out.println("setItemName");
        String ItemName = "";
        ShoppingItem instance = new ShoppingItem();
        instance.setItemName(ItemName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setItempPrice method, of class ShoppingItem.
     */
    @Test
    public void testSetItempPrice() {
        System.out.println("setItempPrice");
        double ItemPrice = 0.0;
        ShoppingItem instance = new ShoppingItem();
        instance.setItempPrice(ItemPrice);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setItemQty method, of class ShoppingItem.
     */
    @Test
    public void testSetItemQty() {
        System.out.println("setItemQty");
        int ItemQty = 0;
        ShoppingItem instance = new ShoppingItem();
        instance.setItemQty(ItemQty);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ShoppingItem.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ShoppingItem instance = new ShoppingItem();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
