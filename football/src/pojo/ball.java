package pojo;

public class ball {

	  private Integer size;
	  private String pattern;
	  
	  public void shot(){
		  System.out.println("shot");
	  }

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public String getPattern() {
		return pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
}
