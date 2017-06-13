
package com.alig2x.ostmodern.mvp.model;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("objects")
    @Expose
    private List<Object> objects = new ArrayList<Object>();

    /**
     * 
     * @return
     *     The objects
     */
    public List<Object> getObjects() {
        return objects;
    }

    /**
     * 
     * @param objects
     *     The objects
     */
    public void setObjects(List<Object> objects) {
        this.objects = objects;
    }

}
