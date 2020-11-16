package com.shadow.utils;

import com.shadow.common.Constant;
import com.shadow.main.RuntimeContext;

import java.io.File;

/**
 * @author shadow
 * <p>
 * 2019-07-28
 */
public class PathUtil {

    private static final String MAIN_JAVA_FOLDER = "src.main.java";
    private static final String MAIN_RESOURCE_FOLDER = "src.main.resources";
    private static final String TEST_JAVA_FOLDER = "src.test.java";
    private static final String TEST_RESOURCE_FOLDER = "src.test.resources";

    public static String getMainJavaFolderPath(String baseDir, String moduleName) {
        return PathUtil.getPath(baseDir, moduleName, MAIN_JAVA_FOLDER, false);
    }

    public static String getMainResourceFolderPath(String baseDir, String moduleName) {
        return PathUtil.getPath(baseDir, moduleName, MAIN_RESOURCE_FOLDER, true);
    }

    public static String getTestJavaFolderPath(String baseDir, String moduleName) {
        return PathUtil.getPath(baseDir, moduleName, TEST_JAVA_FOLDER, false);
    }

    public static String getTestResourceFolderPath(String baseDir, String moduleName) {
        return PathUtil.getPath(baseDir, moduleName, TEST_RESOURCE_FOLDER, true);
    }


    private static String getPath(String baseDir, String moduleName, String relativePath, boolean simple) {
        String[] folderArr = relativePath.split("\\.");
        StringBuilder sb = new StringBuilder(baseDir + File.separator + moduleName);
        for (String fold : folderArr) {
            sb.append(File.separator);
            sb.append(fold);
        }
        if (!simple) {
            String groupId = RuntimeContext.getInstance().CONTEXT.get(Constant.GROUP_ID);
            String[] groupIdArr = groupId.split("\\.");
            for (String id : groupIdArr) {
                sb.append(File.separator);
                sb.append(id);
            }
            String[] moduleNameArr = moduleName.split("-");
            for (String name : moduleNameArr) {
                sb.append(File.separator);
                sb.append(name);
            }
        }
        return sb.toString();
    }
}
