// 購入できる最大のパンの個数　easy
// 今所持金 money 円が財布の中に price 円のパンを買う計画をしています。
// パンの包装にはシールがついており、このパン屋ではそれを sticker 枚集めることで、1 つのパンと交換することができます。
// 自然数 money、price、sticker が与えられるので、購入できるパンの最大数を返す、maxBread という関数を再帰を使って作成してください。
// ただし、sticker >= 2 とします。
//
//例えば、money = 10、price = 2、sticker = 3 の時を考えてみましょう。
// 最初にパンを 5 個購入し、それによってシールを 5 枚取得します。
// その後、その中からシール 3 個を使ってパン 1 個を購入し、それによってシール 1 枚を取得します。
// 最後に手持ちのシール 3 枚をパンと交換できるので、合計 7 個のパンを手に入れることができます。


class Solution {
    public static int maxBread(int money, int price, int sticker) {
        // 所持金から購入できるパンの個数を求めます
        final int bread = (int)Math.floor(money / price);
        // 獲得できるシールの枚数は、購入できたパンの個数と等しくなります
        return maxBreadHelper(sticker, bread, bread);
    }

    // 末尾最適化のために、パンの個数を追跡する引数breadを追加。シールの枚数を追跡する引数holdも追加
    // moneyとpriceはもう使わないため、引数から除きます
    public static int maxBreadHelper(int sticker, int bread, int hold) {
        // シールが交換不可能の場合、breadを返します
        if (sticker > hold) return bread;
        // 交換可能の場合、交換できる分だけbreadの個数を増やし、holdの数を減らします。また、新たに獲得したパンの数だけholdを増やします。
        final int newBread = (int)Math.floor(hold / sticker);
        return maxBreadHelper(sticker, bread + newBread, hold - sticker * newBread + newBread);
    }
}