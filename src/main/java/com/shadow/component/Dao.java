package com.shadow.component;

import com.shadow.common.Constant;
import com.shadow.main.RuntimeContext;
import com.shadow.utils.FolderUtil;
import com.shadow.utils.FreemarkerUtil;

import java.io.File;

/**
 * @author shadow
 * <p>
 * 2019-07-28
 */
public class Dao extends AbstractContainer {
    private static String curDir = baseDir + File.separator + projectName;
    private static String curModuleName = projectName + "-dao";

    @Override
    public void createFolder() throws Exception {
        FolderUtil.createJarPatten(curDir, curModuleName);
    }

    @Override
    public void createPom() throws Exception {
        FreemarkerUtil.generate("dao.ftl",
                curDir + File.separator + curModuleName + File.separator + "pom.xml", RuntimeContext.getObjMap());
    }

}
