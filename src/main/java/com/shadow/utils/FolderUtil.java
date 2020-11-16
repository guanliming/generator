package com.shadow.utils;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

/**
 * @author shadow
 * <p>
 * 2019-07-28
 */
public class FolderUtil {

    private static final String MAIN_JAVA_FOLDER = "src.main.java";
    private static final String MAIN_RESOURCE_FOLDER = "src.main.resources";
    private static final String TEST_JAVA_FOLDER = "src.test.java";
    private static final String TEST_RESOURCE_FOLDER = "src.test.resources";


    private static final Logger logger = LoggerFactory.getLogger(FolderUtil.class);

    public static void createPomPatten(String baseDir, String moduleName) throws Exception {
        if (StringUtils.isNotBlank(moduleName)) {
            boolean created = new File(baseDir + File.separator + moduleName).mkdirs();
            logger.debug("folder:{} created，{}", baseDir + File.separator + moduleName, created);
        } else {
            logger.debug("skip");
        }
    }


    public static void createJarPatten(String baseDir, String moduleName) throws Exception {
        boolean javaFolder = new File(PathUtil.getMainJavaFolderPath(baseDir, moduleName)).mkdirs();
        logger.debug("folder:{} created，{}", PathUtil.getMainJavaFolderPath(baseDir, moduleName), javaFolder);
        boolean resourceFolder = new File(PathUtil.getMainResourceFolderPath(baseDir, moduleName)).mkdirs();
        logger.debug("folder:{} created，{}", PathUtil.getMainResourceFolderPath(baseDir, moduleName), javaFolder);
        boolean javaTestFolder = new File(PathUtil.getTestJavaFolderPath(baseDir, moduleName)).mkdirs();
        logger.debug("folder:{} created，{}", PathUtil.getTestJavaFolderPath(baseDir, moduleName), javaFolder);
        boolean resourceTestFolder = new File(PathUtil.getTestResourceFolderPath(baseDir, moduleName)).mkdirs();
        logger.debug("folder:{} created，{}", PathUtil.getTestResourceFolderPath(baseDir, moduleName), javaFolder);
    }


}
