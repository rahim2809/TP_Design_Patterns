abstract class AssuranceDecorator implements Assurance {
    protected Assurance assurance;
    public AssuranceDecorator(Assurance assurance){
        this.assurance = assurance;
    }
    public int cost(){
        return assurance.cost();
    }
}
