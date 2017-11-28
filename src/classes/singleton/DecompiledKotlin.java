package classes.singleton;

/**
 * @Author cjeon
 * @Since 21/11/2017
 */
@Metadata(mv={1, 1, 7}, bv={1, 0, 2}, k=1, d1={"\000\032\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\b\n\002\b\006\n\002\020\013\n\000\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\006\020\007\032\0020\004J\016\020\b\032\0020\0042\006\020\t\032\0020\004J\020\020\n\032\0020\0132\006\020\t\032\0020\004H\007R\016\020\003\032\0020\004XD¢\006\002\n\000R\026\020\005\032\0020\0048\002XD¢\006\b\n\000\022\004\b\006\020\002¨\006\f"}, d2={"Lclasses/DecompiledKotlin/DecompiledKotlin;", "", "()V", "state", "", "staticState", "staticState$annotations", "method1", "method2", "input", "method3", "", "Kotlin-Examples"})
public final class DecompiledKotlin {
    static { new DecompiledKotlin(); } private DecompiledKotlin() {
        INSTANCE = (DecompiledKotlin)this;
        state = 5;
        staticState = 5; }

    private static final int state = 5;
    public final int method1() { return state; }

    private static final int staticState = 5;
    public static final DecompiledKotlin INSTANCE;
    public final int method2(int input) { return input + 1; }

    @kotlin.jvm.JvmStatic
    public static final boolean method3(int input)
    {
        return staticState % 2 == 1;
    }
}
