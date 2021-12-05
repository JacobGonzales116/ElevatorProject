public class GoingDownState implements State{
    @Override
    public void printAction(int floorNumber, Context context, boolean doorIsOpen) {

        if(doorIsOpen == true) {
            System.out.println("Doors are closed");
        }
        System.out.println("Going down...");
        System.out.printf("*ding* The elevator arrives at Floor %d \n", floorNumber);
        System.out.println("Doors are open");
        context.setState(this);
    }
}
