package com.likebamboo.osa.android.entity;

/**
 * {@link com.likebamboo.osa.android.ui.fragments.SimpleListDialog} Item项
 *
 * @author likebamboo
 * @version 2015-06-15
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class LDialogItem {

    private boolean selected = false;

    private String name = "";

    private String value = "";

    public LDialogItem() {
    }

    public LDialogItem(boolean selected, String name) {
        this.selected = selected;
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "LDialogItem [selected=" + selected + ", name=" + name + "]";
    }
}
