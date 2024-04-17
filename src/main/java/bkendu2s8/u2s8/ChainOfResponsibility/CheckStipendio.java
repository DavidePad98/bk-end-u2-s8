package bkendu2s8.u2s8.ChainOfResponsibility;

import lombok.Setter;

@Setter
public abstract class CheckStipendio {
    private CheckStipendio next;

    public abstract void check(Ufficiali u);

    public void nextCheck(Ufficiali u){
        if (this.next != null) this.next.check(u);
        else System.out.println("Fine catena");
    }
}
