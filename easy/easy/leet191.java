package easy;
public class leet191 {

     public int countbit(int n, int result){    
      return  countbit(n/10,result);

    }
    public int hammingWeight(int n) {
        int result = 0;
        return countbit(n,result);
        
    }


    public static void main(String[] args){
        System.out.println(21);
        System.out.println(00001);
        System.out.println(0b00011); //2進数で表すには先頭に0bを付与する
        System.out.println(00011);//そのままだと8進数として出力される　
        System.out.println(000010 & 1 );
        System.out.println(1100 & 1010 );
        System.out.println(000001011 );
        System.out.println(000001011 );
        int i=21;
        System.out.println(i );
        System.out.println(i >> 1);
        System.out.println(i );


        System.out.println(000000101011 & 1);
        System.out.println(0b01010101);
        System.out.println(0b01010101 & 000000010);
    }
}

//まず、000010 という数値の先頭の0は、その数値が8進数（オクタル）であることを示しています。
// 8進数の 10 は、10進数で8を意味します。したがって、000010 は10進数での8に相当します。
// 10進数の8を2進数に変換すると、1000 となります。
// したがって、000010 & 1 の計算は、実際には以下のようになります：
// 8の2進数:  1000
// 1の2進数:  0001
// ----------------
// &の結果:   0000  （これは10進数で0です）



// コンピュータは数字を2進数（0と1だけの数字）で保存しています。例えば、10進数の数字5は2進数で101として保存されます。数字3は011として保存されます。
// &という記号は、この2進数の数字を1桁ずつ比較して、その位置の両方が1の場合だけ1を、それ以外の場合は0を結果として出します。
// たとえば:
//   5:  101
//   3:  011
// ---------------
// &の結果: 001  （これは10進数で1です）



// int i;
// i = 21 >>> 2;
// これは何してる？

// このコードのフラグメントはJavaのビット操作を示しています。
// >>> はJavaの符号なし右シフト演算子です。つまり、左オペランドのビットを右にシフトし、空いた左のビットを0で埋めます。
// 具体的には、数値 21 を2ビット分右にシフトします。
// 21 の2進表現は 10101 です。
// これを2ビット分右にシフトすると、00101 になります。
// この2進数 00101 は10進数で 5 になります。
// 従って、i = 21 >>> 2; の後、i の値は 5 になります。

//21 >>1 の出力は右に１ビットずらすので１０となる