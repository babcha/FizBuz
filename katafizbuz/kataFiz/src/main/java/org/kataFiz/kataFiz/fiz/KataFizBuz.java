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
    public void getResultatNombreDivisibleParTrois() { //tester pour la division sur 3
        Assert.assertEquals("fizz", KataFizBuz.getResultat(3));
    }
 
    @Test
    public void getResultatNombreDivisiblePar5() {  //tester pour la division sur 5
        Assert.assertEquals("buzz", KataFizBuz.getResultat(5));
        Assert.assertEquals("buzz", KataFizBuz.getResultat(10));
    }
 
    @Test
    public void getResultatNombreDivisiblePar15() {  //tester pour la division sur 15
        Assert.assertEquals("fizzbuzz", KataFizBuz.getResultat(15));
        Assert.assertEquals("fizzbuzz", KataFizBuz.getResultat(30));
    }
 
    @Test
    public void getResultatNombreNonDivisibleParTous() {  //teste si n'est pas divisble pour les 3 nombres
        Assert.assertEquals("1", KataFizBuz.getResultat(1));
        Assert.assertEquals("2", KataFizBuz.getResultat(2));
        Assert.assertEquals("4", KataFizBuz.getResultat(4));
    }
}
