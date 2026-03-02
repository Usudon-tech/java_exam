package q2;

/**
 * Q2. 文字列を逆転させなさい。確認する文字列はどんなものでも構いません。
 *
 * <pre>
 * (例)
 * "abcde" => "edcba"
 * "酔いしれ占う仲良いあの娘" => " この愛よ叶うなら嬉しいよ"
 * </pre>
 *
 * メソッドreverseを作成しなさい。
 *
 * @author y.morinaga
 */
public class Reverse {

    public static void main(String[] args) {
        String reverse = "ABCDEFG";
        String reversed = "";
        // 未対応
        for(int i = reverse.length(); i > 0; i--){
            reversed = (String)reverse.charAt(i);
        }
        //String reversed = reverse("よいしれうらなうなかよいあのこ");
        System.out.println(reversed);
    }

}
