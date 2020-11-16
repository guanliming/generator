package com.shadow.component;

import com.shadow.common.Constant;
import com.shadow.main.RuntimeContext;
import com.shadow.utils.FolderUtil;
import com.shadow.utils.FreemarkerUtil;
import com.shadow.utils.NameUtil;
import com.shadow.utils.PathUtil;

import java.io.File;

/**
 * @author shadow
 * <p>
 * 2019-07-28
 */
public class Application extends AbstractContainer {
    private static String curDir = baseDir + File.separator + projectName;
    private static String curModuleName = projectName + "-application";

    @Override
    public void createFolder() throws Exception {
        FolderUtil.createJarPatten(curDir, curModuleName);
    }

    public void createFile() throws Exception {
        FreemarkerUtil.generate("application.java.ftl",
                PathUtil.getMainJavaFolderPath(curDir, curModuleName) + File.separator + NameUtil.upcase(projectName + "Application.java"), RuntimeContext.getObjMap());
    }

    @Override
    public void createPom() throws Exception {
        FreemarkerUtil.generate("application.ftl", curDir + File.separator +
                curModuleName + File.separator + "pom.xml", RuntimeContext.getObjMap());
    }

}
