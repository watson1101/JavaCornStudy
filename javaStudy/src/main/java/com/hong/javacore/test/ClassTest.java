package com.hong.javacore.test;

/**
 * @author hong
 * @date 2020/2/17
 */
public class ClassTest {
    private String aaa;

    public static void main(String[] args) {
//        aaa =
//new ClassDemo(aaa,"cccccccccc");
    }

    public class ClassDemo{
        private String bbb;
        public ClassDemo(String aaa,String bbb){
            System.out.println("ClassDemo: aaa = "+aaa+", bbb = "+bbb);
        }
    }
}
