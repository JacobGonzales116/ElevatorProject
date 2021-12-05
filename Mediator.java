public class Mediator implements Elevator {
    private int currentFloor = 1;                     // start at the ground level
    Context context = new Context();
    boolean doorIsOpen = true;                       // doors start in open state
    GoingUpState goingUp = new GoingUpState();
    GoingDownState goingDown = new GoingDownState();
    DoNothingState doNothing = new DoNothingState();


    @Override
    public void press1() {
        System.out.println("1 pressed");

        if(currentFloor != 1){
            goingDown.printAction(1, context, doorIsOpen);
            doorIsOpen = true;
        }
        else {
            doNothing.printAction(1, context, doorIsOpen);
            doorIsOpen = false;
        }

        // update current floor level
        currentFloor = 1;
    }

    @Override
    public void press2() {
        System.out.println("2 pressed");

        if(currentFloor == 3 ){
            goingDown.printAction(2, context, doorIsOpen);
            doorIsOpen = true;
        }
        else if(currentFloor == 1 ){
            goingUp.printAction(2, context, doorIsOpen);
            doorIsOpen = true;
        }
        else {
            doNothing.printAction(2, context, doorIsOpen);
            doorIsOpen = false;
        }

        // update current floor level
        currentFloor = 2;
    }

    @Override
    public void press3(){
        System.out.println("3 pressed");

        if(currentFloor != 3 ){
            goingUp.printAction(3, context, doorIsOpen);
            doorIsOpen = true;
        }
        else {
            doNothing.printAction(3, context, doorIsOpen);
            doorIsOpen = false;
        }
        // update current floor level
        currentFloor = 3;
    }

}
