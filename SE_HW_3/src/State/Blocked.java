package State;

public class Blocked implements accountState {

	public String doAction(Context context) {
            context.setAccountState(this);
            return "Blocked State";
	}

    @Override
    public String toString() {
        return "Blocked{" + '}';
    }
        

}