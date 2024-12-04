import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int6 = mathTest0.divide((int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Cannot divide by zero.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        mathTest mathTest0 = new mathTest();
        java.lang.Class<?> wildcardClass1 = mathTest0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.add(100, (int) (short) 1);
        java.lang.Class<?> wildcardClass7 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) ' ');
        int int12 = mathTest0.divide((int) (byte) 100, 36);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = mathTest0.divide((-32), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Cannot divide by zero.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) ' ');
        int int12 = mathTest0.divide((int) (byte) 100, 36);
        java.lang.Class<?> wildcardClass13 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(3232, (-3168));
        java.lang.Class<?> wildcardClass7 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) ' ');
        int int12 = mathTest0.divide((int) (byte) 100, 36);
        int int15 = mathTest0.subtract(0, 3232);
        java.lang.Class<?> wildcardClass16 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3232) + "'", int15 == (-3232));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        java.lang.Class<?> wildcardClass10 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        java.lang.Class<?> wildcardClass10 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((-32), 99);
        java.lang.Class<?> wildcardClass7 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3168) + "'", int6 == (-3168));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.add((int) (short) 1, 0);
        int int14 = mathTest0.add(51, (-3232));
        java.lang.Class<?> wildcardClass15 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3181) + "'", int14 == (-3181));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        mathTest mathTest0 = new mathTest();
        int int2 = mathTest0.square((-101));
        java.lang.Class<?> wildcardClass3 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10201 + "'", int2 == 10201);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        java.lang.Class<?> wildcardClass7 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.add((int) (short) 10, 2);
        java.lang.Class<?> wildcardClass7 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 12 + "'", int6 == 12);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.multiply(101, 51);
        int int17 = mathTest0.subtract(1, (-1));
        java.lang.Class<?> wildcardClass18 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5151 + "'", int14 == 5151);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        java.lang.Class<?> wildcardClass10 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.divide(0, 5200);
        int int14 = mathTest0.multiply((int) (short) 1, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = mathTest0.divide(3232, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Cannot divide by zero.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.subtract((int) (short) 0, (int) '#');
        java.lang.Class<?> wildcardClass13 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-35) + "'", int12 == (-35));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) (short) 1);
        int int12 = mathTest0.add((-63), (-3232));
        java.lang.Class<?> wildcardClass13 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3295) + "'", int12 == (-3295));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        java.lang.Class<?> wildcardClass7 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        java.lang.Class<?> wildcardClass4 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int11 = mathTest0.square(3232);
        int int14 = mathTest0.divide((-32), (int) (short) 1);
        int int16 = mathTest0.square((-50));
        java.lang.Class<?> wildcardClass17 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10445824 + "'", int11 == 10445824);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-32) + "'", int14 == (-32));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2500 + "'", int16 == 2500);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        int int20 = mathTest0.subtract(12, (-3295));
        int int23 = mathTest0.add((-101), 112);
        java.lang.Class<?> wildcardClass24 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3307 + "'", int20 == 3307);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 11 + "'", int23 == 11);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.divide((-101), 2);
        int int9 = mathTest0.multiply(101, 10);
        int int12 = mathTest0.multiply(2601, (-101));
        java.lang.Class<?> wildcardClass13 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1010 + "'", int9 == 1010);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-262701) + "'", int12 == (-262701));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.add(52, 98);
        java.lang.Class<?> wildcardClass15 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 150 + "'", int14 == 150);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.subtract((int) '#', (int) (short) 1);
        java.lang.Class<?> wildcardClass15 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.divide(0, 5200);
        int int14 = mathTest0.add((int) (byte) 0, (-50));
        java.lang.Class<?> wildcardClass15 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-50) + "'", int14 == (-50));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.subtract((int) '#', (int) (short) 1);
        int int17 = mathTest0.multiply(1, (-1));
        int int19 = mathTest0.square((-3168));
        java.lang.Class<?> wildcardClass20 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10036224 + "'", int19 == 10036224);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.multiply(101, 51);
        java.lang.Class<?> wildcardClass15 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5151 + "'", int14 == 5151);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((-32), 99);
        int int9 = mathTest0.divide((int) (short) 0, (int) (short) 100);
        int int12 = mathTest0.add((-3295), (-3181));
        java.lang.Class<?> wildcardClass13 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3168) + "'", int6 == (-3168));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6476) + "'", int12 == (-6476));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.divide(0, 5200);
        java.lang.Class<?> wildcardClass12 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) (short) 1);
        java.lang.Class<?> wildcardClass10 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((-32), 99);
        int int9 = mathTest0.divide((-3232), 51);
        int int12 = mathTest0.multiply(0, 2);
        java.lang.Class<?> wildcardClass13 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3168) + "'", int6 == (-3168));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-63) + "'", int9 == (-63));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.subtract((int) (short) 0, (int) '#');
        int int15 = mathTest0.subtract((-1), 100);
        int int18 = mathTest0.add((int) (byte) 1, (-124));
        java.lang.Class<?> wildcardClass19 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-35) + "'", int12 == (-35));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-101) + "'", int15 == (-101));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-123) + "'", int18 == (-123));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        int int20 = mathTest0.multiply(99, (int) (short) 1);
        java.lang.Class<?> wildcardClass21 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 99 + "'", int20 == 99);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int12 = mathTest0.multiply(4, (-31));
        // The following exception was thrown during execution in test generation
        try {
            int int15 = mathTest0.divide((int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Cannot divide by zero.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-124) + "'", int12 == (-124));
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(3232, (-3168));
        int int8 = mathTest0.square((-3232));
        int int10 = mathTest0.square(290);
        java.lang.Class<?> wildcardClass11 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10445824 + "'", int8 == 10445824);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 84100 + "'", int10 == 84100);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int5 = mathTest0.square((int) (byte) 10);
        int int7 = mathTest0.square((-101));
        int int10 = mathTest0.multiply(3329, (-399));
        java.lang.Class<?> wildcardClass11 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10201 + "'", int7 == 10201);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1328271) + "'", int10 == (-1328271));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(1290100, 9700);
        int int9 = mathTest0.multiply((-124), 12);
        java.lang.Class<?> wildcardClass10 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 133 + "'", int6 == 133);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1488) + "'", int9 == (-1488));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.multiply(10445824, 10445824);
        java.lang.Class<?> wildcardClass10 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1594884096 + "'", int9 == 1594884096);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.multiply(101, 51);
        int int17 = mathTest0.multiply(1094116, 1324965);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5151 + "'", int14 == 5151);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-2033540108) + "'", int17 == (-2033540108));
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int8 = mathTest0.square((-51));
        java.lang.Class<?> wildcardClass9 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2601 + "'", int8 == 2601);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.divide(0, 5200);
        int int14 = mathTest0.multiply((int) (short) 1, (int) (short) 10);
        int int17 = mathTest0.multiply((-3232), 10201);
        java.lang.Class<?> wildcardClass18 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-32969632) + "'", int17 == (-32969632));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(3232, (-3168));
        int int8 = mathTest0.square((-3232));
        int int11 = mathTest0.subtract((int) (byte) 100, (-63));
        int int13 = mathTest0.square((int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10445824 + "'", int8 == 10445824);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 163 + "'", int11 == 163);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1225 + "'", int13 == 1225);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((-27036767), 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-27036766) + "'", int3 == (-27036766));
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.multiply(101, 51);
        int int17 = mathTest0.multiply(34, (-50960));
        int int19 = mathTest0.square(101);
        java.lang.Class<?> wildcardClass20 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5151 + "'", int14 == 5151);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1732640) + "'", int17 == (-1732640));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10201 + "'", int19 == 10201);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add((int) (byte) 10, (-3232));
        java.lang.Class<?> wildcardClass13 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3222) + "'", int12 == (-3222));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int11 = mathTest0.square(133);
        int int14 = mathTest0.multiply(9700, 133);
        int int16 = mathTest0.square(10201);
        int int19 = mathTest0.add((-1021), (-50897));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 17689 + "'", int11 == 17689);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1290100 + "'", int14 == 1290100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 104060401 + "'", int16 == 104060401);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-51918) + "'", int19 == (-51918));
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.subtract((int) '#', (int) (short) 1);
        int int17 = mathTest0.multiply(1, (-1));
        int int19 = mathTest0.square((-3168));
        int int22 = mathTest0.multiply((-66), (int) (short) 100);
        int int25 = mathTest0.subtract((-13503600), (-13));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10036224 + "'", int19 == 10036224);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-6600) + "'", int22 == (-6600));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-13503587) + "'", int25 == (-13503587));
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.subtract((int) (short) -1, (int) (short) 100);
        int int17 = mathTest0.divide(1, 100);
        java.lang.Class<?> wildcardClass18 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-101) + "'", int14 == (-101));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.divide(1290100, (-3232));
        // The following exception was thrown during execution in test generation
        try {
            int int20 = mathTest0.divide(22500, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Cannot divide by zero.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-399) + "'", int17 == (-399));
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((-1), (-50));
        int int18 = mathTest0.add((-6476), 1962934338);
        java.lang.Class<?> wildcardClass19 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1962927862 + "'", int18 == 1962927862);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        int int20 = mathTest0.subtract(0, (-50960));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 50960 + "'", int20 == 50960);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.divide(1290100, (-3232));
        java.lang.Class<?> wildcardClass18 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-399) + "'", int17 == (-399));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.subtract((int) '#', (int) (short) 1);
        int int17 = mathTest0.multiply(112, (-262701));
        int int20 = mathTest0.add(4, (-461244));
        int int23 = mathTest0.subtract((-1732640), 2500);
        java.lang.Class<?> wildcardClass24 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-29422512) + "'", int17 == (-29422512));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-461240) + "'", int20 == (-461240));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1735140) + "'", int23 == (-1735140));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((-32), 99);
        int int9 = mathTest0.divide((-3232), 51);
        int int12 = mathTest0.divide(29421456, 1962927862);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3168) + "'", int6 == (-3168));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-63) + "'", int9 == (-63));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int11 = mathTest0.square(133);
        int int14 = mathTest0.multiply(9700, 133);
        int int17 = mathTest0.subtract(0, 1156);
        java.lang.Class<?> wildcardClass18 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 17689 + "'", int11 == 17689);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1290100 + "'", int14 == 1290100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1156) + "'", int17 == (-1156));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.multiply(101, 51);
        int int17 = mathTest0.divide(144, 64);
        java.lang.Class<?> wildcardClass18 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5151 + "'", int14 == 5151);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.subtract((int) '#', (int) (short) 1);
        int int17 = mathTest0.multiply(1, (-1));
        int int19 = mathTest0.square((-3168));
        int int21 = mathTest0.square((-1021));
        java.lang.Class<?> wildcardClass22 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10036224 + "'", int19 == 10036224);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1042441 + "'", int21 == 1042441);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(1290100, 9700);
        java.lang.Class<?> wildcardClass7 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 133 + "'", int6 == 133);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.divide(0, 5200);
        int int14 = mathTest0.multiply((int) (short) 1, (int) (short) 10);
        int int17 = mathTest0.subtract((-50960), (-63));
        java.lang.Class<?> wildcardClass18 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-50897) + "'", int17 == (-50897));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int12 = mathTest0.add((int) (byte) -1, 1024);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1023 + "'", int12 == 1023);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) (short) 1);
        int int12 = mathTest0.divide(1024, (-138));
        java.lang.Class<?> wildcardClass13 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-7) + "'", int12 == (-7));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.add(2092, 1494149);
        int int17 = mathTest0.square(64);
        java.lang.Class<?> wildcardClass18 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1496241 + "'", int15 == 1496241);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4096 + "'", int17 == 4096);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.subtract((int) '#', (int) (short) 1);
        int int17 = mathTest0.multiply(1, (-1));
        int int19 = mathTest0.square((-3168));
        int int22 = mathTest0.multiply((-66), (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = mathTest0.divide(148155, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Cannot divide by zero.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10036224 + "'", int19 == 10036224);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-6600) + "'", int22 == (-6600));
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((-1), (-50));
        int int18 = mathTest0.divide((int) (short) -1, 163);
        int int21 = mathTest0.add(27426628, 1325028);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 28751656 + "'", int21 == 28751656);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(3232, (-3168));
        int int9 = mathTest0.divide(5151, (-399));
        int int12 = mathTest0.divide(5200, (-32969632));
        java.lang.Class<?> wildcardClass13 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-12) + "'", int9 == (-12));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.add((int) (short) 1, 0);
        int int14 = mathTest0.multiply((-399), 1156);
        int int17 = mathTest0.divide(148155, 52);
        int int20 = mathTest0.divide((-3222), (-12));
        java.lang.Class<?> wildcardClass21 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-461244) + "'", int14 == (-461244));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2849 + "'", int17 == 2849);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 268 + "'", int20 == 268);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((int) (short) -1, 36);
        int int18 = mathTest0.divide((-2), (-61));
        java.lang.Class<?> wildcardClass19 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int14 = mathTest0.square(0);
        int int16 = mathTest0.square(5200);
        java.lang.Class<?> wildcardClass17 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 27040000 + "'", int16 == 27040000);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.multiply(101, 51);
        int int17 = mathTest0.multiply(34, (-50960));
        int int19 = mathTest0.square(101);
        int int22 = mathTest0.multiply((-3181), (-135036));
        java.lang.Class<?> wildcardClass23 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5151 + "'", int14 == 5151);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1732640) + "'", int17 == (-1732640));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10201 + "'", int19 == 10201);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 429549516 + "'", int22 == 429549516);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((int) (short) -1, 36);
        int int17 = mathTest0.square((-66));
        int int20 = mathTest0.add((int) (byte) 0, (int) (byte) 1);
        int int22 = mathTest0.square(219152384);
        int int25 = mathTest0.subtract((-9572), (int) 'a');
        java.lang.Class<?> wildcardClass26 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4356 + "'", int17 == 4356);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-9669) + "'", int25 == (-9669));
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.subtract((int) (short) 0, (int) '#');
        int int15 = mathTest0.add((-101), 1024);
        java.lang.Class<?> wildcardClass16 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-35) + "'", int12 == (-35));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 923 + "'", int15 == 923);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.add(100, (int) (short) 1);
        int int9 = mathTest0.subtract(0, 0);
        int int11 = mathTest0.square(12);
        int int14 = mathTest0.subtract((-1156), (-29422512));
        java.lang.Class<?> wildcardClass15 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 144 + "'", int11 == 144);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29421356 + "'", int14 == 29421356);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((int) (short) -1, 36);
        int int18 = mathTest0.divide((-1488), 112);
        int int21 = mathTest0.add(29421356, (int) (byte) 100);
        int int24 = mathTest0.divide(64, (-3168));
        java.lang.Class<?> wildcardClass25 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-13) + "'", int18 == (-13));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 29421456 + "'", int21 == 29421456);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((-1), (-50));
        int int18 = mathTest0.subtract(429549516, 0);
        java.lang.Class<?> wildcardClass19 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 429549516 + "'", int18 == 429549516);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int5 = mathTest0.square((-51));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2601 + "'", int5 == 2601);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int8 = mathTest0.square(10201);
        int int10 = mathTest0.square(1046);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 104060401 + "'", int8 == 104060401);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1094116 + "'", int10 == 1094116);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        mathTest mathTest0 = new mathTest();
        int int2 = mathTest0.square((-101));
        int int5 = mathTest0.multiply(1594884096, (-29422512));
        int int8 = mathTest0.divide((-32969632), (-3295));
        int int11 = mathTest0.divide(2499561, 3329);
        java.lang.Class<?> wildcardClass12 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10201 + "'", int2 == 10201);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1962934272 + "'", int5 == 1962934272);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10005 + "'", int8 == 10005);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 750 + "'", int11 == 750);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) ' ');
        int int12 = mathTest0.divide((int) (byte) 100, 36);
        int int15 = mathTest0.divide((-1735140), 3418801);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((-32), 99);
        int int9 = mathTest0.divide((-3232), 51);
        int int12 = mathTest0.multiply(0, 2);
        int int15 = mathTest0.multiply(429549516, (-461244));
        int int18 = mathTest0.multiply(101, (-35));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3168) + "'", int6 == (-3168));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-63) + "'", int9 == (-63));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-295593424) + "'", int15 == (-295593424));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3535) + "'", int18 == (-3535));
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int11 = mathTest0.square(3232);
        int int14 = mathTest0.divide(10000, (-2));
        java.lang.Class<?> wildcardClass15 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10445824 + "'", int11 == 10445824);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-5000) + "'", int14 == (-5000));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(1290100, 9700);
        int int9 = mathTest0.divide((-3181), (-101));
        int int12 = mathTest0.subtract((-63), 750);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 133 + "'", int6 == 133);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 31 + "'", int9 == 31);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-813) + "'", int12 == (-813));
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.add((int) (short) 1, 0);
        int int14 = mathTest0.multiply((-399), 1156);
        int int17 = mathTest0.divide(148155, 52);
        int int20 = mathTest0.divide((-3222), (-12));
        int int23 = mathTest0.divide(0, 19044);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-461244) + "'", int14 == (-461244));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2849 + "'", int17 == 2849);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 268 + "'", int20 == 268);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        int int20 = mathTest0.add(0, 1046);
        java.lang.Class<?> wildcardClass21 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1046 + "'", int20 == 1046);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.subtract((int) '#', (int) (short) 1);
        int int17 = mathTest0.multiply(1, (-1));
        int int19 = mathTest0.square((-3168));
        int int22 = mathTest0.divide((-51), 3232);
        int int25 = mathTest0.divide(1437107200, 9700);
        java.lang.Class<?> wildcardClass26 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10036224 + "'", int19 == 10036224);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 148155 + "'", int25 == 148155);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int12 = mathTest0.add(290, 2);
        int int15 = mathTest0.multiply((-13503600), (-3243));
        int int18 = mathTest0.subtract(9117553, 4389);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 292 + "'", int12 == 292);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 842501840 + "'", int15 == 842501840);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9113164 + "'", int18 == 9113164);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.subtract((int) (short) -1, (int) (short) 100);
        int int16 = mathTest0.square(101);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = mathTest0.divide(9409, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Cannot divide by zero.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-101) + "'", int14 == (-101));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10201 + "'", int16 == 10201);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int8 = mathTest0.square((-51));
        int int11 = mathTest0.divide((-3222), 112);
        int int14 = mathTest0.multiply(1, (-134969936));
        int int17 = mathTest0.multiply(10, 5541);
        java.lang.Class<?> wildcardClass18 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2601 + "'", int8 == 2601);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-28) + "'", int11 == (-28));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-134969936) + "'", int14 == (-134969936));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 55410 + "'", int17 == 55410);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        int int20 = mathTest0.multiply(99, (int) (short) 1);
        int int23 = mathTest0.multiply((-262701), 29421468);
        int int26 = mathTest0.add((-3232), (-990));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 99 + "'", int20 == 99);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1892067732 + "'", int23 == 1892067732);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-4222) + "'", int26 == (-4222));
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int13 = mathTest0.square(22500);
        int int16 = mathTest0.subtract(1892067732, 1225);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 506250000 + "'", int13 == 506250000);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1892066507 + "'", int16 == 1892066507);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(12, 100);
        int int15 = mathTest0.subtract(0, (-1156));
        int int18 = mathTest0.subtract((-1), 2048);
        int int21 = mathTest0.multiply(0, 506250000);
        java.lang.Class<?> wildcardClass22 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 112 + "'", int12 == 112);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1156 + "'", int15 == 1156);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2049) + "'", int18 == (-2049));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int11 = mathTest0.square(34);
        int int14 = mathTest0.multiply(11, 290);
        int int17 = mathTest0.add((-13503587), (int) '4');
        int int20 = mathTest0.add((-3069), (-6476));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1156 + "'", int11 == 1156);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3190 + "'", int14 == 3190);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-13503535) + "'", int17 == (-13503535));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-9545) + "'", int20 == (-9545));
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((int) (short) -1, 36);
        int int18 = mathTest0.divide((-1488), 112);
        int int21 = mathTest0.add(29421356, (int) (byte) 100);
        int int24 = mathTest0.divide(64, (-3168));
        int int27 = mathTest0.add((int) (short) -1, (-1735140));
        int int30 = mathTest0.divide((int) '4', 1852038144);
        int int33 = mathTest0.subtract(1053, (-1081));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-13) + "'", int18 == (-13));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 29421456 + "'", int21 == 29421456);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1735141) + "'", int27 == (-1735141));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2134 + "'", int33 == 2134);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.subtract((int) (short) -1, (int) (short) 100);
        java.lang.Class<?> wildcardClass15 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-101) + "'", int14 == (-101));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.subtract((int) '#', (int) (short) 100);
        int int11 = mathTest0.square(99);
        java.lang.Class<?> wildcardClass12 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-65) + "'", int9 == (-65));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9801 + "'", int11 == 9801);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.subtract((int) (short) -1, (int) (short) 100);
        int int16 = mathTest0.square(101);
        int int19 = mathTest0.add((-1042405), 303);
        java.lang.Class<?> wildcardClass20 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-101) + "'", int14 == (-101));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10201 + "'", int16 == 10201);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1042102) + "'", int19 == (-1042102));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.add((int) (byte) -1, (int) '4');
        int int12 = mathTest0.subtract(150, 51);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = mathTest0.divide(0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Cannot divide by zero.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 99 + "'", int12 == 99);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(12, 100);
        int int15 = mathTest0.multiply(2, 1046);
        int int18 = mathTest0.subtract(1494149, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 112 + "'", int12 == 112);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2092 + "'", int15 == 2092);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1494149 + "'", int18 == 1494149);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.subtract((int) '#', (int) (short) 1);
        int int17 = mathTest0.multiply(1, (-1));
        int int19 = mathTest0.square((-3168));
        int int22 = mathTest0.divide((-51), 3232);
        int int24 = mathTest0.square(1225);
        int int27 = mathTest0.add(36, 4353);
        java.lang.Class<?> wildcardClass28 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10036224 + "'", int19 == 10036224);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1500625 + "'", int24 == 1500625);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4389 + "'", int27 == 4389);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        mathTest mathTest0 = new mathTest();
        int int2 = mathTest0.square((-101));
        int int5 = mathTest0.multiply(0, 1024);
        java.lang.Class<?> wildcardClass6 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10201 + "'", int2 == 10201);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.subtract((int) '#', (int) (short) 1);
        int int17 = mathTest0.multiply(1, (-1));
        int int19 = mathTest0.square((-3168));
        int int22 = mathTest0.multiply((-66), (int) (short) 100);
        int int24 = mathTest0.square((-71));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10036224 + "'", int19 == 10036224);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-6600) + "'", int22 == (-6600));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5041 + "'", int24 == 5041);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int11 = mathTest0.square(34);
        int int14 = mathTest0.multiply(11, 290);
        int int17 = mathTest0.add((-13503587), (int) '4');
        java.lang.Class<?> wildcardClass18 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1156 + "'", int11 == 1156);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3190 + "'", int14 == 3190);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-13503535) + "'", int17 == (-13503535));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.multiply(101, 51);
        int int17 = mathTest0.multiply(34, (-50960));
        int int19 = mathTest0.square(101);
        int int22 = mathTest0.multiply((-65), (-3212));
        int int25 = mathTest0.subtract(101, 210);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5151 + "'", int14 == 5151);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1732640) + "'", int17 == (-1732640));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10201 + "'", int19 == 10201);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 208780 + "'", int22 == 208780);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-109) + "'", int25 == (-109));
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int12 = mathTest0.multiply(144, 1594884096);
        int int15 = mathTest0.subtract((-992), 1042102);
        int int18 = mathTest0.divide((-951887), (-13506830));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2030043136 + "'", int12 == 2030043136);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1043094) + "'", int15 == (-1043094));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square(5200);
        int int14 = mathTest0.subtract((-43), (-35));
        int int17 = mathTest0.divide(0, (-134969936));
        java.lang.Class<?> wildcardClass18 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27040000 + "'", int11 == 27040000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-8) + "'", int14 == (-8));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.multiply(101, 51);
        int int17 = mathTest0.multiply(34, (-50960));
        int int19 = mathTest0.square(101);
        int int21 = mathTest0.square(163);
        java.lang.Class<?> wildcardClass22 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5151 + "'", int14 == 5151);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1732640) + "'", int17 == (-1732640));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10201 + "'", int19 == 10201);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 26569 + "'", int21 == 26569);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int5 = mathTest0.square((int) (byte) 10);
        int int7 = mathTest0.square((-101));
        int int10 = mathTest0.multiply(3329, (-399));
        int int13 = mathTest0.add(1530169, (-43));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10201 + "'", int7 == 10201);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1328271) + "'", int10 == (-1328271));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1530126 + "'", int13 == 1530126);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) ' ');
        int int12 = mathTest0.divide((int) (byte) 100, 36);
        int int15 = mathTest0.multiply(63, (-1));
        int int18 = mathTest0.subtract((int) (short) 1, (-31));
        java.lang.Class<?> wildcardClass19 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-63) + "'", int15 == (-63));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.subtract((int) (short) 0, (int) '#');
        int int15 = mathTest0.add((-101), 1024);
        int int18 = mathTest0.subtract(112, 3329);
        int int21 = mathTest0.multiply(26569, 9409);
        java.lang.Class<?> wildcardClass22 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-35) + "'", int12 == (-35));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 923 + "'", int15 == 923);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3217) + "'", int18 == (-3217));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 249987721 + "'", int21 == 249987721);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int12 = mathTest0.multiply(144, 1594884096);
        int int15 = mathTest0.subtract((-992), 1042102);
        java.lang.Class<?> wildcardClass16 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2030043136 + "'", int12 == 2030043136);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1043094) + "'", int15 == (-1043094));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.divide(1496241, 10201);
        int int14 = mathTest0.square(1053);
        java.lang.Class<?> wildcardClass15 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 146 + "'", int12 == 146);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1108809 + "'", int14 == 1108809);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int12 = mathTest0.multiply(0, 210);
        int int15 = mathTest0.add((-50), (int) 'a');
        java.lang.Class<?> wildcardClass16 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 47 + "'", int15 == 47);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.subtract((int) (short) -1, (int) (short) 100);
        int int17 = mathTest0.multiply((-399), (int) (byte) 10);
        int int20 = mathTest0.add((-31), (-12));
        int int23 = mathTest0.subtract((-3069), (-825));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-101) + "'", int14 == (-101));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-3990) + "'", int17 == (-3990));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-43) + "'", int20 == (-43));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-2244) + "'", int23 == (-2244));
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((-32), 99);
        int int9 = mathTest0.divide((-3232), 51);
        int int12 = mathTest0.multiply(0, 2);
        int int15 = mathTest0.divide(1094116, 1042441);
        int int18 = mathTest0.subtract((-805856915), (-138));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3168) + "'", int6 == (-3168));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-63) + "'", int9 == (-63));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-805856777) + "'", int18 == (-805856777));
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((-1), (-50));
        int int18 = mathTest0.divide((int) (short) -1, 163);
        int int21 = mathTest0.multiply(1336336, 29421456);
        int int23 = mathTest0.square(3329);
        int int26 = mathTest0.subtract((-51918), (-980));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 820197632 + "'", int21 == 820197632);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 11082241 + "'", int23 == 11082241);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-50938) + "'", int26 == (-50938));
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        mathTest mathTest0 = new mathTest();
        int int2 = mathTest0.square(0);
        java.lang.Class<?> wildcardClass3 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((int) (short) -1, 36);
        int int18 = mathTest0.multiply((-51), (-31));
        int int21 = mathTest0.divide(1892067732, 16318464);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1581 + "'", int18 == 1581);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 115 + "'", int21 == 115);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((-1), (-50));
        int int18 = mathTest0.divide((int) (short) -1, 163);
        int int21 = mathTest0.multiply(1336336, 29421456);
        java.lang.Class<?> wildcardClass22 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 820197632 + "'", int21 == 820197632);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        java.lang.Class<?> wildcardClass18 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square((-32969632));
        int int14 = mathTest0.subtract((int) (short) 10, (-1190));
        java.lang.Class<?> wildcardClass15 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 541139968 + "'", int11 == 541139968);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1200 + "'", int14 == 1200);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        mathTest mathTest0 = new mathTest();
        int int2 = mathTest0.square((-101));
        int int5 = mathTest0.multiply(1594884096, (-29422512));
        int int8 = mathTest0.divide((-32969632), (-3295));
        int int11 = mathTest0.multiply(1496160, 50960);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10201 + "'", int2 == 10201);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1962934272 + "'", int5 == 1962934272);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10005 + "'", int8 == 10005);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1065097728) + "'", int11 == (-1065097728));
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((int) (short) -1, 36);
        java.lang.Class<?> wildcardClass16 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int8 = mathTest0.square((-51));
        int int11 = mathTest0.divide((-3222), 112);
        int int14 = mathTest0.multiply(1, (-134969936));
        int int17 = mathTest0.multiply(10, 5541);
        int int19 = mathTest0.square(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2601 + "'", int8 == 2601);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-28) + "'", int11 == (-28));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-134969936) + "'", int14 == (-134969936));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 55410 + "'", int17 == 55410);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((int) (short) -1, 36);
        int int17 = mathTest0.square((-66));
        int int20 = mathTest0.add((int) (byte) 0, (int) (byte) 1);
        int int22 = mathTest0.square((-1021));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4356 + "'", int17 == 4356);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1042441 + "'", int22 == 1042441);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.divide(0, 5200);
        int int14 = mathTest0.multiply((int) (short) 1, (int) (short) 10);
        int int16 = mathTest0.square((-27036768));
        java.lang.Class<?> wildcardClass17 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 569975808 + "'", int16 == 569975808);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square((-32969632));
        int int14 = mathTest0.divide(4353, (-124));
        int int17 = mathTest0.subtract((-3535), (-3168));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 541139968 + "'", int11 == 541139968);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-35) + "'", int14 == (-35));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-367) + "'", int17 == (-367));
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.divide((-101), 2);
        int int9 = mathTest0.divide(263609, (-9669));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-27) + "'", int9 == (-27));
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int14 = mathTest0.square(0);
        int int17 = mathTest0.add(100, 203);
        int int20 = mathTest0.divide(1496089, (-13503587));
        java.lang.Class<?> wildcardClass21 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 303 + "'", int17 == 303);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.subtract((-2720), 9700);
        int int9 = mathTest0.multiply(29421456, 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-12420) + "'", int6 == (-12420));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1323400240) + "'", int9 == (-1323400240));
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((int) (short) -1, 36);
        int int17 = mathTest0.square((-66));
        int int20 = mathTest0.add((int) (byte) 0, (int) (byte) 1);
        int int23 = mathTest0.divide((-124), (-33116283));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4356 + "'", int17 == 4356);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add(52, (-3295));
        int int6 = mathTest0.subtract((-123), 2500);
        int int9 = mathTest0.multiply(10005, (-3069));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3243) + "'", int3 == (-3243));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2623) + "'", int6 == (-2623));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-30705345) + "'", int9 == (-30705345));
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.add((int) (short) 1, 0);
        int int14 = mathTest0.add(51, (-3232));
        int int17 = mathTest0.add(1500625, (-6476));
        int int20 = mathTest0.divide((-372010359), 36);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3181) + "'", int14 == (-3181));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1494149 + "'", int17 == 1494149);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-10333621) + "'", int20 == (-10333621));
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.add((int) (byte) -1, (int) '4');
        int int12 = mathTest0.subtract(150, 51);
        int int15 = mathTest0.add((int) (short) 1, 1);
        int int18 = mathTest0.multiply((-148), (-124));
        int int21 = mathTest0.subtract((int) (byte) -1, (-805857024));
        java.lang.Class<?> wildcardClass22 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 99 + "'", int12 == 99);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 18352 + "'", int18 == 18352);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 805857023 + "'", int21 == 805857023);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int5 = mathTest0.square((int) (byte) 10);
        int int7 = mathTest0.square((-101));
        int int9 = mathTest0.square(336795904);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10201 + "'", int7 == 10201);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1200553984) + "'", int9 == (-1200553984));
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int11 = mathTest0.square(3232);
        int int14 = mathTest0.divide((-32), (int) (short) 1);
        int int17 = mathTest0.add(36, 1010);
        int int20 = mathTest0.multiply((-1544804416), 2704);
        int int23 = mathTest0.divide((-3217), 1962924603);
        int int26 = mathTest0.subtract(1530169, 3045332);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10445824 + "'", int11 == 10445824);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-32) + "'", int14 == (-32));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1046 + "'", int17 == 1046);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1852038144 + "'", int20 == 1852038144);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1515163) + "'", int26 == (-1515163));
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int8 = mathTest0.square((-51));
        int int11 = mathTest0.add((-461244), (int) (short) 100);
        java.lang.Class<?> wildcardClass12 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2601 + "'", int8 == 2601);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-461144) + "'", int11 == (-461144));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add((int) (byte) 10, (-3232));
        int int15 = mathTest0.add((-3243), 31);
        int int18 = mathTest0.divide(12124646, 1094116);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3222) + "'", int12 == (-3222));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3212) + "'", int15 == (-3212));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(1581, (-13));
        java.lang.Class<?> wildcardClass13 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1568 + "'", int12 == 1568);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int5 = mathTest0.square((-1735140));
        int int8 = mathTest0.add(164, (-27036767));
        java.lang.Class<?> wildcardClass9 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-61254896) + "'", int5 == (-61254896));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-27036603) + "'", int8 == (-27036603));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((-32), 99);
        int int9 = mathTest0.divide((-3232), 51);
        int int12 = mathTest0.subtract(34, (int) (short) 100);
        int int15 = mathTest0.subtract((int) (byte) -1, (int) (byte) 0);
        int int18 = mathTest0.add((-13503587), 9409);
        java.lang.Class<?> wildcardClass19 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3168) + "'", int6 == (-3168));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-63) + "'", int9 == (-63));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-66) + "'", int12 == (-66));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-13494178) + "'", int18 == (-13494178));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) ' ');
        int int12 = mathTest0.divide((int) (byte) 100, 36);
        int int15 = mathTest0.multiply(63, (-1));
        int int18 = mathTest0.subtract(0, 990);
        java.lang.Class<?> wildcardClass19 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-63) + "'", int15 == (-63));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-990) + "'", int18 == (-990));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((-32), 99);
        int int9 = mathTest0.divide(40092, 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3168) + "'", int6 == (-3168));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3084 + "'", int9 == 3084);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.divide((-101), 2);
        int int8 = mathTest0.square(1849);
        java.lang.Class<?> wildcardClass9 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3418801 + "'", int8 == 3418801);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int11 = mathTest0.square(3232);
        int int14 = mathTest0.divide((-32), (int) (short) 1);
        int int17 = mathTest0.add(36, 1010);
        int int20 = mathTest0.multiply((-1544804416), 2704);
        int int23 = mathTest0.divide((-3217), 1962924603);
        java.lang.Class<?> wildcardClass24 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10445824 + "'", int11 == 10445824);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-32) + "'", int14 == (-32));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1046 + "'", int17 == 1046);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1852038144 + "'", int20 == 1852038144);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.add(100, (int) (short) 1);
        int int9 = mathTest0.subtract(0, 0);
        int int11 = mathTest0.square((int) (byte) 1);
        int int14 = mathTest0.add(999644832, 12496225);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1012141057 + "'", int14 == 1012141057);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        int int20 = mathTest0.subtract(12, (-3295));
        int int23 = mathTest0.multiply((-138), 4356);
        int int25 = mathTest0.square((-3196));
        int int28 = mathTest0.multiply(541139968, (-3243));
        java.lang.Class<?> wildcardClass29 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3307 + "'", int20 == 3307);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-601128) + "'", int23 == (-601128));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10214416 + "'", int25 == 10214416);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1724707840 + "'", int28 == 1724707840);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        int int20 = mathTest0.divide(2, 11);
        int int23 = mathTest0.multiply((-2720), (int) (short) 100);
        int int26 = mathTest0.subtract((-1515163), (-13503587));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-272000) + "'", int23 == (-272000));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 11988424 + "'", int26 == 11988424);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.subtract((int) '#', (int) (short) 1);
        int int17 = mathTest0.multiply(1, (-1));
        int int19 = mathTest0.square((-3168));
        int int22 = mathTest0.divide((-51), 3232);
        int int24 = mathTest0.square(1225);
        int int27 = mathTest0.add(36, 4353);
        int int29 = mathTest0.square((-29422512));
        int int32 = mathTest0.divide((-127500), 923);
        int int35 = mathTest0.subtract(10036224, (-28));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10036224 + "'", int19 == 10036224);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1500625 + "'", int24 == 1500625);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4389 + "'", int27 == 4389);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-805857024) + "'", int29 == (-805857024));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-138) + "'", int32 == (-138));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10036252 + "'", int35 == 10036252);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int11 = mathTest0.square(133);
        int int14 = mathTest0.multiply(9700, 133);
        int int16 = mathTest0.square(10201);
        int int19 = mathTest0.multiply((-992), 14747159);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 17689 + "'", int11 == 17689);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1290100 + "'", int14 == 1290100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 104060401 + "'", int16 == 104060401);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1744279840) + "'", int19 == (-1744279840));
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        int int20 = mathTest0.divide(2, 11);
        java.lang.Class<?> wildcardClass21 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int11 = mathTest0.square(3232);
        int int14 = mathTest0.multiply((-3295), 1);
        java.lang.Class<?> wildcardClass15 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10445824 + "'", int11 == 10445824);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3295) + "'", int14 == (-3295));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.add(52, 98);
        int int17 = mathTest0.subtract(3299872, 254540);
        java.lang.Class<?> wildcardClass18 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 150 + "'", int14 == 150);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3045332 + "'", int17 == 3045332);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(12, 100);
        int int15 = mathTest0.multiply(2, 1046);
        java.lang.Class<?> wildcardClass16 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 112 + "'", int12 == 112);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2092 + "'", int15 == 2092);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) ' ');
        int int12 = mathTest0.divide((int) (byte) 100, 36);
        int int15 = mathTest0.subtract(0, 3232);
        int int18 = mathTest0.divide(104060401, 3329);
        int int21 = mathTest0.divide((-1022), (-675));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3232) + "'", int15 == (-3232));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 31258 + "'", int18 == 31258);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(12, 100);
        int int15 = mathTest0.add(2601, (-51));
        int int18 = mathTest0.divide((-51918), 1594884096);
        int int21 = mathTest0.multiply(1724707841, 923);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 112 + "'", int12 == 112);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2550 + "'", int15 == 2550);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1527529573) + "'", int21 == (-1527529573));
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.divide(0, 5200);
        int int14 = mathTest0.multiply((int) (short) 1, (int) (short) 10);
        int int17 = mathTest0.multiply((-3232), 10201);
        int int20 = mathTest0.subtract(63, (-990));
        int int23 = mathTest0.add(3307, 1046);
        int int26 = mathTest0.multiply((-2623), 43560000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-32969632) + "'", int17 == (-32969632));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1053 + "'", int20 == 1053);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4353 + "'", int23 == 4353);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1706236992 + "'", int26 == 1706236992);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.divide((-101), 2);
        int int9 = mathTest0.multiply(101, 10);
        int int12 = mathTest0.multiply(2601, (-101));
        int int15 = mathTest0.subtract((-27036768), 9669);
        int int18 = mathTest0.subtract((-29422512), 541139968);
        int int21 = mathTest0.add(1346542369, 1094050);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1010 + "'", int9 == 1010);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-262701) + "'", int12 == (-262701));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-27046437) + "'", int15 == (-27046437));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-570562480) + "'", int18 == (-570562480));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1347636419 + "'", int21 == 1347636419);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int11 = mathTest0.square(133);
        int int14 = mathTest0.multiply(9700, 133);
        int int16 = mathTest0.square(10201);
        int int19 = mathTest0.add((-135036), (-2244));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 17689 + "'", int11 == 17689);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1290100 + "'", int14 == 1290100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 104060401 + "'", int16 == 104060401);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-137280) + "'", int19 == (-137280));
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.add((int) (short) 10, 2);
        int int9 = mathTest0.multiply((-28542678), 999644832);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 12 + "'", int6 == 12);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 935011904 + "'", int9 == 935011904);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((-1), (-50));
        int int18 = mathTest0.subtract(429549516, 0);
        int int21 = mathTest0.divide((-252448), (-27036767));
        int int23 = mathTest0.square((-127500));
        java.lang.Class<?> wildcardClass24 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 429549516 + "'", int18 == 429549516);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-923619184) + "'", int23 == (-923619184));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(3232, (-3168));
        int int8 = mathTest0.square((-3232));
        int int11 = mathTest0.add(29421356, 112);
        int int14 = mathTest0.add(98, (-135036));
        java.lang.Class<?> wildcardClass15 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10445824 + "'", int8 == 10445824);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 29421468 + "'", int11 == 29421468);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-134938) + "'", int14 == (-134938));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.add((int) (byte) -1, (int) '4');
        int int12 = mathTest0.multiply((int) 'a', (int) (short) 100);
        int int14 = mathTest0.square(219152384);
        int int16 = mathTest0.square(268);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9700 + "'", int12 == 9700);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 71824 + "'", int16 == 71824);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(12, 100);
        int int15 = mathTest0.add(2601, (-51));
        int int18 = mathTest0.divide((-51918), 1594884096);
        int int21 = mathTest0.divide(0, 10424);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 112 + "'", int12 == 112);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2550 + "'", int15 == 2550);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((int) (short) -1, 36);
        int int17 = mathTest0.square((-66));
        int int20 = mathTest0.add((int) (byte) 0, (int) (byte) 1);
        int int22 = mathTest0.square(219152384);
        java.lang.Class<?> wildcardClass23 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4356 + "'", int17 == 4356);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.subtract((int) '#', (int) (short) 1);
        int int17 = mathTest0.multiply(1, (-1));
        int int20 = mathTest0.subtract(1962934272, (-66));
        int int23 = mathTest0.divide((-134969827), 336795904);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1962934338 + "'", int20 == 1962934338);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((int) (short) -1, 36);
        int int18 = mathTest0.divide((-1488), 112);
        int int21 = mathTest0.add(29421356, (int) (byte) 100);
        int int24 = mathTest0.multiply((-601128), (-992));
        java.lang.Class<?> wildcardClass25 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-13) + "'", int18 == (-13));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 29421456 + "'", int21 == 29421456);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 596318976 + "'", int24 == 596318976);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.subtract((int) (short) 0, (int) '#');
        int int15 = mathTest0.add((-101), 1024);
        int int18 = mathTest0.subtract(112, 3329);
        int int21 = mathTest0.divide(1331441, 828396608);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-35) + "'", int12 == (-35));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 923 + "'", int15 == 923);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3217) + "'", int18 == (-3217));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(3232, (-3168));
        int int8 = mathTest0.square((-3232));
        int int11 = mathTest0.add(990, 712775872);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10445824 + "'", int8 == 10445824);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 712776862 + "'", int11 == 712776862);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.add(2092, 1494149);
        int int18 = mathTest0.add(1357853952, (-461144));
        int int21 = mathTest0.subtract(0, 1838192896);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1496241 + "'", int15 == 1496241);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1357392808 + "'", int18 == 1357392808);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1838192896) + "'", int21 == (-1838192896));
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int11 = mathTest0.square(3232);
        int int14 = mathTest0.divide((-32), (int) (short) 1);
        int int17 = mathTest0.add(36, 1010);
        int int19 = mathTest0.square(2);
        int int22 = mathTest0.divide(15036876, 1724707840);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10445824 + "'", int11 == 10445824);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-32) + "'", int14 == (-32));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1046 + "'", int17 == 1046);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.subtract(36, 3232);
        int int16 = mathTest0.square(2);
        int int19 = mathTest0.add((int) '4', 12);
        int int22 = mathTest0.divide((-13), (-3990));
        java.lang.Class<?> wildcardClass23 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3196) + "'", int14 == (-3196));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 64 + "'", int19 == 64);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        mathTest mathTest0 = new mathTest();
        int int2 = mathTest0.square((-101));
        int int5 = mathTest0.divide((-71), 19);
        int int8 = mathTest0.subtract((-65), (-109));
        java.lang.Class<?> wildcardClass9 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10201 + "'", int2 == 10201);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-3) + "'", int5 == (-3));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 44 + "'", int8 == 44);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int11 = mathTest0.square(3232);
        int int14 = mathTest0.divide((-32), (int) (short) 1);
        int int17 = mathTest0.add(36, 1010);
        int int19 = mathTest0.square(2);
        java.lang.Class<?> wildcardClass20 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10445824 + "'", int11 == 10445824);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-32) + "'", int14 == (-32));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1046 + "'", int17 == 1046);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int12 = mathTest0.add(290, 2);
        int int15 = mathTest0.multiply((-13503600), (-3243));
        java.lang.Class<?> wildcardClass16 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 292 + "'", int12 == 292);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 842501840 + "'", int15 == 842501840);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int11 = mathTest0.square(3232);
        int int14 = mathTest0.divide((-32), (int) (short) 1);
        int int17 = mathTest0.add(36, 1010);
        int int20 = mathTest0.multiply((-1544804416), 2704);
        java.lang.Class<?> wildcardClass21 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10445824 + "'", int11 == 10445824);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-32) + "'", int14 == (-32));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1046 + "'", int17 == 1046);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1852038144 + "'", int20 == 1852038144);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(3232, (-3168));
        int int9 = mathTest0.divide(5151, (-399));
        int int12 = mathTest0.divide(5200, (-32969632));
        int int15 = mathTest0.add((-9669), 1496241);
        java.lang.Class<?> wildcardClass16 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-12) + "'", int9 == (-12));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1486572 + "'", int15 == 1486572);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.subtract(36, 3232);
        int int16 = mathTest0.square(2);
        int int19 = mathTest0.divide(1042441, (-190));
        java.lang.Class<?> wildcardClass20 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3196) + "'", int14 == (-3196));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-5486) + "'", int19 == (-5486));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int8 = mathTest0.square((-51));
        int int11 = mathTest0.subtract(100, (-190));
        int int14 = mathTest0.divide((-66), (-63));
        int int16 = mathTest0.square(0);
        java.lang.Class<?> wildcardClass17 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2601 + "'", int8 == 2601);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 290 + "'", int11 == 290);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        int int20 = mathTest0.add(0, 1046);
        int int22 = mathTest0.square((int) '#');
        int int25 = mathTest0.subtract((-27036576), (-5681));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1046 + "'", int20 == 1046);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1225 + "'", int22 == 1225);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-27030895) + "'", int25 == (-27030895));
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int5 = mathTest0.square((int) (byte) 10);
        int int7 = mathTest0.square((-101));
        int int10 = mathTest0.multiply(3329, (-399));
        int int13 = mathTest0.subtract(312900721, 1500625);
        int int16 = mathTest0.add(1962930943, 1966983424);
        int int19 = mathTest0.multiply(12, 1496699);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10201 + "'", int7 == 10201);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1328271) + "'", int10 == (-1328271));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 311400096 + "'", int13 == 311400096);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-365052929) + "'", int16 == (-365052929));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 17960388 + "'", int19 == 17960388);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) ' ');
        int int12 = mathTest0.divide((int) (byte) 100, 36);
        int int15 = mathTest0.subtract(0, 3232);
        int int18 = mathTest0.divide(104060401, 3329);
        int int20 = mathTest0.square(163);
        int int23 = mathTest0.divide((int) (short) 1, 19);
        java.lang.Class<?> wildcardClass24 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3232) + "'", int15 == (-3232));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 31258 + "'", int18 == 31258);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 26569 + "'", int20 == 26569);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(3232, (-3168));
        int int9 = mathTest0.divide(5151, (-399));
        int int12 = mathTest0.divide(5200, (-32969632));
        int int15 = mathTest0.multiply((-1735140), 1346542369);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-12) + "'", int9 == (-12));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1208040860 + "'", int15 == 1208040860);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.add(52, 98);
        int int17 = mathTest0.subtract(3299872, 254540);
        int int20 = mathTest0.divide(1331441, (-367));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 150 + "'", int14 == 150);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3045332 + "'", int17 == 3045332);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-3627) + "'", int20 == (-3627));
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int11 = mathTest0.square(3232);
        int int14 = mathTest0.divide((-32), (int) (short) 1);
        int int17 = mathTest0.add(36, 1010);
        int int20 = mathTest0.subtract((-61), (int) (short) 10);
        java.lang.Class<?> wildcardClass21 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10445824 + "'", int11 == 10445824);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-32) + "'", int14 == (-32));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1046 + "'", int17 == 1046);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-71) + "'", int20 == (-71));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square((-32969632));
        int int14 = mathTest0.multiply(14747159, 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 541139968 + "'", int11 == 541139968);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 176965908 + "'", int14 == 176965908);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.add((int) (short) 10, 2);
        int int9 = mathTest0.add((-584742496), (-27));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 12 + "'", int6 == 12);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-584742523) + "'", int9 == (-584742523));
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.multiply(10445824, 10445824);
        int int12 = mathTest0.divide(2704, (-5681));
        java.lang.Class<?> wildcardClass13 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1594884096 + "'", int9 == 1594884096);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) ' ');
        int int12 = mathTest0.divide((int) (byte) 100, 36);
        int int15 = mathTest0.subtract(0, 3232);
        int int18 = mathTest0.divide(104060401, 3329);
        int int20 = mathTest0.square(163);
        int int23 = mathTest0.divide((int) (short) 1, 19);
        int int26 = mathTest0.subtract((-1086356767), (-9103));
        java.lang.Class<?> wildcardClass27 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3232) + "'", int15 == (-3232));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 31258 + "'", int18 == 31258);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 26569 + "'", int20 == 26569);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1086347664) + "'", int26 == (-1086347664));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int11 = mathTest0.square(3232);
        int int14 = mathTest0.divide((-32), (int) (short) 1);
        int int17 = mathTest0.add(11, (int) ' ');
        java.lang.Class<?> wildcardClass18 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10445824 + "'", int11 == 10445824);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-32) + "'", int14 == (-32));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 43 + "'", int17 == 43);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.add((int) (byte) -1, (int) '4');
        int int12 = mathTest0.multiply((int) 'a', (int) (short) 100);
        java.lang.Class<?> wildcardClass13 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9700 + "'", int12 == 9700);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((-32), 99);
        int int9 = mathTest0.divide((-3232), 51);
        int int11 = mathTest0.square(1046);
        int int13 = mathTest0.square((-138));
        int int15 = mathTest0.square((-461240));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3168) + "'", int6 == (-3168));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-63) + "'", int9 == (-63));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1094116 + "'", int11 == 1094116);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 19044 + "'", int13 == 19044);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2006027200) + "'", int15 == (-2006027200));
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square((-32969632));
        int int13 = mathTest0.square((-52));
        int int15 = mathTest0.square((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 541139968 + "'", int11 == 541139968);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2704 + "'", int13 == 2704);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        mathTest mathTest0 = new mathTest();
        int int2 = mathTest0.square((-101));
        int int5 = mathTest0.multiply(0, 1024);
        int int8 = mathTest0.divide((-461244), 11612725);
        int int11 = mathTest0.divide(115, 1325028);
        java.lang.Class<?> wildcardClass12 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10201 + "'", int2 == 10201);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.subtract((int) '#', (int) (short) 100);
        int int11 = mathTest0.square(99);
        int int14 = mathTest0.divide(12508860, 1200);
        int int17 = mathTest0.add(101, 208780);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-65) + "'", int9 == (-65));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9801 + "'", int11 == 9801);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10424 + "'", int14 == 10424);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 208881 + "'", int17 == 208881);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.divide(0, 5200);
        int int14 = mathTest0.multiply((int) (short) 1, (int) (short) 10);
        int int16 = mathTest0.square((-27036768));
        int int19 = mathTest0.subtract(29421356, (-341));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 569975808 + "'", int16 == 569975808);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 29421697 + "'", int19 == 29421697);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int11 = mathTest0.square(3232);
        int int14 = mathTest0.divide((-32), (int) (short) 1);
        int int17 = mathTest0.add(11, (int) ' ');
        int int20 = mathTest0.multiply((-28542678), 203);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10445824 + "'", int11 == 10445824);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-32) + "'", int14 == (-32));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 43 + "'", int17 == 43);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1499196338) + "'", int20 == (-1499196338));
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        int int20 = mathTest0.subtract(12, (-3295));
        int int23 = mathTest0.add((-101), 112);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = mathTest0.divide(31, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Cannot divide by zero.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3307 + "'", int20 == 3307);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 11 + "'", int23 == 11);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.divide(0, 5200);
        int int13 = mathTest0.square(4356);
        int int16 = mathTest0.divide((-29338412), 31);
        int int19 = mathTest0.divide(1024, 10000);
        int int22 = mathTest0.divide(935011904, 1357392808);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 18974736 + "'", int13 == 18974736);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-946400) + "'", int16 == (-946400));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.multiply((int) (short) 0, (-101));
        int int9 = mathTest0.multiply((-1190), (-805857024));
        int int12 = mathTest0.add((-35), 1702);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1192151552 + "'", int9 == 1192151552);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1667 + "'", int12 == 1667);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        mathTest mathTest0 = new mathTest();
        int int2 = mathTest0.square((-101));
        int int5 = mathTest0.multiply(0, 1024);
        int int8 = mathTest0.divide((-461244), 11612725);
        int int11 = mathTest0.divide(115, 1325028);
        int int14 = mathTest0.subtract(1094116, 52229);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10201 + "'", int2 == 10201);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1041887 + "'", int14 == 1041887);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((int) (short) -1, 36);
        int int18 = mathTest0.divide((-1488), 112);
        int int21 = mathTest0.add(29421356, (int) (byte) 100);
        int int24 = mathTest0.divide(64, (-3168));
        int int27 = mathTest0.add((int) (short) -1, (-1735140));
        int int30 = mathTest0.divide((int) '4', 1852038144);
        int int33 = mathTest0.subtract(210, (int) '4');
        int int36 = mathTest0.divide(36, 1990028532);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-13) + "'", int18 == (-13));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 29421456 + "'", int21 == 29421456);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1735141) + "'", int27 == (-1735141));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 158 + "'", int33 == 158);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.divide(0, 5200);
        int int14 = mathTest0.multiply((int) (short) 1, (int) (short) 10);
        int int17 = mathTest0.multiply((-3232), 10201);
        int int20 = mathTest0.divide(22500, 10445824);
        int int23 = mathTest0.multiply((int) (short) 100, 10005);
        int int26 = mathTest0.subtract(36, 1042441);
        java.lang.Class<?> wildcardClass27 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-32969632) + "'", int17 == (-32969632));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1000500 + "'", int23 == 1000500);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1042405) + "'", int26 == (-1042405));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.divide(1290100, (-3232));
        int int20 = mathTest0.divide((-6476), 34);
        int int23 = mathTest0.subtract(10, (-8));
        int int26 = mathTest0.divide(18352, 923);
        java.lang.Class<?> wildcardClass27 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-399) + "'", int17 == (-399));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-190) + "'", int20 == (-190));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 18 + "'", int23 == 18);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 19 + "'", int26 == 19);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.subtract((int) (short) 0, (int) '#');
        int int15 = mathTest0.subtract((-1), 100);
        int int18 = mathTest0.add((-990), (-32));
        java.lang.Class<?> wildcardClass19 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-35) + "'", int12 == (-35));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-101) + "'", int15 == (-101));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1022) + "'", int18 == (-1022));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int5 = mathTest0.square((int) (byte) 10);
        int int8 = mathTest0.add((-1488), 3190);
        int int11 = mathTest0.add(53312, 263609);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1702 + "'", int8 == 1702);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 316921 + "'", int11 == 316921);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        mathTest mathTest0 = new mathTest();
        int int2 = mathTest0.square((-101));
        int int5 = mathTest0.multiply(1594884096, (-29422512));
        int int8 = mathTest0.divide((-32969632), (-3295));
        int int11 = mathTest0.divide(2499561, 3329);
        int int13 = mathTest0.square(0);
        int int16 = mathTest0.add((-134974868), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10201 + "'", int2 == 10201);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1962934272 + "'", int5 == 1962934272);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10005 + "'", int8 == 10005);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 750 + "'", int11 == 750);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-134974868) + "'", int16 == (-134974868));
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.divide(0, 5200);
        int int14 = mathTest0.multiply((int) (short) 1, (int) (short) 10);
        int int17 = mathTest0.multiply((-3232), 10201);
        int int20 = mathTest0.subtract(63, (-990));
        int int23 = mathTest0.add(2601, 1990351231);
        java.lang.Class<?> wildcardClass24 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-32969632) + "'", int17 == (-32969632));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1053 + "'", int20 == 1053);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1990353832 + "'", int23 == 1990353832);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int11 = mathTest0.square(133);
        int int14 = mathTest0.divide((-13506830), 3414448);
        java.lang.Class<?> wildcardClass15 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 17689 + "'", int11 == 17689);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3) + "'", int14 == (-3));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.divide((-101), 303);
        java.lang.Class<?> wildcardClass13 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.add((int) (short) 1, 0);
        java.lang.Class<?> wildcardClass12 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int8 = mathTest0.square(10201);
        int int11 = mathTest0.multiply(10445824, (-546213652));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 104060401 + "'", int8 == 104060401);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1924149248 + "'", int11 == 1924149248);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.subtract((int) '#', (int) (short) 1);
        int int17 = mathTest0.multiply(1, (-1));
        int int19 = mathTest0.square((-3168));
        int int22 = mathTest0.divide((-51), 3232);
        int int24 = mathTest0.square(1225);
        int int27 = mathTest0.add(36, 4353);
        int int30 = mathTest0.subtract((-990), (int) (byte) 0);
        int int33 = mathTest0.subtract((-27036768), (int) (short) -1);
        int int36 = mathTest0.multiply(109330155, 1435739648);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10036224 + "'", int19 == 10036224);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1500625 + "'", int24 == 1500625);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4389 + "'", int27 == 4389);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-990) + "'", int30 == (-990));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-27036767) + "'", int33 == (-27036767));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-390241792) + "'", int36 == (-390241792));
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.add(100, (int) (short) 1);
        int int9 = mathTest0.subtract(0, 0);
        int int11 = mathTest0.square(12);
        int int14 = mathTest0.subtract((-1156), (-29422512));
        int int16 = mathTest0.square(18352);
        int int19 = mathTest0.divide(1499341, (-365052929));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 144 + "'", int11 == 144);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29421356 + "'", int14 == 29421356);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 336795904 + "'", int16 == 336795904);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.subtract((int) '#', (int) (short) 1);
        int int17 = mathTest0.multiply(1, (-1));
        int int19 = mathTest0.square((-3168));
        int int22 = mathTest0.divide((-51), 3232);
        int int24 = mathTest0.square(1225);
        int int26 = mathTest0.square((-8));
        int int29 = mathTest0.multiply((-1732640), 1543545828);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10036224 + "'", int19 == 10036224);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1500625 + "'", int24 == 1500625);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 64 + "'", int26 == 64);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1827683456) + "'", int29 == (-1827683456));
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) (short) 1);
        int int12 = mathTest0.subtract(51, (-66));
        int int15 = mathTest0.multiply((-990), 99);
        java.lang.Class<?> wildcardClass16 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 117 + "'", int12 == 117);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-98010) + "'", int15 == (-98010));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int5 = mathTest0.square((int) (byte) 10);
        int int8 = mathTest0.add((-1488), 3190);
        int int11 = mathTest0.subtract(133, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1702 + "'", int8 == 1702);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 101 + "'", int11 == 101);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.add(52, 98);
        int int17 = mathTest0.add(3232, (int) 'a');
        int int20 = mathTest0.add((int) (short) 10, 1964249568);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 150 + "'", int14 == 150);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3329 + "'", int17 == 3329);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1964249578 + "'", int20 == 1964249578);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((-32), 99);
        int int9 = mathTest0.divide((-3232), 51);
        int int11 = mathTest0.square(1046);
        int int13 = mathTest0.square((-138));
        java.lang.Class<?> wildcardClass14 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3168) + "'", int6 == (-3168));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-63) + "'", int9 == (-63));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1094116 + "'", int11 == 1094116);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 19044 + "'", int13 == 19044);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((int) (short) -1, 36);
        int int18 = mathTest0.multiply((-51), (-31));
        int int21 = mathTest0.multiply(4389, 10036323);
        int int24 = mathTest0.multiply(17689, (-845551616));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1581 + "'", int18 == 1581);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1099748687 + "'", int21 == 1099748687);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1886410752) + "'", int24 == (-1886410752));
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int14 = mathTest0.square(0);
        java.lang.Class<?> wildcardClass15 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((-32), 99);
        int int9 = mathTest0.divide((-3232), 51);
        int int12 = mathTest0.multiply(0, 2);
        int int15 = mathTest0.divide(1094116, 1042441);
        int int18 = mathTest0.subtract(1208040860, (-951887));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3168) + "'", int6 == (-3168));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-63) + "'", int9 == (-63));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1208992747 + "'", int18 == 1208992747);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.divide(1496241, 10201);
        int int15 = mathTest0.divide(11161, 1);
        int int18 = mathTest0.subtract((int) (byte) -1, 1962934272);
        int int20 = mathTest0.square(117);
        java.lang.Class<?> wildcardClass21 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 146 + "'", int12 == 146);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11161 + "'", int15 == 11161);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1962934273) + "'", int18 == (-1962934273));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 13689 + "'", int20 == 13689);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int11 = mathTest0.square(3232);
        int int14 = mathTest0.divide((-32), (int) (short) 1);
        int int17 = mathTest0.add(36, 1010);
        int int19 = mathTest0.square(2);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = mathTest0.divide(9409, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Cannot divide by zero.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10445824 + "'", int11 == 10445824);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-32) + "'", int14 == (-32));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1046 + "'", int17 == 1046);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int11 = mathTest0.square(3232);
        int int14 = mathTest0.divide((-32), (int) (short) 1);
        int int17 = mathTest0.add(36, 1010);
        int int20 = mathTest0.multiply((-1544804416), 2704);
        int int23 = mathTest0.subtract((-13503587), 26877952);
        java.lang.Class<?> wildcardClass24 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10445824 + "'", int11 == 10445824);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-32) + "'", int14 == (-32));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1046 + "'", int17 == 1046);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1852038144 + "'", int20 == 1852038144);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-40381539) + "'", int23 == (-40381539));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((int) (short) -1, 36);
        int int18 = mathTest0.divide((-1488), 112);
        int int21 = mathTest0.add(29421356, (int) (byte) 100);
        int int24 = mathTest0.divide(64, (-3168));
        int int27 = mathTest0.add((int) (short) -1, (-1735140));
        int int30 = mathTest0.multiply(1964249578, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-13) + "'", int18 == (-13));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 29421456 + "'", int21 == 29421456);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1735141) + "'", int27 == (-1735141));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int12 = mathTest0.add(290, 2);
        int int15 = mathTest0.divide(2030043136, 1480589312);
        java.lang.Class<?> wildcardClass16 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 292 + "'", int12 == 292);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((-32), 99);
        int int9 = mathTest0.divide((int) (short) 0, (int) (short) 100);
        int int12 = mathTest0.add((-27036768), (-7));
        int int14 = mathTest0.square(1995735080);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3168) + "'", int6 == (-3168));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-27036775) + "'", int12 == (-27036775));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1818756672 + "'", int14 == 1818756672);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add((int) (byte) 10, (-3232));
        int int15 = mathTest0.subtract(3418801, 4353);
        java.lang.Class<?> wildcardClass16 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3222) + "'", int12 == (-3222));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3414448 + "'", int15 == 3414448);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square((-32969632));
        int int14 = mathTest0.add(29793758, 0);
        int int17 = mathTest0.multiply(1496152, 1296);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 541139968 + "'", int11 == 541139968);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29793758 + "'", int14 == 29793758);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1939012992 + "'", int17 == 1939012992);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(12, 100);
        int int15 = mathTest0.multiply(2, 1046);
        int int17 = mathTest0.square(13516830);
        int int20 = mathTest0.subtract(0, (-13));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 112 + "'", int12 == 112);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2092 + "'", int15 == 2092);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1079444356 + "'", int17 == 1079444356);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 13 + "'", int20 == 13);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.subtract((int) (short) -1, (int) (short) 100);
        int int17 = mathTest0.add(1962934338, (int) (byte) 0);
        java.lang.Class<?> wildcardClass18 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-101) + "'", int14 == (-101));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1962934338 + "'", int17 == 1962934338);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.subtract((int) '#', (int) (short) 1);
        int int17 = mathTest0.multiply(1, (-1));
        int int19 = mathTest0.square((-3168));
        int int22 = mathTest0.divide(1852038144, 1496089);
        int int25 = mathTest0.multiply((-1042102), 27040000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10036224 + "'", int19 == 10036224);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1237 + "'", int22 == 1237);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 842349056 + "'", int25 == 842349056);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.subtract((int) (short) -1, (int) (short) 100);
        int int16 = mathTest0.square(101);
        int int19 = mathTest0.add(1990353832, (int) (byte) 0);
        int int22 = mathTest0.add((-5681), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-101) + "'", int14 == (-101));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10201 + "'", int16 == 10201);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1990353832 + "'", int19 == 1990353832);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-5681) + "'", int22 == (-5681));
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.subtract((int) '#', (int) (short) 1);
        int int17 = mathTest0.multiply(1, (-1));
        int int20 = mathTest0.add(101, (int) ' ');
        java.lang.Class<?> wildcardClass21 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 133 + "'", int20 == 133);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) ' ');
        int int12 = mathTest0.divide((int) (byte) 100, 36);
        int int15 = mathTest0.multiply(63, (-1));
        int int18 = mathTest0.subtract(0, 990);
        int int21 = mathTest0.add(1347636419, 1325028);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-63) + "'", int15 == (-63));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-990) + "'", int18 == (-990));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1348961447 + "'", int21 == 1348961447);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.add((-190), (int) '4');
        int int16 = mathTest0.square((int) 'a');
        int int19 = mathTest0.subtract((-1190), 950697);
        java.lang.Class<?> wildcardClass20 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-138) + "'", int14 == (-138));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9409 + "'", int16 == 9409);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-951887) + "'", int19 == (-951887));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int14 = mathTest0.square(0);
        int int17 = mathTest0.add(100, 203);
        int int20 = mathTest0.divide(1496089, (-13503587));
        // The following exception was thrown during execution in test generation
        try {
            int int23 = mathTest0.divide(1624886795, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Cannot divide by zero.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 303 + "'", int17 == 303);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int13 = mathTest0.square(10036224);
        java.lang.Class<?> wildcardClass14 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 219152384 + "'", int13 == 219152384);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.subtract((int) (short) 0, (int) '#');
        int int15 = mathTest0.subtract((-1), 100);
        int int18 = mathTest0.add((int) (byte) 1, (-124));
        int int21 = mathTest0.subtract((-1488), (-813));
        int int24 = mathTest0.subtract(712776862, (int) (byte) 10);
        int int27 = mathTest0.subtract(1838192896, 27426628);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-35) + "'", int12 == (-35));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-101) + "'", int15 == (-101));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-123) + "'", int18 == (-123));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-675) + "'", int21 == (-675));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 712776852 + "'", int24 == 712776852);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1810766268 + "'", int27 == 1810766268);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int13 = mathTest0.square(22500);
        int int16 = mathTest0.add((-980), 1200);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 506250000 + "'", int13 == 506250000);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 220 + "'", int16 == 220);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int5 = mathTest0.square((int) (byte) 10);
        int int7 = mathTest0.square((-101));
        int int9 = mathTest0.square(1581);
        java.lang.Class<?> wildcardClass10 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10201 + "'", int7 == 10201);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2499561 + "'", int9 == 2499561);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((-1), (-50));
        int int18 = mathTest0.add((-6476), 1962934338);
        int int21 = mathTest0.subtract((-813), 12);
        int int24 = mathTest0.subtract(1496160, (-3181));
        java.lang.Class<?> wildcardClass25 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1962927862 + "'", int18 == 1962927862);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-825) + "'", int21 == (-825));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1499341 + "'", int24 == 1499341);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(12, 100);
        int int15 = mathTest0.add(2601, (-51));
        int int18 = mathTest0.divide((-51918), 1594884096);
        java.lang.Class<?> wildcardClass19 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 112 + "'", int12 == 112);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2550 + "'", int15 == 2550);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int8 = mathTest0.square((-51));
        int int11 = mathTest0.divide((-3222), 112);
        int int14 = mathTest0.divide((-2623), (-3212));
        int int16 = mathTest0.square((-366998));
        java.lang.Class<?> wildcardClass17 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2601 + "'", int8 == 2601);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-28) + "'", int11 == (-28));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1543545828 + "'", int16 == 1543545828);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        int int20 = mathTest0.add(0, 1046);
        int int23 = mathTest0.divide(150, (-2033540108));
        int int26 = mathTest0.divide((-1563969600), 1961891178);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1046 + "'", int20 == 1046);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.add((int) (short) 1, 0);
        int int14 = mathTest0.add(51, (-3232));
        int int17 = mathTest0.add(1500625, (-6476));
        int int20 = mathTest0.multiply((-12), (-1042405));
        java.lang.Class<?> wildcardClass21 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3181) + "'", int14 == (-3181));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1494149 + "'", int17 == 1494149);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 12508860 + "'", int20 == 12508860);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.add(2092, 1494149);
        int int18 = mathTest0.add(1357853952, (-461144));
        java.lang.Class<?> wildcardClass19 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1496241 + "'", int15 == 1496241);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1357392808 + "'", int18 == 1357392808);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.add(52, 98);
        int int17 = mathTest0.add(3232, (int) 'a');
        java.lang.Class<?> wildcardClass18 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 150 + "'", int14 == 150);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3329 + "'", int17 == 3329);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((-32), 99);
        int int9 = mathTest0.divide((-3232), 51);
        int int11 = mathTest0.square(1046);
        int int13 = mathTest0.square((-50));
        int int16 = mathTest0.add(1174437540, (-66));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3168) + "'", int6 == (-3168));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-63) + "'", int9 == (-63));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1094116 + "'", int11 == 1094116);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2500 + "'", int13 == 2500);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1174437474 + "'", int16 == 1174437474);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.divide(0, 5200);
        int int14 = mathTest0.multiply((int) (short) 1, (int) (short) 10);
        int int17 = mathTest0.multiply((-3232), 10201);
        int int20 = mathTest0.divide(22500, 10445824);
        int int23 = mathTest0.multiply(999698, 0);
        int int26 = mathTest0.add(2030043136, (-845551616));
        int int29 = mathTest0.multiply(3414480, 1221323382);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-32969632) + "'", int17 == (-32969632));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1184491520 + "'", int26 == 1184491520);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1349777952) + "'", int29 == (-1349777952));
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int12 = mathTest0.subtract(144, (-66));
        int int15 = mathTest0.add((-461208), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 210 + "'", int12 == 210);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-461208) + "'", int15 == (-461208));
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((-1), (-50));
        int int18 = mathTest0.subtract(429549516, 0);
        int int20 = mathTest0.square((-30022584));
        java.lang.Class<?> wildcardClass21 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 429549516 + "'", int18 == 429549516);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 828396608 + "'", int20 == 828396608);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(12, 100);
        int int15 = mathTest0.add(2601, (-51));
        int int18 = mathTest0.divide((-51918), 1594884096);
        int int21 = mathTest0.multiply(36, (-3243));
        java.lang.Class<?> wildcardClass22 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 112 + "'", int12 == 112);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2550 + "'", int15 == 2550);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-116748) + "'", int21 == (-116748));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) ' ');
        int int12 = mathTest0.divide((int) (byte) 100, 36);
        int int15 = mathTest0.subtract(0, 3232);
        int int18 = mathTest0.divide(104060401, 3329);
        int int20 = mathTest0.square(163);
        int int23 = mathTest0.multiply((-2011846256), 36100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3232) + "'", int15 == (-3232));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 31258 + "'", int18 == 31258);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 26569 + "'", int20 == 26569);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 247133760 + "'", int23 == 247133760);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(12, 100);
        int int15 = mathTest0.add(2601, (-51));
        int int18 = mathTest0.multiply((-27036777), (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 112 + "'", int12 == 112);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2550 + "'", int15 == 2550);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-865176864) + "'", int18 == (-865176864));
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.add((int) (short) 1, 0);
        int int14 = mathTest0.add(51, (-3232));
        int int17 = mathTest0.add(1500625, (-6476));
        java.lang.Class<?> wildcardClass18 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3181) + "'", int14 == (-3181));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1494149 + "'", int17 == 1494149);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((-32), 99);
        int int9 = mathTest0.divide((-3232), 51);
        int int12 = mathTest0.subtract(34, (int) (short) 100);
        int int15 = mathTest0.divide((-13503587), (-3069));
        int int17 = mathTest0.square((-35));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3168) + "'", int6 == (-3168));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-63) + "'", int9 == (-63));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-66) + "'", int12 == (-66));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4399 + "'", int15 == 4399);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1225 + "'", int17 == 1225);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.add((int) (short) 1, (-32));
        int int12 = mathTest0.divide((-27046437), 9113164);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-31) + "'", int9 == (-31));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2) + "'", int12 == (-2));
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.divide(10201, 750);
        java.lang.Class<?> wildcardClass13 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 13 + "'", int12 == 13);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.subtract((int) (short) 0, (int) '#');
        int int15 = mathTest0.add((-101), 1024);
        int int18 = mathTest0.subtract(112, 3329);
        int int21 = mathTest0.subtract((-1086356767), (-2030043126));
        int int24 = mathTest0.multiply(1103809, 11082614);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-35) + "'", int12 == (-35));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 923 + "'", int15 == 923);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3217) + "'", int18 == (-3217));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 943686359 + "'", int21 == 943686359);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1022217718 + "'", int24 == 1022217718);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.subtract((int) '#', (int) (short) 1);
        int int17 = mathTest0.multiply(112, (-262701));
        java.lang.Class<?> wildcardClass18 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-29422512) + "'", int17 == (-29422512));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(3232, (-3168));
        int int8 = mathTest0.square((-3232));
        int int11 = mathTest0.add(29421356, 112);
        int int14 = mathTest0.add(98, (-135036));
        int int17 = mathTest0.multiply((-2030039894), (int) (byte) 10);
        java.lang.Class<?> wildcardClass18 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10445824 + "'", int8 == 10445824);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 29421468 + "'", int11 == 29421468);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-134938) + "'", int14 == (-134938));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1174437540 + "'", int17 == 1174437540);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int12 = mathTest0.add(1962934272, (-3196));
        int int15 = mathTest0.add((-1744279840), 42);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1962931076 + "'", int12 == 1962931076);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1744279798) + "'", int15 == (-1744279798));
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square((-32969632));
        int int14 = mathTest0.subtract((int) (short) 10, (-1190));
        int int17 = mathTest0.divide(750, 52229);
        int int20 = mathTest0.add((-29338412), 3307);
        java.lang.Class<?> wildcardClass21 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 541139968 + "'", int11 == 541139968);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1200 + "'", int14 == 1200);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-29335105) + "'", int20 == (-29335105));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.subtract((int) (short) 0, (int) '#');
        int int15 = mathTest0.add((-101), 1024);
        int int18 = mathTest0.subtract(112, 3329);
        int int21 = mathTest0.subtract((-1086356767), (-2030043126));
        int int24 = mathTest0.subtract((-10917), 712775872);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-35) + "'", int12 == (-35));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 923 + "'", int15 == 923);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3217) + "'", int18 == (-3217));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 943686359 + "'", int21 == 943686359);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-712786789) + "'", int24 == (-712786789));
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.subtract((int) (short) 0, (int) '#');
        int int15 = mathTest0.subtract((-1), 100);
        int int18 = mathTest0.add(5151, (-51));
        int int21 = mathTest0.divide(27040000, (-1086356767));
        java.lang.Class<?> wildcardClass22 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-35) + "'", int12 == (-35));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-101) + "'", int15 == (-101));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5100 + "'", int18 == 5100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) ' ');
        int int12 = mathTest0.divide((int) (byte) 100, 36);
        int int15 = mathTest0.multiply(63, (-1));
        int int18 = mathTest0.subtract((int) (short) 1, (-31));
        int int21 = mathTest0.subtract(10, 990);
        java.lang.Class<?> wildcardClass22 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-63) + "'", int15 == (-63));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-980) + "'", int21 == (-980));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.add((int) (short) 1, 0);
        int int14 = mathTest0.add(51, (-3232));
        int int17 = mathTest0.add(1500625, (-6476));
        int int19 = mathTest0.square(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3181) + "'", int14 == (-3181));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1494149 + "'", int17 == 1494149);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((-32), 99);
        int int9 = mathTest0.divide((-3232), 51);
        int int11 = mathTest0.square(1046);
        int int13 = mathTest0.square((-50));
        java.lang.Class<?> wildcardClass14 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3168) + "'", int6 == (-3168));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-63) + "'", int9 == (-63));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1094116 + "'", int11 == 1094116);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2500 + "'", int13 == 2500);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((-1), (-50));
        int int18 = mathTest0.divide((int) (short) -1, 163);
        int int21 = mathTest0.multiply(1336336, 29421456);
        int int23 = mathTest0.square(3329);
        int int26 = mathTest0.divide((-390241792), 10000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 820197632 + "'", int21 == 820197632);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 11082241 + "'", int23 == 11082241);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-39024) + "'", int26 == (-39024));
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square((-32969632));
        int int13 = mathTest0.square(1581);
        int int16 = mathTest0.subtract((int) (short) 10, 2030043136);
        java.lang.Class<?> wildcardClass17 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 541139968 + "'", int11 == 541139968);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2499561 + "'", int13 == 2499561);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2030043126) + "'", int16 == (-2030043126));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square((-32969632));
        int int14 = mathTest0.divide((-2033540108), 2550);
        int int17 = mathTest0.add(3414448, 32);
        int int20 = mathTest0.multiply(1515163, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 541139968 + "'", int11 == 541139968);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-797466) + "'", int14 == (-797466));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3414480 + "'", int17 == 3414480);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.subtract((int) '#', (int) (short) 1);
        int int17 = mathTest0.multiply(1, (-1));
        int int19 = mathTest0.square((-3168));
        int int22 = mathTest0.divide((-805856777), (-9449));
        java.lang.Class<?> wildcardClass23 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10036224 + "'", int19 == 10036224);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 85284 + "'", int22 == 85284);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int8 = mathTest0.square((-51));
        int int11 = mathTest0.subtract(100, (-190));
        java.lang.Class<?> wildcardClass12 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2601 + "'", int8 == 2601);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 290 + "'", int11 == 290);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(3232, (-3168));
        int int8 = mathTest0.square((-3232));
        int int11 = mathTest0.multiply((-161), 1568);
        java.lang.Class<?> wildcardClass12 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10445824 + "'", int8 == 10445824);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-252448) + "'", int11 == (-252448));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.divide((-101), 2);
        int int9 = mathTest0.multiply(101, 10);
        int int12 = mathTest0.multiply(2601, (-101));
        int int15 = mathTest0.multiply(1414081664, (-1241513984));
        java.lang.Class<?> wildcardClass16 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1010 + "'", int9 == 1010);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-262701) + "'", int12 == (-262701));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.subtract((int) '#', (int) (short) 1);
        int int17 = mathTest0.multiply(1, (-1));
        int int19 = mathTest0.square((-3168));
        int int22 = mathTest0.divide(1852038144, 1496089);
        int int25 = mathTest0.multiply(9801, (int) 'a');
        java.lang.Class<?> wildcardClass26 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10036224 + "'", int19 == 10036224);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1237 + "'", int22 == 1237);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 950697 + "'", int25 == 950697);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.subtract((int) '#', (int) (short) 1);
        int int17 = mathTest0.multiply(1, (-1));
        int int19 = mathTest0.square((-3168));
        int int22 = mathTest0.divide((-51), 3232);
        int int24 = mathTest0.square(1225);
        int int27 = mathTest0.add(36, 4353);
        int int30 = mathTest0.multiply(13689, 2550);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10036224 + "'", int19 == 10036224);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1500625 + "'", int24 == 1500625);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4389 + "'", int27 == 4389);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 34906950 + "'", int30 == 34906950);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square((-32969632));
        int int14 = mathTest0.subtract((int) (short) 10, (-1190));
        int int17 = mathTest0.divide(750, 52229);
        int int20 = mathTest0.add((-29338412), 3307);
        int int23 = mathTest0.subtract((-365052929), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 541139968 + "'", int11 == 541139968);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1200 + "'", int14 == 1200);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-29335105) + "'", int20 == (-29335105));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-365052929) + "'", int23 == (-365052929));
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.divide(1290100, (-3232));
        int int20 = mathTest0.multiply(0, 9700);
        int int23 = mathTest0.multiply((-461244), 1108809);
        int int26 = mathTest0.multiply(1481211671, (-65));
        int int29 = mathTest0.add((int) '#', (-13525933));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-399) + "'", int17 == (-399));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-330390172) + "'", int23 == (-330390172));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1789478103) + "'", int26 == (-1789478103));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-13525898) + "'", int29 == (-13525898));
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.divide(0, 5200);
        int int13 = mathTest0.square(4356);
        int int16 = mathTest0.divide((-29338412), 31);
        java.lang.Class<?> wildcardClass17 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 18974736 + "'", int13 == 18974736);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-946400) + "'", int16 == (-946400));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((-32), 99);
        int int9 = mathTest0.divide((int) (short) 0, (int) (short) 100);
        int int12 = mathTest0.add((-3295), (-3181));
        int int15 = mathTest0.add(0, 1346542369);
        int int17 = mathTest0.square(18948609);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3168) + "'", int6 == (-3168));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6476) + "'", int12 == (-6476));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1346542369 + "'", int15 == 1346542369);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-892976127) + "'", int17 == (-892976127));
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.divide(0, 5200);
        int int14 = mathTest0.multiply((int) (short) 1, (int) (short) 10);
        int int17 = mathTest0.multiply((-3232), 10201);
        int int20 = mathTest0.subtract(63, (-990));
        int int23 = mathTest0.subtract((-134969936), (-109));
        int int26 = mathTest0.subtract((-9449), (-14756608));
        int int29 = mathTest0.subtract(5151, (-963545038));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-32969632) + "'", int17 == (-32969632));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1053 + "'", int20 == 1053);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-134969827) + "'", int23 == (-134969827));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 14747159 + "'", int26 == 14747159);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 963550189 + "'", int29 == 963550189);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        mathTest mathTest0 = new mathTest();
        int int2 = mathTest0.square((-101));
        int int5 = mathTest0.multiply(0, 1024);
        int int7 = mathTest0.square((-27037278));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10201 + "'", int2 == 10201);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1917031804) + "'", int7 == (-1917031804));
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.multiply(2500, (-51));
        int int9 = mathTest0.subtract((-1042102), 596318976);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-127500) + "'", int6 == (-127500));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-597361078) + "'", int9 == (-597361078));
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) ' ');
        int int12 = mathTest0.divide((int) (byte) 100, 36);
        int int15 = mathTest0.subtract(0, 3232);
        int int18 = mathTest0.multiply(1961891178, (-1838192896));
        int int21 = mathTest0.divide(1414081664, 1108809);
        int int24 = mathTest0.add(22500, 28751656);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3232) + "'", int15 == (-3232));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1435739648 + "'", int18 == 1435739648);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1275 + "'", int21 == 1275);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 28774156 + "'", int24 == 28774156);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.divide((-101), 2);
        int int9 = mathTest0.divide((-65), 10005);
        int int12 = mathTest0.divide((-953401000), 218028);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-4372) + "'", int12 == (-4372));
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        mathTest mathTest0 = new mathTest();
        int int2 = mathTest0.square((-101));
        int int5 = mathTest0.multiply(0, 1024);
        int int8 = mathTest0.divide((-461244), 11612725);
        int int11 = mathTest0.divide(115, 1325028);
        int int14 = mathTest0.add((-13), 11082582);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10201 + "'", int2 == 10201);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11082569 + "'", int14 == 11082569);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.divide(1290100, (-3232));
        int int20 = mathTest0.divide((-6476), 34);
        int int23 = mathTest0.divide((int) (short) 1, (-5073684));
        int int26 = mathTest0.multiply(28751656, 923);
        int int29 = mathTest0.multiply(18948609, (-584742523));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-399) + "'", int17 == (-399));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-190) + "'", int20 == (-190));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 767974712 + "'", int26 == 767974712);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 411972485 + "'", int29 == 411972485);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int11 = mathTest0.square(3232);
        int int14 = mathTest0.divide((-32), (int) (short) 1);
        int int17 = mathTest0.add(36, 1010);
        int int20 = mathTest0.divide((-51), (-1740241));
        int int23 = mathTest0.add((-170769751), (-805856915));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10445824 + "'", int11 == 10445824);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-32) + "'", int14 == (-32));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1046 + "'", int17 == 1046);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-976626666) + "'", int23 == (-976626666));
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square(5200);
        int int14 = mathTest0.multiply((-7), 13);
        int int17 = mathTest0.multiply((-27034267), (-13));
        int int19 = mathTest0.square((-27046437));
        int int22 = mathTest0.multiply((-3364195), 15036876);
        int int25 = mathTest0.add((-810437336), 3045332);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27040000 + "'", int11 == 27040000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-91) + "'", int14 == (-91));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 351445471 + "'", int17 == 351445471);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-485525159) + "'", int19 == (-485525159));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-858242532) + "'", int22 == (-858242532));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-807392004) + "'", int25 == (-807392004));
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) ' ');
        int int12 = mathTest0.divide((int) (byte) 100, 36);
        int int15 = mathTest0.multiply(63, (-1));
        int int18 = mathTest0.multiply(3299872, 1867490);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-63) + "'", int15 == (-63));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-800108480) + "'", int18 == (-800108480));
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.divide((-101), 2);
        int int9 = mathTest0.multiply(101, 10);
        int int12 = mathTest0.divide(176203232, 11082582);
        int int15 = mathTest0.divide((-61), 1700859166);
        java.lang.Class<?> wildcardClass16 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1010 + "'", int9 == 1010);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.add((int) (byte) -1, (int) '4');
        int int12 = mathTest0.multiply((int) 'a', (int) (short) 100);
        int int14 = mathTest0.square(219152384);
        int int17 = mathTest0.divide(133, (-50));
        int int20 = mathTest0.multiply(2, 0);
        java.lang.Class<?> wildcardClass21 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9700 + "'", int12 == 9700);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-2) + "'", int17 == (-2));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.subtract((int) (short) 0, (int) '#');
        int int15 = mathTest0.add((-50960), 963550189);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-35) + "'", int12 == (-35));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 963499229 + "'", int15 == 963499229);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((int) (short) -1, 36);
        int int18 = mathTest0.divide((-1488), 112);
        int int21 = mathTest0.add(29421356, (int) (byte) 100);
        int int24 = mathTest0.divide(64, (-3168));
        int int26 = mathTest0.square(1414081664);
        int int29 = mathTest0.subtract((-570562480), (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-13) + "'", int18 == (-13));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 29421456 + "'", int21 == 29421456);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1757167616 + "'", int26 == 1757167616);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-570562577) + "'", int29 == (-570562577));
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(3232, (-3168));
        int int8 = mathTest0.square((-3232));
        int int11 = mathTest0.add(29421356, 112);
        int int14 = mathTest0.subtract((int) '#', 1225);
        java.lang.Class<?> wildcardClass15 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10445824 + "'", int8 == 10445824);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 29421468 + "'", int11 == 29421468);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1190) + "'", int14 == (-1190));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((-1), (-50));
        int int18 = mathTest0.divide((int) (short) -1, 163);
        int int21 = mathTest0.subtract(1496089, (-71));
        int int24 = mathTest0.subtract(29175, 40092);
        int int26 = mathTest0.square((-1505));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1496160 + "'", int21 == 1496160);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-10917) + "'", int24 == (-10917));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2265025 + "'", int26 == 2265025);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        int int20 = mathTest0.multiply((int) (short) 10, 99);
        int int23 = mathTest0.multiply((-5073684), (-27036766));
        int int26 = mathTest0.add(429549516, 3414448);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 990 + "'", int20 == 990);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-953401000) + "'", int23 == (-953401000));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 432963964 + "'", int26 == 432963964);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.add((-1631068032), (-1042102));
        int int12 = mathTest0.subtract(71824, (-1740241));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1632110134) + "'", int9 == (-1632110134));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1812065 + "'", int12 == 1812065);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int11 = mathTest0.square(3232);
        int int14 = mathTest0.divide((-32), (int) (short) 1);
        int int17 = mathTest0.add(36, 1010);
        int int20 = mathTest0.multiply((-1544804416), 2704);
        int int22 = mathTest0.square((-6));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10445824 + "'", int11 == 10445824);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-32) + "'", int14 == (-32));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1046 + "'", int17 == 1046);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1852038144 + "'", int20 == 1852038144);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 36 + "'", int22 == 36);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.subtract((int) (short) 0, (int) '#');
        int int15 = mathTest0.subtract((-1), 100);
        int int18 = mathTest0.divide((-1827683456), 18352);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-35) + "'", int12 == (-35));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-101) + "'", int15 == (-101));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-99590) + "'", int18 == (-99590));
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(5200, (-341));
        int int20 = mathTest0.divide(150, (-183));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5541 + "'", int17 == 5541);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) ' ');
        int int12 = mathTest0.divide((int) (byte) 100, 36);
        int int15 = mathTest0.divide(0, (-1));
        int int18 = mathTest0.divide((-892976127), 2499561);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-357) + "'", int18 == (-357));
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) ' ');
        int int12 = mathTest0.divide((int) (byte) 100, 36);
        int int15 = mathTest0.multiply(63, (-1));
        int int18 = mathTest0.subtract(0, 990);
        int int20 = mathTest0.square((-40385895));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-63) + "'", int15 == (-63));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-990) + "'", int18 == (-990));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1905639567) + "'", int20 == (-1905639567));
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.divide((-101), 2);
        int int9 = mathTest0.multiply(101, 10);
        int int12 = mathTest0.multiply(1334311154, 1334646608);
        int int15 = mathTest0.add(3084, (-364053244));
        java.lang.Class<?> wildcardClass16 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1010 + "'", int9 == 1010);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-584742496) + "'", int12 == (-584742496));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-364050160) + "'", int15 == (-364050160));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.divide((-290), 1892067732);
        int int9 = mathTest0.add((-805857024), 163);
        java.lang.Class<?> wildcardClass10 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-805856861) + "'", int9 == (-805856861));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        mathTest mathTest0 = new mathTest();
        int int2 = mathTest0.square((-101));
        int int5 = mathTest0.divide((int) (short) 10, (-31));
        int int8 = mathTest0.divide(0, 63);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10201 + "'", int2 == 10201);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.divide(0, 5200);
        int int14 = mathTest0.multiply((int) (short) 1, (int) (short) 10);
        int int17 = mathTest0.multiply((-3232), 10201);
        int int20 = mathTest0.subtract(63, (-990));
        int int23 = mathTest0.multiply(2500, 1594884096);
        java.lang.Class<?> wildcardClass24 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-32969632) + "'", int17 == (-32969632));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1053 + "'", int20 == 1053);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1480589312 + "'", int23 == 1480589312);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int11 = mathTest0.square(3232);
        int int14 = mathTest0.divide((-32), (int) (short) 1);
        int int17 = mathTest0.add(36, 1010);
        int int20 = mathTest0.add((-2030043126), 3232);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = mathTest0.divide(1065108889, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Cannot divide by zero.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10445824 + "'", int11 == 10445824);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-32) + "'", int14 == (-32));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1046 + "'", int17 == 1046);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-2030039894) + "'", int20 == (-2030039894));
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.divide((-101), 2);
        int int8 = mathTest0.square(1849);
        int int11 = mathTest0.multiply(9114210, 1496160);
        int int14 = mathTest0.divide(31258, 176203232);
        int int17 = mathTest0.subtract((-5073684), 541139968);
        int int20 = mathTest0.divide((-1065096738), 1667);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3418801 + "'", int8 == 3418801);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-204731200) + "'", int11 == (-204731200));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-546213652) + "'", int17 == (-546213652));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-638930) + "'", int20 == (-638930));
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.multiply(101, 51);
        int int17 = mathTest0.multiply(34, (-50960));
        int int19 = mathTest0.square(101);
        int int21 = mathTest0.square(163);
        int int24 = mathTest0.multiply((-30022584), 219152384);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5151 + "'", int14 == 5151);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1732640) + "'", int17 == (-1732640));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10201 + "'", int19 == 10201);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 26569 + "'", int21 == 26569);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-327155712) + "'", int24 == (-327155712));
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.multiply(101, 51);
        int int17 = mathTest0.multiply(34, (-50960));
        int int19 = mathTest0.square(101);
        int int22 = mathTest0.multiply((-65), (-3212));
        int int25 = mathTest0.multiply(150, 0);
        java.lang.Class<?> wildcardClass26 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5151 + "'", int14 == 5151);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1732640) + "'", int17 == (-1732640));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10201 + "'", int19 == 10201);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 208780 + "'", int22 == 208780);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int5 = mathTest0.square((int) (byte) 10);
        int int7 = mathTest0.square((-101));
        int int9 = mathTest0.square(1581);
        int int12 = mathTest0.divide(290, (-10333621));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10201 + "'", int7 == 10201);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2499561 + "'", int9 == 2499561);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.divide(0, 5200);
        int int14 = mathTest0.multiply((int) (short) 1, (int) (short) 10);
        int int17 = mathTest0.multiply((-3232), 10201);
        int int20 = mathTest0.subtract(63, (-990));
        int int23 = mathTest0.subtract((-134969936), (-109));
        int int26 = mathTest0.add(11082582, 32721228);
        int int29 = mathTest0.multiply((-27036576), 1094050);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = mathTest0.divide(109330155, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Cannot divide by zero.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-32969632) + "'", int17 == (-32969632));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1053 + "'", int20 == 1053);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-134969827) + "'", int23 == (-134969827));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 43803810 + "'", int26 == 43803810);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 73794752 + "'", int29 == 73794752);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int8 = mathTest0.square((-51));
        int int11 = mathTest0.divide((-3222), 112);
        int int14 = mathTest0.multiply(1, (-134969936));
        int int16 = mathTest0.square(134966615);
        int int19 = mathTest0.multiply((int) (byte) 0, 1962927862);
        int int21 = mathTest0.square((-38));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2601 + "'", int8 == 2601);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-28) + "'", int11 == (-28));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-134969936) + "'", int14 == (-134969936));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 70071185 + "'", int16 == 70071185);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1444 + "'", int21 == 1444);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(12, 100);
        int int15 = mathTest0.add(2601, (-51));
        int int18 = mathTest0.divide(1881653649, 34);
        int int21 = mathTest0.subtract((-976626666), 1192151552);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 112 + "'", int12 == 112);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2550 + "'", int15 == 2550);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 55342754 + "'", int18 == 55342754);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2126189078 + "'", int21 == 2126189078);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        int int20 = mathTest0.add(1357853952, (-1081));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1357852871 + "'", int20 == 1357852871);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.subtract((int) (short) -1, (int) (short) 100);
        int int16 = mathTest0.square(101);
        int int19 = mathTest0.add(1990353832, (int) (byte) 0);
        java.lang.Class<?> wildcardClass20 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-101) + "'", int14 == (-101));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10201 + "'", int16 == 10201);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1990353832 + "'", int19 == 1990353832);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.divide(0, 5200);
        int int13 = mathTest0.square((int) (short) 0);
        int int16 = mathTest0.subtract(16318464, 1281588);
        int int19 = mathTest0.subtract((-27037278), 29793758);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 15036876 + "'", int16 == 15036876);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-56831036) + "'", int19 == (-56831036));
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int14 = mathTest0.square(0);
        int int17 = mathTest0.add(100, 203);
        int int19 = mathTest0.square(3414480);
        int int22 = mathTest0.add(218028, (-66));
        java.lang.Class<?> wildcardClass23 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 303 + "'", int17 == 303);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2132429056 + "'", int19 == 2132429056);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 217962 + "'", int22 == 217962);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.subtract((int) '#', (int) (short) 1);
        int int17 = mathTest0.multiply(1, (-1));
        int int19 = mathTest0.square((-3168));
        int int22 = mathTest0.divide((-51), 3232);
        int int25 = mathTest0.divide(1437107200, 9700);
        int int28 = mathTest0.multiply(820197632, (-35));
        int int31 = mathTest0.multiply((-1081), (-51));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10036224 + "'", int19 == 10036224);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 148155 + "'", int25 == 148155);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1357853952 + "'", int28 == 1357853952);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 55131 + "'", int31 == 55131);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((int) (short) -1, 36);
        int int18 = mathTest0.divide((-1488), 112);
        int int21 = mathTest0.add(29421356, (int) (byte) 100);
        int int24 = mathTest0.divide(64, (-3168));
        int int27 = mathTest0.add((int) (short) -1, (-1735140));
        int int30 = mathTest0.add((-32), (-134974868));
        int int32 = mathTest0.square((-1022));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-13) + "'", int18 == (-13));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 29421456 + "'", int21 == 29421456);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1735141) + "'", int27 == (-1735141));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-134974900) + "'", int30 == (-134974900));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1044484 + "'", int32 == 1044484);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square(5200);
        int int14 = mathTest0.multiply((-7), 13);
        int int17 = mathTest0.multiply((-27034267), (-13));
        int int19 = mathTest0.square((-27046437));
        int int22 = mathTest0.multiply((-3364195), 15036876);
        java.lang.Class<?> wildcardClass23 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27040000 + "'", int11 == 27040000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-91) + "'", int14 == (-91));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 351445471 + "'", int17 == 351445471);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-485525159) + "'", int19 == (-485525159));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-858242532) + "'", int22 == (-858242532));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int11 = mathTest0.square(3232);
        int int14 = mathTest0.divide((-32), (int) (short) 1);
        int int17 = mathTest0.add(36, 1010);
        int int19 = mathTest0.square(2);
        int int22 = mathTest0.divide((-2088586791), 1325028);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10445824 + "'", int11 == 10445824);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-32) + "'", int14 == (-32));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1046 + "'", int17 == 1046);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1576) + "'", int22 == (-1576));
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) ' ');
        int int12 = mathTest0.divide((int) (byte) 100, 36);
        int int15 = mathTest0.multiply(63, (-1));
        int int18 = mathTest0.subtract(0, 990);
        int int21 = mathTest0.add((-1328271), 10445824);
        int int23 = mathTest0.square((-40385895));
        int int26 = mathTest0.multiply(144, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-63) + "'", int15 == (-63));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-990) + "'", int18 == (-990));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9117553 + "'", int21 == 9117553);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1905639567) + "'", int23 == (-1905639567));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1440 + "'", int26 == 1440);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((-32), 99);
        int int9 = mathTest0.divide((-3232), 51);
        int int12 = mathTest0.subtract(34, (int) (short) 100);
        int int14 = mathTest0.square((-3535));
        int int16 = mathTest0.square((-1962934273));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3168) + "'", int6 == (-3168));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-63) + "'", int9 == (-63));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-66) + "'", int12 == (-66));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 12496225 + "'", int14 == 12496225);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-369098751) + "'", int16 == (-369098751));
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        mathTest mathTest0 = new mathTest();
        int int2 = mathTest0.square((-101));
        int int5 = mathTest0.multiply(1594884096, (-29422512));
        int int8 = mathTest0.divide((-32969632), (-3295));
        int int11 = mathTest0.divide(2499561, 3329);
        int int14 = mathTest0.divide(1184491520, (-461240));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10201 + "'", int2 == 10201);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1962934272 + "'", int5 == 1962934272);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10005 + "'", int8 == 10005);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 750 + "'", int11 == 750);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-2568) + "'", int14 == (-2568));
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((-1), (-50));
        int int18 = mathTest0.add((-6476), 1962934338);
        int int21 = mathTest0.divide((-341), (-13503587));
        int int24 = mathTest0.subtract((-1735140), 4353);
        int int27 = mathTest0.divide(546218051, (-1905639567));
        int int30 = mathTest0.subtract(43, (-38228));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1962927862 + "'", int18 == 1962927862);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1739493) + "'", int24 == (-1739493));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 38271 + "'", int30 == 38271);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.divide((-101), 2);
        int int9 = mathTest0.multiply(101, 10);
        int int12 = mathTest0.multiply(1334311154, 1334646608);
        int int15 = mathTest0.subtract((-2623), 4399);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1010 + "'", int9 == 1010);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-584742496) + "'", int12 == (-584742496));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7022) + "'", int15 == (-7022));
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.subtract((int) '#', (int) (short) 1);
        int int17 = mathTest0.multiply(1, (-1));
        int int19 = mathTest0.square((-3168));
        int int22 = mathTest0.divide((-51), 3232);
        int int24 = mathTest0.square(1225);
        int int26 = mathTest0.square((-8));
        int int29 = mathTest0.subtract(1568, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10036224 + "'", int19 == 10036224);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1500625 + "'", int24 == 1500625);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 64 + "'", int26 == 64);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1568 + "'", int29 == 1568);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int5 = mathTest0.square((int) (byte) 10);
        int int7 = mathTest0.square(51);
        int int9 = mathTest0.square((-13503600));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2601 + "'", int7 == 2601);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 81441024 + "'", int9 == 81441024);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.add((int) (short) 1, 0);
        int int14 = mathTest0.multiply((-399), 1156);
        int int17 = mathTest0.divide(148155, 52);
        int int20 = mathTest0.add((-109), 1496152);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-461244) + "'", int14 == (-461244));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2849 + "'", int17 == 2849);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1496043 + "'", int20 == 1496043);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.subtract((int) '4', (int) (byte) 10);
        int int17 = mathTest0.divide((-953401000), 29175);
        int int20 = mathTest0.add((-9669), 1262559999);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 42 + "'", int14 == 42);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-32678) + "'", int17 == (-32678));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1262550330 + "'", int20 == 1262550330);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.subtract((int) (short) -1, (int) (short) 100);
        int int17 = mathTest0.multiply((-399), (int) (byte) 10);
        int int20 = mathTest0.add((-31), (-12));
        int int23 = mathTest0.divide(4700, (-1190));
        int int26 = mathTest0.divide(1581, (-4222));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-101) + "'", int14 == (-101));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-3990) + "'", int17 == (-3990));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-43) + "'", int20 == (-43));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-3) + "'", int23 == (-3));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.subtract((int) '#', (int) (short) 1);
        int int17 = mathTest0.multiply(1, (-1));
        int int19 = mathTest0.square((-3168));
        int int22 = mathTest0.divide((-51), 3232);
        int int25 = mathTest0.divide(1437107200, 9700);
        int int28 = mathTest0.multiply(820197632, (-35));
        int int31 = mathTest0.add(97960800, 1892067732);
        int int34 = mathTest0.subtract((-845551616), (-31));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10036224 + "'", int19 == 10036224);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 148155 + "'", int25 == 148155);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1357853952 + "'", int28 == 1357853952);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1990028532 + "'", int31 == 1990028532);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-845551585) + "'", int34 == (-845551585));
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int13 = mathTest0.square(10036224);
        int int16 = mathTest0.multiply(1336336, (-1156));
        int int19 = mathTest0.subtract((-1515163), 18974736);
        int int21 = mathTest0.square((-990));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 219152384 + "'", int13 == 219152384);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1544804416) + "'", int16 == (-1544804416));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-20489899) + "'", int19 == (-20489899));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 980100 + "'", int21 == 980100);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int5 = mathTest0.square((-1735140));
        int int8 = mathTest0.add(1262559999, (-1768714752));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-61254896) + "'", int5 == (-61254896));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-506154753) + "'", int8 == (-506154753));
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) ' ');
        int int12 = mathTest0.add((-1042102), 1000500);
        int int15 = mathTest0.add((-161), (-109));
        int int18 = mathTest0.divide((-1827683456), 12496225);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-41602) + "'", int12 == (-41602));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-270) + "'", int15 == (-270));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-146) + "'", int18 == (-146));
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.divide(0, 5200);
        int int13 = mathTest0.square(150);
        int int16 = mathTest0.multiply(0, 1208040860);
        java.lang.Class<?> wildcardClass17 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 22500 + "'", int13 == 22500);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.subtract((int) (short) 0, (int) '#');
        int int15 = mathTest0.subtract((-3243), (-1328271));
        java.lang.Class<?> wildcardClass16 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-35) + "'", int12 == (-35));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1325028 + "'", int15 == 1325028);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((int) (short) -1, 36);
        int int17 = mathTest0.square((-66));
        java.lang.Class<?> wildcardClass18 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4356 + "'", int17 == 4356);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.subtract((int) (short) 0, (int) '#');
        int int15 = mathTest0.add((-101), 1024);
        int int18 = mathTest0.subtract((-805857024), (-109));
        int int21 = mathTest0.multiply(1041887, 1594888796);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-35) + "'", int12 == (-35));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 923 + "'", int15 == 923);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-805856915) + "'", int18 == (-805856915));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1120946724 + "'", int21 == 1120946724);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((-32), 99);
        int int9 = mathTest0.divide((-3232), 51);
        int int12 = mathTest0.subtract((-807392004), (-375664945));
        int int15 = mathTest0.add(1581, 3414480);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3168) + "'", int6 == (-3168));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-63) + "'", int9 == (-63));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-431727059) + "'", int12 == (-431727059));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3416061 + "'", int15 == 3416061);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.subtract((int) '#', (int) (short) 100);
        int int12 = mathTest0.divide(0, (-1021));
        int int14 = mathTest0.square((int) (byte) 10);
        int int17 = mathTest0.multiply(17689, 10036224);
        int int20 = mathTest0.multiply(1290100, 3307);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-65) + "'", int9 == (-65));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1437107200 + "'", int17 == 1437107200);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-28606596) + "'", int20 == (-28606596));
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((-32), 99);
        int int9 = mathTest0.divide((-3232), 51);
        int int11 = mathTest0.square(1046);
        int int13 = mathTest0.square(950697);
        java.lang.Class<?> wildcardClass14 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3168) + "'", int6 == (-3168));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-63) + "'", int9 == (-63));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1094116 + "'", int11 == 1094116);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1881653649 + "'", int13 == 1881653649);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.add((-3181), (int) 'a');
        int int16 = mathTest0.square((-5073684));
        java.lang.Class<?> wildcardClass17 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3084) + "'", int14 == (-3084));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1764640368) + "'", int16 == (-1764640368));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        mathTest mathTest0 = new mathTest();
        int int2 = mathTest0.square((-101));
        int int5 = mathTest0.multiply(1594884096, (-29422512));
        int int8 = mathTest0.divide((-32969632), (-3295));
        int int11 = mathTest0.divide(2499561, 3329);
        int int14 = mathTest0.add(27426628, 1962924603);
        int int17 = mathTest0.multiply(11082241, 923);
        java.lang.Class<?> wildcardClass18 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10201 + "'", int2 == 10201);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1962934272 + "'", int5 == 1962934272);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10005 + "'", int8 == 10005);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 750 + "'", int11 == 750);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1990351231 + "'", int14 == 1990351231);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1638973851 + "'", int17 == 1638973851);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        mathTest mathTest0 = new mathTest();
        int int2 = mathTest0.square(0);
        int int5 = mathTest0.multiply(0, (-1576));
        int int8 = mathTest0.add(599383088, (-33116283));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 566266805 + "'", int8 == 566266805);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((int) (short) -1, 36);
        int int18 = mathTest0.multiply((-51), (-31));
        int int20 = mathTest0.square(1331441);
        int int23 = mathTest0.add((-1488), (-2006027200));
        int int25 = mathTest0.square((-134969936));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1581 + "'", int18 == 1581);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1086356767) + "'", int20 == (-1086356767));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-2006028688) + "'", int23 == (-2006028688));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1118807808) + "'", int25 == (-1118807808));
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.add(100, (int) (short) 1);
        int int9 = mathTest0.subtract(0, 0);
        int int11 = mathTest0.square(12);
        int int14 = mathTest0.subtract((-1156), (-29422512));
        int int17 = mathTest0.divide(100, 842501840);
        int int20 = mathTest0.multiply(203, 1046);
        int int23 = mathTest0.multiply((-3232), (-1021));
        int int26 = mathTest0.add((-1653863424), (-1081));
        int int29 = mathTest0.subtract(40092, (-29422512));
        java.lang.Class<?> wildcardClass30 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 144 + "'", int11 == 144);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29421356 + "'", int14 == 29421356);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 212338 + "'", int20 == 212338);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3299872 + "'", int23 == 3299872);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1653864505) + "'", int26 == (-1653864505));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 29462604 + "'", int29 == 29462604);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(3232, (-3168));
        int int8 = mathTest0.square((-3232));
        int int11 = mathTest0.add(29421356, 112);
        int int14 = mathTest0.add(98, (-135036));
        int int17 = mathTest0.subtract((-5486), 461828740);
        java.lang.Class<?> wildcardClass18 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10445824 + "'", int8 == 10445824);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 29421468 + "'", int11 == 29421468);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-134938) + "'", int14 == (-134938));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-461834226) + "'", int17 == (-461834226));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((-1), (-50));
        int int18 = mathTest0.add((-6476), 1962934338);
        int int21 = mathTest0.subtract((-813), 12);
        int int24 = mathTest0.divide(10036252, 9801);
        int int27 = mathTest0.add(210, (-28));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1962927862 + "'", int18 == 1962927862);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-825) + "'", int21 == (-825));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1024 + "'", int24 == 1024);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 182 + "'", int27 == 182);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int5 = mathTest0.square((int) (byte) 10);
        int int8 = mathTest0.add((-1488), 3190);
        int int11 = mathTest0.multiply((-1042405), 2500);
        java.lang.Class<?> wildcardClass12 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1702 + "'", int8 == 1702);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1688954796 + "'", int11 == 1688954796);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.add((int) (short) 1, 0);
        int int14 = mathTest0.add(51, (-3232));
        int int17 = mathTest0.add(1500625, (-6476));
        int int20 = mathTest0.multiply((-12), (-1042405));
        int int23 = mathTest0.subtract(11082241, (-1042405));
        java.lang.Class<?> wildcardClass24 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3181) + "'", int14 == (-3181));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1494149 + "'", int17 == 1494149);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 12508860 + "'", int20 == 12508860);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 12124646 + "'", int23 == 12124646);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(12, 100);
        int int15 = mathTest0.subtract(0, (-1156));
        int int18 = mathTest0.subtract((-1), 2048);
        int int21 = mathTest0.subtract((-601128), 29421456);
        int int23 = mathTest0.square((-1086356767));
        int int26 = mathTest0.multiply(3364195, (-94292389));
        java.lang.Class<?> wildcardClass27 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 112 + "'", int12 == 112);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1156 + "'", int15 == 1156);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2049) + "'", int18 == (-2049));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-30022584) + "'", int21 == (-30022584));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1806125505 + "'", int23 == 1806125505);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-289063887) + "'", int26 == (-289063887));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.add(52, 98);
        int int17 = mathTest0.add(3232, (int) 'a');
        int int19 = mathTest0.square(4189);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 150 + "'", int14 == 150);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3329 + "'", int17 == 3329);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 17547721 + "'", int19 == 17547721);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.divide(1290100, (-3232));
        int int20 = mathTest0.divide((-6476), 34);
        int int23 = mathTest0.divide((int) (short) 1, (-5073684));
        int int26 = mathTest0.multiply(28751656, 923);
        int int29 = mathTest0.add(205537, 2126189078);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-399) + "'", int17 == (-399));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-190) + "'", int20 == (-190));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 767974712 + "'", int26 == 767974712);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2126394615 + "'", int29 == 2126394615);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(12, 100);
        int int15 = mathTest0.subtract(0, (-1156));
        int int18 = mathTest0.subtract((-1), 2048);
        int int21 = mathTest0.subtract((-601128), 29421456);
        int int23 = mathTest0.square((-1086356767));
        java.lang.Class<?> wildcardClass24 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 112 + "'", int12 == 112);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1156 + "'", int15 == 1156);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2049) + "'", int18 == (-2049));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-30022584) + "'", int21 == (-30022584));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1806125505 + "'", int23 == 1806125505);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.subtract((int) '#', (int) (short) 1);
        int int17 = mathTest0.multiply(1, (-1));
        int int20 = mathTest0.divide(5200, (-35));
        int int23 = mathTest0.subtract(176203232, (-1086356767));
        int int26 = mathTest0.divide((-27036603), (-399));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-148) + "'", int20 == (-148));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1262559999 + "'", int23 == 1262559999);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 67760 + "'", int26 == 67760);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        mathTest mathTest0 = new mathTest();
        int int2 = mathTest0.square((-101));
        int int5 = mathTest0.multiply(1594884096, (-29422512));
        int int8 = mathTest0.divide((-32969632), (-3295));
        int int11 = mathTest0.divide(2499561, 3329);
        int int14 = mathTest0.add(27426628, 1962924603);
        int int17 = mathTest0.add(4858344, 1444);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10201 + "'", int2 == 10201);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1962934272 + "'", int5 == 1962934272);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10005 + "'", int8 == 10005);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 750 + "'", int11 == 750);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1990351231 + "'", int14 == 1990351231);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4859788 + "'", int17 == 4859788);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square((-32969632));
        int int14 = mathTest0.divide(4353, (-124));
        int int17 = mathTest0.divide(3299872, (-461834226));
        java.lang.Class<?> wildcardClass18 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 541139968 + "'", int11 == 541139968);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-35) + "'", int14 == (-35));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.multiply((-946400), 1962931076);
        int int15 = mathTest0.subtract(4858344, 263609);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1414081664 + "'", int12 == 1414081664);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4594735 + "'", int15 == 4594735);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.add((int) (byte) -1, (int) '4');
        int int12 = mathTest0.multiply((int) 'a', (int) (short) 100);
        int int14 = mathTest0.square(219152384);
        int int17 = mathTest0.divide(133, (-50));
        int int20 = mathTest0.add(0, (-3181));
        int int23 = mathTest0.divide((-295593424), (-3364195));
        java.lang.Class<?> wildcardClass24 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9700 + "'", int12 == 9700);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-2) + "'", int17 == (-2));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-3181) + "'", int20 == (-3181));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 87 + "'", int23 == 87);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.subtract((int) '#', (int) (short) 1);
        int int17 = mathTest0.multiply(1, (-1));
        int int19 = mathTest0.square((-3168));
        int int22 = mathTest0.multiply((-66), (int) (short) 100);
        int int24 = mathTest0.square((-2));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10036224 + "'", int19 == 10036224);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-6600) + "'", int22 == (-6600));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.multiply(101, 51);
        int int17 = mathTest0.multiply(34, (-50960));
        int int19 = mathTest0.square(101);
        int int21 = mathTest0.square(163);
        int int24 = mathTest0.multiply((-953401000), 1000500);
        int int26 = mathTest0.square(1924149248);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5151 + "'", int14 == 5151);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1732640) + "'", int17 == (-1732640));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10201 + "'", int19 == 10201);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 26569 + "'", int21 == 26569);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 176203232 + "'", int24 == 176203232);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 150994944 + "'", int26 == 150994944);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(12, 100);
        int int15 = mathTest0.add(2601, (-51));
        int int18 = mathTest0.divide((-51918), 1594884096);
        int int21 = mathTest0.multiply(36, (-3243));
        int int24 = mathTest0.add((-1488), (-27046437));
        int int27 = mathTest0.divide(0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 112 + "'", int12 == 112);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2550 + "'", int15 == 2550);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-116748) + "'", int21 == (-116748));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-27047925) + "'", int24 == (-27047925));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int5 = mathTest0.square((int) (byte) 10);
        int int7 = mathTest0.square((-101));
        int int10 = mathTest0.multiply(3329, (-399));
        int int13 = mathTest0.multiply((-101), 1336336);
        int int16 = mathTest0.divide((-648771056), (-805856915));
        java.lang.Class<?> wildcardClass17 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10201 + "'", int7 == 10201);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1328271) + "'", int10 == (-1328271));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-134969936) + "'", int13 == (-134969936));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.subtract((int) (short) -1, (int) (short) 100);
        int int17 = mathTest0.divide(1, 100);
        int int20 = mathTest0.divide(11161, 1499341);
        java.lang.Class<?> wildcardClass21 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-101) + "'", int14 == (-101));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.subtract((int) (short) 0, (int) '#');
        int int15 = mathTest0.subtract((-1), 100);
        int int18 = mathTest0.add((int) (byte) 1, (-124));
        int int21 = mathTest0.subtract(4399, (-546213652));
        int int24 = mathTest0.subtract(1515163, 1990028532);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-35) + "'", int12 == (-35));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-101) + "'", int15 == (-101));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-123) + "'", int18 == (-123));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 546218051 + "'", int21 == 546218051);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1988513369) + "'", int24 == (-1988513369));
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.subtract((int) (short) 0, (int) '#');
        int int15 = mathTest0.subtract((-1), 100);
        int int18 = mathTest0.add(5151, (-51));
        int int21 = mathTest0.multiply((-2), (-65));
        int int24 = mathTest0.divide(32, 17960388);
        int int27 = mathTest0.add(1192151552, 4700);
        java.lang.Class<?> wildcardClass28 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-35) + "'", int12 == (-35));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-101) + "'", int15 == (-101));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5100 + "'", int18 == 5100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 130 + "'", int21 == 130);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1192156252 + "'", int27 == 1192156252);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(12, 100);
        int int15 = mathTest0.multiply(2, 1046);
        int int17 = mathTest0.square(13516830);
        int int20 = mathTest0.subtract(842501840, (-461834226));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 112 + "'", int12 == 112);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2092 + "'", int15 == 2092);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1079444356 + "'", int17 == 1079444356);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1304336066 + "'", int20 == 1304336066);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int11 = mathTest0.square(3232);
        int int14 = mathTest0.divide((-32), (int) (short) 1);
        int int17 = mathTest0.add(36, 1010);
        int int20 = mathTest0.multiply((-1544804416), 2704);
        int int22 = mathTest0.square((-584742523));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10445824 + "'", int11 == 10445824);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-32) + "'", int14 == (-32));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1046 + "'", int17 == 1046);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1852038144 + "'", int20 == 1852038144);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1403936999) + "'", int22 == (-1403936999));
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.subtract((int) '#', (int) (short) 100);
        int int12 = mathTest0.divide(0, (-1021));
        int int14 = mathTest0.square((int) (byte) 10);
        int int17 = mathTest0.subtract(1024, 11612725);
        int int20 = mathTest0.divide((-124), 1237);
        int int22 = mathTest0.square(1496089);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-65) + "'", int9 == (-65));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-11611701) + "'", int17 == (-11611701));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 604334705 + "'", int22 == 604334705);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int8 = mathTest0.square((-51));
        int int11 = mathTest0.divide((-3222), 112);
        int int14 = mathTest0.multiply(1, (-134969936));
        int int17 = mathTest0.multiply(2030043136, (-134938));
        int int20 = mathTest0.add(2500, (-27036767));
        int int23 = mathTest0.divide(0, (-1155294720));
        java.lang.Class<?> wildcardClass24 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2601 + "'", int8 == 2601);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-28) + "'", int11 == (-28));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-134969936) + "'", int14 == (-134969936));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1241513984) + "'", int17 == (-1241513984));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-27034267) + "'", int20 == (-27034267));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int14 = mathTest0.square(0);
        int int17 = mathTest0.add(100, 203);
        int int19 = mathTest0.square(3414480);
        int int22 = mathTest0.add(218028, (-66));
        int int25 = mathTest0.subtract((-109), 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 303 + "'", int17 == 303);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2132429056 + "'", int19 == 2132429056);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 217962 + "'", int22 == 217962);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-122) + "'", int25 == (-122));
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((int) (short) -1, 36);
        int int18 = mathTest0.divide((-1488), 112);
        int int21 = mathTest0.add(29421356, (int) (byte) 100);
        int int24 = mathTest0.divide((-270), 999698);
        int int27 = mathTest0.add((-3181), (-399));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-13) + "'", int18 == (-13));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 29421456 + "'", int21 == 29421456);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-3580) + "'", int27 == (-3580));
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.subtract(36, 3232);
        int int16 = mathTest0.square(2);
        int int19 = mathTest0.divide(1042441, (-190));
        int int22 = mathTest0.multiply(102, 960400);
        java.lang.Class<?> wildcardClass23 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3196) + "'", int14 == (-3196));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-5486) + "'", int19 == (-5486));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97960800 + "'", int22 == 97960800);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.multiply(101, 51);
        int int17 = mathTest0.multiply(34, (-50960));
        int int19 = mathTest0.square(101);
        int int22 = mathTest0.multiply((-65), (-3212));
        int int25 = mathTest0.subtract(29462604, 1357392808);
        int int27 = mathTest0.square((-12));
        java.lang.Class<?> wildcardClass28 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5151 + "'", int14 == 5151);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1732640) + "'", int17 == (-1732640));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10201 + "'", int19 == 10201);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 208780 + "'", int22 == 208780);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1327930204) + "'", int25 == (-1327930204));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 144 + "'", int27 == 144);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((-1), (-50));
        int int18 = mathTest0.add((-6476), 1962934338);
        int int21 = mathTest0.subtract((-813), 12);
        int int24 = mathTest0.divide(10036252, 9801);
        int int27 = mathTest0.divide(13516830, (-77677550));
        int int30 = mathTest0.add(1738957824, (-712786789));
        int int33 = mathTest0.add((-41602), 15046285);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1962927862 + "'", int18 == 1962927862);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-825) + "'", int21 == (-825));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1024 + "'", int24 == 1024);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1026171035 + "'", int30 == 1026171035);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 15004683 + "'", int33 == 15004683);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.add((-1631068032), (-1042102));
        int int12 = mathTest0.divide(990, (-2720));
        int int14 = mathTest0.square(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1632110134) + "'", int9 == (-1632110134));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add(52, (-3295));
        java.lang.Class<?> wildcardClass4 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3243) + "'", int3 == (-3243));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int5 = mathTest0.square((int) (byte) 10);
        int int8 = mathTest0.add((-1488), 3190);
        int int11 = mathTest0.multiply((-1042405), 2500);
        int int14 = mathTest0.multiply((-2), 11082614);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1702 + "'", int8 == 1702);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1688954796 + "'", int11 == 1688954796);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-22165228) + "'", int14 == (-22165228));
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int5 = mathTest0.square((-1735140));
        int int8 = mathTest0.subtract(0, (-1042102));
        java.lang.Class<?> wildcardClass9 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-61254896) + "'", int5 == (-61254896));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1042102 + "'", int8 == 1042102);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int11 = mathTest0.square(3232);
        int int14 = mathTest0.divide((-32), (int) (short) 1);
        int int17 = mathTest0.add(36, 1010);
        int int20 = mathTest0.subtract((-61), (int) (short) 10);
        int int23 = mathTest0.divide(361, (-3181));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10445824 + "'", int11 == 10445824);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-32) + "'", int14 == (-32));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1046 + "'", int17 == 1046);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-71) + "'", int20 == (-71));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.divide((-101), 2);
        int int8 = mathTest0.square(1849);
        int int11 = mathTest0.multiply(9114210, 1496160);
        int int14 = mathTest0.divide(31258, 176203232);
        int int17 = mathTest0.subtract((-5073684), 541139968);
        java.lang.Class<?> wildcardClass18 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3418801 + "'", int8 == 3418801);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-204731200) + "'", int11 == (-204731200));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-546213652) + "'", int17 == (-546213652));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) ' ');
        int int12 = mathTest0.divide((int) (byte) 100, 36);
        int int14 = mathTest0.square((-357));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 127449 + "'", int14 == 127449);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int11 = mathTest0.square((int) (short) 1);
        int int14 = mathTest0.add((-137280), 0);
        java.lang.Class<?> wildcardClass15 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-137280) + "'", int14 == (-137280));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.subtract((int) '#', (int) (short) 100);
        int int11 = mathTest0.square(1174437474);
        int int14 = mathTest0.add(10036224, 1192151552);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-65) + "'", int9 == (-65));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-698049148) + "'", int11 == (-698049148));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1202187776 + "'", int14 == 1202187776);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.subtract((int) (short) 0, (int) '#');
        int int15 = mathTest0.subtract((-1), 100);
        int int18 = mathTest0.add((int) (byte) 1, (-124));
        int int21 = mathTest0.subtract((-1488), (-813));
        int int23 = mathTest0.square(429549516);
        int int26 = mathTest0.subtract(0, 1724707840);
        int int28 = mathTest0.square((-134938));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-35) + "'", int12 == (-35));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-101) + "'", int15 == (-101));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-123) + "'", int18 == (-123));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-675) + "'", int21 == (-675));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-477771120) + "'", int23 == (-477771120));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1724707840) + "'", int26 == (-1724707840));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1028394660 + "'", int28 == 1028394660);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.subtract((int) '#', (int) (short) 100);
        int int12 = mathTest0.divide(0, (-1021));
        int int14 = mathTest0.square((int) (byte) 10);
        int int17 = mathTest0.multiply(17689, 10036224);
        int int20 = mathTest0.subtract((-61), (-27036603));
        int int23 = mathTest0.add(1414081664, 43560000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-65) + "'", int9 == (-65));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1437107200 + "'", int17 == 1437107200);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 27036542 + "'", int20 == 27036542);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1457641664 + "'", int23 == 1457641664);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        mathTest mathTest0 = new mathTest();
        int int2 = mathTest0.square((-101));
        int int5 = mathTest0.multiply(1594884096, (-29422512));
        int int8 = mathTest0.divide((-32969632), (-3295));
        int int11 = mathTest0.divide(2499561, 3329);
        int int13 = mathTest0.square(0);
        int int16 = mathTest0.multiply(1700859166, 15046285);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10201 + "'", int2 == 10201);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1962934272 + "'", int5 == 1962934272);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10005 + "'", int8 == 10005);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 750 + "'", int11 == 750);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1878642054 + "'", int16 == 1878642054);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int11 = mathTest0.square(34);
        int int14 = mathTest0.multiply(11, 290);
        int int17 = mathTest0.add((-13503587), (int) '4');
        int int20 = mathTest0.divide(1181812661, (-12420));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1156 + "'", int11 == 1156);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3190 + "'", int14 == 3190);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-13503535) + "'", int17 == (-13503535));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-95153) + "'", int20 == (-95153));
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int11 = mathTest0.square(34);
        int int14 = mathTest0.multiply(11, 290);
        int int17 = mathTest0.divide((-557188015), 1120946724);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1156 + "'", int11 == 1156);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3190 + "'", int14 == 3190);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        int int20 = mathTest0.multiply(99, (int) (short) 1);
        int int22 = mathTest0.square((-1));
        int int25 = mathTest0.divide(5151, 27040000);
        int int27 = mathTest0.square((int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 99 + "'", int20 == 99);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2704 + "'", int27 == 2704);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int13 = mathTest0.square(10036224);
        int int16 = mathTest0.subtract(1324965, (-6476));
        int int19 = mathTest0.multiply(13503598, (-461144));
        int int22 = mathTest0.divide((-1507558125), 163);
        java.lang.Class<?> wildcardClass23 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 219152384 + "'", int13 == 219152384);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1331441 + "'", int16 == 1331441);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 599383088 + "'", int19 == 599383088);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-9248822) + "'", int22 == (-9248822));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.subtract((int) (short) -1, (int) (short) 100);
        int int16 = mathTest0.square(101);
        int int19 = mathTest0.add((-1042405), 303);
        int int22 = mathTest0.divide(29421356, 805857023);
        int int25 = mathTest0.subtract((-648771056), 97960800);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-101) + "'", int14 == (-101));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10201 + "'", int16 == 10201);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1042102) + "'", int19 == (-1042102));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-746731856) + "'", int25 == (-746731856));
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int8 = mathTest0.square((-51));
        int int11 = mathTest0.subtract(100, (-190));
        int int14 = mathTest0.divide((-66), (-63));
        int int16 = mathTest0.square(13503598);
        int int19 = mathTest0.multiply(1094050, (-1065097728));
        int int22 = mathTest0.divide(24389000, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = mathTest0.divide((-963762076), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Cannot divide by zero.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2601 + "'", int8 == 2601);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 290 + "'", int11 == 290);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 27426628 + "'", int16 == 27426628);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1702726656 + "'", int19 == 1702726656);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2438900 + "'", int22 == 2438900);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.multiply(101, 51);
        int int17 = mathTest0.multiply(34, (-50960));
        int int19 = mathTest0.square(101);
        int int22 = mathTest0.multiply((-3322), (-13503587));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5151 + "'", int14 == 5151);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1732640) + "'", int17 == (-1732640));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10201 + "'", int19 == 10201);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1909243054 + "'", int22 == 1909243054);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.multiply(101, 51);
        int int16 = mathTest0.square((int) ' ');
        int int19 = mathTest0.add(0, (-123));
        int int22 = mathTest0.multiply(1594884096, 5405);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5151 + "'", int14 == 5151);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1024 + "'", int16 == 1024);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-123) + "'", int19 == (-123));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 349175808 + "'", int22 == 349175808);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.multiply(101, 51);
        int int17 = mathTest0.divide((-65), (-295593424));
        int int20 = mathTest0.divide(1357392808, 177957);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5151 + "'", int14 == 5151);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 7627 + "'", int20 == 7627);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(12, 100);
        int int15 = mathTest0.subtract(0, (-1156));
        java.lang.Class<?> wildcardClass16 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 112 + "'", int12 == 112);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1156 + "'", int15 == 1156);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.subtract((int) '#', (int) (short) 1);
        int int17 = mathTest0.divide((-743732520), 1174437540);
        java.lang.Class<?> wildcardClass18 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int8 = mathTest0.square((-51));
        int int11 = mathTest0.subtract(100, (-190));
        int int14 = mathTest0.subtract((-138), 152);
        int int16 = mathTest0.square(1393254656);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2601 + "'", int8 == 2601);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 290 + "'", int11 == 290);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-290) + "'", int14 == (-290));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2059468800 + "'", int16 == 2059468800);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(12, 100);
        int int15 = mathTest0.multiply(2, 1046);
        int int17 = mathTest0.square(13516830);
        int int19 = mathTest0.square((-2088586791));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 112 + "'", int12 == 112);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2092 + "'", int15 == 2092);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1079444356 + "'", int17 == 1079444356);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 837929457 + "'", int19 == 837929457);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.add((int) (short) 1, 0);
        int int14 = mathTest0.multiply((-399), 1156);
        int int17 = mathTest0.subtract(0, 0);
        int int20 = mathTest0.divide((-3084), 1290100);
        int int23 = mathTest0.add(1336336, 15046285);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-461244) + "'", int14 == (-461244));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 16382621 + "'", int23 == 16382621);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int12 = mathTest0.add(290, 2);
        int int15 = mathTest0.divide(2030043136, 1480589312);
        int int18 = mathTest0.add((-1611803632), (-61));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 292 + "'", int12 == 292);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1611803693) + "'", int18 == (-1611803693));
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.add((int) (short) 1, 0);
        int int14 = mathTest0.multiply((-399), 1156);
        int int17 = mathTest0.divide(148155, 52);
        int int20 = mathTest0.divide((-3222), (-12));
        int int23 = mathTest0.multiply((-980), 2738);
        int int25 = mathTest0.square(1496089);
        java.lang.Class<?> wildcardClass26 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-461244) + "'", int14 == (-461244));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2849 + "'", int17 == 2849);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 268 + "'", int20 == 268);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-2683240) + "'", int23 == (-2683240));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 604334705 + "'", int25 == 604334705);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.add((int) (byte) -1, (int) '4');
        int int12 = mathTest0.subtract(150, 51);
        int int15 = mathTest0.add((int) (short) 1, 1);
        int int18 = mathTest0.add(0, (-252448));
        java.lang.Class<?> wildcardClass19 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 99 + "'", int12 == 99);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-252448) + "'", int18 == (-252448));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.subtract((int) (short) -1, (int) (short) 100);
        int int17 = mathTest0.multiply((-399), (int) (byte) 10);
        int int20 = mathTest0.multiply((int) (byte) 1, 10000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-101) + "'", int14 == (-101));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-3990) + "'", int17 == (-3990));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10000 + "'", int20 == 10000);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.divide((-101), 2);
        int int8 = mathTest0.square(1849);
        int int11 = mathTest0.multiply(9114210, 1496160);
        int int14 = mathTest0.divide(31258, 176203232);
        int int17 = mathTest0.subtract((-5073684), 541139968);
        int int19 = mathTest0.square(194966016);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3418801 + "'", int8 == 3418801);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-204731200) + "'", int11 == (-204731200));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-546213652) + "'", int17 == (-546213652));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1664876544) + "'", int19 == (-1664876544));
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) ' ');
        int int12 = mathTest0.add((-1042102), 1000500);
        int int15 = mathTest0.add((-161), (-109));
        int int18 = mathTest0.add(217038, (-963762076));
        int int20 = mathTest0.square(1543545828);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-41602) + "'", int12 == (-41602));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-270) + "'", int15 == (-270));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-963545038) + "'", int18 == (-963545038));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1223435024 + "'", int20 == 1223435024);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.add((int) (byte) -1, (int) '4');
        int int12 = mathTest0.multiply((int) 'a', (int) (short) 100);
        int int15 = mathTest0.subtract((-27036768), 3329);
        int int18 = mathTest0.multiply(0, (-2));
        int int21 = mathTest0.subtract(2002088192, (-3580));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9700 + "'", int12 == 9700);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-27040097) + "'", int15 == (-27040097));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2002091772 + "'", int21 == 2002091772);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square((-32969632));
        int int13 = mathTest0.square(1581);
        int int16 = mathTest0.subtract((int) (short) 10, 2030043136);
        int int19 = mathTest0.add(9113164, 1046);
        int int22 = mathTest0.subtract(11082241, (-341));
        int int24 = mathTest0.square(4353);
        int int26 = mathTest0.square((-29422522));
        int int28 = mathTest0.square((-5073684));
        int int31 = mathTest0.divide(1818756672, (-27037278));
        int int33 = mathTest0.square(1881653649);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 541139968 + "'", int11 == 541139968);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2499561 + "'", int13 == 2499561);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2030043126) + "'", int16 == (-2030043126));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 9114210 + "'", int19 == 9114210);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 11082582 + "'", int22 == 11082582);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 18948609 + "'", int24 == 18948609);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-217406684) + "'", int26 == (-217406684));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1764640368) + "'", int28 == (-1764640368));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-67) + "'", int31 == (-67));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1820980257 + "'", int33 == 1820980257);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) (short) 1);
        int int12 = mathTest0.add((-63), (-3232));
        int int15 = mathTest0.subtract(316921, 1347654771);
        int int17 = mathTest0.square((-805866716));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3295) + "'", int12 == (-3295));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1347337850) + "'", int15 == (-1347337850));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1690215152) + "'", int17 == (-1690215152));
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.divide(1290100, (-3232));
        int int20 = mathTest0.multiply(0, 9700);
        int int23 = mathTest0.add(4700, 29421468);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-399) + "'", int17 == (-399));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 29426168 + "'", int23 == 29426168);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(12, 100);
        int int15 = mathTest0.multiply(2, 1046);
        int int18 = mathTest0.add((-5486), 0);
        int int21 = mathTest0.divide((-52), 117);
        int int24 = mathTest0.add(1496089, 0);
        int int27 = mathTest0.divide(11, 386092816);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 112 + "'", int12 == 112);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2092 + "'", int15 == 2092);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-5486) + "'", int18 == (-5486));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1496089 + "'", int24 == 1496089);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.add((int) (byte) -1, (int) '4');
        int int12 = mathTest0.subtract(150, 51);
        int int15 = mathTest0.add((int) (short) 1, 1);
        int int18 = mathTest0.multiply(0, (-980));
        int int21 = mathTest0.add((int) (byte) 10, 990);
        int int24 = mathTest0.add(0, (-1527529573));
        int int27 = mathTest0.multiply(52229, (-638930));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 99 + "'", int12 == 99);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1000 + "'", int21 == 1000);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1527529573) + "'", int24 == (-1527529573));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 989063398 + "'", int27 == 989063398);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.add((int) (byte) -1, (int) '4');
        int int12 = mathTest0.subtract(150, 51);
        int int15 = mathTest0.add((int) (short) 1, 1);
        int int18 = mathTest0.multiply((-148), (-124));
        int int21 = mathTest0.multiply((-6), (-1236));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 99 + "'", int12 == 99);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 18352 + "'", int18 == 18352);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7416 + "'", int21 == 7416);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(12, 100);
        int int14 = mathTest0.square(964449926);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 112 + "'", int12 == 112);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1693561308) + "'", int14 == (-1693561308));
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square((-32969632));
        int int13 = mathTest0.square(1581);
        int int16 = mathTest0.subtract((int) (short) 10, 2030043136);
        int int19 = mathTest0.add(9113164, 1046);
        int int22 = mathTest0.subtract(11082241, (-341));
        int int25 = mathTest0.add(1032656465, 17960388);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 541139968 + "'", int11 == 541139968);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2499561 + "'", int13 == 2499561);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2030043126) + "'", int16 == (-2030043126));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 9114210 + "'", int19 == 9114210);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 11082582 + "'", int22 == 11082582);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1050616853 + "'", int25 == 1050616853);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.multiply(101, 51);
        int int16 = mathTest0.square((int) ' ');
        int int19 = mathTest0.add(0, (-123));
        java.lang.Class<?> wildcardClass20 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5151 + "'", int14 == 5151);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1024 + "'", int16 == 1024);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-123) + "'", int19 == (-123));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int13 = mathTest0.square(10036224);
        int int16 = mathTest0.multiply(1336336, (-1156));
        int int19 = mathTest0.subtract((-1515163), 18974736);
        int int22 = mathTest0.divide((-3232), 1065108889);
        int int24 = mathTest0.square((-989988));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 219152384 + "'", int13 == 219152384);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1544804416) + "'", int16 == (-1544804416));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-20489899) + "'", int19 == (-20489899));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 823696656 + "'", int24 == 823696656);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.divide((-290), 1892067732);
        int int9 = mathTest0.add((-805857024), 163);
        int int12 = mathTest0.subtract(1346542369, 712776852);
        int int15 = mathTest0.divide((-1437108180), 2499561);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-805856861) + "'", int9 == (-805856861));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 633765517 + "'", int12 == 633765517);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-574) + "'", int15 == (-574));
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.divide(0, 5200);
        int int14 = mathTest0.add((-3243), (-13503587));
        int int16 = mathTest0.square((-13494178));
        java.lang.Class<?> wildcardClass17 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-13506830) + "'", int14 == (-13506830));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-888552828) + "'", int16 == (-888552828));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.multiply(101, 51);
        int int16 = mathTest0.square((int) ' ');
        java.lang.Class<?> wildcardClass17 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5151 + "'", int14 == 5151);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1024 + "'", int16 == 1024);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.divide(1496241, 10201);
        int int14 = mathTest0.square(0);
        int int17 = mathTest0.divide(150994944, (-94292389));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 146 + "'", int12 == 146);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((-1), (-50));
        int int18 = mathTest0.add((-6476), 1962934338);
        int int21 = mathTest0.subtract((-813), 12);
        int int24 = mathTest0.subtract(1496160, (-3181));
        int int27 = mathTest0.add((-805856777), 3418801);
        int int30 = mathTest0.subtract(12124646, 5151);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1962927862 + "'", int18 == 1962927862);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-825) + "'", int21 == (-825));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1499341 + "'", int24 == 1499341);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-802437976) + "'", int27 == (-802437976));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 12119495 + "'", int30 == 12119495);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(210, (-7));
        int int15 = mathTest0.add((-621998080), 249987721);
        int int18 = mathTest0.add(0, (int) (byte) 10);
        int int21 = mathTest0.subtract((-845551616), 2048);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 203 + "'", int12 == 203);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-372010359) + "'", int15 == (-372010359));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-845553664) + "'", int21 == (-845553664));
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.subtract(1357853952, 14747159);
        int int17 = mathTest0.subtract((-821630), (-1095390208));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1343106793 + "'", int14 == 1343106793);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1094568578 + "'", int17 == 1094568578);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.subtract((-2720), 9700);
        int int9 = mathTest0.divide(855675766, 1962927862);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-12420) + "'", int6 == (-12420));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.subtract(36, 3232);
        int int16 = mathTest0.square(2);
        int int19 = mathTest0.divide(1042441, (-190));
        int int21 = mathTest0.square((-71));
        int int24 = mathTest0.add((-83559871), (-495));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3196) + "'", int14 == (-3196));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-5486) + "'", int19 == (-5486));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5041 + "'", int21 == 5041);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-83560366) + "'", int24 == (-83560366));
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.subtract(36, 3232);
        int int16 = mathTest0.square(2);
        int int19 = mathTest0.add(11, 999698);
        int int22 = mathTest0.add(208780, 52229);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3196) + "'", int14 == (-3196));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 999709 + "'", int19 == 999709);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 261009 + "'", int22 == 261009);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.divide((-101), 2);
        int int9 = mathTest0.multiply(101, 10);
        int int12 = mathTest0.subtract(150, (-2));
        int int15 = mathTest0.add((-746731856), (-29331390));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1010 + "'", int9 == 1010);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 152 + "'", int12 == 152);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-776063246) + "'", int15 == (-776063246));
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((-32), 99);
        int int9 = mathTest0.divide((-3232), 51);
        int int12 = mathTest0.subtract(34, (int) (short) 100);
        int int15 = mathTest0.subtract((int) (byte) -1, (int) (byte) 0);
        int int17 = mathTest0.square((-781697343));
        int int20 = mathTest0.add((-217406684), 10000);
        int int23 = mathTest0.add((-135036), 1025);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3168) + "'", int6 == (-3168));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-63) + "'", int9 == (-63));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-66) + "'", int12 == (-66));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 775032193 + "'", int17 == 775032193);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-217396684) + "'", int20 == (-217396684));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-134011) + "'", int23 == (-134011));
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int8 = mathTest0.square((-51));
        int int11 = mathTest0.subtract(100, (-190));
        int int14 = mathTest0.divide((-66), (-63));
        int int16 = mathTest0.square(0);
        int int19 = mathTest0.multiply((-123), 0);
        int int22 = mathTest0.add(39906449, (-1437105680));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2601 + "'", int8 == 2601);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 290 + "'", int11 == 290);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1397199231) + "'", int22 == (-1397199231));
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.add((int) (byte) -1, (int) '4');
        int int12 = mathTest0.subtract(150, 51);
        int int15 = mathTest0.add((int) (short) 1, 1);
        int int18 = mathTest0.multiply(0, (-980));
        int int21 = mathTest0.add((int) (byte) 10, 990);
        int int24 = mathTest0.multiply(1486572, 0);
        int int27 = mathTest0.divide((-4222), 999644832);
        int int29 = mathTest0.square((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 99 + "'", int12 == 99);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1000 + "'", int21 == 1000);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((-1), (-50));
        int int18 = mathTest0.divide((int) (short) -1, 163);
        int int21 = mathTest0.multiply(1336336, 29421456);
        int int24 = mathTest0.add(36, (-461244));
        int int27 = mathTest0.subtract(2092, (-252448));
        java.lang.Class<?> wildcardClass28 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 820197632 + "'", int21 == 820197632);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-461208) + "'", int24 == (-461208));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 254540 + "'", int27 == 254540);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(1290100, 9700);
        int int9 = mathTest0.divide((-3181), (-101));
        int int12 = mathTest0.multiply(2, 1024);
        int int15 = mathTest0.subtract(326681, (-1042102));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 133 + "'", int6 == 133);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 31 + "'", int9 == 31);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2048 + "'", int12 == 2048);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1368783 + "'", int15 == 1368783);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(210, (-7));
        // The following exception was thrown during execution in test generation
        try {
            int int15 = mathTest0.divide((-33307825), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Cannot divide by zero.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 203 + "'", int12 == 203);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((-32), 99);
        int int9 = mathTest0.multiply((-980), (int) '4');
        int int12 = mathTest0.divide(312900721, 990);
        int int14 = mathTest0.square(26569);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3168) + "'", int6 == (-3168));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-50960) + "'", int9 == (-50960));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 316061 + "'", int12 == 316061);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 705911761 + "'", int14 == 705911761);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        mathTest mathTest0 = new mathTest();
        int int2 = mathTest0.square((-101));
        int int5 = mathTest0.divide((-71), 19);
        int int8 = mathTest0.subtract((-65), (-109));
        int int11 = mathTest0.subtract(0, 461828740);
        int int14 = mathTest0.subtract(1568, 775373112);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10201 + "'", int2 == 10201);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-3) + "'", int5 == (-3));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 44 + "'", int8 == 44);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-461828740) + "'", int11 == (-461828740));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-775371544) + "'", int14 == (-775371544));
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.add((int) (short) 1, 0);
        int int14 = mathTest0.multiply((-399), 1156);
        int int17 = mathTest0.divide(148155, 52);
        int int20 = mathTest0.divide((-3222), (-12));
        int int23 = mathTest0.multiply((-980), 2738);
        int int25 = mathTest0.square(1496089);
        int int27 = mathTest0.square(863719680);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-461244) + "'", int14 == (-461244));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2849 + "'", int17 == 2849);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 268 + "'", int20 == 268);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-2683240) + "'", int23 == (-2683240));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 604334705 + "'", int25 == 604334705);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-274661376) + "'", int27 == (-274661376));
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.multiply((int) (short) 0, (-101));
        int int9 = mathTest0.add(101, 53312);
        int int12 = mathTest0.multiply(0, (-28));
        int int15 = mathTest0.subtract(30460917, (-923619227));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53413 + "'", int9 == 53413);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 954080144 + "'", int15 == 954080144);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.divide((-101), 2);
        java.lang.Class<?> wildcardClass7 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.subtract(2849, 1208040860);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1208038011) + "'", int12 == (-1208038011));
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.subtract((int) (short) 0, (int) '#');
        int int15 = mathTest0.add((-101), 1024);
        int int18 = mathTest0.multiply((-845551616), (-1086369187));
        int int21 = mathTest0.multiply(999644832, 5541);
        int int24 = mathTest0.multiply((-50897), 1334646608);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-35) + "'", int12 == (-35));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 923 + "'", int15 == 923);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 356075520 + "'", int18 == 356075520);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1475797728) + "'", int21 == (-1475797728));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-305653840) + "'", int24 == (-305653840));
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int8 = mathTest0.square((-51));
        int int11 = mathTest0.subtract(100, (-190));
        int int14 = mathTest0.divide((-66), (-63));
        int int16 = mathTest0.square(13503598);
        int int19 = mathTest0.divide(4389, 1964249578);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2601 + "'", int8 == 2601);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 290 + "'", int11 == 290);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 27426628 + "'", int16 == 27426628);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.add((int) (short) 1, 0);
        int int14 = mathTest0.add(51, (-3232));
        int int17 = mathTest0.add(1500625, (-6476));
        int int19 = mathTest0.square((-1838193237));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3181) + "'", int14 == (-3181));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1494149 + "'", int17 == 1494149);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1588224057 + "'", int19 == 1588224057);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.multiply(10445824, 10445824);
        int int12 = mathTest0.divide(2704, (-5681));
        int int14 = mathTest0.square(712775872);
        int int17 = mathTest0.add(11082582, (int) ' ');
        int int20 = mathTest0.multiply((-27036766), (-40381539));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1594884096 + "'", int9 == 1594884096);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-60518400) + "'", int14 == (-60518400));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 11082614 + "'", int17 == 11082614);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1239052378 + "'", int20 == 1239052378);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(3232, (-3168));
        int int9 = mathTest0.subtract(3414480, (-27046437));
        int int12 = mathTest0.subtract((-597361078), 44);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 30460917 + "'", int9 == 30460917);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-597361122) + "'", int12 == (-597361122));
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.add((-3181), (int) 'a');
        int int16 = mathTest0.square(150);
        int int19 = mathTest0.divide(0, 324766576);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3084) + "'", int14 == (-3084));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 22500 + "'", int16 == 22500);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((-1), (-50));
        int int18 = mathTest0.add((-6476), 1962934338);
        int int21 = mathTest0.subtract((-813), 12);
        int int24 = mathTest0.subtract(1496160, (-3181));
        int int27 = mathTest0.subtract(27040000, 2704);
        int int29 = mathTest0.square((-364053231));
        int int32 = mathTest0.divide(13225, 3418801);
        int int35 = mathTest0.divide((int) (short) 10, 1964249578);
        int int37 = mathTest0.square((-1527529573));
        int int40 = mathTest0.subtract(73794752, (-538890831));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1962927862 + "'", int18 == 1962927862);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-825) + "'", int21 == (-825));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1499341 + "'", int24 == 1499341);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 27037296 + "'", int27 == 27037296);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1346542369 + "'", int29 == 1346542369);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-408246311) + "'", int37 == (-408246311));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 612685583 + "'", int40 == 612685583);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.add((int) (short) 1, 0);
        int int14 = mathTest0.add(51, (-3232));
        int int17 = mathTest0.multiply(1581, 1852038144);
        int int20 = mathTest0.divide((-365052929), (-91));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3181) + "'", int14 == (-3181));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1095390208) + "'", int17 == (-1095390208));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4011570 + "'", int20 == 4011570);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.subtract((int) '#', (int) (short) 1);
        int int17 = mathTest0.multiply(1, (-1));
        int int20 = mathTest0.multiply((-27036775), 261009);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-210338647) + "'", int20 == (-210338647));
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.subtract((int) (short) -1, (int) (short) 100);
        int int17 = mathTest0.multiply((-399), (int) (byte) 10);
        int int20 = mathTest0.add((-31), (-12));
        int int23 = mathTest0.divide(4700, (-1190));
        java.lang.Class<?> wildcardClass24 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-101) + "'", int14 == (-101));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-3990) + "'", int17 == (-3990));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-43) + "'", int20 == (-43));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-3) + "'", int23 == (-3));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((-32), 99);
        int int9 = mathTest0.divide((-3232), 51);
        int int12 = mathTest0.subtract(34, (int) (short) 100);
        int int15 = mathTest0.subtract((int) (byte) -1, (int) (byte) 0);
        int int17 = mathTest0.square((-781697343));
        int int20 = mathTest0.add((-217406684), 10000);
        java.lang.Class<?> wildcardClass21 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3168) + "'", int6 == (-3168));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-63) + "'", int9 == (-63));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-66) + "'", int12 == (-66));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 775032193 + "'", int17 == 775032193);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-217396684) + "'", int20 == (-217396684));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.add(100, (int) (short) 1);
        int int8 = mathTest0.square(557020471);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 395661777 + "'", int8 == 395661777);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int13 = mathTest0.square(22500);
        int int16 = mathTest0.multiply((-204731200), 12);
        int int19 = mathTest0.divide(11082241, 2550);
        int int21 = mathTest0.square(1667);
        int int24 = mathTest0.add(1892067663, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 506250000 + "'", int13 == 506250000);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1838192896 + "'", int16 == 1838192896);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4345 + "'", int19 == 4345);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2778889 + "'", int21 == 2778889);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1892067663 + "'", int24 == 1892067663);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int14 = mathTest0.square(0);
        int int16 = mathTest0.square(5200);
        int int19 = mathTest0.divide(1168561, 296310);
        int int22 = mathTest0.add(327184887, 1496089);
        java.lang.Class<?> wildcardClass23 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 27040000 + "'", int16 == 27040000);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 328680976 + "'", int22 == 328680976);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.subtract((int) (short) -1, (int) (short) 100);
        int int17 = mathTest0.divide(1, 100);
        int int20 = mathTest0.multiply(29421456, 27040000);
        java.lang.Class<?> wildcardClass21 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-101) + "'", int14 == (-101));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-621998080) + "'", int20 == (-621998080));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int8 = mathTest0.square((-51));
        int int11 = mathTest0.add(0, (-1752770602));
        int int14 = mathTest0.divide(1818756672, 4189);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2601 + "'", int8 == 2601);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1752770602) + "'", int11 == (-1752770602));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 434174 + "'", int14 == 434174);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int11 = mathTest0.square(133);
        int int13 = mathTest0.square((-2049));
        java.lang.Class<?> wildcardClass14 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 17689 + "'", int11 == 17689);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4198401 + "'", int13 == 4198401);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int5 = mathTest0.square((int) (byte) 10);
        int int8 = mathTest0.add((-1488), 3190);
        int int11 = mathTest0.multiply((-1042405), 2500);
        int int14 = mathTest0.divide((-1988513369), 316061);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1702 + "'", int8 == 1702);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1688954796 + "'", int11 == 1688954796);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-6291) + "'", int14 == (-6291));
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(3232, (-3168));
        int int8 = mathTest0.square((-3232));
        int int11 = mathTest0.add(29421356, 112);
        int int14 = mathTest0.divide((int) (byte) 10, 13516830);
        int int17 = mathTest0.subtract((-364053231), 1688954796);
        int int19 = mathTest0.square(1496089);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10445824 + "'", int8 == 10445824);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 29421468 + "'", int11 == 29421468);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-2053008027) + "'", int17 == (-2053008027));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 604334705 + "'", int19 == 604334705);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(3232, (-3168));
        int int8 = mathTest0.square((-3232));
        int int10 = mathTest0.square(290);
        int int13 = mathTest0.add(356075520, (-135036));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10445824 + "'", int8 == 10445824);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 84100 + "'", int10 == 84100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 355940484 + "'", int13 == 355940484);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.subtract((int) (short) 0, (int) '#');
        int int15 = mathTest0.subtract((-1), 100);
        int int18 = mathTest0.add((int) (byte) 1, (-124));
        int int21 = mathTest0.subtract((-1488), (-813));
        int int24 = mathTest0.subtract(712776862, (int) (byte) 10);
        int int27 = mathTest0.subtract(833797824, (-578));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-35) + "'", int12 == (-35));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-101) + "'", int15 == (-101));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-123) + "'", int18 == (-123));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-675) + "'", int21 == (-675));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 712776852 + "'", int24 == 712776852);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 833798402 + "'", int27 == 833798402);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.add((int) (short) 1, 0);
        int int14 = mathTest0.add(51, (-3232));
        int int17 = mathTest0.add(1500625, (-6476));
        int int20 = mathTest0.multiply((-12), (-1042405));
        int int23 = mathTest0.subtract(11082241, (-1042405));
        int int26 = mathTest0.subtract(1624939024, 52229);
        int int29 = mathTest0.divide((-51208), 1357392808);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3181) + "'", int14 == (-3181));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1494149 + "'", int17 == 1494149);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 12508860 + "'", int20 == 12508860);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 12124646 + "'", int23 == 12124646);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1624886795 + "'", int26 == 1624886795);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int13 = mathTest0.square(10036224);
        int int16 = mathTest0.multiply(4389, (-1156));
        java.lang.Class<?> wildcardClass17 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 219152384 + "'", int13 == 219152384);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-5073684) + "'", int16 == (-5073684));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(12, 100);
        int int15 = mathTest0.multiply(2, 1046);
        int int18 = mathTest0.add((-5486), 0);
        int int21 = mathTest0.divide((-52), 117);
        java.lang.Class<?> wildcardClass22 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 112 + "'", int12 == 112);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2092 + "'", int15 == 2092);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-5486) + "'", int18 == (-5486));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        int int20 = mathTest0.multiply((int) (short) 10, 99);
        int int23 = mathTest0.multiply((-5073684), (-27036766));
        java.lang.Class<?> wildcardClass24 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 990 + "'", int20 == 990);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-953401000) + "'", int23 == (-953401000));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(12, 100);
        int int15 = mathTest0.multiply(2, 1046);
        int int18 = mathTest0.add(1202187776, 1414081664);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 112 + "'", int12 == 112);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2092 + "'", int15 == 2092);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1678697856) + "'", int18 == (-1678697856));
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.add(100, (int) (short) 1);
        int int9 = mathTest0.subtract(0, 0);
        int int12 = mathTest0.subtract(282539681, 7627);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 282532054 + "'", int12 == 282532054);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((-1), (-50));
        int int18 = mathTest0.add((-6476), 1962934338);
        int int21 = mathTest0.subtract((-813), 12);
        int int24 = mathTest0.subtract(1496160, (-3181));
        int int27 = mathTest0.add((-805856777), 3418801);
        java.lang.Class<?> wildcardClass28 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1962927862 + "'", int18 == 1962927862);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-825) + "'", int21 == (-825));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1499341 + "'", int24 == 1499341);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-802437976) + "'", int27 == (-802437976));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((-1), (-50));
        int int18 = mathTest0.subtract(429549516, 0);
        int int20 = mathTest0.square((-30022584));
        int int23 = mathTest0.divide((-28), 10036323);
        int int26 = mathTest0.subtract((-51), (-6));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 429549516 + "'", int18 == 429549516);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 828396608 + "'", int20 == 828396608);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-45) + "'", int26 == (-45));
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((-1), (-50));
        int int18 = mathTest0.add((-6476), 1962934338);
        int int21 = mathTest0.subtract((-813), 12);
        int int24 = mathTest0.divide(10036252, 9801);
        int int27 = mathTest0.divide(13516830, (-77677550));
        int int29 = mathTest0.square(659992241);
        int int32 = mathTest0.subtract(2550, (-1624607648));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1962927862 + "'", int18 == 1962927862);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-825) + "'", int21 == (-825));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1024 + "'", int24 == 1024);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1004464543) + "'", int29 == (-1004464543));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1624610198 + "'", int32 == 1624610198);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.divide(0, 5200);
        int int13 = mathTest0.square((int) (short) 0);
        int int16 = mathTest0.add(29421356, 3299872);
        int int19 = mathTest0.add((-5073684), 34906950);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32721228 + "'", int16 == 32721228);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 29833266 + "'", int19 == 29833266);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int12 = mathTest0.multiply(0, 210);
        int int15 = mathTest0.add((-50), (int) 'a');
        int int18 = mathTest0.divide((-60518400), 1624939024);
        java.lang.Class<?> wildcardClass19 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 47 + "'", int15 == 47);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.subtract((int) '#', (int) (short) 1);
        int int17 = mathTest0.multiply(112, (-262701));
        int int20 = mathTest0.add((-990), 2076);
        int int23 = mathTest0.add(0, (-584742496));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-29422512) + "'", int17 == (-29422512));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1086 + "'", int20 == 1086);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-584742496) + "'", int23 == (-584742496));
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(3232, (-3168));
        int int8 = mathTest0.square((-3232));
        int int11 = mathTest0.add(29421356, 112);
        int int14 = mathTest0.divide((int) (byte) 10, 13516830);
        int int17 = mathTest0.subtract((-364053231), 1688954796);
        int int20 = mathTest0.subtract(429549516, 217038);
        java.lang.Class<?> wildcardClass21 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10445824 + "'", int8 == 10445824);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 29421468 + "'", int11 == 29421468);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-2053008027) + "'", int17 == (-2053008027));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 429332478 + "'", int20 == 429332478);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.add((int) (short) 1, 0);
        int int14 = mathTest0.add(51, (-3232));
        int int17 = mathTest0.subtract((-3222), 100);
        int int20 = mathTest0.add(290, 999698);
        int int23 = mathTest0.multiply((-38228), (-26076203));
        java.lang.Class<?> wildcardClass24 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3181) + "'", int14 == (-3181));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-3322) + "'", int17 == (-3322));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 999988 + "'", int20 == 999988);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 408675612 + "'", int23 == 408675612);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((int) (short) -1, 36);
        int int18 = mathTest0.divide((-1488), 112);
        int int21 = mathTest0.add(29421356, (int) (byte) 100);
        int int24 = mathTest0.divide((-270), 999698);
        int int27 = mathTest0.divide(1724707841, (-1653863424));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-13) + "'", int18 == (-13));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 29421456 + "'", int21 == 29421456);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(12, 100);
        int int15 = mathTest0.add(2601, (-51));
        int int18 = mathTest0.divide((-51918), 1594884096);
        int int21 = mathTest0.multiply(36, (-3243));
        int int24 = mathTest0.add(4337, (-148));
        int int26 = mathTest0.square((-1576));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 112 + "'", int12 == 112);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2550 + "'", int15 == 2550);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-116748) + "'", int21 == (-116748));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4189 + "'", int24 == 4189);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2483776 + "'", int26 == 2483776);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(12, 100);
        int int15 = mathTest0.subtract(0, (-1156));
        int int18 = mathTest0.subtract((-1), 2048);
        int int21 = mathTest0.subtract((-601128), 29421456);
        int int23 = mathTest0.square((-1086356767));
        int int26 = mathTest0.multiply(3364195, (-94292389));
        int int29 = mathTest0.multiply((-1452215270), 1357853952);
        java.lang.Class<?> wildcardClass30 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 112 + "'", int12 == 112);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1156 + "'", int15 == 1156);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2049) + "'", int18 == (-2049));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-30022584) + "'", int21 == (-30022584));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1806125505 + "'", int23 == 1806125505);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-289063887) + "'", int26 == (-289063887));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1724867072 + "'", int29 == 1724867072);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(12, 100);
        int int15 = mathTest0.subtract(0, (-1156));
        int int18 = mathTest0.divide((-1086356767), 1094116);
        int int20 = mathTest0.square(2059381548);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 112 + "'", int12 == 112);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1156 + "'", int15 == 1156);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-992) + "'", int18 == (-992));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-837038192) + "'", int20 == (-837038192));
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(1290100, 9700);
        int int8 = mathTest0.square(316921);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 133 + "'", int6 == 133);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1654672433 + "'", int8 == 1654672433);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.divide((-101), 2);
        int int9 = mathTest0.multiply(101, 10);
        int int12 = mathTest0.subtract(386092816, 1025);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1010 + "'", int9 == 1010);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 386091791 + "'", int12 == 386091791);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.divide(0, 5200);
        int int14 = mathTest0.add((-3243), (-13503587));
        int int17 = mathTest0.divide((-1022), (-1637540284));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-13506830) + "'", int14 == (-13506830));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(3232, (-3168));
        int int8 = mathTest0.square((-3232));
        int int11 = mathTest0.add(29421356, 112);
        int int14 = mathTest0.divide((int) (byte) 10, 13516830);
        int int16 = mathTest0.square((-13525933));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10445824 + "'", int8 == 10445824);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 29421468 + "'", int11 == 29421468);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1858387223) + "'", int16 == (-1858387223));
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.multiply(10445824, 10445824);
        int int12 = mathTest0.divide(2704, (-5681));
        int int14 = mathTest0.square(712775872);
        int int16 = mathTest0.square(1156);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = mathTest0.divide(26877952, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Cannot divide by zero.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1594884096 + "'", int9 == 1594884096);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-60518400) + "'", int14 == (-60518400));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1336336 + "'", int16 == 1336336);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(5200, (-341));
        int int20 = mathTest0.subtract((-2), 990);
        int int23 = mathTest0.add(9113164, 2499561);
        java.lang.Class<?> wildcardClass24 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5541 + "'", int17 == 5541);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-992) + "'", int20 == (-992));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 11612725 + "'", int23 == 11612725);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.divide(1290100, (-3232));
        int int20 = mathTest0.divide((-6476), 34);
        int int23 = mathTest0.subtract(10, (-8));
        int int26 = mathTest0.divide((-3990), (-805857024));
        int int29 = mathTest0.subtract((-1065087038), (-1631068032));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-399) + "'", int17 == (-399));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-190) + "'", int20 == (-190));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 18 + "'", int23 == 18);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 565980994 + "'", int29 == 565980994);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.divide(1290100, (-3232));
        int int20 = mathTest0.multiply(0, 9700);
        int int23 = mathTest0.divide(1849, 9669);
        java.lang.Class<?> wildcardClass24 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-399) + "'", int17 == (-399));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.divide(0, 5200);
        int int14 = mathTest0.multiply((int) (short) 1, (int) (short) 10);
        int int17 = mathTest0.multiply((-3232), 10201);
        int int20 = mathTest0.subtract(63, (-990));
        int int23 = mathTest0.subtract((-134969936), (-109));
        int int26 = mathTest0.add(11082582, 32721228);
        int int29 = mathTest0.multiply((-27036576), 1094050);
        int int31 = mathTest0.square((-3295));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-32969632) + "'", int17 == (-32969632));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1053 + "'", int20 == 1053);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-134969827) + "'", int23 == (-134969827));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 43803810 + "'", int26 == 43803810);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 73794752 + "'", int29 == 73794752);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10857025 + "'", int31 == 10857025);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.subtract((int) '#', (int) (short) 100);
        int int12 = mathTest0.subtract(10000, (-13506830));
        int int15 = mathTest0.multiply(55342855, 1275);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-65) + "'", int9 == (-65));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 13516830 + "'", int12 == 13516830);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1842663389 + "'", int15 == 1842663389);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.add((int) (byte) -1, (int) '4');
        int int12 = mathTest0.subtract(150, 51);
        int int15 = mathTest0.add((int) (short) 1, 1);
        int int18 = mathTest0.multiply(0, (-980));
        int int21 = mathTest0.add((int) (byte) 10, 990);
        int int24 = mathTest0.multiply(15004683, 10037175);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 99 + "'", int12 == 99);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1000 + "'", int21 == 1000);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1600856285 + "'", int24 == 1600856285);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(1290100, 9700);
        int int9 = mathTest0.divide((-3181), (-101));
        int int12 = mathTest0.multiply(2, 1024);
        int int15 = mathTest0.multiply((-648771056), 1679616);
        java.lang.Class<?> wildcardClass16 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 133 + "'", int6 == 133);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 31 + "'", int9 == 31);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2048 + "'", int12 == 2048);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1503391744) + "'", int15 == (-1503391744));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.subtract((int) (short) 0, (int) '#');
        int int15 = mathTest0.subtract((-1), 100);
        int int18 = mathTest0.add((int) (byte) 1, (-124));
        int int21 = mathTest0.subtract((-1488), (-813));
        int int23 = mathTest0.square(429549516);
        int int25 = mathTest0.square((-134969827));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-35) + "'", int12 == (-35));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-101) + "'", int15 == (-101));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-123) + "'", int18 == (-123));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-675) + "'", int21 == (-675));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-477771120) + "'", int23 == (-477771120));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-477470903) + "'", int25 == (-477470903));
    }
}

