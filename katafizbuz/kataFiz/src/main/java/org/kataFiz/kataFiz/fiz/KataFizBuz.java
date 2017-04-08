package org.kataFiz.kataFiz.fiz;

import org.junit.Test;

import junit.framework.Assert;

public class KataFizBuz {
	 
    public static String getResultat(int number) {
    	
        if (number % 15 == 0) 
        {
        	return "fizzbuzz";
        }
          else if (number % 3 == 0)
        	  {
        	  return "fizz";
        	  }
              else if (number % 5 == 0)
            	  {
            	  return "buzz";
            	  }
        return Integer.toString(number);
    }
    @Test
    public void getResultatNombreDivisibleParTrois() {
        Assert.assertEquals("fizz", KataFizBuz.getResultat(3));
    }
 
    @Test
    public void getResultatNombreDivisiblePar5() {
        Assert.assertEquals("buzz", KataFizBuz.getResultat(5));
        Assert.assertEquals("buzz", KataFizBuz.getResultat(10));
    }
 
    @Test
    public void getResultatNombreDivisiblePar15() {
        Assert.assertEquals("fizzbuzz", KataFizBuz.getResultat(15));
        Assert.assertEquals("fizzbuzz", KataFizBuz.getResultat(30));
    }
 
    @Test
    public void getResultatNombreNonDivisibleParTous() {
        Assert.assertEquals("1", KataFizBuz.getResultat(1));
        Assert.assertEquals("2", KataFizBuz.getResultat(2));
        Assert.assertEquals("4", KataFizBuz.getResultat(4));
    }
}
