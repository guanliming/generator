package com.shadow.component;

import com.shadow.common.Constant;
import com.shadow.main.RuntimeContext;
import com.shadow.utils.FolderUtil;
import com.shadow.utils.FreemarkerUtil;
import com.shadow.utils.PathUtil;

import java.io.File;

/**
 * @author shadow
 * <p>
 * 2019-07-28
 */
public class Root extends AbstractContainer {

    @Override
    public void createFolder() throws Exception {
        FolderUtil.createPomPatten(baseDir, projectName);
    }

    @Override
    public void createPom() throws Exception {
        FreemarkerUtil.generate("root.ftl",
                baseDir + File.separator + projectName + File.separator + "pom.xml", RuntimeContext.getObjMap());
    }


}
