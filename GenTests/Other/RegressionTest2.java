import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        mathTest mathTest0 = new mathTest();
        int int2 = mathTest0.square((-101));
        int int5 = mathTest0.divide((-71), 19);
        int int8 = mathTest0.divide((-953401000), (-1515163));
        int int11 = mathTest0.multiply(823696656, (-29335105));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10201 + "'", int2 == 10201);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-3) + "'", int5 == (-3));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 629 + "'", int8 == 629);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 417349360 + "'", int11 == 417349360);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
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
        int int30 = mathTest0.subtract(1082021407, 2059468800);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3232) + "'", int15 == (-3232));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 31258 + "'", int18 == 31258);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-5592) + "'", int21 == (-5592));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9669 + "'", int24 == 9669);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-977447393) + "'", int30 == (-977447393));
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square(5200);
        int int14 = mathTest0.multiply((-7), 13);
        int int17 = mathTest0.multiply((-27034267), (-13));
        int int19 = mathTest0.square((-161));
        int int22 = mathTest0.multiply(15129, 102217728);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27040000 + "'", int11 == 27040000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-91) + "'", int14 == (-91));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 351445471 + "'", int17 == 351445471);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 25921 + "'", int19 == 25921);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 263780352 + "'", int22 == 263780352);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.add((int) (byte) -1, (int) '4');
        int int12 = mathTest0.subtract(150, 51);
        int int15 = mathTest0.add((int) (short) 1, 1);
        int int18 = mathTest0.multiply(0, (-980));
        int int21 = mathTest0.add((int) (byte) 10, 990);
        int int24 = mathTest0.add(0, (-1527529573));
        int int27 = mathTest0.subtract(1838192896, 1086);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 99 + "'", int12 == 99);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1000 + "'", int21 == 1000);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1527529573) + "'", int24 == (-1527529573));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1838191810 + "'", int27 == 1838191810);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.multiply(101, 51);
        int int17 = mathTest0.multiply(34, (-50960));
        int int19 = mathTest0.square(101);
        int int21 = mathTest0.square((-1653864505));
        java.lang.Class<?> wildcardClass22 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5151 + "'", int14 == 5151);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1732640) + "'", int17 == (-1732640));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10201 + "'", int19 == 10201);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1507558223) + "'", int21 == (-1507558223));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(3232, (-3168));
        int int8 = mathTest0.square((-375664945));
        int int11 = mathTest0.add((-128741376), (-293280605));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-474231967) + "'", int8 == (-474231967));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-422021981) + "'", int11 == (-422021981));
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((-32), 99);
        int int9 = mathTest0.divide((-3232), 51);
        int int11 = mathTest0.square(1046);
        int int13 = mathTest0.square(950697);
        int int16 = mathTest0.divide((-13525933), (-330390172));
        int int19 = mathTest0.subtract(408675612, (-963545038));
        int int22 = mathTest0.multiply((-747569152), (-921497201));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3168) + "'", int6 == (-3168));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-63) + "'", int9 == (-63));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1094116 + "'", int11 == 1094116);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1881653649 + "'", int13 == 1881653649);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1372220650 + "'", int19 == 1372220650);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1658912768) + "'", int22 == (-1658912768));
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(1290100, 9700);
        int int9 = mathTest0.divide((-3181), (-101));
        int int12 = mathTest0.multiply(2, 1024);
        int int15 = mathTest0.multiply((-648771056), 1679616);
        int int18 = mathTest0.multiply((-564040361), (-797466));
        int int21 = mathTest0.multiply((-395585801), (-99590));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 133 + "'", int6 == 133);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 31 + "'", int9 == 31);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2048 + "'", int12 == 2048);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1503391744) + "'", int15 == (-1503391744));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-324450262) + "'", int18 == (-324450262));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1345084618) + "'", int21 == (-1345084618));
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.add(2092, 1494149);
        int int17 = mathTest0.square(64);
        int int20 = mathTest0.divide(1022217718, (-2720));
        int int23 = mathTest0.subtract(1702726656, (-1241513984));
        int int26 = mathTest0.multiply(16318464, (-1109372839));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1496241 + "'", int15 == 1496241);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4096 + "'", int17 == 4096);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-375815) + "'", int20 == (-375815));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1350726656) + "'", int23 == (-1350726656));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 647036928 + "'", int26 == 647036928);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
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
        int int28 = mathTest0.subtract((int) '4', 1990353832);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2601 + "'", int8 == 2601);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-28) + "'", int11 == (-28));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-134969936) + "'", int14 == (-134969936));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 70071185 + "'", int16 == 70071185);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 194966016 + "'", int22 == 194966016);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-26) + "'", int25 == (-26));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1990353780) + "'", int28 == (-1990353780));
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(12, 100);
        int int15 = mathTest0.add(2601, (-51));
        int int18 = mathTest0.divide(1881653649, 34);
        int int21 = mathTest0.add(14747159, (-26076203));
        int int24 = mathTest0.subtract(150994944, 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 112 + "'", int12 == 112);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2550 + "'", int15 == 2550);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 55342754 + "'", int18 == 55342754);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-11329044) + "'", int21 == (-11329044));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 150994942 + "'", int24 == 150994942);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int8 = mathTest0.square((-51));
        int int11 = mathTest0.divide((-3222), 112);
        int int14 = mathTest0.multiply(1, (-134969936));
        int int16 = mathTest0.square(134966615);
        int int19 = mathTest0.multiply((int) (byte) 0, 1962927862);
        int int22 = mathTest0.multiply(1046, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2601 + "'", int8 == 2601);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-28) + "'", int11 == (-28));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-134969936) + "'", int14 == (-134969936));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 70071185 + "'", int16 == 70071185);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
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
        int int30 = mathTest0.multiply((-621998080), 17956);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1568 + "'", int12 == 1568);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1281588 + "'", int15 == 1281588);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4835844 + "'", int18 == 4835844);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1021237618) + "'", int21 == (-1021237618));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-388954579) + "'", int24 == (-388954579));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 245115407 + "'", int27 == 245115407);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1682554880) + "'", int30 == (-1682554880));
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(12, 100);
        int int15 = mathTest0.add(2601, (-51));
        int int18 = mathTest0.divide((-51918), 1594884096);
        int int21 = mathTest0.multiply(36, (-3243));
        int int24 = mathTest0.add((-1488), (-27046437));
        java.lang.Class<?> wildcardClass25 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 112 + "'", int12 == 112);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2550 + "'", int15 == 2550);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-116748) + "'", int21 == (-116748));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-27047925) + "'", int24 == (-27047925));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(12, 100);
        int int15 = mathTest0.add(2601, (-51));
        int int18 = mathTest0.divide(1881653649, 34);
        int int21 = mathTest0.add(28751656, 1966983424);
        int int24 = mathTest0.add(1818756672, 4189);
        int int27 = mathTest0.multiply((-807392004), 152);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 112 + "'", int12 == 112);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2550 + "'", int15 == 2550);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 55342754 + "'", int18 == 55342754);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1995735080 + "'", int21 == 1995735080);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1818760861 + "'", int24 == 1818760861);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1830466976 + "'", int27 == 1830466976);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int12 = mathTest0.add(1962934272, (-3196));
        int int15 = mathTest0.subtract((-27036603), (-27));
        int int18 = mathTest0.divide(1926281121, 420490433);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1962931076 + "'", int12 == 1962931076);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-27036576) + "'", int15 == (-27036576));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
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
        int int30 = mathTest0.add(3416061, 150);
        int int33 = mathTest0.subtract((-34), 73794752);
        java.lang.Class<?> wildcardClass34 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-35) + "'", int12 == (-35));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-101) + "'", int15 == (-101));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5100 + "'", int18 == 5100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 130 + "'", int21 == 130);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1192156252 + "'", int27 == 1192156252);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3416211 + "'", int30 == 3416211);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-73794786) + "'", int33 == (-73794786));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.multiply(101, 51);
        int int17 = mathTest0.multiply(34, (-50960));
        int int19 = mathTest0.square(101);
        int int21 = mathTest0.square(163);
        int int24 = mathTest0.multiply(4356, 10000);
        int int27 = mathTest0.multiply((-1872780496), 18931201);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5151 + "'", int14 == 5151);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1732640) + "'", int17 == (-1732640));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10201 + "'", int19 == 10201);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 26569 + "'", int21 == 26569);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 43560000 + "'", int24 == 43560000);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 367215408 + "'", int27 == 367215408);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(12, 100);
        int int15 = mathTest0.add(2601, (-51));
        int int18 = mathTest0.divide(1881653649, 34);
        int int21 = mathTest0.add(14747159, (-26076203));
        int int24 = mathTest0.multiply(150994944, 47);
        int int26 = mathTest0.square((-32678));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 112 + "'", int12 == 112);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2550 + "'", int15 == 2550);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 55342754 + "'", int18 == 55342754);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-11329044) + "'", int21 == (-11329044));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1493172224) + "'", int24 == (-1493172224));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1067851684 + "'", int26 == 1067851684);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
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
        java.lang.Class<?> wildcardClass26 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10036224 + "'", int19 == 10036224);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1237 + "'", int22 == 1237);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 40092 + "'", int25 == 40092);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int12 = mathTest0.multiply(144, 1594884096);
        int int15 = mathTest0.subtract((-992), 1042102);
        int int18 = mathTest0.divide(786029700, 1262559999);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2030043136 + "'", int12 == 2030043136);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1043094) + "'", int15 == (-1043094));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.add(100, (int) (short) 1);
        int int9 = mathTest0.divide(1581, 4353);
        int int12 = mathTest0.divide(303, 599383088);
        int int14 = mathTest0.square(1500390);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 607288996 + "'", int14 == 607288996);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int5 = mathTest0.square((int) (byte) 10);
        int int8 = mathTest0.subtract(1496241, 152);
        int int11 = mathTest0.add(101, 1);
        int int14 = mathTest0.divide(134966615, (-578834862));
        int int16 = mathTest0.square(55410);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1496089 + "'", int8 == 1496089);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 102 + "'", int11 == 102);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1224699196) + "'", int16 == (-1224699196));
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square((-32969632));
        int int13 = mathTest0.square(1581);
        int int16 = mathTest0.subtract(836855920, (-1563353761));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 541139968 + "'", int11 == 541139968);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2499561 + "'", int13 == 2499561);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1894757615) + "'", int16 == (-1894757615));
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.add((-1631068032), (-1042102));
        java.lang.Class<?> wildcardClass10 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1632110134) + "'", int9 == (-1632110134));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.divide((-290), 1892067732);
        int int8 = mathTest0.square((-50938));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1700287452) + "'", int8 == (-1700287452));
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
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
        int int30 = mathTest0.add(52, 1285912540);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1568 + "'", int12 == 1568);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1281588 + "'", int15 == 1281588);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4835844 + "'", int18 == 4835844);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1021237618) + "'", int21 == (-1021237618));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-388954579) + "'", int24 == (-388954579));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 245115407 + "'", int27 == 245115407);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1285912592 + "'", int30 == 1285912592);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.subtract(36, 3232);
        int int16 = mathTest0.square(2);
        int int19 = mathTest0.add(11, 999698);
        int int21 = mathTest0.square(64);
        int int24 = mathTest0.divide((-557188015), 10214416);
        int int27 = mathTest0.subtract(547640937, (-12));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3196) + "'", int14 == (-3196));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 999709 + "'", int19 == 999709);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4096 + "'", int21 == 4096);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-54) + "'", int24 == (-54));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 547640949 + "'", int27 == 547640949);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(3232, (-3168));
        int int8 = mathTest0.square((-3232));
        int int10 = mathTest0.square(290);
        int int12 = mathTest0.square((-3535));
        int int15 = mathTest0.subtract(1861156092, (-101578460));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10445824 + "'", int8 == 10445824);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 84100 + "'", int10 == 84100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12496225 + "'", int12 == 12496225);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1962734552 + "'", int15 == 1962734552);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
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
        int int40 = mathTest0.divide((int) '4', (-1042405));
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
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) ' ');
        int int12 = mathTest0.divide((int) (byte) 100, 36);
        int int15 = mathTest0.subtract(0, 3232);
        int int18 = mathTest0.divide(104060401, 3329);
        int int20 = mathTest0.square((-1086369187));
        int int23 = mathTest0.add(362673936, 1304336066);
        int int25 = mathTest0.square((-1174347104));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3232) + "'", int15 == (-3232));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 31258 + "'", int18 == 31258);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1782953417 + "'", int20 == 1782953417);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1667010002 + "'", int23 == 1667010002);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1218372608 + "'", int25 == 1218372608);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
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
        int int28 = mathTest0.square((-38228));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3307 + "'", int20 == 3307);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1347654771 + "'", int23 == 1347654771);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 152 + "'", int26 == 152);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1461379984 + "'", int28 == 1461379984);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.subtract((int) (short) 0, (int) '#');
        int int15 = mathTest0.subtract((-3243), (-1328271));
        int int18 = mathTest0.subtract(312881769, 10036224);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-35) + "'", int12 == (-35));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1325028 + "'", int15 == 1325028);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 302845545 + "'", int18 == 302845545);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.subtract((int) (short) 0, (int) '#');
        int int15 = mathTest0.subtract((-1), 100);
        int int18 = mathTest0.multiply((-170769751), (-3222));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-35) + "'", int12 == (-35));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-101) + "'", int15 == (-101));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 464323834 + "'", int18 == 464323834);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
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
        int int27 = mathTest0.square(122816);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10036224 + "'", int19 == 10036224);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1507558125) + "'", int22 == (-1507558125));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-27036608) + "'", int25 == (-27036608));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-2096099328) + "'", int27 == (-2096099328));
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int14 = mathTest0.square((int) '4');
        int int17 = mathTest0.subtract((-1735141), 0);
        int int20 = mathTest0.subtract(1343106793, (-662654260));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2704 + "'", int14 == 2704);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1735141) + "'", int17 == (-1735141));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2005761053 + "'", int20 == 2005761053);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.divide((-101), 2);
        int int9 = mathTest0.multiply(101, 10);
        int int12 = mathTest0.multiply(2601, (-101));
        int int15 = mathTest0.multiply(1414081664, (-1241513984));
        int int17 = mathTest0.square(1413121024);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1010 + "'", int9 == 1010);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-262701) + "'", int12 == (-262701));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 336592896 + "'", int17 == 336592896);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int11 = mathTest0.square(34);
        int int14 = mathTest0.multiply(11, 290);
        int int17 = mathTest0.divide((-951887), (-3069));
        java.lang.Class<?> wildcardClass18 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1156 + "'", int11 == 1156);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3190 + "'", int14 == 3190);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 310 + "'", int17 == 310);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.divide((-101), 2);
        int int9 = mathTest0.multiply(101, 10);
        int int12 = mathTest0.multiply(1334311154, 1334646608);
        int int15 = mathTest0.add(29421697, (-283351090));
        int int17 = mathTest0.square((-1095390208));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1010 + "'", int9 == 1010);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-584742496) + "'", int12 == (-584742496));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-253929393) + "'", int15 == (-253929393));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1416626176) + "'", int17 == (-1416626176));
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(12, 100);
        int int15 = mathTest0.add(2601, (-51));
        int int18 = mathTest0.divide(1881653649, 34);
        int int21 = mathTest0.add(14747159, (-26076203));
        int int24 = mathTest0.divide((-27037278), (-2126394615));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 112 + "'", int12 == 112);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2550 + "'", int15 == 2550);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 55342754 + "'", int18 == 55342754);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-11329044) + "'", int21 == (-11329044));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.add(100, (int) (short) 1);
        int int9 = mathTest0.subtract(4858344, 1962934272);
        int int12 = mathTest0.divide(1724707840, 842349056);
        int int15 = mathTest0.subtract(0, 1822263184);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1958075928) + "'", int9 == (-1958075928));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1822263184) + "'", int15 == (-1822263184));
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int12 = mathTest0.add(1962934272, (-3196));
        int int15 = mathTest0.multiply(1156, (-946400));
        int int18 = mathTest0.divide((-124), (-375815));
        int int20 = mathTest0.square(356075520);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1962931076 + "'", int12 == 1962931076);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1094038400) + "'", int15 == (-1094038400));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 608174080 + "'", int20 == 608174080);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.subtract((int) (short) -1, (int) (short) 100);
        int int17 = mathTest0.add(1962934338, (int) (byte) 0);
        int int19 = mathTest0.square(10857025);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-101) + "'", int14 == (-101));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1962934338 + "'", int17 == 1962934338);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-385588095) + "'", int19 == (-385588095));
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
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
        int int36 = mathTest0.square(1354363310);
        int int39 = mathTest0.subtract(1032524761, (-42304469));
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-240840124) + "'", int36 == (-240840124));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1074829230 + "'", int39 == 1074829230);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.subtract((int) '#', (int) (short) 1);
        int int16 = mathTest0.square((-6620096));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-175239168) + "'", int16 == (-175239168));
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.add((int) (byte) -1, (int) '4');
        int int12 = mathTest0.subtract(150, 51);
        int int15 = mathTest0.add((int) (short) 1, 1);
        int int18 = mathTest0.multiply((-148), (-124));
        int int21 = mathTest0.subtract((int) (byte) -1, (-805857024));
        int int24 = mathTest0.add(1425784004, 961);
        int int27 = mathTest0.subtract((-664364185), (-9254698));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 99 + "'", int12 == 99);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 18352 + "'", int18 == 18352);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 805857023 + "'", int21 == 805857023);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1425784965 + "'", int24 == 1425784965);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-655109487) + "'", int27 == (-655109487));
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
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
        int int29 = mathTest0.divide(3232, (-14756608));
        int int32 = mathTest0.add((-1623938746), (-18339));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-9103) + "'", int23 == (-9103));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1515163 + "'", int26 == 1515163);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1623957085) + "'", int32 == (-1623957085));
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.add(2092, 1494149);
        int int17 = mathTest0.square(64);
        int int20 = mathTest0.multiply(1324965, 134966615);
        int int23 = mathTest0.divide(1913903360, (-295593424));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1496241 + "'", int15 == 1496241);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4096 + "'", int17 == 4096);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 782707219 + "'", int20 == 782707219);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-6) + "'", int23 == (-6));
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.add((int) (byte) -1, (int) '4');
        int int12 = mathTest0.multiply((int) 'a', (int) (short) 100);
        int int15 = mathTest0.subtract((-27036768), 3329);
        int int18 = mathTest0.subtract((-1958075928), (-28));
        int int21 = mathTest0.multiply((-134969827), 1174437505);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9700 + "'", int12 == 9700);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-27040097) + "'", int15 == (-27040097));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1958075900) + "'", int18 == (-1958075900));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 976870045 + "'", int21 == 976870045);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int8 = mathTest0.square((-51));
        int int11 = mathTest0.divide((-3222), 112);
        int int14 = mathTest0.divide((-2623), (-3212));
        int int17 = mathTest0.divide(3307, (-135036));
        int int20 = mathTest0.subtract((-138), (-855675904));
        int int22 = mathTest0.square(218028);
        int int25 = mathTest0.multiply(0, (-903845632));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2601 + "'", int8 == 2601);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-28) + "'", int11 == (-28));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 855675766 + "'", int20 == 855675766);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 291568528 + "'", int22 == 291568528);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.multiply(101, 51);
        int int17 = mathTest0.divide((-65), (-295593424));
        int int20 = mathTest0.add(0, 4700);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5151 + "'", int14 == 5151);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4700 + "'", int20 == 4700);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
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
        int int32 = mathTest0.add(0, 980100);
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 980100 + "'", int32 == 980100);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.add((int) (short) 1, 0);
        int int14 = mathTest0.multiply((-399), 1156);
        int int17 = mathTest0.divide(148155, 52);
        int int20 = mathTest0.divide((-3222), (-12));
        int int23 = mathTest0.add(1340487425, (-1664876544));
        int int26 = mathTest0.add(0, (-1488));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-461244) + "'", int14 == (-461244));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2849 + "'", int17 == 2849);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 268 + "'", int20 == 268);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-324389119) + "'", int23 == (-324389119));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1488) + "'", int26 == (-1488));
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.add(100, (int) (short) 1);
        int int9 = mathTest0.subtract(0, 0);
        int int12 = mathTest0.subtract(36819, (-2006027200));
        int int15 = mathTest0.multiply(344, (-969912802));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2006064019 + "'", int12 == 2006064019);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1357445200 + "'", int15 == 1357445200);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.divide(1496241, 10201);
        int int15 = mathTest0.divide(11161, 1);
        int int18 = mathTest0.subtract((int) (byte) -1, 1962934272);
        int int21 = mathTest0.multiply(2849, 268);
        int int24 = mathTest0.subtract(18, (-2720));
        int int27 = mathTest0.add((-1872814751), (-1515163));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 146 + "'", int12 == 146);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11161 + "'", int15 == 11161);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1962934273) + "'", int18 == (-1962934273));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 763532 + "'", int21 == 763532);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2738 + "'", int24 == 2738);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1874329914) + "'", int27 == (-1874329914));
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
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
        int int35 = mathTest0.multiply(249987721, 1362701056);
        int int37 = mathTest0.square(0);
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 560857856 + "'", int35 == 560857856);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.subtract((int) (short) 0, (int) '#');
        int int15 = mathTest0.subtract((-1), 100);
        int int18 = mathTest0.add(5151, (-51));
        int int21 = mathTest0.divide(27040000, (-1086356767));
        int int23 = mathTest0.square((-698049148));
        int int26 = mathTest0.subtract((-980), 1437107200);
        java.lang.Class<?> wildcardClass27 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-35) + "'", int12 == (-35));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-101) + "'", int15 == (-101));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5100 + "'", int18 == 5100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 537603088 + "'", int23 == 537603088);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1437108180) + "'", int26 == (-1437108180));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.add((int) (byte) -1, (int) '4');
        int int12 = mathTest0.subtract(150, 51);
        int int15 = mathTest0.add((int) (short) 1, 1);
        int int17 = mathTest0.square((-2088632759));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 99 + "'", int12 == 99);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-131665711) + "'", int17 == (-131665711));
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) (short) 1);
        int int12 = mathTest0.subtract(51, (-66));
        int int15 = mathTest0.multiply((-990), 99);
        int int18 = mathTest0.multiply(115, 47);
        int int21 = mathTest0.subtract(1638973851, 49);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 117 + "'", int12 == 117);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-98010) + "'", int15 == (-98010));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5405 + "'", int18 == 5405);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1638973802 + "'", int21 == 1638973802);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.divide(0, 5200);
        int int14 = mathTest0.multiply((int) (short) 1, (int) (short) 10);
        int int17 = mathTest0.multiply((-3232), 10201);
        int int20 = mathTest0.divide(22500, 10445824);
        int int23 = mathTest0.multiply(546218051, 999988);
        java.lang.Class<?> wildcardClass24 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-32969632) + "'", int17 == (-32969632));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-969485412) + "'", int23 == (-969485412));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square(5200);
        int int14 = mathTest0.add((int) (short) 0, (-5592));
        java.lang.Class<?> wildcardClass15 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27040000 + "'", int11 == 27040000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-5592) + "'", int14 == (-5592));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add(52, (-3295));
        int int6 = mathTest0.multiply(1200, (-124));
        int int9 = mathTest0.subtract(122816, 24389000);
        int int12 = mathTest0.subtract(1208040860, 11082614);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3243) + "'", int3 == (-3243));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-148800) + "'", int6 == (-148800));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-24266184) + "'", int9 == (-24266184));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1196958246 + "'", int12 == 1196958246);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
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
        int int32 = mathTest0.multiply(29833266, 1174437474);
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1743527716 + "'", int32 == 1743527716);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.multiply(101, 51);
        int int17 = mathTest0.subtract(1, (-1));
        int int19 = mathTest0.square(961);
        int int21 = mathTest0.square((-32969632));
        int int24 = mathTest0.add(82465202, (-4537));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5151 + "'", int14 == 5151);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 923521 + "'", int19 == 923521);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 541139968 + "'", int21 == 541139968);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 82460665 + "'", int24 == 82460665);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
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
        int int28 = mathTest0.add(198988216, 1806128354);
        int int31 = mathTest0.add(29833266, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3307 + "'", int20 == 3307);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-601128) + "'", int23 == (-601128));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 526377984 + "'", int25 == 526377984);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2005116570 + "'", int28 == 2005116570);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 29833266 + "'", int31 == 29833266);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.multiply(10445824, 10445824);
        int int12 = mathTest0.divide(2704, (-5681));
        int int14 = mathTest0.square(712775872);
        int int17 = mathTest0.subtract(12124646, 17960388);
        int int20 = mathTest0.subtract(767974712, (-2130088743));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1594884096 + "'", int9 == 1594884096);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-60518400) + "'", int14 == (-60518400));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-5835742) + "'", int17 == (-5835742));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1396903841) + "'", int20 == (-1396903841));
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((int) (short) -1, 36);
        int int18 = mathTest0.divide((-1488), 112);
        int int21 = mathTest0.add(29421356, (int) (byte) 100);
        int int23 = mathTest0.square((-27036766));
        int int26 = mathTest0.add((-1094038400), 1407);
        int int29 = mathTest0.multiply(1002835753, 29793758);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-13) + "'", int18 == (-13));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 29421456 + "'", int21 == 29421456);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 461828740 + "'", int23 == 461828740);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1094036993) + "'", int26 == (-1094036993));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 801327758 + "'", int29 == 801327758);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.subtract((int) '#', (int) (short) 100);
        int int12 = mathTest0.divide(0, (-1021));
        int int14 = mathTest0.square((int) (byte) 10);
        int int17 = mathTest0.subtract(1024, 11612725);
        int int20 = mathTest0.divide((-124), 1237);
        int int22 = mathTest0.square((-736161692));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-65) + "'", int9 == (-65));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-11611701) + "'", int17 == (-11611701));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1723554032) + "'", int22 == (-1723554032));
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        mathTest mathTest0 = new mathTest();
        int int2 = mathTest0.square((-101));
        int int5 = mathTest0.multiply(1594884096, (-29422512));
        int int8 = mathTest0.divide((-32969632), (-3295));
        int int11 = mathTest0.divide(2499561, 3329);
        int int14 = mathTest0.add(27426628, 1962924603);
        int int17 = mathTest0.multiply(11082241, 923);
        int int20 = mathTest0.divide(11082241, 1966983424);
        int int22 = mathTest0.square(1020100);
        int int24 = mathTest0.square(1964248753);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10201 + "'", int2 == 10201);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1962934272 + "'", int5 == 1962934272);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10005 + "'", int8 == 10005);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 750 + "'", int11 == 750);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1990351231 + "'", int14 == 1990351231);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1638973851 + "'", int17 == 1638973851);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1221924368 + "'", int22 == 1221924368);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 377476705 + "'", int24 == 377476705);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.subtract(36, 3232);
        int int16 = mathTest0.square(2);
        int int19 = mathTest0.multiply(1719912448, (int) (byte) 10);
        int int22 = mathTest0.multiply((-1135868924), (-1678697856));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3196) + "'", int14 == (-3196));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 19255296 + "'", int19 == 19255296);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 305031680 + "'", int22 == 305031680);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.add((int) (byte) -1, (int) '4');
        int int12 = mathTest0.subtract(150, 51);
        int int15 = mathTest0.add(1347654771, 15046285);
        int int18 = mathTest0.divide((-27036777), (-28542678));
        int int20 = mathTest0.square(109330155);
        int int23 = mathTest0.subtract((-1637540284), 1325028);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 99 + "'", int12 == 99);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1362701056 + "'", int15 == 1362701056);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-171004999) + "'", int20 == (-171004999));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1638865312) + "'", int23 == (-1638865312));
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.multiply(101, 51);
        int int17 = mathTest0.multiply(34, (-50960));
        java.lang.Class<?> wildcardClass18 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5151 + "'", int14 == 5151);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1732640) + "'", int17 == (-1732640));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int8 = mathTest0.square((-51));
        int int11 = mathTest0.subtract(100, (-190));
        int int14 = mathTest0.divide((-66), (-63));
        int int16 = mathTest0.square(0);
        int int19 = mathTest0.multiply((-123), 0);
        int int22 = mathTest0.divide((-7), (-461244));
        int int25 = mathTest0.multiply((-30022584), 4399);
        int int28 = mathTest0.subtract((-357), 781646446);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2601 + "'", int8 == 2601);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 290 + "'", int11 == 290);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1074639160 + "'", int25 == 1074639160);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-781646803) + "'", int28 == (-781646803));
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.divide(0, 5200);
        int int14 = mathTest0.multiply((int) (short) 1, (int) (short) 10);
        int int17 = mathTest0.multiply((-3232), 10201);
        int int20 = mathTest0.subtract(63, (-990));
        int int23 = mathTest0.add(3307, 1046);
        int int26 = mathTest0.subtract((-3990), 1208992799);
        int int29 = mathTest0.add((-712786789), (-1678697856));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-32969632) + "'", int17 == (-32969632));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1053 + "'", int20 == 1053);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4353 + "'", int23 == 4353);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1208996789) + "'", int26 == (-1208996789));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1903482651 + "'", int29 == 1903482651);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
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
        int int29 = mathTest0.divide(26877952, 11988424);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-32969632) + "'", int17 == (-32969632));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1053 + "'", int20 == 1053);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-134969827) + "'", int23 == (-134969827));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 43803810 + "'", int26 == 43803810);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        mathTest mathTest0 = new mathTest();
        int int2 = mathTest0.square(0);
        int int5 = mathTest0.multiply(1208992747, (-1988513369));
        int int8 = mathTest0.divide(12119495, (-1035983359));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1171343693 + "'", int5 == 1171343693);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.multiply(101, 51);
        int int17 = mathTest0.multiply(34, (-50960));
        int int19 = mathTest0.square(101);
        int int22 = mathTest0.multiply((-65), (-3212));
        int int25 = mathTest0.divide(272870032, 461828740);
        int int28 = mathTest0.multiply(17689, 29421468);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5151 + "'", int14 == 5151);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1732640) + "'", int17 == (-1732640));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10201 + "'", int19 == 10201);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 208780 + "'", int22 == 208780);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 745304636 + "'", int28 == 745304636);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.add((int) (short) 1, 0);
        int int14 = mathTest0.add(51, (-3232));
        int int17 = mathTest0.add(1500625, (-6476));
        int int20 = mathTest0.multiply((-12), (-1042405));
        int int23 = mathTest0.multiply((-13506830), 4353);
        int int26 = mathTest0.multiply((-805866716), (-1086347664));
        int int29 = mathTest0.add(43560000, 784);
        java.lang.Class<?> wildcardClass30 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3181) + "'", int14 == (-3181));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1494149 + "'", int17 == 1494149);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 12508860 + "'", int20 == 12508860);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1334311154 + "'", int23 == 1334311154);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1563969600) + "'", int26 == (-1563969600));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 43560784 + "'", int29 == 43560784);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
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
        int int39 = mathTest0.add(1494149, 2550);
        int int42 = mathTest0.subtract(4835844, 43560000);
        int int44 = mathTest0.square((-134974900));
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1496699 + "'", int39 == 1496699);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-38724156) + "'", int42 == (-38724156));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1142438256) + "'", int44 == (-1142438256));
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.divide(1496241, 10201);
        int int15 = mathTest0.divide(11161, 1);
        int int18 = mathTest0.subtract((int) (byte) -1, 1962934272);
        int int20 = mathTest0.square(117);
        int int23 = mathTest0.add((-805857024), (-13));
        int int26 = mathTest0.subtract(52229, (-61));
        int int29 = mathTest0.subtract(2738, (-175239168));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 146 + "'", int12 == 146);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11161 + "'", int15 == 11161);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1962934273) + "'", int18 == (-1962934273));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 13689 + "'", int20 == 13689);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-805857037) + "'", int23 == (-805857037));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52290 + "'", int26 == 52290);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 175241906 + "'", int29 == 175241906);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.add((int) (byte) -1, (int) '4');
        int int12 = mathTest0.multiply(1095024016, 960400);
        int int15 = mathTest0.add(0, (-858242532));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-332164864) + "'", int12 == (-332164864));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-858242532) + "'", int15 == (-858242532));
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.multiply(101, 51);
        int int17 = mathTest0.multiply(34, (-50960));
        int int19 = mathTest0.square(101);
        int int21 = mathTest0.square(163);
        int int24 = mathTest0.multiply(4356, 10000);
        int int27 = mathTest0.subtract(745193616, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5151 + "'", int14 == 5151);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1732640) + "'", int17 == (-1732640));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10201 + "'", int19 == 10201);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 26569 + "'", int21 == 26569);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 43560000 + "'", int24 == 43560000);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 745193616 + "'", int27 == 745193616);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((-32), 99);
        int int9 = mathTest0.divide((int) (short) 0, (int) (short) 100);
        int int12 = mathTest0.add((-3295), (-3181));
        int int15 = mathTest0.divide((-1086369187), 2030043136);
        java.lang.Class<?> wildcardClass16 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3168) + "'", int6 == (-3168));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6476) + "'", int12 == (-6476));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        mathTest mathTest0 = new mathTest();
        int int2 = mathTest0.square((-101));
        int int5 = mathTest0.multiply(1594884096, (-29422512));
        int int8 = mathTest0.divide((-32969632), (-3295));
        int int11 = mathTest0.divide(2499561, 3329);
        int int14 = mathTest0.add(27426628, 1962924603);
        int int17 = mathTest0.multiply(11082241, 923);
        int int20 = mathTest0.divide(11082241, 1966983424);
        int int22 = mathTest0.square(1020100);
        java.lang.Class<?> wildcardClass23 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10201 + "'", int2 == 10201);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1962934272 + "'", int5 == 1962934272);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10005 + "'", int8 == 10005);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 750 + "'", int11 == 750);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1990351231 + "'", int14 == 1990351231);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1638973851 + "'", int17 == 1638973851);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1221924368 + "'", int22 == 1221924368);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.subtract(36, 3232);
        int int17 = mathTest0.subtract((-3181), 2500);
        int int20 = mathTest0.multiply(0, (-1208038011));
        int int23 = mathTest0.add(1357853952, (-287969728));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3196) + "'", int14 == (-3196));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-5681) + "'", int17 == (-5681));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1069884224 + "'", int23 == 1069884224);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int14 = mathTest0.square(0);
        int int16 = mathTest0.square(5200);
        int int19 = mathTest0.subtract(5100, 0);
        int int22 = mathTest0.add((-474231967), 81441024);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 27040000 + "'", int16 == 27040000);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5100 + "'", int19 == 5100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-392790943) + "'", int22 == (-392790943));
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) (short) 1);
        int int12 = mathTest0.subtract(51, (-66));
        int int15 = mathTest0.divide(1614374000, (-1563961972));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 117 + "'", int12 == 117);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.subtract(36, 3232);
        int int16 = mathTest0.square((-366998));
        int int19 = mathTest0.subtract(0, 1120946724);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3196) + "'", int14 == (-3196));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1543545828 + "'", int16 == 1543545828);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1120946724) + "'", int19 == (-1120946724));
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(5200, (-341));
        int int20 = mathTest0.divide(1065850401, 1099748687);
        int int23 = mathTest0.subtract(1168561, (-1038315520));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5541 + "'", int17 == 5541);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1039484081 + "'", int23 == 1039484081);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int5 = mathTest0.square((-1735140));
        int int8 = mathTest0.subtract(0, (-1042102));
        int int11 = mathTest0.multiply(1262559999, 210);
        int int13 = mathTest0.square(923);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-61254896) + "'", int5 == (-61254896));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1042102 + "'", int8 == 1042102);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1150372562) + "'", int11 == (-1150372562));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 851929 + "'", int13 == 851929);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
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
        java.lang.Class<?> wildcardClass31 = mathTest0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((-1), (-50));
        int int18 = mathTest0.subtract(429549516, 0);
        int int20 = mathTest0.square((-30022584));
        int int23 = mathTest0.divide((-28), 10036323);
        int int25 = mathTest0.square(583058802);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 429549516 + "'", int18 == 429549516);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 828396608 + "'", int20 == 828396608);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 189310660 + "'", int25 == 189310660);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(12, 100);
        int int15 = mathTest0.multiply(2, 1046);
        int int18 = mathTest0.add((-5486), 0);
        int int21 = mathTest0.divide((-52), 117);
        int int24 = mathTest0.multiply(1397199196, 1494149);
        int int26 = mathTest0.square(1964259238);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 112 + "'", int12 == 112);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2092 + "'", int15 == 2092);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-5486) + "'", int18 == (-5486));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-907291444) + "'", int24 == (-907291444));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2047393700 + "'", int26 == 2047393700);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int5 = mathTest0.square((int) (byte) 10);
        int int7 = mathTest0.square((-101));
        int int10 = mathTest0.multiply(3329, (-399));
        int int13 = mathTest0.multiply((-101), 1336336);
        int int16 = mathTest0.divide((-648771056), (-805856915));
        int int19 = mathTest0.subtract(1702726656, 1867490);
        int int22 = mathTest0.subtract(13689, 69033050);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10201 + "'", int7 == 10201);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1328271) + "'", int10 == (-1328271));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-134969936) + "'", int13 == (-134969936));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1700859166 + "'", int19 == 1700859166);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-69019361) + "'", int22 == (-69019361));
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
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
        int int33 = mathTest0.add(249987721, 377476705);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 627464426 + "'", int33 == 627464426);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.subtract((int) '#', (int) (short) 1);
        int int17 = mathTest0.multiply(1, (-1));
        int int19 = mathTest0.square((-3168));
        int int21 = mathTest0.square(1351683014);
        int int23 = mathTest0.square(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10036224 + "'", int19 == 10036224);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 383163684 + "'", int21 == 383163684);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int5 = mathTest0.square((-1735140));
        int int8 = mathTest0.add(3232, (-1156));
        int int11 = mathTest0.subtract(467620268, (-2006027200));
        int int14 = mathTest0.add((-1086347664), 1255298511);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-61254896) + "'", int5 == (-61254896));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2076 + "'", int8 == 2076);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1821319828) + "'", int11 == (-1821319828));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 168950847 + "'", int14 == 168950847);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.divide((-1475797728), (-698049148));
        int int5 = mathTest0.square((-1878499328));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 603979776 + "'", int5 == 603979776);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.add(2030043136, 32721228);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2062764364 + "'", int14 == 2062764364);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((-32), 99);
        int int9 = mathTest0.divide((-3232), 51);
        int int12 = mathTest0.subtract(34, (int) (short) 100);
        int int15 = mathTest0.subtract((int) (byte) -1, (int) (byte) 0);
        int int17 = mathTest0.square((-781697343));
        int int20 = mathTest0.subtract(198988216, 168950847);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3168) + "'", int6 == (-3168));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-63) + "'", int9 == (-63));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-66) + "'", int12 == (-66));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 775032193 + "'", int17 == 775032193);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 30037369 + "'", int20 == 30037369);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.add((int) (byte) -1, (int) '4');
        int int12 = mathTest0.subtract(150, 51);
        int int15 = mathTest0.add((int) (short) 1, 1);
        int int18 = mathTest0.multiply(0, (-980));
        int int21 = mathTest0.add(1838192896, 36819);
        int int24 = mathTest0.divide(730247568, 1007709282);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 99 + "'", int12 == 99);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1838229715 + "'", int21 == 1838229715);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square(5200);
        int int14 = mathTest0.add((int) (short) 0, (-5592));
        int int16 = mathTest0.square((-810437336));
        int int19 = mathTest0.divide((-94292389), 763532);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27040000 + "'", int11 == 27040000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-5592) + "'", int14 == (-5592));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1316907456) + "'", int16 == (-1316907456));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-123) + "'", int19 == (-123));
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.add((int) (byte) -1, (int) '4');
        int int12 = mathTest0.multiply((int) 'a', (int) (short) 100);
        int int15 = mathTest0.subtract((-27036768), 3329);
        int int18 = mathTest0.multiply(0, (-2));
        int int21 = mathTest0.add(64, (-65));
        int int24 = mathTest0.add((-506154753), 99);
        int int27 = mathTest0.add((-3069), (-892976127));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9700 + "'", int12 == 9700);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-27040097) + "'", int15 == (-27040097));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-506154654) + "'", int24 == (-506154654));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-892979196) + "'", int27 == (-892979196));
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
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
        int int32 = mathTest0.add((-13503535), 1962930943);
        int int35 = mathTest0.add(2076, 2005938200);
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1949427408 + "'", int32 == 1949427408);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2005940276 + "'", int35 == 2005940276);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
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
        int int29 = mathTest0.divide(560857856, 1838229715);
        int int32 = mathTest0.add((-1821319828), 302802435);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-13) + "'", int18 == (-13));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 29421456 + "'", int21 == 29421456);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 461828740 + "'", int23 == 461828740);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1738957824 + "'", int26 == 1738957824);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1518517393) + "'", int32 == (-1518517393));
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add((int) (byte) 10, (-3232));
        int int15 = mathTest0.add((-3243), 31);
        int int18 = mathTest0.divide((-7), 144);
        int int21 = mathTest0.multiply((-29422522), 112);
        int int23 = mathTest0.square(4);
        int int25 = mathTest0.square(9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3222) + "'", int12 == (-3222));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3212) + "'", int15 == (-3212));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 999644832 + "'", int21 == 999644832);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 16 + "'", int23 == 16);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 81 + "'", int25 == 81);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(5200, (-341));
        int int20 = mathTest0.subtract((-2), 990);
        int int23 = mathTest0.add(9113164, 2499561);
        int int26 = mathTest0.divide((-989855744), 15);
        int int29 = mathTest0.divide(1032524761, (-1654124668));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5541 + "'", int17 == 5541);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-992) + "'", int20 == (-992));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 11612725 + "'", int23 == 11612725);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-65990382) + "'", int26 == (-65990382));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.subtract(36, 3232);
        int int16 = mathTest0.square(2);
        int int19 = mathTest0.add(11, 999698);
        int int22 = mathTest0.divide(198988216, (-1845642241));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3196) + "'", int14 == (-3196));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 999709 + "'", int19 == 999709);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.subtract((int) (short) 0, (int) '#');
        int int15 = mathTest0.subtract((-1), 100);
        int int18 = mathTest0.add((-990), (-32));
        int int21 = mathTest0.add(461828740, (-27037278));
        int int23 = mathTest0.square(3299872);
        int int26 = mathTest0.subtract((-905615879), 205537);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-35) + "'", int12 == (-35));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-101) + "'", int15 == (-101));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1022) + "'", int18 == (-1022));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 434791462 + "'", int21 == 434791462);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1413121024 + "'", int23 == 1413121024);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-905821416) + "'", int26 == (-905821416));
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.add((int) (short) 1, 0);
        int int14 = mathTest0.add(51, (-3232));
        int int17 = mathTest0.subtract((-3222), 100);
        int int19 = mathTest0.square(1638973851);
        int int22 = mathTest0.add(34225092, 805857023);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3181) + "'", int14 == (-3181));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-3322) + "'", int17 == (-3322));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1032524761 + "'", int19 == 1032524761);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 840082115 + "'", int22 == 840082115);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        mathTest mathTest0 = new mathTest();
        int int2 = mathTest0.square((-101));
        int int5 = mathTest0.multiply(5448241, (-1544804416));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10201 + "'", int2 == 10201);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1598350400) + "'", int5 == (-1598350400));
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.multiply(101, 51);
        int int17 = mathTest0.multiply(34, (-50960));
        int int19 = mathTest0.square(101);
        int int22 = mathTest0.multiply((-3181), (-135036));
        int int25 = mathTest0.multiply(31258, (-1174347104));
        java.lang.Class<?> wildcardClass26 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5151 + "'", int14 == 5151);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1732640) + "'", int17 == (-1732640));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10201 + "'", int19 == 10201);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 429549516 + "'", int22 == 429549516);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1343702080 + "'", int25 == 1343702080);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int11 = mathTest0.square(3232);
        int int14 = mathTest0.divide((-32), (int) (short) 1);
        int int17 = mathTest0.add(36, 1010);
        int int20 = mathTest0.divide((-51), (-1740241));
        int int22 = mathTest0.square(49);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10445824 + "'", int11 == 10445824);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-32) + "'", int14 == (-32));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1046 + "'", int17 == 1046);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2401 + "'", int22 == 2401);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square(5200);
        int int14 = mathTest0.add((int) (short) 0, (-5592));
        int int16 = mathTest0.square((-810437336));
        int int19 = mathTest0.multiply(1500625, (-27046437));
        int int22 = mathTest0.subtract(461883871, 67760);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27040000 + "'", int11 == 27040000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-5592) + "'", int14 == (-5592));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1316907456) + "'", int16 == (-1316907456));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 881424075 + "'", int19 == 881424075);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 461816111 + "'", int22 == 461816111);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square((-32969632));
        int int14 = mathTest0.subtract((int) (short) 10, (-1190));
        int int17 = mathTest0.divide(750, 52229);
        int int20 = mathTest0.add((-1222171648), 28774156);
        int int22 = mathTest0.square((-1735141));
        int int25 = mathTest0.multiply(1496152, 133);
        int int27 = mathTest0.square(19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 541139968 + "'", int11 == 541139968);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1200 + "'", int14 == 1200);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1193397492) + "'", int20 == (-1193397492));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-57784615) + "'", int22 == (-57784615));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 198988216 + "'", int25 == 198988216);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 361 + "'", int27 == 361);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
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
        int int39 = mathTest0.add(1494149, 2550);
        int int42 = mathTest0.subtract((-134969827), 5041);
        int int45 = mathTest0.subtract((-923619184), 11082614);
        int int47 = mathTest0.square((-19718481));
        java.lang.Class<?> wildcardClass48 = mathTest0.getClass();
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1496699 + "'", int39 == 1496699);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-134974868) + "'", int42 == (-134974868));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-934701798) + "'", int45 == (-934701798));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-601392223) + "'", int47 == (-601392223));
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int11 = mathTest0.square(3232);
        int int14 = mathTest0.divide((-32), (int) (short) 1);
        int int17 = mathTest0.add(36, 1010);
        int int20 = mathTest0.multiply((-1452215270), 15046285);
        java.lang.Class<?> wildcardClass21 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10445824 + "'", int11 == 10445824);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-32) + "'", int14 == (-32));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1046 + "'", int17 == 1046);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-578834862) + "'", int20 == (-578834862));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
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
        int int28 = mathTest0.multiply(1953321121, 11082582);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5151 + "'", int14 == 5151);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1732640) + "'", int17 == (-1732640));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10201 + "'", int19 == 10201);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 208780 + "'", int22 == 208780);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-561835754) + "'", int28 == (-561835754));
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
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
        int int33 = mathTest0.multiply((-823), 730247568);
        int int36 = mathTest0.subtract(87, 5405);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 301672976 + "'", int33 == 301672976);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-5318) + "'", int36 == (-5318));
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int14 = mathTest0.square((int) '4');
        int int17 = mathTest0.subtract((-1735141), 0);
        int int20 = mathTest0.add((-2033540108), (-923619184));
        java.lang.Class<?> wildcardClass21 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2704 + "'", int14 == 2704);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1735141) + "'", int17 == (-1735141));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1337808004 + "'", int20 == 1337808004);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int5 = mathTest0.square((int) (byte) 10);
        int int8 = mathTest0.add((-1488), 3190);
        int int11 = mathTest0.multiply((-1042405), 2500);
        int int14 = mathTest0.add(3364195, 1494149);
        int int17 = mathTest0.divide((-27036775), 1849);
        int int20 = mathTest0.subtract(0, (-1682554880));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1702 + "'", int8 == 1702);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1688954796 + "'", int11 == 1688954796);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4858344 + "'", int14 == 4858344);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-14622) + "'", int17 == (-14622));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1682554880 + "'", int20 == 1682554880);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.add((-190), (int) '4');
        int int16 = mathTest0.square((int) 'a');
        int int18 = mathTest0.square(13516830);
        int int20 = mathTest0.square(2550);
        int int23 = mathTest0.divide((-1830389488), (-1493172224));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-138) + "'", int14 == (-138));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9409 + "'", int16 == 9409);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1079444356 + "'", int18 == 1079444356);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6502500 + "'", int20 == 6502500);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        int int20 = mathTest0.multiply((int) (byte) 0, (-1));
        int int23 = mathTest0.divide((-29422522), 3232);
        int int26 = mathTest0.subtract(12116872, (-3322));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-9103) + "'", int23 == (-9103));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 12120194 + "'", int26 == 12120194);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
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
        int int28 = mathTest0.square((-2623));
        int int31 = mathTest0.subtract(1861148465, (-65));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-32969632) + "'", int17 == (-32969632));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1000500 + "'", int23 == 1000500);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 312899521 + "'", int26 == 312899521);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 6880129 + "'", int28 == 6880129);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1861148530 + "'", int31 == 1861148530);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.subtract(1357853952, 14747159);
        int int17 = mathTest0.divide(1065850401, (-32));
        int int20 = mathTest0.multiply(1962931076, (-13));
        int int23 = mathTest0.multiply((-1328271), 1515163);
        int int25 = mathTest0.square((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1343106793 + "'", int14 == 1343106793);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-33307825) + "'", int17 == (-33307825));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 251699788 + "'", int20 == 251699788);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1792588651 + "'", int23 == 1792588651);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.add(100, (int) (short) 1);
        int int9 = mathTest0.subtract(0, 0);
        int int11 = mathTest0.square(12);
        int int14 = mathTest0.subtract((-1156), (-29422512));
        int int17 = mathTest0.add(1325028, (-63));
        int int19 = mathTest0.square((-957487));
        int int22 = mathTest0.multiply(2132429056, 24389000);
        int int25 = mathTest0.multiply(612685583, 434791462);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 144 + "'", int11 == 144);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29421356 + "'", int14 == 29421356);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1324965 + "'", int17 == 1324965);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1953321121 + "'", int19 == 1953321121);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1719912448 + "'", int22 == 1719912448);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1517275194 + "'", int25 == 1517275194);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square((-32969632));
        int int14 = mathTest0.divide(0, (-1328051));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 541139968 + "'", int11 == 541139968);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) ' ');
        int int12 = mathTest0.divide((int) (byte) 100, 36);
        int int15 = mathTest0.subtract(0, 3232);
        int int18 = mathTest0.divide(104060401, 3329);
        int int20 = mathTest0.square((-1086369187));
        int int23 = mathTest0.add(362673936, 1304336066);
        int int26 = mathTest0.multiply((-2043609088), 326681);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3232) + "'", int15 == (-3232));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 31258 + "'", int18 == 31258);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1782953417 + "'", int20 == 1782953417);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1667010002 + "'", int23 == 1667010002);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1456013312 + "'", int26 == 1456013312);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) ' ');
        int int12 = mathTest0.divide((int) (byte) 100, 36);
        int int15 = mathTest0.subtract(0, 3232);
        int int18 = mathTest0.divide(104060401, 3329);
        int int21 = mathTest0.subtract((-51), 5541);
        int int24 = mathTest0.subtract((-1658912768), 9113164);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3232) + "'", int15 == (-3232));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 31258 + "'", int18 == 31258);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-5592) + "'", int21 == (-5592));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1668025932) + "'", int24 == (-1668025932));
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
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
        int int32 = mathTest0.divide(1614374000, (-31611));
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-51070) + "'", int32 == (-51070));
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.subtract((int) (short) 0, (int) '#');
        int int15 = mathTest0.subtract((-1), 100);
        int int18 = mathTest0.add(5151, (-51));
        int int21 = mathTest0.divide(27040000, (-1086356767));
        int int23 = mathTest0.square(488868837);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-35) + "'", int12 == (-35));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-101) + "'", int15 == (-101));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5100 + "'", int18 == 5100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1863351001 + "'", int23 == 1863351001);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.add(100, (int) (short) 1);
        int int9 = mathTest0.subtract(4858344, 1962934272);
        java.lang.Class<?> wildcardClass10 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1958075928) + "'", int9 == (-1958075928));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.subtract((int) '#', (int) (short) 100);
        int int12 = mathTest0.divide(712776852, (-27036767));
        int int15 = mathTest0.subtract((-1382167866), (-1328051));
        int int18 = mathTest0.subtract((-1038315520), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-65) + "'", int9 == (-65));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-26) + "'", int12 == (-26));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1380839815) + "'", int15 == (-1380839815));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1038315520) + "'", int18 == (-1038315520));
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int5 = mathTest0.square((int) (byte) 10);
        int int8 = mathTest0.add((-1488), 3190);
        int int11 = mathTest0.multiply((-1042405), 2500);
        int int14 = mathTest0.add(3364195, 1494149);
        int int16 = mathTest0.square((-167544));
        int int19 = mathTest0.multiply((-190877024), (-10));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1702 + "'", int8 == 1702);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1688954796 + "'", int11 == 1688954796);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4858344 + "'", int14 == 4858344);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1993779136) + "'", int16 == (-1993779136));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1908770240 + "'", int19 == 1908770240);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
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
        int int28 = mathTest0.subtract(1667, (-66144219));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5151 + "'", int14 == 5151);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1732640) + "'", int17 == (-1732640));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10201 + "'", int19 == 10201);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 208780 + "'", int22 == 208780);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1327930204) + "'", int25 == (-1327930204));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 66145886 + "'", int28 == 66145886);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(12, 100);
        int int15 = mathTest0.multiply(2, 1046);
        int int17 = mathTest0.square(13516830);
        int int20 = mathTest0.subtract(1964249568, 935011904);
        int int23 = mathTest0.subtract(17689, 990);
        int int25 = mathTest0.square(311400096);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 112 + "'", int12 == 112);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2092 + "'", int15 == 2092);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1079444356 + "'", int17 == 1079444356);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1029237664 + "'", int20 == 1029237664);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 16699 + "'", int23 == 16699);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 526377984 + "'", int25 == 526377984);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((-32), 99);
        int int9 = mathTest0.divide((-3232), 51);
        int int12 = mathTest0.subtract(34, (int) (short) 100);
        int int15 = mathTest0.divide((-13503587), (-3069));
        int int18 = mathTest0.subtract(1849, 712775872);
        int int21 = mathTest0.subtract(29462604, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3168) + "'", int6 == (-3168));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-63) + "'", int9 == (-63));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-66) + "'", int12 == (-66));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4399 + "'", int15 == 4399);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-712774023) + "'", int18 == (-712774023));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 29462604 + "'", int21 == 29462604);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.subtract((int) (short) 0, (int) '#');
        int int15 = mathTest0.subtract((-1), 100);
        int int18 = mathTest0.add(5151, (-51));
        int int21 = mathTest0.multiply((-2), (-65));
        int int24 = mathTest0.divide(32, 17960388);
        int int27 = mathTest0.divide(1568, (-578834862));
        int int30 = mathTest0.subtract(82465202, (-1347337850));
        java.lang.Class<?> wildcardClass31 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-35) + "'", int12 == (-35));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-101) + "'", int15 == (-101));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5100 + "'", int18 == 5100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 130 + "'", int21 == 130);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1429803052 + "'", int30 == 1429803052);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(3232, (-3168));
        int int8 = mathTest0.square((-3232));
        int int10 = mathTest0.square(1322761358);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10445824 + "'", int8 == 10445824);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-916136252) + "'", int10 == (-916136252));
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.divide((-101), 2);
        int int9 = mathTest0.divide((int) '#', 31);
        java.lang.Class<?> wildcardClass10 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square((-32969632));
        int int14 = mathTest0.divide((-2033540108), 2550);
        int int17 = mathTest0.subtract((-35), (-1397199231));
        int int20 = mathTest0.divide(1998328561, 417349360);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 541139968 + "'", int11 == 541139968);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-797466) + "'", int14 == (-797466));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1397199196 + "'", int17 == 1397199196);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
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
        int int33 = mathTest0.multiply((-1541263799), 851929);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1484780257 + "'", int33 == 1484780257);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) ' ');
        int int12 = mathTest0.divide((int) (byte) 100, 36);
        int int15 = mathTest0.subtract(0, 3232);
        int int18 = mathTest0.divide(104060401, 3329);
        int int20 = mathTest0.square(163);
        int int23 = mathTest0.add((-1838193237), 5100);
        int int26 = mathTest0.add(109330155, 2483776);
        int int29 = mathTest0.add(4309776, (-2022583144));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3232) + "'", int15 == (-3232));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 31258 + "'", int18 == 31258);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 26569 + "'", int20 == 26569);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1838188137) + "'", int23 == (-1838188137));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 111813931 + "'", int26 == 111813931);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-2018273368) + "'", int29 == (-2018273368));
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.add(2092, 1494149);
        int int18 = mathTest0.add(1357853952, (-461144));
        int int21 = mathTest0.divide((-296), (-881163264));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1496241 + "'", int15 == 1496241);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1357392808 + "'", int18 == 1357392808);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
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
        int int29 = mathTest0.multiply((-122), (-1845686));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3307 + "'", int20 == 3307);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-601128) + "'", int23 == (-601128));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1724707841 + "'", int26 == 1724707841);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 225173692 + "'", int29 == 225173692);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
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
        int int26 = mathTest0.square(27040000);
        int int29 = mathTest0.subtract((-807392004), (-2011846256));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10036224 + "'", int19 == 10036224);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7311616 + "'", int21 == 7311616);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 386092816 + "'", int24 == 386092816);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-747569152) + "'", int26 == (-747569152));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1204454252 + "'", int29 == 1204454252);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(12, 100);
        int int15 = mathTest0.add(2601, (-51));
        int int18 = mathTest0.divide((-51918), 1594884096);
        int int21 = mathTest0.multiply(1543545828, (-477771120));
        int int24 = mathTest0.divide(15036876, (-109));
        int int27 = mathTest0.add(1964248753, 1861156092);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 112 + "'", int12 == 112);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2550 + "'", int15 == 2550);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1826482112) + "'", int21 == (-1826482112));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-137952) + "'", int24 == (-137952));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-469562451) + "'", int27 == (-469562451));
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.subtract((int) '#', (int) (short) 1);
        int int17 = mathTest0.multiply(1, (-1));
        int int20 = mathTest0.add(101, (int) ' ');
        int int23 = mathTest0.multiply(1966983405, 429549516);
        int int26 = mathTest0.subtract(0, (-1440205312));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 133 + "'", int20 == 133);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1285912540 + "'", int23 == 1285912540);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1440205312 + "'", int26 == 1440205312);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int12 = mathTest0.add(1962934272, (-3196));
        int int14 = mathTest0.square(950697);
        int int17 = mathTest0.divide(1964249578, (-6620096));
        int int20 = mathTest0.subtract((-55342812), 44);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1962931076 + "'", int12 == 1962931076);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1881653649 + "'", int14 == 1881653649);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-296) + "'", int17 == (-296));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-55342856) + "'", int20 == (-55342856));
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.divide(0, 5200);
        int int13 = mathTest0.square(4356);
        int int16 = mathTest0.divide(1026171035, (-5592));
        int int19 = mathTest0.divide(316921, (-167544));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 18974736 + "'", int13 == 18974736);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-183506) + "'", int16 == (-183506));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.divide((-101), 2);
        int int8 = mathTest0.square(1849);
        int int11 = mathTest0.multiply(9114210, 1496160);
        int int14 = mathTest0.divide(31258, 176203232);
        java.lang.Class<?> wildcardClass15 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3418801 + "'", int8 == 3418801);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-204731200) + "'", int11 == (-204731200));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.multiply(101, 51);
        int int17 = mathTest0.divide(144, 64);
        int int19 = mathTest0.square(115);
        int int22 = mathTest0.add((-1544804415), (-1544804416));
        int int25 = mathTest0.divide(7398400, (-2030039894));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5151 + "'", int14 == 5151);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 13225 + "'", int19 == 13225);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1205358465 + "'", int22 == 1205358465);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int11 = mathTest0.square(3232);
        int int14 = mathTest0.divide((-32), (int) (short) 1);
        int int17 = mathTest0.add(36, 1010);
        int int19 = mathTest0.square(2);
        int int22 = mathTest0.subtract((-1926779106), 805855786);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10445824 + "'", int11 == 10445824);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-32) + "'", int14 == (-32));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1046 + "'", int17 == 1046);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1562332404 + "'", int22 == 1562332404);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.subtract((int) (short) -1, (int) (short) 100);
        int int16 = mathTest0.square(101);
        int int18 = mathTest0.square(99);
        int int21 = mathTest0.subtract(117, (-180288));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-101) + "'", int14 == (-101));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10201 + "'", int16 == 10201);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9801 + "'", int18 == 9801);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 180405 + "'", int21 == 180405);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.subtract((int) (short) 0, (int) '#');
        int int15 = mathTest0.subtract((-1), 100);
        int int18 = mathTest0.add((-990), (-32));
        int int21 = mathTest0.multiply(43560000, (-3217));
        int int23 = mathTest0.square((-1600559975));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-35) + "'", int12 == (-35));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-101) + "'", int15 == (-101));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1022) + "'", int18 == (-1022));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1601400768 + "'", int21 == 1601400768);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1503009935) + "'", int23 == (-1503009935));
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.divide(1496241, 10201);
        int int14 = mathTest0.square((-3295));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 146 + "'", int12 == 146);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10857025 + "'", int14 == 10857025);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int8 = mathTest0.square((-51));
        int int11 = mathTest0.divide((-3222), 112);
        int int14 = mathTest0.multiply(1, (-134969936));
        int int17 = mathTest0.multiply(2030043136, (-134938));
        int int20 = mathTest0.divide(18974736, 1892066507);
        int int23 = mathTest0.divide(9117553, 263609);
        int int26 = mathTest0.add((-1563969599), 7627);
        int int29 = mathTest0.divide(29421456, (-1190896240));
        int int32 = mathTest0.subtract((-137280), 175241906);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2601 + "'", int8 == 2601);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-28) + "'", int11 == (-28));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-134969936) + "'", int14 == (-134969936));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1241513984) + "'", int17 == (-1241513984));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 34 + "'", int23 == 34);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1563961972) + "'", int26 == (-1563961972));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-175379186) + "'", int32 == (-175379186));
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
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
        int int28 = mathTest0.divide((-888552828), (-8));
        java.lang.Class<?> wildcardClass29 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10036224 + "'", int19 == 10036224);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1237 + "'", int22 == 1237);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 950697 + "'", int25 == 950697);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 111069103 + "'", int28 == 111069103);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) (short) 1);
        int int12 = mathTest0.subtract(51, (-66));
        int int15 = mathTest0.divide(146, 3364195);
        int int18 = mathTest0.multiply((-1623939036), 386092816);
        int int21 = mathTest0.add((-19728481), 10000);
        int int23 = mathTest0.square((-837686844));
        int int26 = mathTest0.add(566266805, 1849);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 117 + "'", int12 == 117);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1738120768 + "'", int18 == 1738120768);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-19718481) + "'", int21 == (-19718481));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1367236112 + "'", int23 == 1367236112);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 566268654 + "'", int26 == 566268654);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.add(100, (int) (short) 1);
        int int9 = mathTest0.subtract(0, 0);
        int int11 = mathTest0.square((int) (byte) 1);
        int int14 = mathTest0.subtract(3232, 27040000);
        int int17 = mathTest0.multiply(47, 100);
        int int20 = mathTest0.subtract((-167544), (-34));
        int int23 = mathTest0.subtract((-94292389), 198988216);
        java.lang.Class<?> wildcardClass24 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-27036768) + "'", int14 == (-27036768));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4700 + "'", int17 == 4700);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-167510) + "'", int20 == (-167510));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-293280605) + "'", int23 == (-293280605));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int11 = mathTest0.square((int) (short) 1);
        int int14 = mathTest0.subtract((-27046437), 1496241);
        int int17 = mathTest0.subtract((-1905639567), 537603088);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-28542678) + "'", int14 == (-28542678));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1851724641 + "'", int17 == 1851724641);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.add((-190), (int) '4');
        int int17 = mathTest0.divide((-4), 344);
        int int20 = mathTest0.subtract(1909243054, 1924186067);
        int int23 = mathTest0.multiply(1444, 823696656);
        java.lang.Class<?> wildcardClass24 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-138) + "'", int14 == (-138));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-14943013) + "'", int20 == (-14943013));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-287969728) + "'", int23 == (-287969728));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int11 = mathTest0.square(3232);
        int int14 = mathTest0.divide((-32), (int) (short) 1);
        int int17 = mathTest0.add(36, 1010);
        int int20 = mathTest0.divide((-51), (-1740241));
        int int23 = mathTest0.subtract((-32969632), (-629560));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10445824 + "'", int11 == 10445824);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-32) + "'", int14 == (-32));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1046 + "'", int17 == 1046);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-32340072) + "'", int23 == (-32340072));
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.divide((-101), 2);
        int int9 = mathTest0.multiply(101, 10);
        int int12 = mathTest0.divide(176203232, 11082582);
        java.lang.Class<?> wildcardClass13 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1010 + "'", int9 == 1010);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((int) (short) -1, 36);
        int int18 = mathTest0.divide((-1488), 112);
        int int20 = mathTest0.square((-31));
        int int23 = mathTest0.add((-5000), 1108809);
        int int26 = mathTest0.add(27426628, (-3232));
        int int29 = mathTest0.divide(705911761, (-2079326208));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-13) + "'", int18 == (-13));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 961 + "'", int20 == 961);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1103809 + "'", int23 == 1103809);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 27423396 + "'", int26 == 27423396);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(3232, (-3168));
        int int8 = mathTest0.square((-3232));
        int int11 = mathTest0.subtract((int) (byte) 100, (-63));
        int int14 = mathTest0.add((-980), (-101));
        int int16 = mathTest0.square(1614374000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10445824 + "'", int8 == 10445824);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 163 + "'", int11 == 163);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1081) + "'", int14 == (-1081));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-515395328) + "'", int16 == (-515395328));
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
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
        int int33 = mathTest0.divide(1543545828, 7627);
        int int36 = mathTest0.subtract(4096, 661347904);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 202379 + "'", int33 == 202379);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-661343808) + "'", int36 == (-661343808));
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
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
        int int29 = mathTest0.divide((-1246896128), 1995735080);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-32969632) + "'", int17 == (-32969632));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1184491520 + "'", int26 == 1184491520);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.add(100, (int) (short) 1);
        int int9 = mathTest0.subtract(0, 0);
        int int11 = mathTest0.square(12);
        int int14 = mathTest0.subtract((-1156), (-29422512));
        int int16 = mathTest0.square(18352);
        int int19 = mathTest0.add((-1065096738), 9700);
        int int22 = mathTest0.subtract(70071185, (-989988));
        int int25 = mathTest0.divide(722297152, (-29422512));
        java.lang.Class<?> wildcardClass26 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 144 + "'", int11 == 144);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29421356 + "'", int14 == 29421356);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 336795904 + "'", int16 == 336795904);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1065087038) + "'", int19 == (-1065087038));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 71061173 + "'", int22 == 71061173);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-24) + "'", int25 == (-24));
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int13 = mathTest0.square(22500);
        int int16 = mathTest0.multiply((-204731200), 12);
        int int19 = mathTest0.multiply((-9449), 1964249568);
        int int22 = mathTest0.subtract((-989855744), (-38));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 506250000 + "'", int13 == 506250000);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1838192896 + "'", int16 == 1838192896);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1640482016) + "'", int19 == (-1640482016));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-989855706) + "'", int22 == (-989855706));
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((int) (short) -1, 36);
        int int18 = mathTest0.divide((-1488), 112);
        int int21 = mathTest0.add(29421356, (int) (byte) 100);
        int int24 = mathTest0.multiply(0, 73627785);
        int int26 = mathTest0.square((-13585088));
        java.lang.Class<?> wildcardClass27 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-13) + "'", int18 == (-13));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 29421456 + "'", int21 == 29421456);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-128741376) + "'", int26 == (-128741376));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.divide(0, 5200);
        int int14 = mathTest0.multiply((int) (short) 1, (int) (short) 10);
        int int17 = mathTest0.multiply((-461144), 32);
        int int20 = mathTest0.subtract((-274661376), 1541910512);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-14756608) + "'", int17 == (-14756608));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1816571888) + "'", int20 == (-1816571888));
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square(5200);
        int int14 = mathTest0.subtract((-43), (-35));
        int int17 = mathTest0.divide(0, (-134969936));
        int int20 = mathTest0.add(763532, (-1576));
        int int23 = mathTest0.subtract((-3627), 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27040000 + "'", int11 == 27040000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-8) + "'", int14 == (-8));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 761956 + "'", int20 == 761956);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-3659) + "'", int23 == (-3659));
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) ' ');
        int int12 = mathTest0.divide((int) (byte) 100, 36);
        int int15 = mathTest0.subtract(0, 3232);
        int int18 = mathTest0.divide(104060401, 3329);
        int int20 = mathTest0.square(163);
        int int23 = mathTest0.add((-1838193237), 5100);
        int int26 = mathTest0.add(109330155, 2483776);
        int int29 = mathTest0.subtract(0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3232) + "'", int15 == (-3232));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 31258 + "'", int18 == 31258);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 26569 + "'", int20 == 26569);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1838188137) + "'", int23 == (-1838188137));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 111813931 + "'", int26 == 111813931);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-10) + "'", int29 == (-10));
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.add(52, 98);
        int int16 = mathTest0.square(13503598);
        int int19 = mathTest0.subtract((-27034267), (-5919729));
        int int22 = mathTest0.subtract((-116748), (-283351090));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 150 + "'", int14 == 150);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 27426628 + "'", int16 == 27426628);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-21114538) + "'", int19 == (-21114538));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 283234342 + "'", int22 == 283234342);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.add((int) (short) 1, 0);
        int int14 = mathTest0.add(51, (-3232));
        int int17 = mathTest0.multiply(1581, 1852038144);
        int int20 = mathTest0.subtract(1624886795, 43803810);
        int int23 = mathTest0.multiply((-38), (-3232));
        int int25 = mathTest0.square(128163);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3181) + "'", int14 == (-3181));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1095390208) + "'", int17 == (-1095390208));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1581082985 + "'", int20 == 1581082985);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 122816 + "'", int23 == 122816);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-754114615) + "'", int25 == (-754114615));
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
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
        int int30 = mathTest0.add((-262701), 205537);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-57164) + "'", int30 == (-57164));
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        int int20 = mathTest0.divide(2500, (-13503535));
        int int23 = mathTest0.subtract(1108809, 34225092);
        int int26 = mathTest0.multiply(1174437540, 263609);
        int int29 = mathTest0.divide(44, 261009);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-33116283) + "'", int23 == (-33116283));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1822115708) + "'", int26 == (-1822115708));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
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
        int int30 = mathTest0.add(0, (-3222));
        java.lang.Class<?> wildcardClass31 = mathTest0.getClass();
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-3222) + "'", int30 == (-3222));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((int) (short) -1, 36);
        int int18 = mathTest0.divide((-2), (-61));
        int int21 = mathTest0.add((-27036775), (-2));
        int int24 = mathTest0.multiply((-805866716), (-1488));
        int int27 = mathTest0.subtract(2030043136, (-1600559975));
        int int30 = mathTest0.subtract((-206045184), (-176586752));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-27036777) + "'", int21 == (-27036777));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 833797824 + "'", int24 == 833797824);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-664364185) + "'", int27 == (-664364185));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-29458432) + "'", int30 == (-29458432));
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.add((int) (byte) -1, (int) '4');
        int int12 = mathTest0.multiply((int) 'a', (int) (short) 100);
        int int14 = mathTest0.square(219152384);
        int int16 = mathTest0.square((-134974868));
        int int19 = mathTest0.divide((-958909120), 220);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9700 + "'", int12 == 9700);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1190896240) + "'", int16 == (-1190896240));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-4358677) + "'", int19 == (-4358677));
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.subtract(36, 3232);
        int int16 = mathTest0.square(2);
        int int19 = mathTest0.add(11, 999698);
        int int21 = mathTest0.square(64);
        int int24 = mathTest0.divide((-557188015), 10214416);
        int int27 = mathTest0.subtract(202379, (-1845642241));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3196) + "'", int14 == (-3196));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 999709 + "'", int19 == 999709);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4096 + "'", int21 == 4096);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-54) + "'", int24 == (-54));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1845844620 + "'", int27 == 1845844620);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(3232, (-3168));
        int int9 = mathTest0.subtract(3414480, (-27046437));
        int int11 = mathTest0.square(134689);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 30460917 + "'", int9 == 30460917);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 961257537 + "'", int11 == 961257537);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(3232, (-3168));
        int int8 = mathTest0.square((-3232));
        int int11 = mathTest0.subtract((int) (byte) 100, (-63));
        int int14 = mathTest0.subtract((-63), (int) (byte) 0);
        int int17 = mathTest0.add((-1125035258), 1961891178);
        int int20 = mathTest0.multiply(2048, 1702726656);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10445824 + "'", int8 == 10445824);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 163 + "'", int11 == 163);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-63) + "'", int14 == (-63));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 836855920 + "'", int17 == 836855920);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-329252864) + "'", int20 == (-329252864));
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(3232, (-3168));
        int int8 = mathTest0.square((-3232));
        int int11 = mathTest0.subtract((int) (byte) 100, (-63));
        int int14 = mathTest0.divide((-781697343), (-1));
        java.lang.Class<?> wildcardClass15 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10445824 + "'", int8 == 10445824);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 163 + "'", int11 == 163);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 781697343 + "'", int14 == 781697343);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
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
        int int31 = mathTest0.subtract((-1035983359), 604333301);
        int int34 = mathTest0.subtract(1496699, 11082582);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1640316660) + "'", int31 == (-1640316660));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-9585883) + "'", int34 == (-9585883));
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.divide(10201, 750);
        int int15 = mathTest0.subtract(1852038144, 1706236992);
        int int18 = mathTest0.subtract(0, 377578);
        int int21 = mathTest0.multiply(198988216, 928713830);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 13 + "'", int12 == 13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 145801152 + "'", int15 == 145801152);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-377578) + "'", int18 == (-377578));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1576718512) + "'", int21 == (-1576718512));
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
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
        int int33 = mathTest0.square(434174);
        java.lang.Class<?> wildcardClass34 = mathTest0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-471498748) + "'", int33 == (-471498748));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.multiply(101, 51);
        int int17 = mathTest0.divide(144, 64);
        int int20 = mathTest0.subtract(10005, (-1156));
        int int23 = mathTest0.divide((-570562480), (-6110224));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5151 + "'", int14 == 5151);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 11161 + "'", int20 == 11161);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 93 + "'", int23 == 93);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.add((int) (short) 1, 0);
        int int14 = mathTest0.add(51, (-3232));
        int int17 = mathTest0.add(1500625, (-6476));
        int int20 = mathTest0.multiply((-12), (-1042405));
        int int23 = mathTest0.subtract(11082241, (-1042405));
        int int26 = mathTest0.add(1962934272, (-1043094));
        int int29 = mathTest0.divide(1500625, (-1895874560));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3181) + "'", int14 == (-3181));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1494149 + "'", int17 == 1494149);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 12508860 + "'", int20 == 12508860);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 12124646 + "'", int23 == 12124646);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1961891178 + "'", int26 == 1961891178);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.add((int) (short) 1, 0);
        int int14 = mathTest0.multiply((-399), 1156);
        int int17 = mathTest0.divide(148155, 52);
        int int20 = mathTest0.multiply((-1086356767), (-3243));
        int int23 = mathTest0.divide(960400, 1357392808);
        int int26 = mathTest0.add((-633972464), (-865176864));
        java.lang.Class<?> wildcardClass27 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-461244) + "'", int14 == (-461244));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2849 + "'", int17 == 2849);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1181812661 + "'", int20 == 1181812661);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1499149328) + "'", int26 == (-1499149328));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int8 = mathTest0.square((-51));
        int int11 = mathTest0.divide((-3222), 112);
        int int14 = mathTest0.multiply(1, (-134969936));
        int int17 = mathTest0.multiply(2030043136, (-134938));
        int int20 = mathTest0.divide(18974736, 1892066507);
        int int23 = mathTest0.divide(9117553, 263609);
        int int26 = mathTest0.add(429549516, 470106961);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2601 + "'", int8 == 2601);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-28) + "'", int11 == (-28));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-134969936) + "'", int14 == (-134969936));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1241513984) + "'", int17 == (-1241513984));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 34 + "'", int23 == 34);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 899656477 + "'", int26 == 899656477);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
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
        int int28 = mathTest0.square((-2623));
        int int31 = mathTest0.subtract((-1236), (-1653864505));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-32969632) + "'", int17 == (-32969632));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1000500 + "'", int23 == 1000500);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 312899521 + "'", int26 == 312899521);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 6880129 + "'", int28 == 6880129);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1653863269 + "'", int31 == 1653863269);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(12, 100);
        int int15 = mathTest0.multiply(2, 1046);
        int int17 = mathTest0.square(13516830);
        int int20 = mathTest0.multiply((-1397198556), 26887361);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 112 + "'", int12 == 112);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2092 + "'", int15 == 2092);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1079444356 + "'", int17 == 1079444356);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1757600804 + "'", int20 == 1757600804);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.add(2092, 1494149);
        int int17 = mathTest0.square(64);
        int int20 = mathTest0.divide(1022217718, (-2720));
        int int23 = mathTest0.subtract(1702726656, (-1241513984));
        int int25 = mathTest0.square(1638973851);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1496241 + "'", int15 == 1496241);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4096 + "'", int17 == 4096);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-375815) + "'", int20 == (-375815));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1350726656) + "'", int23 == (-1350726656));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1032524761 + "'", int25 == 1032524761);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) (short) 1);
        int int12 = mathTest0.subtract(51, (-66));
        int int15 = mathTest0.divide(146, 3364195);
        int int18 = mathTest0.multiply(100, 1084);
        int int21 = mathTest0.divide(4351, 218028);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 117 + "'", int12 == 117);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 108400 + "'", int18 == 108400);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
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
        int int31 = mathTest0.multiply(112, 0);
        int int34 = mathTest0.divide(2005938200, 557020471);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.divide(0, 5200);
        int int14 = mathTest0.multiply((int) (short) 1, (int) (short) 10);
        int int16 = mathTest0.square((-707775295));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-293668479) + "'", int16 == (-293668479));
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square(5200);
        int int14 = mathTest0.divide(152, (-61));
        int int17 = mathTest0.subtract(31258, 1702);
        java.lang.Class<?> wildcardClass18 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27040000 + "'", int11 == 27040000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-2) + "'", int14 == (-2));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 29556 + "'", int17 == 29556);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.subtract((int) (short) 0, (int) '#');
        int int15 = mathTest0.add((-101), 1024);
        int int18 = mathTest0.subtract((-805857024), (-109));
        java.lang.Class<?> wildcardClass19 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-35) + "'", int12 == (-35));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 923 + "'", int15 == 923);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-805856915) + "'", int18 == (-805856915));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.add(100, (int) (short) 1);
        int int9 = mathTest0.divide(1581, 4353);
        int int12 = mathTest0.divide(303, 599383088);
        int int14 = mathTest0.square((-1962934273));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-369098751) + "'", int14 == (-369098751));
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int11 = mathTest0.square(3232);
        int int14 = mathTest0.divide((-32), (int) (short) 1);
        int int17 = mathTest0.add(36, 1010);
        int int20 = mathTest0.subtract((int) 'a', (-31));
        int int23 = mathTest0.divide((-621998080), 1010);
        int int26 = mathTest0.divide((-305653840), 9669);
        int int29 = mathTest0.subtract((-3364195), 36819);
        int int32 = mathTest0.subtract((-1789331022), 2499561);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10445824 + "'", int11 == 10445824);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-32) + "'", int14 == (-32));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1046 + "'", int17 == 1046);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 128 + "'", int20 == 128);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-615839) + "'", int23 == (-615839));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-31611) + "'", int26 == (-31611));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-3401014) + "'", int29 == (-3401014));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1791830583) + "'", int32 == (-1791830583));
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
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
        int int29 = mathTest0.square(282539681);
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-300527295) + "'", int29 == (-300527295));
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((int) (short) -1, 36);
        int int18 = mathTest0.divide((-1488), 112);
        int int21 = mathTest0.add(29421356, (int) (byte) 100);
        int int24 = mathTest0.multiply((-601128), (-992));
        int int27 = mathTest0.add((-18339), 547640949);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-13) + "'", int18 == (-13));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 29421456 + "'", int21 == 29421456);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 596318976 + "'", int24 == 596318976);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 547622610 + "'", int27 == 547622610);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((int) (short) -1, 36);
        int int18 = mathTest0.multiply((-51), (-31));
        int int21 = mathTest0.divide((-1544804416), (-805857024));
        int int23 = mathTest0.square(12496225);
        int int26 = mathTest0.multiply(254505, 6880129);
        int int29 = mathTest0.subtract(4835844, 272870032);
        int int31 = mathTest0.square(1500390);
        int int33 = mathTest0.square((-1789340823));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1581 + "'", int18 == 1581);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-781697343) + "'", int23 == (-781697343));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1319425623) + "'", int26 == (-1319425623));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-268034188) + "'", int29 == (-268034188));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 607288996 + "'", int31 == 607288996);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1086734609 + "'", int33 == 1086734609);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.add(2092, 1494149);
        int int17 = mathTest0.square(64);
        int int20 = mathTest0.multiply(1324965, 134966615);
        int int23 = mathTest0.multiply((-50), 140);
        int int26 = mathTest0.multiply((-14756608), 1128265728);
        int int29 = mathTest0.subtract((-32678), (-1926779106));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1496241 + "'", int15 == 1496241);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4096 + "'", int17 == 4096);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 782707219 + "'", int20 == 782707219);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-7000) + "'", int23 == (-7000));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1230503936 + "'", int26 == 1230503936);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1926746428 + "'", int29 == 1926746428);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square((-32969632));
        int int14 = mathTest0.subtract((int) (byte) 1, (-13506830));
        int int16 = mathTest0.square(1990353832);
        int int19 = mathTest0.add((-20489899), (-41602));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 541139968 + "'", int11 == 541139968);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 13506831 + "'", int14 == 13506831);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 661347904 + "'", int16 == 661347904);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-20531501) + "'", int19 == (-20531501));
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((-32), 99);
        int int8 = mathTest0.square((-1156));
        int int11 = mathTest0.multiply((-99590), (-855675904));
        int int14 = mathTest0.multiply((-1878499328), (-781646620));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3168) + "'", int6 == (-3168));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1336336 + "'", int8 == 1336336);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 317159424 + "'", int11 == 317159424);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-923435008) + "'", int14 == (-923435008));
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
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
        int int28 = mathTest0.square(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10445824 + "'", int11 == 10445824);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-32) + "'", int14 == (-32));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1046 + "'", int17 == 1046);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1852038144 + "'", int20 == 1852038144);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1926281121 + "'", int26 == 1926281121);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(3232, (-3168));
        int int8 = mathTest0.square((-3232));
        int int10 = mathTest0.square(290);
        int int12 = mathTest0.square((-3535));
        java.lang.Class<?> wildcardClass13 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10445824 + "'", int8 == 10445824);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 84100 + "'", int10 == 84100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12496225 + "'", int12 == 12496225);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.add((int) (byte) -1, (int) '4');
        int int12 = mathTest0.subtract(150, 51);
        int int15 = mathTest0.add((int) (short) 1, 1);
        int int18 = mathTest0.multiply((-148), (-124));
        int int20 = mathTest0.square(1094116);
        int int23 = mathTest0.add((-1190896240), 1174437505);
        int int25 = mathTest0.square(963499229);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 99 + "'", int12 == 99);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 18352 + "'", int18 == 18352);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1206054128) + "'", int20 == (-1206054128));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-16458735) + "'", int23 == (-16458735));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1597032137 + "'", int25 == 1597032137);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.add(100, (int) (short) 1);
        int int9 = mathTest0.subtract(0, 0);
        int int12 = mathTest0.add(11, 3);
        int int15 = mathTest0.subtract(1440205312, 1004601344);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 14 + "'", int12 == 14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 435603968 + "'", int15 == 435603968);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
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
        int int27 = mathTest0.multiply(1429803052, (-1095390208));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-101) + "'", int14 == (-101));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10201 + "'", int16 == 10201);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9801 + "'", int18 == 9801);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-145044) + "'", int21 == (-145044));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1334963529 + "'", int24 == 1334963529);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1845071872 + "'", int27 == 1845071872);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
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
        int int32 = mathTest0.add((-969485412), (-369098751));
        int int35 = mathTest0.subtract((-1653863424), 2000098608);
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1338584163) + "'", int32 == (-1338584163));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 641005264 + "'", int35 == 641005264);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(210, (-7));
        int int15 = mathTest0.multiply(1724707840, 2);
        java.lang.Class<?> wildcardClass16 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 203 + "'", int12 == 203);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-845551616) + "'", int15 == (-845551616));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int5 = mathTest0.square(1053);
        int int7 = mathTest0.square(12508860);
        int int9 = mathTest0.square(1961891178);
        int int12 = mathTest0.subtract((-1246896128), 13503598);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1108809 + "'", int5 == 1108809);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1624939024 + "'", int7 == 1624939024);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 948604900 + "'", int9 == 948604900);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1260399726) + "'", int12 == (-1260399726));
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.subtract((int) '#', (int) (short) 1);
        int int17 = mathTest0.add(292338665, (-1095026260));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-802687595) + "'", int17 == (-802687595));
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
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
        int int30 = mathTest0.subtract(0, 1838229715);
        int int33 = mathTest0.multiply(336795904, (-719503128));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1962927862 + "'", int18 == 1962927862);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-825) + "'", int21 == (-825));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1024 + "'", int24 == 1024);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1838229715) + "'", int30 == (-1838229715));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-863066112) + "'", int33 == (-863066112));
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.add((int) (byte) -1, (int) '4');
        int int12 = mathTest0.multiply((int) 'a', (int) (short) 100);
        int int15 = mathTest0.subtract((-27036768), 3329);
        int int18 = mathTest0.multiply(0, (-2));
        int int21 = mathTest0.subtract(28542624, (-1631068032));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9700 + "'", int12 == 9700);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-27040097) + "'", int15 == (-27040097));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1659610656 + "'", int21 == 1659610656);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
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
        int int33 = mathTest0.add(0, 1924149248);
        java.lang.Class<?> wildcardClass34 = mathTest0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1924149248 + "'", int33 == 1924149248);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.multiply(10445824, 10445824);
        int int12 = mathTest0.divide(2704, (-5681));
        int int14 = mathTest0.square(712775872);
        int int16 = mathTest0.square(1156);
        int int18 = mathTest0.square(1296);
        int int21 = mathTest0.divide(12508860, 1190745152);
        int int24 = mathTest0.add((-655109487), (-10489932));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1594884096 + "'", int9 == 1594884096);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-60518400) + "'", int14 == (-60518400));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1336336 + "'", int16 == 1336336);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1679616 + "'", int18 == 1679616);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-665599419) + "'", int24 == (-665599419));
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
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
        int int40 = mathTest0.multiply(0, 0);
        int int43 = mathTest0.multiply(786029700, 1653451088);
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
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1935412544 + "'", int43 == 1935412544);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        int int20 = mathTest0.subtract(12, (-3295));
        int int23 = mathTest0.multiply((-138), 4356);
        int int26 = mathTest0.multiply(881424075, (-2053008027));
        int int28 = mathTest0.square((-5486));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3307 + "'", int20 == 3307);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-601128) + "'", int23 == (-601128));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-385153769) + "'", int26 == (-385153769));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 30096196 + "'", int28 == 30096196);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square(5200);
        int int14 = mathTest0.subtract((-43), (-35));
        int int17 = mathTest0.divide(0, (-134969936));
        int int20 = mathTest0.multiply(712776862, 2778889);
        java.lang.Class<?> wildcardClass21 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27040000 + "'", int11 == 27040000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-8) + "'", int14 == (-8));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 533500814 + "'", int20 == 533500814);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.add(100, (int) (short) 1);
        int int9 = mathTest0.subtract(0, 0);
        int int11 = mathTest0.square(12);
        int int14 = mathTest0.subtract((-1156), (-29422512));
        int int17 = mathTest0.divide(100, 842501840);
        int int20 = mathTest0.multiply(203, 1046);
        int int23 = mathTest0.multiply((-3232), (-1021));
        int int25 = mathTest0.square(833798402);
        int int28 = mathTest0.subtract((-1598350400), (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 144 + "'", int11 == 144);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29421356 + "'", int14 == 29421356);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 212338 + "'", int20 == 212338);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3299872 + "'", int23 == 3299872);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1135868924) + "'", int25 == (-1135868924));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1598350410) + "'", int28 == (-1598350410));
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(3232, (-3168));
        int int8 = mathTest0.square((-3232));
        int int11 = mathTest0.subtract((int) (byte) 100, (-63));
        int int14 = mathTest0.add((-980), (-101));
        int int16 = mathTest0.square((-138));
        java.lang.Class<?> wildcardClass17 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10445824 + "'", int8 == 10445824);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 163 + "'", int11 == 163);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1081) + "'", int14 == (-1081));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 19044 + "'", int16 == 19044);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.subtract((int) (short) -1, (int) (short) 100);
        int int17 = mathTest0.multiply((-399), (int) (byte) 10);
        int int20 = mathTest0.add(344, 1781857408);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-101) + "'", int14 == (-101));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-3990) + "'", int17 == (-3990));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1781857752 + "'", int20 == 1781857752);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int8 = mathTest0.square((-51));
        int int11 = mathTest0.subtract(100, (-190));
        int int14 = mathTest0.divide((-66), (-63));
        int int16 = mathTest0.square(13503598);
        int int19 = mathTest0.add(1549450352, 1425784004);
        int int22 = mathTest0.subtract(1262559999, (-49));
        int int25 = mathTest0.subtract((-1598350410), 879239604);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2601 + "'", int8 == 2601);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 290 + "'", int11 == 290);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 27426628 + "'", int16 == 27426628);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1319732940) + "'", int19 == (-1319732940));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1262560048 + "'", int22 == 1262560048);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1817377282 + "'", int25 == 1817377282);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) ' ');
        int int12 = mathTest0.divide((int) (byte) 100, 36);
        int int15 = mathTest0.multiply(63, (-1));
        int int18 = mathTest0.subtract((int) (short) 1, (-31));
        int int21 = mathTest0.subtract(10, 990);
        int int24 = mathTest0.divide(10036224, 344);
        int int27 = mathTest0.divide((-865176864), (-797466));
        int int30 = mathTest0.add(663, 1106010925);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-63) + "'", int15 == (-63));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-980) + "'", int21 == (-980));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 29175 + "'", int24 == 29175);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1084 + "'", int27 == 1084);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1106011588 + "'", int30 == 1106011588);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.add((-190), (int) '4');
        int int17 = mathTest0.divide((-4), 344);
        int int20 = mathTest0.subtract(1909243054, 1924186067);
        int int23 = mathTest0.multiply(1444, 823696656);
        int int26 = mathTest0.add(1965531156, 2030043136);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-138) + "'", int14 == (-138));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-14943013) + "'", int20 == (-14943013));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-287969728) + "'", int23 == (-287969728));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-299393004) + "'", int26 == (-299393004));
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        mathTest mathTest0 = new mathTest();
        int int2 = mathTest0.square((-101));
        int int5 = mathTest0.multiply(1594884096, (-29422512));
        int int8 = mathTest0.divide((-32969632), (-3295));
        java.lang.Class<?> wildcardClass9 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10201 + "'", int2 == 10201);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1962934272 + "'", int5 == 1962934272);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10005 + "'", int8 == 10005);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(3232, (-3168));
        int int8 = mathTest0.square((-3232));
        int int11 = mathTest0.add(29421356, 112);
        int int14 = mathTest0.divide((int) (byte) 10, 13516830);
        int int17 = mathTest0.subtract((-364053231), 1688954796);
        int int20 = mathTest0.add((-390241792), (-1236));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10445824 + "'", int8 == 10445824);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 29421468 + "'", int11 == 29421468);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-2053008027) + "'", int17 == (-2053008027));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-390243028) + "'", int20 == (-390243028));
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.add(2092, 1494149);
        int int17 = mathTest0.square(64);
        int int20 = mathTest0.multiply(1324965, 134966615);
        int int23 = mathTest0.multiply((-50), 140);
        int int26 = mathTest0.multiply(1000, 2017675720);
        int int29 = mathTest0.multiply((-91), 1530169);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1496241 + "'", int15 == 1496241);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4096 + "'", int17 == 4096);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 782707219 + "'", int20 == 782707219);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-7000) + "'", int23 == (-7000));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-958909120) + "'", int26 == (-958909120));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-139245379) + "'", int29 == (-139245379));
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.add((int) (short) 1, 0);
        int int14 = mathTest0.add(51, (-3232));
        int int17 = mathTest0.subtract((-3212), (-134969827));
        java.lang.Class<?> wildcardClass18 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3181) + "'", int14 == (-3181));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 134966615 + "'", int17 == 134966615);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((-32), 99);
        int int9 = mathTest0.divide((int) (short) 0, (int) (short) 100);
        int int12 = mathTest0.add((-27036768), (-7));
        int int14 = mathTest0.square(1429803052);
        int int17 = mathTest0.multiply(108400, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3168) + "'", int6 == (-3168));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-27036775) + "'", int12 == (-27036775));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1822263184 + "'", int14 == 1822263184);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) ' ');
        int int12 = mathTest0.add((-1042102), 1000500);
        int int15 = mathTest0.add(828396608, 506250000);
        int int17 = mathTest0.square(1892067732);
        int int20 = mathTest0.add(2500, (-1437108180));
        int int22 = mathTest0.square((-1886411062));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-41602) + "'", int12 == (-41602));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1334646608 + "'", int15 == 1334646608);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1095024016 + "'", int17 == 1095024016);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1437105680) + "'", int20 == (-1437105680));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1851168612 + "'", int22 == 1851168612);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.divide(0, 5200);
        int int14 = mathTest0.add((-3243), (-13503587));
        int int16 = mathTest0.square((-295593424));
        int int19 = mathTest0.multiply((-578834862), (-1838193237));
        int int22 = mathTest0.add(833797824, (-1886410752));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-13506830) + "'", int14 == (-13506830));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1966983424 + "'", int16 == 1966983424);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1382167866) + "'", int19 == (-1382167866));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1052612928) + "'", int22 == (-1052612928));
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((int) (short) -1, 36);
        int int18 = mathTest0.divide((-1488), 112);
        int int21 = mathTest0.add(29421356, (int) (byte) 100);
        int int23 = mathTest0.square((-27036766));
        int int26 = mathTest0.add((-1094038400), 1407);
        int int28 = mathTest0.square(10036224);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-13) + "'", int18 == (-13));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 29421456 + "'", int21 == 29421456);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 461828740 + "'", int23 == 461828740);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1094036993) + "'", int26 == (-1094036993));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 219152384 + "'", int28 == 219152384);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square((-32969632));
        int int13 = mathTest0.square((-1988513369));
        // The following exception was thrown during execution in test generation
        try {
            int int16 = mathTest0.divide(0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Cannot divide by zero.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 541139968 + "'", int11 == 541139968);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 690379505 + "'", int13 == 690379505);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.add((int) (short) 10, 2);
        int int9 = mathTest0.subtract((-29422512), (-2030043126));
        int int12 = mathTest0.multiply(7416, 823696656);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 12 + "'", int6 == 12);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2000620614 + "'", int9 == 2000620614);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1090905984 + "'", int12 == 1090905984);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int12 = mathTest0.subtract(1, 1074639160);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1074639159) + "'", int12 == (-1074639159));
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
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
        int int30 = mathTest0.multiply((-388957150), (-1640316660));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-35) + "'", int12 == (-35));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-101) + "'", int15 == (-101));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-123) + "'", int18 == (-123));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-675) + "'", int21 == (-675));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 712776852 + "'", int24 == 712776852);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 457354026 + "'", int27 == 457354026);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1818922088) + "'", int30 == (-1818922088));
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.divide(0, 5200);
        int int13 = mathTest0.square(150);
        int int16 = mathTest0.multiply(0, 1208040860);
        int int19 = mathTest0.add((-27036603), 960400);
        int int22 = mathTest0.divide((-26037847), (-108829624));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 22500 + "'", int13 == 22500);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-26076203) + "'", int19 == (-26076203));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.subtract((int) '#', (int) (short) 100);
        int int11 = mathTest0.square(1174437474);
        int int14 = mathTest0.multiply(4096, 1881653649);
        int int16 = mathTest0.square(827448224);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-65) + "'", int9 == (-65));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-698049148) + "'", int11 == (-698049148));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2082017280 + "'", int14 == 2082017280);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-139779072) + "'", int16 == (-139779072));
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        mathTest mathTest0 = new mathTest();
        int int2 = mathTest0.square(0);
        int int5 = mathTest0.add((-1093246976), 16699);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1093230277) + "'", int5 == (-1093230277));
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int11 = mathTest0.square(133);
        int int14 = mathTest0.divide(0, 7398400);
        int int17 = mathTest0.add(1724867072, (-934701798));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 17689 + "'", int11 == 17689);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 790165274 + "'", int17 == 790165274);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((-32), 99);
        int int9 = mathTest0.divide((-3232), 51);
        int int12 = mathTest0.subtract(34, (int) (short) 100);
        int int15 = mathTest0.subtract((int) (byte) -1, (int) (byte) 0);
        int int17 = mathTest0.square((-781697343));
        int int20 = mathTest0.multiply((-802437976), 429676108);
        int int23 = mathTest0.subtract(18931201, 1588224057);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3168) + "'", int6 == (-3168));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-63) + "'", int9 == (-63));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-66) + "'", int12 == (-66));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 775032193 + "'", int17 == 775032193);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1083256352) + "'", int20 == (-1083256352));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1569292856) + "'", int23 == (-1569292856));
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.multiply(10445824, 10445824);
        int int12 = mathTest0.subtract((int) 'a', 9669);
        int int15 = mathTest0.add(1094116, (-66));
        int int18 = mathTest0.divide((-1845642241), (-1845642241));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1594884096 + "'", int9 == 1594884096);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9572) + "'", int12 == (-9572));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1094050 + "'", int15 == 1094050);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
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
        int int31 = mathTest0.multiply((-1469916730), 509259459);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 921466322 + "'", int31 == 921466322);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(3232, (-3168));
        int int8 = mathTest0.square((-3232));
        int int10 = mathTest0.square(290);
        int int12 = mathTest0.square((-3535));
        int int15 = mathTest0.add(2849, 1806125505);
        int int18 = mathTest0.subtract(395661777, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10445824 + "'", int8 == 10445824);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 84100 + "'", int10 == 84100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12496225 + "'", int12 == 12496225);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1806128354 + "'", int15 == 1806128354);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 395661767 + "'", int18 == 395661767);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) ' ');
        int int12 = mathTest0.divide((int) (byte) 100, 36);
        int int15 = mathTest0.multiply(63, (-1));
        int int18 = mathTest0.subtract((int) (short) 1, (-31));
        int int21 = mathTest0.subtract(10, 990);
        int int24 = mathTest0.divide(10036224, 344);
        int int27 = mathTest0.add(12887818, 1818756672);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-63) + "'", int15 == (-63));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-980) + "'", int21 == (-980));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 29175 + "'", int24 == 29175);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1831644490 + "'", int27 == 1831644490);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.subtract((int) '#', (int) (short) 1);
        int int17 = mathTest0.multiply(1, (-1));
        int int19 = mathTest0.square((-3168));
        int int21 = mathTest0.square(2704);
        int int24 = mathTest0.add((-638930), (-1926779106));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10036224 + "'", int19 == 10036224);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7311616 + "'", int21 == 7311616);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1927418036) + "'", int24 == (-1927418036));
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
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
        int int28 = mathTest0.add(604334705, 7416);
        int int30 = mathTest0.square(541139968);
        java.lang.Class<?> wildcardClass31 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-461244) + "'", int14 == (-461244));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2849 + "'", int17 == 2849);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 268 + "'", int20 == 268);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-2683240) + "'", int23 == (-2683240));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 604334705 + "'", int25 == 604334705);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 604342121 + "'", int28 == 604342121);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1292894208 + "'", int30 == 1292894208);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int8 = mathTest0.square((-51));
        int int11 = mathTest0.divide((-3222), 112);
        int int14 = mathTest0.multiply(1, (-134969936));
        int int17 = mathTest0.multiply(2030043136, (-134938));
        int int20 = mathTest0.divide(18974736, 1892066507);
        int int23 = mathTest0.divide(9117553, 263609);
        int int26 = mathTest0.add((-1563969599), 7627);
        int int29 = mathTest0.divide(29421456, (-1190896240));
        int int32 = mathTest0.multiply(461883871, (-1499196338));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2601 + "'", int8 == 2601);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-28) + "'", int11 == (-28));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-134969936) + "'", int14 == (-134969936));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1241513984) + "'", int17 == (-1241513984));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 34 + "'", int23 == 34);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1563961972) + "'", int26 == (-1563961972));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-335483406) + "'", int32 == (-335483406));
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int5 = mathTest0.square((-1735140));
        int int8 = mathTest0.add(3232, (-1156));
        int int11 = mathTest0.divide(5541, 362673937);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-61254896) + "'", int5 == (-61254896));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2076 + "'", int8 == 2076);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int12 = mathTest0.multiply(0, 210);
        int int15 = mathTest0.divide((-1479288672), 1393254656);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
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
        int int32 = mathTest0.subtract((-253929393), 42);
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-253929435) + "'", int32 == (-253929435));
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.subtract((int) (short) 0, (int) '#');
        int int15 = mathTest0.subtract(163, 4700);
        int int18 = mathTest0.subtract(0, 3364195);
        int int21 = mathTest0.divide((-167544), (-1838229715));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-35) + "'", int12 == (-35));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4537) + "'", int15 == (-4537));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3364195) + "'", int18 == (-3364195));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int11 = mathTest0.square(3232);
        int int14 = mathTest0.divide((-32), (int) (short) 1);
        int int17 = mathTest0.add(36, 1010);
        int int20 = mathTest0.subtract((-61), (int) (short) 10);
        int int23 = mathTest0.subtract(13, 18352);
        int int26 = mathTest0.add(15036876, 9409);
        int int29 = mathTest0.divide(1953321121, (-7));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10445824 + "'", int11 == 10445824);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-32) + "'", int14 == (-32));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1046 + "'", int17 == 1046);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-71) + "'", int20 == (-71));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-18339) + "'", int23 == (-18339));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 15046285 + "'", int26 == 15046285);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-279045874) + "'", int29 == (-279045874));
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.subtract((int) '#', (int) (short) 1);
        int int17 = mathTest0.multiply(1, (-1));
        int int20 = mathTest0.divide(5200, (-35));
        int int22 = mathTest0.square(27423396);
        int int25 = mathTest0.subtract(1429803052, 1171343693);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-148) + "'", int20 == (-148));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1830389488) + "'", int22 == (-1830389488));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 258459359 + "'", int25 == 258459359);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.multiply(10445824, 10445824);
        int int12 = mathTest0.divide(2704, (-5681));
        int int15 = mathTest0.divide(705911761, 1724707840);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1594884096 + "'", int9 == 1594884096);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
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
        int int28 = mathTest0.multiply(2002091772, (-1));
        java.lang.Class<?> wildcardClass29 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4356 + "'", int17 == 4356);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-9669) + "'", int25 == (-9669));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-2002091772) + "'", int28 == (-2002091772));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((-32), 99);
        int int9 = mathTest0.divide((-3232), 51);
        int int11 = mathTest0.square(1046);
        int int13 = mathTest0.square(950697);
        int int16 = mathTest0.divide((-13525933), (-330390172));
        int int19 = mathTest0.subtract(408675612, (-963545038));
        int int22 = mathTest0.divide(0, 790165274);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3168) + "'", int6 == (-3168));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-63) + "'", int9 == (-63));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1094116 + "'", int11 == 1094116);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1881653649 + "'", int13 == 1881653649);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1372220650 + "'", int19 == 1372220650);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(3232, (-3168));
        int int8 = mathTest0.square((-3232));
        int int11 = mathTest0.divide(0, (-1962934273));
        int int14 = mathTest0.add(2005938200, 1964249568);
        int int16 = mathTest0.square(12496225);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10445824 + "'", int8 == 10445824);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-324779528) + "'", int14 == (-324779528));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-781697343) + "'", int16 == (-781697343));
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(3232, (-3168));
        int int9 = mathTest0.divide(5151, (-399));
        int int12 = mathTest0.divide(15, (-2623));
        int int14 = mathTest0.square(1296);
        int int17 = mathTest0.multiply((-8), 1118899305);
        int int19 = mathTest0.square(574619648);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-12) + "'", int9 == (-12));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1679616 + "'", int14 == 1679616);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-361259848) + "'", int17 == (-361259848));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int13 = mathTest0.square(10036224);
        int int16 = mathTest0.multiply(290, 84100);
        int int19 = mathTest0.multiply((-167510), 247133760);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 219152384 + "'", int13 == 219152384);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 24389000 + "'", int16 == 24389000);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1813628544 + "'", int19 == 1813628544);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.subtract((int) '#', (int) (short) 100);
        int int12 = mathTest0.divide(1136037201, 16314474);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-65) + "'", int9 == (-65));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 69 + "'", int12 == 69);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.add((int) (short) 1, 0);
        int int14 = mathTest0.add(51, (-3232));
        int int17 = mathTest0.add(1500625, (-6476));
        int int20 = mathTest0.multiply((-12), (-1042405));
        int int23 = mathTest0.divide(1171343693, (-1065087038));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3181) + "'", int14 == (-3181));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1494149 + "'", int17 == 1494149);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 12508860 + "'", int20 == 12508860);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int12 = mathTest0.divide((-63), (-990));
        int int15 = mathTest0.multiply(4356, (-31));
        java.lang.Class<?> wildcardClass16 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-135036) + "'", int15 == (-135036));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square(5200);
        int int14 = mathTest0.add((int) (short) 0, (-5592));
        int int16 = mathTest0.square((-810437336));
        int int18 = mathTest0.square((-171004999));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27040000 + "'", int11 == 27040000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-5592) + "'", int14 == (-5592));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1316907456) + "'", int16 == (-1316907456));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-353588303) + "'", int18 == (-353588303));
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.multiply(34, 1568);
        java.lang.Class<?> wildcardClass13 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53312 + "'", int12 == 53312);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        int int20 = mathTest0.multiply(99, (int) (short) 1);
        int int23 = mathTest0.divide((-5592), (-123));
        int int26 = mathTest0.add(1966983405, 0);
        int int29 = mathTest0.subtract(583058802, (-67));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 99 + "'", int20 == 99);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 45 + "'", int23 == 45);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1966983405 + "'", int26 == 1966983405);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 583058869 + "'", int29 == 583058869);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int13 = mathTest0.square(10036224);
        int int16 = mathTest0.multiply(1336336, (-1156));
        int int19 = mathTest0.multiply(950697, 36);
        int int22 = mathTest0.divide((-648771056), 2045219072);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 219152384 + "'", int13 == 219152384);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1544804416) + "'", int16 == (-1544804416));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 34225092 + "'", int19 == 34225092);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.subtract((int) '#', (int) (short) 1);
        int int17 = mathTest0.multiply(112, (-262701));
        int int20 = mathTest0.add(4, (-461244));
        int int23 = mathTest0.subtract((-1732640), 2500);
        int int26 = mathTest0.subtract((-29338412), (-7022));
        int int29 = mathTest0.add((-375664945), 383163684);
        int int32 = mathTest0.add(0, 43560784);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-29422512) + "'", int17 == (-29422512));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-461240) + "'", int20 == (-461240));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1735140) + "'", int23 == (-1735140));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-29331390) + "'", int26 == (-29331390));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 7498739 + "'", int29 == 7498739);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 43560784 + "'", int32 == 43560784);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) (short) 1);
        int int12 = mathTest0.divide(1024, (-138));
        int int15 = mathTest0.divide((-190877024), (-301760333));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-7) + "'", int12 == (-7));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int11 = mathTest0.square(133);
        int int14 = mathTest0.multiply(9700, 133);
        int int17 = mathTest0.subtract(0, 1156);
        int int20 = mathTest0.subtract(1597032137, 4011570);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 17689 + "'", int11 == 17689);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1290100 + "'", int14 == 1290100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1156) + "'", int17 == (-1156));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1593020567 + "'", int20 == 1593020567);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.add((int) (byte) -1, (int) '4');
        int int12 = mathTest0.multiply((int) 'a', (int) (short) 100);
        int int15 = mathTest0.divide((-1544804416), 29421468);
        int int18 = mathTest0.divide((-134969936), (-1397198556));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9700 + "'", int12 == 9700);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-52) + "'", int15 == (-52));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.divide(0, 5200);
        int int14 = mathTest0.multiply((int) (short) 1, (int) (short) 10);
        int int17 = mathTest0.subtract((-50960), (-63));
        int int19 = mathTest0.square(168950847);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-50897) + "'", int17 == (-50897));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1693063041 + "'", int19 == 1693063041);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(1581, (-13));
        int int14 = mathTest0.square(1181812661);
        int int17 = mathTest0.add((-127500), 1829843475);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1568 + "'", int12 == 1568);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-905615879) + "'", int14 == (-905615879));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1829715975 + "'", int17 == 1829715975);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.divide(0, 5200);
        int int14 = mathTest0.multiply((int) (short) 1, (int) (short) 10);
        int int16 = mathTest0.square((-27036768));
        int int19 = mathTest0.multiply(461828740, 1812065);
        int int22 = mathTest0.subtract(0, 4594735);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 569975808 + "'", int16 == 569975808);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2091942908) + "'", int19 == (-2091942908));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-4594735) + "'", int22 == (-4594735));
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
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
        int int28 = mathTest0.square(69);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-32969632) + "'", int17 == (-32969632));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1184491520 + "'", int26 == 1184491520);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4761 + "'", int28 == 4761);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int12 = mathTest0.add(1962934272, (-3196));
        int int14 = mathTest0.square(950697);
        int int17 = mathTest0.add(547640937, 0);
        int int20 = mathTest0.subtract((-923619227), 1530126);
        int int23 = mathTest0.divide((-2079326208), 292338665);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1962931076 + "'", int12 == 1962931076);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1881653649 + "'", int14 == 1881653649);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 547640937 + "'", int17 == 547640937);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-925149353) + "'", int20 == (-925149353));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-7) + "'", int23 == (-7));
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.multiply(10445824, 10445824);
        int int12 = mathTest0.divide(2704, (-5681));
        int int14 = mathTest0.square(712775872);
        int int16 = mathTest0.square(1156);
        int int19 = mathTest0.subtract((-1744279840), (-1625887059));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1594884096 + "'", int9 == 1594884096);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-60518400) + "'", int14 == (-60518400));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1336336 + "'", int16 == 1336336);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-118392781) + "'", int19 == (-118392781));
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.subtract((int) (short) -1, (int) (short) 100);
        int int16 = mathTest0.square(101);
        int int19 = mathTest0.add(4594735, 69033050);
        int int22 = mathTest0.subtract(1946522112, (-83559871));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-101) + "'", int14 == (-101));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10201 + "'", int16 == 10201);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 73627785 + "'", int19 == 73627785);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2030081983 + "'", int22 == 2030081983);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.add((int) (byte) -1, (int) '4');
        int int12 = mathTest0.subtract(150, 51);
        int int15 = mathTest0.add((int) (short) 1, 1);
        int int18 = mathTest0.multiply((-148), (-124));
        int int21 = mathTest0.subtract((int) (byte) -1, (-805857024));
        int int24 = mathTest0.multiply((-655109487), 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 99 + "'", int12 == 99);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 18352 + "'", int18 == 18352);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 805857023 + "'", int21 == 805857023);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1236707713) + "'", int24 == (-1236707713));
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square((-43));
        int int14 = mathTest0.subtract(1156, (-3181));
        int int17 = mathTest0.divide((-1074639159), 1474726277);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1849 + "'", int11 == 1849);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4337 + "'", int14 == 4337);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((int) (short) -1, 36);
        int int18 = mathTest0.divide((-1488), 112);
        int int20 = mathTest0.square((-31));
        int int23 = mathTest0.add((-5000), 1108809);
        int int26 = mathTest0.add(27426628, (-3232));
        int int29 = mathTest0.add(1174437474, 12119495);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-13) + "'", int18 == (-13));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 961 + "'", int20 == 961);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1103809 + "'", int23 == 1103809);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 27423396 + "'", int26 == 27423396);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1186556969 + "'", int29 == 1186556969);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.subtract((int) (short) -1, (int) (short) 100);
        int int16 = mathTest0.square(2006064019);
        int int19 = mathTest0.multiply(1156, 568167684);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-101) + "'", int14 == (-101));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 547640937 + "'", int16 == 547640937);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-328153584) + "'", int19 == (-328153584));
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((-1), (-50));
        int int18 = mathTest0.subtract(429549516, 0);
        int int20 = mathTest0.square((-30022584));
        int int22 = mathTest0.square(47);
        int int24 = mathTest0.square(27038596);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 429549516 + "'", int18 == 429549516);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 828396608 + "'", int20 == 828396608);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2209 + "'", int22 == 2209);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 635493392 + "'", int24 == 635493392);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.multiply(101, 51);
        int int17 = mathTest0.divide((-65), (-295593424));
        int int20 = mathTest0.divide(27040000, 1494149);
        int int22 = mathTest0.square(1010);
        int int25 = mathTest0.subtract((-2568), 9114210);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5151 + "'", int14 == 5151);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 18 + "'", int20 == 18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1020100 + "'", int22 == 1020100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-9116778) + "'", int25 == (-9116778));
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
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
        java.lang.Class<?> wildcardClass33 = mathTest0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int12 = mathTest0.add(1962934272, (-3196));
        int int14 = mathTest0.square(950697);
        int int17 = mathTest0.add(547640937, 0);
        int int20 = mathTest0.subtract((-923619227), 1530126);
        int int23 = mathTest0.divide((-1993779136), 4389);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1962931076 + "'", int12 == 1962931076);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1881653649 + "'", int14 == 1881653649);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 547640937 + "'", int17 == 547640937);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-925149353) + "'", int20 == (-925149353));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-454267) + "'", int23 == (-454267));
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int13 = mathTest0.square(10036224);
        int int15 = mathTest0.square(182);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 219152384 + "'", int13 == 219152384);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33124 + "'", int15 == 33124);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.subtract((-9103), 13516830);
        int int16 = mathTest0.square((-116748));
        int int19 = mathTest0.add((-24), (-1316907456));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-13525933) + "'", int14 == (-13525933));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 745193616 + "'", int16 == 745193616);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1316907480) + "'", int19 == (-1316907480));
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
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
        int int27 = mathTest0.square(730247568);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 99 + "'", int20 == 99);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-50935) + "'", int25 == (-50935));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1108840192) + "'", int27 == (-1108840192));
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.subtract((int) (short) 0, (int) '#');
        int int15 = mathTest0.subtract((-1), 100);
        int int17 = mathTest0.square(1296);
        int int20 = mathTest0.divide(2005761053, 32);
        int int23 = mathTest0.add(1496241, 2045219072);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-35) + "'", int12 == (-35));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-101) + "'", int15 == (-101));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1679616 + "'", int17 == 1679616);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 62680032 + "'", int20 == 62680032);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2046715313 + "'", int23 == 2046715313);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((-32), 99);
        int int8 = mathTest0.square((-1156));
        int int11 = mathTest0.add(1024, (int) (byte) 1);
        int int14 = mathTest0.add((-33116283), 0);
        int int17 = mathTest0.add(91107025, 26569);
        java.lang.Class<?> wildcardClass18 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3168) + "'", int6 == (-3168));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1336336 + "'", int8 == 1336336);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1025 + "'", int11 == 1025);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-33116283) + "'", int14 == (-33116283));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 91133594 + "'", int17 == 91133594);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square(5200);
        int int14 = mathTest0.multiply((-7), 13);
        int int17 = mathTest0.multiply((-27034267), (-13));
        int int19 = mathTest0.square((-27046437));
        int int22 = mathTest0.multiply((-3364195), 15036876);
        int int25 = mathTest0.subtract((-1845686), 647036928);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27040000 + "'", int11 == 27040000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-91) + "'", int14 == (-91));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 351445471 + "'", int17 == 351445471);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-485525159) + "'", int19 == (-485525159));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-858242532) + "'", int22 == (-858242532));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-648882614) + "'", int25 == (-648882614));
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((-32), 99);
        int int9 = mathTest0.divide((-3232), 51);
        int int12 = mathTest0.divide(198988216, (-1437108180));
        int int14 = mathTest0.square(586257659);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3168) + "'", int6 == (-3168));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-63) + "'", int9 == (-63));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-2092356071) + "'", int14 == (-2092356071));
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(1581, (-13));
        int int14 = mathTest0.square(1181812661);
        int int17 = mathTest0.add((-1653864505), 1094116);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1568 + "'", int12 == 1568);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-905615879) + "'", int14 == (-905615879));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1652770389) + "'", int17 == (-1652770389));
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.add((int) (byte) -1, (int) '4');
        int int12 = mathTest0.subtract(150, 51);
        int int15 = mathTest0.add((int) (short) 1, 1);
        int int18 = mathTest0.multiply((-148), (-124));
        int int21 = mathTest0.subtract((int) (short) 10, 1581);
        int int24 = mathTest0.multiply(4198401, (-160369452));
        java.lang.Class<?> wildcardClass25 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 99 + "'", int12 == 99);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 18352 + "'", int18 == 18352);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1571) + "'", int21 == (-1571));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 985543892 + "'", int24 == 985543892);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.multiply(101, 51);
        int int17 = mathTest0.multiply(34, (-50960));
        int int19 = mathTest0.square(101);
        int int21 = mathTest0.square(163);
        int int24 = mathTest0.multiply(4356, 10000);
        int int27 = mathTest0.divide((-1095390208), (-268034188));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5151 + "'", int14 == 5151);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1732640) + "'", int17 == (-1732640));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10201 + "'", int19 == 10201);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 26569 + "'", int21 == 26569);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 43560000 + "'", int24 == 43560000);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
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
        int int29 = mathTest0.square(2500);
        int int31 = mathTest0.square((-253929393));
        int int34 = mathTest0.divide(261876776, (-83560366));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3232) + "'", int15 == (-3232));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 31258 + "'", int18 == 31258);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-5592) + "'", int21 == (-5592));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9669 + "'", int24 == 9669);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 6250000 + "'", int29 == 6250000);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1227069343) + "'", int31 == (-1227069343));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-3) + "'", int34 == (-3));
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
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
        int int28 = mathTest0.add(604334705, 7416);
        int int30 = mathTest0.square(541139968);
        int int33 = mathTest0.subtract(2209, (-1425733996));
        int int36 = mathTest0.subtract((-1307174230), 27038596);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-461244) + "'", int14 == (-461244));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2849 + "'", int17 == 2849);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 268 + "'", int20 == 268);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-2683240) + "'", int23 == (-2683240));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 604334705 + "'", int25 == 604334705);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 604342121 + "'", int28 == 604342121);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1292894208 + "'", int30 == 1292894208);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1425736205 + "'", int33 == 1425736205);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1334212826) + "'", int36 == (-1334212826));
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int5 = mathTest0.square(1053);
        int int7 = mathTest0.square(12508860);
        int int10 = mathTest0.divide(38271, (-989988));
        int int12 = mathTest0.square((-957487));
        java.lang.Class<?> wildcardClass13 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1108809 + "'", int5 == 1108809);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1624939024 + "'", int7 == 1624939024);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1953321121 + "'", int12 == 1953321121);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.subtract((int) (short) 0, (int) '#');
        int int15 = mathTest0.subtract((-1), 100);
        int int18 = mathTest0.add(5151, (-51));
        int int21 = mathTest0.divide(27040000, (-1086356767));
        int int24 = mathTest0.add((-45436), 0);
        int int26 = mathTest0.square((-1208038011));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-35) + "'", int12 == (-35));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-101) + "'", int15 == (-101));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5100 + "'", int18 == 5100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-45436) + "'", int24 == (-45436));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1628813543) + "'", int26 == (-1628813543));
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.multiply(10445824, 10445824);
        int int12 = mathTest0.subtract((int) 'a', 9669);
        int int15 = mathTest0.add(1094116, (-66));
        int int18 = mathTest0.multiply(533500814, 1425784004);
        int int20 = mathTest0.square((-16458735));
        int int23 = mathTest0.subtract(1029237664, 1174437505);
        int int26 = mathTest0.multiply(4353, 770737356);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1594884096 + "'", int9 == 1594884096);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9572) + "'", int12 == (-9572));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1094050 + "'", int15 == 1094050);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-650690376) + "'", int18 == (-650690376));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2075474209 + "'", int20 == 2075474209);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-145199841) + "'", int23 == (-145199841));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 650252492 + "'", int26 == 650252492);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(3232, (-3168));
        int int9 = mathTest0.divide(5151, (-399));
        int int12 = mathTest0.divide(5200, (-32969632));
        int int15 = mathTest0.add((-9669), 1496241);
        int int18 = mathTest0.multiply(842501840, 15046285);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-12) + "'", int9 == (-12));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1486572 + "'", int15 == 1486572);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-162035568) + "'", int18 == (-162035568));
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
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
        int int31 = mathTest0.divide((-676798764), 1653451088);
        int int34 = mathTest0.subtract(245115407, 337082453);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-91967046) + "'", int34 == (-91967046));
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((-1), (-50));
        int int18 = mathTest0.add((-6476), 1962934338);
        int int21 = mathTest0.subtract((-813), 12);
        int int23 = mathTest0.square((-1081));
        int int25 = mathTest0.square(73884);
        int int28 = mathTest0.add((-1830389488), 1593020567);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1962927862 + "'", int18 == 1962927862);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-825) + "'", int21 == (-825));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1168561 + "'", int23 == 1168561);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1163878160 + "'", int25 == 1163878160);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-237368921) + "'", int28 == (-237368921));
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
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
        int int33 = mathTest0.subtract(1979926512, 1458409873);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 521516639 + "'", int33 == 521516639);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.subtract((int) (short) 0, (int) '#');
        int int15 = mathTest0.subtract((-1), 100);
        int int18 = mathTest0.add(5151, (-51));
        int int21 = mathTest0.divide(27040000, (-1086356767));
        int int24 = mathTest0.add((-45436), 0);
        java.lang.Class<?> wildcardClass25 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-35) + "'", int12 == (-35));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-101) + "'", int15 == (-101));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5100 + "'", int18 == 5100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-45436) + "'", int24 == (-45436));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int12 = mathTest0.add(290, 2);
        int int14 = mathTest0.square(249987721);
        int int16 = mathTest0.square((-881163264));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 292 + "'", int12 == 292);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-860132015) + "'", int14 == (-860132015));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 336592896 + "'", int16 == 336592896);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(12, 100);
        int int15 = mathTest0.multiply(2, 1046);
        int int18 = mathTest0.add((-5486), 0);
        int int21 = mathTest0.divide((-52), 117);
        int int24 = mathTest0.multiply(1397199196, 1494149);
        int int27 = mathTest0.add(18931201, (-829216992));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 112 + "'", int12 == 112);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2092 + "'", int15 == 2092);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-5486) + "'", int18 == (-5486));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-907291444) + "'", int24 == (-907291444));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-810285791) + "'", int27 == (-810285791));
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(12, 100);
        int int15 = mathTest0.subtract(0, (-1156));
        int int18 = mathTest0.divide((-1086356767), 1094116);
        int int21 = mathTest0.subtract(1861156092, 565980994);
        int int24 = mathTest0.subtract((-907291444), 2209);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 112 + "'", int12 == 112);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1156 + "'", int15 == 1156);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-992) + "'", int18 == (-992));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1295175098 + "'", int21 == 1295175098);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-907293653) + "'", int24 == (-907293653));
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
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
        int int31 = mathTest0.square(420490433);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1374873985 + "'", int31 == 1374873985);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((-32), 99);
        int int9 = mathTest0.divide((int) (short) 0, (int) (short) 100);
        int int12 = mathTest0.add((-3295), (-3181));
        int int15 = mathTest0.add(0, 1346542369);
        int int18 = mathTest0.add(2499561, (-923619184));
        int int20 = mathTest0.square(3232);
        int int23 = mathTest0.subtract(960400, 12119495);
        int int25 = mathTest0.square(596318818);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3168) + "'", int6 == (-3168));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6476) + "'", int12 == (-6476));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1346542369 + "'", int15 == 1346542369);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-921119623) + "'", int18 == (-921119623));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10445824 + "'", int20 == 10445824);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-11159095) + "'", int23 == (-11159095));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1965297028 + "'", int25 == 1965297028);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.add((int) (byte) -1, (int) '4');
        int int12 = mathTest0.multiply((int) 'a', (int) (short) 100);
        int int15 = mathTest0.divide(36, (-35));
        int int18 = mathTest0.subtract(0, 1237);
        int int21 = mathTest0.divide((-13503587), 1496089);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9700 + "'", int12 == 9700);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1237) + "'", int18 == (-1237));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-9) + "'", int21 == (-9));
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
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
        int int28 = mathTest0.multiply((-1752770602), 1012141057);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10036224 + "'", int19 == 10036224);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 148155 + "'", int25 == 148155);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-472064042) + "'", int28 == (-472064042));
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.subtract((int) '#', (int) (short) 1);
        int int17 = mathTest0.multiply(1, (-1));
        int int20 = mathTest0.add(101, (int) ' ');
        int int23 = mathTest0.multiply((-1641194714), (-1991992544));
        int int25 = mathTest0.square((-545630212));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 133 + "'", int20 == 133);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-940349760) + "'", int23 == (-940349760));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 40714256 + "'", int25 == 40714256);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
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
        int int28 = mathTest0.subtract(2005938200, 1067851684);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 99 + "'", int20 == 99);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 938086516 + "'", int28 == 938086516);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int11 = mathTest0.square(133);
        int int14 = mathTest0.multiply(3364195, 16699);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 17689 + "'", int11 == 17689);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 344117457 + "'", int14 == 344117457);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.add(999698, (-365052929));
        int int12 = mathTest0.multiply(53312, (-375664945));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-364053231) + "'", int9 == (-364053231));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-17046592) + "'", int12 == (-17046592));
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(12, 100);
        int int15 = mathTest0.add(2601, (-51));
        int int18 = mathTest0.divide(1881653649, 34);
        int int21 = mathTest0.subtract((-29422664), 1362701056);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 112 + "'", int12 == 112);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2550 + "'", int15 == 2550);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 55342754 + "'", int18 == 55342754);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1392123720) + "'", int21 == (-1392123720));
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
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
        int int37 = mathTest0.divide(1861140963, 1351683014);
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.add(2092, 1494149);
        int int18 = mathTest0.add(1357853952, (-461144));
        int int21 = mathTest0.add(18352, (-1222171648));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1496241 + "'", int15 == 1496241);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1357392808 + "'", int18 == 1357392808);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1222153296) + "'", int21 == (-1222153296));
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.add(100, (int) (short) 1);
        int int9 = mathTest0.subtract(0, 0);
        int int11 = mathTest0.square(12);
        int int14 = mathTest0.subtract((-1156), (-29422512));
        int int16 = mathTest0.square(18352);
        int int18 = mathTest0.square((-14756608));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 144 + "'", int11 == 144);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29421356 + "'", int14 == 29421356);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 336795904 + "'", int16 == 336795904);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1657208832) + "'", int18 == (-1657208832));
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
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
        java.lang.Class<?> wildcardClass26 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 99 + "'", int20 == 99);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
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
        int int28 = mathTest0.subtract((-1990353780), 533500814);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4356 + "'", int17 == 4356);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-9669) + "'", int25 == (-9669));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1771112702 + "'", int28 == 1771112702);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.add((int) (short) 1, 0);
        int int13 = mathTest0.square((-1874329914));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 258048292 + "'", int13 == 258048292);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.add((int) (short) 1, 0);
        int int14 = mathTest0.add(51, (-3232));
        int int17 = mathTest0.subtract((-3212), (-134969827));
        int int19 = mathTest0.square((-601128));
        int int22 = mathTest0.add((-578834862), 1549450352);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3181) + "'", int14 == (-3181));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 134966615 + "'", int17 == 134966615);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 577619520 + "'", int19 == 577619520);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 970615490 + "'", int22 == 970615490);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int12 = mathTest0.add(290, 2);
        int int15 = mathTest0.multiply((-13503600), (-3243));
        int int18 = mathTest0.multiply(27423396, 574619648);
        java.lang.Class<?> wildcardClass19 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 292 + "'", int12 == 292);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 842501840 + "'", int15 == 842501840);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1895825408 + "'", int18 == 1895825408);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.subtract((int) (short) -1, (int) (short) 100);
        int int16 = mathTest0.square(2006064019);
        int int19 = mathTest0.subtract((-13525898), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-101) + "'", int14 == (-101));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 547640937 + "'", int16 == 547640937);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-13525898) + "'", int19 == (-13525898));
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.add(999698, (-365052929));
        int int12 = mathTest0.add(842349056, 1348961447);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-364053231) + "'", int9 == (-364053231));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2103656793) + "'", int12 == (-2103656793));
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.divide((-101), 2);
        int int9 = mathTest0.multiply(101, 10);
        int int12 = mathTest0.divide(176203232, 11082582);
        int int15 = mathTest0.add((-921497201), (-369098751));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1010 + "'", int9 == 1010);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1290595952) + "'", int15 == (-1290595952));
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
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
        int int29 = mathTest0.add(0, (int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.subtract((int) (short) 0, (int) '#');
        int int15 = mathTest0.add((-101), 1024);
        int int18 = mathTest0.subtract(112, 3329);
        int int21 = mathTest0.multiply(26569, 9409);
        int int23 = mathTest0.square((-13));
        int int26 = mathTest0.multiply((-364053231), (-1111162880));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-35) + "'", int12 == (-35));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 923 + "'", int15 == 923);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3217) + "'", int18 == (-3217));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 249987721 + "'", int21 == 249987721);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 169 + "'", int23 == 169);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1259667456 + "'", int26 == 1259667456);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int11 = mathTest0.square(3232);
        int int14 = mathTest0.divide((-32), (int) (short) 1);
        int int17 = mathTest0.add(36, 1010);
        int int20 = mathTest0.add(1296, 0);
        int int23 = mathTest0.divide(383163684, 1667010002);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10445824 + "'", int11 == 10445824);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-32) + "'", int14 == (-32));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1046 + "'", int17 == 1046);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1296 + "'", int20 == 1296);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
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
        int int29 = mathTest0.subtract(1023, 205537);
        int int32 = mathTest0.add((-190492), 29833266);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3232) + "'", int15 == (-3232));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 31258 + "'", int18 == 31258);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 26569 + "'", int20 == 26569);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-4472) + "'", int23 == (-4472));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1649770749 + "'", int26 == 1649770749);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-204514) + "'", int29 == (-204514));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 29642774 + "'", int32 == 29642774);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.subtract((int) '#', (int) (short) 1);
        int int17 = mathTest0.multiply(112, (-262701));
        int int20 = mathTest0.add(4, (-461244));
        int int23 = mathTest0.subtract((-1732640), 2500);
        int int26 = mathTest0.add(296310, 1136037201);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-29422512) + "'", int17 == (-29422512));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-461240) + "'", int20 == (-461240));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1735140) + "'", int23 == (-1735140));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1136333511 + "'", int26 == 1136333511);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(1290100, 9700);
        int int9 = mathTest0.divide((-3181), (-101));
        int int12 = mathTest0.multiply(2, 1024);
        int int15 = mathTest0.multiply((-648771056), 1679616);
        int int18 = mathTest0.multiply((-564040361), (-797466));
        int int21 = mathTest0.multiply(659992241, 152);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 133 + "'", int6 == 133);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 31 + "'", int9 == 31);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2048 + "'", int12 == 2048);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1503391744) + "'", int15 == (-1503391744));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-324450262) + "'", int18 == (-324450262));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1534572824 + "'", int21 == 1534572824);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(5200, (-341));
        int int20 = mathTest0.subtract((-2), 990);
        int int23 = mathTest0.add(9113164, 2499561);
        int int25 = mathTest0.square(18948609);
        int int28 = mathTest0.divide(5100, (-270));
        int int31 = mathTest0.divide(461828740, 1581082985);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5541 + "'", int17 == 5541);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-992) + "'", int20 == (-992));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 11612725 + "'", int23 == 11612725);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-892976127) + "'", int25 == (-892976127));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-18) + "'", int28 == (-18));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.subtract((int) (short) -1, (int) (short) 100);
        int int17 = mathTest0.divide(1, 100);
        int int20 = mathTest0.add((-923619184), (-43));
        int int23 = mathTest0.divide((-51), (-367));
        int int25 = mathTest0.square((-2046820352));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-101) + "'", int14 == (-101));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-923619227) + "'", int20 == (-923619227));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(1581, (-13));
        int int15 = mathTest0.multiply((-3212), (-399));
        int int18 = mathTest0.subtract(4858344, 22500);
        int int21 = mathTest0.subtract(980100, 1022217718);
        int int24 = mathTest0.add((-388956160), 1581);
        int int27 = mathTest0.divide(27040000, 52229);
        int int30 = mathTest0.multiply((-1464725391), (-390241792));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1568 + "'", int12 == 1568);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1281588 + "'", int15 == 1281588);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4835844 + "'", int18 == 4835844);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1021237618) + "'", int21 == (-1021237618));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-388954579) + "'", int24 == (-388954579));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 517 + "'", int27 == 517);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1246215680) + "'", int30 == (-1246215680));
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square((-32969632));
        int int14 = mathTest0.subtract((int) (short) 10, (-1190));
        int int17 = mathTest0.divide(750, 52229);
        int int20 = mathTest0.add((-29338412), 3307);
        int int23 = mathTest0.divide((-1623939036), (-3222));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 541139968 + "'", int11 == 541139968);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1200 + "'", int14 == 1200);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-29335105) + "'", int20 == (-29335105));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 504015 + "'", int23 == 504015);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
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
        int int28 = mathTest0.square(1069884224);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10445824 + "'", int11 == 10445824);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-32) + "'", int14 == (-32));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1046 + "'", int17 == 1046);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1852038144 + "'", int20 == 1852038144);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 217038 + "'", int26 == 217038);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-983920640) + "'", int28 == (-983920640));
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
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
        int int28 = mathTest0.add(762552, 2601);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3307 + "'", int20 == 3307);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 11 + "'", int23 == 11);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1442018727) + "'", int25 == (-1442018727));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 765153 + "'", int28 == 765153);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int8 = mathTest0.square((-51));
        int int11 = mathTest0.divide((-3222), 112);
        int int14 = mathTest0.multiply(1, (-134969936));
        int int17 = mathTest0.multiply(2030043136, (-134938));
        int int20 = mathTest0.add(2500, (-27036767));
        int int23 = mathTest0.add(13503598, 533500814);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2601 + "'", int8 == 2601);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-28) + "'", int11 == (-28));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-134969936) + "'", int14 == (-134969936));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1241513984) + "'", int17 == (-1241513984));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-27034267) + "'", int20 == (-27034267));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 547004412 + "'", int23 == 547004412);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.add((int) (short) 1, (-32));
        int int12 = mathTest0.divide((-210338647), 1208021816);
        int int15 = mathTest0.divide(1962934338, 15046285);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-31) + "'", int9 == (-31));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 130 + "'", int15 == 130);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int8 = mathTest0.square((-51));
        int int11 = mathTest0.divide((-3222), 112);
        int int14 = mathTest0.multiply(1, (-134969936));
        int int17 = mathTest0.multiply(2030043136, (-134938));
        int int20 = mathTest0.divide(18974736, 1892066507);
        int int22 = mathTest0.square((-821630));
        int int25 = mathTest0.multiply((-865176864), 168950847);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2601 + "'", int8 == 2601);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-28) + "'", int11 == (-28));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-134969936) + "'", int14 == (-134969936));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1241513984) + "'", int17 == (-1241513984));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 765991428 + "'", int22 == 765991428);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1763886368 + "'", int25 == 1763886368);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((int) (short) -1, 36);
        int int17 = mathTest0.square((-66));
        int int20 = mathTest0.subtract(660805517, (-963545038));
        // The following exception was thrown during execution in test generation
        try {
            int int23 = mathTest0.divide(0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Cannot divide by zero.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4356 + "'", int17 == 4356);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1624350555 + "'", int20 == 1624350555);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.divide((-101), 2);
        int int9 = mathTest0.multiply(101, 10);
        int int12 = mathTest0.multiply(2601, (-101));
        int int15 = mathTest0.subtract((-27036768), 9669);
        int int18 = mathTest0.divide(1962924603, 53312);
        int int21 = mathTest0.add(1764582825, 2045219072);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1010 + "'", int9 == 1010);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-262701) + "'", int12 == (-262701));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-27046437) + "'", int15 == (-27046437));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 36819 + "'", int18 == 36819);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-485165399) + "'", int21 == (-485165399));
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int5 = mathTest0.square((int) (byte) 10);
        int int7 = mathTest0.square(51);
        int int10 = mathTest0.add((-29335105), (-63));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2601 + "'", int7 == 2601);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-29335168) + "'", int10 == (-29335168));
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
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
        int int28 = mathTest0.add(51, 1413121024);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3181) + "'", int14 == (-3181));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1494149 + "'", int17 == 1494149);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 12508860 + "'", int20 == 12508860);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 12124646 + "'", int23 == 12124646);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1190745152 + "'", int25 == 1190745152);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1413121075 + "'", int28 == 1413121075);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.subtract((int) '#', (int) (short) 1);
        int int17 = mathTest0.multiply(1, (-1));
        int int19 = mathTest0.square((-3168));
        int int22 = mathTest0.add((-1507558223), 98);
        int int25 = mathTest0.subtract(604333301, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10036224 + "'", int19 == 10036224);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1507558125) + "'", int22 == (-1507558125));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 604333301 + "'", int25 == 604333301);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.divide(0, 5200);
        int int14 = mathTest0.add(63, (-5073684));
        int int17 = mathTest0.subtract((-845551585), 0);
        int int20 = mathTest0.subtract((-1488), 1702);
        int int23 = mathTest0.subtract(362673936, 940145899);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-5073621) + "'", int14 == (-5073621));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-845551585) + "'", int17 == (-845551585));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-3190) + "'", int20 == (-3190));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-577471963) + "'", int23 == (-577471963));
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(1581, (-13));
        int int14 = mathTest0.square(1181812661);
        int int17 = mathTest0.add((-1404), 604334705);
        int int20 = mathTest0.multiply(1086734609, 1924149248);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1568 + "'", int12 == 1568);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-905615879) + "'", int14 == (-905615879));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 604333301 + "'", int17 == 604333301);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2044932096 + "'", int20 == 2044932096);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        mathTest mathTest0 = new mathTest();
        int int2 = mathTest0.square((-101));
        int int5 = mathTest0.multiply(0, 1024);
        int int8 = mathTest0.divide((-461244), 11612725);
        int int11 = mathTest0.divide(115, 1325028);
        int int14 = mathTest0.divide(963499229, (-736161692));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10201 + "'", int2 == 10201);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.divide(0, 5200);
        int int14 = mathTest0.multiply((int) (short) 1, (int) (short) 10);
        int int17 = mathTest0.multiply((-3232), 10201);
        int int20 = mathTest0.subtract(63, (-990));
        int int23 = mathTest0.add(112, 52);
        java.lang.Class<?> wildcardClass24 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-32969632) + "'", int17 == (-32969632));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1053 + "'", int20 == 1053);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 164 + "'", int23 == 164);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.add(52, 98);
        int int17 = mathTest0.add((-13), (-364053231));
        int int20 = mathTest0.multiply(52, (-3222));
        int int23 = mathTest0.divide(5405, 1174437540);
        int int25 = mathTest0.square(650252492);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 150 + "'", int14 == 150);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-364053244) + "'", int17 == (-364053244));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-167544) + "'", int20 == (-167544));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 105521808 + "'", int25 == 105521808);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square((-32969632));
        int int14 = mathTest0.divide(4353, (-124));
        int int17 = mathTest0.add((-3181), 55410);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = mathTest0.divide((-134974900), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Cannot divide by zero.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 541139968 + "'", int11 == 541139968);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-35) + "'", int14 == (-35));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52229 + "'", int17 == 52229);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.subtract((int) '#', (int) (short) 100);
        int int12 = mathTest0.divide(712776852, (-27036767));
        int int15 = mathTest0.subtract((-1382167866), (-1328051));
        int int18 = mathTest0.multiply((-633972464), 10857025);
        int int21 = mathTest0.add(0, (-560508864));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-65) + "'", int9 == (-65));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-26) + "'", int12 == (-26));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1380839815) + "'", int15 == (-1380839815));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-431932144) + "'", int18 == (-431932144));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-560508864) + "'", int21 == (-560508864));
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int5 = mathTest0.square((int) (byte) 10);
        int int7 = mathTest0.square((-101));
        int int10 = mathTest0.multiply(3329, (-399));
        int int12 = mathTest0.square(29833266);
        int int15 = mathTest0.add((-802437976), 705596416);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10201 + "'", int7 == 10201);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1328271) + "'", int10 == (-1328271));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-837686844) + "'", int12 == (-837686844));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-96841560) + "'", int15 == (-96841560));
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.subtract((int) (short) 0, (int) '#');
        int int15 = mathTest0.add((-101), 1024);
        int int18 = mathTest0.subtract(112, 3329);
        int int21 = mathTest0.divide(0, (-477470903));
        int int24 = mathTest0.multiply(1667010002, 16);
        int int27 = mathTest0.add((-1637540284), 999644832);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-35) + "'", int12 == (-35));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 923 + "'", int15 == 923);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3217) + "'", int18 == (-3217));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 902356256 + "'", int24 == 902356256);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-637895452) + "'", int27 == (-637895452));
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.add((-3181), (int) 'a');
        int int16 = mathTest0.square((-5073684));
        int int18 = mathTest0.square(29175);
        int int21 = mathTest0.add(1638973851, (-1208038011));
        int int24 = mathTest0.subtract(198988216, 784);
        int int27 = mathTest0.subtract((-825465878), 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3084) + "'", int14 == (-3084));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1764640368) + "'", int16 == (-1764640368));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 851180625 + "'", int18 == 851180625);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 430935840 + "'", int21 == 430935840);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 198987432 + "'", int24 == 198987432);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-825465909) + "'", int27 == (-825465909));
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.add((int) (byte) -1, (int) '4');
        int int12 = mathTest0.multiply((int) 'a', (int) (short) 100);
        int int14 = mathTest0.square(219152384);
        int int17 = mathTest0.divide(133, (-50));
        int int20 = mathTest0.add(0, (-3181));
        int int23 = mathTest0.divide(1202187776, 1094050);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9700 + "'", int12 == 9700);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-2) + "'", int17 == (-2));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-3181) + "'", int20 == (-3181));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1098 + "'", int23 == 1098);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
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
        java.lang.Class<?> wildcardClass28 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-27036777) + "'", int21 == (-27036777));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 833797824 + "'", int24 == 833797824);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 470106961 + "'", int27 == 470106961);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((-1), (-50));
        int int18 = mathTest0.add((-6476), 1962934338);
        int int21 = mathTest0.subtract((-813), 12);
        int int23 = mathTest0.square((-1081));
        int int25 = mathTest0.square(73884);
        int int27 = mathTest0.square((-675));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1962927862 + "'", int18 == 1962927862);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-825) + "'", int21 == (-825));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1168561 + "'", int23 == 1168561);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1163878160 + "'", int25 == 1163878160);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 455625 + "'", int27 == 455625);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int5 = mathTest0.square((int) (byte) 10);
        int int7 = mathTest0.square((-101));
        int int10 = mathTest0.multiply(3329, (-399));
        int int13 = mathTest0.multiply((-101), 1336336);
        int int16 = mathTest0.divide((-648771056), (-805856915));
        int int19 = mathTest0.subtract(1702726656, 1867490);
        int int22 = mathTest0.multiply(1962931076, 53312);
        int int25 = mathTest0.multiply((-1052612928), (-557188015));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10201 + "'", int7 == 10201);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1328271) + "'", int10 == (-1328271));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-134969936) + "'", int13 == (-134969936));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1700859166 + "'", int19 == 1700859166);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 903356672 + "'", int22 == 903356672);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1343782208) + "'", int25 == (-1343782208));
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int13 = mathTest0.square(10036224);
        int int16 = mathTest0.subtract(1324965, (-6476));
        int int19 = mathTest0.multiply(13503598, (-461144));
        java.lang.Class<?> wildcardClass20 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 219152384 + "'", int13 == 219152384);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1331441 + "'", int16 == 1331441);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 599383088 + "'", int19 == 599383088);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.add((int) (byte) -1, (int) '4');
        int int12 = mathTest0.subtract(150, 51);
        int int15 = mathTest0.add((int) (short) 1, 1);
        int int18 = mathTest0.multiply((-148), (-124));
        int int21 = mathTest0.subtract((int) (byte) -1, (-805857024));
        int int23 = mathTest0.square(148155);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 99 + "'", int12 == 99);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 18352 + "'", int18 == 18352);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 805857023 + "'", int21 == 805857023);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 475067545 + "'", int23 == 475067545);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square((-32969632));
        int int14 = mathTest0.subtract((int) (short) 10, (-1190));
        int int17 = mathTest0.divide((-134974900), (-1095390208));
        int int19 = mathTest0.square((-1625887059));
        java.lang.Class<?> wildcardClass20 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 541139968 + "'", int11 == 541139968);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1200 + "'", int14 == 1200);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-901635863) + "'", int19 == (-901635863));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(1290100, 9700);
        int int9 = mathTest0.divide((-3181), (-101));
        int int12 = mathTest0.multiply(2, 1024);
        int int14 = mathTest0.square(1437107200);
        int int17 = mathTest0.divide((-707775295), (-907293653));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 133 + "'", int6 == 133);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 31 + "'", int9 == 31);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2048 + "'", int12 == 2048);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-2079326208) + "'", int14 == (-2079326208));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int8 = mathTest0.square((-51));
        int int11 = mathTest0.divide((-3222), 112);
        int int14 = mathTest0.multiply(1, (-134969936));
        int int17 = mathTest0.multiply(2030043136, (-134938));
        int int20 = mathTest0.divide(18974736, 1892066507);
        int int23 = mathTest0.divide(9117553, 263609);
        int int26 = mathTest0.add((-1563969599), 7627);
        int int29 = mathTest0.divide(29421456, (-1190896240));
        int int32 = mathTest0.subtract((-2018273368), (-1822263184));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2601 + "'", int8 == 2601);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-28) + "'", int11 == (-28));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-134969936) + "'", int14 == (-134969936));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1241513984) + "'", int17 == (-1241513984));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 34 + "'", int23 == 34);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1563961972) + "'", int26 == (-1563961972));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-196010184) + "'", int32 == (-196010184));
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.divide(0, 5200);
        int int14 = mathTest0.multiply((int) (short) 1, (int) (short) 10);
        int int17 = mathTest0.multiply((-3232), 10201);
        int int20 = mathTest0.divide(22500, 10445824);
        int int23 = mathTest0.multiply((-888552828), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-32969632) + "'", int17 == (-32969632));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) (short) 1);
        int int12 = mathTest0.subtract(51, (-66));
        int int15 = mathTest0.divide(146, 3364195);
        int int18 = mathTest0.multiply(100, 1084);
        int int21 = mathTest0.add(537603088, (-45));
        int int24 = mathTest0.add((-1657208832), 324767662);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 117 + "'", int12 == 117);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 108400 + "'", int18 == 108400);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 537603043 + "'", int21 == 537603043);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1332441170) + "'", int24 == (-1332441170));
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.subtract((int) (short) 0, (int) '#');
        int int15 = mathTest0.subtract((-1), 100);
        int int18 = mathTest0.add(1861148465, 7627);
        int int21 = mathTest0.multiply(18352, (-1752770602));
        int int24 = mathTest0.subtract(32, 1702);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-35) + "'", int12 == (-35));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-101) + "'", int15 == (-101));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1861156092 + "'", int18 == 1861156092);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1836008160) + "'", int21 == (-1836008160));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1670) + "'", int24 == (-1670));
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.add(100, (int) (short) 1);
        int int9 = mathTest0.subtract(0, 0);
        int int12 = mathTest0.multiply((-3627), (-865176864));
        int int14 = mathTest0.square(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1624607648) + "'", int12 == (-1624607648));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int8 = mathTest0.square((-51));
        int int11 = mathTest0.divide((-3222), 112);
        int int14 = mathTest0.divide((-2623), (-3212));
        int int16 = mathTest0.square((-366998));
        int int19 = mathTest0.divide(27423396, 176965908);
        int int22 = mathTest0.subtract(2045219072, 557020471);
        java.lang.Class<?> wildcardClass23 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2601 + "'", int8 == 2601);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-28) + "'", int11 == (-28));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1543545828 + "'", int16 == 1543545828);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1488198601 + "'", int22 == 1488198601);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
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
        int int37 = mathTest0.square((-1065096738));
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 786029700 + "'", int37 == 786029700);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(1290100, 9700);
        int int9 = mathTest0.multiply((-124), 12);
        int int12 = mathTest0.divide(203, (-28));
        int int15 = mathTest0.multiply(194966016, 138096199);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 133 + "'", int6 == 133);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1488) + "'", int9 == (-1488));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-7) + "'", int12 == (-7));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1903092224) + "'", int15 == (-1903092224));
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(12, 100);
        int int15 = mathTest0.add(362673937, (-7022));
        java.lang.Class<?> wildcardClass16 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 112 + "'", int12 == 112);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 362666915 + "'", int15 == 362666915);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(3232, (-3168));
        int int8 = mathTest0.square((-3232));
        int int11 = mathTest0.multiply((-161), 1568);
        int int14 = mathTest0.multiply((-60518400), 842501840);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10445824 + "'", int8 == 10445824);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-252448) + "'", int11 == (-252448));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-912982016) + "'", int14 == (-912982016));
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int5 = mathTest0.square((int) (byte) 10);
        int int8 = mathTest0.add((-1488), 3190);
        int int11 = mathTest0.divide((-1519247103), (-1236550993));
        int int13 = mathTest0.square(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1702 + "'", int8 == 1702);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int12 = mathTest0.multiply(144, 1594884096);
        int int15 = mathTest0.subtract((-992), 1042102);
        int int18 = mathTest0.multiply(1496699, 0);
        int int20 = mathTest0.square(12119495);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2030043136 + "'", int12 == 2030043136);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1043094) + "'", int15 == (-1043094));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1427500879) + "'", int20 == (-1427500879));
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
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
        int int29 = mathTest0.square(2500);
        int int31 = mathTest0.square((-253929393));
        int int34 = mathTest0.subtract(2031810816, (-1094038400));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3232) + "'", int15 == (-3232));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 31258 + "'", int18 == 31258);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-5592) + "'", int21 == (-5592));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9669 + "'", int24 == 9669);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 6250000 + "'", int29 == 6250000);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1227069343) + "'", int31 == (-1227069343));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1169118080) + "'", int34 == (-1169118080));
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int13 = mathTest0.square(10036224);
        int int16 = mathTest0.multiply(1336336, (-1156));
        int int19 = mathTest0.subtract((-1515163), 18974736);
        int int22 = mathTest0.divide((-3232), 1065108889);
        int int25 = mathTest0.multiply(138096199, 71824);
        int int27 = mathTest0.square(833798402);
        java.lang.Class<?> wildcardClass28 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 219152384 + "'", int13 == 219152384);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1544804416) + "'", int16 == (-1544804416));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-20489899) + "'", int19 == (-20489899));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1541910512 + "'", int25 == 1541910512);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1135868924) + "'", int27 == (-1135868924));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.divide((-101), 2);
        int int9 = mathTest0.multiply(101, 10);
        int int12 = mathTest0.multiply(2601, (-101));
        int int15 = mathTest0.subtract((-27036768), 9669);
        int int18 = mathTest0.add(24389000, 1624886795);
        int int21 = mathTest0.subtract((-50935), (-6620096));
        int int23 = mathTest0.square((-3990));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1010 + "'", int9 == 1010);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-262701) + "'", int12 == (-262701));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-27046437) + "'", int15 == (-27046437));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1649275795 + "'", int18 == 1649275795);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6569161 + "'", int21 == 6569161);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 15920100 + "'", int23 == 15920100);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.subtract(36, 3232);
        int int16 = mathTest0.square(2);
        int int19 = mathTest0.divide(1042441, (-190));
        int int22 = mathTest0.multiply(102, 960400);
        int int25 = mathTest0.subtract((-1822115708), 324767662);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3196) + "'", int14 == (-3196));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-5486) + "'", int19 == (-5486));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97960800 + "'", int22 == 97960800);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-2146883370) + "'", int25 == (-2146883370));
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add(52, (-3295));
        int int6 = mathTest0.multiply(1200, (-124));
        int int9 = mathTest0.subtract((-5073621), 1494149);
        int int12 = mathTest0.add(12508860, (-42304469));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3243) + "'", int3 == (-3243));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-148800) + "'", int6 == (-148800));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6567770) + "'", int9 == (-6567770));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-29795609) + "'", int12 == (-29795609));
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(12, 100);
        int int15 = mathTest0.add(2601, (-51));
        int int18 = mathTest0.divide(1881653649, 34);
        int int21 = mathTest0.add(28751656, 1966983424);
        int int24 = mathTest0.add(1818756672, 4189);
        int int27 = mathTest0.subtract(296310, 1600856285);
        int int30 = mathTest0.multiply(15004683, 2499561);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 112 + "'", int12 == 112);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2550 + "'", int15 == 2550);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 55342754 + "'", int18 == 55342754);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1995735080 + "'", int21 == 1995735080);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1818760861 + "'", int24 == 1818760861);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1600559975) + "'", int27 == (-1600559975));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1466015491 + "'", int30 == 1466015491);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.subtract((int) (short) -1, (int) (short) 100);
        int int17 = mathTest0.divide(1, 100);
        int int20 = mathTest0.multiply(29421456, 27040000);
        int int23 = mathTest0.divide(218028, (-1190));
        int int26 = mathTest0.multiply((-91), 1181812661);
        int int29 = mathTest0.divide(44, 1273404263);
        int int32 = mathTest0.multiply((-925149353), 3329);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-101) + "'", int14 == (-101));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-621998080) + "'", int20 == (-621998080));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-183) + "'", int23 == (-183));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-170769751) + "'", int26 == (-170769751));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-330644905) + "'", int32 == (-330644905));
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
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
        int int28 = mathTest0.divide(31258, (-1658912768));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-399) + "'", int17 == (-399));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-190) + "'", int20 == (-190));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 18 + "'", int23 == 18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10036224 + "'", int25 == 10036224);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.divide(0, 5200);
        int int13 = mathTest0.square(4356);
        int int16 = mathTest0.divide((-29338412), 31);
        int int19 = mathTest0.divide(212338, (-367));
        int int22 = mathTest0.divide(702330714, (-39024));
        int int24 = mathTest0.square(1351683014);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 18974736 + "'", int13 == 18974736);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-946400) + "'", int16 == (-946400));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-578) + "'", int19 == (-578));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-17997) + "'", int22 == (-17997));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 383163684 + "'", int24 == 383163684);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.divide((-101), 2);
        int int9 = mathTest0.divide((int) '#', 31);
        int int12 = mathTest0.multiply((-148800), 64);
        int int14 = mathTest0.square(13689);
        int int16 = mathTest0.square((-1611803632));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9523200) + "'", int12 == (-9523200));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 187388721 + "'", int14 == 187388721);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 894075136 + "'", int16 == 894075136);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.subtract((int) (short) 0, (int) '#');
        int int15 = mathTest0.subtract((-1), 100);
        int int18 = mathTest0.divide((-3222), (int) '4');
        int int21 = mathTest0.add(5541, (-1190));
        int int24 = mathTest0.add(1496089, 63);
        int int27 = mathTest0.multiply((-797466), 66145886);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-35) + "'", int12 == (-35));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-101) + "'", int15 == (-101));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-61) + "'", int18 == (-61));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4351 + "'", int21 == 4351);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1496152 + "'", int24 == 1496152);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1693204596 + "'", int27 == 1693204596);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
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
        java.lang.Class<?> wildcardClass29 = mathTest0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.multiply(10445824, 10445824);
        int int11 = mathTest0.square(712775872);
        java.lang.Class<?> wildcardClass12 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1594884096 + "'", int9 == 1594884096);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-60518400) + "'", int11 == (-60518400));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
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
        java.lang.Class<?> wildcardClass27 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 303 + "'", int17 == 303);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1469916730) + "'", int20 == (-1469916730));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 28764707 + "'", int23 == 28764707);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1513566944 + "'", int26 == 1513566944);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(3232, (-3168));
        int int8 = mathTest0.square((-3232));
        int int11 = mathTest0.divide(0, (-1962934273));
        java.lang.Class<?> wildcardClass12 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10445824 + "'", int8 == 10445824);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) ' ');
        int int12 = mathTest0.divide((int) (byte) 100, 36);
        int int15 = mathTest0.subtract(0, 3232);
        int int18 = mathTest0.multiply(1961891178, (-1838192896));
        java.lang.Class<?> wildcardClass19 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3232) + "'", int15 == (-3232));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1435739648 + "'", int18 == 1435739648);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        mathTest mathTest0 = new mathTest();
        int int2 = mathTest0.square((-101));
        int int5 = mathTest0.divide((-71), 19);
        int int8 = mathTest0.multiply((int) (short) 1, (int) 'a');
        int int11 = mathTest0.multiply(36819, 10037175);
        java.lang.Class<?> wildcardClass12 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10201 + "'", int2 == 10201);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-3) + "'", int5 == (-3));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 191558869 + "'", int11 == 191558869);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square(5200);
        int int14 = mathTest0.multiply((-7), 13);
        int int17 = mathTest0.subtract(217038, (-990));
        int int20 = mathTest0.divide((-1022), (-269922304));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27040000 + "'", int11 == 27040000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-91) + "'", int14 == (-91));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 218028 + "'", int17 == 218028);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        mathTest mathTest0 = new mathTest();
        int int2 = mathTest0.square((-101));
        int int5 = mathTest0.multiply(1594884096, (-29422512));
        int int8 = mathTest0.divide((-32969632), (-3295));
        int int11 = mathTest0.divide(2499561, 3329);
        int int14 = mathTest0.add(27426628, 1962924603);
        int int17 = mathTest0.multiply(11082241, 923);
        int int20 = mathTest0.divide(11082241, 1966983424);
        int int22 = mathTest0.square(1020100);
        int int25 = mathTest0.add((-375815), 87);
        int int28 = mathTest0.multiply(4356, 963499229);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10201 + "'", int2 == 10201);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1962934272 + "'", int5 == 1962934272);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10005 + "'", int8 == 10005);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 750 + "'", int11 == 750);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1990351231 + "'", int14 == 1990351231);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1638973851 + "'", int17 == 1638973851);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1221924368 + "'", int22 == 1221924368);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-375728) + "'", int25 == (-375728));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 819593332 + "'", int28 == 819593332);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int14 = mathTest0.square((int) '4');
        int int17 = mathTest0.subtract((-1735141), 0);
        int int20 = mathTest0.add(108400, (-212371707));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2704 + "'", int14 == 2704);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1735141) + "'", int17 == (-1735141));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-212263307) + "'", int20 == (-212263307));
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.add((int) (short) 1, 0);
        int int14 = mathTest0.multiply((-399), 1156);
        int int17 = mathTest0.divide(148155, 52);
        int int20 = mathTest0.multiply((-1086356767), (-3243));
        int int23 = mathTest0.subtract((-204514), 0);
        int int26 = mathTest0.subtract((-633972464), (-364050160));
        int int29 = mathTest0.divide(627464426, (-455790592));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-461244) + "'", int14 == (-461244));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2849 + "'", int17 == 2849);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1181812661 + "'", int20 == 1181812661);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-204514) + "'", int23 == (-204514));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-269922304) + "'", int26 == (-269922304));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
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
        int int32 = mathTest0.divide(1357445200, (-1563969599));
        int int34 = mathTest0.square((-1065096738));
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 786029700 + "'", int34 == 786029700);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square((-32969632));
        int int14 = mathTest0.divide(4353, (-124));
        int int17 = mathTest0.add((-3181), 55410);
        int int19 = mathTest0.square((-1086369187));
        int int22 = mathTest0.multiply(1861148465, 10000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 541139968 + "'", int11 == 541139968);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-35) + "'", int14 == (-35));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52229 + "'", int17 == 52229);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1782953417 + "'", int19 == 1782953417);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1391356432 + "'", int22 == 1391356432);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.subtract((int) '#', (int) (short) 100);
        int int12 = mathTest0.divide(712776852, (-27036767));
        int int15 = mathTest0.subtract((-1382167866), (-1328051));
        int int17 = mathTest0.square(1007709282);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-65) + "'", int9 == (-65));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-26) + "'", int12 == (-26));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1380839815) + "'", int15 == (-1380839815));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1440557692) + "'", int17 == (-1440557692));
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.subtract((int) (short) 0, (int) '#');
        int int15 = mathTest0.subtract((-1), 100);
        int int18 = mathTest0.add(5151, (-51));
        int int21 = mathTest0.divide(27040000, (-1086356767));
        int int23 = mathTest0.square((-698049148));
        int int26 = mathTest0.divide((-52), 509259459);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-35) + "'", int12 == (-35));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-101) + "'", int15 == (-101));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5100 + "'", int18 == 5100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 537603088 + "'", int23 == 537603088);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) (short) 1);
        int int12 = mathTest0.add((-63), (-3232));
        int int15 = mathTest0.subtract(316921, 1347654771);
        int int18 = mathTest0.divide(1659610656, 4858344);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3295) + "'", int12 == (-3295));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1347337850) + "'", int15 == (-1347337850));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 341 + "'", int18 == 341);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int5 = mathTest0.square((int) (byte) 10);
        int int8 = mathTest0.subtract(1496241, 152);
        int int11 = mathTest0.add(101, 1);
        int int14 = mathTest0.add(345137331, 565980994);
        int int17 = mathTest0.add(0, (-137280));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1496089 + "'", int8 == 1496089);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 102 + "'", int11 == 102);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 911118325 + "'", int14 == 911118325);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-137280) + "'", int17 == (-137280));
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.subtract((int) (short) 0, (int) '#');
        int int15 = mathTest0.add((-101), 1024);
        int int18 = mathTest0.subtract(43, 55342855);
        int int21 = mathTest0.subtract((-5073621), (-506154654));
        int int24 = mathTest0.subtract(1878642054, (-1403936999));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-35) + "'", int12 == (-35));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 923 + "'", int15 == 923);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-55342812) + "'", int18 == (-55342812));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 501081033 + "'", int21 == 501081033);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1012388243) + "'", int24 == (-1012388243));
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.subtract(36, 3232);
        int int16 = mathTest0.square(2);
        int int19 = mathTest0.divide(1042441, (-190));
        int int22 = mathTest0.divide((-1563353761), 1624886795);
        int int25 = mathTest0.multiply((-19), 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3196) + "'", int14 == (-3196));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-5486) + "'", int19 == (-5486));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-589) + "'", int25 == (-589));
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.divide(1496241, 10201);
        int int15 = mathTest0.divide(11161, 1);
        int int18 = mathTest0.subtract((int) (byte) -1, 1962934272);
        int int20 = mathTest0.square(117);
        int int23 = mathTest0.add((-805857024), (-13));
        int int26 = mathTest0.subtract(52229, (-61));
        int int29 = mathTest0.multiply((-805857024), 1067851684);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 146 + "'", int12 == 146);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11161 + "'", int15 == 11161);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1962934273) + "'", int18 == (-1962934273));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 13689 + "'", int20 == 13689);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-805857037) + "'", int23 == (-805857037));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52290 + "'", int26 == 52290);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1814365184 + "'", int29 == 1814365184);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
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
        int int31 = mathTest0.subtract((-1035983359), 604333301);
        int int34 = mathTest0.divide((-11329044), 13503598);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1640316660) + "'", int31 == (-1640316660));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int12 = mathTest0.multiply(144, 1594884096);
        int int15 = mathTest0.subtract((-992), 1042102);
        int int18 = mathTest0.multiply(1496699, 0);
        int int21 = mathTest0.add(461828740, 55131);
        int int24 = mathTest0.multiply((-1821319828), (-1934984370));
        java.lang.Class<?> wildcardClass25 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2030043136 + "'", int12 == 2030043136);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1043094) + "'", int15 == (-1043094));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 461883871 + "'", int21 == 461883871);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1082022632 + "'", int24 == 1082022632);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
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
        int int32 = mathTest0.subtract(1953321121, 0);
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1953321121 + "'", int32 == 1953321121);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int8 = mathTest0.square((-51));
        int int11 = mathTest0.divide((-3222), 112);
        int int14 = mathTest0.multiply(1, (-134969936));
        int int17 = mathTest0.multiply(2030043136, (-134938));
        int int20 = mathTest0.divide(18974736, 1892066507);
        int int23 = mathTest0.divide(9117553, 263609);
        int int26 = mathTest0.add((-1563969599), 7627);
        int int29 = mathTest0.divide(29421456, (-1190896240));
        int int32 = mathTest0.multiply((-455790592), 11082614);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2601 + "'", int8 == 2601);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-28) + "'", int11 == (-28));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-134969936) + "'", int14 == (-134969936));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1241513984) + "'", int17 == (-1241513984));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 34 + "'", int23 == 34);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1563961972) + "'", int26 == (-1563961972));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1504436224) + "'", int32 == (-1504436224));
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(1581, (-13));
        int int14 = mathTest0.square(1181812661);
        int int17 = mathTest0.add((-1404), 604334705);
        int int20 = mathTest0.multiply(3416061, 722509490);
        int int22 = mathTest0.square(902356256);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1568 + "'", int12 == 1568);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-905615879) + "'", int14 == (-905615879));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 604333301 + "'", int17 == 604333301);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-825465878) + "'", int20 == (-825465878));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-2130689024) + "'", int22 == (-2130689024));
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.subtract((int) 'a', 34);
        int int15 = mathTest0.divide((int) (short) -1, 36);
        int int18 = mathTest0.divide((-2), (-61));
        int int21 = mathTest0.multiply((-41602), (-1515163));
        int int24 = mathTest0.divide(2002088192, 3307);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1390698314) + "'", int21 == (-1390698314));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 605409 + "'", int24 == 605409);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.subtract((int) '#', (int) (short) 1);
        int int17 = mathTest0.multiply(1, (-1));
        int int19 = mathTest0.square((-3168));
        int int22 = mathTest0.divide((-51), 3232);
        int int25 = mathTest0.divide(19, 577619520);
        int int28 = mathTest0.divide(1384042461, 16314474);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10036224 + "'", int19 == 10036224);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 84 + "'", int28 == 84);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        mathTest mathTest0 = new mathTest();
        int int2 = mathTest0.square((-101));
        int int5 = mathTest0.multiply(0, 1024);
        int int8 = mathTest0.multiply(98, 10201);
        int int11 = mathTest0.subtract(1719912448, (-1086356767));
        int int13 = mathTest0.square((-5835742));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10201 + "'", int2 == 10201);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 999698 + "'", int8 == 999698);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1488698081) + "'", int11 == (-1488698081));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1089000580 + "'", int13 == 1089000580);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) (short) 1);
        int int12 = mathTest0.add((-63), (-3232));
        int int15 = mathTest0.add((int) (short) 1, (-1544804416));
        int int18 = mathTest0.multiply((-1021237618), 607288996);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3295) + "'", int12 == (-3295));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1544804415) + "'", int15 == (-1544804415));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-772630792) + "'", int18 == (-772630792));
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.add(100, (int) (short) 1);
        int int9 = mathTest0.subtract(0, 0);
        int int11 = mathTest0.square((int) (byte) 1);
        int int14 = mathTest0.subtract(3232, 27040000);
        int int17 = mathTest0.add(950697, 963499229);
        int int20 = mathTest0.subtract((-1350726656), 1838229715);
        java.lang.Class<?> wildcardClass21 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-27036768) + "'", int14 == (-27036768));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 964449926 + "'", int17 == 964449926);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1106010925 + "'", int20 == 1106010925);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((-32), 99);
        int int9 = mathTest0.divide((-3232), 51);
        int int12 = mathTest0.subtract(34, (int) (short) 100);
        int int15 = mathTest0.divide((-13503587), (-3069));
        int int18 = mathTest0.add(27040000, 633765517);
        int int21 = mathTest0.divide(1103809, 5151);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3168) + "'", int6 == (-3168));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-63) + "'", int9 == (-63));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-66) + "'", int12 == (-66));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4399 + "'", int15 == 4399);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 660805517 + "'", int18 == 660805517);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 214 + "'", int21 == 214);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.multiply(101, 51);
        int int17 = mathTest0.divide((-65), (-295593424));
        int int20 = mathTest0.divide(27040000, 1494149);
        int int22 = mathTest0.square(1010);
        int int24 = mathTest0.square(9117553);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5151 + "'", int14 == 5151);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 18 + "'", int20 == 18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1020100 + "'", int22 == 1020100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 680693729 + "'", int24 == 680693729);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.subtract((int) '#', (int) (short) 100);
        int int12 = mathTest0.divide(0, (-1021));
        int int14 = mathTest0.square((int) (byte) 10);
        int int17 = mathTest0.multiply(17689, 10036224);
        int int19 = mathTest0.square(71824);
        int int22 = mathTest0.divide(4356, (-3659));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-65) + "'", int9 == (-65));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1437107200 + "'", int17 == 1437107200);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 863719680 + "'", int19 == 863719680);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square((-32969632));
        int int14 = mathTest0.divide(4353, (-124));
        int int17 = mathTest0.divide((-10333621), 98);
        int int20 = mathTest0.add(750, 2550);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 541139968 + "'", int11 == 541139968);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-35) + "'", int14 == (-35));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-105445) + "'", int17 == (-105445));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3300 + "'", int20 == 3300);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.subtract((int) '#', (int) (short) 1);
        int int17 = mathTest0.multiply(1, (-1));
        int int20 = mathTest0.divide(5200, (-35));
        int int23 = mathTest0.subtract(176203232, (-1086356767));
        int int25 = mathTest0.square((-1343782208));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-148) + "'", int20 == (-148));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1262559999 + "'", int23 == 1262559999);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1186492416) + "'", int25 == (-1186492416));
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
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
        int int29 = mathTest0.add((-105445), (-1740241));
        int int32 = mathTest0.subtract((-1576), 1425734027);
        java.lang.Class<?> wildcardClass33 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-32969632) + "'", int17 == (-32969632));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1184491520 + "'", int26 == 1184491520);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1845686) + "'", int29 == (-1845686));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1425735603) + "'", int32 == (-1425735603));
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.divide(0, 5200);
        int int13 = mathTest0.square(150);
        int int16 = mathTest0.multiply(0, 1208040860);
        int int19 = mathTest0.add((-27036603), 960400);
        int int21 = mathTest0.square((-5073621));
        int int24 = mathTest0.subtract((-1886410752), 1168561);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 22500 + "'", int13 == 22500);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-26076203) + "'", int19 == (-26076203));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1891046713 + "'", int21 == 1891046713);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1887579313) + "'", int24 == (-1887579313));
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.add((int) (short) 1, 0);
        int int14 = mathTest0.multiply((-399), 1156);
        int int17 = mathTest0.divide(148155, 52);
        int int20 = mathTest0.divide(69033050, 765991428);
        int int23 = mathTest0.subtract((-2101063168), 999698);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-461244) + "'", int14 == (-461244));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2849 + "'", int17 == 2849);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-2102062866) + "'", int23 == (-2102062866));
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int11 = mathTest0.square(3232);
        int int14 = mathTest0.divide((-32), (int) (short) 1);
        int int17 = mathTest0.add(36, 1010);
        int int20 = mathTest0.add(1296, 0);
        int int23 = mathTest0.subtract(1032524761, 833798402);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10445824 + "'", int11 == 10445824);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-32) + "'", int14 == (-32));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1046 + "'", int17 == 1046);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1296 + "'", int20 == 1296);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 198726359 + "'", int23 == 198726359);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
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
        int int28 = mathTest0.subtract(1082022632, 1225);
        int int31 = mathTest0.multiply(608174080, 627464426);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27040000 + "'", int11 == 27040000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-91) + "'", int14 == (-91));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 351445471 + "'", int17 == 351445471);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-485525159) + "'", int19 == (-485525159));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 98 + "'", int22 == 98);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1208021816 + "'", int25 == 1208021816);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1082021407 + "'", int28 == 1082021407);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 578813952 + "'", int31 == 578813952);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) (short) 1);
        int int12 = mathTest0.subtract(51, (-66));
        int int15 = mathTest0.multiply(1046, (-546213652));
        int int18 = mathTest0.add((-27040097), 7311616);
        int int20 = mathTest0.square(22500);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 117 + "'", int12 == 117);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-108829624) + "'", int15 == (-108829624));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-19728481) + "'", int18 == (-19728481));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 506250000 + "'", int20 == 506250000);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.subtract((int) (short) 0, (int) '#');
        int int15 = mathTest0.add((-101), 1024);
        int int18 = mathTest0.multiply((-845551616), (-1086369187));
        int int21 = mathTest0.multiply(999644832, 5541);
        int int24 = mathTest0.multiply(30037369, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-35) + "'", int12 == (-35));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 923 + "'", int15 == 923);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 356075520 + "'", int18 == 356075520);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1475797728) + "'", int21 == (-1475797728));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
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
        int int28 = mathTest0.add(604334705, 7416);
        int int30 = mathTest0.square(541139968);
        int int33 = mathTest0.subtract(2209, (-1425733996));
        int int36 = mathTest0.divide(2059381548, (-210338647));
        int int38 = mathTest0.square((-901635863));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-461244) + "'", int14 == (-461244));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2849 + "'", int17 == 2849);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 268 + "'", int20 == 268);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-2683240) + "'", int23 == (-2683240));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 604334705 + "'", int25 == 604334705);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 604342121 + "'", int28 == 604342121);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1292894208 + "'", int30 == 1292894208);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1425736205 + "'", int33 == 1425736205);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-9) + "'", int36 == (-9));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1335946223) + "'", int38 == (-1335946223));
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        int int20 = mathTest0.multiply((int) (short) 10, 99);
        int int23 = mathTest0.multiply((-5073684), (-27036766));
        int int26 = mathTest0.add(1358435213, 30460917);
        java.lang.Class<?> wildcardClass27 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 990 + "'", int20 == 990);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-953401000) + "'", int23 == (-953401000));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1388896130 + "'", int26 == 1388896130);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.subtract((int) '#', (int) (short) 100);
        int int12 = mathTest0.divide(0, (-1021));
        int int14 = mathTest0.square((int) (byte) 10);
        int int17 = mathTest0.subtract(1024, 11612725);
        int int20 = mathTest0.divide((-32), 2126394615);
        java.lang.Class<?> wildcardClass21 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-65) + "'", int9 == (-65));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-11611701) + "'", int17 == (-11611701));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int12 = mathTest0.divide((-63), (-990));
        int int14 = mathTest0.square((-805857037));
        int int17 = mathTest0.divide((-1469159904), (-629560));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2051765929 + "'", int14 == 2051765929);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2333 + "'", int17 == 2333);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int12 = mathTest0.multiply(0, 210);
        int int15 = mathTest0.add((-50), (int) 'a');
        int int18 = mathTest0.add((-27036603), (-675));
        int int21 = mathTest0.divide(4011570, 1120946724);
        java.lang.Class<?> wildcardClass22 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 47 + "'", int15 == 47);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-27037278) + "'", int18 == (-27037278));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.multiply(10445824, 10445824);
        int int12 = mathTest0.divide(2704, (-5681));
        int int15 = mathTest0.multiply(1331441, (-123));
        int int18 = mathTest0.multiply(1594884096, 49);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1594884096 + "'", int9 == 1594884096);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-163767243) + "'", int15 == (-163767243));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 839909376 + "'", int18 == 839909376);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.divide(0, 5200);
        int int14 = mathTest0.add((-3243), (-13503587));
        int int16 = mathTest0.square((-13494178));
        int int19 = mathTest0.add(99, (-3069));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-13506830) + "'", int14 == (-13506830));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-888552828) + "'", int16 == (-888552828));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2970) + "'", int19 == (-2970));
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.subtract((int) (short) 0, (int) '#');
        int int15 = mathTest0.add((-101), 1024);
        int int18 = mathTest0.multiply((-845551616), (-1086369187));
        java.lang.Class<?> wildcardClass19 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-35) + "'", int12 == (-35));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 923 + "'", int15 == 923);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 356075520 + "'", int18 == 356075520);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.divide(0, 5200);
        int int13 = mathTest0.square(4356);
        int int15 = mathTest0.square((-27034267));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 18974736 + "'", int13 == 18974736);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1517696551) + "'", int15 == (-1517696551));
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(1581, (-13));
        int int15 = mathTest0.add((-699588731), 1693063041);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1568 + "'", int12 == 1568);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 993474310 + "'", int15 == 993474310);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.subtract((int) (short) -1, (int) (short) 100);
        int int17 = mathTest0.divide(1, 100);
        int int20 = mathTest0.multiply(29421456, 27040000);
        int int23 = mathTest0.divide(218028, (-1190));
        int int26 = mathTest0.multiply((-91), 1181812661);
        int int29 = mathTest0.divide(44, 1273404263);
        java.lang.Class<?> wildcardClass30 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-101) + "'", int14 == (-101));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-621998080) + "'", int20 == (-621998080));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-183) + "'", int23 == (-183));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-170769751) + "'", int26 == (-170769751));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int8 = mathTest0.square((-51));
        int int11 = mathTest0.subtract(100, (-190));
        int int14 = mathTest0.divide((-66), (-63));
        int int16 = mathTest0.square(0);
        int int19 = mathTest0.multiply((-123), 0);
        int int22 = mathTest0.divide((-7), (-461244));
        int int24 = mathTest0.square((-1200524809));
        java.lang.Class<?> wildcardClass25 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2601 + "'", int8 == 2601);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 290 + "'", int11 == 290);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-557188015) + "'", int24 == (-557188015));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((-32), 99);
        int int8 = mathTest0.square((-1156));
        int int11 = mathTest0.multiply((-99590), (-855675904));
        int int14 = mathTest0.subtract((-1598350400), 1458409873);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3168) + "'", int6 == (-3168));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1336336 + "'", int8 == 1336336);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 317159424 + "'", int11 == 317159424);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1238207023 + "'", int14 == 1238207023);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((-32), 99);
        int int9 = mathTest0.divide((int) (short) 0, (int) (short) 100);
        int int12 = mathTest0.add((-3295), (-3181));
        int int15 = mathTest0.divide((-1086369187), 2030043136);
        int int18 = mathTest0.divide((int) (byte) 0, 1168561);
        int int21 = mathTest0.multiply(15129, (-1838193237));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3168) + "'", int6 == (-3168));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6476) + "'", int12 == (-6476));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-112240973) + "'", int21 == (-112240973));
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.subtract((int) '#', (int) (short) 1);
        int int17 = mathTest0.multiply(1, (-1));
        int int20 = mathTest0.add(101, (int) ' ');
        int int23 = mathTest0.multiply((-1641194714), (-1991992544));
        int int26 = mathTest0.subtract((-418481920), (-1752770602));
        int int29 = mathTest0.multiply(191558869, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 133 + "'", int20 == 133);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-940349760) + "'", int23 == (-940349760));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1334288682 + "'", int26 == 1334288682);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1371126596 + "'", int29 == 1371126596);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.divide((-101), 2);
        int int9 = mathTest0.multiply(101, 10);
        int int12 = mathTest0.multiply(1334311154, 1334646608);
        int int15 = mathTest0.add(29421697, (-283351090));
        java.lang.Class<?> wildcardClass16 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1010 + "'", int9 == 1010);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-584742496) + "'", int12 == (-584742496));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-253929393) + "'", int15 == (-253929393));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square((-32969632));
        int int14 = mathTest0.divide(4353, (-124));
        int int17 = mathTest0.add((-3181), 55410);
        int int20 = mathTest0.divide((-4537), (-3243));
        java.lang.Class<?> wildcardClass21 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 541139968 + "'", int11 == 541139968);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-35) + "'", int14 == (-35));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52229 + "'", int17 == 52229);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((-32), 99);
        int int9 = mathTest0.divide((-3232), 51);
        int int12 = mathTest0.subtract(34, (int) (short) 100);
        int int15 = mathTest0.divide((-13503587), (-3069));
        int int18 = mathTest0.subtract(1849, 712775872);
        int int20 = mathTest0.square(11082582);
        int int22 = mathTest0.square(66145886);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3168) + "'", int6 == (-3168));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-63) + "'", int9 == (-63));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-66) + "'", int12 == (-66));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4399 + "'", int15 == 4399);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-712774023) + "'", int18 == (-712774023));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 444023012 + "'", int20 == 444023012);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-654742908) + "'", int22 == (-654742908));
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) (short) 1);
        int int12 = mathTest0.subtract(51, (-66));
        int int15 = mathTest0.multiply((-990), 99);
        int int18 = mathTest0.multiply(115, 47);
        int int21 = mathTest0.multiply(1120946724, 146);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 117 + "'", int12 == 117);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-98010) + "'", int15 == (-98010));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5405 + "'", int18 == 5405);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 449464456 + "'", int21 == 449464456);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
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
        int int31 = mathTest0.square(1990351231);
        int int34 = mathTest0.add(1818760861, 11082614);
        int int37 = mathTest0.subtract((-253929435), (-813));
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2013629697 + "'", int31 == 2013629697);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1829843475 + "'", int34 == 1829843475);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-253928622) + "'", int37 == (-253928622));
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.subtract((int) (short) -1, (int) (short) 100);
        int int16 = mathTest0.square(101);
        int int19 = mathTest0.add(1990353832, (int) (byte) 0);
        int int22 = mathTest0.multiply(11069344, 0);
        java.lang.Class<?> wildcardClass23 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-101) + "'", int14 == (-101));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10201 + "'", int16 == 10201);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1990353832 + "'", int19 == 1990353832);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        int int20 = mathTest0.divide(2, 11);
        int int23 = mathTest0.multiply((-2720), (int) (short) 100);
        int int26 = mathTest0.multiply((-1499196338), (-1563969600));
        int int29 = mathTest0.divide((-699588731), 1273404263);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-272000) + "'", int23 == (-272000));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1781857408 + "'", int26 == 1781857408);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.add(12, 100);
        int int15 = mathTest0.add(2601, (-51));
        int int18 = mathTest0.divide(1881653649, 34);
        int int21 = mathTest0.add(28751656, 1966983424);
        int int24 = mathTest0.subtract(13, 1106010925);
        int int27 = mathTest0.add(0, 9409);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 112 + "'", int12 == 112);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2550 + "'", int15 == 2550);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 55342754 + "'", int18 == 55342754);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1995735080 + "'", int21 == 1995735080);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1106010912) + "'", int24 == (-1106010912));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9409 + "'", int27 == 9409);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(3232, (-3168));
        int int8 = mathTest0.square((-3232));
        int int10 = mathTest0.square((-40381539));
        // The following exception was thrown during execution in test generation
        try {
            int int13 = mathTest0.divide((-580330951), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Cannot divide by zero.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10445824 + "'", int8 == 10445824);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1541263799) + "'", int10 == (-1541263799));
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.subtract((int) '#', (int) (short) 100);
        int int11 = mathTest0.square(1174437474);
        int int14 = mathTest0.multiply(4096, 1881653649);
        int int17 = mathTest0.add(52, 69);
        int int20 = mathTest0.subtract(349175808, (-957487));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-65) + "'", int9 == (-65));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-698049148) + "'", int11 == (-698049148));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2082017280 + "'", int14 == 2082017280);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 121 + "'", int17 == 121);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 350133295 + "'", int20 == 350133295);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.multiply(10445824, 10445824);
        int int12 = mathTest0.divide(2704, (-5681));
        int int14 = mathTest0.square(712775872);
        int int16 = mathTest0.square(1156);
        int int18 = mathTest0.square(1296);
        int int20 = mathTest0.square((-461240));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1594884096 + "'", int9 == 1594884096);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-60518400) + "'", int14 == (-60518400));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1336336 + "'", int16 == 1336336);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1679616 + "'", int18 == 1679616);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-2006027200) + "'", int20 == (-2006027200));
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int8 = mathTest0.square((-51));
        int int11 = mathTest0.divide((-3222), 112);
        int int14 = mathTest0.divide((-2623), (-3212));
        int int16 = mathTest0.square((-366998));
        int int19 = mathTest0.divide(27423396, 176965908);
        int int22 = mathTest0.subtract(2045219072, 557020471);
        int int25 = mathTest0.subtract((-6291), 1343106793);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2601 + "'", int8 == 2601);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-28) + "'", int11 == (-28));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1543545828 + "'", int16 == 1543545828);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1488198601 + "'", int22 == 1488198601);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1343113084) + "'", int25 == (-1343113084));
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(3232, (-3168));
        int int8 = mathTest0.square((-3232));
        int int11 = mathTest0.subtract((int) (byte) 100, (-63));
        int int14 = mathTest0.divide((-781697343), (-1));
        int int17 = mathTest0.add((-662654260), (-28606596));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10445824 + "'", int8 == 10445824);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 163 + "'", int11 == 163);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 781697343 + "'", int14 == 781697343);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-691260856) + "'", int17 == (-691260856));
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int13 = mathTest0.square(10036224);
        int int16 = mathTest0.subtract(1324965, (-6476));
        int int19 = mathTest0.multiply((-328153584), (-183));
        int int22 = mathTest0.subtract(0, (-289063887));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 219152384 + "'", int13 == 219152384);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1331441 + "'", int16 == 1331441);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-77436272) + "'", int19 == (-77436272));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 289063887 + "'", int22 == 289063887);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.add((-190), (int) '4');
        int int17 = mathTest0.divide((-4), 344);
        int int20 = mathTest0.subtract(1909243054, 1924186067);
        int int22 = mathTest0.square(2741983);
        int int24 = mathTest0.square((-332164864));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-138) + "'", int14 == (-138));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-14943013) + "'", int20 == (-14943013));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-2016963007) + "'", int22 == (-2016963007));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 404815872 + "'", int24 == 404815872);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        int int20 = mathTest0.add(0, 1046);
        int int22 = mathTest0.square(19044);
        int int25 = mathTest0.divide(1357853952, 1624939024);
        int int28 = mathTest0.subtract(305031680, 69033050);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1046 + "'", int20 == 1046);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 362673936 + "'", int22 == 362673936);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 235998630 + "'", int28 == 235998630);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.multiply(101, 51);
        int int17 = mathTest0.divide(144, 64);
        int int19 = mathTest0.square(115);
        int int22 = mathTest0.multiply(28774156, 38271);
        int int25 = mathTest0.multiply((-1845686), (-1519247103));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5151 + "'", int14 == 5151);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 13225 + "'", int19 == 13225);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1704096500 + "'", int22 == 1704096500);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2104975434 + "'", int25 == 2104975434);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        mathTest mathTest0 = new mathTest();
        int int2 = mathTest0.square(0);
        int int5 = mathTest0.divide(0, (-823));
        int int8 = mathTest0.add((-2079326208), (-10));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2079326218) + "'", int8 == (-2079326218));
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add(52, (-3295));
        int int6 = mathTest0.subtract((-123), 2500);
        int int9 = mathTest0.subtract(712776862, (-650690376));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3243) + "'", int3 == (-3243));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2623) + "'", int6 == (-2623));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1363467238 + "'", int9 == 1363467238);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.divide(0, 5200);
        int int14 = mathTest0.add(63, (-5073684));
        int int17 = mathTest0.add(84100, (-29422512));
        int int20 = mathTest0.subtract(111069103, 820197632);
        int int23 = mathTest0.divide((-989855744), 663);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-5073621) + "'", int14 == (-5073621));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-29338412) + "'", int17 == (-29338412));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-709128529) + "'", int20 == (-709128529));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1492995) + "'", int23 == (-1492995));
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((-32), 99);
        int int8 = mathTest0.square((-1156));
        int int11 = mathTest0.subtract((-858242532), 11082241);
        java.lang.Class<?> wildcardClass12 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3168) + "'", int6 == (-3168));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1336336 + "'", int8 == 1336336);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-869324773) + "'", int11 == (-869324773));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((-32), 99);
        int int8 = mathTest0.square((-1156));
        int int11 = mathTest0.subtract((-858242532), 11082241);
        int int13 = mathTest0.square(1515163);
        int int15 = mathTest0.square((-357));
        java.lang.Class<?> wildcardClass16 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3168) + "'", int6 == (-3168));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1336336 + "'", int8 == 1336336);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-869324773) + "'", int11 == (-869324773));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-2088586791) + "'", int13 == (-2088586791));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 127449 + "'", int15 == 127449);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
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
        int int28 = mathTest0.multiply(2002091772, (-1));
        int int31 = mathTest0.divide(1295175098, (-5919729));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4356 + "'", int17 == 4356);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-9669) + "'", int25 == (-9669));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-2002091772) + "'", int28 == (-2002091772));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-218) + "'", int31 == (-218));
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply(10, (int) (short) 10);
        int int12 = mathTest0.multiply((-946400), 1962931076);
        int int15 = mathTest0.divide((-364050160), (-3535));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1414081664 + "'", int12 == 1414081664);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 102984 + "'", int15 == 102984);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.subtract((int) (short) -1, (int) (short) 100);
        int int16 = mathTest0.square(101);
        int int19 = mathTest0.divide(990, 63);
        int int22 = mathTest0.subtract(1174437505, 50960);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-101) + "'", int14 == (-101));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10201 + "'", int16 == 10201);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 15 + "'", int19 == 15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1174386545 + "'", int22 == 1174386545);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.add((int) (byte) -1, (int) '4');
        int int12 = mathTest0.subtract(150, 51);
        int int15 = mathTest0.add((int) (short) 1, 1);
        int int18 = mathTest0.multiply((-148), (-124));
        int int21 = mathTest0.multiply(9801, (-375664945));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 99 + "'", int12 == 99);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 18352 + "'", int18 == 18352);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1105153273) + "'", int21 == (-1105153273));
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square((-32969632));
        int int14 = mathTest0.subtract((int) (short) 10, (-1190));
        int int17 = mathTest0.divide(750, 52229);
        int int20 = mathTest0.add((-29338412), 3307);
        int int23 = mathTest0.divide(43560000, (-963762076));
        java.lang.Class<?> wildcardClass24 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 541139968 + "'", int11 == 541139968);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1200 + "'", int14 == 1200);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-29335105) + "'", int20 == (-29335105));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.subtract((int) (short) -1, (int) (short) 100);
        int int16 = mathTest0.square(101);
        int int18 = mathTest0.square(99);
        java.lang.Class<?> wildcardClass19 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-101) + "'", int14 == (-101));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10201 + "'", int16 == 10201);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9801 + "'", int18 == 9801);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
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
        int int32 = mathTest0.subtract(2132429056, 70071185);
        int int35 = mathTest0.add(17689, (-1818922088));
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2062357871 + "'", int32 == 2062357871);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1818904399) + "'", int35 == (-1818904399));
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.subtract((int) (short) 0, (int) '#');
        int int15 = mathTest0.subtract((-1), 100);
        int int18 = mathTest0.add(5151, (-51));
        int int21 = mathTest0.multiply((-2), (-65));
        int int24 = mathTest0.divide(32, 17960388);
        int int27 = mathTest0.subtract(19255296, (-50938));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-35) + "'", int12 == (-35));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-101) + "'", int15 == (-101));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5100 + "'", int18 == 5100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 130 + "'", int21 == 130);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 19306234 + "'", int27 == 19306234);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.add(51, (int) (byte) 1);
        int int11 = mathTest0.square((-32969632));
        int int14 = mathTest0.subtract((int) (short) 10, (-1190));
        int int17 = mathTest0.divide((-134974900), (-1095390208));
        int int20 = mathTest0.divide((-27037278), 1168561);
        java.lang.Class<?> wildcardClass21 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 541139968 + "'", int11 == 541139968);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1200 + "'", int14 == 1200);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-23) + "'", int20 == (-23));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.subtract((int) '#', (int) (byte) -1);
        int int9 = mathTest0.multiply((int) (byte) -1, (int) ' ');
        int int12 = mathTest0.divide((int) (byte) 100, 36);
        int int15 = mathTest0.multiply(63, (-1));
        int int18 = mathTest0.subtract(0, 990);
        int int21 = mathTest0.add((-1328271), 10445824);
        int int24 = mathTest0.subtract(1781857752, (-1437108180));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-63) + "'", int15 == (-63));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-990) + "'", int18 == (-990));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9117553 + "'", int21 == 9117553);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1076001364) + "'", int24 == (-1076001364));
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.add((int) (short) 1, 0);
        int int14 = mathTest0.multiply((-399), 1156);
        int int17 = mathTest0.divide(148155, 52);
        int int20 = mathTest0.divide((-3222), (-12));
        int int23 = mathTest0.divide((-135036), 66);
        int int26 = mathTest0.multiply(2005938200, (-515395328));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-461244) + "'", int14 == (-461244));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2849 + "'", int17 == 2849);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 268 + "'", int20 == 268);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-2046) + "'", int23 == (-2046));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 535336960 + "'", int26 == 535336960);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((-32), 99);
        int int9 = mathTest0.divide((-3232), 51);
        int int11 = mathTest0.square(1046);
        int int13 = mathTest0.square(950697);
        int int16 = mathTest0.divide((-13525933), (-330390172));
        int int19 = mathTest0.add(722297152, 212338);
        int int22 = mathTest0.multiply((-38228), 526377984);
        int int25 = mathTest0.multiply((-1652770389), (-810437336));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3168) + "'", int6 == (-3168));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-63) + "'", int9 == (-63));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1094116 + "'", int11 == 1094116);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1881653649 + "'", int13 == 1881653649);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 722509490 + "'", int19 == 722509490);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-455790592) + "'", int22 == (-455790592));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1862134200 + "'", int25 == 1862134200);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
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
        int int31 = mathTest0.add((-83559871), 805857023);
        int int33 = mathTest0.square((-1764640368));
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 722297152 + "'", int31 == 722297152);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1134653696 + "'", int33 == 1134653696);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
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
        int int28 = mathTest0.divide((-395585801), (-29422512));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 219152384 + "'", int13 == 219152384);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1331441 + "'", int16 == 1331441);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 599383088 + "'", int19 == 599383088);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-9248822) + "'", int22 == (-9248822));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 13 + "'", int28 == 13);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.multiply(101, 51);
        int int17 = mathTest0.divide(144, 64);
        int int20 = mathTest0.subtract(10005, (-1156));
        java.lang.Class<?> wildcardClass21 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5151 + "'", int14 == 5151);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 11161 + "'", int20 == 11161);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.add((int) (byte) -1, (int) '4');
        int int12 = mathTest0.subtract(150, 51);
        int int15 = mathTest0.add((int) (short) 1, 1);
        int int18 = mathTest0.multiply(0, (-980));
        int int21 = mathTest0.add(1838192896, 36819);
        int int24 = mathTest0.multiply((-369098751), 4356);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 99 + "'", int12 == 99);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1838229715 + "'", int21 == 1838229715);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1476390652) + "'", int24 == (-1476390652));
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.divide((-32), 98);
        int int9 = mathTest0.multiply((int) (byte) 100, (int) (byte) 100);
        int int12 = mathTest0.subtract((int) (short) 0, (int) '#');
        int int15 = mathTest0.subtract((-1), 100);
        int int18 = mathTest0.add(1861148465, 7627);
        int int21 = mathTest0.divide((-1109372839), (-1327930204));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-35) + "'", int12 == (-35));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-101) + "'", int15 == (-101));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1861156092 + "'", int18 == 1861156092);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.multiply(100, (int) '4');
        int int6 = mathTest0.divide((-101), 2);
        int int9 = mathTest0.divide((int) '#', 31);
        int int12 = mathTest0.subtract(10, 12);
        int int15 = mathTest0.subtract(2030043136, (-29338412));
        int int18 = mathTest0.divide(899656477, 1334963529);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5200 + "'", int3 == 5200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2) + "'", int12 == (-2));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2059381548 + "'", int15 == 2059381548);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.subtract((int) (byte) 1, (int) '4');
        int int6 = mathTest0.divide(3232, (-3168));
        int int8 = mathTest0.square((-3232));
        int int11 = mathTest0.add(29421356, 112);
        int int14 = mathTest0.divide((int) (byte) 10, 13516830);
        int int17 = mathTest0.subtract((-364053231), 1688954796);
        int int20 = mathTest0.subtract(429549516, 217038);
        int int23 = mathTest0.divide(43560000, 1026171035);
        int int26 = mathTest0.subtract((-57784615), (-983920640));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10445824 + "'", int8 == 10445824);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 29421468 + "'", int11 == 29421468);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-2053008027) + "'", int17 == (-2053008027));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 429332478 + "'", int20 == 429332478);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 926136025 + "'", int26 == 926136025);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
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
        java.lang.Class<?> wildcardClass27 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10445824 + "'", int11 == 10445824);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-32) + "'", int14 == (-32));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1046 + "'", int17 == 1046);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1852038144 + "'", int20 == 1852038144);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-40381539) + "'", int23 == (-40381539));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.subtract(98, (int) (byte) -1);
        int int14 = mathTest0.add(52, 98);
        int int17 = mathTest0.add((-13), (-364053231));
        int int20 = mathTest0.multiply(1530169, (-1241513984));
        int int23 = mathTest0.subtract((-50960), (-469562451));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 150 + "'", int14 == 150);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-364053244) + "'", int17 == (-364053244));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-2046820352) + "'", int20 == (-2046820352));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 469511491 + "'", int23 == 469511491);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = mathTest0.divide((int) (byte) 10, (int) (byte) 10);
        int int11 = mathTest0.square(3232);
        int int14 = mathTest0.divide((-32), (int) (short) 1);
        int int17 = mathTest0.add(36, 1010);
        int int20 = mathTest0.divide(128, 11);
        int int23 = mathTest0.subtract(1324965, (-1962934273));
        int int26 = mathTest0.add(1881653649, (-6620096));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10445824 + "'", int11 == 10445824);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-32) + "'", int14 == (-32));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1046 + "'", int17 == 1046);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 11 + "'", int20 == 11);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1964259238 + "'", int23 == 1964259238);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1875033553 + "'", int26 == 1875033553);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
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
        int int28 = mathTest0.divide(1000500, (-95153));
        int int31 = mathTest0.subtract(1, 851180625);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3307 + "'", int20 == 3307);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1347654771 + "'", int23 == 1347654771);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 659992241 + "'", int25 == 659992241);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-10) + "'", int28 == (-10));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-851180624) + "'", int31 == (-851180624));
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.divide(0, 5200);
        int int14 = mathTest0.multiply((int) (short) 1, (int) (short) 10);
        int int17 = mathTest0.multiply((-3232), 10201);
        int int20 = mathTest0.subtract(63, (-990));
        int int23 = mathTest0.add(2601, 1990351231);
        int int26 = mathTest0.divide((int) (short) 100, 115);
        java.lang.Class<?> wildcardClass27 = mathTest0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-32969632) + "'", int17 == (-32969632));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1053 + "'", int20 == 1053);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1990353832 + "'", int23 == 1990353832);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.divide(0, 5200);
        int int13 = mathTest0.square((int) (short) 0);
        int int16 = mathTest0.subtract(16318464, 1281588);
        int int19 = mathTest0.subtract(0, 34);
        int int22 = mathTest0.multiply(1205358465, 1817377282);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 15036876 + "'", int16 == 15036876);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-34) + "'", int19 == (-34));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1331259134) + "'", int22 == (-1331259134));
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        mathTest mathTest0 = new mathTest();
        int int3 = mathTest0.add((int) 'a', (int) (short) 1);
        int int6 = mathTest0.multiply((int) (byte) 0, (int) (short) 10);
        int int8 = mathTest0.square(1);
        int int11 = mathTest0.multiply(101, (int) ' ');
        int int14 = mathTest0.multiply(0, 100);
        int int17 = mathTest0.subtract(63, 98);
        int int20 = mathTest0.divide(2, 11);
        int int23 = mathTest0.divide(2087780608, (-485525159));
        int int26 = mathTest0.add(833798402, 0);
        int int29 = mathTest0.multiply((-9248822), (-805856861));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3232 + "'", int11 == 3232);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-35) + "'", int17 == (-35));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-4) + "'", int23 == (-4));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 833798402 + "'", int26 == 833798402);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1882572898) + "'", int29 == (-1882572898));
    }
}

