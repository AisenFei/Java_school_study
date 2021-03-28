package jvm;

// -XX:+PrintGCDetails -XX:+UseSerialGC -Xms20M -Xmx20M -Xmn10M -XX:MaxTenuringThreshold=1 -XX:+PrintTenuringDistribution

public class Test2 {
    private static final int _1MB = 1024 * 1024;

    @SuppressWarnings("unused")
    public static void testAllocation() {
        byte[] allocation1, allocation2, allocation3;
        allocation1 = new byte[_1MB / 4];//1024*1024/4
        System.out.println(1);
// 什么时候进入老年代取决于XX:MaxTenuringThreshold的设置
        allocation2 = new byte[4 * _1MB];
        System.out.println(2);
        allocation3 = new byte[4 * _1MB];
        System.out.println(3);
        allocation3 = null;
        System.out.println(4);
        allocation3 = new byte[4 * _1MB];
    }

    public static void main(String[] args) throws Exception {
        testAllocation();
    }
}
