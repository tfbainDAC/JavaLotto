/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LottoFun.model;

import java.util.HashSet;
import java.util.Set;
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
public class LottoTest {
    
    private Lotto lottoT;
    
    public LottoTest() {
    }
    
    @Before
    public void setUp() {
        lottoT = new Lotto();
    }
    
    /**
     * Test of  invalid BonusBall method, of class Lotto.
     */
    @Test
    public void testInvalidBonusBall() {
        int bonusBall = 0;
        assertEquals(false, lottoT.setBonusBall(bonusBall));
        bonusBall = -4;
        assertEquals(false, lottoT.setBonusBall(bonusBall));
        bonusBall = 50;
        assertEquals(false, lottoT.setBonusBall(bonusBall));
   }
    @Test
    public void testValidBonusBall() {
        int bonusBall = 1;
        assertEquals(true, lottoT.setBonusBall(bonusBall));
        bonusBall = 49;
        assertEquals(true, lottoT.setBonusBall(bonusBall));
   } 
    /**
     * Test of getBonusBall method, of class Lotto.
     */
    @Test
    public void testGetBonusBall() {
        System.out.println("getBonusBall");
        lottoT.setBonusBall(5);
        assertEquals(5, lottoT.getBonusBall());
    }

    /**
     * Test of getRetailer method, of class Lotto.
     */
    @Test
    public void testGetRetailer() {
        System.out.println("getRetailer");
        lottoT.setRetailer("Boots");
        assertEquals("Boots", lottoT.getRetailer());
    }
    
}
