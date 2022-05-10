import java.util.ArrayList;
import java.util.List;

public class Smartphone {

    private List <KontaktList> kontaktLists ;

    public Smartphone(){
        kontaktLists = new ArrayList<KontaktList>();
    }

    public boolean addKontakt(KontaktList kontaktList){
        for (KontaktList kontakt:kontaktLists) {
            if (kontaktList.getName().equals(kontakt.getName())){
                System.out.println("Es wird bereits vorhaben");
                return false;
            }
        }
        kontaktLists.add(kontaktList);
        return true;
    }

    public boolean findKontakt(String name){
        for (KontaktList kontaktList: kontaktLists){
            if (kontaktList.getName().equals(name)){
                System.out.println("Gefunden: "+name + " "+ kontaktList.getTelefonNummer());
                return true;
            }
        }
        System.out.println("nicht gefunden");
        return false;
    }

    public  void ausgabe(){
        for (KontaktList kontakt:kontaktLists
             ) {
            System.out.println(kontakt.getName()+":"+kontakt.getTelefonNummer());
        }
    }
}
