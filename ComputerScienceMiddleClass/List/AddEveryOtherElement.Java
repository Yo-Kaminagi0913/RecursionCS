import java.util.Arrays;

class Solution {
    public static int addEveryOtherElement(int[] intArr) {
        int total = 0;
        for (int i = 0; i < intArr.length; i++) {
            if ((i + 1) % 2 != 0) {
                total += intArr[i];
            }
        }
        return total;
    }
}

// Recursion模範解答
class Main {

    public static int addEveryOtherElement(int[] intArr) {
        int sumOfArr = 0;

        // 1つ飛ばしで数字を足していく
        for (int i = 0; i < intArr.length; i += 2) {
            sumOfArr += intArr[i];
        }

        return sumOfArr;
    }
}
// 着数番目の要素を足すということで、それを言い換えるとインデックスが0番目の要素から1つ飛ばして数字を足していく
// つまり、i=0から始まってi+=2で着数番目のインデックスとなる（if文でなくても書ける）