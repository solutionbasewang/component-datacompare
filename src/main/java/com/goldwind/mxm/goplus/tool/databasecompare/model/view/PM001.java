package com.goldwind.mxm.goplus.tool.databasecompare.model.view;

import com.goldwind.mxm.goplus.tool.databasecompare.model.SesToolDatabaseJobNode;
import com.goldwind.mxm.goplus.tool.databasecompare.model.SesToolDatabaseJobPrimarykey;

import java.util.List;

/**
 * Created by alex on 2018/3/21.
 */
public class PM001 {
    private SesToolDatabaseJobPrimarykey primarykey;
    private List<SesToolDatabaseJobNode> nodelist;

    public SesToolDatabaseJobPrimarykey getPrimarykey() {
        return primarykey;
    }

    public void setPrimarykey(SesToolDatabaseJobPrimarykey primarykey) {
        this.primarykey = primarykey;
    }

    public List<SesToolDatabaseJobNode> getNodelist() {
        return nodelist;
    }

    public void setNodelist(List<SesToolDatabaseJobNode> nodelist) {
        this.nodelist = nodelist;
    }
}
