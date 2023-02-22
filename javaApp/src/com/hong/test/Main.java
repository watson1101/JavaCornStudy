public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        subThreadGetParentThreadValue();
    }

    /****** 子线程 获取父线程threadLacal的值
     * 通过 InheritableThreadLocal 来获取
     * ******/
    private static void subThreadGetParentThreadValue() {
        Thread parentParent = new Thread(() -> {
            ThreadLocal<Integer> threadLocal = new ThreadLocal<>();
            threadLocal.set(1);
            InheritableThreadLocal<Integer> inheritableThreadLocal = new InheritableThreadLocal<>();
            inheritableThreadLocal.set(2);

            new Thread(() -> {
                System.out.println("threadLocal = " + threadLocal.get());
                System.out.println("inheritableThreadLocals = " + inheritableThreadLocal.get());
            }).start();
        }, "父线程");
        parentParent.start();
    }

}