package recursion.queue;

import java.util.PriorityQueue;

public class pr2 {

    public static int shipmentVolumePackages(int[] packages){
        // 関数を完成させてください
        // 優先度付きキューの初期化
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int pack : packages) {
            queue.add(pack);
        }

        // 合計された荷物の体積を格納する変数
        int totalVolume = 0;

        // キューに2つ以上の要素がある間、処理を繰り返す
        while (queue.size() > 1) {
            // キューから最小の2つの荷物を取り出し、合計する
            int first = queue.poll();
            int second = queue.poll();
            int newPackage = first + second;
            
            // 新しい荷物をキューに追加
            queue.add(newPackage);
            
            // 合計された荷物の体積に加える
            totalVolume += newPackage;
        }

        // 合計された荷物の体積の合計を返す
        return totalVolume;

    }
    public static void main(String[] args){
        System.out.println("aaa");
    }
}


// 荷物梱包
// medium
// 出荷予定の荷物の体積を表す、正の整数で構成された配列 packages が与えられます。
// 出荷チームは、体積の小さい荷物どうしをパッケージで梱包し、
// 合計体積の新しい荷物を作成します。この新しい荷物を作成するために使われた 2 つの
// 荷物は配列から削除され、代わりに新しい荷物が元の配列に追加されます。このサイクルは
// 荷物が 1 つになるまで続きます。この処理で使われたパッケージの合計を返す、shipmentVolumePackages という関数を作成してください。

// 例として、[5,3,10,9,4] を考えます。最初に使われるパッケージは、3 + 4 = 7 で
// あり、出荷リストは [5,10,9,7] になります。次のサイクルでは、パッケージは
// 5 + 7 = 12、出荷リストは [10,9,12] になります。3 周期目のパッケージは 9 + 10 = 19、
// 出荷リストは [12,19] になります。最後のサイクルではパッケージは 12 + 19 = 31、
// 出荷リストは [31] になります。今まで使用した合計のパッケージは、7 + 12 + 19 + 31 = 69 
// となり、69 を返します。

// 関数の入出力例

// 入力のデータ型： integer[] packages
// 出力のデータ型： integer
// shipmentVolumePackages([6,5,6]) --> 28
// shipmentVolumePackages([5,3,10,9,4]) --> 69
// shipmentVolumePackages([15]) --> 0
// shipmentVolumePackages([1,2,3,4,5,6,10]) --> 80
// shipmentVolumePackages([5,4,3,2,1]) --> 33
// shipmentVolumePackages([45,65,20,3,4,5,66,19,23,3,1]) --> 700