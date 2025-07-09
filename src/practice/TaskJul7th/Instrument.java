package practice.TaskJul7th;

public class Instrument {
    public static void main(String[] args) {
        Guitar g= new Guitar();
        Piano p= new Piano();
        g.play();
        p.play();
    }
}

interface Playable {
    void play();
}

 class Guitar implements Playable{

     @Override
     public void play() {
         System.out.println("Guitar sound!!");
     }
 }

 class Piano implements Playable{

     @Override
     public void play() {
         System.out.println("Piano sound!!");
     }
 }