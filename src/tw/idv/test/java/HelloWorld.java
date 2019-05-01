package tw.idv.test.java;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;

/**
快捷鍵的使用：
 1 執行(run) alt+r
 2 提示補全 (Class Name Completion) alt+/
 3 單行註解 ctrl + /
 4 多行註解 ctrl + shift + /
 5 向下複製一行 (Duplicate Lines) ctrl+alt+down
 6 刪除一行或選中行 (delete line) ctrl+d
 7 向下移動行(move statement down) alt+down
 8 向上移動行(move statement up) alt+up
 9 向下開始新的一行(start new line) shift+enter
 10 向上開始新的一行 (Start New Line before current) ctrl+shift+enter
 11 如何查看原始碼 (class) ctrl + 選中指定的結構 或 ctrl + shift + t
 12 萬能解錯/產生回傳值變數 alt + enter
 13 退回到前一個編輯的頁面 (back) alt + left
 14 進入到下一個編輯的頁面(針對於上條) (forward) alt + right
 15 查看繼承關係(type hierarchy) F4

 16 格式化程式碼(reformat code) ctrl+shift+F
 17 提示方法參數類型(Parameter Info) ctrl+alt+/
 18 複製程式碼 ctrl + c
 19 復原 ctrl + z
 20 反復原 ctrl + y
 21 剪下 ctrl + x
 22 貼上 ctrl + v
 23 儲存 ctrl + s
 24 全選 ctrl + a
 25 選中數行，整體往後移動 tab
 26 選中數行，整體往前移動 shift + tab
 27 查看類別的結構：類似於 eclipse 的 outline ctrl+o
 28 重構：修改變數名稱與方法名稱(rename) alt+shift+r
 29 大寫轉小寫/小寫轉大寫(toggle case) ctrl+shift+y
 30 產生建構子/get/set/toString alt +shift + s

 31 查看文件說明(quick documentation) F2
 32 收起所有的方法(collapse all) alt + shift + c
 33 打開所有方法(expand all) alt+shift+x
 34 打開程式碼所在硬碟資料夾(show in explorer) ctrl+shift+x
 35 產生 try-catch 等(surround with) alt+shift+z
 36 區域變數抽取為成員變數(introduce field) alt+shift+f
 37 搜尋/替換(目前) ctrl+f
 38 搜尋(全域) ctrl+h
 39 搜尋檔案 double Shift
 40 查看類別的繼承結構圖(Show UML Diagram) ctrl + shift + u
 41 查看方法的多層重寫結構(method hierarchy) ctrl+alt+h
 42 加入到收藏(add to favorites) ctrl+alt+f
 43 抽取方法(Extract Method) alt+shift+m
 44 打開最近修改的文件(Recently Files) ctrl+E
 45 關閉目前打開的程式碼欄(close) ctrl + w

 46 關閉打開的所有程式碼欄(close all) ctrl + shift + w
 47 快速搜尋類別中的錯誤(next highlighted error) ctrl + shift + q
 48 選擇要貼上的內容(Show in Explorer) ctrl+shift+v
 49 搜尋方法在哪裡被呼叫(Call Hierarchy) ctrl+shift+h
*/
public class HelloWorld {

    private static int num;

    public HelloWorld() {
    }

    private static final int INITOL_SIZE = 10;

    public static void main(String[] args){
        ArrayList list1 = getList();

//        method1();

        System.out.println(list1);
    }

    public static ArrayList getList() {
        //region Description
        System.out.println("HelloWorld!!");
        System.out.println("HelloWorld!!");
        ArrayList list1 = new ArrayList(); // ctrl + d
        //endregion

        /*ArrayList list1 = null;

        synchronized ()*/

        Date date = new Date();

        list1.add(0,12);
        return list1;
    }

    public static void method1(){

        num = 10;

        try {
            FileInputStream fis = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
