package classes.onlystaticmethods;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(
        mv = {1, 1, 7},
        bv = {1, 0, 2},
        k = 2,
        d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\u0007"},
        d2 = {"fun1", "", "fun2", "", "fun3", "", "str", "production sources for module Kotlin-Examples"}
)
public final class KotlinKt {
    public static final void fun1() {
        String var0 = "Wello, Horld!";
        System.out.println(var0);
    }

    public static final double fun2() {
        return Math.random();
    }

    @NotNull
    public static final String fun3(@NotNull String str) {
        Intrinsics.checkParameterIsNotNull(str, "str");
        return str + "\ud83c\udfb5";
    }
}
