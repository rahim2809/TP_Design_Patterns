public class Incendie extends AssuranceDecorator {

    public Incendie(Assurance assurance){
        super(assurance);
    }

    @Override
    public int cost() {
        return super.cost()+1500;
    }
}
