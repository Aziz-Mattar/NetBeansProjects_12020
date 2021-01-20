package InterceptingFilter;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {
    private List<Filter> filters = new ArrayList<Filter>();
    private Target t;

    public void addFilter(Filter filter) {
       this.filters.add(filter);
    }

    public String execute(double req) {
        String output="";
                for(Filter filter: filters)
                    output+= filter.execute(req)+"\n";
                
                output+= t.execute(req)+"\n";
              return output;
    }

    public void setTarget(Target t) {
        this.t = t;
    }

}