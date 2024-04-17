package bkendu2s8.u2s8.Adapter;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class UserData {
    private String nome_completo;
    private int eta;

    public void getData(DataSource ds) {
        this.nome_completo = ds.getNomeCompleto();
        this.eta = ds.getEta();
        System.out.println("il mio nome è: " + ds.getNomeCompleto() + " e ho " + ds.getEta() + " anni");
    }
}
