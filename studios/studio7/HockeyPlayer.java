package studio7;

public class HockeyPlayer {

	private String name;
	private int jerseyNum;
	private boolean rightDom;
	private boolean leftDom;
	private  boolean rightShot;
	private int goals;
	private int assists;
	private int points;
	private int gamesPlayed;
	// private String? shootHand;
	
	public HockeyPlayer (String name, int jerseyNum, boolean rightDom, boolean leftDom, boolean rightShot){
		this.name = name;
		this.jerseyNum = jerseyNum;
		this.rightDom = rightDom;
		this.leftDom = leftDom;
		this.rightShot = rightShot;
		this.goals = 0;
		this.assists = 0;
		this.points = goals+assists;
		this.gamesPlayed = 0;
	}
	
	public void gameStats (int goalsScored, int assists){
		this.goals += goalsScored;
		this.assists += assists;
		this.points = goals+assists;
		this.gamesPlayed = gamesPlayed + 1;
	}
}
