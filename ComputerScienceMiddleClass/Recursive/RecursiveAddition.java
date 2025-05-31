//足し算（再帰）
//easy
//0 以上の整数 m と n が与えられるので、m + n を返す、recursiveAddition という関数を
// 再帰を用いて作成してください。

class Solution {
    public static int recursiveAddition(int m, int n) {
        if (n <= 0) {
            return m;
        }
        return 1 + recursiveAddition(m, n - 1);
    }
}