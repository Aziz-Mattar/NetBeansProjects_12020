package Composite;


import java.util.ArrayList;
import java.util.List;

public class account {

	private List<account> sub;
	private int id;
	private String type;

        public account(int id, String type) {
            this.id = id;
            this.type = type;
            this.sub = new ArrayList<>();
        }

	public void add(account a) {
            this.sub.add(a);
	}

	public void remove(account a) {
            this.sub.remove(a);
	}	

	public List<account> getAccount() {
            return sub;
	}

        @Override
        public String toString() {
            return "id=" + id + ", type=" + type ;
        }        
        
}