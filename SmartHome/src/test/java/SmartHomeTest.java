import device.Camera;
import device.Device;
import device.TV;
import home.Adresse;
import smartHome.*;
import smartHome.SmartHome.ConcretSmartHomeBuilder;
import remote.RemoteControl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SmartHomeTest {

    /*
    programmer une maison domotique SmartHome avec une télécommande qui peut être
    utilisée pour contrôler différentes appareils TV, Camera.
    La télécommande comprend des emplacements programmables.
    Chaque emplacement peut être attribué à un appareil domestique différent : TV, Camera
    Chaque emplacement a un bouton on/off correspondant.
    La télécommande a un bouton d'annulation global qui annule le dernier bouton pressé.
     */
    @Test
    public void report() {
        int nbrSlot = 2;
        Adresse adresse = new Adresse(27702, "ouarzazate");
        Device tv = new TV();
        Device camera = new Camera();
        RemoteControl remoteControl = new RemoteControl(nbrSlot);
        remoteControl.init(tv, camera);
        SmartHome smartHome = new ConcretSmartHomeBuilder("My home", 12345)
                .withAdresse(adresse)
                .withRemoteControl(remoteControl)
                .build();
        smartHome.getRemoteControl().onButtonPressed(0);
        smartHome.getRemoteControl().offButtonPressed(0);
        smartHome.getRemoteControl().onButtonPressed(1);
        smartHome.getRemoteControl().offButtonPressed(1);
        String expectedReport = "TV On-TV Off-Camera On-Camera Off-";
        assertEquals(expectedReport, smartHome.report());
    }
}