public class ComputerGuesserRandom implements IGuesser {
    private int min;
    private int max;
    private int randomGuess;

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
        randomGuess = (int) ((Math.random() * (max - min)) + min);
        return randomGuess;
    }

    public void guessFeedback(Answer answer)
    {
        switch(answer)
        {
            case TOO_LOW:
                min = randomGuess + 1;
                break;
            case TOO_HIGH:
                max = randomGuess - 1;
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


