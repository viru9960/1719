package pojo;

public class ground {

	 private Integer sides;
	 private String condition;
	 private Integer playerslaying;
	 private Integer volunteersPlaying;
	 
	 public void game(){
	 
	 System.out.println("game");
	 }
	 
	 public ground(){
		 this.sides = sides;
		 this.condition = condition;
		 this.playerslaying = playerslaying;
		 this.volunteersPlaying = volunteersPlaying;
		 
		 
		 
	 }

	public Integer getSides() {
		return sides;
	}

	public void setSides(Integer sides) {
		this.sides = sides;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public Integer getPlayerslaying() {
		return playerslaying;
	}

	public void setPlayerslaying(Integer playerslaying) {
		this.playerslaying = playerslaying;
	}

	public Integer getVolunteersPlaying() {
		return volunteersPlaying;
	}

	public void setVolunteersPlaying(Integer volunteersPlaying) {
		this.volunteersPlaying = volunteersPlaying;
	}
}
