package session1_intro;

public class VotingExcercise
{
  public static void main(String[] args)
{
  int petersAge = 17;
  int johnsAge = 18;
  int marysAge = 19;
  int votingAge = 18;
  boolean ispetersAgeEnough = (petersAge > votingAge);
  boolean isjohnsAgeEnough = true;
  boolean ismarysAgeEnough = (marysAge > votingAge);
  System.out.println("Peter can vote in his country: " + ispetersAgeEnough );
  System.out.println("John can vote in his country: " + isjohnsAgeEnough );
  System.out.println("Mary can vote in her country: " + ismarysAgeEnough );
}
}
