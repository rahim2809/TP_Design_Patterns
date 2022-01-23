package chainOfResponsibility;

import observer.Budget;
import observer.Demande;

public interface Service {

     void setNextHandler(Service service);

     void handleDemande(Demande demande, Budget budget);
}