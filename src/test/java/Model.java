import java.util.Objects;

public class Model {

    String str;
    Integer integ;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Model model = (Model) o;
        return Objects.equals(str, model.str) && Objects.equals(integ, model.integ);
    }

    @Override
    public int hashCode() {
        return Objects.hash(str, integ);
    }

    public Model(String str, Integer inter){
        this.str=str;
        this.integ=inter;
    }
    public Model getModel(){
        return new Model(str,integ);
    }

}
