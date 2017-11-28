package classes.singleton;

/**
 * @Author cjeon
 * @Since 21/11/2017
 */
class JavaSingleton {
    private static JavaSingleton INSTANCE = new JavaSingleton();
    private int state = 5;
    private static int staticState = 5;

    private JavaSingleton() {}

    public static JavaSingleton getINSTANCE() {
        return INSTANCE;
    }

    public int method1(int input) {
        return input + state;
    }

    public static boolean method2() {
        return staticState % 2 == 1;
    }
}
