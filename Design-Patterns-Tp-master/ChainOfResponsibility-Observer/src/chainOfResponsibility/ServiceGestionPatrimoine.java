package chainOfResponsibility;

import Observer.Budget;
import Observer.Demande;

public class ServiceGestionPatrimoine implements Service {

    protected Service service;

    @Override
    public void setNextHandler(Service service) {
        this.service = service;
    }

    @Override
    public void handleDemande(Demande demande, Budget budget) {
        budget.setBudget(budget.getBudget() - budget.getMontantBloque());
        budget.setMontantBloque(0);
        System.out.println("finished operation -> budget : " + budget.getBudget() + "DH, blocked amount : " + budget.getMontantBloque() + "DH");
    }
}
