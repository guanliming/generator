package com.shadow.component;


import com.shadow.Creatable;
import com.shadow.common.Constant;
import com.shadow.main.RuntimeContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shadow
 * <p>
 * 2019-07-28
 */
public abstract class AbstractContainer implements Creatable {
    private List<AbstractContainer> creatableList;
    public static String baseDir = RuntimeContext.getInstance().CONTEXT.get(Constant.BASEDIR);
    public static String projectName = RuntimeContext.getInstance().CONTEXT.get(Constant.PROJECT_NAME);
    public Logger logger = LoggerFactory.getLogger(this.getClass());

    public AbstractContainer add(AbstractContainer ct) {
        if (creatableList == null || creatableList.size() == 0) {
            creatableList = new ArrayList<>();
        }
        creatableList.add(ct);
        return this;
    }

    public void createFile() throws Exception{

    }

    public boolean hasSub() {
        if (creatableList == null || creatableList.size() == 0) {
            return false;
        } else {
            return true;
        }
    }

    public List<AbstractContainer> getSubs() {
        return creatableList;
    }

}
