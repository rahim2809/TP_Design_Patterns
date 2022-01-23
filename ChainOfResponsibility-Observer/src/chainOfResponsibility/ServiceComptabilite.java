package chainOfResponsibility;

import observer.Budget;
import observer.Demande;

public class ServiceComptabilite implements Service {

    private Service service;

    @Override
    public void setNextHandler(Service service) {
        this.service = service;
    }

    @Override
    public void handleDemande(Demande demande, Budget budget) {
        if (demande.getMontantGlobale() <= budget.getBudget()) {
            System.out.println("Operation in progress");
            budget.setMontantBloque(demande.getMontantGlobale());
            System.out.println("Blocked Amount : " + budget.getMontantBloque());
            System.out.println("Finished processing");
            service.handleDemande(demande, budget);
        } else {
            System.out.println("Insufficient budget to carry out the operation!");
        }
    }
}
