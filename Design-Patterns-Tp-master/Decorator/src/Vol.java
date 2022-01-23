public class Vol extends AssuranceDecorator {

    public Vol(Assurance assurance) {
        super(assurance);
    }

    @Override
    public int cost() {
        return this.assurance.cost() + 5000;
    }
}
