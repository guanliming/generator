package com.shadow.main;

import java.util.HashMap;
import java.util.Map;

/**
 * @author shadow
 * <p>
 * 2019-07-28
 */
public final class RuntimeContext {

    private static RuntimeContext rc = new RuntimeContext();
    public static Map<String, String> CONTEXT = new HashMap<>();
    private static Map<String, Object> object_context = new HashMap<>();

    private RuntimeContext() {
    }

    public static RuntimeContext getInstance() {
        return rc;
    }

    public static Map<String, Object> getObjMap() {
        for (String key : CONTEXT.keySet()) {
            object_context.put(key, CONTEXT.get(key));
        }
        return object_context;
    }


    public Map put(String key, String value) {
        CONTEXT.put(key, value);
        return CONTEXT;
    }
}
