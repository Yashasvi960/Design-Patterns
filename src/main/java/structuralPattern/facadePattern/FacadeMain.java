package structuralPattern.facadePattern;

public class FacadeMain {
   public static void main(String[] args) {
       DvdPlayer dvd = new DvdPlayer();
       Projector proj = new Projector();
       SoundSystem sound = new SoundSystem();

       FacadeAbstract facadeAbstract = new FacadeAbstract(dvd, proj, sound);
       facadeAbstract.timeForEntertainment();
       facadeAbstract.doneWithEntertainment();
   }

}
