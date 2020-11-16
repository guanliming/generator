package com.shadow.utils;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.Version;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @author shadow
 * <p>
 * 2019-07-28
 */
public class FreemarkerUtil {

    private static final String TEMPLATE_PATH = "src/main/resources/templates";

    public static void generate(String templateName,String targetPath, Map<String,Object> properties) throws Exception {
        Configuration configuration = new Configuration(new Version("2.3.28"));
        configuration.setDirectoryForTemplateLoading(new File(TEMPLATE_PATH));
        Template template = configuration.getTemplate(templateName);
        File docFile = new File(targetPath);
        Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(docFile)));
        template.process(properties, out);
    }

}
