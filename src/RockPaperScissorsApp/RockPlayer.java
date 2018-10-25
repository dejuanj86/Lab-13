package RockPaperScissorsApp;

public class RockPlayer extends Player {

public RockPlayer(String name){
    roshValue = Roshambo.Rock;
    this.name=name;
}

    @Override
    Roshambo generateRoshamboValue() {
        return roshValue;
    }


}
