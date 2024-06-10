package mondaikaiketuryoku;

public class ch3_6 {
    public static void main(String[] args){
        // 解 1
        int K = 10;
        int N = 2;
        int counter = 0;
        for (int X = 0; X <= K; ++X) {
            for (int Y = 0; Y <= K; ++Y) {
                for (int Z = 0; Z <= K; ++Z) {
                    if (X + Y + Z == N) ++counter;
                }
            }
        }
        System.out.println(counter);

        // 解2
        int count=0;
        //Z=X+Y-N;
        for (int x = 0; x <= Math.min(K, N); ++x) {
            for (int y = 0; y <= Math.min(K, N); ++y) {
                int z = N - x - y;
                if (z >= 0 && z <= K) {
                    ++count;
                }
            }
        }
        System.out.println(count);
    }
}
