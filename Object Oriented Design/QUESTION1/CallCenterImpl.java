import java.util.ArrayList;
public class CallCenterImpl implements CallCenter {
    private ProductManager pm;
    private TechnicalLead tl;
    private ArrayList<Fresher> freshers = new ArrayList<Fresher>();

    public void addNewFresher(Fresher fresher) {
        freshers.add(fresher);
    }

    public void defineAProductManager(ProductManager pm) {
        this.pm = pm;
    }

    public void defineATechnicalLead(TechnicalLead tl) {
        this.tl = tl;
    }
    public Employee getCallHandler() {

        for(int i=0;i<this.freshers.size();i++) {
            if(this.freshers.get(i).free) {
                if(this.freshers.get(i).canHandleCall) {
                    return this.freshers.get(i);
                } else if(this.tl.canHandleCall) {
                    return this.tl;
                } else {
                    return this.pm;
                }
            } 
        }
        return null;
        
    }
}