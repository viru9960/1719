package pojo;

public class Player {
	
		private String name;
		private int age;
		
		public Player()
		{
			name="name";
			age=0;
		}
		
		
		
		public Player(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}



		public void kick()
		{
			System.out.println("kick");
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public int getAge() {
			return age;
		}


		public void setAge(int age) {
			this.age = age;
		}

}
