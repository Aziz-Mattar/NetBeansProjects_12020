package State;

public class Initial implements accountState {

	public String doAction(Context context) {
            context.setAccountState(this);
            return "Initial State";
	}

        @Override
        public String toString() {
            return "Initial{" + '}';
        }

}