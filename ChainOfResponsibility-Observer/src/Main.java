import chainOfResponsibility.Service;
import chainOfResponsibility.ServiceComptabilite;
import chainOfResponsibility.ServiceGestionPatrimoine;
import observer.Budget;
import obbserver.Demande;

public class Main {
    public static void main(String[] args) {
        Budget budget = new Budget();
        Service serviceComptabilite = new ServiceComptabilite();
        Service serviceGestionPatrimoine = new ServiceGestionPatrimoine();
        serviceComptabilite.setNextHandler(serviceGestionPatrimoine);

        Demande demande1 = new Demande();
        Demande demande2 = new Demande();


        budget.setBudget(10000);
        demande1.setMontantGlobale(1000);
        demande2.setMontantGlobale(3000);



        budget.addObserver(demande1);
        budget.addObserver(demande2);
        budget.notifyDemande();

        
        serviceComptabilite.handleDemande(demande1, budget);
        serviceComptabilite.handleDemande(demande2, budget);
        budget.notifyDemande();


    }


}
