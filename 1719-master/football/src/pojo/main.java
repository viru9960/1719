package pojo;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class main {

	public static void main(String[] args)
	{
	
		Player captain=new Player();
		captain.setAge(23);
		captain.setName("messi");
		
		Player goalkeeper=new Player("g. singh",20);
		
		Goalkeeper goalkeeper1=new Goalkeeper("r. singh",20);
		
		System.out.println("player name="+captain.getName());
		System.out.println("player name="+captain.getAge());
		
		
		System.out.println("player name="+goalkeeper.getName());
		System.out.println("player name="+goalkeeper.getAge());
		
		System.out.println("player name="+goalkeeper1.getName());
		System.out.println("player name="+goalkeeper1.getAge());
		
		
		/*----------------------------------------------------------------------*/
			//			collection
		/*----------------------------------------------------------------------*/
		
		List<Player> PLAYERS =new ArrayList<>();
		
		PLAYERS.add(new Player("roy",20));
		PLAYERS.add(new Player("savio",23));
		PLAYERS.add(new Player("lloyd",25));
		
		/*----------------------------------------------------------------------*/
		//			Iterator
	/*----------------------------------------------------------------------*/
		
		Iterator<Player> myIterator=PLAYERS.iterator();
		while(myIterator.hasNext())
		{
			Player team;
			team=myIterator.next();
			System.out.println(""+team.getName()+" "+team.getAge());
		}
		
						
						
						
		
	}
}
