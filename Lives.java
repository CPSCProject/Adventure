public class Lives extends Main{

    int lives;

    // creates the initla number of lives
    void initLives(int initial)
    {
        lives = initial;
    }

    public boolean liveChecker()
    {
        if (lives == 0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    // returns the value of the amount of lives
    public int getValue()
    {
        return lives;
    }

    // increase number of the lives by 1
    public void increaseLives()
    {
        lives++;
    }

    // decrease number of the lives by 1
    public void decreaseLives()
    {
        lives--;
    }

    // return a string representing the amount of lives
    public String toString()
    {
        return " " + lives;
    }
}
