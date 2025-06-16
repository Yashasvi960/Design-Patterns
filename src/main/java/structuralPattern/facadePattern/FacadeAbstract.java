package structuralPattern.facadePattern;

public class FacadeAbstract {

    private DvdPlayer dvdPlayer;
    private Projector projector;
    private SoundSystem soundSystem;

    FacadeAbstract(DvdPlayer dvdPlayer, Projector projector, SoundSystem soundSystem) {
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.soundSystem = soundSystem;
    }

    public void timeForEntertainment() {
        dvdPlayer.on();
        dvdPlayer.play();
        projector.on();
        projector.setWideScreenMode();
        soundSystem.on();
        soundSystem.setSurroundSound();
    }

    public void doneWithEntertainment() {
        soundSystem.off();
        projector.off();
        dvdPlayer.off();
    }
}
