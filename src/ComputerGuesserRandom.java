public class ComputerGuesserRandom implements IGuesser {
    private int min;
    private int max;

    public void yourTurn() {}

    public String getName()
    {
        return "Computer guesser";
    }

    public void newGame(int min, int max, String opponent, String type)
    {
        this.min = min;
        this.max = max;
    }

    public int makeGuess()
    {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public void guessFeedback(Answer answer)
    {
        switch(answer)
        {
            case TOO_LOW:
                min = (int) (((Math.random() * (max - min)) + min) + 1);
                break;
            case TOO_HIGH:
                max = (int) (((Math.random() * (max - min)) + min) - 1);
                break;
            case CORRECT:
                break;
            default:
                throw new RuntimeException("This should never happen!");
        }
    }

    public void endOfGame(int numberOfGuesses, String opponent)
    {}
}


