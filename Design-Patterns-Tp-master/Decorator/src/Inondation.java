public class Inondation extends AssuranceDecorator {

    public Inondation(Assurance assurance){
        super(assurance);
    }
    @Override
    public int cost() {
        return this.assurance.cost()+2000;
    }
}
