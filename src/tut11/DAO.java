package tut11;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public abstract class DAO<Entity extends Serializable> {
    protected List<Entity> dataList;

    // Constructor
    public DAO() {
        this.dataList = new ArrayList<>();
    }

    public void add(Entity entity) {
        dataList.add(entity);
    }

    public void remove(Entity entity) {
        dataList.remove(entity);
    }

    public abstract void update(Entity entity);

    public abstract Entity find(Serializable id);

    public List<Entity> getList() {
        return dataList;
    }
}
