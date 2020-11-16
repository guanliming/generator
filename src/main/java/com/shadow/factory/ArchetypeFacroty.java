package com.shadow.factory;

import com.shadow.ArchetypeBuilder;
import com.shadow.component.*;

/**
 * @author shadow
 * <p>
 * 2019-07-28
 */
public class ArchetypeFacroty {

    public static void createComplexArchetype() throws Exception {
        Root root = new Root();
        root.add(new Application()).add(new Controller()).add(new Biz()).add(new Service()).add(new Dao()).add(new Api()).
                add(new Model().add(new Dto()).add(new Entity())).
                add(new Admin().add(new AdminApplication()).add(new AdminController()).add(new AdminBiz()));
        new ArchetypeBuilder().build(root);
    }

    public static void createSimpleArchetype() throws Exception {
//        Root root = new Root();
//        ArchetypeBuilder ab = new ArchetypeBuilder(root);
//        ab.build(root,null);
    }

}
