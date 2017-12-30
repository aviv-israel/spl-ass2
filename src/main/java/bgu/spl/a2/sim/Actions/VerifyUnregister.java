package bgu.spl.a2.sim.Actions;

import bgu.spl.a2.Action;
import bgu.spl.a2.sim.privateStates.StudentPrivateState;

public class VerifyUnregister extends Action<Boolean> {

    private String courseName;

    private final String actionName = "Verify Unrefister";

    public VerifyUnregister( String courseName){
        this.courseName = courseName;

        setActionName(actionName);
    }

    protected void start(){
        ((StudentPrivateState)privateState).getGrades().remove(courseName);
        complete(true);
    }

    @Override
    public String getId() {
        return null;
    }
}
