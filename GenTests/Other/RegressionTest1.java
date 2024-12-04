import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) ' ');
        int int12 = mathTest0.divide((int) (byte) 100, 36);
        int int15 = mathTest0.subtract(0, 3232);
        int int18 = mathTest0.multiply(1961891178, (-1838192896));
        int int21 = mathTest0.divide(1414081664, 1108809);
        int int24 = mathTest0.multiply((-3232), 533500814);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3232) + "'", int15 == (-3232));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1435739648 + "'", int18 == 1435739648);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1275 + "'", int21 == 1275);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1992745152) + "'", int24 == (-1992745152));
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        int int20 = mathTest0.add(0, 1046);
        int int22 = mathTest0.square((int) '#');
        int int25 = mathTest0.subtract((-1764640368), 1962930943);
        int int28 = mathTest0.subtract((-2), 1362701056);
        java.lang.Class<?> wildcardClass29 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1046 + "'", int20 == 1046);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1225 + "'", int22 == 1225);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 567395985 + "'", int25 == 567395985);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1362701058) + "'", int28 == (-1362701058));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((int) (short) -1, 36);
        int int18 = mathTest0.multiply((-51), (-31));
        int int21 = mathTest0.multiply(1237, 1962924603);
        int int24 = mathTest0.subtract((-578834862), 1496089);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1581 + "'", int18 == 1581);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1481211671 + "'", int21 == 1481211671);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-580330951) + "'", int24 == (-580330951));
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.divide((-101), 2);
        int int9 = mathTest0.multiply(101, 10);
        int int12 = mathTest0.multiply(1334311154, 1334646608);
        int int15 = mathTest0.add(3084, (-364053244));
        int int18 = mathTest0.subtract(11082569, 13225);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1010 + "'", int9 == 1010);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-584742496) + "'", int12 == (-584742496));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-364050160) + "'", int15 == (-364050160));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11069344 + "'", int18 == 11069344);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.divide(1496241, 10201);
        int int15 = mathTest0.divide(11161, 1);
        int int18 = mathTest0.subtract((int) (byte) -1, 1962934272);
        int int21 = mathTest0.multiply(1347654771, 1221323382);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 146 + "'", int12 == 146);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11161 + "'", int15 == 11161);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1962934273) + "'", int18 == (-1962934273));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2070448898 + "'", int21 == 2070448898);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.add(100, (int) (short) 1);
        int int9 = mathTest0.subtract(0, 0);
        int int11 = mathTest0.square(12);
        int int14 = mathTest0.subtract((-1156), (-29422512));
        int int17 = mathTest0.multiply(0, 8143731);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 144 + "'", int11 == 144);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29421356 + "'", int14 == 29421356);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int12 = mathTest0.divide((-63), (-990));
        int int14 = mathTest0.square(1000500);
        int int17 = mathTest0.divide((-1640482016), 1174437540);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 272870032 + "'", int14 == 272870032);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int13 = mathTest0.square(10036224);
        int int16 = mathTest0.multiply(1336336, (-1156));
        int int19 = mathTest0.subtract((-1515163), 18974736);
        java.lang.Class<?> wildcardClass20 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 219152384 + "'", int13 == 219152384);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1544804416) + "'", int16 == (-1544804416));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-20489899) + "'", int19 == (-20489899));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.subtract((int) '#', (int) (short) 1);
        int int17 = mathTest0.multiply(1, (-1));
        int int19 = mathTest0.square((-3168));
        int int22 = mathTest0.add((-1507558223), 98);
        int int25 = mathTest0.add((-32), (-27036576));
        int int27 = mathTest0.square((-2088586791));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10036224 + "'", int19 == 10036224);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1507558125) + "'", int22 == (-1507558125));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-27036608) + "'", int25 == (-27036608));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 837929457 + "'", int27 == 837929457);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) ' ');
        int int12 = mathTest0.divide((int) (byte) 100, 36);
        int int15 = mathTest0.subtract(0, 3232);
        int int18 = mathTest0.divide(104060401, 3329);
        int int20 = mathTest0.square(163);
        int int23 = mathTest0.divide((int) (short) 1, 19);
        int int26 = mathTest0.multiply(40092, 1724867072);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3232) + "'", int15 == (-3232));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 31258 + "'", int18 == 31258);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 26569 + "'", int20 == 26569);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 102217728 + "'", int26 == 102217728);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square(5200);
        int int14 = mathTest0.multiply((-7), 13);
        int int17 = mathTest0.multiply((-27034267), (-13));
        java.lang.Class<?> wildcardClass18 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27040000 + "'", int11 == 27040000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-91) + "'", int14 == (-91));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 351445471 + "'", int17 == 351445471);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(12, 100);
        int int15 = mathTest0.subtract(0, (-1156));
        int int17 = mathTest0.square(6880129);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 112 + "'", int12 == 112);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1156 + "'", int15 == 1156);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1340487425 + "'", int17 == 1340487425);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((-1), (-50));
        int int18 = mathTest0.add((-6476), 1962934338);
        int int21 = mathTest0.divide((-341), (-13503587));
        int int24 = mathTest0.add((-1065096738), 1347636419);
        java.lang.Class<?> wildcardClass25 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1962927862 + "'", int18 == 1962927862);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 282539681 + "'", int24 == 282539681);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int12 = mathTest0.multiply(144, 1594884096);
        int int15 = mathTest0.divide(4356, 31);
        int int18 = mathTest0.subtract((-13503600), 1679616);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2030043136 + "'", int12 == 2030043136);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 140 + "'", int15 == 140);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-15183216) + "'", int18 == (-15183216));
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.subtract((int) (short) 0, (int) '#');
        int int15 = mathTest0.subtract((-1), 100);
        int int18 = mathTest0.add(5151, (-51));
        int int21 = mathTest0.divide(27040000, (-1086356767));
        int int23 = mathTest0.square((-698049148));
        java.lang.Class<?> wildcardClass24 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-35) + "'", int12 == (-35));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-101) + "'", int15 == (-101));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5100 + "'", int18 == 5100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 537603088 + "'", int23 == 537603088);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.add((int) (short) 1, 0);
        int int14 = mathTest0.multiply((-399), 1156);
        int int17 = mathTest0.subtract(0, 0);
        int int20 = mathTest0.divide((-3084), 1290100);
        int int23 = mathTest0.add(2018344464, 1842663389);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-461244) + "'", int14 == (-461244));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-433959443) + "'", int23 == (-433959443));
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int11 = mathTest0.square(3232);
        int int14 = mathTest0.divide((-32), (int) (short) 1);
        int int17 = mathTest0.add(36, 1010);
        int int20 = mathTest0.subtract((int) 'a', (-31));
        int int23 = mathTest0.divide(1000500, 805857023);
        java.lang.Class<?> wildcardClass24 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10445824 + "'", int11 == 10445824);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-32) + "'", int14 == (-32));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1046 + "'", int17 == 1046);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 128 + "'", int20 == 128);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
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
        int int28 = mathTest0.subtract((-1362701058), (-1094038400));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5151 + "'", int14 == 5151);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1732640) + "'", int17 == (-1732640));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10201 + "'", int19 == 10201);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 208780 + "'", int22 == 208780);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-268662658) + "'", int28 == (-268662658));
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.subtract(1357853952, 14747159);
        int int17 = mathTest0.divide(1724707841, 629);
        int int20 = mathTest0.subtract(660805517, 18352);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1343106793 + "'", int14 == 1343106793);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2741983 + "'", int17 == 2741983);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 660787165 + "'", int20 == 660787165);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int8 = mathTest0.square((-51));
        int int11 = mathTest0.subtract(100, (-190));
        int int14 = mathTest0.subtract((-138), 152);
        int int17 = mathTest0.subtract((-1065097728), (-990));
        int int20 = mathTest0.subtract(361, 411972485);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2601 + "'", int8 == 2601);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 290 + "'", int11 == 290);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-290) + "'", int14 == (-290));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1065096738) + "'", int17 == (-1065096738));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-411972124) + "'", int20 == (-411972124));
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square(5200);
        int int14 = mathTest0.divide(152, (-61));
        int int17 = mathTest0.subtract(29175, (-327155712));
        int int20 = mathTest0.add(2018344464, (-1190896240));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27040000 + "'", int11 == 27040000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-2) + "'", int14 == (-2));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 327184887 + "'", int17 == 327184887);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 827448224 + "'", int20 == 827448224);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.add((int) (byte) -1, (int) '4');
        int int12 = mathTest0.subtract(150, 51);
        int int15 = mathTest0.add((int) (short) 1, 1);
        int int18 = mathTest0.multiply(0, (-980));
        int int21 = mathTest0.add((int) (byte) 10, 990);
        int int24 = mathTest0.multiply(1486572, 0);
        int int27 = mathTest0.subtract(81441024, (-892976127));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 99 + "'", int12 == 99);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1000 + "'", int21 == 1000);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 974417151 + "'", int27 == 974417151);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.divide((-101), 2);
        int int8 = mathTest0.square(1849);
        int int11 = mathTest0.divide((int) (short) 10, (-5681));
        int int14 = mathTest0.add(1202187776, (-781697343));
        java.lang.Class<?> wildcardClass15 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3418801 + "'", int8 == 3418801);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 420490433 + "'", int14 == 420490433);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int11 = mathTest0.square(3232);
        int int14 = mathTest0.divide((-32), (int) (short) 1);
        int int17 = mathTest0.add(36, 1010);
        int int20 = mathTest0.subtract((-61), (int) (short) 10);
        int int23 = mathTest0.subtract(13, 18352);
        java.lang.Class<?> wildcardClass24 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10445824 + "'", int11 == 10445824);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-32) + "'", int14 == (-32));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1046 + "'", int17 == 1046);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-71) + "'", int20 == (-71));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-18339) + "'", int23 == (-18339));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(12, 100);
        int int15 = mathTest0.add(2601, (-51));
        int int18 = mathTest0.add(29175, (-1200553984));
        int int21 = mathTest0.divide((-4222), (-3));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 112 + "'", int12 == 112);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2550 + "'", int15 == 2550);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1200524809) + "'", int18 == (-1200524809));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1407 + "'", int21 == 1407);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.subtract((int) (short) -1, (int) (short) 100);
        int int16 = mathTest0.square(101);
        int int18 = mathTest0.square(1601400768);
        int int21 = mathTest0.add(1614374000, 148155);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-101) + "'", int14 == (-101));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10201 + "'", int16 == 10201);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 390598656 + "'", int18 == 390598656);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1614522155 + "'", int21 == 1614522155);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((int) (short) -1, 36);
        int int18 = mathTest0.divide((-1488), 112);
        int int21 = mathTest0.add(29421356, (int) (byte) 100);
        int int23 = mathTest0.square((-27036766));
        int int26 = mathTest0.multiply(312899521, 10445824);
        int int29 = mathTest0.multiply((-546213652), (-568574704));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-13) + "'", int18 == (-13));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 29421456 + "'", int21 == 29421456);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 461828740 + "'", int23 == 461828740);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1738957824 + "'", int26 == 1738957824);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 13585088 + "'", int29 == 13585088);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((-1), (-50));
        int int18 = mathTest0.subtract(429549516, 0);
        int int21 = mathTest0.divide((-252448), (-27036767));
        int int23 = mathTest0.square((-127500));
        int int25 = mathTest0.square((-262701));
        int int28 = mathTest0.subtract((-367), 128);
        int int31 = mathTest0.subtract(2126394615, 26569);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 429549516 + "'", int18 == 429549516);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-923619184) + "'", int23 == (-923619184));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 292338665 + "'", int25 == 292338665);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-495) + "'", int28 == (-495));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2126368046 + "'", int31 == 2126368046);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.divide(1496241, 10201);
        int int15 = mathTest0.divide(11161, 1);
        int int18 = mathTest0.subtract((int) (byte) -1, 1962934272);
        int int20 = mathTest0.square(117);
        int int23 = mathTest0.add((-805857024), (-13));
        int int26 = mathTest0.multiply(1041887, 1023);
        java.lang.Class<?> wildcardClass27 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 146 + "'", int12 == 146);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11161 + "'", int15 == 11161);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1962934273) + "'", int18 == (-1962934273));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 13689 + "'", int20 == 13689);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-805857037) + "'", int23 == (-805857037));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1065850401 + "'", int26 == 1065850401);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.subtract((int) '#', (int) (short) 1);
        int int17 = mathTest0.multiply(1, (-1));
        int int20 = mathTest0.divide((-2244), 1892066507);
        java.lang.Class<?> wildcardClass21 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) ' ');
        int int12 = mathTest0.divide((int) (byte) 100, 36);
        int int15 = mathTest0.divide(0, (-1));
        int int17 = mathTest0.square((-32));
        java.lang.Class<?> wildcardClass18 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1024 + "'", int17 == 1024);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((int) (short) -1, 36);
        int int18 = mathTest0.divide((-2), (-61));
        int int21 = mathTest0.multiply((-41602), (-1515163));
        int int24 = mathTest0.multiply((-270), 109330155);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1390698314) + "'", int21 == (-1390698314));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 545629222 + "'", int24 == 545629222);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
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
        java.lang.Class<?> wildcardClass34 = mathTest0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(3232, (-3168));
        int int8 = mathTest0.square((-3232));
        int int11 = mathTest0.subtract((int) (byte) 100, (-63));
        int int14 = mathTest0.subtract((-63), (int) (byte) 0);
        int int16 = mathTest0.square(1346542369);
        int int19 = mathTest0.subtract(40092, (-286589));
        int int22 = mathTest0.subtract((int) (short) 100, 217038);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10445824 + "'", int8 == 10445824);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 163 + "'", int11 == 163);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-63) + "'", int14 == (-63));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-83559871) + "'", int16 == (-83559871));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 326681 + "'", int19 == 326681);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-216938) + "'", int22 == (-216938));
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((-32), 99);
        int int8 = mathTest0.square((-1156));
        int int11 = mathTest0.multiply(296310, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3168) + "'", int6 == (-3168));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1336336 + "'", int8 == 1336336);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.subtract((int) '#', (int) (short) 1);
        int int17 = mathTest0.multiply(1, (-1));
        int int19 = mathTest0.square((-3168));
        int int22 = mathTest0.add((-1507558223), 98);
        int int25 = mathTest0.subtract(43803810, (-94292389));
        java.lang.Class<?> wildcardClass26 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10036224 + "'", int19 == 10036224);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1507558125) + "'", int22 == (-1507558125));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 138096199 + "'", int25 == 138096199);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((-1), (-50));
        int int18 = mathTest0.divide((int) (short) -1, 163);
        int int21 = mathTest0.multiply(1336336, 29421456);
        int int23 = mathTest0.square(3329);
        int int25 = mathTest0.square((-2720));
        int int28 = mathTest0.multiply((-15183216), (-1624607648));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 820197632 + "'", int21 == 820197632);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 11082241 + "'", int23 == 11082241);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 7398400 + "'", int25 == 7398400);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1440205312) + "'", int28 == (-1440205312));
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square(5200);
        int int14 = mathTest0.divide(152, (-61));
        int int17 = mathTest0.subtract(31258, 1702);
        int int20 = mathTest0.subtract((-1397199231), (-675));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27040000 + "'", int11 == 27040000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-2) + "'", int14 == (-2));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 29556 + "'", int17 == 29556);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1397198556) + "'", int20 == (-1397198556));
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        int int20 = mathTest0.add(0, 1046);
        int int22 = mathTest0.square((int) '#');
        int int25 = mathTest0.multiply(1600856285, 150994944);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1046 + "'", int20 == 1046);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1225 + "'", int22 == 1225);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-989855744) + "'", int25 == (-989855744));
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(3232, (-3168));
        int int8 = mathTest0.square((-3232));
        int int11 = mathTest0.add(29421356, 112);
        int int14 = mathTest0.divide((int) (byte) 10, 13516830);
        int int17 = mathTest0.subtract((-364053231), 1688954796);
        int int20 = mathTest0.subtract(429549516, 217038);
        int int23 = mathTest0.divide(29556, 1990028532);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10445824 + "'", int8 == 10445824);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 29421468 + "'", int11 == 29421468);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-2053008027) + "'", int17 == (-2053008027));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 429332478 + "'", int20 == 429332478);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int12 = mathTest0.multiply(0, 210);
        int int15 = mathTest0.add((-50), (int) 'a');
        int int18 = mathTest0.divide((-60518400), 1624939024);
        int int20 = mathTest0.square((-963545038));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 47 + "'", int15 == 47);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1189942844) + "'", int20 == (-1189942844));
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int5 = mathTest0.square((int) (byte) 10);
        int int7 = mathTest0.square((-101));
        int int10 = mathTest0.multiply(3329, (-399));
        int int12 = mathTest0.square(29833266);
        int int15 = mathTest0.divide((-38228), 421232640);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10201 + "'", int7 == 10201);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1328271) + "'", int10 == (-1328271));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-837686844) + "'", int12 == (-837686844));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
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
        java.lang.Class<?> wildcardClass36 = mathTest0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.subtract((int) '#', (int) (short) 1);
        int int17 = mathTest0.multiply(1, (-1));
        int int20 = mathTest0.subtract(1962934272, (-66));
        int int23 = mathTest0.divide(1192156252, 411972485);
        int int26 = mathTest0.multiply(1569782724, 1221323382);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1962934338 + "'", int20 == 1962934338);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1801532504 + "'", int26 == 1801532504);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((int) (short) -1, 36);
        int int18 = mathTest0.divide((-1488), 112);
        int int21 = mathTest0.add(29421356, (int) (byte) 100);
        int int23 = mathTest0.square((-27036766));
        int int26 = mathTest0.multiply(312899521, 10445824);
        int int29 = mathTest0.subtract(596318976, 158);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-13) + "'", int18 == (-13));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 29421456 + "'", int21 == 29421456);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 461828740 + "'", int23 == 461828740);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1738957824 + "'", int26 == 1738957824);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 596318818 + "'", int29 == 596318818);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
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
        int int27 = mathTest0.subtract((-1789478103), (-137280));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5151 + "'", int14 == 5151);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1732640) + "'", int17 == (-1732640));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10201 + "'", int19 == 10201);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 26569 + "'", int21 == 26569);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 176203232 + "'", int24 == 176203232);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1789340823) + "'", int27 == (-1789340823));
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        int int20 = mathTest0.multiply(99, (int) (short) 1);
        int int23 = mathTest0.multiply((-262701), 29421468);
        java.lang.Class<?> wildcardClass24 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 99 + "'", int20 == 99);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1892067732 + "'", int23 == 1892067732);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.add((-190), (int) '4');
        int int16 = mathTest0.square((int) 'a');
        int int19 = mathTest0.subtract((-1190), 950697);
        int int22 = mathTest0.add(361, 15046285);
        java.lang.Class<?> wildcardClass23 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-138) + "'", int14 == (-138));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9409 + "'", int16 == 9409);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-951887) + "'", int19 == (-951887));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 15046646 + "'", int22 == 15046646);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.subtract((int) '#', (int) (short) 100);
        int int12 = mathTest0.divide(0, (-1021));
        java.lang.Class<?> wildcardClass13 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-65) + "'", int9 == (-65));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
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
        int int28 = mathTest0.multiply((-11329044), 659992241);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 99 + "'", int20 == 99);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1657855020 + "'", int28 == 1657855020);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        int int20 = mathTest0.subtract(12, (-3295));
        int int23 = mathTest0.add((-101), 112);
        int int26 = mathTest0.divide((-61254896), 1079444356);
        int int29 = mathTest0.divide(0, (-170769751));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3307 + "'", int20 == 3307);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 11 + "'", int23 == 11);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int12 = mathTest0.multiply(144, 1594884096);
        int int15 = mathTest0.subtract((-992), 1042102);
        int int18 = mathTest0.multiply(1496699, 0);
        int int21 = mathTest0.add(4700, 12508860);
        java.lang.Class<?> wildcardClass22 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2030043136 + "'", int12 == 2030043136);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1043094) + "'", int15 == (-1043094));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 12513560 + "'", int21 == 12513560);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.add(2092, 1494149);
        int int17 = mathTest0.square(1530169);
        int int20 = mathTest0.multiply((-56831036), 1962931076);
        int int22 = mathTest0.square((-1690215152));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1496241 + "'", int15 == 1496241);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 659992241 + "'", int17 == 659992241);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-568574704) + "'", int20 == (-568574704));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1007378176) + "'", int22 == (-1007378176));
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int13 = mathTest0.square(10036224);
        int int16 = mathTest0.multiply(1336336, (-1156));
        int int18 = mathTest0.square(32);
        int int21 = mathTest0.subtract((-1640482016), 1702726656);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 219152384 + "'", int13 == 219152384);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1544804416) + "'", int16 == (-1544804416));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1024 + "'", int18 == 1024);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 951758624 + "'", int21 == 951758624);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int8 = mathTest0.square((-51));
        int int11 = mathTest0.divide(18948609, 1499341);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = mathTest0.divide((-123), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Cannot divide by zero.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2601 + "'", int8 == 2601);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 12 + "'", int11 == 12);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.divide(0, 5200);
        int int14 = mathTest0.multiply((int) (short) 1, (int) (short) 10);
        int int17 = mathTest0.multiply((-3232), 10201);
        int int20 = mathTest0.subtract(63, (-990));
        int int23 = mathTest0.subtract((-134969936), (-109));
        int int26 = mathTest0.subtract(1, 943686359);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-32969632) + "'", int17 == (-32969632));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1053 + "'", int20 == 1053);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-134969827) + "'", int23 == (-134969827));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-943686358) + "'", int26 == (-943686358));
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) ' ');
        int int12 = mathTest0.divide((int) (byte) 100, 36);
        int int15 = mathTest0.subtract(0, 3232);
        int int18 = mathTest0.divide(104060401, 3329);
        int int20 = mathTest0.square(163);
        int int23 = mathTest0.divide(10036323, (-2244));
        int int26 = mathTest0.add(3416061, 1646354688);
        int int29 = mathTest0.add((-4472), (-9248822));
        java.lang.Class<?> wildcardClass30 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3232) + "'", int15 == (-3232));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 31258 + "'", int18 == 31258);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 26569 + "'", int20 == 26569);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-4472) + "'", int23 == (-4472));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1649770749 + "'", int26 == 1649770749);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-9253294) + "'", int29 == (-9253294));
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.multiply(101, 51);
        int int17 = mathTest0.multiply(34, (-50960));
        int int19 = mathTest0.square(101);
        int int22 = mathTest0.add(461828740, (-1653864505));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5151 + "'", int14 == 5151);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1732640) + "'", int17 == (-1732640));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10201 + "'", int19 == 10201);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1192035765) + "'", int22 == (-1192035765));
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(3232, (-3168));
        int int8 = mathTest0.square((-3232));
        int int11 = mathTest0.add(29421356, 112);
        int int14 = mathTest0.divide((int) (byte) 10, 13516830);
        int int17 = mathTest0.subtract((-364053231), 1688954796);
        int int20 = mathTest0.subtract(429549516, 217038);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = mathTest0.divide(4353, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Cannot divide by zero.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10445824 + "'", int8 == 10445824);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 29421468 + "'", int11 == 29421468);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-2053008027) + "'", int17 == (-2053008027));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 429332478 + "'", int20 == 429332478);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((-32), 99);
        int int9 = mathTest0.divide((int) (short) 0, (int) (short) 100);
        int int12 = mathTest0.add((-3295), (-3181));
        int int15 = mathTest0.add(0, 1346542369);
        int int18 = mathTest0.add(2499561, (-923619184));
        int int20 = mathTest0.square(3232);
        int int23 = mathTest0.divide(574619648, (-364050160));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3168) + "'", int6 == (-3168));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6476) + "'", int12 == (-6476));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1346542369 + "'", int15 == 1346542369);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-921119623) + "'", int18 == (-921119623));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10445824 + "'", int20 == 10445824);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((int) (short) -1, 36);
        int int18 = mathTest0.divide((-2), (-61));
        int int21 = mathTest0.add((-27036775), (-2));
        int int24 = mathTest0.multiply((-805866716), (-1488));
        int int27 = mathTest0.multiply(345137331, 1991312875);
        int int30 = mathTest0.multiply((-26), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-27036777) + "'", int21 == (-27036777));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 833797824 + "'", int24 == 833797824);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 470106961 + "'", int27 == 470106961);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        int int20 = mathTest0.subtract(12, (-3295));
        int int23 = mathTest0.multiply((-138), 4356);
        int int26 = mathTest0.subtract(1962934272, 9669);
        int int29 = mathTest0.add((-980), 763532);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3307 + "'", int20 == 3307);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-601128) + "'", int23 == (-601128));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1962924603 + "'", int26 == 1962924603);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 762552 + "'", int29 == 762552);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.subtract((int) (short) 0, (int) '#');
        int int15 = mathTest0.subtract((-1), 100);
        int int18 = mathTest0.add(5151, (-51));
        int int21 = mathTest0.multiply((-2), (-65));
        int int24 = mathTest0.divide(32, 17960388);
        int int27 = mathTest0.multiply(43, (-35));
        int int29 = mathTest0.square((int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-35) + "'", int12 == (-35));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-101) + "'", int15 == (-101));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5100 + "'", int18 == 5100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 130 + "'", int21 == 130);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1505) + "'", int27 == (-1505));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1225 + "'", int29 == 1225);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int5 = mathTest0.square((int) (byte) 10);
        int int8 = mathTest0.subtract(1496241, 152);
        int int10 = mathTest0.square((-20489899));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1496089 + "'", int8 == 1496089);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1387121095) + "'", int10 == (-1387121095));
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.subtract((int) (short) -1, (int) (short) 100);
        int int16 = mathTest0.square(101);
        int int18 = mathTest0.square(99);
        int int21 = mathTest0.add(1724707840, 1792588651);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-101) + "'", int14 == (-101));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10201 + "'", int16 == 10201);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9801 + "'", int18 == 9801);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-777670805) + "'", int21 == (-777670805));
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
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
        int int28 = mathTest0.divide(10424, 429332478);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10036224 + "'", int19 == 10036224);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 148155 + "'", int25 == 148155);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((int) (short) -1, 36);
        int int17 = mathTest0.square((-66));
        int int19 = mathTest0.square(19);
        int int22 = mathTest0.multiply(102217728, 85284);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4356 + "'", int17 == 4356);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 361 + "'", int19 == 361);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1246896128) + "'", int22 == (-1246896128));
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int12 = mathTest0.add(1962934272, (-3196));
        int int15 = mathTest0.subtract((-27036603), (-27));
        int int18 = mathTest0.subtract(533500814, (-1826482112));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1962931076 + "'", int12 == 1962931076);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-27036576) + "'", int15 == (-27036576));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1934984370) + "'", int18 == (-1934984370));
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int13 = mathTest0.square(10036224);
        int int16 = mathTest0.multiply(1336336, (-1156));
        int int19 = mathTest0.subtract((-1515163), 18974736);
        int int22 = mathTest0.subtract(1702726656, 434791462);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 219152384 + "'", int13 == 219152384);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1544804416) + "'", int16 == (-1544804416));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-20489899) + "'", int19 == (-20489899));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1267935194 + "'", int22 == 1267935194);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((-1), (-50));
        int int18 = mathTest0.add((-6476), 1962934338);
        int int21 = mathTest0.subtract((-813), 12);
        int int23 = mathTest0.square((-1081));
        int int26 = mathTest0.add(36819, 1924149248);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1962927862 + "'", int18 == 1962927862);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-825) + "'", int21 == (-825));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1168561 + "'", int23 == 1168561);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1924186067 + "'", int26 == 1924186067);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int11 = mathTest0.square(3232);
        int int14 = mathTest0.divide((-32), (int) (short) 1);
        int int16 = mathTest0.square((-50));
        int int19 = mathTest0.add((-3990), 16318464);
        int int22 = mathTest0.multiply(148155, 2);
        int int25 = mathTest0.add((-50), 1702);
        int int28 = mathTest0.multiply((-980), (-923619184));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10445824 + "'", int11 == 10445824);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-32) + "'", int14 == (-32));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2500 + "'", int16 == 2500);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 16314474 + "'", int19 == 16314474);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 296310 + "'", int22 == 296310);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1652 + "'", int25 == 1652);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1091299136) + "'", int28 == (-1091299136));
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.divide((-101), 2);
        int int9 = mathTest0.multiply(101, 10);
        int int12 = mathTest0.subtract(150, (-2));
        // The following exception was thrown during execution in test generation
        try {
            int int15 = mathTest0.divide(565980994, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Cannot divide by zero.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1010 + "'", int9 == 1010);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 152 + "'", int12 == 152);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((-32), 99);
        int int9 = mathTest0.divide((-3232), 51);
        int int12 = mathTest0.subtract(34, (int) (short) 100);
        int int15 = mathTest0.divide((-13503587), (-3069));
        int int17 = mathTest0.square(3414448);
        java.lang.Class<?> wildcardClass18 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3168) + "'", int6 == (-3168));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-63) + "'", int9 == (-63));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-66) + "'", int12 == (-66));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4399 + "'", int15 == 4399);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1913903360 + "'", int17 == 1913903360);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square((-32969632));
        int int14 = mathTest0.subtract((int) (short) 10, (-1190));
        int int17 = mathTest0.divide(750, 52229);
        int int20 = mathTest0.add((-50938), 1425784965);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 541139968 + "'", int11 == 541139968);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1200 + "'", int14 == 1200);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1425734027 + "'", int20 == 1425734027);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.add((int) (short) 1, 0);
        int int14 = mathTest0.multiply((-399), 1156);
        int int17 = mathTest0.subtract(0, 0);
        int int20 = mathTest0.divide((-3084), 1290100);
        java.lang.Class<?> wildcardClass21 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-461244) + "'", int14 == (-461244));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.subtract((int) (short) -1, (int) (short) 100);
        int int17 = mathTest0.divide(1, 100);
        int int20 = mathTest0.divide(11161, 1499341);
        int int23 = mathTest0.subtract(326681, (-50897));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-101) + "'", int14 == (-101));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 377578 + "'", int23 == 377578);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add((int) (byte) 10, (-3232));
        int int15 = mathTest0.add((-3243), 31);
        int int18 = mathTest0.divide((-7), 144);
        int int21 = mathTest0.divide(1094050, (-1744279840));
        int int24 = mathTest0.add(1351683000, 14);
        int int27 = mathTest0.subtract(560857856, 1099748687);
        int int30 = mathTest0.divide(1457641664, (-29422512));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3222) + "'", int12 == (-3222));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3212) + "'", int15 == (-3212));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1351683014 + "'", int24 == 1351683014);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-538890831) + "'", int27 == (-538890831));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-49) + "'", int30 == (-49));
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(12, 100);
        int int15 = mathTest0.multiply(2, 1046);
        int int17 = mathTest0.square(13516830);
        int int20 = mathTest0.subtract(1964249568, 935011904);
        int int22 = mathTest0.square(2132429056);
        int int25 = mathTest0.divide(1810766268, (-13506830));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 112 + "'", int12 == 112);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2092 + "'", int15 == 2092);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1079444356 + "'", int17 == 1079444356);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1029237664 + "'", int20 == 1029237664);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-388956160) + "'", int22 == (-388956160));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-134) + "'", int25 == (-134));
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.subtract((int) '#', (int) (short) 100);
        int int12 = mathTest0.subtract(10000, (-13506830));
        int int15 = mathTest0.add(1962924603, 1324965);
        int int18 = mathTest0.multiply(1336336, (-1507558125));
        int int21 = mathTest0.divide(303, 2741983);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-65) + "'", int9 == (-65));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 13516830 + "'", int12 == 13516830);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1964249568 + "'", int15 == 1964249568);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1755266352 + "'", int18 == 1755266352);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(3232, (-3168));
        int int8 = mathTest0.square((-3232));
        int int11 = mathTest0.subtract((int) (byte) 100, (-63));
        int int14 = mathTest0.add((-980), (-101));
        int int16 = mathTest0.square((-138));
        int int18 = mathTest0.square(1581);
        int int21 = mathTest0.divide(828396608, 12);
        int int24 = mathTest0.multiply(219152384, (-1093246976));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10445824 + "'", int8 == 10445824);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 163 + "'", int11 == 163);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1081) + "'", int14 == (-1081));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 19044 + "'", int16 == 19044);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2499561 + "'", int18 == 2499561);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 69033050 + "'", int21 == 69033050);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        int int20 = mathTest0.divide(2500, (-13503535));
        int int22 = mathTest0.square((-190));
        int int25 = mathTest0.multiply((-638930), 203);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 36100 + "'", int22 == 36100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-129702790) + "'", int25 == (-129702790));
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply((-3627), (-29338412));
        int int14 = mathTest0.multiply(268, 182);
        int int16 = mathTest0.square((-28));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-963762076) + "'", int11 == (-963762076));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 48776 + "'", int14 == 48776);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 784 + "'", int16 == 784);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(3232, (-3168));
        int int9 = mathTest0.divide(5151, (-399));
        int int11 = mathTest0.square((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-12) + "'", int9 == (-12));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square((-32969632));
        int int14 = mathTest0.divide((-2033540108), 2550);
        int int17 = mathTest0.add((-1623939036), 290);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 541139968 + "'", int11 == 541139968);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-797466) + "'", int14 == (-797466));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1623938746) + "'", int17 == (-1623938746));
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        int int20 = mathTest0.multiply((-1081), 0);
        int int22 = mathTest0.square(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.add((int) (short) 1, 0);
        int int14 = mathTest0.add(51, (-3232));
        int int17 = mathTest0.subtract((-3222), 100);
        int int20 = mathTest0.add(290, 999698);
        int int23 = mathTest0.multiply((-38228), (-26076203));
        int int26 = mathTest0.subtract((-638930), (-3295));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3181) + "'", int14 == (-3181));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-3322) + "'", int17 == (-3322));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 999988 + "'", int20 == 999988);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 408675612 + "'", int23 == 408675612);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-635635) + "'", int26 == (-635635));
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square(5200);
        int int14 = mathTest0.multiply((-7), 13);
        int int17 = mathTest0.multiply((-27034267), (-13));
        int int19 = mathTest0.square((-161));
        java.lang.Class<?> wildcardClass20 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27040000 + "'", int11 == 27040000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-91) + "'", int14 == (-91));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 351445471 + "'", int17 == 351445471);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 25921 + "'", int19 == 25921);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        mathTest mathTest0 = new mathTest();
        int int2 = mathTest0.square((-101));
        int int5 = mathTest0.multiply(1594884096, (-29422512));
        int int8 = mathTest0.divide(775373112, 1168561);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10201 + "'", int2 == 10201);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1962934272 + "'", int5 == 1962934272);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 663 + "'", int8 == 663);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square((-43));
        int int14 = mathTest0.add((-584742523), 2059468800);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1849 + "'", int11 == 1849);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1474726277 + "'", int14 == 1474726277);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.subtract((int) '#', (int) (short) 1);
        int int17 = mathTest0.divide((-743732520), 1174437540);
        int int20 = mathTest0.add(52290, 85284);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 137574 + "'", int20 == 137574);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.divide(0, 5200);
        int int13 = mathTest0.square((int) (short) 0);
        int int16 = mathTest0.subtract(16318464, 1281588);
        int int19 = mathTest0.add((-50938), 1029237664);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 15036876 + "'", int16 == 15036876);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1029186726 + "'", int19 == 1029186726);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.subtract((int) (short) 0, (int) '#');
        int int15 = mathTest0.subtract((-1), 100);
        int int18 = mathTest0.add(5151, (-51));
        int int21 = mathTest0.divide(27040000, (-1086356767));
        int int24 = mathTest0.multiply((-27037278), 1414081664);
        java.lang.Class<?> wildcardClass25 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-35) + "'", int12 == (-35));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-101) + "'", int15 == (-101));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5100 + "'", int18 == 5100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-663574272) + "'", int24 == (-663574272));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(12, 100);
        int int15 = mathTest0.subtract(0, (-1156));
        int int18 = mathTest0.divide((-3), 5151);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 112 + "'", int12 == 112);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1156 + "'", int15 == 1156);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.divide((-101), 2);
        int int9 = mathTest0.multiply(101, 10);
        int int12 = mathTest0.subtract(150, (-2));
        int int14 = mathTest0.square((-1007378176));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1010 + "'", int9 == 1010);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 152 + "'", int12 == 152);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1296105472 + "'", int14 == 1296105472);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        mathTest mathTest0 = new mathTest();
        int int2 = mathTest0.square((-101));
        int int5 = mathTest0.divide((-71), 19);
        int int8 = mathTest0.subtract((-65), (-109));
        int int11 = mathTest0.subtract(0, 461828740);
        java.lang.Class<?> wildcardClass12 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10201 + "'", int2 == 10201);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-3) + "'", int5 == (-3));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 44 + "'", int8 == 44);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-461828740) + "'", int11 == (-461828740));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        int int20 = mathTest0.subtract(12, (-3295));
        int int23 = mathTest0.multiply((-138), 4356);
        int int25 = mathTest0.square(311400096);
        java.lang.Class<?> wildcardClass26 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3307 + "'", int20 == 3307);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-601128) + "'", int23 == (-601128));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 526377984 + "'", int25 == 526377984);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.divide(0, 5200);
        int int14 = mathTest0.multiply((int) (short) 1, (int) (short) 10);
        int int17 = mathTest0.multiply((-3232), 10201);
        int int20 = mathTest0.divide(22500, 10445824);
        int int23 = mathTest0.multiply(999698, 0);
        int int26 = mathTest0.add(923, 10036252);
        int int29 = mathTest0.add(210, (-134969827));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-32969632) + "'", int17 == (-32969632));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10037175 + "'", int26 == 10037175);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-134969617) + "'", int29 == (-134969617));
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.divide((-101), 2);
        int int9 = mathTest0.multiply(101, 10);
        int int12 = mathTest0.multiply(2601, (-101));
        int int14 = mathTest0.square(36);
        int int17 = mathTest0.multiply((-65), (-1312236352));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1010 + "'", int9 == 1010);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-262701) + "'", int12 == (-262701));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1296 + "'", int14 == 1296);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-603983040) + "'", int17 == (-603983040));
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.subtract((int) '#', (int) (short) 1);
        int int17 = mathTest0.multiply(1, (-1));
        int int20 = mathTest0.subtract(1962934272, (-66));
        int int23 = mathTest0.divide(1000500, 15046285);
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
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((-32), 99);
        int int9 = mathTest0.divide((-3232), 51);
        int int12 = mathTest0.multiply(0, 2);
        int int15 = mathTest0.divide(1094116, 1042441);
        int int18 = mathTest0.multiply((-1021), (-13503587));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3168) + "'", int6 == (-3168));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-63) + "'", int9 == (-63));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 902260439 + "'", int18 == 902260439);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.add(2092, 1494149);
        int int17 = mathTest0.square(1530169);
        int int20 = mathTest0.divide((-860132015), 22500);
        java.lang.Class<?> wildcardClass21 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1496241 + "'", int15 == 1496241);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 659992241 + "'", int17 == 659992241);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-38228) + "'", int20 == (-38228));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) (short) 1);
        int int12 = mathTest0.multiply(1581, 5151);
        int int15 = mathTest0.multiply(312899521, 509259459);
        java.lang.Class<?> wildcardClass16 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8143731 + "'", int12 == 8143731);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 302802435 + "'", int15 == 302802435);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) ' ');
        int int12 = mathTest0.add((-1042102), 1000500);
        int int15 = mathTest0.add((-161), (-109));
        int int18 = mathTest0.add(217038, (-963762076));
        int int20 = mathTest0.square((-134));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-41602) + "'", int12 == (-41602));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-270) + "'", int15 == (-270));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-963545038) + "'", int18 == (-963545038));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 17956 + "'", int20 == 17956);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((int) (short) -1, 36);
        int int18 = mathTest0.divide((-1488), 112);
        int int21 = mathTest0.add(29421356, (int) (byte) 100);
        int int24 = mathTest0.subtract(951758624, 11612725);
        int int26 = mathTest0.square((-9248822));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-13) + "'", int18 == (-13));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 29421456 + "'", int21 == 29421456);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 940145899 + "'", int24 == 940145899);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2139720548 + "'", int26 == 2139720548);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int5 = mathTest0.square((int) (byte) 10);
        int int8 = mathTest0.add((-1488), 3190);
        int int11 = mathTest0.multiply((-1042405), 2500);
        int int14 = mathTest0.add(3364195, 1494149);
        int int16 = mathTest0.square((-167544));
        // The following exception was thrown during execution in test generation
        try {
            int int19 = mathTest0.divide(2126394615, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Cannot divide by zero.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1702 + "'", int8 == 1702);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1688954796 + "'", int11 == 1688954796);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4858344 + "'", int14 == 4858344);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1993779136) + "'", int16 == (-1993779136));
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.divide((-101), 2);
        int int9 = mathTest0.multiply(101, 10);
        int int12 = mathTest0.multiply(1334311154, 1334646608);
        java.lang.Class<?> wildcardClass13 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1010 + "'", int9 == 1010);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-584742496) + "'", int12 == (-584742496));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((int) (short) -1, 36);
        int int18 = mathTest0.multiply((-51), (-31));
        int int21 = mathTest0.multiply(10424, 27037296);
        int int24 = mathTest0.subtract(0, (int) '4');
        java.lang.Class<?> wildcardClass25 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1581 + "'", int18 == 1581);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1631068032) + "'", int21 == (-1631068032));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-52) + "'", int24 == (-52));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square(5200);
        int int14 = mathTest0.subtract((-43), (-35));
        int int17 = mathTest0.divide(0, (-134969936));
        int int20 = mathTest0.add(763532, (-1576));
        int int23 = mathTest0.subtract(1624939024, (-1826482112));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27040000 + "'", int11 == 27040000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-8) + "'", int14 == (-8));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 761956 + "'", int20 == 761956);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-843546160) + "'", int23 == (-843546160));
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        int int20 = mathTest0.multiply(99, (int) (short) 1);
        int int22 = mathTest0.square((-1));
        int int25 = mathTest0.add((-50897), (-38));
        int int28 = mathTest0.multiply(31258, 10214416);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 99 + "'", int20 == 99);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-50935) + "'", int25 == (-50935));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1454635424 + "'", int28 == 1454635424);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
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
        int int32 = mathTest0.add((-270), (-50938));
        int int35 = mathTest0.multiply(1347636419, 27426628);
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-51208) + "'", int32 == (-51208));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-6610740) + "'", int35 == (-6610740));
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square((-32969632));
        int int14 = mathTest0.subtract((int) (short) 10, (-1190));
        int int17 = mathTest0.divide(750, 52229);
        int int20 = mathTest0.add((-1222171648), 28774156);
        int int22 = mathTest0.square((-1735141));
        int int25 = mathTest0.multiply(1221924368, 604342121);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 541139968 + "'", int11 == 541139968);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1200 + "'", int14 == 1200);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1193397492) + "'", int20 == (-1193397492));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-57784615) + "'", int22 == (-57784615));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-329745264) + "'", int25 == (-329745264));
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((int) (short) -1, 36);
        int int18 = mathTest0.multiply((-51), (-31));
        int int21 = mathTest0.multiply(10424, 27037296);
        int int24 = mathTest0.subtract(0, (int) '4');
        int int27 = mathTest0.multiply((-5919729), (-129702790));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1581 + "'", int18 == 1581);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1631068032) + "'", int21 == (-1631068032));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-52) + "'", int24 == (-52));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1641194714) + "'", int27 == (-1641194714));
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
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
        int int28 = mathTest0.multiply(25921, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4356 + "'", int17 == 4356);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-9669) + "'", int25 == (-9669));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(3232, (-3168));
        int int8 = mathTest0.square((-3232));
        int int11 = mathTest0.subtract((int) (byte) 100, (-63));
        int int14 = mathTest0.add(1099748687, (-2));
        java.lang.Class<?> wildcardClass15 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10445824 + "'", int8 == 10445824);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 163 + "'", int11 == 163);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1099748685 + "'", int14 == 1099748685);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add(52, (-3295));
        int int5 = mathTest0.square((-3168));
        int int8 = mathTest0.subtract((-365052929), 1480589312);
        int int11 = mathTest0.add(19044, 2076);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3243) + "'", int3 == (-3243));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10036224 + "'", int5 == 10036224);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1845642241) + "'", int8 == (-1845642241));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 21120 + "'", int11 == 21120);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        int int20 = mathTest0.subtract(12, (-3295));
        int int23 = mathTest0.multiply((-138), 4356);
        int int26 = mathTest0.add((-1826482112), (-13525933));
        int int29 = mathTest0.subtract((-146), (-134970099));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3307 + "'", int20 == 3307);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-601128) + "'", int23 == (-601128));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1840008045) + "'", int26 == (-1840008045));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 134969953 + "'", int29 == 134969953);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add(52, (-3295));
        int int6 = mathTest0.multiply(1200, (-124));
        int int9 = mathTest0.divide(1334646608, 344);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3243) + "'", int3 == (-3243));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-148800) + "'", int6 == (-148800));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3879786 + "'", int9 == 3879786);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.add((int) (short) 1, (-32));
        int int12 = mathTest0.multiply(1094050, (-71));
        int int15 = mathTest0.multiply(115, 950697);
        int int18 = mathTest0.multiply(750, 47);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-31) + "'", int9 == (-31));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-77677550) + "'", int12 == (-77677550));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 109330155 + "'", int15 == 109330155);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35250 + "'", int18 == 35250);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int14 = mathTest0.square(0);
        int int16 = mathTest0.square(5200);
        int int19 = mathTest0.divide(117, (-5073684));
        int int22 = mathTest0.multiply((-217396684), 501081033);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 27040000 + "'", int16 == 27040000);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-676798764) + "'", int22 == (-676798764));
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((-1), (-50));
        int int18 = mathTest0.add((-6476), 1962934338);
        int int21 = mathTest0.subtract((-813), 12);
        int int24 = mathTest0.divide(10036252, 9801);
        java.lang.Class<?> wildcardClass25 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1962927862 + "'", int18 == 1962927862);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-825) + "'", int21 == (-825));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1024 + "'", int24 == 1024);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
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
        int int29 = mathTest0.subtract((-327155712), (-1600559975));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-32969632) + "'", int17 == (-32969632));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1000500 + "'", int23 == 1000500);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1042405) + "'", int26 == (-1042405));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1273404263 + "'", int29 == 1273404263);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int12 = mathTest0.add(290, 2);
        int int15 = mathTest0.divide(2030043136, 1480589312);
        int int18 = mathTest0.multiply(3045332, 999698);
        int int21 = mathTest0.add(0, 15046646);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 292 + "'", int12 == 292);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-719503128) + "'", int18 == (-719503128));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 15046646 + "'", int21 == 15046646);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) ' ');
        int int12 = mathTest0.divide((int) (byte) 100, 36);
        int int15 = mathTest0.subtract((-597361078), 1304336066);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1901697144) + "'", int15 == (-1901697144));
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.subtract(1357853952, 14747159);
        int int17 = mathTest0.divide(1065850401, (-32));
        int int20 = mathTest0.subtract(2741983, (-699588731));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1343106793 + "'", int14 == 1343106793);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-33307825) + "'", int17 == (-33307825));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 702330714 + "'", int20 == 702330714);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int5 = mathTest0.square((-1735140));
        int int8 = mathTest0.subtract(0, (-1042102));
        int int11 = mathTest0.divide(0, 3232);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-61254896) + "'", int5 == (-61254896));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1042102 + "'", int8 == 1042102);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int11 = mathTest0.square(3232);
        int int14 = mathTest0.divide((-32), (int) (short) 1);
        int int17 = mathTest0.add(36, 1010);
        int int20 = mathTest0.multiply(32, 144);
        int int23 = mathTest0.divide(0, 282532054);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10445824 + "'", int11 == 10445824);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-32) + "'", int14 == (-32));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1046 + "'", int17 == 1046);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4608 + "'", int20 == 4608);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.multiply(101, 51);
        int int17 = mathTest0.divide((-65), (-295593424));
        int int20 = mathTest0.divide(27040000, 1494149);
        int int22 = mathTest0.square(1010);
        int int25 = mathTest0.multiply(16314474, 327184887);
        int int28 = mathTest0.add((-5835742), (-6600));
        int int31 = mathTest0.divide(1136037201, (-823));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5151 + "'", int14 == 5151);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 18 + "'", int20 == 18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1020100 + "'", int22 == 1020100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-447823802) + "'", int25 == (-447823802));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-5842342) + "'", int28 == (-5842342));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1380361) + "'", int31 == (-1380361));
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.subtract((int) '#', (int) (short) 1);
        int int17 = mathTest0.multiply(1, (-1));
        int int19 = mathTest0.square((-3168));
        int int22 = mathTest0.divide(1852038144, 1496089);
        int int25 = mathTest0.multiply((-3084), (-13));
        int int27 = mathTest0.square((-17003845));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10036224 + "'", int19 == 10036224);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1237 + "'", int22 == 1237);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 40092 + "'", int25 == 40092);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2136351897 + "'", int27 == 2136351897);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.add((int) (byte) -1, (int) '4');
        int int12 = mathTest0.multiply((int) 'a', (int) (short) 100);
        int int14 = mathTest0.square(219152384);
        int int17 = mathTest0.divide(133, (-50));
        int int20 = mathTest0.add(0, (-3181));
        int int22 = mathTest0.square(1000500);
        int int25 = mathTest0.multiply(2002088192, 3418801);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9700 + "'", int12 == 9700);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-2) + "'", int17 == (-2));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-3181) + "'", int20 == (-3181));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 272870032 + "'", int22 == 272870032);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2057117952 + "'", int25 == 2057117952);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.subtract((int) '#', (int) (short) 100);
        int int11 = mathTest0.square(1174437474);
        int int13 = mathTest0.square((-27036576));
        int int16 = mathTest0.subtract(0, 1614522155);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-65) + "'", int9 == (-65));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-698049148) + "'", int11 == (-698049148));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1222171648) + "'", int13 == (-1222171648));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1614522155) + "'", int16 == (-1614522155));
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(12, 100);
        int int15 = mathTest0.add(2601, (-51));
        int int18 = mathTest0.divide(1881653649, 34);
        int int21 = mathTest0.add(28751656, 1966983424);
        int int24 = mathTest0.add(1818756672, 4189);
        int int26 = mathTest0.square(39906449);
        int int29 = mathTest0.subtract((-1086347664), 1953321121);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 112 + "'", int12 == 112);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2550 + "'", int15 == 2550);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 55342754 + "'", int18 == 55342754);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1995735080 + "'", int21 == 1995735080);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1818760861 + "'", int24 == 1818760861);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1956926943) + "'", int26 == (-1956926943));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1255298511 + "'", int29 == 1255298511);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.subtract(36, 3232);
        int int17 = mathTest0.divide(828396608, 29462604);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3196) + "'", int14 == (-3196));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 28 + "'", int17 == 28);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int14 = mathTest0.square(0);
        int int16 = mathTest0.square(5200);
        int int19 = mathTest0.divide(117, (-5073684));
        int int22 = mathTest0.divide((-127500), 1724707841);
        int int25 = mathTest0.add((-1328271), 220);
        int int28 = mathTest0.divide(429332478, (-9449));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 27040000 + "'", int16 == 27040000);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1328051) + "'", int25 == (-1328051));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-45436) + "'", int28 == (-45436));
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.add(100, (int) (short) 1);
        int int9 = mathTest0.subtract(0, 0);
        int int11 = mathTest0.square(12);
        int int14 = mathTest0.subtract((-1156), (-29422512));
        int int17 = mathTest0.divide(100, 842501840);
        int int20 = mathTest0.subtract(999988, 1624939024);
        int int23 = mathTest0.subtract((-357), 1757167616);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 144 + "'", int11 == 144);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29421356 + "'", int14 == 29421356);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1623939036) + "'", int20 == (-1623939036));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1757167973) + "'", int23 == (-1757167973));
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
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
        int int28 = mathTest0.square(1486572);
        int int31 = mathTest0.subtract(31, 1425734027);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-399) + "'", int17 == (-399));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-190) + "'", int20 == (-190));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 767974712 + "'", int26 == 767974712);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-2011846256) + "'", int28 == (-2011846256));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1425733996) + "'", int31 == (-1425733996));
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add((int) (byte) 10, (-3232));
        int int15 = mathTest0.add((-3243), 31);
        int int18 = mathTest0.divide((-7), 144);
        int int21 = mathTest0.divide(1094050, (-1744279840));
        int int24 = mathTest0.add(1351683000, 14);
        int int26 = mathTest0.square(974417151);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3222) + "'", int12 == (-3222));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3212) + "'", int15 == (-3212));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1351683014 + "'", int24 == 1351683014);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1035983359) + "'", int26 == (-1035983359));
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.subtract((int) (short) 0, (int) '#');
        int int15 = mathTest0.subtract((-1), 100);
        int int18 = mathTest0.add(5151, (-51));
        int int21 = mathTest0.multiply((-2), (-65));
        int int24 = mathTest0.divide(32, 17960388);
        int int27 = mathTest0.multiply(43, (-35));
        int int29 = mathTest0.square(28542624);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-35) + "'", int12 == (-35));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-101) + "'", int15 == (-101));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5100 + "'", int18 == 5100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 130 + "'", int21 == 130);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1505) + "'", int27 == (-1505));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-896801792) + "'", int29 == (-896801792));
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.add((int) (short) 10, 2);
        int int9 = mathTest0.subtract((-776063246), (-1236));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 12 + "'", int6 == 12);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-776062010) + "'", int9 == (-776062010));
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        int int20 = mathTest0.subtract(12, (-3295));
        int int23 = mathTest0.multiply((-138), 4356);
        int int25 = mathTest0.square(311400096);
        int int27 = mathTest0.square((-1206054128));
        int int30 = mathTest0.divide((-957487), (-1744279840));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3307 + "'", int20 == 3307);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-601128) + "'", int23 == (-601128));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 526377984 + "'", int25 == 526377984);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1393254656 + "'", int27 == 1393254656);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int8 = mathTest0.square((-51));
        int int11 = mathTest0.divide(18948609, 1499341);
        int int13 = mathTest0.square((-1086347664));
        int int16 = mathTest0.subtract((-663574272), 1962934272);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2601 + "'", int8 == 2601);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 12 + "'", int11 == 12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2002088192 + "'", int13 == 2002088192);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1668458752 + "'", int16 == 1668458752);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add((int) (byte) 10, (-3232));
        int int15 = mathTest0.add((-3243), 31);
        int int18 = mathTest0.add((-431727059), (-2002091772));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3222) + "'", int12 == (-3222));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3212) + "'", int15 == (-3212));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1861148465 + "'", int18 == 1861148465);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        int int20 = mathTest0.multiply((int) (short) 10, 99);
        int int23 = mathTest0.divide((int) (short) 100, 10445824);
        int int25 = mathTest0.square((-3535));
        int int28 = mathTest0.add(101, 55342754);
        int int31 = mathTest0.subtract(1500422, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 990 + "'", int20 == 990);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 12496225 + "'", int25 == 12496225);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 55342855 + "'", int28 == 55342855);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1500390 + "'", int31 == 1500390);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.add((int) (byte) -1, (int) '4');
        int int12 = mathTest0.multiply((int) 'a', (int) (short) 100);
        int int14 = mathTest0.square(219152384);
        int int17 = mathTest0.divide(133, (-50));
        int int20 = mathTest0.subtract(1838229715, 702330714);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9700 + "'", int12 == 9700);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-2) + "'", int17 == (-2));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1135899001 + "'", int20 == 1135899001);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int5 = mathTest0.square((int) (byte) 10);
        int int8 = mathTest0.subtract(1496241, 152);
        int int10 = mathTest0.square((-4537));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1496089 + "'", int8 == 1496089);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20584369 + "'", int10 == 20584369);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((-32), 99);
        int int9 = mathTest0.divide((-3232), 51);
        int int11 = mathTest0.square(1046);
        int int13 = mathTest0.square(950697);
        int int16 = mathTest0.divide((-13525933), (-330390172));
        int int19 = mathTest0.subtract(408675612, (-963545038));
        int int22 = mathTest0.multiply(420490433, 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3168) + "'", int6 == (-3168));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-63) + "'", int9 == (-63));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1094116 + "'", int11 == 1094116);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1881653649 + "'", int13 == 1881653649);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1372220650 + "'", int19 == 1372220650);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 150301535 + "'", int22 == 150301535);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(3232, (-3168));
        int int8 = mathTest0.square((-3232));
        int int11 = mathTest0.subtract((int) (byte) 100, (-63));
        int int14 = mathTest0.add((-980), (-101));
        int int16 = mathTest0.square((-138));
        int int18 = mathTest0.square(1581);
        int int21 = mathTest0.multiply((-1878499328), (-41602));
        // The following exception was thrown during execution in test generation
        try {
            int int24 = mathTest0.divide(509259459, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Cannot divide by zero.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10445824 + "'", int8 == 10445824);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 163 + "'", int11 == 163);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1081) + "'", int14 == (-1081));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 19044 + "'", int16 == 19044);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2499561 + "'", int18 == 2499561);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1895874560) + "'", int21 == (-1895874560));
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.add((int) (short) 1, 0);
        int int14 = mathTest0.multiply((-399), 1156);
        int int17 = mathTest0.divide(148155, 52);
        int int20 = mathTest0.divide(43, (-3181));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-461244) + "'", int14 == (-461244));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2849 + "'", int17 == 2849);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int14 = mathTest0.square(0);
        int int17 = mathTest0.add(100, 203);
        int int20 = mathTest0.add((int) (byte) 1, (-1563969600));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 303 + "'", int17 == 303);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1563969599) + "'", int20 == (-1563969599));
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(210, (-7));
        int int15 = mathTest0.divide((-865176864), 1053);
        int int18 = mathTest0.subtract(1757167616, 1103809);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 203 + "'", int12 == 203);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-821630) + "'", int15 == (-821630));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1756063807 + "'", int18 == 1756063807);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int12 = mathTest0.add(290, 2);
        int int15 = mathTest0.divide((-1637540284), 268);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 292 + "'", int12 == 292);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-6110224) + "'", int15 == (-6110224));
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        java.lang.Class<?> wildcardClass15 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.add((int) (short) 1, 0);
        int int14 = mathTest0.add(51, (-3232));
        int int17 = mathTest0.subtract(2, 163);
        int int20 = mathTest0.multiply(3, (-1323400240));
        int int23 = mathTest0.divide((-390241792), 1979926512);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3181) + "'", int14 == (-3181));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-161) + "'", int17 == (-161));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 324766576 + "'", int20 == 324766576);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.multiply((-1200553984), 85284);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-320602112) + "'", int15 == (-320602112));
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.add((int) (byte) -1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int12 = mathTest0.divide((-5000), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Cannot divide by zero.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square(5200);
        int int14 = mathTest0.divide(152, (-61));
        int int17 = mathTest0.subtract(31258, 1702);
        int int19 = mathTest0.square(1700859166);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27040000 + "'", int11 == 27040000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-2) + "'", int14 == (-2));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 29556 + "'", int17 == 29556);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1654124668) + "'", int19 == (-1654124668));
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.add((int) (short) 1, 0);
        int int14 = mathTest0.add(51, (-3232));
        int int17 = mathTest0.subtract(2, 163);
        int int20 = mathTest0.multiply((-992), (-32969632));
        int int22 = mathTest0.square(1324965);
        int int25 = mathTest0.divide(1357853952, (-29331390));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3181) + "'", int14 == (-3181));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-161) + "'", int17 == (-161));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1653863424) + "'", int20 == (-1653863424));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1109372839) + "'", int22 == (-1109372839));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-46) + "'", int25 == (-46));
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int5 = mathTest0.square((-1735140));
        int int8 = mathTest0.subtract(0, (-1042102));
        int int11 = mathTest0.add((-11611701), (-364053244));
        java.lang.Class<?> wildcardClass12 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-61254896) + "'", int5 == (-61254896));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1042102 + "'", int8 == 1042102);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-375664945) + "'", int11 == (-375664945));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) ' ');
        int int12 = mathTest0.add((-1042102), 1000500);
        int int15 = mathTest0.add(828396608, 506250000);
        int int17 = mathTest0.square(1892067732);
        java.lang.Class<?> wildcardClass18 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-41602) + "'", int12 == (-41602));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1334646608 + "'", int15 == 1334646608);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1095024016 + "'", int17 == 1095024016);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square((-32969632));
        int int14 = mathTest0.divide((-2033540108), 2550);
        int int17 = mathTest0.subtract(1962934272, 3329);
        int int19 = mathTest0.square((-13503600));
        int int21 = mathTest0.square(35250);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 541139968 + "'", int11 == 541139968);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-797466) + "'", int14 == (-797466));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1962930943 + "'", int17 == 1962930943);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 81441024 + "'", int19 == 81441024);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1242562500 + "'", int21 == 1242562500);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.subtract((int) '#', (int) (short) 100);
        int int12 = mathTest0.divide(0, (-1021));
        int int14 = mathTest0.square((int) (byte) 10);
        int int17 = mathTest0.multiply(17689, 10036224);
        int int20 = mathTest0.subtract((-61), (-27036603));
        int int22 = mathTest0.square(1706236992);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-65) + "'", int9 == (-65));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1437107200 + "'", int17 == 1437107200);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 27036542 + "'", int20 == 27036542);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 77467648 + "'", int22 == 77467648);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = mathTest0.divide((-51208), 0);
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
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.divide(1290100, (-3232));
        int int20 = mathTest0.divide((-6476), 34);
        int int23 = mathTest0.add(999698, 767974712);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-399) + "'", int17 == (-399));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-190) + "'", int20 == (-190));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 768974410 + "'", int23 == 768974410);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((int) (short) -1, 36);
        int int17 = mathTest0.square((-66));
        int int19 = mathTest0.square(19);
        int int21 = mathTest0.square(1347654771);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4356 + "'", int17 == 4356);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 361 + "'", int19 == 361);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2024221609 + "'", int21 == 2024221609);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int5 = mathTest0.square((int) (byte) 10);
        int int7 = mathTest0.square((-101));
        int int10 = mathTest0.multiply(3329, (-399));
        int int13 = mathTest0.multiply((-101), 1336336);
        int int16 = mathTest0.divide((-648771056), (-805856915));
        int int19 = mathTest0.subtract(1702726656, 1867490);
        int int22 = mathTest0.multiply((-27036603), 961);
        int int25 = mathTest0.multiply((-170769751), (-797466));
        int int28 = mathTest0.add((-431727059), (-1993779136));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10201 + "'", int7 == 10201);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1328271) + "'", int10 == (-1328271));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-134969936) + "'", int13 == (-134969936));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1700859166 + "'", int19 == 1700859166);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-212371707) + "'", int22 == (-212371707));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1752770602) + "'", int25 == (-1752770602));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1869461101 + "'", int28 == 1869461101);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
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
        int int29 = mathTest0.square((-3535));
        java.lang.Class<?> wildcardClass30 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1962927862 + "'", int18 == 1962927862);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-825) + "'", int21 == (-825));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1024 + "'", int24 == 1024);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 12496225 + "'", int29 == 12496225);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square((-32969632));
        int int14 = mathTest0.subtract((-1623939036), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 541139968 + "'", int11 == 541139968);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1623939037) + "'", int14 == (-1623939037));
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.subtract(36, 3232);
        int int16 = mathTest0.square(2);
        java.lang.Class<?> wildcardClass17 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3196) + "'", int14 == (-3196));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int11 = mathTest0.square(3232);
        int int14 = mathTest0.divide((-32), (int) (short) 1);
        int int17 = mathTest0.add(36, 1010);
        int int20 = mathTest0.add(1296, 0);
        int int23 = mathTest0.subtract(1010, (-5000));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10445824 + "'", int11 == 10445824);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-32) + "'", int14 == (-32));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1046 + "'", int17 == 1046);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1296 + "'", int20 == 1296);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6010 + "'", int23 == 6010);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.divide(0, 5200);
        int int14 = mathTest0.multiply((int) (short) 1, (int) (short) 10);
        int int17 = mathTest0.multiply((-3232), 10201);
        int int20 = mathTest0.divide(22500, 10445824);
        int int23 = mathTest0.multiply(999698, 0);
        int int26 = mathTest0.add(4700, 1594884096);
        int int29 = mathTest0.multiply(29175, 176965908);
        int int32 = mathTest0.divide((-2), (-27036576));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-32969632) + "'", int17 == (-32969632));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1594888796 + "'", int26 == 1594888796);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 429676108 + "'", int29 == 429676108);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        int int20 = mathTest0.subtract(12, (-3295));
        int int23 = mathTest0.multiply((-138), 4356);
        int int26 = mathTest0.subtract(1724707840, (int) (short) -1);
        int int29 = mathTest0.multiply((-1988513369), 1614522155);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3307 + "'", int20 == 3307);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-601128) + "'", int23 == (-601128));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1724707841 + "'", int26 == 1724707841);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 198297613 + "'", int29 == 198297613);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((int) (short) -1, 36);
        int int18 = mathTest0.divide((-2), (-61));
        int int21 = mathTest0.multiply((-41602), (-1515163));
        int int23 = mathTest0.square((-477771120));
        java.lang.Class<?> wildcardClass24 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1390698314) + "'", int21 == (-1390698314));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2045219072 + "'", int23 == 2045219072);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int11 = mathTest0.square(3232);
        int int14 = mathTest0.divide(999988, (-51918));
        int int17 = mathTest0.subtract((-1189942844), 940145899);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10445824 + "'", int11 == 10445824);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-19) + "'", int14 == (-19));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-2130088743) + "'", int17 == (-2130088743));
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        int int20 = mathTest0.subtract(12, (-3295));
        int int23 = mathTest0.multiply((-138), 4356);
        int int26 = mathTest0.subtract(1724707840, (int) (short) -1);
        int int28 = mathTest0.square(18974736);
        int int31 = mathTest0.subtract((-1246896128), (-963545038));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3307 + "'", int20 == 3307);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-601128) + "'", int23 == (-601128));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1724707841 + "'", int26 == 1724707841);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2087780608 + "'", int28 == 2087780608);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-283351090) + "'", int31 == (-283351090));
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(3232, (-3168));
        int int8 = mathTest0.square((-3232));
        int int10 = mathTest0.square((-40381539));
        int int13 = mathTest0.subtract(137574, (-992));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10445824 + "'", int8 == 10445824);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1541263799) + "'", int10 == (-1541263799));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 138566 + "'", int13 == 138566);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((int) (short) -1, 36);
        int int18 = mathTest0.multiply((-51), (-31));
        int int21 = mathTest0.multiply(4389, 10036323);
        int int24 = mathTest0.multiply(3045332, (-2623));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1581 + "'", int18 == 1581);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1099748687 + "'", int21 == 1099748687);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 602028756 + "'", int24 == 602028756);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int12 = mathTest0.multiply(4, (-31));
        int int15 = mathTest0.multiply((-137280), 0);
        int int18 = mathTest0.add(0, 1351683000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-124) + "'", int12 == (-124));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1351683000 + "'", int18 == 1351683000);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        int int20 = mathTest0.multiply((int) (short) 10, 99);
        int int23 = mathTest0.divide((int) (short) 100, 10445824);
        int int25 = mathTest0.square((-3535));
        int int28 = mathTest0.subtract((-366998), 150);
        java.lang.Class<?> wildcardClass29 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 990 + "'", int20 == 990);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 12496225 + "'", int25 == 12496225);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-367148) + "'", int28 == (-367148));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.add((int) (byte) -1, (int) '4');
        int int12 = mathTest0.multiply((int) 'a', (int) (short) 100);
        int int14 = mathTest0.square(219152384);
        int int17 = mathTest0.divide(133, (-50));
        int int20 = mathTest0.add(0, (-3181));
        int int22 = mathTest0.square(1000500);
        int int25 = mathTest0.divide((-212371707), 633765517);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9700 + "'", int12 == 9700);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-2) + "'", int17 == (-2));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-3181) + "'", int20 == (-3181));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 272870032 + "'", int22 == 272870032);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int5 = mathTest0.square((int) (byte) 10);
        int int7 = mathTest0.square((-101));
        int int10 = mathTest0.multiply(3329, (-399));
        int int13 = mathTest0.multiply((-101), 1336336);
        int int16 = mathTest0.multiply(1239052378, (-3181));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10201 + "'", int7 == 10201);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1328271) + "'", int10 == (-1328271));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-134969936) + "'", int13 == (-134969936));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1354363310 + "'", int16 == 1354363310);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) ' ');
        int int12 = mathTest0.divide((int) (byte) 100, 36);
        int int15 = mathTest0.subtract(0, 3232);
        int int18 = mathTest0.divide(104060401, 3329);
        int int21 = mathTest0.subtract((-51), 5541);
        int int24 = mathTest0.add(1000500, (-992));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3232) + "'", int15 == (-3232));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 31258 + "'", int18 == 31258);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-5592) + "'", int21 == (-5592));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 999508 + "'", int24 == 999508);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int12 = mathTest0.divide((-63), (-990));
        int int15 = mathTest0.multiply(4356, (-31));
        int int17 = mathTest0.square(3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-135036) + "'", int15 == (-135036));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
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
        int int29 = mathTest0.add((-2623), 12119495);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-399) + "'", int17 == (-399));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-190) + "'", int20 == (-190));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 18 + "'", int23 == 18);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 12116872 + "'", int29 == 12116872);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int8 = mathTest0.square((-51));
        int int11 = mathTest0.divide((-3222), 112);
        int int14 = mathTest0.multiply(1, (-134969936));
        int int17 = mathTest0.multiply(2030043136, (-134938));
        int int20 = mathTest0.divide(18974736, 1892066507);
        int int23 = mathTest0.divide(9117553, 263609);
        int int25 = mathTest0.square(194966016);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2601 + "'", int8 == 2601);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-28) + "'", int11 == (-28));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-134969936) + "'", int14 == (-134969936));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1241513984) + "'", int17 == (-1241513984));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 34 + "'", int23 == 34);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1664876544) + "'", int25 == (-1664876544));
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int5 = mathTest0.square((int) (byte) 10);
        int int8 = mathTest0.add((-1488), 3190);
        int int11 = mathTest0.subtract((-2244), 1095024016);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1702 + "'", int8 == 1702);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1095026260) + "'", int11 == (-1095026260));
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int5 = mathTest0.square((int) (byte) 10);
        int int7 = mathTest0.square(51);
        int int10 = mathTest0.multiply(0, 11161);
        java.lang.Class<?> wildcardClass11 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2601 + "'", int7 == 2601);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(12, 100);
        int int15 = mathTest0.subtract(0, (-1156));
        int int18 = mathTest0.divide((-1086356767), 1094116);
        int int20 = mathTest0.square(102217728);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 112 + "'", int12 == 112);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1156 + "'", int15 == 1156);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-992) + "'", int18 == (-992));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1807745024) + "'", int20 == (-1807745024));
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        int int20 = mathTest0.subtract(12, (-3295));
        int int23 = mathTest0.multiply((-138), 4356);
        int int26 = mathTest0.subtract(1724707840, (int) (short) -1);
        int int29 = mathTest0.multiply(50960, (-1065097728));
        int int32 = mathTest0.divide(53413, (-1350726656));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3307 + "'", int20 == 3307);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-601128) + "'", int23 == (-601128));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1724707841 + "'", int26 == 1724707841);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1878499328) + "'", int29 == (-1878499328));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.subtract((int) (short) 0, (int) '#');
        int int15 = mathTest0.subtract((-1), 100);
        int int18 = mathTest0.add((int) (byte) 1, (-124));
        int int21 = mathTest0.subtract(4399, (-546213652));
        int int24 = mathTest0.multiply((-3222), 0);
        java.lang.Class<?> wildcardClass25 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-35) + "'", int12 == (-35));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-101) + "'", int15 == (-101));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-123) + "'", int18 == (-123));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 546218051 + "'", int21 == 546218051);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        mathTest mathTest0 = new mathTest();
        int int2 = mathTest0.square((-101));
        int int5 = mathTest0.divide((-71), 19);
        int int8 = mathTest0.subtract(137574, (-1571));
        java.lang.Class<?> wildcardClass9 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10201 + "'", int2 == 10201);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-3) + "'", int5 == (-3));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 139145 + "'", int8 == 139145);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        mathTest mathTest0 = new mathTest();
        int int2 = mathTest0.square((-101));
        int int5 = mathTest0.multiply(1594884096, (-29422512));
        int int8 = mathTest0.divide((-32969632), (-3295));
        int int11 = mathTest0.add(17960388, (-39024));
        int int14 = mathTest0.multiply(205537, 336795904);
        int int17 = mathTest0.divide((-77677550), 12508860);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10201 + "'", int2 == 10201);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1962934272 + "'", int5 == 1962934272);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10005 + "'", int8 == 10005);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 17921364 + "'", int11 == 17921364);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2031810816 + "'", int14 == 2031810816);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-6) + "'", int17 == (-6));
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.add(2092, 1494149);
        int int17 = mathTest0.square(64);
        int int20 = mathTest0.divide(1022217718, (-2720));
        int int23 = mathTest0.subtract(1702726656, (-1241513984));
        int int26 = mathTest0.divide((-4472), 1594884096);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1496241 + "'", int15 == 1496241);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4096 + "'", int17 == 4096);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-375815) + "'", int20 == (-375815));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1350726656) + "'", int23 == (-1350726656));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(3232, (-3168));
        int int8 = mathTest0.square((-3232));
        int int10 = mathTest0.square(290);
        int int13 = mathTest0.add(52, 1208992747);
        int int16 = mathTest0.divide(690379505, 879239604);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10445824 + "'", int8 == 10445824);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 84100 + "'", int10 == 84100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1208992799 + "'", int13 == 1208992799);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(1581, (-13));
        int int15 = mathTest0.multiply((-3212), (-399));
        int int18 = mathTest0.multiply((-134974900), 805857023);
        java.lang.Class<?> wildcardClass19 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1568 + "'", int12 == 1568);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1281588 + "'", int15 == 1281588);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 879239604 + "'", int18 == 879239604);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.add(100, (int) (short) 1);
        int int9 = mathTest0.subtract(0, 0);
        int int11 = mathTest0.square((int) (byte) 1);
        int int14 = mathTest0.subtract(3232, 27040000);
        int int17 = mathTest0.multiply(47, 100);
        int int20 = mathTest0.subtract(1010, 1496241);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-27036768) + "'", int14 == (-27036768));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4700 + "'", int17 == 4700);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1495231) + "'", int20 == (-1495231));
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int5 = mathTest0.square((int) (byte) 10);
        int int8 = mathTest0.subtract(1496241, 152);
        int int11 = mathTest0.add(101, 1);
        int int14 = mathTest0.add((-574), (-16458735));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1496089 + "'", int8 == 1496089);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 102 + "'", int11 == 102);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-16459309) + "'", int14 == (-16459309));
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.subtract((int) (short) 0, (int) '#');
        int int15 = mathTest0.add((-101), 1024);
        int int18 = mathTest0.subtract(43, 55342855);
        int int21 = mathTest0.add(526377984, (-24));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-35) + "'", int12 == (-35));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 923 + "'", int15 == 923);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-55342812) + "'", int18 == (-55342812));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 526377960 + "'", int21 == 526377960);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(12, 100);
        int int15 = mathTest0.add(2601, (-51));
        int int18 = mathTest0.divide(1881653649, 34);
        int int20 = mathTest0.square(176203232);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 112 + "'", int12 == 112);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2550 + "'", int15 == 2550);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 55342754 + "'", int18 == 55342754);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-881163264) + "'", int20 == (-881163264));
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.divide((-101), 2);
        int int9 = mathTest0.multiply((-1958075928), 612685583);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2022583144) + "'", int9 == (-2022583144));
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
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
        java.lang.Class<?> wildcardClass30 = mathTest0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        int int20 = mathTest0.add(0, 1046);
        int int23 = mathTest0.divide(150, (-2033540108));
        int int25 = mathTest0.square(1515163);
        java.lang.Class<?> wildcardClass26 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1046 + "'", int20 == 1046);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-2088586791) + "'", int25 == (-2088586791));
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((-1), (-50));
        int int18 = mathTest0.divide((int) (short) -1, 163);
        int int21 = mathTest0.multiply(1336336, 29421456);
        int int24 = mathTest0.divide((-6291), (-6476));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 820197632 + "'", int21 == 820197632);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.subtract(36, 3232);
        int int16 = mathTest0.square(2);
        int int19 = mathTest0.divide(1042441, (-190));
        int int22 = mathTest0.multiply(102, 960400);
        int int25 = mathTest0.multiply((-18339), (-615839));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3196) + "'", int14 == (-3196));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-5486) + "'", int19 == (-5486));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97960800 + "'", int22 == 97960800);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1591030467) + "'", int25 == (-1591030467));
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
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
        int int28 = mathTest0.square(1486572);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = mathTest0.divide(1515163, 0);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-190) + "'", int20 == (-190));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 767974712 + "'", int26 == 767974712);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-2011846256) + "'", int28 == (-2011846256));
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.subtract((int) (short) 0, (int) '#');
        int int15 = mathTest0.subtract((-1), 100);
        int int18 = mathTest0.add(5151, (-51));
        java.lang.Class<?> wildcardClass19 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-35) + "'", int12 == (-35));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-101) + "'", int15 == (-101));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5100 + "'", int18 == 5100);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(12, 100);
        int int15 = mathTest0.add(2601, (-51));
        int int18 = mathTest0.divide((-51918), 1594884096);
        int int21 = mathTest0.multiply(36, (-3243));
        int int24 = mathTest0.subtract((int) (short) 10, (-1653863424));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 112 + "'", int12 == 112);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2550 + "'", int15 == 2550);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-116748) + "'", int21 == (-116748));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1653863434 + "'", int24 == 1653863434);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) ' ');
        int int12 = mathTest0.add((-1042102), 1000500);
        int int15 = mathTest0.add((-1838192896), (-341));
        int int18 = mathTest0.multiply((-13503535), 1156);
        int int21 = mathTest0.subtract((-2002091772), 1724707840);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-41602) + "'", int12 == (-41602));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1838193237) + "'", int15 == (-1838193237));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1569782724 + "'", int18 == 1569782724);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 568167684 + "'", int21 == 568167684);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int12 = mathTest0.multiply(4, (-31));
        int int15 = mathTest0.multiply(1425784965, (-1319425623));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-124) + "'", int12 == (-124));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-800168755) + "'", int15 == (-800168755));
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(5200, (-341));
        int int20 = mathTest0.subtract((-2), 990);
        int int23 = mathTest0.add(9113164, 2499561);
        int int25 = mathTest0.square(0);
        int int27 = mathTest0.square(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5541 + "'", int17 == 5541);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-992) + "'", int20 == (-992));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 11612725 + "'", int23 == 11612725);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.add((int) (short) 1, 0);
        int int14 = mathTest0.multiply((-399), 1156);
        int int17 = mathTest0.divide(148155, 52);
        int int20 = mathTest0.divide((-3222), (-12));
        int int23 = mathTest0.multiply((-980), 2738);
        int int26 = mathTest0.subtract(254540, (int) '#');
        int int28 = mathTest0.square(1007709282);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-461244) + "'", int14 == (-461244));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2849 + "'", int17 == 2849);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 268 + "'", int20 == 268);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-2683240) + "'", int23 == (-2683240));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 254505 + "'", int26 == 254505);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1440557692) + "'", int28 == (-1440557692));
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.divide((-290), 1892067732);
        int int9 = mathTest0.add((-805857024), 163);
        int int12 = mathTest0.subtract((-18339), 0);
        int int15 = mathTest0.subtract(663, (-127500));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-805856861) + "'", int9 == (-805856861));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-18339) + "'", int12 == (-18339));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 128163 + "'", int15 == 128163);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
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
        int int28 = mathTest0.square(138566);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3232) + "'", int15 == (-3232));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 31258 + "'", int18 == 31258);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 26569 + "'", int20 == 26569);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1086347664) + "'", int26 == (-1086347664));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2020667172 + "'", int28 == 2020667172);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.add(52, 98);
        int int17 = mathTest0.add((-13), (-364053231));
        int int20 = mathTest0.multiply(52, (-3222));
        int int23 = mathTest0.multiply((-888552828), (-1022));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 150 + "'", int14 == 150);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-364053244) + "'", int17 == (-364053244));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-167544) + "'", int20 == (-167544));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1862890760 + "'", int23 == 1862890760);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.divide(1290100, (-3232));
        int int20 = mathTest0.divide((-6476), 34);
        int int23 = mathTest0.subtract(10, (-8));
        int int25 = mathTest0.square((-3168));
        int int28 = mathTest0.multiply((-865176864), 51);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-399) + "'", int17 == (-399));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-190) + "'", int20 == (-190));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 18 + "'", int23 == 18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10036224 + "'", int25 == 10036224);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1174347104) + "'", int28 == (-1174347104));
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.divide(1496241, 10201);
        int int15 = mathTest0.divide(11161, 1);
        int int18 = mathTest0.subtract((int) (byte) -1, 1962934272);
        int int20 = mathTest0.square(117);
        int int23 = mathTest0.add((-805857024), (-13));
        int int26 = mathTest0.subtract((-1886410752), 310);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 146 + "'", int12 == 146);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11161 + "'", int15 == 11161);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1962934273) + "'", int18 == (-1962934273));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 13689 + "'", int20 == 13689);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-805857037) + "'", int23 == (-805857037));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1886411062) + "'", int26 == (-1886411062));
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.subtract((int) (short) 0, (int) '#');
        int int15 = mathTest0.add((-101), 1024);
        int int18 = mathTest0.subtract(43, 55342855);
        int int21 = mathTest0.add(138096199, (-2130088743));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-35) + "'", int12 == (-35));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 923 + "'", int15 == 923);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-55342812) + "'", int18 == (-55342812));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1991992544) + "'", int21 == (-1991992544));
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int11 = mathTest0.square(3232);
        int int14 = mathTest0.divide((-32), (int) (short) 1);
        int int17 = mathTest0.add(36, 1010);
        int int20 = mathTest0.multiply((-1544804416), 2704);
        int int23 = mathTest0.subtract((-13503587), 26877952);
        int int26 = mathTest0.subtract((-1735141), 5100);
        java.lang.Class<?> wildcardClass27 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10445824 + "'", int11 == 10445824);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-32) + "'", int14 == (-32));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1046 + "'", int17 == 1046);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1852038144 + "'", int20 == 1852038144);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-40381539) + "'", int23 == (-40381539));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1740241) + "'", int26 == (-1740241));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.add(2092, 1494149);
        int int17 = mathTest0.square(1237);
        int int20 = mathTest0.multiply(26877952, (-5486));
        java.lang.Class<?> wildcardClass21 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1496241 + "'", int15 == 1496241);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1530169 + "'", int17 == 1530169);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1423556608) + "'", int20 == (-1423556608));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.divide(1496241, 10201);
        int int15 = mathTest0.divide(11161, 1);
        int int18 = mathTest0.subtract((int) (byte) -1, 1962934272);
        int int21 = mathTest0.multiply(2849, 268);
        int int24 = mathTest0.subtract(18, (-2720));
        java.lang.Class<?> wildcardClass25 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 146 + "'", int12 == 146);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11161 + "'", int15 == 11161);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1962934273) + "'", int18 == (-1962934273));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 763532 + "'", int21 == 763532);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2738 + "'", int24 == 2738);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) ' ');
        int int12 = mathTest0.divide((int) (byte) 100, 36);
        int int15 = mathTest0.multiply(63, (-1));
        int int18 = mathTest0.subtract((int) (short) 1, (-31));
        int int21 = mathTest0.subtract(10, 990);
        int int24 = mathTest0.divide(10036224, 344);
        int int27 = mathTest0.multiply((-621998080), (-1022));
        int int30 = mathTest0.divide((-1327930204), 51);
        int int33 = mathTest0.add((-990), (-388956160));
        java.lang.Class<?> wildcardClass34 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-63) + "'", int15 == (-63));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-980) + "'", int21 == (-980));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 29175 + "'", int24 == 29175);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 26877952 + "'", int27 == 26877952);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-26037847) + "'", int30 == (-26037847));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-388957150) + "'", int33 == (-388957150));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.divide(0, 5200);
        int int14 = mathTest0.multiply((int) (short) 1, (int) (short) 10);
        int int17 = mathTest0.subtract((-50960), (-63));
        int int19 = mathTest0.square((-1764640368));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-50897) + "'", int17 == (-50897));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1134653696 + "'", int19 == 1134653696);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.add((int) (short) 1, (-32));
        int int12 = mathTest0.multiply(1094050, (-71));
        int int15 = mathTest0.multiply(115, 950697);
        int int18 = mathTest0.divide(395661777, 954080144);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-31) + "'", int9 == (-31));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-77677550) + "'", int12 == (-77677550));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 109330155 + "'", int15 == 109330155);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square(268);
        int int14 = mathTest0.multiply(85284, (-123));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 71824 + "'", int11 == 71824);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-10489932) + "'", int14 == (-10489932));
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) ' ');
        int int12 = mathTest0.divide((int) (byte) 100, 36);
        int int15 = mathTest0.subtract(0, 3232);
        int int18 = mathTest0.divide(104060401, 3329);
        int int21 = mathTest0.subtract((-51), 5541);
        int int24 = mathTest0.add((-31), 9700);
        int int27 = mathTest0.multiply(0, 1348961447);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3232) + "'", int15 == (-3232));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 31258 + "'", int18 == 31258);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-5592) + "'", int21 == (-5592));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9669 + "'", int24 == 9669);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
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
        int int28 = mathTest0.square((-1442018727));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-399) + "'", int17 == (-399));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-190) + "'", int20 == (-190));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 18 + "'", int23 == 18);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1998328561 + "'", int28 == 1998328561);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((int) (short) -1, 36);
        int int18 = mathTest0.divide((-1488), 112);
        int int21 = mathTest0.add(29421356, (int) (byte) 100);
        int int23 = mathTest0.square((-27036766));
        int int26 = mathTest0.subtract((-1081), 566266805);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-13) + "'", int18 == (-13));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 29421456 + "'", int21 == 29421456);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 461828740 + "'", int23 == 461828740);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-566267886) + "'", int26 == (-566267886));
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int5 = mathTest0.square((int) (byte) 10);
        int int7 = mathTest0.square((-101));
        int int10 = mathTest0.multiply(3329, (-399));
        int int13 = mathTest0.multiply((-101), 1336336);
        int int16 = mathTest0.divide((-648771056), (-805856915));
        int int18 = mathTest0.square((-138));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10201 + "'", int7 == 10201);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1328271) + "'", int10 == (-1328271));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-134969936) + "'", int13 == (-134969936));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 19044 + "'", int18 == 19044);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.add(52, 98);
        int int17 = mathTest0.add((-13), (-364053231));
        int int20 = mathTest0.multiply(52, (-3222));
        int int23 = mathTest0.divide(5405, 1174437540);
        java.lang.Class<?> wildcardClass24 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 150 + "'", int14 == 150);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-364053244) + "'", int17 == (-364053244));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-167544) + "'", int20 == (-167544));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.add(2092, 1494149);
        int int17 = mathTest0.square(64);
        int int20 = mathTest0.multiply(1324965, 134966615);
        int int23 = mathTest0.multiply((-50), 140);
        int int26 = mathTest0.subtract(1357392808, (-1042405));
        int int29 = mathTest0.divide(11082582, (-570562480));
        int int32 = mathTest0.multiply((-105445), 1861156092);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1496241 + "'", int15 == 1496241);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4096 + "'", int17 == 4096);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 782707219 + "'", int20 == 782707219);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-7000) + "'", int23 == (-7000));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1358435213 + "'", int26 == 1358435213);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 336535188 + "'", int32 == 336535188);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((-1), (-50));
        int int18 = mathTest0.subtract(429549516, 0);
        int int21 = mathTest0.divide((-252448), (-27036767));
        int int23 = mathTest0.square((-127500));
        int int25 = mathTest0.square((-262701));
        int int28 = mathTest0.add((-825), 1964249578);
        int int31 = mathTest0.add((-19), 1966983424);
        int int34 = mathTest0.multiply((-60518400), 560857856);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 429549516 + "'", int18 == 429549516);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-923619184) + "'", int23 == (-923619184));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 292338665 + "'", int25 == 292338665);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1964248753 + "'", int28 == 1964248753);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1966983405 + "'", int31 == 1966983405);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 229638144 + "'", int34 == 229638144);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        int int20 = mathTest0.subtract(12, (-3295));
        int int23 = mathTest0.add((-101), 112);
        int int25 = mathTest0.square(53413);
        int int27 = mathTest0.square((-9545));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3307 + "'", int20 == 3307);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 11 + "'", int23 == 11);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1442018727) + "'", int25 == (-1442018727));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 91107025 + "'", int27 == 91107025);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.subtract((int) (short) -1, (int) (short) 100);
        int int16 = mathTest0.square(101);
        int int19 = mathTest0.add((-1042405), 303);
        int int22 = mathTest0.divide(29421356, 805857023);
        int int24 = mathTest0.square((-18339));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-101) + "'", int14 == (-101));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10201 + "'", int16 == 10201);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1042102) + "'", int19 == (-1042102));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 336318921 + "'", int24 == 336318921);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.add((int) (byte) -1, (int) '4');
        int int12 = mathTest0.subtract(150, 51);
        int int15 = mathTest0.add((int) (short) 1, 1);
        int int18 = mathTest0.multiply((-148), (-124));
        int int20 = mathTest0.square(1094116);
        int int23 = mathTest0.add((-1190896240), 1174437505);
        int int26 = mathTest0.add(0, (-805857037));
        int int29 = mathTest0.subtract((-1631068032), 1239052378);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 99 + "'", int12 == 99);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 18352 + "'", int18 == 18352);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1206054128) + "'", int20 == (-1206054128));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-16458735) + "'", int23 == (-16458735));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-805857037) + "'", int26 == (-805857037));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1424846886 + "'", int29 == 1424846886);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(1581, (-13));
        int int15 = mathTest0.multiply((-3212), (-399));
        int int18 = mathTest0.subtract(4858344, 22500);
        int int21 = mathTest0.subtract(980100, 1022217718);
        int int24 = mathTest0.add((-388956160), 1581);
        int int27 = mathTest0.subtract((-1382167866), 1208021816);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1568 + "'", int12 == 1568);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1281588 + "'", int15 == 1281588);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4835844 + "'", int18 == 4835844);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1021237618) + "'", int21 == (-1021237618));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-388954579) + "'", int24 == (-388954579));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1704777614 + "'", int27 == 1704777614);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.add(52, 98);
        int int17 = mathTest0.add(3232, (int) 'a');
        int int19 = mathTest0.square((-204731200));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 150 + "'", int14 == 150);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3329 + "'", int17 == 3329);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-761098240) + "'", int19 == (-761098240));
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) ' ');
        int int12 = mathTest0.divide((int) (byte) 100, 36);
        int int15 = mathTest0.multiply(63, (-1));
        int int18 = mathTest0.subtract((int) (short) 1, (-31));
        int int21 = mathTest0.subtract(10, 990);
        int int24 = mathTest0.divide(10036224, 344);
        int int27 = mathTest0.multiply((-621998080), (-1022));
        int int30 = mathTest0.divide((-1327930204), 51);
        java.lang.Class<?> wildcardClass31 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-63) + "'", int15 == (-63));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-980) + "'", int21 == (-980));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 29175 + "'", int24 == 29175);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 26877952 + "'", int27 == 26877952);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-26037847) + "'", int30 == (-26037847));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((int) (short) -1, 36);
        int int18 = mathTest0.divide((-1488), 112);
        int int21 = mathTest0.add(29421356, (int) (byte) 100);
        int int24 = mathTest0.subtract(0, 13585088);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-13) + "'", int18 == (-13));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 29421456 + "'", int21 == 29421456);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-13585088) + "'", int24 == (-13585088));
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.subtract(36, 3232);
        int int16 = mathTest0.square(2);
        int int19 = mathTest0.divide(1042441, (-190));
        int int22 = mathTest0.multiply(102, 960400);
        int int25 = mathTest0.multiply((int) (short) 0, 1108809);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3196) + "'", int14 == (-3196));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-5486) + "'", int19 == (-5486));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97960800 + "'", int22 == 97960800);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.multiply(2500, (-51));
        int int9 = mathTest0.divide((-802437976), 2132429056);
        int int12 = mathTest0.divide((-123), 1065108889);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-127500) + "'", int6 == (-127500));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        int int20 = mathTest0.multiply((int) (byte) 0, (-1));
        int int23 = mathTest0.add((-167510), 71061173);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 70893663 + "'", int23 == 70893663);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.divide(0, 5200);
        int int13 = mathTest0.square((int) (short) 0);
        int int16 = mathTest0.subtract(408675612, (-1319732940));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1728408552 + "'", int16 == 1728408552);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) ' ');
        int int12 = mathTest0.divide((int) (byte) 100, 36);
        int int15 = mathTest0.subtract(0, 3232);
        int int18 = mathTest0.divide(104060401, 3329);
        int int20 = mathTest0.square(163);
        int int23 = mathTest0.divide(10036323, (-2244));
        int int26 = mathTest0.multiply((-204731200), 102);
        int int29 = mathTest0.add(1515163, (-1488));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3232) + "'", int15 == (-3232));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 31258 + "'", int18 == 31258);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 26569 + "'", int20 == 26569);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-4472) + "'", int23 == (-4472));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 592254080 + "'", int26 == 592254080);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1513675 + "'", int29 == 1513675);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int12 = mathTest0.add(290, 2);
        int int15 = mathTest0.multiply((-13503600), (-3243));
        int int18 = mathTest0.multiply((-1021), (-3295));
        java.lang.Class<?> wildcardClass19 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 292 + "'", int12 == 292);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 842501840 + "'", int15 == 842501840);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3364195 + "'", int18 == 3364195);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(12, 100);
        int int15 = mathTest0.subtract(0, (-1156));
        int int18 = mathTest0.subtract((-1), 2048);
        int int21 = mathTest0.subtract((-601128), 29421456);
        int int23 = mathTest0.square((-1086356767));
        int int26 = mathTest0.multiply(1924149248, 546218051);
        int int29 = mathTest0.add((-1739493), 719684252);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 112 + "'", int12 == 112);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1156 + "'", int15 == 1156);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2049) + "'", int18 == (-2049));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-30022584) + "'", int21 == (-30022584));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1806125505 + "'", int23 == 1806125505);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1038315520) + "'", int26 == (-1038315520));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 717944759 + "'", int29 == 717944759);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int11 = mathTest0.square(133);
        int int14 = mathTest0.divide((-13506830), 3414448);
        int int17 = mathTest0.divide((-217406684), 1757167616);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 17689 + "'", int11 == 17689);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3) + "'", int14 == (-3));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) ' ');
        int int12 = mathTest0.divide((int) (byte) 100, 36);
        int int15 = mathTest0.subtract(1499341, 43803810);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-42304469) + "'", int15 == (-42304469));
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        int int20 = mathTest0.subtract(12, (-3295));
        int int23 = mathTest0.add((-101), 112);
        int int25 = mathTest0.square(53413);
        int int27 = mathTest0.square(408675612);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3307 + "'", int20 == 3307);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 11 + "'", int23 == 11);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1442018727) + "'", int25 == (-1442018727));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-286057712) + "'", int27 == (-286057712));
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int14 = mathTest0.square(0);
        int int16 = mathTest0.square(5200);
        int int19 = mathTest0.subtract(5100, 0);
        int int21 = mathTest0.square((-578));
        int int24 = mathTest0.multiply((-805856861), 2499561);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 27040000 + "'", int16 == 27040000);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5100 + "'", int19 == 5100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 334084 + "'", int21 == 334084);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-259121573) + "'", int24 == (-259121573));
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int11 = mathTest0.square(3232);
        int int14 = mathTest0.divide((-32), (int) (short) 1);
        int int16 = mathTest0.square((-50));
        int int19 = mathTest0.multiply(0, 208780);
        int int22 = mathTest0.add(7398400, 767974712);
        int int25 = mathTest0.divide((-11159095), (-167544));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10445824 + "'", int11 == 10445824);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-32) + "'", int14 == (-32));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2500 + "'", int16 == 2500);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 775373112 + "'", int22 == 775373112);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 66 + "'", int25 == 66);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        int int20 = mathTest0.add(0, 1046);
        int int23 = mathTest0.divide(150, (-2033540108));
        int int26 = mathTest0.subtract(1496152, 4356);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1046 + "'", int20 == 1046);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1491796 + "'", int26 == 1491796);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        int int20 = mathTest0.subtract(12, (-3295));
        int int23 = mathTest0.add((-101), 112);
        int int26 = mathTest0.divide((-61254896), 1079444356);
        java.lang.Class<?> wildcardClass27 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3307 + "'", int20 == 3307);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 11 + "'", int23 == 11);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int8 = mathTest0.square((-51));
        int int10 = mathTest0.square((-1664876544));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2601 + "'", int8 == 2601);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.multiply(10445824, 10445824);
        int int12 = mathTest0.subtract((int) 'a', 9669);
        int int15 = mathTest0.add(1094116, (-66));
        int int18 = mathTest0.multiply(533500814, 1425784004);
        int int20 = mathTest0.square((-16458735));
        int int23 = mathTest0.subtract(1029237664, 1174437505);
        int int26 = mathTest0.multiply(1074639160, (-1614522155));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1594884096 + "'", int9 == 1594884096);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9572) + "'", int12 == (-9572));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1094050 + "'", int15 == 1094050);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-650690376) + "'", int18 == (-650690376));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2075474209 + "'", int20 == 2075474209);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-145199841) + "'", int23 == (-145199841));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1999614872 + "'", int26 == 1999614872);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.add(2092, 1494149);
        int int17 = mathTest0.square(64);
        int int20 = mathTest0.multiply(1324965, 134966615);
        int int23 = mathTest0.multiply((-50), 140);
        int int26 = mathTest0.subtract(1357392808, (-1042405));
        int int29 = mathTest0.multiply(0, (-134969617));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1496241 + "'", int15 == 1496241);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4096 + "'", int17 == 4096);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 782707219 + "'", int20 == 782707219);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-7000) + "'", int23 == (-7000));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1358435213 + "'", int26 == 1358435213);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.add(2092, 1494149);
        int int17 = mathTest0.square(64);
        int int20 = mathTest0.subtract((-167544), (-557188015));
        int int23 = mathTest0.subtract((-990), 545629222);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1496241 + "'", int15 == 1496241);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4096 + "'", int17 == 4096);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 557020471 + "'", int20 == 557020471);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-545630212) + "'", int23 == (-545630212));
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.subtract((int) '#', (int) (short) 1);
        int int17 = mathTest0.divide((-743732520), 1174437540);
        int int20 = mathTest0.subtract(1053, (-1065096738));
        int int23 = mathTest0.multiply((-50938), (-858242532));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1065097791 + "'", int20 == 1065097791);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1314010968) + "'", int23 == (-1314010968));
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.add(52, 98);
        int int17 = mathTest0.add((-13), (-364053231));
        int int20 = mathTest0.multiply((-1190896240), (-65990382));
        int int23 = mathTest0.divide(1756063807, (-1827683456));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 150 + "'", int14 == 150);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-364053244) + "'", int17 == (-364053244));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1125458976 + "'", int20 == 1125458976);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.add(100, (int) (short) 1);
        int int9 = mathTest0.subtract(0, 0);
        int int12 = mathTest0.subtract(36819, (-2006027200));
        java.lang.Class<?> wildcardClass13 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2006064019 + "'", int12 == 2006064019);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        mathTest mathTest0 = new mathTest();
        int int2 = mathTest0.square((-101));
        int int5 = mathTest0.multiply(1594884096, (-29422512));
        int int8 = mathTest0.divide((-32969632), (-3295));
        int int11 = mathTest0.add(17960388, (-39024));
        java.lang.Class<?> wildcardClass12 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10201 + "'", int2 == 10201);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1962934272 + "'", int5 == 1962934272);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10005 + "'", int8 == 10005);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 17921364 + "'", int11 == 17921364);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        int int20 = mathTest0.multiply((-1081), 0);
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
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((-32), 99);
        int int9 = mathTest0.divide((-3232), 51);
        int int11 = mathTest0.square(1046);
        int int13 = mathTest0.square(950697);
        int int16 = mathTest0.multiply((-27036775), (-148800));
        int int19 = mathTest0.subtract(362673936, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = mathTest0.divide((-17003845), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Cannot divide by zero.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3168) + "'", int6 == (-3168));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-63) + "'", int9 == (-63));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1094116 + "'", int11 == 1094116);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1881653649 + "'", int13 == 1881653649);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1312236352) + "'", int16 == (-1312236352));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 362673937 + "'", int19 == 362673937);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.subtract((int) (short) 0, (int) '#');
        int int15 = mathTest0.subtract((-1), 100);
        int int18 = mathTest0.add(5151, (-51));
        int int21 = mathTest0.multiply(660805517, (-1774223360));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-35) + "'", int12 == (-35));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-101) + "'", int15 == (-101));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5100 + "'", int18 == 5100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-176586752) + "'", int21 == (-176586752));
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        int int20 = mathTest0.add(0, 1046);
        int int23 = mathTest0.add((-1886410752), (-860132015));
        int int25 = mathTest0.square(1966983424);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1046 + "'", int20 == 1046);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1548424529 + "'", int23 == 1548424529);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1741750272 + "'", int25 == 1741750272);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int14 = mathTest0.square((int) '4');
        int int16 = mathTest0.square((-1065097728));
        java.lang.Class<?> wildcardClass17 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2704 + "'", int14 == 2704);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 849608704 + "'", int16 == 849608704);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int11 = mathTest0.square(3232);
        int int14 = mathTest0.divide((-32), (int) (short) 1);
        int int17 = mathTest0.add(36, 1010);
        int int20 = mathTest0.multiply((-1544804416), 2704);
        int int23 = mathTest0.subtract((-13503587), 26877952);
        int int26 = mathTest0.divide((-51), 99);
        int int29 = mathTest0.divide((-1382167866), 12508860);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10445824 + "'", int11 == 10445824);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-32) + "'", int14 == (-32));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1046 + "'", int17 == 1046);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1852038144 + "'", int20 == 1852038144);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-40381539) + "'", int23 == (-40381539));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-110) + "'", int29 == (-110));
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int13 = mathTest0.square(10036224);
        int int16 = mathTest0.subtract(1324965, (-6476));
        int int19 = mathTest0.multiply(13503598, (-461144));
        int int22 = mathTest0.divide((-1507558125), 163);
        int int25 = mathTest0.multiply(0, 150);
        int int28 = mathTest0.subtract(12496225, (-570562577));
        int int30 = mathTest0.square((-1838193237));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 219152384 + "'", int13 == 219152384);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1331441 + "'", int16 == 1331441);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 599383088 + "'", int19 == 599383088);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-9248822) + "'", int22 == (-9248822));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 583058802 + "'", int28 == 583058802);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1588224057 + "'", int30 == 1588224057);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square((-32969632));
        int int14 = mathTest0.divide((-2033540108), 2550);
        int int17 = mathTest0.subtract((-35), (-1397199231));
        java.lang.Class<?> wildcardClass18 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 541139968 + "'", int11 == 541139968);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-797466) + "'", int14 == (-797466));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1397199196 + "'", int17 == 1397199196);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.add((int) (short) 1, 0);
        int int14 = mathTest0.multiply((-399), 1156);
        int int17 = mathTest0.subtract(0, 0);
        int int20 = mathTest0.subtract(805857023, 1237);
        int int23 = mathTest0.subtract(604333301, 705911761);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-461244) + "'", int14 == (-461244));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 805855786 + "'", int20 == 805855786);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-101578460) + "'", int23 == (-101578460));
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add((int) (byte) 10, (-3232));
        int int15 = mathTest0.add((-3243), 31);
        int int18 = mathTest0.divide((-7), 144);
        int int21 = mathTest0.subtract((-9545), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3222) + "'", int12 == (-3222));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3212) + "'", int15 == (-3212));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-9545) + "'", int21 == (-9545));
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int8 = mathTest0.square((-51));
        int int11 = mathTest0.divide((-3222), 112);
        int int14 = mathTest0.multiply(1, (-134969936));
        int int17 = mathTest0.multiply(2030043136, (-134938));
        int int20 = mathTest0.add((-12420), (-1086356767));
        int int22 = mathTest0.square(712775872);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2601 + "'", int8 == 2601);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-28) + "'", int11 == (-28));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-134969936) + "'", int14 == (-134969936));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1241513984) + "'", int17 == (-1241513984));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1086369187) + "'", int20 == (-1086369187));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-60518400) + "'", int22 == (-60518400));
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square((-32969632));
        int int14 = mathTest0.divide((-2033540108), 2550);
        int int17 = mathTest0.subtract((-29331390), 1892067732);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 541139968 + "'", int11 == 541139968);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-797466) + "'", int14 == (-797466));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1921399122) + "'", int17 == (-1921399122));
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.divide((-101), 303);
        int int15 = mathTest0.divide((-43), 344);
        int int18 = mathTest0.multiply(29421356, (-134974868));
        java.lang.Class<?> wildcardClass19 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 299269776 + "'", int18 == 299269776);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int14 = mathTest0.square(0);
        int int16 = mathTest0.square(5200);
        int int19 = mathTest0.divide(117, (-5073684));
        int int22 = mathTest0.subtract((-5486), (-329745264));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 27040000 + "'", int16 == 27040000);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 329739778 + "'", int22 == 329739778);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        int int20 = mathTest0.multiply(99, (int) (short) 1);
        int int23 = mathTest0.multiply((-262701), 29421468);
        int int26 = mathTest0.multiply((-5073684), 29421456);
        java.lang.Class<?> wildcardClass27 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 99 + "'", int20 == 99);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1892067732 + "'", int23 == 1892067732);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 712775872 + "'", int26 == 712775872);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.multiply((int) (short) 0, (-101));
        int int9 = mathTest0.subtract((-268034188), 1074639160);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1342673348) + "'", int9 == (-1342673348));
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        mathTest mathTest0 = new mathTest();
        int int2 = mathTest0.square((-101));
        int int5 = mathTest0.multiply(1594884096, (-29422512));
        int int8 = mathTest0.divide((-32969632), (-3295));
        int int11 = mathTest0.divide(2499561, 3329);
        int int14 = mathTest0.multiply((-597361122), (-1958075928));
        java.lang.Class<?> wildcardClass15 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10201 + "'", int2 == 10201);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1962934272 + "'", int5 == 1962934272);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10005 + "'", int8 == 10005);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 750 + "'", int11 == 750);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2129930544 + "'", int14 == 2129930544);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int12 = mathTest0.subtract(144, (-66));
        int int15 = mathTest0.multiply((-341), 1756063807);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 210 + "'", int12 == 210);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1817304043) + "'", int15 == (-1817304043));
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        int int20 = mathTest0.subtract(12, (-3295));
        int int23 = mathTest0.multiply((-138), 4356);
        int int25 = mathTest0.square(311400096);
        int int28 = mathTest0.divide((-823), (-1043094));
        int int31 = mathTest0.subtract((-45436), 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3307 + "'", int20 == 3307);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-601128) + "'", int23 == (-601128));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 526377984 + "'", int25 == 526377984);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-45448) + "'", int31 == (-45448));
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.add((int) (byte) -1, (int) '4');
        int int12 = mathTest0.subtract(150, 51);
        int int15 = mathTest0.add((int) (short) 1, 1);
        int int18 = mathTest0.add(0, (-252448));
        int int21 = mathTest0.subtract(71061173, (-42304469));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 99 + "'", int12 == 99);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-252448) + "'", int18 == (-252448));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 113365642 + "'", int21 == 113365642);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
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
        int int28 = mathTest0.divide(1601400768, (-570562577));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-461244) + "'", int14 == (-461244));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2849 + "'", int17 == 2849);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 268 + "'", int20 == 268);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-2683240) + "'", int23 == (-2683240));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 604334705 + "'", int25 == 604334705);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-2) + "'", int28 == (-2));
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.multiply(10445824, 10445824);
        int int12 = mathTest0.divide(2704, (-5681));
        int int14 = mathTest0.square(712775872);
        int int16 = mathTest0.square(1156);
        int int19 = mathTest0.multiply(146, 1964249568);
        int int22 = mathTest0.multiply((-14756608), 1594888796);
        int int25 = mathTest0.multiply(22500, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1594884096 + "'", int9 == 1594884096);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-60518400) + "'", int14 == (-60518400));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1336336 + "'", int16 == 1336336);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-982371904) + "'", int19 == (-982371904));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 705596416 + "'", int22 == 705596416);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((int) (short) -1, 36);
        int int18 = mathTest0.multiply((-51), (-31));
        int int21 = mathTest0.divide(5541, (-823));
        int int24 = mathTest0.divide(218028, 1601400768);
        int int26 = mathTest0.square(1946522112);
        int int29 = mathTest0.divide((-148800), 1953321121);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1581 + "'", int18 == 1581);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 121896960 + "'", int26 == 121896960);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.subtract((int) (short) 0, (int) '#');
        int int15 = mathTest0.subtract((-1), 100);
        int int18 = mathTest0.add(5151, (-51));
        int int21 = mathTest0.multiply((-2), (-65));
        int int24 = mathTest0.subtract((-268034188), 1357852871);
        int int27 = mathTest0.multiply((-27040097), 1202336576);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-35) + "'", int12 == (-35));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-101) + "'", int15 == (-101));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5100 + "'", int18 == 5100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 130 + "'", int21 == 130);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1625887059) + "'", int24 == (-1625887059));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1528736576) + "'", int27 == (-1528736576));
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(3232, (-3168));
        int int8 = mathTest0.square((-3232));
        int int11 = mathTest0.add(29421356, 112);
        int int14 = mathTest0.subtract((int) '#', 1225);
        int int16 = mathTest0.square(461828740);
        int int18 = mathTest0.square(4351);
        int int20 = mathTest0.square((-1440205312));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10445824 + "'", int8 == 10445824);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 29421468 + "'", int11 == 29421468);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1190) + "'", int14 == (-1190));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1611803632) + "'", int16 == (-1611803632));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 18931201 + "'", int18 == 18931201);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-345767936) + "'", int20 == (-345767936));
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add((int) (byte) 10, (-3232));
        int int15 = mathTest0.add((-3243), 31);
        int int18 = mathTest0.divide((-7), 144);
        int int21 = mathTest0.divide(1094050, (-1744279840));
        int int23 = mathTest0.square(2002088192);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3222) + "'", int12 == (-3222));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3212) + "'", int15 == (-3212));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1004601344 + "'", int23 == 1004601344);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int5 = mathTest0.square((int) (byte) 10);
        int int7 = mathTest0.square((-101));
        int int10 = mathTest0.multiply((-31), 99);
        int int13 = mathTest0.add(73627785, 138566);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10201 + "'", int7 == 10201);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-3069) + "'", int10 == (-3069));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 73766351 + "'", int13 == 73766351);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.add(100, (int) (short) 1);
        int int9 = mathTest0.divide(1581, 4353);
        java.lang.Class<?> wildcardClass10 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        int int20 = mathTest0.divide(2500, (-13503535));
        int int23 = mathTest0.subtract(1108809, 34225092);
        int int26 = mathTest0.add(1290100, 1322761358);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-33116283) + "'", int23 == (-33116283));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1324051458 + "'", int26 == 1324051458);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((-1), (-50));
        int int18 = mathTest0.add((-6476), 1962934338);
        int int21 = mathTest0.divide((-341), (-13503587));
        int int24 = mathTest0.subtract(461828740, (-27040097));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1962927862 + "'", int18 == 1962927862);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 488868837 + "'", int24 == 488868837);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.divide((-101), 303);
        int int15 = mathTest0.multiply((-1387121095), (-2046820352));
        // The following exception was thrown during execution in test generation
        try {
            int int18 = mathTest0.divide(1334963529, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Cannot divide by zero.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-704643072) + "'", int15 == (-704643072));
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.add((int) (short) 1, 0);
        int int14 = mathTest0.multiply((-399), 1156);
        int int17 = mathTest0.divide(148155, 52);
        int int20 = mathTest0.divide((-3222), (-12));
        int int23 = mathTest0.add(1340487425, (-1664876544));
        java.lang.Class<?> wildcardClass24 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-461244) + "'", int14 == (-461244));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2849 + "'", int17 == 2849);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 268 + "'", int20 == 268);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-324389119) + "'", int23 == (-324389119));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(3232, (-3168));
        int int8 = mathTest0.square((-3232));
        int int11 = mathTest0.subtract((int) (byte) 100, (-63));
        int int14 = mathTest0.subtract((-63), (int) (byte) 0);
        int int16 = mathTest0.square(1346542369);
        int int19 = mathTest0.add((-845551616), 11161);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10445824 + "'", int8 == 10445824);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 163 + "'", int11 == 163);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-63) + "'", int14 == (-63));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-83559871) + "'", int16 == (-83559871));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-845540455) + "'", int19 == (-845540455));
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) ' ');
        int int12 = mathTest0.divide((int) (byte) 100, 36);
        int int15 = mathTest0.subtract(0, 3232);
        int int18 = mathTest0.divide(104060401, 3329);
        int int20 = mathTest0.square(163);
        int int22 = mathTest0.square(3414480);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3232) + "'", int15 == (-3232));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 31258 + "'", int18 == 31258);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 26569 + "'", int20 == 26569);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2132429056 + "'", int22 == 2132429056);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        mathTest mathTest0 = new mathTest();
        int int2 = mathTest0.square((-101));
        int int5 = mathTest0.multiply(1594884096, (-29422512));
        int int8 = mathTest0.divide((-32969632), (-3295));
        int int11 = mathTest0.divide(2499561, 3329);
        int int14 = mathTest0.add(27426628, 1962924603);
        int int17 = mathTest0.multiply(11082241, 923);
        int int20 = mathTest0.multiply((-781697343), 42);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10201 + "'", int2 == 10201);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1962934272 + "'", int5 == 1962934272);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10005 + "'", int8 == 10005);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 750 + "'", int11 == 750);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1990351231 + "'", int14 == 1990351231);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1638973851 + "'", int17 == 1638973851);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1528449962 + "'", int20 == 1528449962);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.subtract((int) '#', (int) (short) 100);
        int int12 = mathTest0.divide(712776852, (-27036767));
        int int15 = mathTest0.subtract(1262550330, (-675));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-65) + "'", int9 == (-65));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-26) + "'", int12 == (-26));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1262551005 + "'", int15 == 1262551005);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
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
        int int35 = mathTest0.multiply(13516830, (int) (byte) 100);
        java.lang.Class<?> wildcardClass36 = mathTest0.getClass();
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1351683000 + "'", int35 == 1351683000);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply(2017675720, (-3295));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 367876808 + "'", int9 == 367876808);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int11 = mathTest0.square(3232);
        int int14 = mathTest0.divide((-32), (int) (short) 1);
        int int17 = mathTest0.add(36, 1010);
        int int20 = mathTest0.multiply((-1544804416), 2704);
        int int23 = mathTest0.divide((-3217), 1962924603);
        int int26 = mathTest0.subtract(1953321121, 27040000);
        java.lang.Class<?> wildcardClass27 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10445824 + "'", int11 == 10445824);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-32) + "'", int14 == (-32));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1046 + "'", int17 == 1046);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1852038144 + "'", int20 == 1852038144);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1926281121 + "'", int26 == 1926281121);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) ' ');
        int int12 = mathTest0.divide((int) (byte) 100, 36);
        int int15 = mathTest0.multiply(63, (-1));
        int int18 = mathTest0.subtract(0, 990);
        int int21 = mathTest0.add((-1328271), 10445824);
        int int23 = mathTest0.square((-40385895));
        int int26 = mathTest0.divide(0, 1499341);
        int int29 = mathTest0.divide((-366998), (-16458735));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-63) + "'", int15 == (-63));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-990) + "'", int18 == (-990));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9117553 + "'", int21 == 9117553);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1905639567) + "'", int23 == (-1905639567));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square(5200);
        int int14 = mathTest0.multiply((-7), 13);
        int int17 = mathTest0.multiply((-27034267), (-13));
        int int19 = mathTest0.square((-27046437));
        int int22 = mathTest0.divide(950697, 9700);
        int int25 = mathTest0.subtract(1208040860, 19044);
        int int28 = mathTest0.add((-27040097), 10036252);
        int int31 = mathTest0.divide((-1382167866), (-869324773));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27040000 + "'", int11 == 27040000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-91) + "'", int14 == (-91));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 351445471 + "'", int17 == 351445471);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-485525159) + "'", int19 == (-485525159));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 98 + "'", int22 == 98);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1208021816 + "'", int25 == 1208021816);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-17003845) + "'", int28 == (-17003845));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.subtract((int) '#', (int) (short) 100);
        int int12 = mathTest0.divide(0, (-1021));
        int int14 = mathTest0.square((-1086347664));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-65) + "'", int9 == (-65));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2002088192 + "'", int14 == 2002088192);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.divide(10201, 750);
        int int15 = mathTest0.subtract(1852038144, 1706236992);
        int int18 = mathTest0.subtract(0, 377578);
        int int21 = mathTest0.divide((-461244), 823696656);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 13 + "'", int12 == 13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 145801152 + "'", int15 == 145801152);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-377578) + "'", int18 == (-377578));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.subtract((int) '#', (int) (short) 1);
        int int17 = mathTest0.multiply(1, (-1));
        int int20 = mathTest0.subtract(1962934272, (-66));
        int int22 = mathTest0.square(17960388);
        int int25 = mathTest0.add(1262551005, 14747159);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1962934338 + "'", int20 == 1962934338);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2018344464 + "'", int22 == 2018344464);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1277298164 + "'", int25 == 1277298164);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int12 = mathTest0.add(290, 2);
        int int14 = mathTest0.square(249987721);
        int int17 = mathTest0.multiply(1966983424, (-9778230));
        int int20 = mathTest0.divide(583058802, (-925149353));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 292 + "'", int12 == 292);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-860132015) + "'", int14 == (-860132015));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1155294720) + "'", int17 == (-1155294720));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(3232, (-3168));
        int int8 = mathTest0.square((-3232));
        int int11 = mathTest0.subtract((int) (byte) 100, (-63));
        int int14 = mathTest0.add(1099748687, (-2));
        int int17 = mathTest0.multiply(3307, 1892067663);
        int int19 = mathTest0.square((-29422522));
        int int22 = mathTest0.subtract((-1109372839), 310);
        java.lang.Class<?> wildcardClass23 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10445824 + "'", int8 == 10445824);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 163 + "'", int11 == 163);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1099748685 + "'", int14 == 1099748685);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-699588731) + "'", int17 == (-699588731));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-217406684) + "'", int19 == (-217406684));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1109373149) + "'", int22 == (-1109373149));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.subtract((int) (short) -1, (int) (short) 100);
        int int17 = mathTest0.add(1962934338, (int) (byte) 0);
        int int20 = mathTest0.add((-805856915), 467620268);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-101) + "'", int14 == (-101));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1962934338 + "'", int17 == 1962934338);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-338236647) + "'", int20 == (-338236647));
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.subtract((int) '#', (int) (short) 1);
        int int17 = mathTest0.multiply(1, (-1));
        int int19 = mathTest0.square((-3168));
        int int22 = mathTest0.add((-1507558223), 98);
        int int25 = mathTest0.subtract(43803810, (-94292389));
        int int28 = mathTest0.subtract(177957, 0);
        int int31 = mathTest0.multiply(262793188, 220);
        int int34 = mathTest0.subtract((-365052929), 198987432);
        int int37 = mathTest0.add((-865176864), (-603983040));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10036224 + "'", int19 == 10036224);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1507558125) + "'", int22 == (-1507558125));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 138096199 + "'", int25 == 138096199);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 177957 + "'", int28 == 177957);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1979926512 + "'", int31 == 1979926512);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-564040361) + "'", int34 == (-564040361));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1469159904) + "'", int37 == (-1469159904));
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.subtract((int) '#', (int) (short) 100);
        int int12 = mathTest0.divide(0, (-1021));
        int int15 = mathTest0.subtract(63, (-13503535));
        int int17 = mathTest0.square((-1319425623));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-65) + "'", int9 == (-65));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 13503598 + "'", int15 == 13503598);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1458409873 + "'", int17 == 1458409873);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.add(52, 98);
        int int17 = mathTest0.add((-13), (-364053231));
        int int20 = mathTest0.multiply(52, (-3222));
        int int23 = mathTest0.subtract((-800168755), 329739778);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 150 + "'", int14 == 150);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-364053244) + "'", int17 == (-364053244));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-167544) + "'", int20 == (-167544));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1129908533) + "'", int23 == (-1129908533));
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add((int) (byte) 10, (-3232));
        int int15 = mathTest0.add((-3243), 31);
        int int18 = mathTest0.divide((-7), 144);
        int int21 = mathTest0.divide(1094050, (-1744279840));
        int int24 = mathTest0.add((-1342673348), (-124));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3222) + "'", int12 == (-3222));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3212) + "'", int15 == (-3212));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1342673472) + "'", int24 == (-1342673472));
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int8 = mathTest0.square((-51));
        int int11 = mathTest0.divide((-3222), 112);
        int int14 = mathTest0.multiply(1, (-134969936));
        int int16 = mathTest0.square(134966615);
        int int19 = mathTest0.multiply((int) (byte) 0, 1962927862);
        int int22 = mathTest0.multiply(2550, 596318976);
        int int25 = mathTest0.subtract((-26), 0);
        int int27 = mathTest0.square((-6600));
        int int30 = mathTest0.divide(29421356, (-327155712));
        int int33 = mathTest0.multiply((-1992745152), 4594735);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2601 + "'", int8 == 2601);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-28) + "'", int11 == (-28));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-134969936) + "'", int14 == (-134969936));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 70071185 + "'", int16 == 70071185);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 194966016 + "'", int22 == 194966016);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-26) + "'", int25 == (-26));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 43560000 + "'", int27 == 43560000);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-60310336) + "'", int33 == (-60310336));
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        int int20 = mathTest0.divide(2, 11);
        int int23 = mathTest0.multiply((-2720), (int) (short) 100);
        int int26 = mathTest0.subtract(420490433, 1128265728);
        int int29 = mathTest0.subtract(0, (-1440205312));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-272000) + "'", int23 == (-272000));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-707775295) + "'", int26 == (-707775295));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1440205312 + "'", int29 == 1440205312);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide((-2030039894), 1050616853);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.divide(1290100, (-3232));
        int int20 = mathTest0.divide((-6476), 34);
        int int23 = mathTest0.subtract(10, (-8));
        int int26 = mathTest0.add((-1744279798), 1757167616);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-399) + "'", int17 == (-399));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-190) + "'", int20 == (-190));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 18 + "'", int23 == 18);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 12887818 + "'", int26 == 12887818);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
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
        int int29 = mathTest0.add(1964249568, 1281588);
        int int32 = mathTest0.multiply((-18), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-399) + "'", int17 == (-399));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-330390172) + "'", int23 == (-330390172));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1789478103) + "'", int26 == (-1789478103));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1965531156 + "'", int29 == 1965531156);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.multiply(10445824, 10445824);
        int int12 = mathTest0.divide(2704, (-5681));
        int int14 = mathTest0.square(712775872);
        int int17 = mathTest0.add(11082582, (int) ' ');
        java.lang.Class<?> wildcardClass18 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1594884096 + "'", int9 == 1594884096);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-60518400) + "'", int14 == (-60518400));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 11082614 + "'", int17 == 11082614);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) ' ');
        int int12 = mathTest0.divide((int) (byte) 100, 36);
        int int15 = mathTest0.subtract(0, 3232);
        int int18 = mathTest0.divide(104060401, 3329);
        int int20 = mathTest0.square((-1086369187));
        int int23 = mathTest0.add(324766576, 1086);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3232) + "'", int15 == (-3232));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 31258 + "'", int18 == 31258);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1782953417 + "'", int20 == 1782953417);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 324767662 + "'", int23 == 324767662);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.subtract(36, 3232);
        int int16 = mathTest0.square((-366998));
        int int19 = mathTest0.add(31, 0);
        int int22 = mathTest0.multiply(137574, 26569);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3196) + "'", int14 == (-3196));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1543545828 + "'", int16 == 1543545828);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 31 + "'", int19 == 31);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-639763690) + "'", int22 == (-639763690));
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int14 = mathTest0.square(0);
        int int17 = mathTest0.add(100, 203);
        int int19 = mathTest0.square(3414480);
        int int22 = mathTest0.add(218028, (-66));
        int int25 = mathTest0.divide((-1993779136), 17689);
        int int28 = mathTest0.add((-377578), (-921119623));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 303 + "'", int17 == 303);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2132429056 + "'", int19 == 2132429056);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 217962 + "'", int22 == 217962);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-112712) + "'", int25 == (-112712));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-921497201) + "'", int28 == (-921497201));
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        int int20 = mathTest0.subtract(12, (-3295));
        int int23 = mathTest0.multiply((-138), 4356);
        int int25 = mathTest0.square(311400096);
        int int27 = mathTest0.square((-1206054128));
        int int30 = mathTest0.subtract(9113164, (-43));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3307 + "'", int20 == 3307);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-601128) + "'", int23 == (-601128));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 526377984 + "'", int25 == 526377984);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1393254656 + "'", int27 == 1393254656);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 9113207 + "'", int30 == 9113207);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.add((int) (short) 1, 0);
        int int14 = mathTest0.add(51, (-3232));
        int int17 = mathTest0.subtract((-3222), 100);
        int int20 = mathTest0.subtract((-6600), 2849);
        int int23 = mathTest0.divide(0, (-1469916730));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3181) + "'", int14 == (-3181));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-3322) + "'", int17 == (-3322));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-9449) + "'", int20 == (-9449));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) ' ');
        int int12 = mathTest0.add((-1042102), 1000500);
        int int15 = mathTest0.add((-1838192896), (-341));
        int int18 = mathTest0.multiply((-13503535), 1156);
        int int21 = mathTest0.add(3329, 18352);
        int int24 = mathTest0.divide(1964259238, (-1004464543));
        int int26 = mathTest0.square(999698);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-41602) + "'", int12 == (-41602));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1838193237) + "'", int15 == (-1838193237));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1569782724 + "'", int18 == 1569782724);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 21681 + "'", int21 == 21681);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1331288764) + "'", int26 == (-1331288764));
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.subtract((int) (short) 0, (int) '#');
        int int15 = mathTest0.subtract((-1), 100);
        int int18 = mathTest0.add(5151, (-51));
        int int21 = mathTest0.divide(27040000, (-1086356767));
        int int24 = mathTest0.multiply(191558869, 8143731);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-35) + "'", int12 == (-35));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-101) + "'", int15 == (-101));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5100 + "'", int18 == 5100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1236550993) + "'", int24 == (-1236550993));
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        int int20 = mathTest0.multiply((int) (short) 10, 99);
        int int23 = mathTest0.divide((int) (short) 100, 10445824);
        int int25 = mathTest0.square((-3535));
        int int28 = mathTest0.subtract((-366998), 150);
        int int31 = mathTest0.multiply(22533, 2059468800);
        int int34 = mathTest0.add((-1440557692), 10036224);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 990 + "'", int20 == 990);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 12496225 + "'", int25 == 12496225);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-367148) + "'", int28 == (-367148));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1111162880) + "'", int31 == (-1111162880));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1430521468) + "'", int34 == (-1430521468));
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int11 = mathTest0.square(3232);
        int int14 = mathTest0.divide((-32), (int) (short) 1);
        int int17 = mathTest0.multiply(990, (int) (byte) 1);
        int int20 = mathTest0.multiply(1262560048, (-39024));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10445824 + "'", int11 == 10445824);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-32) + "'", int14 == (-32));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 990 + "'", int17 == 990);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1721506560 + "'", int20 == 1721506560);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add(52, (-3295));
        int int6 = mathTest0.add((-743732520), (-137952));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3243) + "'", int3 == (-3243));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-743870472) + "'", int6 == (-743870472));
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) ' ');
        int int12 = mathTest0.divide((int) (byte) 100, 36);
        int int15 = mathTest0.subtract(0, 3232);
        int int18 = mathTest0.divide(104060401, 3329);
        int int20 = mathTest0.square(163);
        int int23 = mathTest0.divide((int) (short) 1, 19);
        int int26 = mathTest0.multiply((-1732640), 569975808);
        int int29 = mathTest0.subtract((-134969936), 163);
        int int32 = mathTest0.divide(1895825408, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3232) + "'", int15 == (-3232));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 31258 + "'", int18 == 31258);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 26569 + "'", int20 == 26569);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 421232640 + "'", int26 == 421232640);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-134970099) + "'", int29 == (-134970099));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 189582540 + "'", int32 == 189582540);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int8 = mathTest0.square((-51));
        int int11 = mathTest0.divide((-3222), 112);
        int int14 = mathTest0.multiply(1, (-134969936));
        int int17 = mathTest0.multiply(10, 5541);
        int int20 = mathTest0.subtract(1764582825, 12508860);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2601 + "'", int8 == 2601);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-28) + "'", int11 == (-28));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-134969936) + "'", int14 == (-134969936));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 55410 + "'", int17 == 55410);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1752073965 + "'", int20 == 1752073965);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int11 = mathTest0.square(3232);
        int int14 = mathTest0.divide((-32), (int) (short) 1);
        int int17 = mathTest0.add(36, 1010);
        int int20 = mathTest0.divide(128, 11);
        int int22 = mathTest0.square(11082241);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10445824 + "'", int11 == 10445824);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-32) + "'", int14 == (-32));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1046 + "'", int17 == 1046);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 11 + "'", int20 == 11);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1475752961 + "'", int22 == 1475752961);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.subtract((int) (short) -1, (int) (short) 100);
        int int16 = mathTest0.square(101);
        int int18 = mathTest0.square(99);
        int int21 = mathTest0.add(22500, (-167544));
        int int23 = mathTest0.square(17921364);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-101) + "'", int14 == (-101));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10201 + "'", int16 == 10201);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9801 + "'", int18 == 9801);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-145044) + "'", int21 == (-145044));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1928192912 + "'", int23 == 1928192912);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square((-32969632));
        int int13 = mathTest0.square(1581);
        int int16 = mathTest0.subtract((int) (short) 10, 2030043136);
        int int19 = mathTest0.add(9113164, 1046);
        int int22 = mathTest0.subtract(2005116570, (-821630));
        int int25 = mathTest0.subtract(6010, (-474231967));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 541139968 + "'", int11 == 541139968);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2499561 + "'", int13 == 2499561);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2030043126) + "'", int16 == (-2030043126));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 9114210 + "'", int19 == 9114210);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2005938200 + "'", int22 == 2005938200);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 474237977 + "'", int25 == 474237977);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.multiply(101, 51);
        int int17 = mathTest0.divide(144, 64);
        int int20 = mathTest0.subtract(10005, (-1156));
        int int23 = mathTest0.divide(1368783, (-805857037));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5151 + "'", int14 == 5151);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 11161 + "'", int20 == 11161);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(12, 100);
        int int15 = mathTest0.add(2601, (-51));
        int int18 = mathTest0.divide((-51918), 1594884096);
        int int21 = mathTest0.multiply(1543545828, (-477771120));
        int int23 = mathTest0.square(1820980257);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 112 + "'", int12 == 112);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2550 + "'", int15 == 2550);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1826482112) + "'", int21 == (-1826482112));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 203484225 + "'", int23 == 203484225);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.subtract((int) (short) 0, (int) '#');
        int int15 = mathTest0.add((-101), 1024);
        int int18 = mathTest0.multiply((-845551616), (-1086369187));
        int int21 = mathTest0.multiply(999644832, 5541);
        java.lang.Class<?> wildcardClass22 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-35) + "'", int12 == (-35));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 923 + "'", int15 == 923);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 356075520 + "'", int18 == 356075520);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1475797728) + "'", int21 == (-1475797728));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) ' ');
        int int12 = mathTest0.add((-1042102), 1000500);
        java.lang.Class<?> wildcardClass13 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-41602) + "'", int12 == (-41602));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
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
        int int29 = mathTest0.square((-123));
        int int31 = mathTest0.square((-52));
        int int34 = mathTest0.subtract(1223435024, (-32969632));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-35) + "'", int12 == (-35));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-101) + "'", int15 == (-101));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5100 + "'", int18 == 5100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 130 + "'", int21 == 130);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1192156252 + "'", int27 == 1192156252);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 15129 + "'", int29 == 15129);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2704 + "'", int31 == 2704);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1256404656 + "'", int34 == 1256404656);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int14 = mathTest0.square(0);
        int int16 = mathTest0.square(5200);
        int int19 = mathTest0.divide(117, (-5073684));
        int int22 = mathTest0.divide((-127500), 1724707841);
        int int25 = mathTest0.subtract(11069344, (-14622));
        int int28 = mathTest0.divide(11082614, 150);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 27040000 + "'", int16 == 27040000);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 11083966 + "'", int25 == 11083966);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 73884 + "'", int28 == 73884);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        mathTest mathTest0 = new mathTest();
        int int2 = mathTest0.square(0);
        int int4 = mathTest0.square((-1845642241));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-32208895) + "'", int4 == (-32208895));
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) ' ');
        int int12 = mathTest0.divide((int) (byte) 100, 36);
        int int15 = mathTest0.multiply(63, (-1));
        int int18 = mathTest0.subtract(0, 990);
        int int21 = mathTest0.multiply(3190, 1074639160);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-63) + "'", int15 == (-63));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-990) + "'", int18 == (-990));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 715018192 + "'", int21 == 715018192);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.divide(0, 5200);
        int int13 = mathTest0.square(150);
        int int16 = mathTest0.multiply(0, 1208040860);
        int int18 = mathTest0.square(1103809);
        java.lang.Class<?> wildcardClass19 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 22500 + "'", int13 == 22500);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1376403583) + "'", int18 == (-1376403583));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.add((int) (short) 1, 0);
        int int14 = mathTest0.add(51, (-3232));
        int int17 = mathTest0.subtract((-3222), 100);
        int int20 = mathTest0.add(290, 999698);
        int int23 = mathTest0.multiply((-38228), (-26076203));
        int int25 = mathTest0.square(109330155);
        int int27 = mathTest0.square(187388721);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3181) + "'", int14 == (-3181));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-3322) + "'", int17 == (-3322));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 999988 + "'", int20 == 999988);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 408675612 + "'", int23 == 408675612);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-171004999) + "'", int25 == (-171004999));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1132384097 + "'", int27 == 1132384097);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        mathTest mathTest0 = new mathTest();
        int int2 = mathTest0.square((-101));
        int int4 = mathTest0.square(1357853952);
        int int7 = mathTest0.multiply(1810766268, 0);
        int int10 = mathTest0.subtract((-174), 781646446);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10201 + "'", int2 == 10201);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 16318464 + "'", int4 == 16318464);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-781646620) + "'", int10 == (-781646620));
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.divide(1496241, 10201);
        int int15 = mathTest0.divide(11161, 1);
        int int18 = mathTest0.subtract((-50897), (-781697343));
        int int21 = mathTest0.subtract((-1563969600), (-615839));
        java.lang.Class<?> wildcardClass22 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 146 + "'", int12 == 146);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11161 + "'", int15 == 11161);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 781646446 + "'", int18 == 781646446);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1563353761) + "'", int21 == (-1563353761));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
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
        int int29 = mathTest0.subtract(1892066507, (-852000));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-32969632) + "'", int17 == (-32969632));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1000500 + "'", int23 == 1000500);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1042405) + "'", int26 == (-1042405));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1892918507 + "'", int29 == 1892918507);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((int) (short) -1, 36);
        int int18 = mathTest0.multiply((-51), (-31));
        int int21 = mathTest0.divide((-1544804416), (-805857024));
        int int23 = mathTest0.square(12496225);
        int int26 = mathTest0.add((-969485412), 8116801);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1581 + "'", int18 == 1581);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-781697343) + "'", int23 == (-781697343));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-961368611) + "'", int26 == (-961368611));
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(3232, (-3168));
        int int8 = mathTest0.square((-3232));
        int int11 = mathTest0.multiply((-1838192896), 712776862);
        int int14 = mathTest0.multiply(1156, (-1611803693));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10445824 + "'", int8 == 10445824);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1946522112 + "'", int11 == 1946522112);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 770737356 + "'", int14 == 770737356);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square(268);
        int int14 = mathTest0.add((-1155294720), (-1740241));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 71824 + "'", int11 == 71824);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1157034961) + "'", int14 == (-1157034961));
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.subtract((int) '#', (int) (short) 100);
        int int11 = mathTest0.square(99);
        int int14 = mathTest0.divide(12508860, 1200);
        java.lang.Class<?> wildcardClass15 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-65) + "'", int9 == (-65));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9801 + "'", int11 == 9801);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10424 + "'", int14 == 10424);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        int int20 = mathTest0.subtract(12, (-3295));
        int int23 = mathTest0.multiply((-138), 4356);
        int int26 = mathTest0.subtract(1724707840, (int) (short) -1);
        java.lang.Class<?> wildcardClass27 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3307 + "'", int20 == 3307);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-601128) + "'", int23 == (-601128));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1724707841 + "'", int26 == 1724707841);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int11 = mathTest0.square(3232);
        int int14 = mathTest0.divide((-32), (int) (short) 1);
        int int17 = mathTest0.add(36, 1010);
        int int20 = mathTest0.multiply((-1544804416), 2704);
        int int23 = mathTest0.divide((-3217), 1962924603);
        int int26 = mathTest0.add(4700, 212338);
        int int29 = mathTest0.multiply(0, 334084);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10445824 + "'", int11 == 10445824);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-32) + "'", int14 == (-32));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1046 + "'", int17 == 1046);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1852038144 + "'", int20 == 1852038144);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 217038 + "'", int26 == 217038);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.subtract((int) '#', (int) (short) 100);
        int int11 = mathTest0.square(1174437474);
        int int14 = mathTest0.multiply(4096, 1881653649);
        int int16 = mathTest0.square(1255298511);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-65) + "'", int9 == (-65));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-698049148) + "'", int11 == (-698049148));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2082017280 + "'", int14 == 2082017280);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1872814751) + "'", int16 == (-1872814751));
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((-32), 99);
        int int9 = mathTest0.divide((-3232), 51);
        int int12 = mathTest0.subtract(34, (int) (short) 100);
        int int15 = mathTest0.divide(2020667172, 1818760861);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3168) + "'", int6 == (-3168));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-63) + "'", int9 == (-63));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-66) + "'", int12 == (-66));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) ' ');
        int int12 = mathTest0.divide((int) (byte) 100, 36);
        int int15 = mathTest0.subtract(0, 3232);
        int int18 = mathTest0.divide(104060401, 3329);
        int int21 = mathTest0.add((-134974868), 1095024016);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3232) + "'", int15 == (-3232));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 31258 + "'", int18 == 31258);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 960049148 + "'", int21 == 960049148);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.divide((-101), 2);
        int int9 = mathTest0.multiply(101, 10);
        int int12 = mathTest0.multiply(2601, (-101));
        int int15 = mathTest0.add(2738, 1156);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1010 + "'", int9 == 1010);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-262701) + "'", int12 == (-262701));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3894 + "'", int15 == 3894);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        mathTest mathTest0 = new mathTest();
        int int2 = mathTest0.square((-101));
        int int5 = mathTest0.multiply(0, 1024);
        int int8 = mathTest0.multiply(98, 10201);
        int int11 = mathTest0.multiply(1964248753, (-252448));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10201 + "'", int2 == 10201);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 999698 + "'", int8 == 999698);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 484995040 + "'", int11 == 484995040);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        int int20 = mathTest0.multiply((-1081), 0);
        int int23 = mathTest0.add(1964259238, 4096);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1964263334 + "'", int23 == 1964263334);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((int) (short) -1, 36);
        int int18 = mathTest0.multiply((-51), (-31));
        int int21 = mathTest0.multiply(1237, 1962924603);
        java.lang.Class<?> wildcardClass22 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1581 + "'", int18 == 1581);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1481211671 + "'", int21 == 1481211671);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(12, 100);
        int int15 = mathTest0.subtract(0, (-1156));
        int int18 = mathTest0.subtract((-1), 2048);
        int int21 = mathTest0.multiply(0, 506250000);
        int int24 = mathTest0.divide(546218051, (-129702790));
        int int27 = mathTest0.divide(702330714, 1764582825);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 112 + "'", int12 == 112);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1156 + "'", int15 == 1156);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2049) + "'", int18 == (-2049));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-4) + "'", int24 == (-4));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int8 = mathTest0.square((-51));
        int int11 = mathTest0.subtract(100, (-190));
        int int14 = mathTest0.divide((-66), (-63));
        int int16 = mathTest0.square(13503598);
        int int19 = mathTest0.multiply(1094050, (-1065097728));
        int int21 = mathTest0.square(8143731);
        int int24 = mathTest0.multiply((-1065097728), 1649770749);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2601 + "'", int8 == 2601);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 290 + "'", int11 == 290);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 27426628 + "'", int16 == 27426628);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1702726656 + "'", int19 == 1702726656);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1764582825 + "'", int21 == 1764582825);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1822798336) + "'", int24 == (-1822798336));
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int5 = mathTest0.square((int) (byte) 10);
        int int7 = mathTest0.square(51);
        int int10 = mathTest0.subtract(1653863434, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2601 + "'", int7 == 2601);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1653863434 + "'", int10 == 1653863434);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.subtract((int) '#', (int) (short) 100);
        int int12 = mathTest0.divide(0, (-1021));
        int int15 = mathTest0.subtract(63, (-13503535));
        int int18 = mathTest0.multiply((-1757167973), 64);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-65) + "'", int9 == (-65));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 13503598 + "'", int15 == 13503598);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-789600576) + "'", int18 == (-789600576));
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(1290100, 9700);
        int int9 = mathTest0.multiply((-124), 12);
        int int12 = mathTest0.divide(203, (-28));
        int int15 = mathTest0.multiply(1262550330, 324767662);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 133 + "'", int6 == 133);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1488) + "'", int9 == (-1488));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-7) + "'", int12 == (-7));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-985824404) + "'", int15 == (-985824404));
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(3232, (-3168));
        int int8 = mathTest0.square((-3232));
        int int11 = mathTest0.add(29421356, 112);
        java.lang.Class<?> wildcardClass12 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10445824 + "'", int8 == 10445824);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 29421468 + "'", int11 == 29421468);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.subtract((int) (short) 0, (int) '#');
        int int15 = mathTest0.subtract((-1), 100);
        int int18 = mathTest0.add((int) (byte) 1, (-124));
        int int21 = mathTest0.subtract((-1488), (-813));
        int int24 = mathTest0.subtract(712776862, (int) (byte) 10);
        int int27 = mathTest0.multiply((-7022), 1966983405);
        java.lang.Class<?> wildcardClass28 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-35) + "'", int12 == (-35));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-101) + "'", int15 == (-101));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-123) + "'", int18 == (-123));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-675) + "'", int21 == (-675));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 712776852 + "'", int24 == 712776852);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 457354026 + "'", int27 == 457354026);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int8 = mathTest0.square((-51));
        int int11 = mathTest0.subtract(100, (-190));
        int int14 = mathTest0.subtract((-138), 152);
        int int17 = mathTest0.subtract(1200, (-27));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2601 + "'", int8 == 2601);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 290 + "'", int11 == 290);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-290) + "'", int14 == (-290));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1227 + "'", int17 == 1227);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.subtract((int) (short) 0, (int) '#');
        int int15 = mathTest0.subtract((-1), 100);
        int int18 = mathTest0.add(1861148465, 7627);
        java.lang.Class<?> wildcardClass19 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-35) + "'", int12 == (-35));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-101) + "'", int15 == (-101));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1861156092 + "'", int18 == 1861156092);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        mathTest mathTest0 = new mathTest();
        int int2 = mathTest0.square((-101));
        int int5 = mathTest0.multiply(0, 1024);
        int int8 = mathTest0.multiply(98, 10201);
        int int11 = mathTest0.subtract(10000, 999988);
        int int14 = mathTest0.add((-1524229152), 24389000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10201 + "'", int2 == 10201);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 999698 + "'", int8 == 999698);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-989988) + "'", int11 == (-989988));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1499840152) + "'", int14 == (-1499840152));
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((-1), (-50));
        int int18 = mathTest0.divide((int) (short) -1, 163);
        int int21 = mathTest0.subtract(1496089, (-71));
        int int24 = mathTest0.subtract(29175, 40092);
        int int27 = mathTest0.add(27040000, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1496160 + "'", int21 == 1496160);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-10917) + "'", int24 == (-10917));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 27040000 + "'", int27 == 27040000);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((-32), 99);
        int int9 = mathTest0.divide((-3232), 51);
        int int12 = mathTest0.multiply(0, 2);
        int int15 = mathTest0.multiply(429549516, (-461244));
        int int18 = mathTest0.multiply(1174437505, 1614374000);
        int int21 = mathTest0.subtract(1065097791, 3418801);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3168) + "'", int6 == (-3168));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-63) + "'", int9 == (-63));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-295593424) + "'", int15 == (-295593424));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1549450352 + "'", int18 == 1549450352);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1061678990 + "'", int21 == 1061678990);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((-32), 99);
        int int9 = mathTest0.divide((-3232), 51);
        int int11 = mathTest0.square(1046);
        int int13 = mathTest0.square(950697);
        int int15 = mathTest0.square((-1246896128));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3168) + "'", int6 == (-3168));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-63) + "'", int9 == (-63));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1094116 + "'", int11 == 1094116);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1881653649 + "'", int13 == 1881653649);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2080374784) + "'", int15 == (-2080374784));
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
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
        int int36 = mathTest0.multiply(1849, 1010);
        int int39 = mathTest0.divide(361, 1500422);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1867490 + "'", int36 == 1867490);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.divide((-101), 2);
        int int9 = mathTest0.multiply(101, 10);
        int int12 = mathTest0.multiply(1334311154, 1334646608);
        int int14 = mathTest0.square((-11329044));
        int int17 = mathTest0.add((-4537), 429676108);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1010 + "'", int9 == 1010);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-584742496) + "'", int12 == (-584742496));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 730247568 + "'", int14 == 730247568);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 429671571 + "'", int17 == 429671571);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.subtract((int) '#', (int) (short) 100);
        int int12 = mathTest0.divide(0, (-1021));
        int int14 = mathTest0.square((int) (byte) 10);
        int int17 = mathTest0.subtract(1024, 11612725);
        int int20 = mathTest0.divide((-32), 2126394615);
        int int22 = mathTest0.square(2076);
        java.lang.Class<?> wildcardClass23 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-65) + "'", int9 == (-65));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-11611701) + "'", int17 == (-11611701));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4309776 + "'", int22 == 4309776);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.subtract((int) (short) 0, (int) '#');
        int int15 = mathTest0.subtract((-1), 100);
        int int18 = mathTest0.divide((-3222), (int) '4');
        int int21 = mathTest0.add(5541, (-1190));
        int int24 = mathTest0.add(1496089, 63);
        int int26 = mathTest0.square(963499229);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-35) + "'", int12 == (-35));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-101) + "'", int15 == (-101));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-61) + "'", int18 == (-61));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4351 + "'", int21 == 4351);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1496152 + "'", int24 == 1496152);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1597032137 + "'", int26 == 1597032137);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int8 = mathTest0.square((-51));
        int int11 = mathTest0.divide(18948609, 1499341);
        int int14 = mathTest0.add((-1817304043), 1354363310);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2601 + "'", int8 == 2601);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 12 + "'", int11 == 12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-462940733) + "'", int14 == (-462940733));
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.multiply(10445824, 10445824);
        int int12 = mathTest0.divide(2704, (-5681));
        int int14 = mathTest0.square(712775872);
        int int16 = mathTest0.square(1156);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = mathTest0.divide(7398400, 0);
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
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
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
        java.lang.Class<?> wildcardClass25 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 541139968 + "'", int11 == 541139968);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2499561 + "'", int13 == 2499561);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2030043126) + "'", int16 == (-2030043126));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 9114210 + "'", int19 == 9114210);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 11082582 + "'", int22 == 11082582);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 18948609 + "'", int24 == 18948609);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(3232, (-3168));
        int int8 = mathTest0.square((-375664945));
        int int11 = mathTest0.divide((-10), 21681);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-474231967) + "'", int8 == (-474231967));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
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
        java.lang.Class<?> wildcardClass27 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-399) + "'", int17 == (-399));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-190) + "'", int20 == (-190));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 767974712 + "'", int26 == 767974712);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.subtract((int) (short) -1, (int) (short) 100);
        int int17 = mathTest0.add(1962934338, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = mathTest0.divide((-3069), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Cannot divide by zero.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-101) + "'", int14 == (-101));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1962934338 + "'", int17 == 1962934338);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) ' ');
        int int12 = mathTest0.add((-1042102), 1000500);
        int int15 = mathTest0.add(828396608, 506250000);
        int int18 = mathTest0.multiply(217038, 961);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-41602) + "'", int12 == (-41602));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1334646608 + "'", int15 == 1334646608);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 208573518 + "'", int18 == 208573518);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.divide((-101), 2);
        int int9 = mathTest0.divide((-65), 10005);
        int int11 = mathTest0.square((int) (short) 1);
        int int14 = mathTest0.multiply((-1382167866), 2006064019);
        int int17 = mathTest0.divide((-18339), (-5000));
        int int19 = mathTest0.square((-934701798));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 82465202 + "'", int14 == 82465202);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-5552476) + "'", int19 == (-5552476));
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        mathTest mathTest0 = new mathTest();
        int int2 = mathTest0.square((-101));
        int int5 = mathTest0.multiply(1594884096, (-29422512));
        int int8 = mathTest0.divide((-32969632), (-3295));
        int int11 = mathTest0.divide(2499561, 3329);
        int int13 = mathTest0.square(1074639160);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10201 + "'", int2 == 10201);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1962934272 + "'", int5 == 1962934272);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10005 + "'", int8 == 10005);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 750 + "'", int11 == 750);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2053012544 + "'", int13 == 2053012544);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
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
        int int29 = mathTest0.square((-3535));
        int int31 = mathTest0.square((-1872814751));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1962927862 + "'", int18 == 1962927862);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-825) + "'", int21 == (-825));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1024 + "'", int24 == 1024);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 12496225 + "'", int29 == 12496225);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-245555519) + "'", int31 == (-245555519));
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.subtract(36, 3232);
        int int16 = mathTest0.square((-366998));
        java.lang.Class<?> wildcardClass17 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3196) + "'", int14 == (-3196));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1543545828 + "'", int16 == 1543545828);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(3232, (-3168));
        int int8 = mathTest0.square((-3232));
        int int11 = mathTest0.add(29421356, 112);
        int int14 = mathTest0.subtract((int) '#', 1225);
        int int17 = mathTest0.multiply((-127500), 29462604);
        int int20 = mathTest0.multiply(67760, (-5842342));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10445824 + "'", int8 == 10445824);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 29421468 + "'", int11 == 29421468);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1190) + "'", int14 == (-1190));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1614374000 + "'", int17 == 1614374000);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-740102688) + "'", int20 == (-740102688));
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square((-538890831));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1219906463) + "'", int8 == (-1219906463));
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((-32), 99);
        int int9 = mathTest0.divide((-3232), 51);
        int int12 = mathTest0.subtract(34, (int) (short) 100);
        int int15 = mathTest0.divide((-13503587), (-3069));
        int int18 = mathTest0.add(27040000, 633765517);
        int int21 = mathTest0.add((-123), 138566);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3168) + "'", int6 == (-3168));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-63) + "'", int9 == (-63));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-66) + "'", int12 == (-66));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4399 + "'", int15 == 4399);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 660805517 + "'", int18 == 660805517);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 138443 + "'", int21 == 138443);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.divide((-101), 2);
        int int8 = mathTest0.square(1849);
        int int11 = mathTest0.multiply(9114210, 1496160);
        int int14 = mathTest0.divide(1962927862, 923);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3418801 + "'", int8 == 3418801);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-204731200) + "'", int11 == (-204731200));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2126682 + "'", int14 == 2126682);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        int int20 = mathTest0.subtract(12, (-3295));
        int int23 = mathTest0.add((-101), 112);
        int int26 = mathTest0.divide((-61254896), 1079444356);
        int int29 = mathTest0.divide(311400096, (-364053244));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3307 + "'", int20 == 3307);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 11 + "'", int23 == 11);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int8 = mathTest0.square((-51));
        int int11 = mathTest0.divide((-3222), 112);
        int int14 = mathTest0.multiply(1, (-134969936));
        int int17 = mathTest0.multiply(10, 5541);
        int int20 = mathTest0.subtract(960400, 6880129);
        int int22 = mathTest0.square(2849);
        int int24 = mathTest0.square(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2601 + "'", int8 == 2601);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-28) + "'", int11 == (-28));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-134969936) + "'", int14 == (-134969936));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 55410 + "'", int17 == 55410);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-5919729) + "'", int20 == (-5919729));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8116801 + "'", int22 == 8116801);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.subtract((int) (short) 0, (int) '#');
        int int15 = mathTest0.subtract((-1), 100);
        int int18 = mathTest0.divide((-3222), (int) '4');
        int int20 = mathTest0.square((-980));
        java.lang.Class<?> wildcardClass21 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-35) + "'", int12 == (-35));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-101) + "'", int15 == (-101));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-61) + "'", int18 == (-61));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 960400 + "'", int20 == 960400);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
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
        int int29 = mathTest0.add((-3243), 208780);
        int int32 = mathTest0.multiply((-73794786), 1174437505);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 144 + "'", int11 == 144);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29421356 + "'", int14 == 29421356);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 212338 + "'", int20 == 212338);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3299872 + "'", int23 == 3299872);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1653864505) + "'", int26 == (-1653864505));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 205537 + "'", int29 == 205537);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-969912802) + "'", int32 == (-969912802));
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.divide(0, 5200);
        int int14 = mathTest0.multiply((int) (short) 1, (int) (short) 10);
        int int17 = mathTest0.multiply((-3232), 10201);
        int int20 = mathTest0.divide(22500, 10445824);
        int int23 = mathTest0.multiply((int) (short) 100, 10005);
        int int26 = mathTest0.subtract(1892066507, (-1156));
        int int29 = mathTest0.multiply(311400096, (-13503535));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-32969632) + "'", int17 == (-32969632));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1000500 + "'", int23 == 1000500);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1892067663 + "'", int26 == 1892067663);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1479288672) + "'", int29 == (-1479288672));
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int11 = mathTest0.square(34);
        java.lang.Class<?> wildcardClass12 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1156 + "'", int11 == 1156);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.subtract(36, 3232);
        int int16 = mathTest0.square(2);
        int int19 = mathTest0.add(11, 999698);
        int int22 = mathTest0.multiply(115654857, (-183506));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3196) + "'", int14 == (-3196));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 999709 + "'", int19 == 999709);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1926779106) + "'", int22 == (-1926779106));
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.subtract((int) (short) -1, (int) (short) 100);
        int int17 = mathTest0.multiply((-399), (int) (byte) 10);
        int int20 = mathTest0.multiply(2070448898, 3879786);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-101) + "'", int14 == (-101));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-3990) + "'", int17 == (-3990));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-160369452) + "'", int20 == (-160369452));
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.multiply(101, 51);
        int int17 = mathTest0.divide((-65), (-295593424));
        int int20 = mathTest0.divide(27040000, 1494149);
        int int23 = mathTest0.multiply(2126394615, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5151 + "'", int14 == 5151);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 18 + "'", int20 == 18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-2126394615) + "'", int23 == (-2126394615));
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((-1), (-50));
        int int18 = mathTest0.divide((int) (short) -1, 163);
        int int21 = mathTest0.subtract(1496089, (-71));
        int int24 = mathTest0.divide(1700859166, 1262551005);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1496160 + "'", int21 == 1496160);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.subtract((int) (short) -1, (int) (short) 100);
        int int16 = mathTest0.square(101);
        int int19 = mathTest0.add(1990353832, (int) (byte) 0);
        int int22 = mathTest0.divide((-2244), 1594884096);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-101) + "'", int14 == (-101));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10201 + "'", int16 == 10201);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1990353832 + "'", int19 == 1990353832);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
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
        int int32 = mathTest0.add(19, (-781646620));
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-781646601) + "'", int32 == (-781646601));
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square((-43));
        int int14 = mathTest0.subtract(1156, (-3181));
        int int17 = mathTest0.divide((-1065096738), (-1956926943));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1849 + "'", int11 == 1849);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4337 + "'", int14 == 4337);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.divide(1290100, (-3232));
        int int20 = mathTest0.divide((-6476), 34);
        int int23 = mathTest0.subtract(10, (-8));
        int int25 = mathTest0.square((-3168));
        int int27 = mathTest0.square(506250000);
        int int30 = mathTest0.divide((-105445), 836855920);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-399) + "'", int17 == (-399));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-190) + "'", int20 == (-190));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 18 + "'", int23 == 18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10036224 + "'", int25 == 10036224);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1646354688 + "'", int27 == 1646354688);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        int int20 = mathTest0.multiply(99, (int) (short) 1);
        int int22 = mathTest0.square((-1));
        int int25 = mathTest0.add((-50897), (-38));
        java.lang.Class<?> wildcardClass26 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 99 + "'", int20 == 99);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-50935) + "'", int25 == (-50935));
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int11 = mathTest0.square(3232);
        int int14 = mathTest0.divide(10000, (-2));
        int int17 = mathTest0.divide(1852038144, (-28));
        java.lang.Class<?> wildcardClass18 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10445824 + "'", int11 == 10445824);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-5000) + "'", int14 == (-5000));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-66144219) + "'", int17 == (-66144219));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square((-32969632));
        int int13 = mathTest0.square(1581);
        int int16 = mathTest0.subtract((int) (short) 10, 2030043136);
        int int19 = mathTest0.add(9113164, 1046);
        int int22 = mathTest0.subtract((-40381539), 4356);
        int int24 = mathTest0.square((-1623939036));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 541139968 + "'", int11 == 541139968);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2499561 + "'", int13 == 2499561);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2030043126) + "'", int16 == (-2030043126));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 9114210 + "'", int19 == 9114210);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-40385895) + "'", int22 == (-40385895));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1963934992 + "'", int24 == 1963934992);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
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
        int int28 = mathTest0.subtract(71061173, 5200);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 99 + "'", int20 == 99);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 71055973 + "'", int28 == 71055973);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int8 = mathTest0.square((-51));
        int int11 = mathTest0.divide((-3222), 112);
        int int14 = mathTest0.divide((-2623), (-3212));
        int int16 = mathTest0.square((-366998));
        int int19 = mathTest0.multiply((-923619227), (-65));
        java.lang.Class<?> wildcardClass20 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2601 + "'", int8 == 2601);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-28) + "'", int11 == (-28));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1543545828 + "'", int16 == 1543545828);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-94292389) + "'", int19 == (-94292389));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(3232, (-3168));
        int int8 = mathTest0.square((-3232));
        int int11 = mathTest0.add(29421356, 112);
        int int14 = mathTest0.divide((int) (byte) 10, 13516830);
        int int17 = mathTest0.subtract((-364053231), 1688954796);
        int int20 = mathTest0.subtract(429549516, 217038);
        int int23 = mathTest0.divide(43560000, 1026171035);
        int int25 = mathTest0.square(29421697);
        int int28 = mathTest0.divide(0, 12116872);
        int int30 = mathTest0.square(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10445824 + "'", int8 == 10445824);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 29421468 + "'", int11 == 29421468);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-2053008027) + "'", int17 == (-2053008027));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 429332478 + "'", int20 == 429332478);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1519247103) + "'", int25 == (-1519247103));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.add((int) (short) 1, 0);
        int int14 = mathTest0.multiply((-399), 1156);
        int int17 = mathTest0.divide(148155, 52);
        int int20 = mathTest0.divide((-3222), (-12));
        int int23 = mathTest0.divide((-135036), 66);
        java.lang.Class<?> wildcardClass24 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-461244) + "'", int14 == (-461244));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2849 + "'", int17 == 2849);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 268 + "'", int20 == 268);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-2046) + "'", int23 == (-2046));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.subtract((int) (short) 0, (int) '#');
        int int15 = mathTest0.subtract((-1), 100);
        int int17 = mathTest0.square(1296);
        int int19 = mathTest0.square(1667);
        int int22 = mathTest0.divide(70071185, 15046285);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-35) + "'", int12 == (-35));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-101) + "'", int15 == (-101));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1679616 + "'", int17 == 1679616);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2778889 + "'", int19 == 2778889);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int12 = mathTest0.add(290, 2);
        int int15 = mathTest0.multiply((-13503600), (-3243));
        int int18 = mathTest0.add(1496160, (-447823802));
        int int21 = mathTest0.divide((-1338584163), 5405);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 292 + "'", int12 == 292);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 842501840 + "'", int15 == 842501840);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-446327642) + "'", int18 == (-446327642));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-247656) + "'", int21 == (-247656));
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int11 = mathTest0.square(133);
        int int14 = mathTest0.multiply(9700, 133);
        int int16 = mathTest0.square(10201);
        int int19 = mathTest0.subtract(1004601344, (-183506));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 17689 + "'", int11 == 17689);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1290100 + "'", int14 == 1290100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 104060401 + "'", int16 == 104060401);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1004784850 + "'", int19 == 1004784850);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((int) (short) -1, 36);
        int int17 = mathTest0.square((-66));
        int int19 = mathTest0.square(19);
        int int22 = mathTest0.subtract(1202187776, (-148800));
        java.lang.Class<?> wildcardClass23 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4356 + "'", int17 == 4356);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 361 + "'", int19 == 361);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1202336576 + "'", int22 == 1202336576);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int13 = mathTest0.square((-3217));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10349089 + "'", int13 == 10349089);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add(52, (-3295));
        int int6 = mathTest0.multiply(1200, (-124));
        int int9 = mathTest0.subtract(122816, 24389000);
        java.lang.Class<?> wildcardClass10 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3243) + "'", int3 == (-3243));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-148800) + "'", int6 == (-148800));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-24266184) + "'", int9 == (-24266184));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((-32), 99);
        int int9 = mathTest0.divide((-3232), 51);
        int int12 = mathTest0.subtract(34, (int) (short) 100);
        int int15 = mathTest0.divide((-13503587), (-3069));
        int int17 = mathTest0.square(3414448);
        int int20 = mathTest0.divide((-1440557692), 1032656465);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3168) + "'", int6 == (-3168));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-63) + "'", int9 == (-63));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-66) + "'", int12 == (-66));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4399 + "'", int15 == 4399);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1913903360 + "'", int17 == 1913903360);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square(5200);
        int int14 = mathTest0.multiply((-7), 13);
        int int16 = mathTest0.square((-1840008045));
        int int19 = mathTest0.add(1991312875, (-584742523));
        int int22 = mathTest0.divide(35250, 1801532504);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27040000 + "'", int11 == 27040000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-91) + "'", int14 == (-91));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1118899305 + "'", int16 == 1118899305);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1406570352 + "'", int19 == 1406570352);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) ' ');
        int int12 = mathTest0.add((-1042102), 1000500);
        int int15 = mathTest0.add(828396608, 506250000);
        int int17 = mathTest0.square((-367));
        int int20 = mathTest0.subtract((-1157034961), (-1469916730));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-41602) + "'", int12 == (-41602));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1334646608 + "'", int15 == 1334646608);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 134689 + "'", int17 == 134689);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 312881769 + "'", int20 == 312881769);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int5 = mathTest0.square((int) (byte) 10);
        int int8 = mathTest0.add((-29331390), (-27040097));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-56371487) + "'", int8 == (-56371487));
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int11 = mathTest0.square(3232);
        int int14 = mathTest0.divide((-32), (int) (short) 1);
        int int17 = mathTest0.add(11, (int) ' ');
        int int20 = mathTest0.subtract(134966615, (-1086356767));
        int int22 = mathTest0.square(47);
        int int25 = mathTest0.add((-1744279840), 329739778);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10445824 + "'", int11 == 10445824);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-32) + "'", int14 == (-32));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 43 + "'", int17 == 43);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1221323382 + "'", int20 == 1221323382);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2209 + "'", int22 == 2209);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1414540062) + "'", int25 == (-1414540062));
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) (short) 1);
        int int12 = mathTest0.subtract(51, (-66));
        int int15 = mathTest0.subtract(3416061, 1548424529);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 117 + "'", int12 == 117);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1545008468) + "'", int15 == (-1545008468));
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int11 = mathTest0.square(3232);
        int int14 = mathTest0.multiply((-3295), 1);
        int int17 = mathTest0.subtract(1393254656, 7627);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10445824 + "'", int11 == 10445824);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3295) + "'", int14 == (-3295));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1393247029 + "'", int17 == 1393247029);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int13 = mathTest0.square(10036224);
        int int16 = mathTest0.subtract(1324965, (-6476));
        int int19 = mathTest0.multiply(13503598, (-461144));
        int int22 = mathTest0.divide((-1507558125), 163);
        int int24 = mathTest0.square(10000);
        int int26 = mathTest0.square(526377960);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 219152384 + "'", int13 == 219152384);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1331441 + "'", int16 == 1331441);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 599383088 + "'", int19 == 599383088);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-9248822) + "'", int22 == (-9248822));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100000000 + "'", int24 == 100000000);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 555041344 + "'", int26 == 555041344);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.subtract((int) '#', (int) (short) 100);
        int int12 = mathTest0.subtract(10000, (-13506830));
        int int15 = mathTest0.add(1962924603, 1324965);
        int int18 = mathTest0.multiply(1336336, (-1507558125));
        int int21 = mathTest0.divide((-1390698314), 2209);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-65) + "'", int9 == (-65));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 13516830 + "'", int12 == 13516830);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1964249568 + "'", int15 == 1964249568);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1755266352 + "'", int18 == 1755266352);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-629560) + "'", int21 == (-629560));
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        int int20 = mathTest0.subtract(12, (-3295));
        int int23 = mathTest0.multiply((-138), 4356);
        int int26 = mathTest0.subtract(1962934272, 9669);
        int int28 = mathTest0.square((-13494178));
        int int31 = mathTest0.divide(3879786, 1704096500);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3307 + "'", int20 == 3307);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-601128) + "'", int23 == (-601128));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1962924603 + "'", int26 == 1962924603);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-888552828) + "'", int28 == (-888552828));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) ' ');
        int int12 = mathTest0.divide((int) (byte) 100, 36);
        int int15 = mathTest0.subtract(0, 3232);
        int int18 = mathTest0.divide(104060401, 3329);
        int int21 = mathTest0.multiply(13, 13689);
        int int24 = mathTest0.subtract((-14756608), 139145);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3232) + "'", int15 == (-3232));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 31258 + "'", int18 == 31258);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 177957 + "'", int21 == 177957);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-14895753) + "'", int24 == (-14895753));
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) ' ');
        int int12 = mathTest0.divide((int) (byte) 100, 36);
        int int15 = mathTest0.divide(0, (-1));
        int int17 = mathTest0.square((-32));
        int int20 = mathTest0.subtract(28751656, (-1042102));
        java.lang.Class<?> wildcardClass21 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1024 + "'", int17 == 1024);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 29793758 + "'", int20 == 29793758);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.divide(0, 5200);
        int int14 = mathTest0.multiply((int) (short) 1, (int) (short) 10);
        int int17 = mathTest0.multiply((-3232), 10201);
        int int20 = mathTest0.divide(22500, 10445824);
        int int23 = mathTest0.multiply(999698, 0);
        int int26 = mathTest0.add(4700, 1594884096);
        int int29 = mathTest0.multiply(29175, 176965908);
        int int32 = mathTest0.multiply(26877952, (-982371904));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-32969632) + "'", int17 == (-32969632));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1594888796 + "'", int26 == 1594888796);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 429676108 + "'", int29 == 429676108);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-206045184) + "'", int32 == (-206045184));
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.add((int) (byte) -1, (int) '4');
        int int12 = mathTest0.subtract(150, 51);
        int int15 = mathTest0.add(1347654771, 15046285);
        int int18 = mathTest0.add((-1807745024), (-13503600));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 99 + "'", int12 == 99);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1362701056 + "'", int15 == 1362701056);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1821248624) + "'", int18 == (-1821248624));
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int12 = mathTest0.multiply(0, 210);
        int int15 = mathTest0.divide(1500625, 4353);
        int int17 = mathTest0.square(2129930544);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 344 + "'", int15 == 344);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-903845632) + "'", int17 == (-903845632));
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        int int20 = mathTest0.divide((-27036608), 4309776);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-6) + "'", int20 == (-6));
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.add((int) (short) 1, 0);
        int int14 = mathTest0.add(51, (-3232));
        int int17 = mathTest0.divide(9113164, 345137331);
        int int20 = mathTest0.subtract((-29422512), 152);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3181) + "'", int14 == (-3181));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-29422664) + "'", int20 == (-29422664));
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.divide(1290100, (-3232));
        int int20 = mathTest0.divide((-6476), 34);
        int int23 = mathTest0.subtract(10, (-8));
        int int25 = mathTest0.square((-3168));
        int int27 = mathTest0.square(506250000);
        int int30 = mathTest0.divide(87, (-1991992544));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-399) + "'", int17 == (-399));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-190) + "'", int20 == (-190));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 18 + "'", int23 == 18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10036224 + "'", int25 == 10036224);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1646354688 + "'", int27 == 1646354688);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.subtract((int) '#', (int) (short) 1);
        int int17 = mathTest0.multiply(1, (-1));
        int int20 = mathTest0.divide((-2244), 1892066507);
        int int22 = mathTest0.square(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int11 = mathTest0.square(133);
        int int13 = mathTest0.square(27426628);
        int int16 = mathTest0.add(3418801, 1029237664);
        java.lang.Class<?> wildcardClass17 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 17689 + "'", int11 == 17689);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-648771056) + "'", int13 == (-648771056));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1032656465 + "'", int16 == 1032656465);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.subtract((int) (short) 0, (int) '#');
        int int15 = mathTest0.subtract((-1), 100);
        int int18 = mathTest0.add((-990), (-32));
        int int21 = mathTest0.add(461828740, (-27037278));
        int int24 = mathTest0.multiply((-6600), (-366998));
        java.lang.Class<?> wildcardClass25 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-35) + "'", int12 == (-35));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-101) + "'", int15 == (-101));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1022) + "'", int18 == (-1022));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 434791462 + "'", int21 == 434791462);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1872780496) + "'", int24 == (-1872780496));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.divide(0, 5200);
        int int14 = mathTest0.multiply((int) (short) 1, (int) (short) 10);
        int int17 = mathTest0.multiply((-3232), 10201);
        int int20 = mathTest0.divide(22500, 10445824);
        int int23 = mathTest0.multiply(999698, 0);
        int int26 = mathTest0.add(923, 10036252);
        int int29 = mathTest0.add(101, (-1505));
        int int31 = mathTest0.square(1895825408);
        int int34 = mathTest0.multiply(9113164, (-364053231));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-32969632) + "'", int17 == (-32969632));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10037175 + "'", int26 == 10037175);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1404) + "'", int29 == (-1404));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 753733388 + "'", int34 == 753733388);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int11 = mathTest0.square(3232);
        int int14 = mathTest0.divide((-32), (int) (short) 1);
        int int17 = mathTest0.add(36, 1010);
        int int20 = mathTest0.multiply((-1544804416), 2704);
        int int22 = mathTest0.square(17689);
        int int25 = mathTest0.multiply((-1021237618), 1757167616);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10445824 + "'", int11 == 10445824);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-32) + "'", int14 == (-32));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1046 + "'", int17 == 1046);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1852038144 + "'", int20 == 1852038144);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 312900721 + "'", int22 == 312900721);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1240170496 + "'", int25 == 1240170496);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int11 = mathTest0.square(34);
        int int13 = mathTest0.square(1026171035);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1156 + "'", int11 == 1156);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1794957863) + "'", int13 == (-1794957863));
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.add((int) (short) 1, 0);
        int int14 = mathTest0.add(51, (-3232));
        int int17 = mathTest0.add(1500625, (-6476));
        int int20 = mathTest0.multiply((-12), (-1042405));
        int int23 = mathTest0.multiply((-13506830), 4353);
        java.lang.Class<?> wildcardClass24 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3181) + "'", int14 == (-3181));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1494149 + "'", int17 == 1494149);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 12508860 + "'", int20 == 12508860);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1334311154 + "'", int23 == 1334311154);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.divide(0, 5200);
        int int13 = mathTest0.square((int) (short) 0);
        int int16 = mathTest0.multiply((-1312236352), (-1631068032));
        java.lang.Class<?> wildcardClass17 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1093246976) + "'", int16 == (-1093246976));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int5 = mathTest0.square((int) (byte) 10);
        int int8 = mathTest0.add((-1488), 3190);
        int int11 = mathTest0.multiply((-1042405), 2500);
        int int13 = mathTest0.square((-1022));
        int int16 = mathTest0.multiply((-5835742), 1568);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1702 + "'", int8 == 1702);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1688954796 + "'", int11 == 1688954796);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1044484 + "'", int13 == 1044484);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-560508864) + "'", int16 == (-560508864));
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) (short) 1);
        int int12 = mathTest0.add((-63), (-3232));
        int int15 = mathTest0.add(9409, 26877952);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3295) + "'", int12 == (-3295));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 26887361 + "'", int15 == 26887361);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) ' ');
        int int12 = mathTest0.divide((int) (byte) 100, 36);
        int int15 = mathTest0.multiply(63, (-1));
        int int18 = mathTest0.subtract(0, 990);
        int int21 = mathTest0.add((-1328271), 10445824);
        int int23 = mathTest0.square((-40385895));
        int int26 = mathTest0.divide(0, 1499341);
        int int29 = mathTest0.divide((-375815), 596318976);
        java.lang.Class<?> wildcardClass30 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-63) + "'", int15 == (-63));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-990) + "'", int18 == (-990));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9117553 + "'", int21 == 9117553);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1905639567) + "'", int23 == (-1905639567));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) ' ');
        int int12 = mathTest0.divide((int) (byte) 100, 36);
        int int15 = mathTest0.subtract(0, 3232);
        int int18 = mathTest0.divide(104060401, 3329);
        int int21 = mathTest0.subtract((-51), 5541);
        int int24 = mathTest0.add((-31), 9700);
        int int27 = mathTest0.divide((-3322), 19044);
        int int30 = mathTest0.multiply(2002091772, (-1878499328));
        int int33 = mathTest0.add((-38), (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3232) + "'", int15 == (-3232));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 31258 + "'", int18 == 31258);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-5592) + "'", int21 == (-5592));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9669 + "'", int24 == 9669);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-948011008) + "'", int30 == (-948011008));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 14 + "'", int33 == 14);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.subtract((int) '#', (int) (short) 100);
        int int12 = mathTest0.divide(0, (-1021));
        int int14 = mathTest0.square((int) (byte) 10);
        int int17 = mathTest0.subtract(1024, 11612725);
        int int20 = mathTest0.divide((-32), 2126394615);
        int int23 = mathTest0.add((-13503535), 2741983);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-65) + "'", int9 == (-65));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-11611701) + "'", int17 == (-11611701));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-10761552) + "'", int23 == (-10761552));
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int13 = mathTest0.square(22500);
        int int16 = mathTest0.multiply((-204731200), 12);
        int int19 = mathTest0.multiply((-9449), 1964249568);
        int int22 = mathTest0.divide((-5486), 1849);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 506250000 + "'", int13 == 506250000);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1838192896 + "'", int16 == 1838192896);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1640482016) + "'", int19 == (-1640482016));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-2) + "'", int22 == (-2));
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.multiply(101, 51);
        int int17 = mathTest0.add(100000000, 112);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5151 + "'", int14 == 5151);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100000112 + "'", int17 == 100000112);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.add((int) (short) 1, 0);
        int int14 = mathTest0.add(51, (-3232));
        int int17 = mathTest0.add(1500625, (-6476));
        int int20 = mathTest0.multiply((-12), (-1042405));
        int int23 = mathTest0.subtract(11082241, (-1042405));
        int int25 = mathTest0.square(1351683000);
        int int27 = mathTest0.square((int) (short) 10);
        int int30 = mathTest0.add(55342855, (-1544804416));
        int int33 = mathTest0.multiply(4198401, 1262551005);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3181) + "'", int14 == (-3181));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1494149 + "'", int17 == 1494149);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 12508860 + "'", int20 == 12508860);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 12124646 + "'", int23 == 12124646);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1190745152 + "'", int25 == 1190745152);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1489461561) + "'", int30 == (-1489461561));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1384042461 + "'", int33 == 1384042461);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((-32), 99);
        int int9 = mathTest0.divide((-19), 12887818);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3168) + "'", int6 == (-3168));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((-32), 99);
        int int9 = mathTest0.divide((int) (short) 0, (int) (short) 100);
        int int12 = mathTest0.add((-3295), (-3181));
        int int15 = mathTest0.add(0, 1346542369);
        int int18 = mathTest0.add(2499561, (-923619184));
        java.lang.Class<?> wildcardClass19 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3168) + "'", int6 == (-3168));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6476) + "'", int12 == (-6476));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1346542369 + "'", int15 == 1346542369);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-921119623) + "'", int18 == (-921119623));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.divide(1496241, 10201);
        int int15 = mathTest0.multiply((-777670805), 128163);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 146 + "'", int12 == 146);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 387689761 + "'", int15 == 387689761);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((-32), 99);
        int int9 = mathTest0.divide((-3232), 51);
        int int12 = mathTest0.subtract(34, (int) (short) 100);
        int int15 = mathTest0.divide((-13503587), (-3069));
        int int18 = mathTest0.add(27040000, 633765517);
        int int21 = mathTest0.subtract((-364053244), (-13503587));
        int int24 = mathTest0.subtract(1425784955, 2087780608);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3168) + "'", int6 == (-3168));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-63) + "'", int9 == (-63));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-66) + "'", int12 == (-66));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4399 + "'", int15 == 4399);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 660805517 + "'", int18 == 660805517);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-350549657) + "'", int21 == (-350549657));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-661995653) + "'", int24 == (-661995653));
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(3232, (-3168));
        int int8 = mathTest0.square((-3232));
        int int11 = mathTest0.subtract((int) (byte) 100, (-63));
        int int14 = mathTest0.add(1099748687, (-2));
        int int17 = mathTest0.multiply(3307, 1892067663);
        int int19 = mathTest0.square((-29422522));
        int int22 = mathTest0.subtract((-1109372839), 310);
        int int25 = mathTest0.multiply((-27034267), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10445824 + "'", int8 == 10445824);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 163 + "'", int11 == 163);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1099748685 + "'", int14 == 1099748685);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-699588731) + "'", int17 == (-699588731));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-217406684) + "'", int19 == (-217406684));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1109373149) + "'", int22 == (-1109373149));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.subtract((int) (short) -1, (int) (short) 100);
        int int16 = mathTest0.square(101);
        int int19 = mathTest0.add((-1042405), 303);
        int int22 = mathTest0.divide(29421356, 805857023);
        int int25 = mathTest0.divide(3414448, (-1563961972));
        int int28 = mathTest0.subtract(1946522112, 943686359);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-101) + "'", int14 == (-101));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10201 + "'", int16 == 10201);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1042102) + "'", int19 == (-1042102));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1002835753 + "'", int28 == 1002835753);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.multiply(101, 51);
        int int17 = mathTest0.divide((-65), (-295593424));
        int int20 = mathTest0.divide(27040000, 1494149);
        int int22 = mathTest0.square(1010);
        int int25 = mathTest0.multiply(16314474, 327184887);
        int int28 = mathTest0.add((-5835742), (-6600));
        java.lang.Class<?> wildcardClass29 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5151 + "'", int14 == 5151);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 18 + "'", int20 == 18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1020100 + "'", int22 == 1020100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-447823802) + "'", int25 == (-447823802));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-5842342) + "'", int28 == (-5842342));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.multiply(101, 51);
        int int17 = mathTest0.multiply(34, (-50960));
        int int20 = mathTest0.add(1296, 351445471);
        int int23 = mathTest0.divide(0, (-934701798));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5151 + "'", int14 == 5151);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1732640) + "'", int17 == (-1732640));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 351446767 + "'", int20 == 351446767);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((-32), 99);
        int int9 = mathTest0.divide((-3232), 51);
        int int12 = mathTest0.subtract(34, (int) (short) 100);
        int int15 = mathTest0.divide(1099748685, (-963545038));
        java.lang.Class<?> wildcardClass16 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3168) + "'", int6 == (-3168));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-63) + "'", int9 == (-63));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-66) + "'", int12 == (-66));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        mathTest mathTest0 = new mathTest();
        int int2 = mathTest0.square((-101));
        int int5 = mathTest0.multiply(0, 1024);
        int int8 = mathTest0.divide((-461244), 11612725);
        int int11 = mathTest0.divide(115, 1325028);
        int int14 = mathTest0.add(1961891178, 29421697);
        int int17 = mathTest0.multiply(312881769, 55410);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10201 + "'", int2 == 10201);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1991312875 + "'", int14 == 1991312875);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-2004153662) + "'", int17 == (-2004153662));
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
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
        int int27 = mathTest0.add((-825), 2);
        int int30 = mathTest0.subtract((int) (byte) 1, 1237);
        int int33 = mathTest0.divide(10214416, (-3069));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10036224 + "'", int19 == 10036224);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1500625 + "'", int24 == 1500625);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-823) + "'", int27 == (-823));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1236) + "'", int30 == (-1236));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-3328) + "'", int33 == (-3328));
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        mathTest mathTest0 = new mathTest();
        int int2 = mathTest0.square(0);
        int int5 = mathTest0.multiply(29421356, 1801532504);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-829216992) + "'", int5 == (-829216992));
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int14 = mathTest0.square(0);
        int int17 = mathTest0.add(100, 203);
        int int20 = mathTest0.divide(1496089, (-13503587));
        int int23 = mathTest0.divide(1474726277, (-1489461561));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 303 + "'", int17 == 303);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.subtract((int) '#', (int) (short) 1);
        int int17 = mathTest0.multiply(1, (-1));
        int int20 = mathTest0.subtract(1042102, 302802435);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-301760333) + "'", int20 == (-301760333));
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        int int20 = mathTest0.divide(2500, (-13503535));
        int int22 = mathTest0.square((-190));
        int int25 = mathTest0.add(12116872, 1170608585);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 36100 + "'", int22 == 36100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1182725457 + "'", int25 == 1182725457);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square(5200);
        int int14 = mathTest0.multiply((-7), 13);
        int int17 = mathTest0.multiply((-27034267), (-13));
        int int19 = mathTest0.square((-27046437));
        int int22 = mathTest0.divide(950697, 9700);
        int int25 = mathTest0.subtract(1208040860, 19044);
        int int27 = mathTest0.square(1334646608);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27040000 + "'", int11 == 27040000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-91) + "'", int14 == (-91));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 351445471 + "'", int17 == 351445471);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-485525159) + "'", int19 == (-485525159));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 98 + "'", int22 == 98);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1208021816 + "'", int25 == 1208021816);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 272595200 + "'", int27 == 272595200);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int5 = mathTest0.square((int) (byte) 10);
        int int7 = mathTest0.square((-101));
        int int10 = mathTest0.multiply(3329, (-399));
        int int13 = mathTest0.subtract(312900721, 1500625);
        int int16 = mathTest0.add(1962930943, 1966983424);
        int int18 = mathTest0.square(1653863434);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10201 + "'", int7 == 10201);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1328271) + "'", int10 == (-1328271));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 311400096 + "'", int13 == 311400096);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-365052929) + "'", int16 == (-365052929));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-736161692) + "'", int18 == (-736161692));
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int13 = mathTest0.square(22500);
        int int16 = mathTest0.multiply((-204731200), 12);
        int int19 = mathTest0.divide((-662654260), 336795904);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 506250000 + "'", int13 == 506250000);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1838192896 + "'", int16 == 1838192896);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        int int20 = mathTest0.multiply((int) (short) 10, 99);
        int int23 = mathTest0.divide((int) (short) 100, 10445824);
        int int25 = mathTest0.square((-3535));
        int int28 = mathTest0.add(101, 55342754);
        int int31 = mathTest0.divide(0, 753733388);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 990 + "'", int20 == 990);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 12496225 + "'", int25 == 12496225);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 55342855 + "'", int28 == 55342855);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.divide(0, 5200);
        int int13 = mathTest0.square(4356);
        int int16 = mathTest0.divide((-29338412), 31);
        int int19 = mathTest0.divide(212338, (-367));
        int int22 = mathTest0.add(9801, (-1789340823));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 18974736 + "'", int13 == 18974736);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-946400) + "'", int16 == (-946400));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-578) + "'", int19 == (-578));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1789331022) + "'", int22 == (-1789331022));
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.add(2092, 1494149);
        int int18 = mathTest0.add(1357853952, (-461144));
        int int21 = mathTest0.subtract(11161, (-1065097728));
        int int24 = mathTest0.add(1128265728, 324766576);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1496241 + "'", int15 == 1496241);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1357392808 + "'", int18 == 1357392808);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1065108889 + "'", int21 == 1065108889);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1453032304 + "'", int24 == 1453032304);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int11 = mathTest0.square(34);
        int int14 = mathTest0.multiply((-135036), (int) (byte) 100);
        java.lang.Class<?> wildcardClass15 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1156 + "'", int11 == 1156);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-13503600) + "'", int14 == (-13503600));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) ' ');
        int int12 = mathTest0.divide((int) (byte) 100, 36);
        int int15 = mathTest0.subtract(0, 3232);
        int int18 = mathTest0.divide(104060401, 3329);
        int int20 = mathTest0.square(163);
        int int23 = mathTest0.divide(10036323, (-2244));
        int int26 = mathTest0.add(3416061, 1646354688);
        int int29 = mathTest0.add((-633972464), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3232) + "'", int15 == (-3232));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 31258 + "'", int18 == 31258);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 26569 + "'", int20 == 26569);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-4472) + "'", int23 == (-4472));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1649770749 + "'", int26 == 1649770749);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-633972464) + "'", int29 == (-633972464));
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.subtract((int) (short) 0, (int) '#');
        int int15 = mathTest0.add((-101), 1024);
        int int18 = mathTest0.multiply((-845551616), (-1086369187));
        int int21 = mathTest0.add((-38724156), 1548424529);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-35) + "'", int12 == (-35));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 923 + "'", int15 == 923);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 356075520 + "'", int18 == 356075520);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1509700373 + "'", int21 == 1509700373);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.subtract((int) '#', (int) (short) 1);
        int int17 = mathTest0.multiply(1, (-1));
        int int19 = mathTest0.square((-3168));
        int int21 = mathTest0.square(2704);
        int int24 = mathTest0.multiply((-1328271), 1990353832);
        int int27 = mathTest0.subtract(1949427408, 2013629697);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10036224 + "'", int19 == 10036224);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7311616 + "'", int21 == 7311616);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-810437336) + "'", int24 == (-810437336));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-64202289) + "'", int27 == (-64202289));
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((-1), (-50));
        int int18 = mathTest0.subtract(429549516, 0);
        int int21 = mathTest0.divide((-252448), (-27036767));
        int int23 = mathTest0.square((-127500));
        int int26 = mathTest0.subtract(0, 367876808);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 429549516 + "'", int18 == 429549516);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-923619184) + "'", int23 == (-923619184));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-367876808) + "'", int26 == (-367876808));
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.divide(0, 5200);
        int int13 = mathTest0.square(4356);
        int int15 = mathTest0.square((-418481920));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 18974736 + "'", int13 == 18974736);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1966145536 + "'", int15 == 1966145536);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.subtract((-2720), 9700);
        int int8 = mathTest0.square((-66));
        int int11 = mathTest0.multiply(177957, (-2033540108));
        int int14 = mathTest0.add(1041887, (-14895753));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-12420) + "'", int6 == (-12420));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4356 + "'", int8 == 4356);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1637540284) + "'", int11 == (-1637540284));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-13853866) + "'", int14 == (-13853866));
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.divide(0, 5200);
        int int14 = mathTest0.multiply((int) (short) 1, (int) (short) 10);
        int int17 = mathTest0.multiply((-3232), 10201);
        int int20 = mathTest0.divide(22500, 10445824);
        int int23 = mathTest0.multiply(999698, 0);
        int int25 = mathTest0.square(1909243054);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-32969632) + "'", int17 == (-32969632));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-597686716) + "'", int25 == (-597686716));
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.divide(0, 5200);
        int int13 = mathTest0.square(4356);
        int int16 = mathTest0.divide((-29338412), 31);
        int int19 = mathTest0.divide(212338, (-367));
        int int22 = mathTest0.subtract(1515163, (-584742496));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 18974736 + "'", int13 == 18974736);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-946400) + "'", int16 == (-946400));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-578) + "'", int19 == (-578));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 586257659 + "'", int22 == 586257659);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int5 = mathTest0.square((int) (byte) 10);
        int int7 = mathTest0.square((-101));
        int int10 = mathTest0.multiply(3329, (-399));
        int int12 = mathTest0.square(29833266);
        java.lang.Class<?> wildcardClass13 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10201 + "'", int7 == 10201);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1328271) + "'", int10 == (-1328271));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-837686844) + "'", int12 == (-837686844));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square((-32969632));
        int int14 = mathTest0.add(29793758, 0);
        int int17 = mathTest0.multiply(1200, (-65));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 541139968 + "'", int11 == 541139968);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29793758 + "'", int14 == 29793758);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-78000) + "'", int17 == (-78000));
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((-32), 99);
        int int9 = mathTest0.divide((-3232), 51);
        int int12 = mathTest0.subtract(34, (int) (short) 100);
        int int15 = mathTest0.divide((-13503587), (-3069));
        int int18 = mathTest0.add(27040000, 633765517);
        java.lang.Class<?> wildcardClass19 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3168) + "'", int6 == (-3168));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-63) + "'", int9 == (-63));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-66) + "'", int12 == (-66));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4399 + "'", int15 == 4399);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 660805517 + "'", int18 == 660805517);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int12 = mathTest0.multiply(0, 210);
        int int15 = mathTest0.add((-50), (int) 'a');
        int int18 = mathTest0.add((-27036603), (-675));
        int int21 = mathTest0.multiply((-14756608), 12508860);
        int int24 = mathTest0.add((-252448), (-805857037));
        int int27 = mathTest0.add(2002088192, (-40385895));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 47 + "'", int15 == 47);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-27037278) + "'", int18 == (-27037278));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 760900608 + "'", int21 == 760900608);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-806109485) + "'", int24 == (-806109485));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1961702297 + "'", int27 == 1961702297);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int8 = mathTest0.square((-51));
        int int11 = mathTest0.add((-461244), (int) (short) 100);
        int int13 = mathTest0.square((-7));
        int int16 = mathTest0.add(1425734027, (-1821319828));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2601 + "'", int8 == 2601);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-461144) + "'", int11 == (-461144));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 49 + "'", int13 == 49);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-395585801) + "'", int16 == (-395585801));
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(3232, (-3168));
        int int8 = mathTest0.square((-3232));
        int int11 = mathTest0.add(29421356, 112);
        int int14 = mathTest0.add(98, (-135036));
        int int17 = mathTest0.subtract((-13503600), (-123));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10445824 + "'", int8 == 10445824);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 29421468 + "'", int11 == 29421468);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-134938) + "'", int14 == (-134938));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-13503477) + "'", int17 == (-13503477));
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.add(100, (int) (short) 1);
        int int9 = mathTest0.subtract(0, 0);
        int int11 = mathTest0.square(12);
        int int14 = mathTest0.subtract((-1156), (-29422512));
        int int17 = mathTest0.add((-1807745024), 923);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 144 + "'", int11 == 144);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29421356 + "'", int14 == 29421356);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1807744101) + "'", int17 == (-1807744101));
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.subtract((int) (short) -1, (int) (short) 100);
        int int17 = mathTest0.multiply((-399), (int) (byte) 10);
        int int20 = mathTest0.multiply((-20489899), 112);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-101) + "'", int14 == (-101));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-3990) + "'", int17 == (-3990));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2000098608 + "'", int20 == 2000098608);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.add((int) (short) 1, (-32));
        int int12 = mathTest0.divide((-268662658), 1262550330);
        int int15 = mathTest0.multiply((-6610740), 10424);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-31) + "'", int9 == (-31));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-190877024) + "'", int15 == (-190877024));
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int11 = mathTest0.square(3232);
        int int14 = mathTest0.divide((-32), (int) (short) 1);
        int int17 = mathTest0.add(11, (int) ' ');
        int int20 = mathTest0.subtract(134966615, (-1086356767));
        int int23 = mathTest0.add(0, 6502500);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10445824 + "'", int11 == 10445824);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-32) + "'", int14 == (-32));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 43 + "'", int17 == 43);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1221323382 + "'", int20 == 1221323382);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6502500 + "'", int23 == 6502500);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.multiply((int) (short) 0, (-101));
        int int8 = mathTest0.square((-3196));
        int int11 = mathTest0.multiply((-1065097728), (-1571));
        int int14 = mathTest0.multiply((-1822798336), (-845551616));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10214416 + "'", int8 == 10214416);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1768714752) + "'", int11 == (-1768714752));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1957691392 + "'", int14 == 1957691392);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.divide(0, 5200);
        int int13 = mathTest0.square((int) (short) 0);
        java.lang.Class<?> wildcardClass14 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.multiply((int) (short) 0, (-101));
        int int9 = mathTest0.multiply((-1190), (-805857024));
        int int11 = mathTest0.square(217962);
        int int13 = mathTest0.square((-31611));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1192151552 + "'", int9 == 1192151552);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 262793188 + "'", int11 == 262793188);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 999255321 + "'", int13 == 999255321);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.add((int) (short) 1, 0);
        int int14 = mathTest0.multiply((-399), 1156);
        int int17 = mathTest0.divide(148155, 52);
        int int20 = mathTest0.multiply((-1086356767), (-3243));
        int int23 = mathTest0.divide(960400, 1357392808);
        int int26 = mathTest0.multiply(10036224, (-461834226));
        int int29 = mathTest0.subtract(1337808004, 15046646);
        int int32 = mathTest0.subtract(27038596, 17956);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-461244) + "'", int14 == (-461244));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2849 + "'", int17 == 2849);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1181812661 + "'", int20 == 1181812661);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1128265728 + "'", int26 == 1128265728);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1322761358 + "'", int29 == 1322761358);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 27020640 + "'", int32 == 27020640);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
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
        int int29 = mathTest0.subtract(1995735080, 1061678990);
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 934056090 + "'", int29 == 934056090);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        mathTest mathTest0 = new mathTest();
        int int2 = mathTest0.square((-101));
        int int5 = mathTest0.multiply(0, 1024);
        int int8 = mathTest0.divide((-461244), 11612725);
        int int11 = mathTest0.subtract(1861156092, 15129);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10201 + "'", int2 == 10201);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1861140963 + "'", int11 == 1861140963);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.multiply(101, 51);
        int int17 = mathTest0.subtract(1, (-1));
        int int20 = mathTest0.divide(0, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5151 + "'", int14 == 5151);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.subtract((-957487), (-183));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-957304) + "'", int15 == (-957304));
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((int) (short) -1, 36);
        int int18 = mathTest0.divide((-2), (-61));
        int int21 = mathTest0.add((-1576), 1200);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-376) + "'", int21 == (-376));
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.add(100, (int) (short) 1);
        int int9 = mathTest0.subtract(0, 0);
        int int11 = mathTest0.square((int) (byte) 1);
        int int14 = mathTest0.subtract(3232, 27040000);
        int int17 = mathTest0.add(950697, 963499229);
        int int20 = mathTest0.subtract((-1350726656), 1838229715);
        int int23 = mathTest0.subtract(91107025, (-170769751));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-27036768) + "'", int14 == (-27036768));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 964449926 + "'", int17 == 964449926);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1106010925 + "'", int20 == 1106010925);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 261876776 + "'", int23 == 261876776);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        int int20 = mathTest0.add(0, 1046);
        int int22 = mathTest0.square((-1403936999));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1046 + "'", int20 == 1046);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1464725391) + "'", int22 == (-1464725391));
    }
}

