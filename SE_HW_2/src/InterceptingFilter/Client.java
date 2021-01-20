package InterceptingFilter;

public class Client {
    private FilterManager fm;

    public Client(FilterManager fm) {
        this.fm = fm;
    }

    public void setFilterManager(FilterManager fm) {
        this.fm = fm;
    }

    public String sendRequest(double req) {
        return fm.filterRequset(req);
    }
}