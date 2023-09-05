package task_2;
public class Player implements Playable, Recordable{
    public void play(){
        System.out.println("Playing");
    }
    public void pause(){
        System.out.println("Paused");
    }
    public void stop(){
        System.out.println("Stopped");
    }
    public void record(){
        System.out.println("Recording");
    }

}
