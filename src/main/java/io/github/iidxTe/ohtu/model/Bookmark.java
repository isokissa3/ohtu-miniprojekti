
package io.github.iidxTe.ohtu.model;

public abstract class Bookmark {
    
    /**
     * Unique id of this bookmark.
     */
    private int id;

    private String title;
    
    private boolean isRead;

    public Bookmark(String title) {
        this.title = title;
        this.isRead = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public abstract String getType();
    
    public boolean isRead() {
        return isRead;
    }
    
    public void setIsRead(boolean read) {
        this.isRead = read;
    }

    @Override
    public String toString() {
        return title + " " + getType();
    }        

}
