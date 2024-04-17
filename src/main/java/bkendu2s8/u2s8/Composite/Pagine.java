package bkendu2s8.u2s8.Composite;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Pagine implements Functions{
    private String contenuto;

    @Override
    public int numeroPagine() {
        return 1;
    }
}
