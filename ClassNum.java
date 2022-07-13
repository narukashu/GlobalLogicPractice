class ClassNum
{
	public static void main(String[] args) {
		
		class User
		{
			int score;
			public boolean won(){

				if (score>=0)
				 {
					return true;
				}
				else
				{
					return false;
				}
								}
		}
		User shub = new User();
		shub.score = -10;
		System.out.println(shub.won());
	}
}