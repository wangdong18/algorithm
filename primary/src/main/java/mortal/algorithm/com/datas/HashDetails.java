package mortal.algorithm.com.datas;

/**
 * hash算法的 详细介绍
 *
 * @Author: mortal
 * @Date: 2021/5/6 22:57
 */
public class HashDetails {

    public static void main(String[] args) {
        String hashTest = "hero is come back";

        simpleHash(hashTest);
        myAddhash(hashTest);
    }

    /**
     * string自带的获取hashcode
     */
    public static void simpleHash(String varchar) {
        System.err.println(varchar.hashCode());
    }

    /**
     * h为0时的模拟string的获取hashcode 场景
     * @param varchar
     */
    private static void myAddhash(String varchar) {
        int h =0;
        char val[] = varchar.toCharArray();

        for (int i = 0; i < val.length; i++) {
            h = 31 * h + val[i];
        }
        System.err.println(h);;
    }

}
