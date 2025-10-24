public class Array
{
    private int [] Array1;
    private int [] Array2;
    private Person[] persons;
    private Person anna;
    
    public Array()
    {
        Array1 = new int[] {1,2,3,4};
        Array2 = new int [10];
        persons = new Person[10];
    }
    public void annaInPersonAufnehmen()
    {
        Person Anna = new Person ("Anna", 60.0f, 165, 'w');
        this.anna = anna;
        persons[0] = anna;
    }

    public void Can() {
        Person tmp = persons[0];
        if (anna == tmp) {
            System.out.println("Anna und tmp sind gleich!");
            
        } else {
            System.out.println("Anna und tmp sind nicht gleich!");
        }
        
    }
}