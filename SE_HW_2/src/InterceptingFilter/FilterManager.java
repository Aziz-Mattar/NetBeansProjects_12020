package InterceptingFilter;

public class FilterManager {

    private FilterChain chain;

    FilterManager(Target t) {
        this.chain = new FilterChain();
        this.chain.setTarget(t);
    }

    public void setFilter(Filter f) {
        this.chain.addFilter(f);
    }

    public String filterRequset(double req) {
        return this.chain.execute(req);
    }

}