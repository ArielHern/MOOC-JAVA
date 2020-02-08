
public class Reformatory {

    private int counter;

    public int weight(Person person) {
        // return the weight of the person
        this.counter++;
        return person.getWeight();
    }

    public void feed(Person person) {
        int currWe = person.getWeight();
        person.setWeight(currWe + 1);
    }

    public int totalWeightsMeasured() {
        return this.counter;

    }

}
