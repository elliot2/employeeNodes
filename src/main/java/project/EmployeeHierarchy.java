package project;

import project.model.EmployeeNode;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class EmployeeHierarchy {

    private List<EmployeeNode> employeeNodes;

    /**
     * Initialise the employee data
     */
    EmployeeHierarchy() {
        employeeNodes =  Arrays.asList(
                new EmployeeNode(100,150,"Alan"),
                new EmployeeNode(220,100,"Martin"),
                new EmployeeNode(150,null,"Jamie"),
                new EmployeeNode(275, 100,"Alex"),
                new EmployeeNode(400,150,"Steve"),
                new EmployeeNode(190,400,"David"));
    }

    /**
     * Output children of a given node, this is called recursively to produce the console map.
     * @param nodeId NodeId parent node
     * @param level The level number, usually starting at 0
     */
    void outputChildren(Integer nodeId, Integer level) {
        for ( int i=0; i<level; i++ ) {
            System.out.print("    ");
        }
        Optional<EmployeeNode> employeeNode = employeeNodes.stream().filter(node -> node.getId().equals(nodeId)).findFirst();
        employeeNode.ifPresent(node -> System.out.println(node.getName()));

        employeeNodes.stream().filter(  node -> node.getParentID() != null ).
                filter( node -> node.getParentID().equals(nodeId)).forEach( node -> {
            outputChildren(node.getId(), level+1);
        });
    }

    /**
     * Exposes the employee list
     * @return List of EmployeeNodes
     */
    public List<EmployeeNode> getEmployeeNodes() {
        return employeeNodes;
    }


}
