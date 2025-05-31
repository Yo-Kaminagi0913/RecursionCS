//ウイルス感染
//        easy
//アメリカにある得体の知れないウィルスが外国から持ち込まれ、毎日 2 倍のスピードで感染を拡大しています。
// 経過日数 day が与えられるので、day 日目のみに感染した人の数を返す、infectedPeople という関数を作成してください。

class Solution {
    public static int infectedPeople(int day) {
        if (day == 0) {
            return 1;
        }
        return 2 * infectedPeople(day - 1);
    }
}