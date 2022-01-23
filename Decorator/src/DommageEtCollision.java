public class DommageEtCollision extends AssuranceDecorator {

    public DommageEtCollision(Assurance assurance){
        super(assurance);
    }
    @Override
    public int cost() {
        return super.cost()+2500;
    }
}
