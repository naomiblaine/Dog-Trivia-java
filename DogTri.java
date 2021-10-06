// exercise on pages 202 - 205

public class DogTri
{
	private final int NUM_EVENTS;
	// this variable is shared by all objects of this class
	private static int totalCumlativeScore = 0;
	private String name;
	private int obedienceScore;
	private int conformationScore;
	private int agilityScore;
	private int total;
	private double avg;
	private boolean doScoresAgree;

	// constructor method for this class
	public DogTri(String name, int numEvents, int score1, int score3)
	{
		this.name = name;
		NUM_EVENTS = numEvents;
		int totalNot0 = 0
		//check each score parameter and mark if we dont find a zero
		if(score1 != 0)
		{
			totalNot0 = totalNot0 + 1;
		}

		if(score2 != 0)
		{
			totalNot0 = totalNot0 +1
		}
		if(score3 != 0)
		{
			totalNot0 = totalNot0 +1
		}
		// does NUM_EVENTS match the totalNot0?
		if(NUM_EVENTS == totalNot0)
		{
			obedienceScore = score1;
			conformationScore = score2;
			agilityScore = score3;

		}
		else
		{
			obedienceScore = 0;
			conformationScore = 0;
			agilityScore = 0;
			System.out.println("\nNotice! Number of events for " + name + " does not agree with the scores reported!");
		}


	

		obedienceScore = score2;
		agilityScore = score3;

		total = obedienceScore + conformationScore + agilityScore;
		if(NUM_EVENTS === 0 )
		{
			avg = 0
		}
		else
         {
         	avg = (double) total / NUM_EVENTS;
         }

		totalCumlativeScore = totalCumlativeScore + total;
	}
	 public void display()
	 {
	 	System.out.println();
	 	System.out.println(name + " has a total score of " + total + "bringing the total cumulative score to " + totalCumlativeScore);
	 	
	 }

}






