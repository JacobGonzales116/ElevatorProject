public class DoNothingState implements State {
    @Override
    public void printAction(int floorNumber, Context context, boolean doorIsClosed) {
        System.out.println("Doors are closed");
        System.out.println("Nothing Happens");
        context.setState(this);
    }
}
