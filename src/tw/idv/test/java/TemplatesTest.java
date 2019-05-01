package tw.idv.test.java;

import tw.idv.test.bean.Customer;

import java.util.ArrayList;

/**
 * @author Test
 * @date 2019/4/30 下午 09:47
 *
 * 1. IDEA中程式碼模板所處的位置：settings - Editor - Live Templates / Postfix completion
 * 2. 常用的模板
 *
 */
public class TemplatesTest {

    //模板六：prsf： 可產生 private static final
    public static final Customer CUST = new Customer();

    //變形：psf
    public static final int NUM = 1;

    //變形：psfi
    public static final int NUM2 = 2;

    //變形：psfs
    public static final String NATION = "china";

    //模板一：psvm
    public static void main(String[] args) {

        //模板二：sout
        System.out.println("hello!");
        //變形：soutp / soutm / soutv / xxx.sout
        System.out.println("args = [" + args + "]");
        System.out.println("TemplatesTest.main");

        int num1 = 10;
        System.out.println("num1 = " + num1);
        int num2 = 20;
        System.out.println("num2 = " + num2);
        System.out.println(num1);

        //模板三：fori
        String[] arr = new String[]{"Tom", "Jerry", "HanMeiMmei", "Lilei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //變形：iter
        for (String s : arr) {
            System.out.println(s);
        }
        //變形：itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);

        }

        //模板四：list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);

        for (Object o : list) {
        }

        //變形：list.fori
        for (int i = 0; i < list.size(); i++) {

        }

        //變形：list.forr 倒序遍歷
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }
    }

    public void method(){
        System.out.println("TemplatesTest.method");


        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);

        //模板五：ifn
        if (list == null) {

        }

        //變形：inn
        if (list != null) {

        }

        //變形：xxx.nn / xxx.null
        if (list == null) {

        }

        if (list != null) {

        }
    }

}
