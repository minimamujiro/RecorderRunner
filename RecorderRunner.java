public class RecorderRunner { 
  public static void main(String[] args) { 
    Recorder recorder = new Recorder();//Recorderをインスタント化する
    //キーを表示するメソッドを起動命令する
    recorder.operationdkey("key1","value1");//キーと値が指定された場合
    recorder.operationdkey("key1","Delete"); //キーと値「Delete」が指定された場合
    try{
       recorder.operationdkey("key10","Delete");
   } catch (IllegalArgumentException  e) {
      e.printStackTrace();
   } 
    recorder.operationdkey("key2","value2");
    recorder.operationdkey(null,null);
 }
}