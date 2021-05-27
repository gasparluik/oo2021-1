  
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

public class Maps {

  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>(); // list on indekseeritud
    HashSet <String> hashlist = new HashSet<String>(); // ei luba duplikaate, aga samas list ei ole indekseeritud
    HashMap<String, String> fullnames = new HashMap<String, String>(); //iga väärtusega on seotud kindel indeks, mille sa saad ise määrata

    hashlist.add("Eesti");
    hashlist.add("Soome");
    hashlist.add("Rootsi");
    System.out.println(hashlist);
    System.out.println("Kas hashlist sisaldab Eestit?: " + hashlist.contains("Eesti"));
    System.out.println("-----------------------------------");
    fullnames.put("Gaspar", "Luik");
    fullnames.put("Pippin", "Meriadoc");
    fullnames.put("Mees", "Kingpool");
    System.out.println(fullnames);
    System.out.println("-----------------------------------");
    list.add("Hello");
    list.add("world");
    list.add(String.valueOf(5));
    list.add(10 + "");

  for(String name : list) {
    System.out.println(name);
  }

  for(int i = 0; i < list.size(); i++) {
    System.out.println(list.get(i));
  }

  }
}