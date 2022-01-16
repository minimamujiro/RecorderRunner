import java.util.HashMap;
import java.util.Map;

public class Recorder { //mapをどこかでインスタンス化？
   Map<String,String> map = new HashMap<String,String>();   //どこかに表記したい
   
    public void operationdkey(String key,String value) {    //mapの処理などを書く
      if (key == null && value == null) {                     //引数が何も渡さなかったら（nullだったら）
          map.clear();                                           //マップのデータを全て消す
          System.out.println("Empty");                           //"Empty"と表示
      } else if (key != null && value == null) {              //引数としてキーだけが渡されたら
          System.out.println(map.get(key));                      //キー内の値を表示
      } else if (key != null && value.equals("Deleted")) {    //引数としてキーが渡され、値が”Deleted”だったら
            if (map.containsKey(key) == true) {                  //mapのキーにkeyが含まれているか？
               System.out.println(key + "deleted");                //キーを消しますと表示
               map.remove(key); 
           } else {                                              //キーが存在しないのでエラー処理
               throw new IllegalArgumentException();
           }
      } else {                                                //引数としてキー、値共に渡されたら
          map.put(key , value);                                  //mapに登録する
          System.out.println(key + "=" + value);                 //キーの中身はこれです。と表示
      }
    }
}