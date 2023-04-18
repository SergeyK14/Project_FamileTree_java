import java.util.ArrayList;
import java.util.List;



public class Human {
    private String name;
    private boolean gender;
    private String father;
    private String mother;
    private String children;
    private List<Human> childrens;
    private List<Human> parents;


    public void setName (String name){
        this.name = name;
    }
    public String getName (){
        return name;
    }
    public void setGender (Boolean gender){
        this.gender = gender;
    }
    public Boolean getGender (){
        return gender;
    }
    public void setChildren (String children, boolean gender){
        this.children = children;
        this.gender = gender;
    }
    public String getChildren (){
        return children;
    }
    public void setFather (String father){
        this.father = father;
    }
    public String getFather (){
        return father;
    }
    public void setMother (String mother){
        this.mother = mother;
    }
    public String getMother (){
        return mother;
    }


    public Human(String name, boolean gender, List<Human> parents, List<Human> childrens){
        this.name = name;
        this.gender = gender;
        this.parents = parents;
        this.childrens = childrens;
    }

    public Human(String name, boolean gender, String father, String mother, String children){
        this.name = name;
        this.gender = gender;
        this.father = father;
        this.mother = mother;
        this.children = children;
    }

    public Human(String name, boolean gender){
        this.name = name;
        this.gender = gender;
    }

    public Human(){
    }

    public void Parents(List<Human> parents){      
        parents = new ArrayList<>();
    }

    public void addParents (Human human){
        parents.add (human);
    }

    public void Childrens (List<Human> childrens){
        childrens = new ArrayList<>();
    }
    
    public void addChildrens (Human human){
        childrens.add (human);
    }
    
    public String MethodtoString(String name) {
        return name +" "+ gender + ", отец: "+ father + ", мать: "+ mother + ", родители: " + parents.toString() + ", дети: " + childrens.toString();
    }
}
