package com.shadow.main;


import com.shadow.common.Constant;
import com.shadow.factory.ArchetypeFacroty;
import com.shadow.utils.FreemarkerUtil;
import com.shadow.utils.NameUtil;

import java.util.HashMap;

/**
 * @author shadow
 * <p>
 * 2019-07-28
 */
public class HelloPlugin {

    public static void main(String[] args) throws Exception {
        String baseDir = "D:\\tmp";
        RuntimeContext.getInstance().put(Constant.BASEDIR, baseDir);
        RuntimeContext.getInstance().put(Constant.GROUP_ID, "com.shadow");
        RuntimeContext.getInstance().put(Constant.PROJECT_NAME, "test");
        RuntimeContext.getInstance().put(Constant.UPPROJECT_NAME, NameUtil.upcase(RuntimeContext.getInstance().CONTEXT.get(Constant.PROJECT_NAME)));
        RuntimeContext.getInstance().put(Constant.PROJECT_VERSION, "0.0.1-SNAPSHOT");
        ArchetypeFacroty.createComplexArchetype();
    }

    private static void createPom() {


    }

    private static void createFolders() {
        createRoot();
        createAdmin();
        createApplication();
        createController();
        createService();
        createBiz();
        createDao();
        createModel();


    }

    private static void createBiz() {
    }

    private static void createService() {

    }

    private static void createController() {
    }

    private static void createApplication() {

    }

    private static void createAdmin() {
    }

    private static void createDao() {
    }

    private static void createModel() {
        createDto();
        createEntity();
    }

    private static void createEntity() {
    }

    private static void createDto() {

    }

    private static void createRoot() {
    }


}



