package State;

public class Open implements accountState {

	public String doAction(Context context) {
            context.setAccountState(this);
            return "Open State";
	}

        @Override
        public String toString() {
            return "Open{" + '}';
        }
        
}