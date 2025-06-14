class Solution {
    public static boolean isVowel(char alphabet) {
        char alphabetL = Character.toLowerCase(alphabet);
        if (alphabetL == 'a' || alphabetL == 'i' || alphabetL == 'u' || alphabetL == 'e' || alphabetL == 'o') {
            return true;
        }
        else return false;
    }
}

// AIコードレビューによるリファクタリング
class Solution {
    public static boolean isVowel(char alphabet) {
        char alphabetL = Character.toLowerCase(alphabet);
        return alphabetL == 'a' || alphabetL == 'i' || alphabetL == 'u' || alphabetL == 'e' || alphabetL == 'o';
    }
}
// 条件が満たされない場合に自動でfalseが返る