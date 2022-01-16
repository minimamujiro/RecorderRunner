public class RecorderRunner { 
  public static void main(String[] args) { 
    Recorder recorder = new Recorder();//Recorderをインスタント化する
    //キーを表示するメソッドを起動命令する
    recorder.operationdkey("key1","value1");//キーと値が指定された場合
    recorder.operationdkey("key1","Deleted"); //キーと値「Delete」が指定された場合
    //recorder.operationdkey("key1",null);//キーだけが指定された場合
    try{
       recorder.operationdkey("key10","Deleted");
   } catch (IllegalArgumentException  e) { //operationdkeyメソッドでエラーが発生したことを確知してエラーコードを表示する
      e.printStackTrace();
   } 
    recorder.operationdkey("key2","value2");
    recorder.operationdkey(null,null);//キーも値も指定しない場合
 }
}