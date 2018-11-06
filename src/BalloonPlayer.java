public class BalloonPlayer {

    public BalloonPlayer(String name){
        this.name = name;
    }

    private String name;

    public Balloon balloon;

    public void ThrowBallon(BalloonPlayer otherPlayer){
        if(balloon != null){
            otherPlayer.RecieveBalloon(balloon);
            balloon = null;
        }
    }

    public void RecieveBalloon(Balloon balloon) {
        this.balloon = balloon;
    }

    public void ScaleBalloonUp(){
        balloon.changeSize(5);
    }


    public void ScaleBalloonDown(){
        balloon.changeSize(-5);
    }
}
