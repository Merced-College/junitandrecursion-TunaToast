// James McKean
// 10-30-2025
// JUnit Tests for Recursion Problems 


public class UnitTest2 {

    //first JUnit count8 test
    @org.junit.Test
    public void testCount8_1() {
        int result = TestClass2.count8(8183848);
        org.junit.Assert.assertEquals(4, result);
    }

    //second JUnit count8 test
    @org.junit.Test
    public void testCount8_2() {
        int result = TestClass2.count8(88888);
        org.junit.Assert.assertEquals(9, result);
    }

    //third JUnit count8 test
    @org.junit.Test
    public void testCount8_3() {
        int result = TestClass2.count8(1234567);
        org.junit.Assert.assertEquals(0, result);
    }

    //fourth JUnit count8 test
    @org.junit.Test
    public void testCount8_4() {
        int result = TestClass2.count8(0);
        org.junit.Assert.assertEquals(0, result);
    }

    //fifth JUnit count8 test
    @org.junit.Test
    public void testCount8_5() {
        int result = TestClass2.count8(8812388);
        org.junit.Assert.assertEquals(6, result);
    } 
        

//_____________________________________________________________


     //first JUnit test for countHiX
    @org.junit.Test
    public void testCountHi2_1() {
        int result = TestClass2.countHi2("xhixhihihixhi");
        org.junit.Assert.assertEquals(2, result);
    }
    //second JUnit test for countHiX
    @org.junit.Test
    public void testCountHi2_2() {
        int result = TestClass2.countHi2("hihihixhi");
        org.junit.Assert.assertEquals(3, result);
    }

    //third JUnit test for countHiX
    @org.junit.Test
    public void testCountHi2_3() {
        int result = TestClass2.countHi2(null);
        org.junit.Assert.assertEquals(0, result);
    }

    //fourth JUnit test for countHiX
    @org.junit.Test
    public void testCountHi2_4() {
        int result = TestClass2.countHi2("xhi");
        org.junit.Assert.assertEquals(0, result);
    }

    //fifth JUnit test for countHiX
    @org.junit.Test
    public void testCountHi2_5() {
        int result = TestClass2.countHi2("hixhixhi");
        org.junit.Assert.assertEquals(1, result);
    } 
        

//______________________________________________________________


    //first JUnit test for stringClean
    @org.junit.Test
    public void testStringClean_1() {
        String result = TestClass2.stringClean("yyzzza");
        org.junit.Assert.assertEquals("yza", result);
    }

    //second JUnit test for stringClean
    @org.junit.Test
    public void testStringClean_2() {
        String result = TestClass2.stringClean("abbbcdd");
        org.junit.Assert.assertEquals("abcd", result);
    }

    //third JUnit test for stringClean
    @org.junit.Test
    public void testStringClean_3() {
        String result = TestClass2.stringClean("Hello");
        org.junit.Assert.assertEquals("Helo", result);
    }

    //fourth JUnit test for stringClean
    @org.junit.Test
    public void testStringClean_4() {
        String result = TestClass2.stringClean("xxxyyyzzzz");
        org.junit.Assert.assertEquals("xyz", result);
    }

    //fifth JUnit test for stringClean
    @org.junit.Test
    public void testStringClean_5() {
        String result = TestClass2.stringClean(null);
        org.junit.Assert.assertEquals(null, result);
    }
    

}
