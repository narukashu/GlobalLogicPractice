class Classes
{
	public static void main(String[] args) {
		
		class User
		{
			int score;
			public boolean won(){

				if (score>=100) {
					return true;
				}else {
					return false;
				}
			}
		}
		User shub = new User();
		shub.score = 100;
		System.out.println(shub.won());
	}
}