package sample.bean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.flow.FlowScoped;
import javax.inject.Named;

import com.liferay.faces.util.logging.Logger;
import com.liferay.faces.util.logging.LoggerFactory;

@Named
@FlowScoped("flowA")
public class FlowABean implements Serializable {

    // serialVersionUID
    private static final long serialVersionUID = 1240852859531077077L;
    
    protected static final Logger logger = LoggerFactory.getLogger(FlowABean.class);
    
    private String foo;
    
    @PostConstruct
    public void initialize() {
        logger.debug("FlowABean initialized");
        this.foo = "bar";
    }

    @PreDestroy
    public void destroy() {
        logger.debug("FlowABean destroyed");
    }

    public String getFoo() {
        return foo;
    }

    public void setFoo(String foo) {
        this.foo = foo;
    }
    
    

}
