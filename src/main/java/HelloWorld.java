/**
 * 版权所有：北京塔尔旺科技有限公司
 * All Rights Reserved
 */

/**
 * @author YangBo 2022/9/24 18:04
 */
class HelloWorld {
    public native void print();

    static {
        System.loadLibrary("hello");
    }

    public static void main(String[] args) {
        new HelloWorld().print();
    }
}