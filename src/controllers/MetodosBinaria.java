package controllers;

import model.Persona;
import view.ShowConsole;

public class MetodosBinaria {
    private Persona[] people;
    private ShowConsole showConsole;

    public MetodosBinaria(Persona[] people) {
        this.people = people;
        this.showConsole = new ShowConsole();
        showConsole.showMessage("Método de búsqueda binaria");
        burbujaconnombre(); 
        showbyname();       
        burbujaconcodigo(); 
        showPerson();     

       
    }

    private int personbycode(int code) {
        int bajo = 0;
        int alto = people.length - 1;
        while (bajo <= alto) {
            int mid = (bajo + alto) / 2;
            if (people[mid].getCode() == code) {
                return mid;
            } else if (people[mid].getCode() < code) {
                bajo = mid + 1;
            } else {
                alto = mid - 1;
            }
        }
        return -1;
    }

    public void showPerson() {
        int codetofind = showConsole.inputCode();
        int indexPerson = personbycode(codetofind);
        if (indexPerson == -1) {
            showConsole.showMessage("Persona con código: " + codetofind + " no encontrada");
        } else {
            showConsole.showMessage("Persona encontrada:");
            showConsole.showMessage(people[indexPerson].toString());
        }
    }

    public void burbujaconnombre() {
        for (int i = 0; i < people.length - 1; i++) {
            for (int j = 0; j < people.length - i - 1; j++) {
                if (people[j].getName().compareToIgnoreCase(people[j + 1].getName()) > 0) {
                    Persona temp = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = temp;
                }
            }
        }
    }

    public void burbujaconcodigo() {
        for (int i = 0; i < people.length - 1; i++) {
            for (int j = 0; j < people.length - i - 1; j++) {
                if (people[j].getCode() > people[j + 1].getCode()) {
                    Persona temp = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = temp;
                }
            }
        }
    }

    public String PersonByName(String name) {
        int bajo = 0;
        int alto = people.length - 1;
        while (bajo <= alto) {
            int mid = (bajo + alto) / 2;
            if (people[mid].getName().equalsIgnoreCase(name)) {
                return people[mid].toString();
            } else if (people[mid].getName().compareToIgnoreCase(name) < 0) {
                bajo = mid + 1;
            } else {
                alto = mid - 1;
            }
        }
        return null;
    }

    public void showbyname() {
        String name = showConsole.inputName();
        String person = PersonByName(name);
        if (person != null) {
            showConsole.showMessage("Persona con nombre: " + name + " encontrada");
            showConsole.showMessage(person);
        } else {
            showConsole.showMessage("Persona no encontrada");
        }
    }
}
