public class Group implements Cloneable{
    public String group;
    public String subgroup;

    public Group(String group, String subgroup) {
        super();
        this.group = group;
        this.subgroup = subgroup;
    }

    public String getGroup() {
        return group;
    }

    public String getSubgroup() {
        return subgroup;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setSubgroup(String subgroup) {
        this.subgroup = subgroup;
    }

    public Object clone() {
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException e) {
            throw new InternalError();
        }
    }

    @Override
    public String toString(){
        return "Group " + group + subgroup;
    }
}
