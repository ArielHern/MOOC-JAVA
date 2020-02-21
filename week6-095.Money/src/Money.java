
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public Money plus(Money added) {
        int euros = this.euros + added.euros;
        int cents = this.cents + added.cents;

        return new Money(euros, cents);
    }

    public Money minus(Money decremented) {
        int leuro = this.euros - decremented.euros;
        int lcents = 0;

        if (this.euros < decremented.euros) {
            return new Money(0, 0);
        }
        if (this.cents < decremented.cents) {
            leuro -= 1;
            lcents = 100 - decremented.cents;
        }

        return new Money(leuro, lcents);
    }

    public boolean less(Money compared) {
        if (this.euros > compared.euros) {
            return false;
        }
        if (this.euros >= compared.euros) {
            if (this.cents > compared.cents) {
                return false;
            }
        }

        return true;

    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
