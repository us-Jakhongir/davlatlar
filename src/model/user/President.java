package model.user;

public class President extends Person{


    private Integer activeYear;

    public President(Integer id, String firstName, String lastName, Integer age, Role role, Integer activeYear) {
        super(id, firstName, lastName, age, role);
        this.activeYear = activeYear;
    }

    public Integer getActiveYear() {
        return activeYear;
    }

    public void setActiveYear(Integer activeYear) {
        this.activeYear = activeYear;
    }

    @Override
    public String toString() {

        return super.toString() + ", faoliyat davri: " + activeYear + " y." + "\n" + "--------------------------------------------" + "\n";
    }
}
