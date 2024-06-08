package mondaikaiketuryoku;

import java.util.Scanner;

public class pr3_6 {

    
public static void main(String[] args){
    System.out.println("aaa");

    System.out.println(85&15);
    System.out.println(85|15);
    System.out.println(85^15);
    System.out.println(~15);

    System.out.println(0b110);

    System.out.println(Integer.toBinaryString(10));
    System.out.println(Integer.toBinaryString(8));
    System.out.println(Integer.toBinaryString(16));
    System.out.println(Integer.toBinaryString(24));


    int positiveNumber = 42; // 42 (decimal) is 00101010 (binary)
    System.out.println(Integer.toBinaryString(42));
    
    int shiftAmount = 2;
    
    int positiveShifted = positiveNumber >> 1;
    System.out.println(Integer.toBinaryString(positiveShifted));


    int negativeNumber = -42; // -42 (decimal) is 11111111111111111111111111010110 (binary in 32-bit two's complement)
    System.out.println(Integer.toBinaryString(negativeNumber));
    int negativeShifted = negativeNumber << shiftAmount;
    System.out.println(Integer.toBinaryString(negativeShifted));

    Scanner scanner = new Scanner(System.in);

        // 入力受け取り
        int N = scanner.nextInt();
        int W = scanner.nextInt();

        int[] a = new int[N];
        for (int i = 0; i < N; ++i) {
            a[i] = scanner.nextInt();
        }

        // bit は 2^N 通りの部分集合全体を動く
        boolean exist = false;
        for (int bit = 0; bit < (1 << N); ++bit) {//ここで全通り毎に和を求めていく
            int sum = 0; // 部分集合に含まれる要素の和
            for (int i = 0; i < N; ++i) {
                // i 番目の要素 a[i] が部分集合に含まれているかどうか
                if ((bit & (1 << i)) != 0) {//３桁ある数字の各桁を１桁目から順番に1に順番に換えている。その毎度毎に、現在のの通りの2進数の並びと比較して論理積とって、どっちも1だったらsumに追加する。
                    sum += a[i];//例えば1通り目の時だったら、bitは001。その通りの場合に対して、ネストのfor文でN回分、今回は３回分、回して各桁を検査する。論理積＆を使う。どこかで1,1で１が出れば0でなくなるのでその場合はスンにタス
                }
            }

            // sum が W に一致するかどうか
            if (sum == W) {
                exist = true;
                break; // Wが見つかったらループを終了
            }
        }
        
        if (exist) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();

// 10進数で３つ数があるとき、選び方は2の３乗で8通りある。
// 
        // 000 → 0　どの数字も選ばれないパターン
        // 001 → 1　３つ目の通じだけ選ぶ
        // 010 → 2　２つ目の数字だけ選ぶ
        // 011 → 3　２，３つ目の数字だけ選ぶ
        // 100 → 4　・
        // 101 → 5　・
        // 110 → 6　・
        // 111 → 7

        //数字が３つの場合、8通りの２進数がある。（３つの数のON,OFF２通りが３つあるから２＾３で８通り）　→その通り分、整数値に割り当てられる。
        // →N=3なら、1~8まで。各整数値を２進数で表現すると、そお、000の各数値のON,OFFの全通りの各通りを表現できる。i=1→001　i=2→010　i=5→101 i=8→111　みたいな。

        // 000 (0): どの要素も選ばない {} (空の集合)
        // 001 (1): a0 を選ぶ {a0}
        // 010 (2): a1 を選ぶ {a1}
        // 011 (3): a0 と a1 を選ぶ {a0, a1}
        // 100 (4): a2 を選ぶ {a2}
        // 101 (5): a0 と a2 を選ぶ {a0, a2}
        // 110 (6): a1 と a2 を選ぶ {a1, a2}
        // 111 (7): a0, a1, a2 をすべて選ぶ {a0, a1, a2}

        // この「〇個の数字の内どれを選択するか（＝スイッチONにするか）がそのまま２進数に適用できる」
        // ４個の数字があったら→0000のうちどれをONにするかを考えるってこと
        // ５個の数字があったら→00000のうちどれをONにするかを考えるってこと

        //

}
}
