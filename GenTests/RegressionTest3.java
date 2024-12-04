import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
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
        int int28 = mathTest0.subtract(28751656, 104060401);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 820197632 + "'", int21 == 820197632);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 11082241 + "'", int23 == 11082241);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 7398400 + "'", int25 == 7398400);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-75308745) + "'", int28 == (-75308745));
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square(5200);
        int int14 = mathTest0.subtract((-43), (-35));
        int int17 = mathTest0.divide(0, (-134969936));
        int int20 = mathTest0.multiply(712776862, 2778889);
        int int23 = mathTest0.add(1259667456, 97960800);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27040000 + "'", int11 == 27040000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-8) + "'", int14 == (-8));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 533500814 + "'", int20 == 533500814);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1357628256 + "'", int23 == 1357628256);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.add(100, (int) (short) 1);
        int int9 = mathTest0.subtract(0, 0);
        int int11 = mathTest0.square(12);
        int int14 = mathTest0.subtract((-1156), (-29422512));
        int int17 = mathTest0.add(1325028, (-63));
        int int20 = mathTest0.multiply(702330714, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 144 + "'", int11 == 144);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29421356 + "'", int14 == 29421356);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1324965 + "'", int17 == 1324965);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        mathTest mathTest0 = new mathTest();
        int int2 = mathTest0.square((-101));
        int int5 = mathTest0.multiply(1594884096, (-29422512));
        int int8 = mathTest0.divide((-32969632), (-3295));
        int int11 = mathTest0.add(1892067663, 0);
        int int14 = mathTest0.subtract(1499341, (-1081));
        int int16 = mathTest0.square(1961702297);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10201 + "'", int2 == 10201);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1962934272 + "'", int5 == 1962934272);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10005 + "'", int8 == 10005);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1892067663 + "'", int11 == 1892067663);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1500422 + "'", int14 == 1500422);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1001410929 + "'", int16 == 1001410929);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
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
        int int29 = mathTest0.divide((-852000), 999988);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3232) + "'", int15 == (-3232));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 31258 + "'", int18 == 31258);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 26569 + "'", int20 == 26569);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-4472) + "'", int23 == (-4472));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1649770749 + "'", int26 == 1649770749);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.subtract((int) '#', (int) (short) 1);
        int int17 = mathTest0.multiply(1, (-1));
        int int19 = mathTest0.square((-3168));
        int int21 = mathTest0.square(2704);
        int int24 = mathTest0.multiply(29421697, 50960);
        int int27 = mathTest0.add(70071185, 0);
        int int30 = mathTest0.subtract((-54), (-28542678));
        int int33 = mathTest0.add((-9253294), (-1404));
        int int35 = mathTest0.square((-78000));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10036224 + "'", int19 == 10036224);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7311616 + "'", int21 == 7311616);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 386092816 + "'", int24 == 386092816);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 70071185 + "'", int27 == 70071185);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 28542624 + "'", int30 == 28542624);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-9254698) + "'", int33 == (-9254698));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1789032704 + "'", int35 == 1789032704);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square((-32969632));
        int int14 = mathTest0.add(29793758, 0);
        int int17 = mathTest0.divide(0, 36819);
        int int20 = mathTest0.add((-3580), 0);
        int int23 = mathTest0.divide((-2046820352), (-3168));
        java.lang.Class<?> wildcardClass24 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 541139968 + "'", int11 == 541139968);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29793758 + "'", int14 == 29793758);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-3580) + "'", int20 == (-3580));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 646092 + "'", int23 == 646092);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.multiply(10445824, 10445824);
        int int12 = mathTest0.divide(2704, (-3181));
        int int14 = mathTest0.square(722297152);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1594884096 + "'", int9 == 1594884096);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-2056155136) + "'", int14 == (-2056155136));
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
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
        int int28 = mathTest0.multiply(29421468, (-477470903));
        int int30 = mathTest0.square((-411972124));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 820197632 + "'", int21 == 820197632);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 11082241 + "'", int23 == 11082241);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 7398400 + "'", int25 == 7398400);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1761134724) + "'", int28 == (-1761134724));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-522259696) + "'", int30 == (-522259696));
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
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
        // The following exception was thrown during execution in test generation
        try {
            int int29 = mathTest0.divide((-1169118080), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Cannot divide by zero.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3232) + "'", int15 == (-3232));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 31258 + "'", int18 == 31258);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 26569 + "'", int20 == 26569);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1086347664) + "'", int26 == (-1086347664));
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int14 = mathTest0.square(0);
        int int16 = mathTest0.square(5200);
        int int19 = mathTest0.multiply((-367), 782707219);
        int int22 = mathTest0.divide(15046646, (-1464725391));
        int int24 = mathTest0.square((-366998));
        int int27 = mathTest0.divide(254540, 1963934992);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 27040000 + "'", int16 == 27040000);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 509259459 + "'", int19 == 509259459);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1543545828 + "'", int24 == 1543545828);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
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
        int int27 = mathTest0.square(1489466761);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5151 + "'", int14 == 5151);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 18 + "'", int20 == 18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1020100 + "'", int22 == 1020100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-447823802) + "'", int25 == (-447823802));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 552895313 + "'", int27 == 552895313);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
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
        int int31 = mathTest0.multiply((-324389119), 0);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.divide(0, 5200);
        int int14 = mathTest0.add(63, (-5073684));
        int int17 = mathTest0.multiply((-1452215270), (-50938));
        int int20 = mathTest0.divide((-1958075900), (-1345084618));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-5073621) + "'", int14 == (-5073621));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 719684252 + "'", int17 == 719684252);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((-32), 99);
        int int9 = mathTest0.divide((-3232), 51);
        int int12 = mathTest0.subtract(34, (int) (short) 100);
        int int15 = mathTest0.divide((-129702790), 429676108);
        java.lang.Class<?> wildcardClass16 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3168) + "'", int6 == (-3168));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-63) + "'", int9 == (-63));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-66) + "'", int12 == (-66));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((-1), (-50));
        int int18 = mathTest0.add((-6476), 1962934338);
        int int21 = mathTest0.divide(0, (-969912802));
        int int24 = mathTest0.divide(583058869, (-1343782208));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1962927862 + "'", int18 == 1962927862);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract(1838229715, (-1761134724));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-695602857) + "'", int6 == (-695602857));
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add((int) (byte) 10, (-3232));
        int int15 = mathTest0.add((-3243), 31);
        int int18 = mathTest0.multiply((-66), 148155);
        int int20 = mathTest0.square(545629222);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3222) + "'", int12 == (-3222));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3212) + "'", int15 == (-3212));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-9778230) + "'", int18 == (-9778230));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2025633188 + "'", int20 == 2025633188);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.add((-60310336), 429549516);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 369239180 + "'", int9 == 369239180);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
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
        int int29 = mathTest0.multiply(150301535, 1174386545);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3307 + "'", int20 == 3307);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-601128) + "'", int23 == (-601128));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1962924603 + "'", int26 == 1962924603);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-222933521) + "'", int29 == (-222933521));
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) (short) 1);
        int int12 = mathTest0.subtract((-29422512), (int) (short) 10);
        int int15 = mathTest0.subtract((-969485412), (-1437105680));
        int int17 = mathTest0.square(1273404263);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-29422522) + "'", int12 == (-29422522));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 467620268 + "'", int15 == 467620268);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-177609871) + "'", int17 == (-177609871));
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int5 = mathTest0.square((int) (byte) 10);
        int int8 = mathTest0.subtract(1496241, 152);
        int int11 = mathTest0.add(101, 1);
        int int14 = mathTest0.divide(134966615, (-578834862));
        int int17 = mathTest0.add(2005116570, (-6110224));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1496089 + "'", int8 == 1496089);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 102 + "'", int11 == 102);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1999006346 + "'", int17 == 1999006346);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int8 = mathTest0.square((-51));
        int int11 = mathTest0.subtract(100, (-190));
        int int14 = mathTest0.divide((-66), (-63));
        int int16 = mathTest0.square(13503598);
        int int18 = mathTest0.square((-67));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2601 + "'", int8 == 2601);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 290 + "'", int11 == 290);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 27426628 + "'", int16 == 27426628);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4489 + "'", int18 == 4489);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int13 = mathTest0.square(10036224);
        int int16 = mathTest0.multiply(1336336, (-1156));
        int int19 = mathTest0.multiply(950697, 36);
        int int22 = mathTest0.multiply((-118392781), 1861140963);
        int int25 = mathTest0.multiply((-1345084618), 329739778);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 219152384 + "'", int13 == 219152384);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1544804416) + "'", int16 == (-1544804416));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 34225092 + "'", int19 == 34225092);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1931872313 + "'", int22 == 1931872313);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-905807252) + "'", int25 == (-905807252));
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int5 = mathTest0.square(1053);
        int int7 = mathTest0.square(12508860);
        int int9 = mathTest0.square(1961891178);
        java.lang.Class<?> wildcardClass10 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1108809 + "'", int5 == 1108809);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1624939024 + "'", int7 == 1624939024);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 948604900 + "'", int9 == 948604900);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) ' ');
        int int12 = mathTest0.divide((int) (byte) 100, 36);
        int int15 = mathTest0.subtract(1020100, 27037296);
        int int18 = mathTest0.multiply(34225092, 1657855020);
        int int21 = mathTest0.add(1425784965, 367215408);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-26017196) + "'", int15 == (-26017196));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1134643792) + "'", int18 == (-1134643792));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1793000373 + "'", int21 == 1793000373);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.add((int) (short) 1, 0);
        int int14 = mathTest0.multiply((-399), 1156);
        int int17 = mathTest0.subtract(0, 0);
        int int19 = mathTest0.square((-2683240));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-461244) + "'", int14 == (-461244));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1411709504 + "'", int19 == 1411709504);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.divide(0, 5200);
        int int14 = mathTest0.multiply((int) (short) 1, (int) (short) 10);
        int int17 = mathTest0.multiply((-3232), 10201);
        int int20 = mathTest0.add((-990), (-31));
        int int23 = mathTest0.add(1724707841, 13516830);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-32969632) + "'", int17 == (-32969632));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1021) + "'", int20 == (-1021));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1738224671 + "'", int23 == 1738224671);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.divide((-101), 2);
        int int8 = mathTest0.square(1849);
        int int11 = mathTest0.multiply(9114210, 1496160);
        java.lang.Class<?> wildcardClass12 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3418801 + "'", int8 == 3418801);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-204731200) + "'", int11 == (-204731200));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((-32), 99);
        int int9 = mathTest0.divide((-3232), 51);
        int int11 = mathTest0.square(1046);
        int int14 = mathTest0.multiply(11082614, 29462604);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3168) + "'", int6 == (-3168));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-63) + "'", int9 == (-63));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1094116 + "'", int11 == 1094116);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2073855752 + "'", int14 == 2073855752);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
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
        int int30 = mathTest0.add(547640937, 177957);
        int int33 = mathTest0.divide(1963934992, (-2568));
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 547818894 + "'", int30 == 547818894);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-764772) + "'", int33 == (-764772));
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
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
        java.lang.Class<?> wildcardClass27 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3307 + "'", int20 == 3307);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-601128) + "'", int23 == (-601128));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1840008045) + "'", int26 == (-1840008045));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.divide(0, 5200);
        int int13 = mathTest0.square((int) (short) 0);
        int int16 = mathTest0.add((-1934984370), (-210338647));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2145323017) + "'", int16 == (-2145323017));
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.subtract((int) '#', (int) (short) 1);
        int int17 = mathTest0.multiply(1, (-1));
        int int20 = mathTest0.subtract(1962934272, (-66));
        int int22 = mathTest0.square(17960388);
        int int24 = mathTest0.square((-1623957085));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1962934338 + "'", int20 == 1962934338);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2018344464 + "'", int22 == 2018344464);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1232399817 + "'", int24 == 1232399817);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.add((int) (short) 1, 0);
        int int14 = mathTest0.multiply((-399), 1156);
        int int17 = mathTest0.divide(148155, 52);
        int int20 = mathTest0.divide((-3222), (-12));
        int int23 = mathTest0.multiply((-980), 2738);
        int int26 = mathTest0.add(17547721, (-196010184));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-461244) + "'", int14 == (-461244));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2849 + "'", int17 == 2849);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 268 + "'", int20 == 268);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-2683240) + "'", int23 == (-2683240));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-178462463) + "'", int26 == (-178462463));
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) ' ');
        int int12 = mathTest0.divide((int) (byte) 100, 36);
        int int15 = mathTest0.subtract(0, 3232);
        int int18 = mathTest0.divide(104060401, 3329);
        int int21 = mathTest0.subtract((-51), 5541);
        int int24 = mathTest0.divide(19044, (-7));
        int int27 = mathTest0.subtract(1852038144, 605409);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3232) + "'", int15 == (-3232));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 31258 + "'", int18 == 31258);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-5592) + "'", int21 == (-5592));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2720) + "'", int24 == (-2720));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1851432735 + "'", int27 == 1851432735);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
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
        int int30 = mathTest0.divide((-1887579313), (-272000));
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 6939 + "'", int30 == 6939);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.add(2092, 1494149);
        int int17 = mathTest0.square(64);
        int int20 = mathTest0.multiply(1324965, 134966615);
        int int23 = mathTest0.divide(27040000, 1200);
        java.lang.Class<?> wildcardClass24 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1496241 + "'", int15 == 1496241);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4096 + "'", int17 == 4096);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 782707219 + "'", int20 == 782707219);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 22533 + "'", int23 == 22533);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.add((-3181), (int) 'a');
        int int16 = mathTest0.square((-5073684));
        int int19 = mathTest0.add(881424075, 111813931);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3084) + "'", int14 == (-3084));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1764640368) + "'", int16 == (-1764640368));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 993238006 + "'", int19 == 993238006);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
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
        int int32 = mathTest0.subtract(0, (-655109487));
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 655109487 + "'", int32 == 655109487);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        int int20 = mathTest0.divide(2500, (-13503535));
        int int23 = mathTest0.add(99, 10036224);
        java.lang.Class<?> wildcardClass24 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10036323 + "'", int23 == 10036323);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int12 = mathTest0.add(1962934272, (-3196));
        int int14 = mathTest0.square(950697);
        int int17 = mathTest0.add(547640937, 0);
        int int20 = mathTest0.subtract((-923619227), 1530126);
        int int23 = mathTest0.multiply((-1668025932), 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1962931076 + "'", int12 == 1962931076);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1881653649 + "'", int14 == 1881653649);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 547640937 + "'", int17 == 547640937);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-925149353) + "'", int20 == (-925149353));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1877526568) + "'", int23 == (-1877526568));
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.divide(1496241, 10201);
        int int14 = mathTest0.square(1053);
        int int17 = mathTest0.add(17956, 27036542);
        int int20 = mathTest0.subtract(940145899, 1100362355);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 146 + "'", int12 == 146);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1108809 + "'", int14 == 1108809);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 27054498 + "'", int17 == 27054498);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-160216456) + "'", int20 == (-160216456));
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.multiply(10445824, 10445824);
        int int12 = mathTest0.divide(2704, (-5681));
        int int14 = mathTest0.square(712775872);
        int int16 = mathTest0.square(1156);
        int int19 = mathTest0.multiply(146, 1964249568);
        int int22 = mathTest0.multiply(0, 289063887);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1594884096 + "'", int9 == 1594884096);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-60518400) + "'", int14 == (-60518400));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1336336 + "'", int16 == 1336336);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-982371904) + "'", int19 == (-982371904));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.multiply((int) (short) 0, (-101));
        int int8 = mathTest0.square((-3196));
        int int11 = mathTest0.divide((-1343782208), 1351683000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10214416 + "'", int8 == 10214416);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.add((int) (byte) -1, (int) '4');
        int int12 = mathTest0.multiply((int) 'a', (int) (short) 100);
        int int14 = mathTest0.square(219152384);
        int int17 = mathTest0.divide(133, (-50));
        int int20 = mathTest0.add(0, (-3181));
        int int23 = mathTest0.divide((-295593424), (-3364195));
        int int25 = mathTest0.square(999644832);
        int int27 = mathTest0.square(1277298164);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9700 + "'", int12 == 9700);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-2) + "'", int17 == (-2));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-3181) + "'", int20 == (-3181));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 87 + "'", int23 == 87);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 154788864 + "'", int25 == 154788864);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1962111120 + "'", int27 == 1962111120);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
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
        int int34 = mathTest0.multiply(583058869, 1357628256);
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-334888224) + "'", int34 == (-334888224));
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int12 = mathTest0.multiply(144, 1594884096);
        int int15 = mathTest0.subtract((-992), 1042102);
        int int18 = mathTest0.multiply(1496699, 0);
        int int21 = mathTest0.divide(0, (-1105153273));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2030043136 + "'", int12 == 2030043136);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1043094) + "'", int15 == (-1043094));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.divide(1496241, 10201);
        int int14 = mathTest0.square(1053);
        int int17 = mathTest0.subtract(0, (-3580));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 146 + "'", int12 == 146);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1108809 + "'", int14 == 1108809);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3580 + "'", int17 == 3580);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
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
        java.lang.Class<?> wildcardClass29 = mathTest0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int5 = mathTest0.square((int) (byte) 10);
        int int8 = mathTest0.add((-1488), 3190);
        int int11 = mathTest0.multiply((-1042405), 2500);
        int int14 = mathTest0.add(3364195, 1494149);
        int int16 = mathTest0.square((-167544));
        int int19 = mathTest0.subtract((-578), (-2623));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1702 + "'", int8 == 1702);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1688954796 + "'", int11 == 1688954796);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4858344 + "'", int14 == 4858344);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1993779136) + "'", int16 == (-1993779136));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2045 + "'", int19 == 2045);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.subtract((-546213652), 334084);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-546547736) + "'", int6 == (-546547736));
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(3232, (-3168));
        int int8 = mathTest0.square((-3232));
        int int11 = mathTest0.add(29421356, 112);
        int int14 = mathTest0.divide((int) (byte) 10, 13516830);
        int int17 = mathTest0.subtract((-364053231), 1688954796);
        java.lang.Class<?> wildcardClass18 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10445824 + "'", int8 == 10445824);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 29421468 + "'", int11 == 29421468);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-2053008027) + "'", int17 == (-2053008027));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int14 = mathTest0.square(0);
        int int16 = mathTest0.square(5200);
        int int19 = mathTest0.multiply((-367), 782707219);
        int int21 = mathTest0.square((-845551616));
        int int24 = mathTest0.add(326681, (-13506830));
        int int26 = mathTest0.square(292);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 27040000 + "'", int16 == 27040000);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 509259459 + "'", int19 == 509259459);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 574619648 + "'", int21 == 574619648);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-13180149) + "'", int24 == (-13180149));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 85264 + "'", int26 == 85264);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        int int20 = mathTest0.add(0, 1046);
        int int22 = mathTest0.square((int) '#');
        int int25 = mathTest0.divide(1050616853, 659992241);
        java.lang.Class<?> wildcardClass26 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1046 + "'", int20 == 1046);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1225 + "'", int22 == 1225);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
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
        int int33 = mathTest0.divide((-1246215680), (-4358677));
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 285 + "'", int33 == 285);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int8 = mathTest0.square((-51));
        int int11 = mathTest0.add(0, (-1752770602));
        int int13 = mathTest0.square(39906449);
        int int16 = mathTest0.divide(1530169, 2136351897);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2601 + "'", int8 == 2601);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1752770602) + "'", int11 == (-1752770602));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1956926943) + "'", int13 == (-1956926943));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((int) (short) -1, 36);
        int int18 = mathTest0.multiply((-51), (-31));
        int int21 = mathTest0.multiply(1237, 1962924603);
        int int24 = mathTest0.add(0, 3414448);
        java.lang.Class<?> wildcardClass25 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1581 + "'", int18 == 1581);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1481211671 + "'", int21 == 1481211671);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3414448 + "'", int24 == 3414448);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.add((int) (byte) -1, (int) '4');
        int int12 = mathTest0.multiply((int) 'a', (int) (short) 100);
        int int15 = mathTest0.subtract((-27036768), 3329);
        int int18 = mathTest0.multiply(0, (-2));
        int int21 = mathTest0.add(64, (-65));
        int int24 = mathTest0.add(316061, 1305215761);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9700 + "'", int12 == 9700);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-27040097) + "'", int15 == (-27040097));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1305531822 + "'", int24 == 1305531822);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(3232, (-3168));
        int int9 = mathTest0.divide(5151, (-399));
        int int12 = mathTest0.divide(15, (-2623));
        int int14 = mathTest0.square(1296);
        int int17 = mathTest0.multiply(827448224, 940145899);
        java.lang.Class<?> wildcardClass18 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-12) + "'", int9 == (-12));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1679616 + "'", int14 == 1679616);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1524229152) + "'", int17 == (-1524229152));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        mathTest mathTest0 = new mathTest();
        int int2 = mathTest0.square((-101));
        int int5 = mathTest0.multiply(0, 1024);
        int int8 = mathTest0.divide((-461244), 11612725);
        java.lang.Class<?> wildcardClass9 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10201 + "'", int2 == 10201);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.multiply((int) (short) 0, (-101));
        int int9 = mathTest0.add(101, 53312);
        int int12 = mathTest0.add((-21114538), 16318464);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53413 + "'", int9 == 53413);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-4796074) + "'", int12 == (-4796074));
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
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
        int int32 = mathTest0.add((-146), (-805857037));
        int int35 = mathTest0.multiply(1789032704, 2104975434);
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-805857183) + "'", int32 == (-805857183));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-11077120) + "'", int35 == (-11077120));
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) (short) 1);
        int int12 = mathTest0.subtract(51, (-66));
        int int15 = mathTest0.divide(146, 3364195);
        int int18 = mathTest0.multiply((-1623939036), 386092816);
        int int21 = mathTest0.add((-19728481), 10000);
        int int23 = mathTest0.square((-837686844));
        java.lang.Class<?> wildcardClass24 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 117 + "'", int12 == 117);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1738120768 + "'", int18 == 1738120768);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-19718481) + "'", int21 == (-19718481));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1367236112 + "'", int23 == 1367236112);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
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
        int int34 = mathTest0.divide((-31), 247133760);
        java.lang.Class<?> wildcardClass35 = mathTest0.getClass();
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int14 = mathTest0.square(0);
        int int16 = mathTest0.square(5200);
        int int19 = mathTest0.multiply((-367), 782707219);
        int int22 = mathTest0.divide(1688954796, 310);
        int int25 = mathTest0.subtract(583058802, (-485165399));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 27040000 + "'", int16 == 27040000);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 509259459 + "'", int19 == 509259459);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5448241 + "'", int22 == 5448241);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1068224201 + "'", int25 == 1068224201);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((-1), (-50));
        int int18 = mathTest0.subtract(429549516, 0);
        int int20 = mathTest0.square((-30022584));
        int int23 = mathTest0.divide((-28), 10036323);
        int int26 = mathTest0.multiply(1966983424, (-1822115708));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 429549516 + "'", int18 == 429549516);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 828396608 + "'", int20 == 828396608);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1616094208 + "'", int26 == 1616094208);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) ' ');
        int int12 = mathTest0.divide((int) (byte) 100, 36);
        int int15 = mathTest0.add((int) (byte) 1, (-963762076));
        int int18 = mathTest0.multiply(35250, (-3990));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-963762075) + "'", int15 == (-963762075));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-140647500) + "'", int18 == (-140647500));
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(3232, (-3168));
        int int8 = mathTest0.square((-3232));
        int int11 = mathTest0.add(29421356, 112);
        int int14 = mathTest0.divide((int) (byte) 10, 13516830);
        int int17 = mathTest0.divide(150, 12508860);
        int int20 = mathTest0.add((-29795609), 0);
        int int23 = mathTest0.divide((-1611803632), (-237368921));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10445824 + "'", int8 == 10445824);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 29421468 + "'", int11 == 29421468);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-29795609) + "'", int20 == (-29795609));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6 + "'", int23 == 6);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.add((int) (short) 1, 0);
        int int14 = mathTest0.multiply((-399), 1156);
        int int17 = mathTest0.divide(148155, 52);
        int int20 = mathTest0.multiply((-1086356767), (-3243));
        int int23 = mathTest0.subtract((-204514), 0);
        java.lang.Class<?> wildcardClass24 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-461244) + "'", int14 == (-461244));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2849 + "'", int17 == 2849);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1181812661 + "'", int20 == 1181812661);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-204514) + "'", int23 == (-204514));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.add(100, (int) (short) 1);
        int int9 = mathTest0.divide(1581, 4353);
        int int12 = mathTest0.divide(760900608, (-45448));
        int int14 = mathTest0.square((-1623957085));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-16742) + "'", int12 == (-16742));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1232399817 + "'", int14 == 1232399817);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) (short) 1);
        int int12 = mathTest0.subtract(51, (-66));
        int int15 = mathTest0.add((-648771056), (-1992745152));
        int int18 = mathTest0.multiply(712775872, 928713830);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 117 + "'", int12 == 117);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1653451088 + "'", int15 == 1653451088);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-891626368) + "'", int18 == (-891626368));
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int12 = mathTest0.multiply(0, 210);
        int int15 = mathTest0.add((-50), (int) 'a');
        int int18 = mathTest0.add((-27036603), (-675));
        int int21 = mathTest0.multiply((-14756608), 12508860);
        int int24 = mathTest0.subtract(1724707840, 745304636);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 47 + "'", int15 == 47);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-27037278) + "'", int18 == (-27037278));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 760900608 + "'", int21 == 760900608);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 979403204 + "'", int24 == 979403204);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.multiply(10445824, 10445824);
        int int12 = mathTest0.divide(2704, (-5681));
        int int14 = mathTest0.square(712775872);
        int int16 = mathTest0.square(1156);
        int int19 = mathTest0.divide(948604900, 565980994);
        java.lang.Class<?> wildcardClass20 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1594884096 + "'", int9 == 1594884096);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-60518400) + "'", int14 == (-60518400));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1336336 + "'", int16 == 1336336);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.add(100, (int) (short) 1);
        int int9 = mathTest0.subtract(0, 0);
        int int11 = mathTest0.square(12);
        int int14 = mathTest0.subtract((-1156), (-29422512));
        int int17 = mathTest0.divide(100, 842501840);
        int int20 = mathTest0.multiply(203, 1046);
        int int23 = mathTest0.multiply((-3232), (-1021));
        int int26 = mathTest0.add(0, 176203232);
        int int29 = mathTest0.multiply(411972485, (-293668479));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 144 + "'", int11 == 144);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29421356 + "'", int14 == 29421356);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 212338 + "'", int20 == 212338);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3299872 + "'", int23 == 3299872);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 176203232 + "'", int26 == 176203232);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1321577723) + "'", int29 == (-1321577723));
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.subtract(1357853952, 14747159);
        int int17 = mathTest0.multiply((-9545), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1343106793 + "'", int14 == 1343106793);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) (short) 1);
        int int12 = mathTest0.subtract(51, (-66));
        int int15 = mathTest0.divide(146, 3364195);
        int int18 = mathTest0.multiply(100, 1084);
        int int21 = mathTest0.add(537603088, (-45));
        int int24 = mathTest0.multiply(1961891178, 48776);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 117 + "'", int12 == 117);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 108400 + "'", int18 == 108400);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 537603043 + "'", int21 == 537603043);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1332743248 + "'", int24 == 1332743248);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add((int) (byte) 10, (-3232));
        int int15 = mathTest0.add((-3243), 31);
        int int18 = mathTest0.divide((-7), 144);
        int int21 = mathTest0.multiply((-29422522), 112);
        int int24 = mathTest0.multiply((-1732640), 1024);
        int int27 = mathTest0.multiply(198297613, 210);
        int int30 = mathTest0.subtract(1862890760, (-712786789));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3222) + "'", int12 == (-3222));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3212) + "'", int15 == (-3212));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 999644832 + "'", int21 == 999644832);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1774223360) + "'", int24 == (-1774223360));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1307174230) + "'", int27 == (-1307174230));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1719289747) + "'", int30 == (-1719289747));
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(1581, (-13));
        int int15 = mathTest0.multiply((-3212), (-399));
        int int18 = mathTest0.subtract(4858344, 22500);
        int int21 = mathTest0.subtract(980100, 1022217718);
        int int24 = mathTest0.add((-388956160), 1581);
        int int27 = mathTest0.subtract((-324389119), (-290));
        int int29 = mathTest0.square((-13585088));
        java.lang.Class<?> wildcardClass30 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1568 + "'", int12 == 1568);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1281588 + "'", int15 == 1281588);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4835844 + "'", int18 == 4835844);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1021237618) + "'", int21 == (-1021237618));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-388954579) + "'", int24 == (-388954579));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-324388829) + "'", int27 == (-324388829));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-128741376) + "'", int29 == (-128741376));
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.add(52, 98);
        int int16 = mathTest0.square(13503598);
        int int19 = mathTest0.subtract((-27034267), (-5919729));
        int int22 = mathTest0.subtract(1600856285, 1738957824);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 150 + "'", int14 == 150);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 27426628 + "'", int16 == 27426628);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-21114538) + "'", int19 == (-21114538));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-138101539) + "'", int22 == (-138101539));
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(3232, (-3168));
        int int8 = mathTest0.square((-3232));
        int int11 = mathTest0.divide(0, (-1962934273));
        int int14 = mathTest0.add(2005938200, 1964249568);
        int int17 = mathTest0.multiply(1225, (-324388829));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10445824 + "'", int8 == 10445824);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-324779528) + "'", int14 == (-324779528));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2055643003 + "'", int17 == 2055643003);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int8 = mathTest0.square((-51));
        int int10 = mathTest0.square(12508860);
        int int13 = mathTest0.multiply((-161), 1262560048);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2601 + "'", int8 == 2601);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1624939024 + "'", int10 == 1624939024);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1408704816) + "'", int13 == (-1408704816));
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int8 = mathTest0.square((-51));
        int int11 = mathTest0.divide((-3222), 112);
        int int14 = mathTest0.multiply(1, (-134969936));
        int int17 = mathTest0.multiply(2030043136, (-134938));
        int int20 = mathTest0.add((-12420), (-1086356767));
        int int23 = mathTest0.add(1638973851, 763532);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2601 + "'", int8 == 2601);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-28) + "'", int11 == (-28));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-134969936) + "'", int14 == (-134969936));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1241513984) + "'", int17 == (-1241513984));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1086369187) + "'", int20 == (-1086369187));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1639737383 + "'", int23 == 1639737383);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.subtract((-9103), 13516830);
        int int16 = mathTest0.square((-27047925));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-13525933) + "'", int14 == (-13525933));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1597493127) + "'", int16 == (-1597493127));
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.subtract((int) (short) 0, (int) '#');
        int int15 = mathTest0.subtract((-1), 100);
        int int18 = mathTest0.add(1861148465, 7627);
        int int21 = mathTest0.divide((-1563969600), 154788864);
        int int24 = mathTest0.multiply(1881653649, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-35) + "'", int12 == (-35));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-101) + "'", int15 == (-101));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1861156092 + "'", int18 == 1861156092);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-10) + "'", int21 == (-10));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
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
        int int27 = mathTest0.square(894075136);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10036224 + "'", int19 == 10036224);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1507558125) + "'", int22 == (-1507558125));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 138096199 + "'", int25 == 138096199);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-721354752) + "'", int27 == (-721354752));
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((-32), 99);
        int int9 = mathTest0.divide((int) (short) 0, (int) (short) 100);
        int int12 = mathTest0.add((-3295), (-3181));
        int int15 = mathTest0.divide((-1086369187), 2030043136);
        int int18 = mathTest0.divide((int) (byte) 0, 1168561);
        int int21 = mathTest0.divide((-26017196), 408675612);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3168) + "'", int6 == (-3168));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6476) + "'", int12 == (-6476));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) ' ');
        int int12 = mathTest0.divide((int) (byte) 100, 36);
        int int15 = mathTest0.subtract(0, 3232);
        int int18 = mathTest0.divide(104060401, 3329);
        int int20 = mathTest0.square((-1086369187));
        int int23 = mathTest0.multiply((-1129908533), (-217396684));
        int int26 = mathTest0.add((-13503600), (-1905639567));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3232) + "'", int15 == (-3232));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 31258 + "'", int18 == 31258);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1782953417 + "'", int20 == 1782953417);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1704218428 + "'", int23 == 1704218428);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1919143167) + "'", int26 == (-1919143167));
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square((-32969632));
        int int14 = mathTest0.subtract((int) (short) 10, (-1190));
        int int17 = mathTest0.divide(750, 52229);
        int int20 = mathTest0.multiply(55342855, 0);
        int int23 = mathTest0.subtract((-2030039894), (-707775295));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 541139968 + "'", int11 == 541139968);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1200 + "'", int14 == 1200);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1322264599) + "'", int23 == (-1322264599));
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.divide(0, 5200);
        int int14 = mathTest0.multiply((int) (short) 1, (int) (short) 10);
        int int17 = mathTest0.multiply((-3232), 10201);
        int int20 = mathTest0.divide(22500, 10445824);
        int int23 = mathTest0.multiply((int) (short) 100, 10005);
        int int26 = mathTest0.add((-135036), (-813));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-32969632) + "'", int17 == (-32969632));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1000500 + "'", int23 == 1000500);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-135849) + "'", int26 == (-135849));
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int11 = mathTest0.square(3232);
        int int14 = mathTest0.multiply((-3295), 1);
        int int17 = mathTest0.subtract(13516830, 117);
        int int20 = mathTest0.divide((-1380361), (-16458735));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10445824 + "'", int11 == 10445824);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3295) + "'", int14 == (-3295));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 13516713 + "'", int17 == 13516713);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
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
        int int35 = mathTest0.multiply((-375728), (-2130088743));
        int int38 = mathTest0.divide(960049148, (-1623957085));
        int int40 = mathTest0.square((-3));
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1187358672 + "'", int35 == 1187358672);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 9 + "'", int40 == 9);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(3232, (-3168));
        int int8 = mathTest0.square((-3232));
        int int11 = mathTest0.subtract((int) (byte) 100, (-63));
        int int13 = mathTest0.square(557020471);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10445824 + "'", int8 == 10445824);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 163 + "'", int11 == 163);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 395661777 + "'", int13 == 395661777);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.add((int) (byte) -1, (int) '4');
        int int12 = mathTest0.multiply((int) 'a', (int) (short) 100);
        int int15 = mathTest0.subtract((-27036768), 3329);
        int int18 = mathTest0.multiply(0, (-2));
        int int21 = mathTest0.add(64, (-65));
        java.lang.Class<?> wildcardClass22 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9700 + "'", int12 == 9700);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-27040097) + "'", int15 == (-27040097));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int5 = mathTest0.square((-1735140));
        int int8 = mathTest0.divide((-1440205312), 38271);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-61254896) + "'", int5 == (-61254896));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-37631) + "'", int8 == (-37631));
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int12 = mathTest0.multiply(0, 210);
        int int15 = mathTest0.add((-50), (int) 'a');
        int int18 = mathTest0.add((-27036603), (-675));
        int int21 = mathTest0.multiply((-14756608), 12508860);
        int int24 = mathTest0.add((-252448), (-805857037));
        int int27 = mathTest0.subtract(341, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 47 + "'", int15 == 47);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-27037278) + "'", int18 == (-27037278));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 760900608 + "'", int21 == 760900608);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-806109485) + "'", int24 == (-806109485));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 341 + "'", int27 == 341);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((int) (short) -1, 36);
        int int18 = mathTest0.multiply((-51), (-31));
        int int20 = mathTest0.square(1331441);
        int int23 = mathTest0.add((-50938), 1895825408);
        int int26 = mathTest0.divide(2126189078, (-327155712));
        int int29 = mathTest0.add(719684252, (-1327930204));
        java.lang.Class<?> wildcardClass30 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1581 + "'", int18 == 1581);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1086356767) + "'", int20 == (-1086356767));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1895774470 + "'", int23 == 1895774470);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-6) + "'", int26 == (-6));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-608245952) + "'", int29 == (-608245952));
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int12 = mathTest0.multiply(144, 1594884096);
        int int15 = mathTest0.subtract((-992), 1042102);
        int int17 = mathTest0.square(1118899305);
        java.lang.Class<?> wildcardClass18 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2030043136 + "'", int12 == 2030043136);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1043094) + "'", int15 == (-1043094));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1305215761 + "'", int17 == 1305215761);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.add(100, (int) (short) 1);
        int int9 = mathTest0.divide(1581, 4353);
        int int12 = mathTest0.divide(760900608, (-45448));
        int int14 = mathTest0.square(770737356);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-16742) + "'", int12 == (-16742));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-77397360) + "'", int14 == (-77397360));
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.multiply(10445824, 10445824);
        int int12 = mathTest0.subtract((int) 'a', 9669);
        int int15 = mathTest0.add(1094116, (-66));
        int int18 = mathTest0.multiply(533500814, 1425784004);
        int int21 = mathTest0.divide((-691260856), 144);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1594884096 + "'", int9 == 1594884096);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9572) + "'", int12 == (-9572));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1094050 + "'", int15 == 1094050);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-650690376) + "'", int18 == (-650690376));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-4800422) + "'", int21 == (-4800422));
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        int int20 = mathTest0.multiply((int) (byte) 0, (-1));
        int int23 = mathTest0.divide((-29422522), 3232);
        int int26 = mathTest0.subtract(0, (-1515163));
        int int29 = mathTest0.add(0, 775032193);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-9103) + "'", int23 == (-9103));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1515163 + "'", int26 == 1515163);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 775032193 + "'", int29 == 775032193);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int13 = mathTest0.square(10036224);
        int int16 = mathTest0.multiply(1336336, (-1156));
        int int19 = mathTest0.subtract((-1515163), 18974736);
        int int22 = mathTest0.divide(1440205312, (-178462463));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 219152384 + "'", int13 == 219152384);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1544804416) + "'", int16 == (-1544804416));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-20489899) + "'", int19 == (-20489899));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-8) + "'", int22 == (-8));
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(3232, (-3168));
        int int8 = mathTest0.square((-3232));
        int int11 = mathTest0.divide(0, (-1962934273));
        int int14 = mathTest0.add(4, (-776062010));
        int int17 = mathTest0.multiply((-1992745152), 30096196);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10445824 + "'", int8 == 10445824);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-776062006) + "'", int14 == (-776062006));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1524626176) + "'", int17 == (-1524626176));
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int14 = mathTest0.square((int) '4');
        int int17 = mathTest0.subtract((-1735141), 0);
        int int20 = mathTest0.add((-2033540108), (-923619184));
        int int23 = mathTest0.add(0, 0);
        int int26 = mathTest0.divide(990, 82474747);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2704 + "'", int14 == 2704);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1735141) + "'", int17 == (-1735141));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1337808004 + "'", int20 == 1337808004);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.subtract((int) (short) 0, (int) '#');
        int int15 = mathTest0.subtract((-1), 100);
        int int18 = mathTest0.add(5151, (-51));
        int int21 = mathTest0.divide(27040000, (-1086356767));
        int int24 = mathTest0.subtract((-943686358), 1348961447);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-35) + "'", int12 == (-35));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-101) + "'", int15 == (-101));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5100 + "'", int18 == 5100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2002319491 + "'", int24 == 2002319491);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.subtract((int) (short) -1, (int) (short) 100);
        int int17 = mathTest0.divide(1, 100);
        int int20 = mathTest0.divide(11161, 1499341);
        int int23 = mathTest0.divide((-11329044), 2265025);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-101) + "'", int14 == (-101));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-5) + "'", int23 == (-5));
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        int int20 = mathTest0.add(0, 1046);
        int int23 = mathTest0.subtract((-1719289747), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1046 + "'", int20 == 1046);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1719289747) + "'", int23 == (-1719289747));
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int11 = mathTest0.square((int) (short) 1);
        int int14 = mathTest0.subtract((-27046437), 1496241);
        java.lang.Class<?> wildcardClass15 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-28542678) + "'", int14 == (-28542678));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int13 = mathTest0.square(10036224);
        int int16 = mathTest0.multiply(1336336, (-1156));
        int int19 = mathTest0.subtract((-1515163), 18974736);
        int int22 = mathTest0.divide((-3232), 1065108889);
        int int25 = mathTest0.divide(31258, 1094568578);
        int int28 = mathTest0.subtract(2087780608, 1237);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 219152384 + "'", int13 == 219152384);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1544804416) + "'", int16 == (-1544804416));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-20489899) + "'", int19 == (-20489899));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2087779371 + "'", int28 == 2087779371);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square((-32969632));
        int int14 = mathTest0.subtract((int) (short) 10, (-1190));
        int int17 = mathTest0.divide((-134974900), (-1095390208));
        int int19 = mathTest0.square((-1625887059));
        int int22 = mathTest0.add((-570562577), (-3));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 541139968 + "'", int11 == 541139968);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1200 + "'", int14 == 1200);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-901635863) + "'", int19 == (-901635863));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-570562580) + "'", int22 == (-570562580));
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.divide(1290100, (-3232));
        int int20 = mathTest0.divide((-6476), 34);
        int int23 = mathTest0.subtract(10, (-8));
        int int26 = mathTest0.add((-35), 1174437540);
        int int28 = mathTest0.square(1830466976);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-399) + "'", int17 == (-399));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-190) + "'", int20 == (-190));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 18 + "'", int23 == 18);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1174437505 + "'", int26 == 1174437505);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1520720896) + "'", int28 == (-1520720896));
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int5 = mathTest0.square(1053);
        int int7 = mathTest0.square(12508860);
        int int9 = mathTest0.square(1961891178);
        int int12 = mathTest0.multiply((-376), (-134938));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1108809 + "'", int5 == 1108809);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1624939024 + "'", int7 == 1624939024);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 948604900 + "'", int9 == 948604900);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 50736688 + "'", int12 == 50736688);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.subtract(36, 3232);
        int int16 = mathTest0.square(2);
        int int19 = mathTest0.add((int) '4', 12);
        int int22 = mathTest0.divide((-13), (-3990));
        int int25 = mathTest0.add(55342855, (-1507558125));
        int int28 = mathTest0.multiply(1931872313, 36819);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3196) + "'", int14 == (-3196));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 64 + "'", int19 == 64);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1452215270) + "'", int25 == (-1452215270));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 653303291 + "'", int28 == 653303291);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int11 = mathTest0.square(3232);
        int int14 = mathTest0.divide((-32), (int) (short) 1);
        int int17 = mathTest0.add(36, 1010);
        int int20 = mathTest0.divide((-51), (-1740241));
        java.lang.Class<?> wildcardClass21 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10445824 + "'", int11 == 10445824);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-32) + "'", int14 == (-32));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1046 + "'", int17 == 1046);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) ' ');
        int int12 = mathTest0.add((-1042102), 1000500);
        int int15 = mathTest0.add((-1838192896), (-341));
        int int18 = mathTest0.multiply((-13503535), 1156);
        int int20 = mathTest0.square(5448241);
        int int23 = mathTest0.divide((-545630212), 763532);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-41602) + "'", int12 == (-41602));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1838193237) + "'", int15 == (-1838193237));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1569782724 + "'", int18 == 1569782724);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 811011425 + "'", int20 == 811011425);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-714) + "'", int23 == (-714));
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        int int20 = mathTest0.add(0, 1046);
        int int23 = mathTest0.add((-1886410752), (-860132015));
        int int26 = mathTest0.multiply((-56371487), (-2244));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1046 + "'", int20 == 1046);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1548424529 + "'", int23 == 1548424529);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1943565244 + "'", int26 == 1943565244);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int12 = mathTest0.multiply(0, 210);
        int int15 = mathTest0.divide(1500625, 4353);
        int int17 = mathTest0.square(1653863434);
        int int20 = mathTest0.divide(21120, 128);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 344 + "'", int15 == 344);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-736161692) + "'", int17 == (-736161692));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 165 + "'", int20 == 165);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.add((-3181), (int) 'a');
        int int16 = mathTest0.square(150);
        java.lang.Class<?> wildcardClass17 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3084) + "'", int14 == (-3084));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 22500 + "'", int16 == 22500);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(12, 100);
        int int15 = mathTest0.subtract(0, (-1156));
        int int18 = mathTest0.subtract((-1), 2048);
        int int21 = mathTest0.multiply(0, 506250000);
        int int24 = mathTest0.divide(546218051, (-129702790));
        java.lang.Class<?> wildcardClass25 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 112 + "'", int12 == 112);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1156 + "'", int15 == 1156);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2049) + "'", int18 == (-2049));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-4) + "'", int24 == (-4));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.subtract((int) '#', (int) (short) 100);
        int int12 = mathTest0.subtract(10000, (-13506830));
        int int15 = mathTest0.add(194966016, 2020667172);
        int int18 = mathTest0.add((-73794786), 137574);
        int int21 = mathTest0.add(827448224, (-1362701058));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-65) + "'", int9 == (-65));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 13516830 + "'", int12 == 13516830);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2079334108) + "'", int15 == (-2079334108));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-73657212) + "'", int18 == (-73657212));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-535252834) + "'", int21 == (-535252834));
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(12, 100);
        int int15 = mathTest0.subtract(0, (-1156));
        int int18 = mathTest0.subtract((-1), 2048);
        int int21 = mathTest0.subtract((-601128), 29421456);
        int int23 = mathTest0.square((-1086356767));
        int int26 = mathTest0.subtract(1480589312, 34906950);
        int int28 = mathTest0.square((-9254698));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 112 + "'", int12 == 112);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1156 + "'", int15 == 1156);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2049) + "'", int18 == (-2049));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-30022584) + "'", int21 == (-30022584));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1806125505 + "'", int23 == 1806125505);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1445682362 + "'", int26 == 1445682362);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-802745628) + "'", int28 == (-802745628));
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.divide(0, 5200);
        int int14 = mathTest0.multiply((int) (short) 1, (int) (short) 10);
        int int17 = mathTest0.multiply((-3232), 10201);
        int int20 = mathTest0.divide(22500, 10445824);
        int int23 = mathTest0.multiply((int) (short) 100, 10005);
        int int26 = mathTest0.subtract(312900721, 1200);
        int int29 = mathTest0.add(40092, 187388721);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-32969632) + "'", int17 == (-32969632));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1000500 + "'", int23 == 1000500);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 312899521 + "'", int26 == 312899521);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 187428813 + "'", int29 == 187428813);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((-1), (-50));
        int int18 = mathTest0.divide((int) (short) -1, 163);
        int int21 = mathTest0.subtract(1496089, (-71));
        int int24 = mathTest0.multiply(2601, 1331441);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1496160 + "'", int21 == 1496160);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-831889255) + "'", int24 == (-831889255));
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        int int20 = mathTest0.subtract(12, (-3295));
        int int23 = mathTest0.add(18352, 1347636419);
        int int26 = mathTest0.add(152, 0);
        int int29 = mathTest0.multiply(1946522112, (-1219906463));
        int int32 = mathTest0.multiply((-446327642), 219152384);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3307 + "'", int20 == 3307);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1347654771 + "'", int23 == 1347654771);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 152 + "'", int26 == 152);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-2101063168) + "'", int29 == (-2101063168));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1201668096) + "'", int32 == (-1201668096));
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        mathTest mathTest0 = new mathTest();
        int int2 = mathTest0.square((-101));
        int int5 = mathTest0.multiply(1594884096, (-29422512));
        int int8 = mathTest0.divide((-32969632), (-3295));
        int int11 = mathTest0.divide(2499561, 3329);
        int int14 = mathTest0.add(27426628, 1962924603);
        int int17 = mathTest0.multiply(11082241, 923);
        int int20 = mathTest0.divide(11082241, 1966983424);
        int int22 = mathTest0.square(1020100);
        int int24 = mathTest0.square((-775371544));
        int int27 = mathTest0.divide((-1614522155), (-1319425623));
        java.lang.Class<?> wildcardClass28 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10201 + "'", int2 == 10201);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1962934272 + "'", int5 == 1962934272);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10005 + "'", int8 == 10005);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 750 + "'", int11 == 750);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1990351231 + "'", int14 == 1990351231);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1638973851 + "'", int17 == 1638973851);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1221924368 + "'", int22 == 1221924368);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 301208128 + "'", int24 == 301208128);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
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
        int int33 = mathTest0.divide(1295175098, 262793188);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4 + "'", int33 == 4);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int12 = mathTest0.multiply(0, 210);
        int int15 = mathTest0.add((-50), (int) 'a');
        int int18 = mathTest0.add((-27036603), (-675));
        int int21 = mathTest0.divide(4011570, 1120946724);
        int int24 = mathTest0.divide(0, (-1563969599));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 47 + "'", int15 == 47);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-27037278) + "'", int18 == (-27037278));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int5 = mathTest0.square((-1735140));
        java.lang.Class<?> wildcardClass6 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-61254896) + "'", int5 == (-61254896));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int12 = mathTest0.multiply(144, 1594884096);
        int int15 = mathTest0.subtract((-992), 1042102);
        int int18 = mathTest0.multiply(1496699, 0);
        int int21 = mathTest0.add(461828740, 55131);
        int int24 = mathTest0.multiply((-1821319828), (-1934984370));
        int int27 = mathTest0.multiply(1731661824, 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2030043136 + "'", int12 == 2030043136);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1043094) + "'", int15 == (-1043094));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 461883871 + "'", int21 == 461883871);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1082022632 + "'", int24 == 1082022632);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1663287296) + "'", int27 == (-1663287296));
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((-32), 99);
        int int9 = mathTest0.divide((int) (short) 0, (int) (short) 100);
        int int12 = mathTest0.add((-3295), (-3181));
        int int15 = mathTest0.add(0, 1346542369);
        int int18 = mathTest0.subtract(1100362355, 963550189);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3168) + "'", int6 == (-3168));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6476) + "'", int12 == (-6476));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1346542369 + "'", int15 == 1346542369);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 136812166 + "'", int18 == 136812166);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square((-32969632));
        int int14 = mathTest0.subtract((int) (short) 10, (-1190));
        int int17 = mathTest0.divide((-134974900), (-1095390208));
        int int20 = mathTest0.divide(180405, 12124646);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 541139968 + "'", int11 == 541139968);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1200 + "'", int14 == 1200);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.subtract((int) '#', (int) (short) 100);
        int int12 = mathTest0.divide(0, (-1021));
        int int14 = mathTest0.square((int) (byte) 10);
        int int17 = mathTest0.multiply(17689, 10036224);
        int int20 = mathTest0.subtract((-61), (-27036603));
        int int23 = mathTest0.divide(1481211671, 282532054);
        int int26 = mathTest0.multiply((-33116283), 464323834);
        int int29 = mathTest0.divide(109330155, 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-65) + "'", int9 == (-65));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1437107200 + "'", int17 == 1437107200);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 27036542 + "'", int20 == 27036542);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-786007070) + "'", int26 == (-786007070));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 21866031 + "'", int29 == 21866031);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        mathTest mathTest0 = new mathTest();
        int int2 = mathTest0.square((-101));
        int int5 = mathTest0.multiply(0, 1024);
        int int8 = mathTest0.divide((-461244), 11612725);
        int int11 = mathTest0.divide(115, 1325028);
        int int14 = mathTest0.add(1961891178, 29421697);
        int int16 = mathTest0.square(1230503936);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10201 + "'", int2 == 10201);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1991312875 + "'", int14 == 1991312875);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.subtract((-2720), 9700);
        int int8 = mathTest0.square((-66));
        int int11 = mathTest0.subtract((-16458735), (-9778230));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-12420) + "'", int6 == (-12420));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4356 + "'", int8 == 4356);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-6680505) + "'", int11 == (-6680505));
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(3232, (-3168));
        int int9 = mathTest0.divide(5151, (-399));
        int int12 = mathTest0.divide(5200, (-32969632));
        int int15 = mathTest0.divide(5041, (-18339));
        java.lang.Class<?> wildcardClass16 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-12) + "'", int9 == (-12));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int14 = mathTest0.square(0);
        int int17 = mathTest0.add(100, 203);
        int int20 = mathTest0.add((-963762076), (-506154654));
        int int23 = mathTest0.add(28774156, (-9449));
        int int26 = mathTest0.multiply(176965908, (-953401000));
        int int28 = mathTest0.square(1646354688);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 303 + "'", int17 == 303);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1469916730) + "'", int20 == (-1469916730));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 28764707 + "'", int23 == 28764707);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1513566944 + "'", int26 == 1513566944);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 650182656 + "'", int28 == 650182656);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
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
        int int34 = mathTest0.divide((-1200524809), 4189);
        int int37 = mathTest0.divide(1025, 1908770240);
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-286589) + "'", int34 == (-286589));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.divide(0, 5200);
        int int13 = mathTest0.square((int) (short) 0);
        int int16 = mathTest0.multiply((-1312236352), (-1631068032));
        int int19 = mathTest0.divide(989063398, (-5486));
        java.lang.Class<?> wildcardClass20 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1093246976) + "'", int16 == (-1093246976));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-180288) + "'", int19 == (-180288));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
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
        int int31 = mathTest0.subtract(312900721, 14);
        int int34 = mathTest0.add(557020471, 521516639);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 312900707 + "'", int31 == 312900707);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1078537110 + "'", int34 == 1078537110);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((-1), (-50));
        int int18 = mathTest0.divide((int) (short) -1, 163);
        int int21 = mathTest0.multiply(1336336, 29421456);
        int int23 = mathTest0.square((-934701798));
        int int26 = mathTest0.add(2075474209, 979403204);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 820197632 + "'", int21 == 820197632);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-5552476) + "'", int23 == (-5552476));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1240089883) + "'", int26 == (-1240089883));
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.multiply(101, 51);
        int int16 = mathTest0.square((int) ' ');
        int int19 = mathTest0.add(0, (-123));
        int int21 = mathTest0.square((-805866716));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5151 + "'", int14 == 5151);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1024 + "'", int16 == 1024);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-123) + "'", int19 == (-123));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1690215152) + "'", int21 == (-1690215152));
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int13 = mathTest0.square(10036224);
        int int16 = mathTest0.multiply(1336336, (-1156));
        int int19 = mathTest0.subtract((-1515163), 18974736);
        int int22 = mathTest0.divide((-3232), 1065108889);
        int int24 = mathTest0.square(10036323);
        int int27 = mathTest0.add((-1544804415), (-961368611));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 219152384 + "'", int13 == 219152384);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1544804416) + "'", int16 == (-1544804416));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-20489899) + "'", int19 == (-20489899));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2088632759) + "'", int24 == (-2088632759));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1788794270 + "'", int27 == 1788794270);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        mathTest mathTest0 = new mathTest();
        int int2 = mathTest0.square((-101));
        int int5 = mathTest0.divide((-71), 19);
        int int7 = mathTest0.square((-13506830));
        int int10 = mathTest0.add((-372010359), (-1469159904));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10201 + "'", int2 == 10201);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-3) + "'", int5 == (-3));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1425784004 + "'", int7 == 1425784004);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1841170263) + "'", int10 == (-1841170263));
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.subtract((int) '#', (int) (short) 1);
        int int17 = mathTest0.multiply(1, (-1));
        int int19 = mathTest0.square((-3168));
        int int21 = mathTest0.square(2704);
        int int24 = mathTest0.multiply(29421697, 50960);
        int int27 = mathTest0.add(70071185, 0);
        int int30 = mathTest0.subtract(1425784965, (int) (byte) 10);
        int int33 = mathTest0.divide((-30705345), 1513675);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10036224 + "'", int19 == 10036224);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7311616 + "'", int21 == 7311616);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 386092816 + "'", int24 == 386092816);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 70071185 + "'", int27 == 70071185);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1425784955 + "'", int30 == 1425784955);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-20) + "'", int33 == (-20));
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int11 = mathTest0.square(3232);
        int int14 = mathTest0.divide((-32), (int) (short) 1);
        int int16 = mathTest0.square((-50));
        int int19 = mathTest0.add((-3990), 16318464);
        int int22 = mathTest0.add(138096199, 533500814);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10445824 + "'", int11 == 10445824);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-32) + "'", int14 == (-32));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2500 + "'", int16 == 2500);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 16314474 + "'", int19 == 16314474);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 671597013 + "'", int22 == 671597013);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
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
        int int31 = mathTest0.multiply((-190), 39906449);
        int int34 = mathTest0.add(258048292, 592254080);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1007709282 + "'", int31 == 1007709282);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 850302372 + "'", int34 == 850302372);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(3232, (-3168));
        int int8 = mathTest0.square((-3232));
        int int11 = mathTest0.subtract((int) (byte) 100, (-63));
        int int14 = mathTest0.add(1099748687, (-2));
        int int17 = mathTest0.multiply(3307, 1892067663);
        int int19 = mathTest0.square((-29422522));
        int int22 = mathTest0.subtract(377578, (-296));
        int int25 = mathTest0.subtract(210, 2778889);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10445824 + "'", int8 == 10445824);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 163 + "'", int11 == 163);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1099748685 + "'", int14 == 1099748685);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-699588731) + "'", int17 == (-699588731));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-217406684) + "'", int19 == (-217406684));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 377874 + "'", int22 == 377874);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-2778679) + "'", int25 == (-2778679));
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
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
        int int28 = mathTest0.subtract(1414081664, 1652);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5151 + "'", int14 == 5151);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1732640) + "'", int17 == (-1732640));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10201 + "'", int19 == 10201);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 208780 + "'", int22 == 208780);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1327930204) + "'", int25 == (-1327930204));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1414080012 + "'", int28 == 1414080012);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.subtract(36, 3232);
        int int16 = mathTest0.square(2);
        int int19 = mathTest0.multiply(1719912448, (int) (byte) 10);
        int int22 = mathTest0.subtract(1999614872, (-66144219));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3196) + "'", int14 == (-3196));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 19255296 + "'", int19 == 19255296);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2065759091 + "'", int22 == 2065759091);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) (short) 1);
        int int11 = mathTest0.square(935011904);
        int int14 = mathTest0.subtract((int) (byte) 100, (-580330951));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1731661824 + "'", int11 == 1731661824);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 580331051 + "'", int14 == 580331051);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.multiply(101, 51);
        int int17 = mathTest0.divide(144, 64);
        int int20 = mathTest0.subtract(10005, (-1156));
        int int23 = mathTest0.divide((-1571), (-1845686));
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
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
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
        int int28 = mathTest0.multiply((-648771056), 833797824);
        int int31 = mathTest0.multiply((-1338584163), (-34));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4356 + "'", int17 == 4356);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-9669) + "'", int25 == (-9669));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-855675904) + "'", int28 == (-855675904));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1732778714) + "'", int31 == (-1732778714));
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
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
        int int28 = mathTest0.multiply((-1423556608), (-455790592));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5151 + "'", int14 == 5151);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 18 + "'", int20 == 18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1020100 + "'", int22 == 1020100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-447823802) + "'", int25 == (-447823802));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1811939328 + "'", int28 == 1811939328);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
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
        int int31 = mathTest0.divide(940145899, 671597013);
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
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) ' ');
        int int12 = mathTest0.add((-1042102), 1000500);
        int int15 = mathTest0.add((-1838192896), (-341));
        int int18 = mathTest0.multiply((-13503535), 1156);
        int int21 = mathTest0.add(3329, 18352);
        int int24 = mathTest0.divide(2000620614, 2265025);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-41602) + "'", int12 == (-41602));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1838193237) + "'", int15 == (-1838193237));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1569782724 + "'", int18 == 1569782724);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 21681 + "'", int21 == 21681);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 883 + "'", int24 == 883);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.subtract((int) (short) -1, (int) (short) 100);
        int int16 = mathTest0.square(101);
        int int18 = mathTest0.square(99);
        int int21 = mathTest0.add(22500, (-167544));
        int int24 = mathTest0.add(1334646608, 316921);
        int int26 = mathTest0.square(43560784);
        int int29 = mathTest0.divide(1600856285, (-1086356767));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-101) + "'", int14 == (-101));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10201 + "'", int16 == 10201);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9801 + "'", int18 == 9801);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-145044) + "'", int21 == (-145044));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1334963529 + "'", int24 == 1334963529);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-418481920) + "'", int26 == (-418481920));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.add((-190), (int) '4');
        int int16 = mathTest0.square((int) 'a');
        int int19 = mathTest0.subtract((-1190), 950697);
        int int22 = mathTest0.add(361, 15046285);
        int int24 = mathTest0.square((-1118807808));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-138) + "'", int14 == (-138));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9409 + "'", int16 == 9409);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-951887) + "'", int19 == (-951887));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 15046646 + "'", int22 == 15046646);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1091502080) + "'", int24 == (-1091502080));
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
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
        int int36 = mathTest0.divide((-31), 52);
        int int39 = mathTest0.multiply(4345, 592254080);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 658567296 + "'", int39 == 658567296);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((int) (short) -1, 36);
        int int18 = mathTest0.multiply((-51), (-31));
        int int20 = mathTest0.square(1331441);
        int int23 = mathTest0.divide((-1821248624), (-597361078));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1581 + "'", int18 == 1581);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1086356767) + "'", int20 == (-1086356767));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int11 = mathTest0.square(3232);
        int int14 = mathTest0.divide((-32), (int) (short) 1);
        int int17 = mathTest0.add(36, 1010);
        int int20 = mathTest0.add((-2030043126), 3232);
        int int23 = mathTest0.subtract((-20531501), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10445824 + "'", int11 == 10445824);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-32) + "'", int14 == (-32));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1046 + "'", int17 == 1046);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-2030039894) + "'", int20 == (-2030039894));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-20531501) + "'", int23 == (-20531501));
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        mathTest mathTest0 = new mathTest();
        int int2 = mathTest0.square((-101));
        int int5 = mathTest0.multiply(1594884096, (-29422512));
        java.lang.Class<?> wildcardClass6 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10201 + "'", int2 == 10201);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1962934272 + "'", int5 == 1962934272);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) ' ');
        int int12 = mathTest0.divide((int) (byte) 100, 36);
        int int15 = mathTest0.add((-1404), 27040000);
        int int18 = mathTest0.subtract(1120946724, 20584369);
        int int20 = mathTest0.square((-1623939036));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 27038596 + "'", int15 == 27038596);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1100362355 + "'", int18 == 1100362355);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1963934992 + "'", int20 == 1963934992);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.add((int) (short) 1, 0);
        int int14 = mathTest0.add(51, (-3232));
        int int17 = mathTest0.subtract(2, 163);
        int int20 = mathTest0.subtract(14747159, (-330390172));
        int int23 = mathTest0.subtract((-461240), 1614374000);
        java.lang.Class<?> wildcardClass24 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3181) + "'", int14 == (-3181));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-161) + "'", int17 == (-161));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 345137331 + "'", int20 == 345137331);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1614835240) + "'", int23 == (-1614835240));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.add((int) (byte) -1, (int) '4');
        int int12 = mathTest0.multiply((int) 'a', (int) (short) 100);
        int int14 = mathTest0.square(219152384);
        int int17 = mathTest0.divide(133, (-50));
        int int20 = mathTest0.divide(10000, 1012141057);
        int int23 = mathTest0.divide(7498739, (-989855706));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9700 + "'", int12 == 9700);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-2) + "'", int17 == (-2));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(1581, (-13));
        int int15 = mathTest0.multiply((-3212), (-399));
        int int18 = mathTest0.subtract(4858344, 22500);
        int int21 = mathTest0.subtract(980100, 1022217718);
        int int24 = mathTest0.add((-388956160), 1581);
        int int27 = mathTest0.subtract(349175808, 104060401);
        int int30 = mathTest0.subtract(1517275194, 430935840);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1568 + "'", int12 == 1568);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1281588 + "'", int15 == 1281588);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4835844 + "'", int18 == 4835844);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1021237618) + "'", int21 == (-1021237618));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-388954579) + "'", int24 == (-388954579));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 245115407 + "'", int27 == 245115407);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1086339354 + "'", int30 == 1086339354);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        int int20 = mathTest0.subtract(12, (-3295));
        int int23 = mathTest0.add(18352, 1347636419);
        int int25 = mathTest0.square(1530169);
        int int27 = mathTest0.square(0);
        int int30 = mathTest0.add(16318464, (-3322));
        int int33 = mathTest0.subtract(13516830, (-1331259134));
        java.lang.Class<?> wildcardClass34 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3307 + "'", int20 == 3307);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1347654771 + "'", int23 == 1347654771);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 659992241 + "'", int25 == 659992241);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 16315142 + "'", int30 == 16315142);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1344775964 + "'", int33 == 1344775964);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.multiply(101, 51);
        int int17 = mathTest0.multiply(34, (-50960));
        int int19 = mathTest0.square(101);
        int int21 = mathTest0.square((-1492995));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5151 + "'", int14 == 5151);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1732640) + "'", int17 == (-1732640));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10201 + "'", int19 == 10201);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-53956599) + "'", int21 == (-53956599));
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.add((int) (byte) -1, (int) '4');
        int int12 = mathTest0.multiply((int) 'a', (int) (short) 100);
        int int14 = mathTest0.square(219152384);
        int int17 = mathTest0.divide(133, (-50));
        int int20 = mathTest0.add(1208040860, 1961891178);
        int int23 = mathTest0.multiply((-109), 1964263334);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9700 + "'", int12 == 9700);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-2) + "'", int17 == (-2));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1125035258) + "'", int20 == (-1125035258));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 643661394 + "'", int23 == 643661394);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int11 = mathTest0.square(34);
        int int14 = mathTest0.multiply(11, 290);
        int int17 = mathTest0.divide((-951887), (-3069));
        int int20 = mathTest0.multiply(1041887, (-564040361));
        int int23 = mathTest0.subtract((-27036775), 66145886);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1156 + "'", int11 == 1156);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3190 + "'", int14 == 3190);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 310 + "'", int17 == 310);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1170608585 + "'", int20 == 1170608585);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-93182661) + "'", int23 == (-93182661));
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
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
        int int30 = mathTest0.subtract(842501840, 0);
        int int33 = mathTest0.divide(1568, (-574));
        int int36 = mathTest0.add(1654672433, (-1927418036));
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 842501840 + "'", int30 == 842501840);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-2) + "'", int33 == (-2));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-272745603) + "'", int36 == (-272745603));
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(210, (-7));
        int int15 = mathTest0.add(336318921, 763532);
        int int18 = mathTest0.add(12116872, (-1380361));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 203 + "'", int12 == 203);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 337082453 + "'", int15 == 337082453);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10736511 + "'", int18 == 10736511);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
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
        int int32 = mathTest0.add(0, (-472064042));
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-472064042) + "'", int32 == (-472064042));
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        int int20 = mathTest0.divide(2500, (-13503535));
        int int23 = mathTest0.add(99, 10036224);
        int int25 = mathTest0.square(547818894);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10036323 + "'", int23 == 10036323);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 805026500 + "'", int25 == 805026500);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.divide((-290), 1892067732);
        int int9 = mathTest0.add((-805857024), 163);
        int int12 = mathTest0.multiply(1530126, 911118325);
        int int15 = mathTest0.subtract((-1437108180), (-1206054128));
        int int18 = mathTest0.subtract(19044, (-1838229715));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-805856861) + "'", int9 == (-805856861));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 928713830 + "'", int12 == 928713830);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-231054052) + "'", int15 == (-231054052));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1838248759 + "'", int18 == 1838248759);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.add((int) (byte) -1, (int) '4');
        int int12 = mathTest0.multiply((int) 'a', (int) (short) 100);
        int int14 = mathTest0.square(219152384);
        int int16 = mathTest0.square(521516639);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9700 + "'", int12 == 9700);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1870739265 + "'", int16 == 1870739265);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
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
        int int31 = mathTest0.multiply((-4222), 1568);
        int int34 = mathTest0.add((-1397199231), 599383088);
        int int37 = mathTest0.add(603979776, (-2623));
        int int40 = mathTest0.divide(627464426, 650182656);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-6620096) + "'", int31 == (-6620096));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-797816143) + "'", int34 == (-797816143));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 603977153 + "'", int37 == 603977153);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.divide(0, 5200);
        int int13 = mathTest0.square((int) (short) 0);
        int int16 = mathTest0.subtract((-390241792), 8116801);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-398358593) + "'", int16 == (-398358593));
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int5 = mathTest0.square((int) (byte) 10);
        int int8 = mathTest0.add((-1488), 3190);
        int int11 = mathTest0.multiply((-1042405), 2500);
        int int14 = mathTest0.divide((-1390698314), 9700);
        int int17 = mathTest0.add((-823), (-845553664));
        java.lang.Class<?> wildcardClass18 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1702 + "'", int8 == 1702);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1688954796 + "'", int11 == 1688954796);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-143370) + "'", int14 == (-143370));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-845554487) + "'", int17 == (-845554487));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.divide(1496241, 10201);
        int int15 = mathTest0.divide(11161, 1);
        int int18 = mathTest0.subtract((int) (byte) -1, 1962934272);
        int int20 = mathTest0.square(117);
        int int23 = mathTest0.divide(1494149, (-39024));
        int int26 = mathTest0.divide(0, 823696656);
        int int29 = mathTest0.divide(429549516, 1174437474);
        int int32 = mathTest0.add((-781646601), 154788864);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 146 + "'", int12 == 146);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11161 + "'", int15 == 11161);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1962934273) + "'", int18 == (-1962934273));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 13689 + "'", int20 == 13689);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-38) + "'", int23 == (-38));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-626857737) + "'", int32 == (-626857737));
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
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
        int int30 = mathTest0.multiply((-29338412), 712776862);
        int int33 = mathTest0.multiply(432963964, (-1350726656));
        int int36 = mathTest0.subtract(0, (-806109485));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-13) + "'", int18 == (-13));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 29421456 + "'", int21 == 29421456);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1735141) + "'", int27 == (-1735141));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-743732520) + "'", int30 == (-743732520));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-329527296) + "'", int33 == (-329527296));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 806109485 + "'", int36 == 806109485);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(3232, (-3168));
        int int8 = mathTest0.square((-3232));
        int int11 = mathTest0.add(29421356, 112);
        int int14 = mathTest0.divide((int) (byte) 10, 13516830);
        int int17 = mathTest0.subtract((-364053231), 1688954796);
        int int20 = mathTest0.subtract(429549516, 217038);
        int int23 = mathTest0.add((-45448), (-145044));
        int int26 = mathTest0.subtract(5200, (-1489461561));
        int int28 = mathTest0.square((-33307825));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10445824 + "'", int8 == 10445824);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 29421468 + "'", int11 == 29421468);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-2053008027) + "'", int17 == (-2053008027));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 429332478 + "'", int20 == 429332478);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-190492) + "'", int23 == (-190492));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1489466761 + "'", int26 == 1489466761);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-321162655) + "'", int28 == (-321162655));
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.subtract((int) '#', (int) (short) 1);
        int int17 = mathTest0.divide((-743732520), 1174437540);
        int int20 = mathTest0.subtract(1053, (-1065096738));
        int int23 = mathTest0.add(30460917, 1962934272);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1065097791 + "'", int20 == 1065097791);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1993395189 + "'", int23 == 1993395189);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square(5200);
        int int14 = mathTest0.multiply((-7), 13);
        int int17 = mathTest0.subtract(217038, (-990));
        int int20 = mathTest0.divide(1046, 6502500);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27040000 + "'", int11 == 27040000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-91) + "'", int14 == (-91));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 218028 + "'", int17 == 218028);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int8 = mathTest0.square((-51));
        int int11 = mathTest0.add(0, (-1752770602));
        int int13 = mathTest0.square((-789600576));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2601 + "'", int8 == 2601);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1752770602) + "'", int11 == (-1752770602));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-954363904) + "'", int13 == (-954363904));
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square((-32969632));
        int int14 = mathTest0.add(29793758, 0);
        int int17 = mathTest0.divide(0, 36819);
        int int20 = mathTest0.add((-3580), 0);
        int int23 = mathTest0.divide(1108809, 16314474);
        int int25 = mathTest0.square(1964248753);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 541139968 + "'", int11 == 541139968);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29793758 + "'", int14 == 29793758);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-3580) + "'", int20 == (-3580));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 377476705 + "'", int25 == 377476705);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square(5200);
        int int14 = mathTest0.multiply((-7), 13);
        int int17 = mathTest0.multiply((-27034267), (-13));
        int int19 = mathTest0.square((-27046437));
        int int22 = mathTest0.divide(950697, 9700);
        int int25 = mathTest0.add(0, 0);
        int int28 = mathTest0.subtract(0, (-42304469));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27040000 + "'", int11 == 27040000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-91) + "'", int14 == (-91));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 351445471 + "'", int17 == 351445471);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-485525159) + "'", int19 == (-485525159));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 98 + "'", int22 == 98);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 42304469 + "'", int28 == 42304469);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(1290100, 9700);
        int int9 = mathTest0.divide((-3181), (-101));
        int int12 = mathTest0.multiply(2, 1024);
        int int15 = mathTest0.add(1262559999, (-1744279840));
        int int18 = mathTest0.add((-916136252), (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 133 + "'", int6 == 133);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 31 + "'", int9 == 31);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2048 + "'", int12 == 2048);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-481719841) + "'", int15 == (-481719841));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-916136220) + "'", int18 == (-916136220));
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(3232, (-3168));
        int int8 = mathTest0.square((-3232));
        int int11 = mathTest0.add(29421356, 112);
        int int14 = mathTest0.divide((int) (byte) 10, 13516830);
        int int17 = mathTest0.subtract((-805856915), 9801);
        int int19 = mathTest0.square(960400);
        int int22 = mathTest0.divide((-1724707840), (-4358677));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10445824 + "'", int8 == 10445824);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 29421468 + "'", int11 == 29421468);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-805866716) + "'", int17 == (-805866716));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1049808640) + "'", int19 == (-1049808640));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 395 + "'", int22 == 395);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
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
        int int30 = mathTest0.square(1028394660);
        int int33 = mathTest0.multiply(435603968, (-1919143167));
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-633972464) + "'", int30 == (-633972464));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1546963456 + "'", int33 == 1546963456);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.subtract((int) '#', (int) (short) 100);
        int int12 = mathTest0.divide(0, (-1021));
        int int14 = mathTest0.square((int) (byte) 10);
        int int17 = mathTest0.multiply(17689, 10036224);
        int int19 = mathTest0.square(71824);
        int int22 = mathTest0.subtract(310, 2005761053);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-65) + "'", int9 == (-65));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1437107200 + "'", int17 == 1437107200);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 863719680 + "'", int19 == 863719680);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-2005760743) + "'", int22 == (-2005760743));
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int12 = mathTest0.multiply(144, 1594884096);
        int int15 = mathTest0.divide(4356, 31);
        int int17 = mathTest0.square(461828740);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2030043136 + "'", int12 == 2030043136);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 140 + "'", int15 == 140);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1611803632) + "'", int17 == (-1611803632));
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((int) (short) -1, 36);
        int int18 = mathTest0.divide((-1488), 112);
        int int21 = mathTest0.add(29421356, (int) (byte) 100);
        int int23 = mathTest0.square((-27036766));
        int int25 = mathTest0.square(1068224201);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-13) + "'", int18 == (-13));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 29421456 + "'", int21 == 29421456);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 461828740 + "'", int23 == 461828740);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-712107567) + "'", int25 == (-712107567));
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) (short) 1);
        int int11 = mathTest0.square(935011904);
        int int14 = mathTest0.divide(326681, 299269776);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1731661824 + "'", int11 == 1731661824);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.add((-3181), (int) 'a');
        int int17 = mathTest0.subtract((-13503587), (-1118807808));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3084) + "'", int14 == (-3084));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1105304221 + "'", int17 == 1105304221);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.subtract((int) '#', (int) (short) 100);
        int int12 = mathTest0.divide(0, (-1021));
        int int14 = mathTest0.square((int) (byte) 10);
        int int17 = mathTest0.multiply(17689, 10036224);
        int int20 = mathTest0.multiply(0, (-50960));
        int int23 = mathTest0.multiply((-375664945), 29556);
        int int25 = mathTest0.square((-167544));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-65) + "'", int9 == (-65));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1437107200 + "'", int17 == 1437107200);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-662654260) + "'", int23 == (-662654260));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1993779136) + "'", int25 == (-1993779136));
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
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
        int int28 = mathTest0.divide(1741750272, 32721228);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 99 + "'", int20 == 99);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 53 + "'", int28 == 53);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.divide(0, 5200);
        int int14 = mathTest0.multiply((int) (short) 1, (int) (short) 10);
        int int17 = mathTest0.multiply((-3232), 10201);
        int int20 = mathTest0.add((-990), (-31));
        int int22 = mathTest0.square((-43));
        java.lang.Class<?> wildcardClass23 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-32969632) + "'", int17 == (-32969632));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1021) + "'", int20 == (-1021));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1849 + "'", int22 == 1849);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(12, 100);
        int int15 = mathTest0.subtract(0, (-1156));
        int int18 = mathTest0.subtract((-1), 2048);
        int int21 = mathTest0.multiply(0, 506250000);
        int int24 = mathTest0.divide(546218051, (-129702790));
        int int27 = mathTest0.add((-1700287452), 1196958246);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 112 + "'", int12 == 112);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1156 + "'", int15 == 1156);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2049) + "'", int18 == (-2049));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-4) + "'", int24 == (-4));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-503329206) + "'", int27 == (-503329206));
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(12, 100);
        int int15 = mathTest0.add(2601, (-51));
        int int18 = mathTest0.divide((-51918), 1594884096);
        int int21 = mathTest0.multiply(36, (-3243));
        int int24 = mathTest0.add((-1488), (-27046437));
        int int27 = mathTest0.divide(2738, (-1065097728));
        int int29 = mathTest0.square(863719680);
        int int32 = mathTest0.subtract(0, 1368783);
        int int35 = mathTest0.divide(97, 1046);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 112 + "'", int12 == 112);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2550 + "'", int15 == 2550);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-116748) + "'", int21 == (-116748));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-27047925) + "'", int24 == (-27047925));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-274661376) + "'", int29 == (-274661376));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1368783) + "'", int32 == (-1368783));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int11 = mathTest0.square(3232);
        int int14 = mathTest0.divide((-32), (int) (short) 1);
        int int17 = mathTest0.add(36, 1010);
        int int19 = mathTest0.square(2);
        int int22 = mathTest0.divide((-167544), 1806125505);
        int int24 = mathTest0.square(1731661824);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10445824 + "'", int11 == 10445824);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-32) + "'", int14 == (-32));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1046 + "'", int17 == 1046);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-520093696) + "'", int24 == (-520093696));
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int5 = mathTest0.square((int) (byte) 10);
        int int8 = mathTest0.add((-1488), 3190);
        int int10 = mathTest0.square(1196958246);
        int int13 = mathTest0.add((-712786789), (-1541263799));
        java.lang.Class<?> wildcardClass14 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1702 + "'", int8 == 1702);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1834082908) + "'", int10 == (-1834082908));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2040916708 + "'", int13 == 2040916708);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
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
        int int30 = mathTest0.add((-27037278), 0);
        int int33 = mathTest0.subtract(2092, 1499341);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-27037278) + "'", int30 == (-27037278));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1497249) + "'", int33 == (-1497249));
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(210, (-7));
        int int15 = mathTest0.multiply(1724707840, 2);
        int int18 = mathTest0.add((-177609871), 836855920);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 203 + "'", int12 == 203);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-845551616) + "'", int15 == (-845551616));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 659246049 + "'", int18 == 659246049);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.divide((-290), 1892067732);
        int int9 = mathTest0.add((-805857024), 163);
        int int12 = mathTest0.subtract(1346542369, 712776852);
        int int15 = mathTest0.add((-330390172), (-2126394615));
        int int18 = mathTest0.add((-40385895), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-805856861) + "'", int9 == (-805856861));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 633765517 + "'", int12 == 633765517);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1838182509 + "'", int15 == 1838182509);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-40385895) + "'", int18 == (-40385895));
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(210, (-7));
        int int15 = mathTest0.add(336318921, 763532);
        int int18 = mathTest0.divide(712775872, (int) (short) 1);
        int int21 = mathTest0.add((-83560366), (-1004464543));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 203 + "'", int12 == 203);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 337082453 + "'", int15 == 337082453);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 712775872 + "'", int18 == 712775872);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1088024909) + "'", int21 == (-1088024909));
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) ' ');
        int int12 = mathTest0.add((-1042102), 1000500);
        int int15 = mathTest0.add(336318921, 2005761053);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-41602) + "'", int12 == (-41602));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1952887322) + "'", int15 == (-1952887322));
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.add(100, (int) (short) 1);
        int int9 = mathTest0.subtract(4858344, 1962934272);
        int int12 = mathTest0.divide((-110), 99);
        int int15 = mathTest0.divide(1541910512, (-577471963));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1958075928) + "'", int9 == (-1958075928));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.subtract((int) '#', (int) (short) 100);
        int int11 = mathTest0.square(99);
        int int14 = mathTest0.subtract(12508860, (-418481920));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-65) + "'", int9 == (-65));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9801 + "'", int11 == 9801);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 430990780 + "'", int14 == 430990780);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(12, 100);
        int int15 = mathTest0.multiply(2, 1046);
        int int18 = mathTest0.add((-5486), 0);
        int int21 = mathTest0.divide((-52), 117);
        int int24 = mathTest0.multiply(1397199196, 1494149);
        int int27 = mathTest0.divide(1221323382, 3414448);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 112 + "'", int12 == 112);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2092 + "'", int15 == 2092);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-5486) + "'", int18 == (-5486));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-907291444) + "'", int24 == (-907291444));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 357 + "'", int27 == 357);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.add((-190), (int) '4');
        int int16 = mathTest0.square((int) 'a');
        int int19 = mathTest0.subtract((-1190), 950697);
        int int21 = mathTest0.square(976870045);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-138) + "'", int14 == (-138));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9409 + "'", int16 == 9409);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-951887) + "'", int19 == (-951887));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 949601353 + "'", int21 == 949601353);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.add(2092, 1494149);
        int int17 = mathTest0.square(64);
        int int20 = mathTest0.divide(1022217718, (-2720));
        int int23 = mathTest0.subtract(1702726656, (-1241513984));
        int int26 = mathTest0.subtract((-353588303), (-253929393));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1496241 + "'", int15 == 1496241);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4096 + "'", int17 == 4096);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-375815) + "'", int20 == (-375815));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1350726656) + "'", int23 == (-1350726656));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-99658910) + "'", int26 == (-99658910));
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int5 = mathTest0.square((-1735140));
        int int8 = mathTest0.add(3232, (-1156));
        int int11 = mathTest0.divide(1032656465, (-5919729));
        java.lang.Class<?> wildcardClass12 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-61254896) + "'", int5 == (-61254896));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2076 + "'", int8 == 2076);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-174) + "'", int11 == (-174));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.multiply(101, 51);
        int int17 = mathTest0.multiply(34, (-50960));
        int int19 = mathTest0.square(101);
        int int22 = mathTest0.multiply((-3181), (-135036));
        int int25 = mathTest0.divide((-32969632), (-160369452));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5151 + "'", int14 == 5151);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1732640) + "'", int17 == (-1732640));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10201 + "'", int19 == 10201);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 429549516 + "'", int22 == 429549516);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((int) (short) -1, 36);
        int int18 = mathTest0.multiply((-51), (-31));
        int int20 = mathTest0.square(1331441);
        int int23 = mathTest0.divide((-1021237618), (-1312236352));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1581 + "'", int18 == 1581);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1086356767) + "'", int20 == (-1086356767));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) (short) 1);
        int int12 = mathTest0.subtract(51, (-66));
        int int15 = mathTest0.divide(146, 3364195);
        int int18 = mathTest0.multiply(100, 1084);
        int int21 = mathTest0.add(537603088, (-45));
        int int23 = mathTest0.square(1118899305);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 117 + "'", int12 == 117);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 108400 + "'", int18 == 108400);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 537603043 + "'", int21 == 537603043);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1305215761 + "'", int23 == 1305215761);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
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
        int int29 = mathTest0.square((-372010359));
        int int32 = mathTest0.divide((-1397198556), 1881653649);
        java.lang.Class<?> wildcardClass33 = mathTest0.getClass();
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1136037201 + "'", int29 == 1136037201);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        int int20 = mathTest0.add(0, 1046);
        int int22 = mathTest0.square(19044);
        int int25 = mathTest0.multiply((-1515163), (int) (short) -1);
        int int27 = mathTest0.square(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1046 + "'", int20 == 1046);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 362673936 + "'", int22 == 362673936);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1515163 + "'", int25 == 1515163);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
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
        int int30 = mathTest0.multiply((-29338412), 712776862);
        int int33 = mathTest0.divide(1961891178, (-2049));
        int int36 = mathTest0.add((-245555519), (-212371707));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-13) + "'", int18 == (-13));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 29421456 + "'", int21 == 29421456);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1735141) + "'", int27 == (-1735141));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-743732520) + "'", int30 == (-743732520));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-957487) + "'", int33 == (-957487));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-457927226) + "'", int36 == (-457927226));
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int13 = mathTest0.square(10036224);
        int int16 = mathTest0.multiply(1336336, (-1156));
        int int19 = mathTest0.subtract((-1515163), 18974736);
        int int22 = mathTest0.divide((-3232), 1065108889);
        java.lang.Class<?> wildcardClass23 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 219152384 + "'", int13 == 219152384);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1544804416) + "'", int16 == (-1544804416));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-20489899) + "'", int19 == (-20489899));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.add(2092, 1494149);
        int int17 = mathTest0.square(1530169);
        int int20 = mathTest0.divide((-860132015), 22500);
        int int23 = mathTest0.subtract(108400, 960400);
        int int26 = mathTest0.add((-837686844), (-327155712));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1496241 + "'", int15 == 1496241);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 659992241 + "'", int17 == 659992241);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-38228) + "'", int20 == (-38228));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-852000) + "'", int23 == (-852000));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1164842556) + "'", int26 == (-1164842556));
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(3232, (-3168));
        int int9 = mathTest0.divide(5151, (-399));
        int int12 = mathTest0.divide(5200, (-32969632));
        int int14 = mathTest0.square(541139968);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-12) + "'", int9 == (-12));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1292894208 + "'", int14 == 1292894208);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int5 = mathTest0.square((-1735140));
        int int8 = mathTest0.add(3232, (-1156));
        int int11 = mathTest0.subtract(4198401, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-61254896) + "'", int5 == (-61254896));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2076 + "'", int8 == 2076);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4198401 + "'", int11 == 4198401);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int12 = mathTest0.multiply(0, 210);
        int int15 = mathTest0.divide(1500625, 4353);
        java.lang.Class<?> wildcardClass16 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 344 + "'", int15 == 344);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.add((int) (short) 1, 0);
        int int14 = mathTest0.add(51, (-3232));
        int int17 = mathTest0.subtract((-3212), (-134969827));
        int int19 = mathTest0.square((-601128));
        int int21 = mathTest0.square(77467648);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3181) + "'", int14 == (-3181));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 134966615 + "'", int17 == 134966615);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 577619520 + "'", int19 == 577619520);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1056964608) + "'", int21 == (-1056964608));
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.add((-190), (int) '4');
        int int16 = mathTest0.square((-2080374784));
        int int18 = mathTest0.square((-1414540062));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-138) + "'", int14 == (-138));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1442637948) + "'", int18 == (-1442637948));
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square((-32969632));
        int int14 = mathTest0.subtract((int) (byte) 1, (-13506830));
        int int16 = mathTest0.square(1990353832);
        int int18 = mathTest0.square(11082241);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 541139968 + "'", int11 == 541139968);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 13506831 + "'", int14 == 13506831);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 661347904 + "'", int16 == 661347904);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1475752961 + "'", int18 == 1475752961);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square(5200);
        int int14 = mathTest0.add((int) (short) 0, (-5592));
        int int16 = mathTest0.square((-810437336));
        int int18 = mathTest0.square(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27040000 + "'", int11 == 27040000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-5592) + "'", int14 == (-5592));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1316907456) + "'", int16 == (-1316907456));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(3232, (-3168));
        int int8 = mathTest0.square((-3232));
        int int11 = mathTest0.subtract((int) (byte) 100, (-63));
        int int14 = mathTest0.subtract((-63), (int) (byte) 0);
        int int17 = mathTest0.divide(1357853952, 5151);
        int int20 = mathTest0.subtract(2006064019, (-11611701));
        int int23 = mathTest0.multiply(26569, 4353);
        int int25 = mathTest0.square((-212371707));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10445824 + "'", int8 == 10445824);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 163 + "'", int11 == 163);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-63) + "'", int14 == (-63));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 263609 + "'", int17 == 263609);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2017675720 + "'", int20 == 2017675720);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 115654857 + "'", int23 == 115654857);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1698978279) + "'", int25 == (-1698978279));
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
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
        int int29 = mathTest0.subtract((-1624607648), (-851180624));
        int int31 = mathTest0.square(2499561);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-32969632) + "'", int17 == (-32969632));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1053 + "'", int20 == 1053);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-134969827) + "'", int23 == (-134969827));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 43803810 + "'", int26 == 43803810);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-773427024) + "'", int29 == (-773427024));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1372222959) + "'", int31 == (-1372222959));
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.subtract((-9103), 13516830);
        int int16 = mathTest0.square((-116748));
        int int19 = mathTest0.subtract((-64202289), 730247568);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-13525933) + "'", int14 == (-13525933));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 745193616 + "'", int16 == 745193616);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-794449857) + "'", int19 == (-794449857));
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(1581, (-13));
        int int15 = mathTest0.multiply((-3212), (-399));
        int int18 = mathTest0.subtract(4858344, 22500);
        int int21 = mathTest0.subtract(980100, 1022217718);
        int int24 = mathTest0.add((-388956160), 1581);
        int int27 = mathTest0.subtract(349175808, 104060401);
        int int29 = mathTest0.square(251699788);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1568 + "'", int12 == 1568);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1281588 + "'", int15 == 1281588);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4835844 + "'", int18 == 4835844);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1021237618) + "'", int21 == (-1021237618));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-388954579) + "'", int24 == (-388954579));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 245115407 + "'", int27 == 245115407);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1323583120 + "'", int29 == 1323583120);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int13 = mathTest0.square(22500);
        int int16 = mathTest0.multiply((-204731200), 12);
        int int19 = mathTest0.divide(470106961, 1852038144);
        int int22 = mathTest0.multiply(4700, (-31611));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 506250000 + "'", int13 == 506250000);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1838192896 + "'", int16 == 1838192896);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-148571700) + "'", int22 == (-148571700));
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int8 = mathTest0.square((-51));
        int int11 = mathTest0.divide((-3222), 112);
        int int14 = mathTest0.multiply((-506154753), (-1872780496));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2601 + "'", int8 == 2601);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-28) + "'", int11 == (-28));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-483095344) + "'", int14 == (-483095344));
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(1290100, 9700);
        int int9 = mathTest0.divide((-3181), (-101));
        int int12 = mathTest0.multiply(2, 1024);
        int int14 = mathTest0.square(0);
        int int17 = mathTest0.divide(0, (-27036775));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 133 + "'", int6 == 133);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 31 + "'", int9 == 31);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2048 + "'", int12 == 2048);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(12, 100);
        int int15 = mathTest0.multiply(2, 1046);
        int int18 = mathTest0.add((-5486), 0);
        int int21 = mathTest0.divide((-52), 117);
        int int24 = mathTest0.add(1496089, 0);
        int int27 = mathTest0.subtract(432963964, (-3069));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 112 + "'", int12 == 112);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2092 + "'", int15 == 2092);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-5486) + "'", int18 == (-5486));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1496089 + "'", int24 == 1496089);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 432967033 + "'", int27 == 432967033);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(12, 100);
        int int15 = mathTest0.multiply(2, 1046);
        int int18 = mathTest0.add((-5486), 0);
        int int21 = mathTest0.divide((-52), 117);
        int int24 = mathTest0.add(1496089, 0);
        int int27 = mathTest0.subtract(82465202, (-9545));
        int int29 = mathTest0.square(1256404656);
        java.lang.Class<?> wildcardClass30 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 112 + "'", int12 == 112);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2092 + "'", int15 == 2092);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-5486) + "'", int18 == (-5486));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1496089 + "'", int24 == 1496089);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 82474747 + "'", int27 == 82474747);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-942753536) + "'", int29 == (-942753536));
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
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
        int int28 = mathTest0.multiply(29421468, (-477470903));
        int int30 = mathTest0.square(1624610198);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 820197632 + "'", int21 == 820197632);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 11082241 + "'", int23 == 11082241);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 7398400 + "'", int25 == 7398400);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1761134724) + "'", int28 == (-1761134724));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1023151132) + "'", int30 == (-1023151132));
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        int int20 = mathTest0.add(0, 1046);
        int int22 = mathTest0.square(2031810816);
        int int24 = mathTest0.square((-483095344));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1046 + "'", int20 == 1046);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-2043609088) + "'", int22 == (-2043609088));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1643391232 + "'", int24 == 1643391232);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
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
        int int29 = mathTest0.divide(2704, (-1527529573));
        int int32 = mathTest0.multiply(0, 1456013312);
        int int34 = mathTest0.square(32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-32969632) + "'", int17 == (-32969632));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1000500 + "'", int23 == 1000500);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1892067663 + "'", int26 == 1892067663);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1024 + "'", int34 == 1024);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((int) (short) -1, 36);
        int int18 = mathTest0.multiply((-51), (-31));
        int int20 = mathTest0.square(1331441);
        int int23 = mathTest0.add((-1488), (-2006027200));
        int int26 = mathTest0.subtract((-43), (-1452215270));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1581 + "'", int18 == 1581);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1086356767) + "'", int20 == (-1086356767));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-2006028688) + "'", int23 == (-2006028688));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1452215227 + "'", int26 == 1452215227);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(1290100, 9700);
        int int9 = mathTest0.multiply(11, (-31));
        int int12 = mathTest0.divide((-2033540108), 5541);
        int int14 = mathTest0.square((-1789478103));
        int int17 = mathTest0.divide((-1192035765), 1020100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 133 + "'", int6 == 133);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-341) + "'", int9 == (-341));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-366998) + "'", int12 == (-366998));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 39906449 + "'", int14 == 39906449);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1168) + "'", int17 == (-1168));
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int8 = mathTest0.square((-51));
        int int11 = mathTest0.divide((-3222), 112);
        int int14 = mathTest0.divide((-2623), (-3212));
        int int16 = mathTest0.square((-1065096738));
        int int19 = mathTest0.add((-51918), (-388956160));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2601 + "'", int8 == 2601);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-28) + "'", int11 == (-28));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 786029700 + "'", int16 == 786029700);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-389008078) + "'", int19 == (-389008078));
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int12 = mathTest0.add(290, 2);
        int int15 = mathTest0.multiply((-13503600), (-3243));
        int int18 = mathTest0.multiply(27423396, 574619648);
        int int21 = mathTest0.divide(1354363310, 1134653696);
        int int24 = mathTest0.add(658567296, (-283351090));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 292 + "'", int12 == 292);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 842501840 + "'", int15 == 842501840);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1895825408 + "'", int18 == 1895825408);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 375216206 + "'", int24 == 375216206);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.divide(0, 5200);
        int int14 = mathTest0.multiply((int) (short) 1, (int) (short) 10);
        int int17 = mathTest0.multiply((-3232), 10201);
        int int20 = mathTest0.subtract(63, (-990));
        int int23 = mathTest0.add(112, 52);
        int int26 = mathTest0.subtract(0, 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-32969632) + "'", int17 == (-32969632));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1053 + "'", int20 == 1053);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 164 + "'", int23 == 164);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-13) + "'", int26 == (-13));
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.subtract((int) '#', (int) (short) 1);
        int int17 = mathTest0.multiply(1, (-1));
        int int20 = mathTest0.divide(5200, (-35));
        int int23 = mathTest0.multiply(1296, 1347636419);
        int int26 = mathTest0.add(113365642, (-461834226));
        int int28 = mathTest0.square(1488198601);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-148) + "'", int20 == (-148));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1514890448) + "'", int23 == (-1514890448));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-348468584) + "'", int26 == (-348468584));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1168901073 + "'", int28 == 1168901073);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.divide(0, 5200);
        int int13 = mathTest0.square(150);
        int int16 = mathTest0.multiply(0, 1208040860);
        int int19 = mathTest0.add((-27036603), 960400);
        int int21 = mathTest0.square((-5073621));
        int int24 = mathTest0.divide(27038596, 16318464);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 22500 + "'", int13 == 22500);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-26076203) + "'", int19 == (-26076203));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1891046713 + "'", int21 == 1891046713);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.add((-190), (int) '4');
        int int17 = mathTest0.divide((-4), 344);
        int int20 = mathTest0.subtract(1909243054, 1924186067);
        int int23 = mathTest0.divide((-1641194714), (-1376403583));
        int int26 = mathTest0.multiply((-709128529), (-431932144));
        int int29 = mathTest0.add(55131, (-1764640368));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-138) + "'", int14 == (-138));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-14943013) + "'", int20 == (-14943013));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-2128110096) + "'", int26 == (-2128110096));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1764585237) + "'", int29 == (-1764585237));
    }
}

