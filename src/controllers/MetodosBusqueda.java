package controllers;

import model.Persona;
import view.ShowConsole;

public class MetodosBusqueda {
    private ShowConsole showConsole;
    private Persona [] people;
    public MetodosBusqueda(Persona[] persons) {
        showConsole = new ShowConsole();
        this.people = persons;
        showPerson();
    }
    public int busquedaLineal(int[] arreglo, int valor) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valor) {
                return i;
            }
        }
        return -1;
    }
    public int findperson(int code) {
        for (int i = 0; i < people.length; i++) {
            if (people[i].getCode() == code) {
                return i;
            }
        }
        return -1;
    }
    public void showPerson(){
      int codetofind = showConsole.inputCode();
      int indexPerson = findperson(codetofind);
        if (indexPerson >= 0) {
            showConsole.showMessage("Persona con codigo : " + codetofind + " encontrada");
            showConsole.showMessage(people[indexPerson].toString());
        } else {
            showConsole.showMessage("Persona no encontrada");
        }
    }
}
