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
public class ShoppingListTest {
    
    public ShoppingListTest() {
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
     * Test of addItem method, of class ShoppingList.
     */
    @Test
    public void testAddItem() {
        System.out.println("addItem");
        ShoppingList instance = new ShoppingList();
        instance.addItem();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayItem method, of class ShoppingList.
     */
    @Test
    public void testDisplayItem() {
        System.out.println("displayItem");
        ShoppingList instance = new ShoppingList();
        instance.displayItem();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
