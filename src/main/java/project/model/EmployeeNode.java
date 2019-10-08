package project.model;

public class EmployeeNode {

    private Integer id;
    private Integer parentID;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentID() {
        return parentID;
    }

    public void setParentID(Integer parentID) {
        this.parentID = parentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EmployeeNode(Integer id, Integer parentID, String name) {
        this.id = id;
        this.parentID = parentID;
        this.name = name;
    }
}
