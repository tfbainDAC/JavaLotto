/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LottoFun.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author t.bain
 */
public class utilitiesTest {
    
    public utilitiesTest() {
    }
   
    /**
     * Test of NumberInRange method, of class utilities.
     */
    @Test
    public void testInvalidNumberInRange() {
        assertEquals(false, utilities.NumberInRange(0, 1, 49));
        assertEquals(false, utilities.NumberInRange(-7, 1, 49));
        assertEquals(false, utilities.NumberInRange(50, 1, 49));
    }
    @Test
    public void testValidNumberInRange() {
        assertEquals(true, utilities.NumberInRange(1, 1, 49));
        assertEquals(true, utilities.NumberInRange(49, 1, 49));
        assertEquals(true, utilities.NumberInRange(34, 1, 49));
        assertEquals(true, utilities.NumberInRange(34, 10, 34));
    }
    /**
     * Test of NumberNotDuplicate method, of class utilities.
     */
    @Test
    public void testNumberNotDuplicate_null_array() {
        System.out.println("NumberNotDuplicate, null Array");
        int chosenNumber = 0;
        int[] arr = null;
        boolean expResult = true;
        boolean result = utilities.NumberNotDuplicate(chosenNumber, arr);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testNumberNotDuplicate_Duplicates() {
        System.out.println("NumberNotDuplicate, with duplicates");
        int[] arr = {2,3,4};
        assertEquals(false, utilities.NumberNotDuplicate(3, arr));
    }
    @Test
    public void testNumberNotDuplicate_No_Duplicates() {
        System.out.println("NumberNotDuplicate, without duplicates");
        int[] arr = {2,4,8};
        boolean result = utilities.NumberNotDuplicate(3, arr);
        assertEquals(true, result);
    }
    
    @Test
    public void testGenerateRandomBalls_Range() {
        System.out.println("Generate Random Balls, Range verification");
        int[] arr = new int[6];
        arr = utilities.generateRandomBalls(47, arr);
        
        for (int i: arr){
            assertTrue(i>=1 && i<= 47);
        }
    }
    
    @Test
    public void testGenerateRandomBalls_Length(){
        System.out.println("Generate Random Balls, Length of array");
        int[] arr = new int[2];
        arr = utilities.generateRandomBalls(30, arr);
        assertEquals(2, arr.length);
    }
    
    @Test
    public void testGenerateRandomBalls_Unique() {
        //System.out.println("Generate Random Balls, unique verification");
        //int[] arr = new int[6];
        //arr = utilities.generateRandomBalls(49, arr);
        //  ?  to add test
    }
}
