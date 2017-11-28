package classes.singleton;

/**
 * @Author cjeon
 * @Since 21/11/2017
 */
class DecompiledJava
{
    private DecompiledJava INSTANCE = new DecompiledJava();
    private int instanceState = 5;
    private static int staticState = 5;

    public DecompiledJava getINSTANCE()
    {
        return this.INSTANCE;
    }

    public int method1() {
        return this.instanceState;
    }

    public int method2(int input) {
        return input + 1;
    }

    public static boolean method3() {
        return staticState % 2 == 1;
    }
}
