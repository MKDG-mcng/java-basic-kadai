package kadai_021;

import java.util.HashMap;

 public class Dictionary_Chapter21{
	 
	HashMap<String,String> dic = new HashMap<String,String>();
	
	public void add() {
	dic.put("apple","りんご");
	dic.put("peach","桃");
	dic.put("banana","バナナ");
	dic.put("lemon","レモン");
	dic.put("pear","梨");
	dic.put("kiwi","キウィ");
	dic.put("strawberry","いちご");
	dic.put("grape","ぶどう");
	dic.put("muscut","マスカット");
	dic.put("cherry","さくらんぼ");
}
	
	public void searchWords(String[] words) {
        for (String word : words) {
            if (dic.containsKey(word)) {
                System.out.println(word + "の意味は" + dic.get(word));
            } else {
                System.out.println(word + "は辞書に存在しません");
            }
        }
	}
}
