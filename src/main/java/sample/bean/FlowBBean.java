package sample.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.flow.FlowScoped;
import javax.inject.Named;

import com.liferay.faces.util.logging.Logger;
import com.liferay.faces.util.logging.LoggerFactory;

@Named
@FlowScoped("flowB")
public class FlowBBean implements Serializable {
    
    // serialVersionUID
    private static final long serialVersionUID = 1400852859531077077L;

    protected static final Logger logger = LoggerFactory.getLogger(FlowBBean.class);
    
    private String foo;
    
    @PostConstruct
    public void initialize() {
        logger.debug("FlowBBean initialized");
        this.foo = "bar";
    }

    @PreDestroy
    public void destroy() {
        logger.debug("FlowBBean destroyed");
    }

    public String getFoo() {
        return foo;
    }

    public void setFoo(String foo) {
        this.foo = foo;
    }
    
    

}
