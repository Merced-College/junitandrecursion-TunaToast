// James McKean
// 10-30-2025
// JUnit Tests for Recursion Problems 

public class UnitTest {
    
     
    //first JUnit test
    @org.junit.Test
    public void testCountHi_1() {
        int result = TestClass.countHi("xxhixxxxhixxxx");
        org.junit.Assert.assertEquals(2, result);
}

    //second JUnit test
    @org.junit.Test
    public void testCountHi_2() {
        int result = TestClass.countHi("hihihihihihihihihihihihi");
        org.junit.Assert.assertEquals(12, result);
}

    //third JUnit test
    @org.junit.Test
    public void testCountHi_3() {
        int result = TestClass.countHi("jiahgfljfsljsjbfglsbfglj");
        org.junit.Assert.assertEquals(0, result);
}

    //fourth JUnit test
    @org.junit.Test
    public void testCountHi_4() {
        int result = TestClass.countHi(null);
        org.junit.Assert.assertEquals(0, result);
}

    //fifth JUnit test
    @org.junit.Test
    public void testCountHi_5() {
        int result = TestClass.countHi("h");
        org.junit.Assert.assertEquals(0, result);
}
    

//___________________________________________________________________

    
    //first JUnit test for strCount
    @org.junit.Test
    public void testStrCount_1() {
        int result = TestClass.strCount("catcowcat", "cat");
        org.junit.Assert.assertEquals(2, result);
    }

    //second JUnit test for strCount
    @org.junit.Test
    public void testStrCount_2() {
        int result = TestClass.strCount("catcatcat", "cow");
        org.junit.Assert.assertEquals(0, result);
    }

    //third JUnit test for strCount
    @org.junit.Test
    public void testStrCount_3() {
        int result = TestClass.strCount("", "dog");
        org.junit.Assert.assertEquals(0, result);
    }

    //fourth JUnit test for strCount
    @org.junit.Test
    public void testStrCount_4() {
        int result = TestClass.strCount("hjasldgfh jalshdglhaslghfhe 132432  ijag   ", "dog");
        org.junit.Assert.assertEquals(0, result);
    }

    //fifth JUnit test for strCount
    @org.junit.Test
    public void testStrCount_5() {
        int result = TestClass.strCount(null, "dog");
        org.junit.Assert.assertEquals(0, result);
    }
        










}
