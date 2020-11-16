package com.shadow;

import com.shadow.component.AbstractContainer;

import java.util.List;

/**
 * @author shadow
 * <p>
 * 2019-07-28
 */
public class ArchetypeBuilder {
//    private Creatable creatable;

    public ArchetypeBuilder() {
    }

    public ArchetypeBuilder(AbstractContainer creatable) {
//        this.creatable = creatable;
    }


    public void build(AbstractContainer creatable) throws Exception {
        if (creatable != null) {
            creatable.createFolder();
            creatable.createPom();
            creatable.createFile();
            if (creatable.hasSub()) {
                List<AbstractContainer> containers = creatable.getSubs();
                for (AbstractContainer contain : containers) {
                    this.build(contain);
                }
            }
        }
    }


}
