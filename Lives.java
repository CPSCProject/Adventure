

public class Lives{

    int lives;

    // creates counter with value being zero
    public Lives numberOfLives()
    {
        lives = 0;
    }

    // construct a counter for lives with given initial value
    public Lives(int initial)
    {
        lives = initial;
    }

    // returns the value of the amount of lives
    public int getValue()
    {
        return lives;
    }

    // makes the counter 0 so getValue() == 0
    public void clear()
    {
        lives = 0;
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

    // return a string representing the amount of lvies
    public String toString()
    {
        return " " + lives;
    }
}
