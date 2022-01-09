import java.util.HashMap;
import java.util.Map;

public class Recorder { //mapをどこかでインスタンス化？
   Map<String,String> map = new HashMap<String,String>();//どこかに表記したい
   
    public void operationdkey(String key,String value) { //mapの処理などを書く
      if (key == null && value == null) {
          map.clear();
          System.out.println("Empty");
      } else if (key != null && value == null) {
          map.get(key);
      } else if (key != null && value.equals("Delete")) {
            if (map.containsKey(key) == true) {
               System.out.println(key + "delete");
           } else {
               throw new IllegalArgumentException();
           }
      } else {
          map.put(key , value);
          System.out.println(key + "=" + value);
      }
    }
}