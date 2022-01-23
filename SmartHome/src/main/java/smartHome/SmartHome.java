package smartHome;

import remote.RemoteControl;

public class SmartHome {

    private final String name;
    private final int number;
    private final Adresse adresse;
    private final RemoteControl remoteControl;

    public SmartHome(ConcretSmartHomeBuilder smartHomeBuilder) {
        this.adresse = smartHomeBuilder.adresse;
        this.name = smartHomeBuilder.name;
        this.remoteControl = smartHomeBuilder.remoteControl;
        this.number = smartHomeBuilder.number;
    }

    // All getter, and NO setter to provde immutability

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public RemoteControl getRemoteControl() {
        return remoteControl;
    }

    /**
     * @return le rapport de l'utilisation du RemoteController
     */
    public String report() {
        return remoteControl.getReport();
    }


    public static class ConcretSmartHomeBuilder {
        private final String name;
        private final int number; 
        private Adresse adresse;
        private RemoteControl remoteControl;

        public ConcretSmartHomeBuilder(String name, int number) {
            this.name = name;
            this.number = number;
        }

        public ConcretSmartHomeBuilder withAdresse(Adresse adresse) {
            this.adresse = adresse;
            return this;
        }

        public ConcretSmartHomeBuilder withRemoteControl(RemoteControl remoteControl) {
            this.remoteControl = remoteControl;
            return this;
        }

        public SmartHome build() {
            SmartHome smartHome = new SmartHome(this);
            return smartHome;
        }

    }


}
