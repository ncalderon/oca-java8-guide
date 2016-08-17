
public class StaticInitializerJansel {

	public static void main (String ... args) {
		System.out.println(F2.i);
	}

	    // 1) out F1.s, 10
//    static class F1{
//        static int i = 10;
//        static{
//            System.out.println( "F1.s" );
//        }
//        {
//            System.out.println( "F1.b" );
//        }
//    }
//    static class F2 extends F1{
//        static{
//            System.out.println( "F2.s" );
//        }
//    }
//    System.out.println( F2.i );




    // 2) out F1.s F2.s 20
//    static class F1{
//        static int i = 10;
//        static{
//            System.out.println( "F1.s" );
//        }
//        {
//            System.out.println( "F1.b" );
//        }
//    }
//    static class F2 extends F1{
//        static int i = 20;
//        static{
//            System.out.println( "F2.s" );
//        }
//    }
//    System.out.println( F2.i );




    // 3) out F1.s F1.test
//    static class F1{
//        static int i = 10;
//        static{
//            System.out.println( "F1.s" );
//        }
//        static void test(){
//            System.out.println( "F1.test" );
//        }
//    }
//    static class F2 extends F1{
//        static int i = 20;
//        static{
//            System.out.println( "F2.s" );
//        }
//    }
//    F2.test();




    // 4) out 10
//    static class F1{
//        final static int i = 10;
//        static{
//            System.out.println( "F1.s" );
//        }
//        static void test(){
//            System.out.println( "F1.test" );
//        }
//    }
//    static class F2 extends F1{
//        static{
//            System.out.println( "F2.s" );
//        }
//    }
//    System.out.println( F2.i );




    // 5) out F1.s F1.1.s 20
//    static class F1{
//        final static int i;
//        static{
//            i = 20;
//            System.out.println( "F1.s" );
//        }
//        static{
//            System.out.println( "F1.1.s" );
//        }
//    }
//
//    static class F2 extends F1{
//        static{
//            System.out.println( "F2.s" );
//        }
//    }
//    System.out.println( F2.i );




    // 6) out F2 F2.s 10
//    static int out( String name, int value ){ System.out.println(name); return value; }
//
//    static interface F1{
//        final static int i = out("F1",10);
//    }
//
//    static class F2 implements F1{
//        final static int i = out("F2",10);
//        static{
//            System.out.println( "F2.s" );
//        }
//    }
//    System.out.println( F2.i );




    // 7) out F2.i F2.j 10
//    static int out( String name, int value ){ System.out.println(name); return value; }
//
//    static interface F1{
//        final static int i = out("F1.1",10);
//    }
//
//    static interface F2 extends F1{
//        final static int i = out("F2.i",10);
//        final static int j = out("F2.j",10);
//    }
//    System.out.println( F2.i );




    // 8) out F1.s F2.s 10
//    static class F1{
//        static{
//            System.out.println( "F1.s" );
//        }
//        {
//            System.out.println( "F1.b" );
//        }
//    }
//    static class F2 extends F1{
//        static int i = 10;
//        static{
//            System.out.println( "F2.s" );
//        }
//    }
//    System.out.println( F2.i );




    // 9) out F1.s F2.s F1.b F1.c F2.b F2.c
//    static class F1{
//        static{
//            System.out.println( "F1.s" );
//        }
//        {
//            System.out.println("F1.b");
//        }
//        public F1() {
//            System.out.println( "F1.c" );
//        }
//    }
//    static class F2 extends F1{
//        static int i = 10;
//        static{
//            System.out.println( "F2.s" );
//        }
//        {
//            System.out.println( "F2.b" );
//        }
//        public F2() {
//            System.out.println( "F2.c" );
//        }
//    }
//    new F2();




    // 10) out F1.b F2.b F1.s F2.s 10
//    static class F1{
//        static F2 f2 = new F2();
//        static{
//            System.out.println( "F1.s" );
//        }
//        {
//            System.out.println( "F1.b" );
//        }
//    }
//
//    static class F2 extends F1{
//        static int i = 10;
//        static{
//            System.out.println( "F2.s" );
//        }
//        {
//            System.out.println( "F2.b" );
//        }
//    }
//    System.out.println( F2.i );

}