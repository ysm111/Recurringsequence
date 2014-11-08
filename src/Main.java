import java.util.*;

/**
 * 8進数と16進数で共に循環数列数になる数を表示するプログラム
 * (16進数で3桁(2進数で12桁)ずつ数を繰り返すことで、8進数と16進数で共に循環数列数になることを利用して求める)
 */
public class Main {
    public static void main(String[] args){
        /**
         * 循環数列数を格納するList
         * (要素の追加が多く、添字指定が少ないのでLinkedListを使っている)
         */
        List<Integer> seq=new LinkedList<Integer>();
        /**
         * 循環数列数(16進数)
         */
        StringBuilder hex=new StringBuilder();

        try{
            //循環数列数の元となる数jが8進数,16進数ともに0で始まらない範囲で繰り返す
            for(int j=(int)Math.pow(2,9);j<(int)Math.pow(2,12);j++) {
                //16進数のjを2回繰り返し、循環数列数を生成
                for(int i=0;i<2;i++) {
                    hex.append(Integer.toHexString(j));
                }
                //生成された循環数列数をlistに追加
                seq.add(Integer.parseInt(hex.toString(), 16));
                //StringBuilderを初期化
                hex.setLength(0);
            }
            //11番目の要素を表示
            System.out.println(seq.get(10));
        }catch(Exception e){
            //例外の内容を表示
            e.printStackTrace();
        }
    }
}
